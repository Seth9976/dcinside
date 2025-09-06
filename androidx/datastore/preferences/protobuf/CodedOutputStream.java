package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {
    static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] g;
        final int h;
        int i;
        int j;

        AbstractBufferedEncoder(int v) {
            super(null);
            if(v < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] arr_b = new byte[Math.max(v, 20)];
            this.g = arr_b;
            this.h = arr_b.length;
        }

        final void A1(int v, int v1) {
            this.B1(v << 3 | v1);
        }

        final void B1(int v) {
            long v1 = (long)this.i;
            while((v & 0xFFFFFF80) != 0) {
                int v2 = this.i;
                this.i = v2 + 1;
                UnsafeUtil.d0(this.g, ((long)v2), ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.i;
            this.i = v3 + 1;
            UnsafeUtil.d0(this.g, ((long)v3), ((byte)v));
            this.j += (int)(((long)this.i) - v1);
        }

        final void C1(long v) {
            long v1 = (long)this.i;
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.i;
                this.i = v2 + 1;
                UnsafeUtil.d0(this.g, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.i;
            this.i = v3 + 1;
            UnsafeUtil.d0(this.g, ((long)v3), ((byte)(((int)v))));
            this.j += (int)(((long)this.i) - v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int E0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int s0() {
            return this.j;
        }

        final void w1(byte b) {
            int v = this.i;
            this.i = v + 1;
            this.g[v] = b;
            ++this.j;
        }

        final void x1(int v) {
            int v1 = this.i;
            this.i = v1 + 1;
            this.g[v1] = (byte)(v & 0xFF);
            this.i = v1 + 2;
            this.g[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.i = v1 + 3;
            this.g[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.i = v1 + 4;
            this.g[v1 + 3] = (byte)(v >> 24 & 0xFF);
            this.j += 4;
        }

        final void y1(long v) {
            int v1 = this.i;
            this.i = v1 + 1;
            this.g[v1] = (byte)(((int)(v & 0xFFL)));
            this.i = v1 + 2;
            this.g[v1 + 1] = (byte)(((int)(v >> 8 & 0xFFL)));
            this.i = v1 + 3;
            this.g[v1 + 2] = (byte)(((int)(v >> 16 & 0xFFL)));
            this.i = v1 + 4;
            this.g[v1 + 3] = (byte)(((int)(0xFFL & v >> 24)));
            this.i = v1 + 5;
            this.g[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.i = v1 + 6;
            this.g[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.i = v1 + 7;
            this.g[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.i = v1 + 8;
            this.g[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
            this.j += 8;
        }

        final void z1(int v) {
            if(v >= 0) {
                this.B1(v);
                return;
            }
            this.C1(((long)v));
        }
    }

    static class ArrayEncoder extends CodedOutputStream {
        private final byte[] g;
        private final int h;
        private final int i;
        private int j;

        ArrayEncoder(byte[] arr_b, int v, int v1) {
            super(null);
            if(arr_b == null) {
                throw new NullPointerException("buffer");
            }
            int v2 = v + v1;
            if((v | v1 | arr_b.length - v2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
            }
            this.g = arr_b;
            this.h = v;
            this.j = v;
            this.i = v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int E0() {
            return this.i - this.j;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H0(int v, byte[] arr_b) throws IOException {
            this.I0(v, arr_b, 0, arr_b.length);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I0(int v, byte[] arr_b, int v1, int v2) throws IOException {
            this.t1(v, 2);
            this.K0(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(byte[] arr_b, int v, int v1) throws IOException {
            this.u1(v1);
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L0(int v, ByteBuffer byteBuffer0) throws IOException {
            this.t1(v, 2);
            this.u1(byteBuffer0.capacity());
            this.g1(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M0(ByteString byteString0) throws IOException {
            this.u1(byteString0.size());
            byteString0.j0(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P0(int v) throws IOException {
            try {
                int v1 = this.j;
                this.j = v1 + 1;
                this.g[v1] = (byte)(v & 0xFF);
                this.j = v1 + 2;
                this.g[v1 + 1] = (byte)(v >> 8 & 0xFF);
                this.j = v1 + 3;
                this.g[v1 + 2] = (byte)(v >> 16 & 0xFF);
                this.j = v1 + 4;
                this.g[v1 + 3] = (byte)(v >> 24 & 0xFF);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q0(long v) throws IOException {
            try {
                int v1 = this.j;
                this.j = v1 + 1;
                this.g[v1] = (byte)(((int)v) & 0xFF);
                this.j = v1 + 2;
                this.g[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
                this.j = v1 + 3;
                this.g[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
                this.j = v1 + 4;
                this.g[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
                this.j = v1 + 5;
                this.g[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
                this.j = v1 + 6;
                this.g[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
                this.j = v1 + 7;
                this.g[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
                this.j = v1 + 8;
                this.g[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int v) throws IOException {
            if(v >= 0) {
                this.u1(v);
                return;
            }
            this.v1(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int v, MessageLite messageLite0) throws IOException {
            this.t1(v, 2);
            this.a1(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void Z0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
            this.t1(v, 2);
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a(int v, ByteString byteString0) throws IOException {
            this.t1(v, 2);
            this.M0(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a1(MessageLite messageLite0) throws IOException {
            this.u1(messageLite0.getSerializedSize());
            messageLite0.n(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void b1(MessageLite messageLite0, Schema schema0) throws IOException {
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c1(int v, MessageLite messageLite0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.Y0(3, messageLite0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(byte b) throws IOException {
            try {
                int v = this.j;
                this.j = v + 1;
                this.g[v] = b;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g1(ByteBuffer byteBuffer0) throws IOException {
            if(byteBuffer0.hasArray()) {
                this.i(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                return;
            }
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.clear();
            this.h(byteBuffer1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void h(ByteBuffer byteBuffer0) throws IOException {
            int v = byteBuffer0.remaining();
            try {
                byteBuffer0.get(this.g, this.j, v);
                this.j += v;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, v), indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(byte[] arr_b, int v, int v1) throws IOException {
            try {
                System.arraycopy(arr_b, v, this.g, this.j, v1);
                this.j += v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, v1), indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j(ByteBuffer byteBuffer0) throws IOException {
            this.h(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(byte[] arr_b, int v, int v1) throws IOException {
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l1(int v, ByteString byteString0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.a(3, byteString0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void r0() {
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int s0() {
            return this.j - this.h;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s1(String s) throws IOException {
            int v;
            try {
                v = this.j;
                int v1 = CodedOutputStream.m0(s.length());
                if(v1 == CodedOutputStream.m0(s.length() * 3)) {
                    int v2 = v + v1;
                    this.j = v2;
                    int v3 = Utf8.i(s, this.g, v2, this.E0());
                    this.j = v;
                    this.u1(v3 - v - v1);
                    this.j = v3;
                    return;
                }
                this.u1(Utf8.k(s));
                this.j = Utf8.i(s, this.g, this.j, this.E0());
                return;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(indexOutOfBoundsException0);
            }
            this.j = v;
            this.t0(s, utf8$UnpairedSurrogateException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t1(int v, int v1) throws IOException {
            this.u1(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u1(int v) throws IOException {
            if(this.E0() >= 5) {
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.j;
                    this.j = v1 + 1;
                    UnsafeUtil.d0(this.g, ((long)v1), ((byte)v));
                    return;
                }
                int v2 = this.j;
                this.j = v2 + 1;
                UnsafeUtil.d0(this.g, ((long)v2), ((byte)(v | 0x80)));
                if((v >>> 7 & 0xFFFFFF80) == 0) {
                    int v3 = this.j;
                    this.j = v3 + 1;
                    UnsafeUtil.d0(this.g, ((long)v3), ((byte)(v >>> 7)));
                    return;
                }
                int v4 = this.j;
                this.j = v4 + 1;
                UnsafeUtil.d0(this.g, ((long)v4), ((byte)(v >>> 7 | 0x80)));
                if((v >>> 14 & 0xFFFFFF80) == 0) {
                    int v5 = this.j;
                    this.j = v5 + 1;
                    UnsafeUtil.d0(this.g, ((long)v5), ((byte)(v >>> 14)));
                    return;
                }
                int v6 = this.j;
                this.j = v6 + 1;
                UnsafeUtil.d0(this.g, ((long)v6), ((byte)(v >>> 14 | 0x80)));
                if((v >>> 21 & 0xFFFFFF80) == 0) {
                    int v7 = this.j;
                    this.j = v7 + 1;
                    UnsafeUtil.d0(this.g, ((long)v7), ((byte)(v >>> 21)));
                    return;
                }
                int v8 = this.j;
                this.j = v8 + 1;
                UnsafeUtil.d0(this.g, ((long)v8), ((byte)(v >>> 21 | 0x80)));
                int v9 = this.j;
                this.j = v9 + 1;
                UnsafeUtil.d0(this.g, ((long)v9), ((byte)(v >>> 28)));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        int v10 = this.j;
                        this.j = v10 + 1;
                        this.g[v10] = (byte)v;
                        return;
                    }
                    int v11 = this.j;
                    this.j = v11 + 1;
                    this.g[v11] = (byte)(v & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, 1), indexOutOfBoundsException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v1(long v) throws IOException {
            if(this.E0() >= 10) {
                while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                    int v1 = this.j;
                    this.j = v1 + 1;
                    UnsafeUtil.d0(this.g, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                int v2 = this.j;
                this.j = v2 + 1;
                UnsafeUtil.d0(this.g, ((long)v2), ((byte)(((int)v))));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        int v3 = this.j;
                        this.j = v3 + 1;
                        this.g[v3] = (byte)(((int)v));
                        return;
                    }
                    int v4 = this.j;
                    this.j = v4 + 1;
                    this.g[v4] = (byte)(((int)v) & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.j, this.i, 1), indexOutOfBoundsException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int v, boolean z) throws IOException {
            this.t1(v, 0);
            this.g(((byte)z));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int v, int v1) throws IOException {
            this.t1(v, 5);
            this.P0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int v, long v1) throws IOException {
            this.t1(v, 1);
            this.Q0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.W0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int v, String s) throws IOException {
            this.t1(v, 2);
            this.s1(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.u1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int v, long v1) throws IOException {
            this.t1(v, 0);
            this.v1(v1);
        }
    }

    static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput k;

        ByteOutputEncoder(ByteOutput byteOutput0, int v) {
            super(v);
            if(byteOutput0 == null) {
                throw new NullPointerException("out");
            }
            this.k = byteOutput0;
        }

        private void D1() throws IOException {
            this.k.i(this.g, 0, this.i);
            this.i = 0;
        }

        private void E1(int v) throws IOException {
            if(this.h - this.i < v) {
                this.D1();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void H0(int v, byte[] arr_b) throws IOException {
            this.I0(v, arr_b, 0, arr_b.length);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(int v, byte[] arr_b, int v1, int v2) throws IOException {
            this.t1(v, 2);
            this.K0(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(byte[] arr_b, int v, int v1) throws IOException {
            this.u1(v1);
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int v, ByteBuffer byteBuffer0) throws IOException {
            this.t1(v, 2);
            this.u1(byteBuffer0.capacity());
            this.g1(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(ByteString byteString0) throws IOException {
            this.u1(byteString0.size());
            byteString0.j0(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int v) throws IOException {
            this.E1(4);
            this.x1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(long v) throws IOException {
            this.E1(8);
            this.y1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int v) throws IOException {
            if(v >= 0) {
                this.u1(v);
                return;
            }
            this.v1(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int v, MessageLite messageLite0) throws IOException {
            this.t1(v, 2);
            this.a1(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void Z0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
            this.t1(v, 2);
            this.b1(messageLite0, schema0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a(int v, ByteString byteString0) throws IOException {
            this.t1(v, 2);
            this.M0(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(MessageLite messageLite0) throws IOException {
            this.u1(messageLite0.getSerializedSize());
            messageLite0.n(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void b1(MessageLite messageLite0, Schema schema0) throws IOException {
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c1(int v, MessageLite messageLite0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.Y0(3, messageLite0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g(byte b) throws IOException {
            if(this.i == this.h) {
                this.D1();
            }
            this.w1(b);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g1(ByteBuffer byteBuffer0) throws IOException {
            if(byteBuffer0.hasArray()) {
                this.i(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                return;
            }
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.clear();
            this.h(byteBuffer1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(ByteBuffer byteBuffer0) throws IOException {
            this.r0();
            this.k.h(byteBuffer0);
            this.j += byteBuffer0.remaining();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(byte[] arr_b, int v, int v1) throws IOException {
            this.r0();
            this.k.i(arr_b, v, v1);
            this.j += v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j(ByteBuffer byteBuffer0) throws IOException {
            this.r0();
            this.k.j(byteBuffer0);
            this.j += byteBuffer0.remaining();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k(byte[] arr_b, int v, int v1) throws IOException {
            this.r0();
            this.k.k(arr_b, v, v1);
            this.j += v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l1(int v, ByteString byteString0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.a(3, byteString0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void r0() throws IOException {
            if(this.i > 0) {
                this.D1();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s1(String s) throws IOException {
            int v5;
            int v = s.length();
            int v1 = CodedOutputStream.m0(v * 3);
            int v2 = v1 + v * 3;
            int v3 = this.h;
            if(v2 > v3) {
                byte[] arr_b = new byte[v * 3];
                int v4 = Utf8.i(s, arr_b, 0, v * 3);
                this.u1(v4);
                this.k(arr_b, 0, v4);
                return;
            }
            if(v2 > v3 - this.i) {
                this.D1();
            }
            try {
                v5 = this.i;
                int v6 = CodedOutputStream.m0(s.length());
                if(v6 == v1) {
                    int v7 = v5 + v6;
                    this.i = v7;
                    int v8 = Utf8.i(s, this.g, v7, this.h - v7);
                    this.i = v5;
                    int v9 = v8 - v5 - v6;
                    this.B1(v9);
                    this.i = v8;
                    this.j += v9;
                    return;
                }
                int v10 = Utf8.k(s);
                this.B1(v10);
                this.i = Utf8.i(s, this.g, this.i, v10);
                this.j += v10;
                return;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(indexOutOfBoundsException0);
            }
            this.j -= this.i - v5;
            this.i = v5;
            this.t0(s, utf8$UnpairedSurrogateException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t1(int v, int v1) throws IOException {
            this.u1(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int v) throws IOException {
            this.E1(5);
            this.B1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(long v) throws IOException {
            this.E1(10);
            this.C1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int v, boolean z) throws IOException {
            this.E1(11);
            this.A1(v, 0);
            this.w1(((byte)z));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int v, int v1) throws IOException {
            this.E1(14);
            this.A1(v, 5);
            this.x1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int v, long v1) throws IOException {
            this.E1(18);
            this.A1(v, 1);
            this.y1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int v, int v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.z1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int v, String s) throws IOException {
            this.t1(v, 2);
            this.s1(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int v, int v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.B1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int v, long v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.C1(v1);
        }
    }

    static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer k;
        private int l;

        HeapNioEncoder(ByteBuffer byteBuffer0) {
            super(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            this.k = byteBuffer0;
            this.l = byteBuffer0.position();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream$ArrayEncoder
        public void r0() {
            this.k.position(this.l + this.s0());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final long a = 0x9F95917C52CE6E25L;
        private static final String b = "CodedOutputStream was writing to a flat byte array and ran out of space.";

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(String s) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s);
        }

        OutOfSpaceException(String s, Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, throwable0);
        }

        OutOfSpaceException(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream k;

        OutputStreamEncoder(OutputStream outputStream0, int v) {
            super(v);
            if(outputStream0 == null) {
                throw new NullPointerException("out");
            }
            this.k = outputStream0;
        }

        private void D1() throws IOException {
            this.k.write(this.g, 0, this.i);
            this.i = 0;
        }

        private void E1(int v) throws IOException {
            if(this.h - this.i < v) {
                this.D1();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void H0(int v, byte[] arr_b) throws IOException {
            this.I0(v, arr_b, 0, arr_b.length);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(int v, byte[] arr_b, int v1, int v2) throws IOException {
            this.t1(v, 2);
            this.K0(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(byte[] arr_b, int v, int v1) throws IOException {
            this.u1(v1);
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int v, ByteBuffer byteBuffer0) throws IOException {
            this.t1(v, 2);
            this.u1(byteBuffer0.capacity());
            this.g1(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(ByteString byteString0) throws IOException {
            this.u1(byteString0.size());
            byteString0.j0(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int v) throws IOException {
            this.E1(4);
            this.x1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(long v) throws IOException {
            this.E1(8);
            this.y1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int v) throws IOException {
            if(v >= 0) {
                this.u1(v);
                return;
            }
            this.v1(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int v, MessageLite messageLite0) throws IOException {
            this.t1(v, 2);
            this.a1(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void Z0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
            this.t1(v, 2);
            this.b1(messageLite0, schema0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a(int v, ByteString byteString0) throws IOException {
            this.t1(v, 2);
            this.M0(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(MessageLite messageLite0) throws IOException {
            this.u1(messageLite0.getSerializedSize());
            messageLite0.n(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void b1(MessageLite messageLite0, Schema schema0) throws IOException {
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c1(int v, MessageLite messageLite0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.Y0(3, messageLite0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g(byte b) throws IOException {
            if(this.i == this.h) {
                this.D1();
            }
            this.w1(b);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g1(ByteBuffer byteBuffer0) throws IOException {
            if(byteBuffer0.hasArray()) {
                this.i(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                return;
            }
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.clear();
            this.h(byteBuffer1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(ByteBuffer byteBuffer0) throws IOException {
            int v = byteBuffer0.remaining();
            int v1 = this.h;
            int v2 = this.i;
            if(v1 - v2 >= v) {
                byteBuffer0.get(this.g, v2, v);
                this.i += v;
                this.j += v;
                return;
            }
            int v3 = v1 - v2;
            byteBuffer0.get(this.g, v2, v3);
            int v4 = v - v3;
            this.i = this.h;
            this.j += v3;
            this.D1();
            while(true) {
                int v5 = this.h;
                if(v4 <= v5) {
                    break;
                }
                byteBuffer0.get(this.g, 0, v5);
                this.k.write(this.g, 0, this.h);
                v4 -= this.h;
                this.j += this.h;
            }
            byteBuffer0.get(this.g, 0, v4);
            this.i = v4;
            this.j += v4;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(byte[] arr_b, int v, int v1) throws IOException {
            int v2 = this.h;
            int v3 = this.i;
            if(v2 - v3 >= v1) {
                System.arraycopy(arr_b, v, this.g, v3, v1);
                this.i += v1;
                this.j += v1;
                return;
            }
            int v4 = v2 - v3;
            System.arraycopy(arr_b, v, this.g, v3, v4);
            int v5 = v + v4;
            int v6 = v1 - v4;
            this.i = this.h;
            this.j += v4;
            this.D1();
            if(v6 <= this.h) {
                System.arraycopy(arr_b, v5, this.g, 0, v6);
                this.i = v6;
            }
            else {
                this.k.write(arr_b, v5, v6);
            }
            this.j += v6;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j(ByteBuffer byteBuffer0) throws IOException {
            this.h(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k(byte[] arr_b, int v, int v1) throws IOException {
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l1(int v, ByteString byteString0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.a(3, byteString0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void r0() throws IOException {
            if(this.i > 0) {
                this.D1();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s1(String s) throws IOException {
            int v9;
            int v6;
            int v5;
            try {
                int v = s.length();
                int v1 = CodedOutputStream.m0(v * 3);
                int v2 = v1 + v * 3;
                int v3 = this.h;
                if(v2 > v3) {
                    byte[] arr_b = new byte[v * 3];
                    int v4 = Utf8.i(s, arr_b, 0, v * 3);
                    this.u1(v4);
                    this.k(arr_b, 0, v4);
                    return;
                }
                if(v2 > v3 - this.i) {
                    this.D1();
                }
                v5 = CodedOutputStream.m0(s.length());
                v6 = this.i;
                if(v5 == v1) {
                    goto label_15;
                }
                else {
                    goto label_23;
                }
                this.j += v9;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
                this.t0(s, utf8$UnpairedSurrogateException0);
            }
            return;
            try {
            label_15:
                int v7 = v6 + v5;
                this.i = v7;
                int v8 = Utf8.i(s, this.g, v7, this.h - v7);
                this.i = v6;
                v9 = v8 - v6 - v5;
                this.B1(v9);
                this.i = v8;
                this.j += v9;
                return;
            label_23:
                v9 = Utf8.k(s);
                this.B1(v9);
                this.i = Utf8.i(s, this.g, this.i, v9);
                this.j += v9;
                return;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException1) {
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                throw new OutOfSpaceException(arrayIndexOutOfBoundsException0);
            }
            try {
                this.j -= this.i - v6;
                this.i = v6;
                throw utf8$UnpairedSurrogateException1;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
            }
            this.t0(s, utf8$UnpairedSurrogateException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t1(int v, int v1) throws IOException {
            this.u1(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int v) throws IOException {
            this.E1(5);
            this.B1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(long v) throws IOException {
            this.E1(10);
            this.C1(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int v, boolean z) throws IOException {
            this.E1(11);
            this.A1(v, 0);
            this.w1(((byte)z));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int v, int v1) throws IOException {
            this.E1(14);
            this.A1(v, 5);
            this.x1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int v, long v1) throws IOException {
            this.E1(18);
            this.A1(v, 1);
            this.y1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int v, int v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.z1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int v, String s) throws IOException {
            this.t1(v, 2);
            this.s1(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int v, int v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.B1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int v, long v1) throws IOException {
            this.E1(20);
            this.A1(v, 0);
            this.C1(v1);
        }
    }

    static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer g;
        private final ByteBuffer h;
        private final int i;

        SafeDirectNioEncoder(ByteBuffer byteBuffer0) {
            super(null);
            this.g = byteBuffer0;
            this.h = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.i = byteBuffer0.position();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int E0() {
            return this.h.remaining();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void H0(int v, byte[] arr_b) throws IOException {
            this.I0(v, arr_b, 0, arr_b.length);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(int v, byte[] arr_b, int v1, int v2) throws IOException {
            this.t1(v, 2);
            this.K0(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(byte[] arr_b, int v, int v1) throws IOException {
            this.u1(v1);
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int v, ByteBuffer byteBuffer0) throws IOException {
            this.t1(v, 2);
            this.u1(byteBuffer0.capacity());
            this.g1(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(ByteString byteString0) throws IOException {
            this.u1(byteString0.size());
            byteString0.j0(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int v) throws IOException {
            try {
                this.h.putInt(v);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(long v) throws IOException {
            try {
                this.h.putLong(v);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int v) throws IOException {
            if(v >= 0) {
                this.u1(v);
                return;
            }
            this.v1(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int v, MessageLite messageLite0) throws IOException {
            this.t1(v, 2);
            this.a1(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void Z0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
            this.t1(v, 2);
            this.b1(messageLite0, schema0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a(int v, ByteString byteString0) throws IOException {
            this.t1(v, 2);
            this.M0(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(MessageLite messageLite0) throws IOException {
            this.u1(messageLite0.getSerializedSize());
            messageLite0.n(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void b1(MessageLite messageLite0, Schema schema0) throws IOException {
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c1(int v, MessageLite messageLite0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.Y0(3, messageLite0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g(byte b) throws IOException {
            try {
                this.h.put(b);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g1(ByteBuffer byteBuffer0) throws IOException {
            if(byteBuffer0.hasArray()) {
                this.i(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                return;
            }
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.clear();
            this.h(byteBuffer1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(ByteBuffer byteBuffer0) throws IOException {
            try {
                this.h.put(byteBuffer0);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(byte[] arr_b, int v, int v1) throws IOException {
            try {
                this.h.put(arr_b, v, v1);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(indexOutOfBoundsException0);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j(ByteBuffer byteBuffer0) throws IOException {
            this.h(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k(byte[] arr_b, int v, int v1) throws IOException {
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l1(int v, ByteString byteString0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.a(3, byteString0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void r0() {
            this.g.position(this.h.position());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int s0() {
            return this.h.position() - this.i;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s1(String s) throws IOException {
            int v = this.h.position();
            try {
                int v1 = CodedOutputStream.m0(s.length());
                if(v1 == CodedOutputStream.m0(s.length() * 3)) {
                    int v2 = this.h.position() + v1;
                    this.h.position(v2);
                    this.w1(s);
                    int v3 = this.h.position();
                    this.h.position(v);
                    this.u1(v3 - v2);
                    this.h.position(v3);
                    return;
                }
                this.u1(Utf8.k(s));
                this.w1(s);
                return;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new OutOfSpaceException(illegalArgumentException0);
            }
            this.h.position(v);
            this.t0(s, utf8$UnpairedSurrogateException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t1(int v, int v1) throws IOException {
            this.u1(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int v) throws IOException {
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        this.h.put(((byte)v));
                        return;
                    }
                    this.h.put(((byte)(v & 0x7F | 0x80)));
                    v >>>= 7;
                }
            }
            catch(BufferOverflowException bufferOverflowException0) {
            }
            throw new OutOfSpaceException(bufferOverflowException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(long v) throws IOException {
            try {
                while(true) {
                    if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
                        this.h.put(((byte)(((int)v))));
                        return;
                    }
                    this.h.put(((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
            }
            catch(BufferOverflowException bufferOverflowException0) {
            }
            throw new OutOfSpaceException(bufferOverflowException0);
        }

        private void w1(String s) throws IOException {
            try {
                Utf8.j(s, this.h);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(indexOutOfBoundsException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int v, boolean z) throws IOException {
            this.t1(v, 0);
            this.g(((byte)z));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int v, int v1) throws IOException {
            this.t1(v, 5);
            this.P0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int v, long v1) throws IOException {
            this.t1(v, 1);
            this.Q0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.W0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int v, String s) throws IOException {
            this.t1(v, 2);
            this.s1(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.u1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int v, long v1) throws IOException {
            this.t1(v, 0);
            this.v1(v1);
        }
    }

    static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer g;
        private final ByteBuffer h;
        private final long i;
        private final long j;
        private final long k;
        private final long l;
        private long m;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer0) {
            super(null);
            this.g = byteBuffer0;
            this.h = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long v = UnsafeUtil.i(byteBuffer0);
            this.i = v;
            long v1 = ((long)byteBuffer0.position()) + v;
            this.j = v1;
            long v2 = v + ((long)byteBuffer0.limit());
            this.k = v2;
            this.l = v2 - 10L;
            this.m = v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int E0() {
            return (int)(this.k - this.m);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void H0(int v, byte[] arr_b) throws IOException {
            this.I0(v, arr_b, 0, arr_b.length);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(int v, byte[] arr_b, int v1, int v2) throws IOException {
            this.t1(v, 2);
            this.K0(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(byte[] arr_b, int v, int v1) throws IOException {
            this.u1(v1);
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int v, ByteBuffer byteBuffer0) throws IOException {
            this.t1(v, 2);
            this.u1(byteBuffer0.capacity());
            this.g1(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(ByteString byteString0) throws IOException {
            this.u1(byteString0.size());
            byteString0.j0(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int v) throws IOException {
            this.h.putInt(this.w1(this.m), v);
            this.m += 4L;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(long v) throws IOException {
            this.h.putLong(this.w1(this.m), v);
            this.m += 8L;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int v) throws IOException {
            if(v >= 0) {
                this.u1(v);
                return;
            }
            this.v1(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int v, MessageLite messageLite0) throws IOException {
            this.t1(v, 2);
            this.a1(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void Z0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
            this.t1(v, 2);
            this.b1(messageLite0, schema0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a(int v, ByteString byteString0) throws IOException {
            this.t1(v, 2);
            this.M0(byteString0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(MessageLite messageLite0) throws IOException {
            this.u1(messageLite0.getSerializedSize());
            messageLite0.n(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        void b1(MessageLite messageLite0, Schema schema0) throws IOException {
            this.u1(((AbstractMessageLite)messageLite0).J(schema0));
            schema0.a(messageLite0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c1(int v, MessageLite messageLite0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.Y0(3, messageLite0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g(byte b) throws IOException {
            long v = this.m;
            if(v >= this.k) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.m, this.k, 1));
            }
            this.m = v + 1L;
            UnsafeUtil.b0(v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g1(ByteBuffer byteBuffer0) throws IOException {
            if(byteBuffer0.hasArray()) {
                this.i(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
                return;
            }
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.clear();
            this.h(byteBuffer1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void h(ByteBuffer byteBuffer0) throws IOException {
            try {
                this.y1(this.m);
                this.h.put(byteBuffer0);
                this.m += (long)byteBuffer0.remaining();
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new OutOfSpaceException(bufferOverflowException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i(byte[] arr_b, int v, int v1) throws IOException {
            if(arr_b != null && v >= 0 && v1 >= 0 && arr_b.length - v1 >= v) {
                long v2 = this.m;
                if(this.k - ((long)v1) >= v2) {
                    UnsafeUtil.o(arr_b, ((long)v), v2, ((long)v1));
                    this.m += (long)v1;
                    return;
                }
            }
            if(arr_b == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.m, this.k, v1));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j(ByteBuffer byteBuffer0) throws IOException {
            this.h(byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k(byte[] arr_b, int v, int v1) throws IOException {
            this.i(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l1(int v, ByteString byteString0) throws IOException {
            this.t1(1, 3);
            this.writeUInt32(2, v);
            this.a(3, byteString0);
            this.t1(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void r0() {
            this.g.position(this.w1(this.m));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int s0() {
            return (int)(this.m - this.j);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void s1(String s) throws IOException {
            long v;
            try {
                v = this.m;
                int v1 = CodedOutputStream.m0(s.length());
                if(v1 == CodedOutputStream.m0(s.length() * 3)) {
                    int v2 = this.w1(this.m) + v1;
                    this.h.position(v2);
                    Utf8.j(s, this.h);
                    int v3 = this.h.position() - v2;
                    this.u1(v3);
                    this.m += (long)v3;
                    return;
                }
                int v4 = Utf8.k(s);
                this.u1(v4);
                this.y1(this.m);
                Utf8.j(s, this.h);
                this.m += (long)v4;
                return;
            }
            catch(UnpairedSurrogateException utf8$UnpairedSurrogateException0) {
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new OutOfSpaceException(illegalArgumentException0);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new OutOfSpaceException(indexOutOfBoundsException0);
            }
            this.m = v;
            this.y1(v);
            this.t0(s, utf8$UnpairedSurrogateException0);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t1(int v, int v1) throws IOException {
            this.u1(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u1(int v) throws IOException {
            if(this.m <= this.l) {
                while((v & 0xFFFFFF80) != 0) {
                    long v1 = this.m;
                    this.m = v1 + 1L;
                    UnsafeUtil.b0(v1, ((byte)(v & 0x7F | 0x80)));
                    v >>>= 7;
                }
                long v2 = this.m;
                this.m = v2 + 1L;
                UnsafeUtil.b0(v2, ((byte)v));
                return;
            }
            long v3;
            while((v3 = this.m) < this.k) {
                if((v & 0xFFFFFF80) == 0) {
                    this.m = v3 + 1L;
                    UnsafeUtil.b0(v3, ((byte)v));
                    return;
                }
                this.m = v3 + 1L;
                UnsafeUtil.b0(v3, ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.m, this.k, 1));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v1(long v) throws IOException {
            if(this.m <= this.l) {
                while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                    long v1 = this.m;
                    this.m = v1 + 1L;
                    UnsafeUtil.b0(v1, ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                long v2 = this.m;
                this.m = v2 + 1L;
                UnsafeUtil.b0(v2, ((byte)(((int)v))));
                return;
            }
            long v3;
            while((v3 = this.m) < this.k) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    this.m = v3 + 1L;
                    UnsafeUtil.b0(v3, ((byte)(((int)v))));
                    return;
                }
                this.m = v3 + 1L;
                UnsafeUtil.b0(v3, ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", this.m, this.k, 1));
        }

        private int w1(long v) {
            return (int)(v - this.i);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int v, boolean z) throws IOException {
            this.t1(v, 0);
            this.g(((byte)z));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int v, int v1) throws IOException {
            this.t1(v, 5);
            this.P0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int v, long v1) throws IOException {
            this.t1(v, 1);
            this.Q0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.W0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int v, String s) throws IOException {
            this.t1(v, 2);
            this.s1(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int v, int v1) throws IOException {
            this.t1(v, 0);
            this.u1(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int v, long v1) throws IOException {
            this.t1(v, 0);
            this.v1(v1);
        }

        // 去混淆评级： 低(20)
        static boolean x1() [...] // 潜在的解密器

        private void y1(long v) {
            this.h.position(this.w1(v));
        }
    }

    CodedOutputStreamWriter a;
    private boolean b;
    private static final Logger c = null;
    private static final boolean d = false;
    @Deprecated
    public static final int e = 4;
    public static final int f = 0x1000;

    static {
        CodedOutputStream.c = Logger.getLogger("androidx.datastore.preferences.protobuf.CodedOutputStream");
        CodedOutputStream.d = true;
    }

    private CodedOutputStream() {
    }

    CodedOutputStream(androidx.datastore.preferences.protobuf.CodedOutputStream.1 codedOutputStream$10) {
    }

    public static int A(int v) [...] // Inlined contents

    public static CodedOutputStream A0(byte[] arr_b) {
        return CodedOutputStream.B0(arr_b, 0, arr_b.length);
    }

    public static int B(int v, long v1) {
        return CodedOutputStream.k0(v) + 8;
    }

    public static CodedOutputStream B0(byte[] arr_b, int v, int v1) {
        return new ArrayEncoder(arr_b, v, v1);
    }

    public static int C(long v) [...] // Inlined contents

    static CodedOutputStream C0(ByteBuffer byteBuffer0) {
        return new SafeDirectNioEncoder(byteBuffer0);
    }

    public static int D(int v, float f) {
        return CodedOutputStream.k0(v) + 4;
    }

    static CodedOutputStream D0(ByteBuffer byteBuffer0) {
        return new UnsafeDirectNioEncoder(byteBuffer0);
    }

    public static int E(float f) [...] // Inlined contents

    public abstract int E0();

    @Deprecated
    public static int F(int v, MessageLite messageLite0) {
        return CodedOutputStream.k0(v) * 2 + CodedOutputStream.H(messageLite0);
    }

    public void F0() {
        this.b = true;
    }

    @Deprecated
    static int G(int v, MessageLite messageLite0, Schema schema0) {
        return CodedOutputStream.k0(v) * 2 + CodedOutputStream.I(messageLite0, schema0);
    }

    public final void G0(boolean z) throws IOException {
        this.g(((byte)z));
    }

    @Deprecated
    public static int H(MessageLite messageLite0) {
        return messageLite0.getSerializedSize();
    }

    public abstract void H0(int arg1, byte[] arg2) throws IOException;

    @Deprecated
    static int I(MessageLite messageLite0, Schema schema0) {
        return ((AbstractMessageLite)messageLite0).J(schema0);
    }

    public abstract void I0(int arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    public static int J(int v, int v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.K(v1);
    }

    public final void J0(byte[] arr_b) throws IOException {
        this.K0(arr_b, 0, arr_b.length);
    }

    public static int K(int v) {
        return v < 0 ? 10 : CodedOutputStream.m0(v);
    }

    abstract void K0(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int L(int v, long v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.M(v1);
    }

    public abstract void L0(int arg1, ByteBuffer arg2) throws IOException;

    public static int M(long v) {
        return CodedOutputStream.o0(v);
    }

    public abstract void M0(ByteString arg1) throws IOException;

    // 去混淆评级： 低(20)
    public static int N(int v, LazyFieldLite lazyFieldLite0) {
        return CodedOutputStream.l0(2, v) + 2 + CodedOutputStream.O(3, lazyFieldLite0);
    }

    public final void N0(double f) throws IOException {
        this.Q0(Double.doubleToRawLongBits(f));
    }

    public static int O(int v, LazyFieldLite lazyFieldLite0) {
        return CodedOutputStream.k0(v) + CodedOutputStream.P(lazyFieldLite0);
    }

    public final void O0(int v) throws IOException {
        this.W0(v);
    }

    public static int P(LazyFieldLite lazyFieldLite0) {
        return CodedOutputStream.Q(lazyFieldLite0.f());
    }

    public abstract void P0(int arg1) throws IOException;

    static int Q(int v) {
        return CodedOutputStream.m0(v) + v;
    }

    public abstract void Q0(long arg1) throws IOException;

    // 去混淆评级： 低(20)
    public static int R(int v, MessageLite messageLite0) {
        return CodedOutputStream.l0(2, v) + 2 + CodedOutputStream.S(3, messageLite0);
    }

    public final void R0(float f) throws IOException {
        this.P0(Float.floatToRawIntBits(f));
    }

    public static int S(int v, MessageLite messageLite0) {
        return CodedOutputStream.k0(v) + CodedOutputStream.U(messageLite0);
    }

    @Deprecated
    public final void S0(int v, MessageLite messageLite0) throws IOException {
        this.t1(v, 3);
        this.U0(messageLite0);
        this.t1(v, 4);
    }

    static int T(int v, MessageLite messageLite0, Schema schema0) {
        return CodedOutputStream.k0(v) + CodedOutputStream.V(messageLite0, schema0);
    }

    @Deprecated
    final void T0(int v, MessageLite messageLite0, Schema schema0) throws IOException {
        this.t1(v, 3);
        this.V0(messageLite0, schema0);
        this.t1(v, 4);
    }

    public static int U(MessageLite messageLite0) {
        return CodedOutputStream.Q(messageLite0.getSerializedSize());
    }

    @Deprecated
    public final void U0(MessageLite messageLite0) throws IOException {
        messageLite0.n(this);
    }

    static int V(MessageLite messageLite0, Schema schema0) {
        return CodedOutputStream.Q(((AbstractMessageLite)messageLite0).J(schema0));
    }

    @Deprecated
    final void V0(MessageLite messageLite0, Schema schema0) throws IOException {
        schema0.a(messageLite0, this.a);
    }

    static int W(int v) {
        return v <= 0x1000 ? v : 0x1000;
    }

    public abstract void W0(int arg1) throws IOException;

    // 去混淆评级： 低(20)
    public static int X(int v, ByteString byteString0) {
        return CodedOutputStream.l0(2, v) + 2 + CodedOutputStream.t(3, byteString0);
    }

    public final void X0(long v) throws IOException {
        this.v1(v);
    }

    @Deprecated
    public static int Y(int v) {
        return CodedOutputStream.m0(v);
    }

    public abstract void Y0(int arg1, MessageLite arg2) throws IOException;

    @Deprecated
    public static int Z(long v) {
        return CodedOutputStream.o0(v);
    }

    abstract void Z0(int arg1, MessageLite arg2, Schema arg3) throws IOException;

    public abstract void a(int arg1, ByteString arg2) throws IOException;

    public static int a0(int v, int v1) {
        return CodedOutputStream.k0(v) + 4;
    }

    public abstract void a1(MessageLite arg1) throws IOException;

    public static int b0(int v) [...] // Inlined contents

    abstract void b1(MessageLite arg1, Schema arg2) throws IOException;

    public static int c0(int v, long v1) {
        return CodedOutputStream.k0(v) + 8;
    }

    public abstract void c1(int arg1, MessageLite arg2) throws IOException;

    public static int d0(long v) [...] // Inlined contents

    public final void d1(byte b) throws IOException {
        this.g(b);
    }

    public static int e0(int v, int v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.f0(v1);
    }

    public final void e1(int v) throws IOException {
        this.g(((byte)v));
    }

    public static int f0(int v) {
        return CodedOutputStream.m0(v >> 0x1F ^ v << 1);
    }

    public final void f1(ByteString byteString0) throws IOException {
        byteString0.j0(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void g(byte arg1) throws IOException;

    public static int g0(int v, long v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.h0(v1);
    }

    public abstract void g1(ByteBuffer arg1) throws IOException;

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void h(ByteBuffer arg1) throws IOException;

    public static int h0(long v) {
        return CodedOutputStream.o0(v >> 0x3F ^ v << 1);
    }

    public final void h1(byte[] arr_b) throws IOException {
        this.i(arr_b, 0, arr_b.length);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void i(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int i0(int v, String s) {
        return CodedOutputStream.k0(v) + CodedOutputStream.j0(s);
    }

    public final void i1(byte[] arr_b, int v, int v1) throws IOException {
        this.i(arr_b, v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void j(ByteBuffer arg1) throws IOException;

    public static int j0(String s) {
        try {
            return CodedOutputStream.Q(Utf8.k(s));
        }
        catch(UnpairedSurrogateException unused_ex) {
            return CodedOutputStream.Q(s.getBytes(Internal.a).length);
        }
    }

    @Deprecated
    public final void j1(int v) throws IOException {
        this.P0(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void k(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int k0(int v) [...] // 潜在的解密器

    @Deprecated
    public final void k1(long v) throws IOException {
        this.Q0(v);
    }

    static boolean l() [...] // 潜在的解密器

    public static int l0(int v, int v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.m0(v1);
    }

    public abstract void l1(int arg1, ByteString arg2) throws IOException;

    public final void m() {
        if(this.E0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int m0(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }

    @Deprecated
    public final void m1(int v) throws IOException {
        this.u1(v);
    }

    public static int n(int v, boolean z) {
        return CodedOutputStream.k0(v) + 1;
    }

    public static int n0(int v, long v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.o0(v1);
    }

    @Deprecated
    public final void n1(long v) throws IOException {
        this.v1(v);
    }

    public static int o(boolean z) [...] // Inlined contents

    public static int o0(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public final void o1(int v) throws IOException {
        this.P0(v);
    }

    public static int p(int v, byte[] arr_b) {
        return CodedOutputStream.k0(v) + CodedOutputStream.q(arr_b);
    }

    public static int p0(int v) [...] // Inlined contents

    public final void p1(long v) throws IOException {
        this.Q0(v);
    }

    public static int q(byte[] arr_b) {
        return CodedOutputStream.Q(arr_b.length);
    }

    public static long q0(long v) [...] // Inlined contents

    public final void q1(int v) throws IOException {
        this.u1(v >> 0x1F ^ v << 1);
    }

    public static int r(int v, ByteBuffer byteBuffer0) {
        return CodedOutputStream.k0(v) + CodedOutputStream.s(byteBuffer0);
    }

    public abstract void r0() throws IOException;

    public final void r1(long v) throws IOException {
        this.v1(v >> 0x3F ^ v << 1);
    }

    public static int s(ByteBuffer byteBuffer0) {
        return CodedOutputStream.Q(byteBuffer0.capacity());
    }

    public abstract int s0();

    public abstract void s1(String arg1) throws IOException;

    public static int t(int v, ByteString byteString0) {
        return CodedOutputStream.k0(v) + CodedOutputStream.u(byteString0);
    }

    final void t0(String s, UnpairedSurrogateException utf8$UnpairedSurrogateException0) throws IOException {
        CodedOutputStream.c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", utf8$UnpairedSurrogateException0);
        byte[] arr_b = s.getBytes(Internal.a);
        try {
            this.u1(arr_b.length);
            this.k(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(indexOutOfBoundsException0);
        }
    }

    public abstract void t1(int arg1, int arg2) throws IOException;

    public static int u(ByteString byteString0) {
        return CodedOutputStream.Q(byteString0.size());
    }

    boolean u0() {
        return this.b;
    }

    public abstract void u1(int arg1) throws IOException;

    public static int v(int v, double f) {
        return CodedOutputStream.k0(v) + 8;
    }

    static CodedOutputStream v0(ByteOutput byteOutput0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException("bufferSize must be positive");
        }
        return new ByteOutputEncoder(byteOutput0, v);
    }

    public abstract void v1(long arg1) throws IOException;

    public static int w(double f) [...] // Inlined contents

    public static CodedOutputStream w0(OutputStream outputStream0) {
        return CodedOutputStream.x0(outputStream0, 0x1000);
    }

    public abstract void writeBool(int arg1, boolean arg2) throws IOException;

    public final void writeDouble(int v, double f) throws IOException {
        this.writeFixed64(v, Double.doubleToRawLongBits(f));
    }

    public final void writeEnum(int v, int v1) throws IOException {
        this.writeInt32(v, v1);
    }

    public abstract void writeFixed32(int arg1, int arg2) throws IOException;

    public abstract void writeFixed64(int arg1, long arg2) throws IOException;

    public final void writeFloat(int v, float f) throws IOException {
        this.writeFixed32(v, Float.floatToRawIntBits(f));
    }

    public abstract void writeInt32(int arg1, int arg2) throws IOException;

    public final void writeInt64(int v, long v1) throws IOException {
        this.writeUInt64(v, v1);
    }

    public final void writeSFixed32(int v, int v1) throws IOException {
        this.writeFixed32(v, v1);
    }

    public final void writeSFixed64(int v, long v1) throws IOException {
        this.writeFixed64(v, v1);
    }

    public final void writeSInt32(int v, int v1) throws IOException {
        this.writeUInt32(v, v1 >> 0x1F ^ v1 << 1);
    }

    public final void writeSInt64(int v, long v1) throws IOException {
        this.writeUInt64(v, v1 >> 0x3F ^ v1 << 1);
    }

    public abstract void writeString(int arg1, String arg2) throws IOException;

    public abstract void writeUInt32(int arg1, int arg2) throws IOException;

    public abstract void writeUInt64(int arg1, long arg2) throws IOException;

    public static int x(int v, int v1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.y(v1);
    }

    public static CodedOutputStream x0(OutputStream outputStream0, int v) {
        return new OutputStreamEncoder(outputStream0, v);
    }

    public static int y(int v) {
        return CodedOutputStream.K(v);
    }

    public static CodedOutputStream y0(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            return new HeapNioEncoder(byteBuffer0);
        }
        if(!byteBuffer0.isDirect() || byteBuffer0.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return CodedOutputStream.D0(byteBuffer0);
    }

    public static int z(int v, int v1) {
        return CodedOutputStream.k0(v) + 4;
    }

    @Deprecated
    public static CodedOutputStream z0(ByteBuffer byteBuffer0, int v) {
        return CodedOutputStream.y0(byteBuffer0);
    }

    class androidx.datastore.preferences.protobuf.CodedOutputStream.1 {
    }

}

