package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {
    static final class ArrayDecoder extends CodedInputStream {
        private final byte[] i;
        private final boolean j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private boolean p;
        private int q;

        private ArrayDecoder(byte[] arr_b, int v, int v1, boolean z) {
            super(null);
            this.q = 0x7FFFFFFF;
            this.i = arr_b;
            this.k = v1 + v;
            this.m = v;
            this.n = v;
            this.j = z;
        }

        ArrayDecoder(byte[] arr_b, int v, int v1, boolean z, androidx.datastore.preferences.protobuf.CodedInputStream.1 codedInputStream$10) {
            this(arr_b, v, v1, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int A() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long B() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public float C() throws IOException {
            return Float.intBitsToFloat(this.L());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite D(int v, Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void E(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int F() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long G() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite H(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void I(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte J() throws IOException {
            int v = this.m;
            if(v == this.k) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 1;
            return this.i[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] K(int v) throws IOException {
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    int v2 = v + v1;
                    this.m = v2;
                    return Arrays.copyOfRange(this.i, v1, v2);
                }
            }
            if(v > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if(v != 0) {
                throw InvalidProtocolBufferException.g();
            }
            return Internal.d;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int L() throws IOException {
            int v = this.m;
            if(this.k - v < 4) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 4;
            return (this.i[v + 3] & 0xFF) << 24 | (this.i[v] & 0xFF | (this.i[v + 1] & 0xFF) << 8 | (this.i[v + 2] & 0xFF) << 16);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long M() throws IOException {
            int v = this.m;
            if(this.k - v < 8) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 8;
            return (((long)this.i[v + 7]) & 0xFFL) << 56 | (((long)this.i[v]) & 0xFFL | (((long)this.i[v + 1]) & 0xFFL) << 8 | (((long)this.i[v + 2]) & 0xFFL) << 16 | (((long)this.i[v + 3]) & 0xFFL) << 24 | (((long)this.i[v + 4]) & 0xFFL) << 0x20 | (((long)this.i[v + 5]) & 0xFFL) << 40 | (((long)this.i[v + 6]) & 0xFFL) << 0x30);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int N() throws IOException {
            int v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.i;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.m = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.m = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.m = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.m = v3;
                        return v11;
                    }
                }
            }
            return (int)this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long Q() throws IOException {
            long v12;
            long v9;
            long v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.i;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.m = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.m = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.m = v3;
                        return v13;
                    }
                }
            }
            return this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        long R() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.J();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int S() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long T() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int U() throws IOException {
            return CodedInputStream.b(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long V() throws IOException {
            return CodedInputStream.c(this.Q());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String W() throws IOException {
            int v = this.N();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = new String(this.i, v1, v, Internal.a);
                    this.m += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String X() throws IOException {
            int v = this.N();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = Utf8.h(this.i, v1, v);
                    this.m += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v > 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Y() throws IOException {
            if(this.i()) {
                this.o = 0;
                return 0;
            }
            int v = this.N();
            this.o = v;
            if(v >>> 3 == 0) {
                throw InvalidProtocolBufferException.c();
            }
            return this.o;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Z() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void a(int v) throws InvalidProtocolBufferException {
            if(this.o != v) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long a0() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void b0(int v, Builder messageLite$Builder0) throws IOException {
            this.E(v, messageLite$Builder0, ExtensionRegistryLite.d());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void c0() {
            this.n = this.m;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void e(boolean z) {
            this.p = z;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int f() {
            return this.q == 0x7FFFFFFF ? -1 : this.q - this.h();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int g() {
            return this.o;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean g0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.n0();
                    return true;
                }
                case 1: {
                    this.k0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.i0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                this.k0(4);
                                return true;
                            }
                        }
                    }
                    this.k0(this.N());
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int h() {
            return this.m - this.n;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean h0(int v, CodedOutputStream codedOutputStream0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.G();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.M();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                codedOutputStream0.m1(v);
                                this.j0(codedOutputStream0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                codedOutputStream0.m1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                int v1 = this.L();
                                codedOutputStream0.m1(v);
                                codedOutputStream0.P0(v1);
                                return true;
                            }
                        }
                    }
                    ByteString byteString0 = this.x();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.M0(byteString0);
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean i() throws IOException {
            return this.m == this.k;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void i0() throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.g0(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void j0(CodedOutputStream codedOutputStream0) throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.h0(v, codedOutputStream0));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void k0(int v) throws IOException {
            if(v >= 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    this.m = v1 + v;
                    return;
                }
            }
            throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
        }

        private void m0() {
            int v = this.k + this.l;
            this.k = v;
            int v1 = v - this.n;
            int v2 = this.q;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.l = v3;
                this.k = v - v3;
                return;
            }
            this.l = 0;
        }

        private void n0() throws IOException {
            if(this.k - this.m >= 10) {
                this.o0();
                return;
            }
            this.p0();
        }

        private void o0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.m;
                this.m = v1 + 1;
                if(this.i[v1] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void s(int v) {
            this.q = v;
            this.m0();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int t(int v) throws InvalidProtocolBufferException {
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = v + this.h();
            int v2 = this.q;
            if(v1 > v2) {
                throw InvalidProtocolBufferException.l();
            }
            this.q = v1;
            this.m0();
            return v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean u() throws IOException {
            return this.Q() != 0L;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] v() throws IOException {
            return this.K(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer w() throws IOException {
            int v = this.N();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    ByteBuffer byteBuffer0 = this.j || !this.p ? ByteBuffer.wrap(Arrays.copyOfRange(this.i, v1, v1 + v)) : ByteBuffer.wrap(this.i, v1, v).slice();
                    this.m += v;
                    return byteBuffer0;
                }
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return Internal.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString x() throws IOException {
            int v = this.N();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    ByteString byteString0 = !this.j || !this.p ? ByteString.q(this.i, v1, v) : ByteString.i0(this.i, v1, v);
                    this.m += v;
                    return byteString0;
                }
            }
            return v == 0 ? ByteString.e : ByteString.h0(this.K(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public double y() throws IOException {
            return Double.longBitsToDouble(this.M());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int z() throws IOException {
            return this.N();
        }
    }

    static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private Iterable i;
        private Iterator j;
        private ByteBuffer k;
        private boolean l;
        private boolean m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private long t;
        private long u;
        private long v;
        private long w;

        private IterableDirectByteBufferDecoder(Iterable iterable0, int v, boolean z) {
            super(null);
            this.p = 0x7FFFFFFF;
            this.n = v;
            this.i = iterable0;
            this.j = iterable0.iterator();
            this.l = z;
            this.r = 0;
            this.s = 0;
            if(v == 0) {
                this.k = Internal.e;
                this.t = 0L;
                this.u = 0L;
                this.w = 0L;
                this.v = 0L;
                return;
            }
            this.t0();
        }

        IterableDirectByteBufferDecoder(Iterable iterable0, int v, boolean z, androidx.datastore.preferences.protobuf.CodedInputStream.1 codedInputStream$10) {
            this(iterable0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int A() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long B() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public float C() throws IOException {
            return Float.intBitsToFloat(this.L());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite D(int v, Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void E(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int F() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long G() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite H(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void I(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte J() throws IOException {
            if(this.m0() == 0L) {
                this.n0();
            }
            long v = this.t;
            this.t = v + 1L;
            return UnsafeUtil.y(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] K(int v) throws IOException {
            if(v >= 0 && ((long)v) <= this.m0()) {
                byte[] arr_b = new byte[v];
                UnsafeUtil.n(this.t, arr_b, 0L, v);
                this.t += (long)v;
                return arr_b;
            }
            if(v >= 0 && v <= this.q0()) {
                byte[] arr_b1 = new byte[v];
                this.o0(arr_b1, 0, v);
                return arr_b1;
            }
            if(v > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if(v != 0) {
                throw InvalidProtocolBufferException.g();
            }
            return Internal.d;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int L() throws IOException {
            if(this.m0() >= 4L) {
                long v = this.t;
                this.t = v + 4L;
                int v1 = UnsafeUtil.y(v);
                int v2 = UnsafeUtil.y(v + 1L);
                int v3 = UnsafeUtil.y(v + 2L);
                return (UnsafeUtil.y(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
            }
            return this.J() & 0xFF | (this.J() & 0xFF) << 8 | (this.J() & 0xFF) << 16 | (this.J() & 0xFF) << 24;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long M() throws IOException {
            if(this.m0() >= 8L) {
                long v = this.t;
                this.t = v + 8L;
                long v1 = ((long)UnsafeUtil.y(v)) & 0xFFL | (((long)UnsafeUtil.y(v + 1L)) & 0xFFL) << 8;
                long v2 = (((long)UnsafeUtil.y(v + 2L)) & 0xFFL) << 16 | v1 | (((long)UnsafeUtil.y(v + 3L)) & 0xFFL) << 24 | (((long)UnsafeUtil.y(v + 4L)) & 0xFFL) << 0x20 | (((long)UnsafeUtil.y(v + 5L)) & 0xFFL) << 40 | (((long)UnsafeUtil.y(v + 6L)) & 0xFFL) << 0x30;
                return (((long)UnsafeUtil.y(v + 7L)) & 0xFFL) << 56 | v2;
            }
            return ((long)this.J()) & 0xFFL | (((long)this.J()) & 0xFFL) << 8 | (((long)this.J()) & 0xFFL) << 16 | (((long)this.J()) & 0xFFL) << 24 | (((long)this.J()) & 0xFFL) << 0x20 | (((long)this.J()) & 0xFFL) << 40 | (((long)this.J()) & 0xFFL) << 0x30 | (((long)this.J()) & 0xFFL) << 56;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int N() throws IOException {
            int v4;
            long v = this.t;
            if(this.w != v) {
                int v1 = UnsafeUtil.y(v);
                if(v1 >= 0) {
                    ++this.t;
                    return v1;
                }
                if(this.w - this.t >= 10L) {
                    long v2 = v + 2L;
                    int v3 = UnsafeUtil.y(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.t = v2;
                        return v4;
                    }
                    long v5 = v + 3L;
                    int v6 = UnsafeUtil.y(v2) << 14 ^ v3;
                    if(v6 >= 0) {
                        v4 = v6 ^ 0x3F80;
                        v2 = v5;
                        this.t = v2;
                        return v4;
                    }
                    long v7 = v + 4L;
                    int v8 = v6 ^ UnsafeUtil.y(v5) << 21;
                    if(v8 < 0) {
                        v4 = 0xFFE03F80 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    v5 = v + 5L;
                    int v9 = UnsafeUtil.y(v7);
                    int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                    if(v9 >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    v7 = v + 6L;
                    if(UnsafeUtil.y(v5) >= 0) {
                        v2 = v7;
                        this.t = v2;
                        return v10;
                    }
                    v5 = v + 7L;
                    if(UnsafeUtil.y(v7) >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    v7 = v + 8L;
                    if(UnsafeUtil.y(v5) >= 0) {
                        v2 = v7;
                        this.t = v2;
                        return v10;
                    }
                    v5 = v + 9L;
                    if(UnsafeUtil.y(v7) >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    else if(UnsafeUtil.y(v5) >= 0) {
                        v2 = v + 10L;
                        this.t = v2;
                        return v10;
                    }
                }
            }
            return (int)this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long Q() throws IOException {
            long v12;
            long v9;
            long v4;
            long v = this.t;
            if(this.w != v) {
                int v1 = UnsafeUtil.y(v);
                if(v1 >= 0) {
                    ++this.t;
                    return (long)v1;
                }
                if(this.w - this.t >= 10L) {
                    long v2 = v + 2L;
                    int v3 = UnsafeUtil.y(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = (long)(v3 ^ 0xFFFFFF80);
                        this.t = v2;
                        return v4;
                    }
                    int v5 = UnsafeUtil.y(v2) << 14 ^ v3;
                    if(v5 >= 0) {
                        v4 = (long)(v5 ^ 0x3F80);
                        v2 = v + 3L;
                        this.t = v2;
                        return v4;
                    }
                    int v6 = v5 ^ UnsafeUtil.y(v + 3L) << 21;
                    if(v6 < 0) {
                        v4 = (long)(0xFFE03F80 ^ v6);
                        v2 = v + 4L;
                        this.t = v2;
                        return v4;
                    }
                    long v7 = v + 5L;
                    long v8 = ((long)UnsafeUtil.y(v + 4L)) << 28 ^ ((long)v6);
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v4 = v9 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    long v10 = v + 6L;
                    long v11 = v8 ^ ((long)UnsafeUtil.y(v7)) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v4 = v12 ^ v11;
                        v2 = v10;
                        this.t = v2;
                        return v4;
                    }
                    v7 = v + 7L;
                    v8 = v11 ^ ((long)UnsafeUtil.y(v10)) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v4 = v9 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    v10 = v + 8L;
                    v11 = v8 ^ ((long)UnsafeUtil.y(v7)) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v4 = v12 ^ v11;
                        v2 = v10;
                        this.t = v2;
                        return v4;
                    }
                    v7 = v + 9L;
                    long v13 = v11 ^ ((long)UnsafeUtil.y(v10)) << 56 ^ 0xFE03F80FE03F80L;
                    if(v13 >= 0L) {
                        v2 = v7;
                        this.t = v2;
                        return v13;
                    }
                    else if(((long)UnsafeUtil.y(v7)) >= 0L) {
                        v2 = v + 10L;
                        this.t = v2;
                        return v13;
                    }
                }
            }
            return this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        long R() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.J();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int S() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long T() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int U() throws IOException {
            return CodedInputStream.b(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long V() throws IOException {
            return CodedInputStream.c(this.Q());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String W() throws IOException {
            int v = this.N();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    byte[] arr_b = new byte[v];
                    UnsafeUtil.n(v1, arr_b, 0L, v);
                    this.t += (long)v;
                    return new String(arr_b, Internal.a);
                }
            }
            if(v > 0 && v <= this.q0()) {
                byte[] arr_b1 = new byte[v];
                this.o0(arr_b1, 0, v);
                return new String(arr_b1, Internal.a);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String X() throws IOException {
            int v = this.N();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    String s = Utf8.g(this.k, ((int)(v1 - this.u)), v);
                    this.t += (long)v;
                    return s;
                }
            }
            if(v >= 0 && v <= this.q0()) {
                byte[] arr_b = new byte[v];
                this.o0(arr_b, 0, v);
                return Utf8.h(arr_b, 0, v);
            }
            if(v != 0) {
                throw v > 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Y() throws IOException {
            if(this.i()) {
                this.q = 0;
                return 0;
            }
            int v = this.N();
            this.q = v;
            if(v >>> 3 == 0) {
                throw InvalidProtocolBufferException.c();
            }
            return this.q;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Z() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void a(int v) throws InvalidProtocolBufferException {
            if(this.q != v) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long a0() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void b0(int v, Builder messageLite$Builder0) throws IOException {
            this.E(v, messageLite$Builder0, ExtensionRegistryLite.d());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void c0() {
            this.s = (int)(((long)this.r) + this.t - this.u);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void e(boolean z) {
            this.m = z;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int f() {
            return this.p == 0x7FFFFFFF ? -1 : this.p - this.h();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int g() {
            return this.q;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean g0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.r0();
                    return true;
                }
                case 1: {
                    this.k0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.i0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                this.k0(4);
                                return true;
                            }
                        }
                    }
                    this.k0(this.N());
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int h() {
            return (int)(((long)(this.r - this.s)) + this.t - this.u);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean h0(int v, CodedOutputStream codedOutputStream0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.G();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.M();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                codedOutputStream0.m1(v);
                                this.j0(codedOutputStream0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                codedOutputStream0.m1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                int v1 = this.L();
                                codedOutputStream0.m1(v);
                                codedOutputStream0.P0(v1);
                                return true;
                            }
                        }
                    }
                    ByteString byteString0 = this.x();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.M0(byteString0);
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean i() throws IOException {
            return ((long)this.r) + this.t - this.u == ((long)this.n);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void i0() throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.g0(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void j0(CodedOutputStream codedOutputStream0) throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.h0(v, codedOutputStream0));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void k0(int v) throws IOException {
            if(v < 0 || ((long)v) > ((long)(this.n - this.r)) - this.t + this.u) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            while(v > 0) {
                if(this.m0() == 0L) {
                    this.n0();
                }
                int v1 = Math.min(v, ((int)this.m0()));
                v -= v1;
                this.t += (long)v1;
            }
        }

        private long m0() {
            return this.w - this.t;
        }

        private void n0() throws InvalidProtocolBufferException {
            if(!this.j.hasNext()) {
                throw InvalidProtocolBufferException.l();
            }
            this.t0();
        }

        private void o0(byte[] arr_b, int v, int v1) throws IOException {
            if(v1 >= 0 && v1 <= this.q0()) {
                int v2 = v1;
                while(v2 > 0) {
                    if(this.m0() == 0L) {
                        this.n0();
                    }
                    int v3 = Math.min(v2, ((int)this.m0()));
                    UnsafeUtil.n(this.t, arr_b, v1 - v2 + v, v3);
                    v2 -= v3;
                    this.t += (long)v3;
                }
                return;
            }
            if(v1 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if(v1 != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private void p0() {
            int v = this.n + this.o;
            this.n = v;
            int v1 = v - this.s;
            int v2 = this.p;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.o = v3;
                this.n = v - v3;
                return;
            }
            this.o = 0;
        }

        private int q0() {
            return (int)(((long)(this.n - this.r)) - this.t + this.u);
        }

        private void r0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void s(int v) {
            this.p = v;
            this.p0();
        }

        private ByteBuffer s0(int v, int v1) throws IOException {
            int v2 = this.k.position();
            int v3 = this.k.limit();
            try {
                this.k.position(v);
                this.k.limit(v1);
                return this.k.slice();
            }
            catch(IllegalArgumentException unused_ex) {
                throw InvalidProtocolBufferException.l();
            }
            finally {
                this.k.position(v2);
                this.k.limit(v3);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int t(int v) throws InvalidProtocolBufferException {
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = v + this.h();
            int v2 = this.p;
            if(v1 > v2) {
                throw InvalidProtocolBufferException.l();
            }
            this.p = v1;
            this.p0();
            return v2;
        }

        private void t0() {
            Object object0 = this.j.next();
            this.k = (ByteBuffer)object0;
            this.r += (int)(this.t - this.u);
            long v = (long)((ByteBuffer)object0).position();
            this.t = v;
            this.u = v;
            this.w = (long)this.k.limit();
            long v1 = UnsafeUtil.i(this.k);
            this.v = v1;
            this.t += v1;
            this.u += v1;
            this.w += v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean u() throws IOException {
            return this.Q() != 0L;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] v() throws IOException {
            return this.K(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer w() throws IOException {
            int v = this.N();
            if(v > 0 && ((long)v) <= this.m0()) {
                if(!this.l && this.m) {
                    long v1 = this.t + ((long)v);
                    this.t = v1;
                    return this.s0(((int)(v1 - this.v - ((long)v))), ((int)(v1 - this.v)));
                }
                byte[] arr_b = new byte[v];
                UnsafeUtil.n(this.t, arr_b, 0L, v);
                this.t += (long)v;
                return ByteBuffer.wrap(arr_b);
            }
            if(v > 0 && v <= this.q0()) {
                byte[] arr_b1 = new byte[v];
                this.o0(arr_b1, 0, v);
                return ByteBuffer.wrap(arr_b1);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return Internal.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString x() throws IOException {
            int v = this.N();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    if(this.l && this.m) {
                        int v2 = (int)(v1 - this.v);
                        ByteString byteString0 = ByteString.g0(this.s0(v2, v + v2));
                        this.t += (long)v;
                        return byteString0;
                    }
                    byte[] arr_b = new byte[v];
                    UnsafeUtil.n(v1, arr_b, 0L, v);
                    this.t += (long)v;
                    return ByteString.h0(arr_b);
                }
            }
            if(v > 0 && v <= this.q0()) {
                byte[] arr_b1 = new byte[v];
                this.o0(arr_b1, 0, v);
                return ByteString.h0(arr_b1);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return ByteString.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public double y() throws IOException {
            return Double.longBitsToDouble(this.M());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int z() throws IOException {
            return this.N();
        }
    }

    static final class StreamDecoder extends CodedInputStream {
        interface RefillCallback {
            void onRefill();
        }

        class SkippedDataSink implements RefillCallback {
            private int a;
            private ByteArrayOutputStream b;
            final StreamDecoder c;

            private SkippedDataSink() {
                this.a = codedInputStream$StreamDecoder0.m;
            }

            ByteBuffer a() {
                ByteArrayOutputStream byteArrayOutputStream0 = this.b;
                if(byteArrayOutputStream0 == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.j, this.a, StreamDecoder.this.m - this.a);
                }
                byteArrayOutputStream0.write(StreamDecoder.this.j, this.a, StreamDecoder.this.m);
                return ByteBuffer.wrap(this.b.toByteArray());
            }

            @Override  // androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder$RefillCallback
            public void onRefill() {
                if(this.b == null) {
                    this.b = new ByteArrayOutputStream();
                }
                this.b.write(StreamDecoder.this.j, this.a, StreamDecoder.this.m - this.a);
                this.a = 0;
            }
        }

        private final InputStream i;
        private final byte[] j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private RefillCallback q;

        private StreamDecoder(InputStream inputStream0, int v) {
            super(null);
            this.p = 0x7FFFFFFF;
            this.q = null;
            Internal.e(inputStream0, "input");
            this.i = inputStream0;
            this.j = new byte[v];
            this.k = 0;
            this.m = 0;
            this.o = 0;
        }

        StreamDecoder(InputStream inputStream0, int v, androidx.datastore.preferences.protobuf.CodedInputStream.1 codedInputStream$10) {
            this(inputStream0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int A() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long B() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public float C() throws IOException {
            return Float.intBitsToFloat(this.L());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite D(int v, Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void E(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int F() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long G() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite H(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void I(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte J() throws IOException {
            if(this.m == this.k) {
                this.t0(1);
            }
            int v = this.m;
            this.m = v + 1;
            return this.j[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] K(int v) throws IOException {
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                int v2 = v + v1;
                this.m = v2;
                return Arrays.copyOfRange(this.j, v1, v2);
            }
            return this.p0(v, false);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int L() throws IOException {
            int v = this.m;
            if(this.k - v < 4) {
                this.t0(4);
                v = this.m;
            }
            this.m = v + 4;
            return (this.j[v + 3] & 0xFF) << 24 | (this.j[v] & 0xFF | (this.j[v + 1] & 0xFF) << 8 | (this.j[v + 2] & 0xFF) << 16);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long M() throws IOException {
            int v = this.m;
            if(this.k - v < 8) {
                this.t0(8);
                v = this.m;
            }
            this.m = v + 8;
            return (((long)this.j[v + 7]) & 0xFFL) << 56 | (((long)this.j[v]) & 0xFFL | (((long)this.j[v + 1]) & 0xFFL) << 8 | (((long)this.j[v + 2]) & 0xFFL) << 16 | (((long)this.j[v + 3]) & 0xFFL) << 24 | (((long)this.j[v + 4]) & 0xFFL) << 0x20 | (((long)this.j[v + 5]) & 0xFFL) << 40 | (((long)this.j[v + 6]) & 0xFFL) << 0x30);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int N() throws IOException {
            int v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.j;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.m = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.m = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.m = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.m = v3;
                        return v11;
                    }
                }
            }
            return (int)this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long Q() throws IOException {
            long v12;
            long v9;
            long v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.j;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.m = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.m = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.m = v3;
                        return v13;
                    }
                }
            }
            return this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        long R() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.J();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int S() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long T() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int U() throws IOException {
            return CodedInputStream.b(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long V() throws IOException {
            return CodedInputStream.c(this.Q());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String W() throws IOException {
            int v = this.N();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = new String(this.j, v1, v, Internal.a);
                    this.m += v;
                    return s;
                }
            }
            if(v == 0) {
                return "";
            }
            if(v <= this.k) {
                this.t0(v);
                String s1 = new String(this.j, this.m, v, Internal.a);
                this.m += v;
                return s1;
            }
            return new String(this.p0(v, false), Internal.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String X() throws IOException {
            int v = this.N();
            int v1 = this.m;
            int v2 = this.k;
            if(v <= v2 - v1 && v > 0) {
                this.m = v1 + v;
                return Utf8.h(this.j, v1, v);
            }
            if(v == 0) {
                return "";
            }
            if(v <= v2) {
                this.t0(v);
                this.m = v;
                return Utf8.h(this.j, v1, v);
            }
            return Utf8.h(this.p0(v, false), v1, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Y() throws IOException {
            if(this.i()) {
                this.n = 0;
                return 0;
            }
            int v = this.N();
            this.n = v;
            if(v >>> 3 == 0) {
                throw InvalidProtocolBufferException.c();
            }
            return this.n;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Z() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void a(int v) throws InvalidProtocolBufferException {
            if(this.n != v) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long a0() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void b0(int v, Builder messageLite$Builder0) throws IOException {
            this.E(v, messageLite$Builder0, ExtensionRegistryLite.d());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void c0() {
            this.o = -this.m;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void e(boolean z) {
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int f() {
            return this.p == 0x7FFFFFFF ? -1 : this.p - (this.o + this.m);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int g() {
            return this.n;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean g0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.v0();
                    return true;
                }
                case 1: {
                    this.k0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.i0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                this.k0(4);
                                return true;
                            }
                        }
                    }
                    this.k0(this.N());
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int h() {
            return this.o + this.m;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean h0(int v, CodedOutputStream codedOutputStream0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.G();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.M();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                codedOutputStream0.m1(v);
                                this.j0(codedOutputStream0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                codedOutputStream0.m1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                int v1 = this.L();
                                codedOutputStream0.m1(v);
                                codedOutputStream0.P0(v1);
                                return true;
                            }
                        }
                    }
                    ByteString byteString0 = this.x();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.M0(byteString0);
                    return true;
                }
            }
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean i() throws IOException {
            return this.m == this.k && !this.y0(1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void i0() throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.g0(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void j0(CodedOutputStream codedOutputStream0) throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.h0(v, codedOutputStream0));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void k0(int v) throws IOException {
            int v1 = this.m;
            if(v <= this.k - v1 && v >= 0) {
                this.m = v1 + v;
                return;
            }
            this.u0(v);
        }

        private ByteString o0(int v) throws IOException {
            byte[] arr_b = this.q0(v);
            if(arr_b != null) {
                return ByteString.p(arr_b);
            }
            int v1 = this.m;
            int v2 = this.k - v1;
            this.o += this.k;
            this.m = 0;
            this.k = 0;
            List list0 = this.r0(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.j, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return ByteString.h0(arr_b1);
        }

        private byte[] p0(int v, boolean z) throws IOException {
            byte[] arr_b = this.q0(v);
            if(arr_b != null) {
                return z ? ((byte[])arr_b.clone()) : arr_b;
            }
            int v1 = this.m;
            int v2 = this.k - v1;
            this.o += this.k;
            this.m = 0;
            this.k = 0;
            List list0 = this.r0(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.j, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return arr_b1;
        }

        private byte[] q0(int v) throws IOException {
            if(v == 0) {
                return Internal.d;
            }
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = this.o;
            int v2 = this.m;
            int v3 = v1 + v2 + v;
            if(v3 - this.c > 0) {
                throw InvalidProtocolBufferException.k();
            }
            int v4 = this.p;
            if(v3 <= v4) {
                int v5 = this.k - v2;
                if(v - v5 >= 0x1000 && v - v5 > this.i.available()) {
                    return null;
                }
                byte[] arr_b = new byte[v];
                System.arraycopy(this.j, this.m, arr_b, 0, v5);
                this.o += this.k;
                this.m = 0;
                this.k = 0;
                while(v5 < v) {
                    int v6 = this.i.read(arr_b, v5, v - v5);
                    if(v6 == -1) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.o += v6;
                    v5 += v6;
                }
                return arr_b;
            }
            this.k0(v4 - v1 - v2);
            throw InvalidProtocolBufferException.l();
        }

        private List r0(int v) throws IOException {
            List list0 = new ArrayList();
            while(v > 0) {
                int v1 = Math.min(v, 0x1000);
                byte[] arr_b = new byte[v1];
                for(int v2 = 0; v2 < v1; v2 += v3) {
                    int v3 = this.i.read(arr_b, v2, v1 - v2);
                    if(v3 == -1) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.o += v3;
                }
                v -= v1;
                list0.add(arr_b);
            }
            return list0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void s(int v) {
            this.p = v;
            this.s0();
        }

        private void s0() {
            int v = this.k + this.l;
            this.k = v;
            int v1 = this.o + v;
            int v2 = this.p;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.l = v3;
                this.k = v - v3;
                return;
            }
            this.l = 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int t(int v) throws InvalidProtocolBufferException {
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = v + (this.o + this.m);
            int v2 = this.p;
            if(v1 > v2) {
                throw InvalidProtocolBufferException.l();
            }
            this.p = v1;
            this.s0();
            return v2;
        }

        private void t0(int v) throws IOException {
            if(!this.y0(v)) {
                throw v <= this.c - this.o - this.m ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.k();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean u() throws IOException {
            return this.Q() != 0L;
        }

        private void u0(int v) throws IOException {
            int v11;
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = 0;
            int v2 = this.o;
            int v3 = this.m;
            int v4 = this.p;
            if(v2 + v3 + v <= v4) {
                if(this.q == null) {
                    this.o = v2 + v3;
                    int v5 = this.k - v3;
                    this.k = 0;
                    this.m = 0;
                    v1 = v5;
                    try {
                        while(v1 < v) {
                            long v7 = (long)(v - v1);
                            long v8 = this.i.skip(v7);
                            int v9 = Long.compare(v8, 0L);
                            if(v9 < 0 || v8 > v7) {
                                throw new IllegalStateException(this.i.getClass() + "#skip returned invalid result: " + v8 + "\nThe InputStream implementation is buggy.");
                            }
                            if(v9 == 0) {
                                break;
                            }
                            v1 += (int)v8;
                        }
                    }
                    finally {
                        this.o += v1;
                        this.s0();
                    }
                }
                if(v1 < v) {
                    int v10 = this.k - this.m;
                    this.m = this.k;
                    this.t0(1);
                    while(true) {
                        v11 = v - v10;
                        int v12 = this.k;
                        if(v11 <= v12) {
                            break;
                        }
                        v10 += v12;
                        this.m = v12;
                        this.t0(1);
                    }
                    this.m = v11;
                }
                return;
            }
            this.k0(v4 - v2 - v3);
            throw InvalidProtocolBufferException.l();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] v() throws IOException {
            int v = this.N();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                byte[] arr_b = Arrays.copyOfRange(this.j, v1, v1 + v);
                this.m += v;
                return arr_b;
            }
            return this.p0(v, false);
        }

        private void v0() throws IOException {
            if(this.k - this.m >= 10) {
                this.w0();
                return;
            }
            this.x0();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer w() throws IOException {
            int v = this.N();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(Arrays.copyOfRange(this.j, v1, v1 + v));
                this.m += v;
                return byteBuffer0;
            }
            return v == 0 ? Internal.e : ByteBuffer.wrap(this.p0(v, true));
        }

        private void w0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.m;
                this.m = v1 + 1;
                if(this.j[v1] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString x() throws IOException {
            int v = this.N();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                ByteString byteString0 = ByteString.q(this.j, v1, v);
                this.m += v;
                return byteString0;
            }
            return v == 0 ? ByteString.e : this.o0(v);
        }

        private void x0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public double y() throws IOException {
            return Double.longBitsToDouble(this.M());
        }

        private boolean y0(int v) throws IOException {
            int v1 = this.m;
            if(v1 + v <= this.k) {
                throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
            }
            int v2 = this.o;
            if(v > this.c - v2 - v1) {
                return false;
            }
            if(v2 + v1 + v > this.p) {
                return false;
            }
            RefillCallback codedInputStream$StreamDecoder$RefillCallback0 = this.q;
            if(codedInputStream$StreamDecoder$RefillCallback0 != null) {
                codedInputStream$StreamDecoder$RefillCallback0.onRefill();
            }
            int v3 = this.m;
            if(v3 > 0) {
                int v4 = this.k;
                if(v4 > v3) {
                    System.arraycopy(this.j, v3, this.j, 0, v4 - v3);
                }
                this.o += v3;
                this.k -= v3;
                this.m = 0;
            }
            int v5 = this.i.read(this.j, this.k, Math.min(this.j.length - this.k, this.c - this.o - this.k));
            if(v5 == 0 || v5 < -1 || v5 > this.j.length) {
                throw new IllegalStateException(this.i.getClass() + "#read(byte[]) returned invalid result: " + v5 + "\nThe InputStream implementation is buggy.");
            }
            if(v5 > 0) {
                this.k += v5;
                this.s0();
                return this.k < v ? this.y0(v) : true;
            }
            return false;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int z() throws IOException {
            return this.N();
        }
    }

    static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final ByteBuffer i;
        private final boolean j;
        private final long k;
        private long l;
        private long m;
        private long n;
        private int o;
        private int p;
        private boolean q;
        private int r;

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer0, boolean z) {
            super(null);
            this.r = 0x7FFFFFFF;
            this.i = byteBuffer0;
            long v = UnsafeUtil.i(byteBuffer0);
            this.k = v;
            this.l = ((long)byteBuffer0.limit()) + v;
            long v1 = v + ((long)byteBuffer0.position());
            this.m = v1;
            this.n = v1;
            this.j = z;
        }

        UnsafeDirectNioDecoder(ByteBuffer byteBuffer0, boolean z, androidx.datastore.preferences.protobuf.CodedInputStream.1 codedInputStream$10) {
            this(byteBuffer0, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int A() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long B() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public float C() throws IOException {
            return Float.intBitsToFloat(this.L());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite D(int v, Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void E(int v, Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1 = this.a;
            if(v1 >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            this.a = v1 + 1;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int F() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long G() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite H(Parser parser0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            MessageLite messageLite0 = (MessageLite)parser0.i(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
            return messageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void I(Builder messageLite$Builder0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.N();
            if(this.a >= this.b) {
                throw InvalidProtocolBufferException.i();
            }
            int v1 = this.t(v);
            ++this.a;
            messageLite$Builder0.Z7(this, extensionRegistryLite0);
            this.a(0);
            --this.a;
            this.s(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte J() throws IOException {
            long v = this.m;
            if(v == this.l) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 1L;
            return UnsafeUtil.y(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] K(int v) throws IOException {
            if(v >= 0 && v <= this.p0()) {
                byte[] arr_b = new byte[v];
                this.t0(this.m, this.m + ((long)v)).get(arr_b);
                this.m += (long)v;
                return arr_b;
            }
            if(v > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if(v != 0) {
                throw InvalidProtocolBufferException.g();
            }
            return Internal.d;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int L() throws IOException {
            long v = this.m;
            if(this.l - v < 4L) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 4L;
            int v1 = UnsafeUtil.y(v);
            int v2 = UnsafeUtil.y(v + 1L);
            int v3 = UnsafeUtil.y(v + 2L);
            return (UnsafeUtil.y(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long M() throws IOException {
            long v = this.m;
            if(this.l - v < 8L) {
                throw InvalidProtocolBufferException.l();
            }
            this.m = v + 8L;
            long v1 = ((long)UnsafeUtil.y(v)) & 0xFFL | (((long)UnsafeUtil.y(v + 1L)) & 0xFFL) << 8 | (((long)UnsafeUtil.y(v + 2L)) & 0xFFL) << 16 | (((long)UnsafeUtil.y(v + 3L)) & 0xFFL) << 24 | (((long)UnsafeUtil.y(v + 4L)) & 0xFFL) << 0x20 | (((long)UnsafeUtil.y(v + 5L)) & 0xFFL) << 40 | (((long)UnsafeUtil.y(v + 6L)) & 0xFFL) << 0x30;
            return (((long)UnsafeUtil.y(v + 7L)) & 0xFFL) << 56 | v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int N() throws IOException {
            int v4;
            long v = this.m;
            if(this.l != v) {
                int v1 = UnsafeUtil.y(v);
                if(v1 >= 0) {
                    this.m = v + 1L;
                    return v1;
                }
                if(this.l - (v + 1L) >= 9L) {
                    long v2 = v + 2L;
                    int v3 = UnsafeUtil.y(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.m = v2;
                        return v4;
                    }
                    long v5 = v + 3L;
                    int v6 = v3 ^ UnsafeUtil.y(v2) << 14;
                    if(v6 >= 0) {
                        v4 = v6 ^ 0x3F80;
                        v2 = v5;
                        this.m = v2;
                        return v4;
                    }
                    v2 = v + 4L;
                    int v7 = v6 ^ UnsafeUtil.y(v5) << 21;
                    if(v7 < 0) {
                        v4 = 0xFFE03F80 ^ v7;
                        this.m = v2;
                        return v4;
                    }
                    v5 = v + 5L;
                    int v8 = UnsafeUtil.y(v2);
                    int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                    if(v8 >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 6L;
                    if(UnsafeUtil.y(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                    v5 = v + 7L;
                    if(UnsafeUtil.y(v2) >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 8L;
                    if(UnsafeUtil.y(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                    v5 = v + 9L;
                    if(UnsafeUtil.y(v2) >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 10L;
                    if(UnsafeUtil.y(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                }
            }
            return (int)this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long Q() throws IOException {
            long v13;
            long v10;
            long v6;
            int v4;
            long v = this.m;
            if(this.l != v) {
                int v1 = UnsafeUtil.y(v);
                if(v1 >= 0) {
                    this.m = v + 1L;
                    return (long)v1;
                }
                if(this.l - (v + 1L) >= 9L) {
                    long v2 = v + 2L;
                    int v3 = UnsafeUtil.y(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.m = v2;
                        return (long)v4;
                    }
                    int v5 = v3 ^ UnsafeUtil.y(v2) << 14;
                    if(v5 >= 0) {
                        v6 = (long)(v5 ^ 0x3F80);
                        v2 = v + 3L;
                        this.m = v2;
                        return v6;
                    }
                    v2 = v + 4L;
                    int v7 = v5 ^ UnsafeUtil.y(v + 3L) << 21;
                    if(v7 < 0) {
                        v4 = 0xFFE03F80 ^ v7;
                        this.m = v2;
                        return (long)v4;
                    }
                    long v8 = v + 5L;
                    long v9 = ((long)v7) ^ ((long)UnsafeUtil.y(v2)) << 28;
                    if(v9 >= 0L) {
                        v10 = 0xFE03F80L;
                        v6 = v10 ^ v9;
                        v2 = v8;
                        this.m = v2;
                        return v6;
                    }
                    long v11 = v + 6L;
                    long v12 = v9 ^ ((long)UnsafeUtil.y(v8)) << 35;
                    if(v12 < 0L) {
                        v13 = 0xFFFFFFF80FE03F80L;
                        v6 = v13 ^ v12;
                        v2 = v11;
                        this.m = v2;
                        return v6;
                    }
                    v8 = v + 7L;
                    v9 = v12 ^ ((long)UnsafeUtil.y(v11)) << 42;
                    if(v9 >= 0L) {
                        v10 = 0x3F80FE03F80L;
                        v6 = v10 ^ v9;
                        v2 = v8;
                        this.m = v2;
                        return v6;
                    }
                    v11 = v + 8L;
                    v12 = v9 ^ ((long)UnsafeUtil.y(v8)) << 49;
                    if(v12 < 0L) {
                        v13 = 0xFFFE03F80FE03F80L;
                        v6 = v13 ^ v12;
                        v2 = v11;
                        this.m = v2;
                        return v6;
                    }
                    long v14 = v12 ^ ((long)UnsafeUtil.y(v11)) << 56 ^ 0xFE03F80FE03F80L;
                    if(v14 >= 0L) {
                        v2 = v + 9L;
                        this.m = v2;
                        return v14;
                    }
                    else if(((long)UnsafeUtil.y(v + 9L)) >= 0L) {
                        v2 = v + 10L;
                        this.m = v2;
                        return v14;
                    }
                }
            }
            return this.R();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        long R() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.J();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int S() throws IOException {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long T() throws IOException {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int U() throws IOException {
            return CodedInputStream.b(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long V() throws IOException {
            return CodedInputStream.c(this.Q());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String W() throws IOException {
            int v = this.N();
            if(v > 0 && v <= this.p0()) {
                byte[] arr_b = new byte[v];
                UnsafeUtil.n(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return new String(arr_b, Internal.a);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public String X() throws IOException {
            int v = this.N();
            if(v > 0 && v <= this.p0()) {
                String s = Utf8.g(this.i, this.m0(this.m), v);
                this.m += (long)v;
                return s;
            }
            if(v != 0) {
                throw v > 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Y() throws IOException {
            if(this.i()) {
                this.p = 0;
                return 0;
            }
            int v = this.N();
            this.p = v;
            if(v >>> 3 == 0) {
                throw InvalidProtocolBufferException.c();
            }
            return this.p;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int Z() throws IOException {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void a(int v) throws InvalidProtocolBufferException {
            if(this.p != v) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public long a0() throws IOException {
            return this.Q();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void b0(int v, Builder messageLite$Builder0) throws IOException {
            this.E(v, messageLite$Builder0, ExtensionRegistryLite.d());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void c0() {
            this.n = this.m;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void e(boolean z) {
            this.q = z;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int f() {
            return this.r == 0x7FFFFFFF ? -1 : this.r - this.h();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int g() {
            return this.p;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean g0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.q0();
                    return true;
                }
                case 1: {
                    this.k0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.i0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                this.k0(4);
                                return true;
                            }
                        }
                    }
                    this.k0(this.N());
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int h() {
            return (int)(this.m - this.n);
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean h0(int v, CodedOutputStream codedOutputStream0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.G();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.M();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                codedOutputStream0.m1(v);
                                this.j0(codedOutputStream0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                codedOutputStream0.m1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw InvalidProtocolBufferException.e();
                                }
                                int v1 = this.L();
                                codedOutputStream0.m1(v);
                                codedOutputStream0.P0(v1);
                                return true;
                            }
                        }
                    }
                    ByteString byteString0 = this.x();
                    codedOutputStream0.m1(v);
                    codedOutputStream0.M0(byteString0);
                    return true;
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean i() throws IOException {
            return this.m == this.l;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void i0() throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.g0(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void j0(CodedOutputStream codedOutputStream0) throws IOException {
            do {
                int v = this.Y();
            }
            while(v != 0 && this.h0(v, codedOutputStream0));
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void k0(int v) throws IOException {
            if(v < 0 || v > this.p0()) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            this.m += (long)v;
        }

        private int m0(long v) {
            return (int)(v - this.k);
        }

        // 去混淆评级： 低(20)
        static boolean n0() [...] // 潜在的解密器

        private void o0() {
            long v = this.l + ((long)this.o);
            this.l = v;
            int v1 = (int)(v - this.n);
            int v2 = this.r;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.o = v3;
                this.l = v - ((long)v3);
                return;
            }
            this.o = 0;
        }

        private int p0() {
            return (int)(this.l - this.m);
        }

        private void q0() throws IOException {
            if(this.p0() >= 10) {
                this.r0();
                return;
            }
            this.s0();
        }

        private void r0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                long v1 = this.m;
                this.m = v1 + 1L;
                if(UnsafeUtil.y(v1) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public void s(int v) {
            this.r = v;
            this.o0();
        }

        private void s0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int t(int v) throws InvalidProtocolBufferException {
            if(v < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int v1 = v + this.h();
            int v2 = this.r;
            if(v1 > v2) {
                throw InvalidProtocolBufferException.l();
            }
            this.r = v1;
            this.o0();
            return v2;
        }

        private ByteBuffer t0(long v, long v1) throws IOException {
            int v2 = this.i.position();
            int v3 = this.i.limit();
            try {
                this.i.position(this.m0(v));
                this.i.limit(this.m0(v1));
                return this.i.slice();
            }
            catch(IllegalArgumentException unused_ex) {
                throw InvalidProtocolBufferException.l();
            }
            finally {
                this.i.position(v2);
                this.i.limit(v3);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean u() throws IOException {
            return this.Q() != 0L;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] v() throws IOException {
            return this.K(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer w() throws IOException {
            int v = this.N();
            if(v > 0 && v <= this.p0()) {
                if(!this.j && this.q) {
                    ByteBuffer byteBuffer0 = this.t0(this.m, this.m + ((long)v));
                    this.m += (long)v;
                    return byteBuffer0;
                }
                byte[] arr_b = new byte[v];
                UnsafeUtil.n(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return ByteBuffer.wrap(arr_b);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return Internal.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString x() throws IOException {
            int v = this.N();
            if(v > 0 && v <= this.p0()) {
                if(this.j && this.q) {
                    ByteBuffer byteBuffer0 = this.t0(this.m, this.m + ((long)v));
                    this.m += (long)v;
                    return ByteString.g0(byteBuffer0);
                }
                byte[] arr_b = new byte[v];
                UnsafeUtil.n(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return ByteString.h0(arr_b);
            }
            if(v != 0) {
                throw v >= 0 ? InvalidProtocolBufferException.l() : InvalidProtocolBufferException.g();
            }
            return ByteString.e;
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public double y() throws IOException {
            return Double.longBitsToDouble(this.M());
        }

        @Override  // androidx.datastore.preferences.protobuf.CodedInputStream
        public int z() throws IOException {
            return this.N();
        }
    }

    int a;
    int b;
    int c;
    CodedInputStreamReader d;
    private boolean e;
    private static final int f = 0x1000;
    private static final int g = 100;
    private static final int h = 0x7FFFFFFF;

    private CodedInputStream() {
        this.b = 100;
        this.c = 0x7FFFFFFF;
        this.e = false;
    }

    CodedInputStream(androidx.datastore.preferences.protobuf.CodedInputStream.1 codedInputStream$10) {
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract MessageLite D(int arg1, Parser arg2, ExtensionRegistryLite arg3) throws IOException;

    public abstract void E(int arg1, Builder arg2, ExtensionRegistryLite arg3) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract MessageLite H(Parser arg1, ExtensionRegistryLite arg2) throws IOException;

    public abstract void I(Builder arg1, ExtensionRegistryLite arg2) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int arg1) throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    public abstract int N() throws IOException;

    public static int O(int v, InputStream inputStream0) throws IOException {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2;
        for(v2 = 7; v2 < 0x20; v2 += 7) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw InvalidProtocolBufferException.l();
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw InvalidProtocolBufferException.l();
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    static int P(InputStream inputStream0) throws IOException {
        int v = inputStream0.read();
        if(v == -1) {
            throw InvalidProtocolBufferException.l();
        }
        return CodedInputStream.O(v, inputStream0);
    }

    public abstract long Q() throws IOException;

    abstract long R() throws IOException;

    public abstract int S() throws IOException;

    public abstract long T() throws IOException;

    public abstract int U() throws IOException;

    public abstract long V() throws IOException;

    public abstract String W() throws IOException;

    public abstract String X() throws IOException;

    public abstract int Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int arg1) throws InvalidProtocolBufferException;

    public abstract long a0() throws IOException;

    public static int b(int v) [...] // Inlined contents

    @Deprecated
    public abstract void b0(int arg1, Builder arg2) throws IOException;

    public static long c(long v) [...] // Inlined contents

    public abstract void c0();

    final void d() {
        this.e = true;
    }

    public final int d0(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + v);
        }
        int v1 = this.b;
        this.b = v;
        return v1;
    }

    public abstract void e(boolean arg1);

    public final int e0(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + v);
        }
        int v1 = this.c;
        this.c = v;
        return v1;
    }

    public abstract int f();

    final boolean f0() {
        return this.e;
    }

    public abstract int g();

    public abstract boolean g0(int arg1) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int arg1, CodedOutputStream arg2) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public static CodedInputStream j(InputStream inputStream0) {
        return CodedInputStream.k(inputStream0, 0x1000);
    }

    public abstract void j0(CodedOutputStream arg1) throws IOException;

    public static CodedInputStream k(InputStream inputStream0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        return inputStream0 == null ? CodedInputStream.p(Internal.d) : new StreamDecoder(inputStream0, v, null);
    }

    public abstract void k0(int arg1) throws IOException;

    // 去混淆评级： 低(30)
    public static CodedInputStream l(Iterable iterable0) {
        return CodedInputStream.m(iterable0, false);
    }

    final void l0() {
        this.e = false;
    }

    static CodedInputStream m(Iterable iterable0, boolean z) {
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            v1 += byteBuffer0.remaining();
            if(byteBuffer0.hasArray()) {
                v |= 1;
            }
            else {
                v |= (byteBuffer0.isDirect() ? 2 : 4);
            }
        }
        return v == 2 ? new IterableDirectByteBufferDecoder(iterable0, v1, z, null) : CodedInputStream.j(new IterableByteBufferInputStream(iterable0));
    }

    public static CodedInputStream n(ByteBuffer byteBuffer0) {
        return CodedInputStream.o(byteBuffer0, false);
    }

    static CodedInputStream o(ByteBuffer byteBuffer0, boolean z) {
        if(byteBuffer0.hasArray()) {
            return CodedInputStream.r(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining(), z);
        }
        if(byteBuffer0.isDirect()) {
            return new UnsafeDirectNioDecoder(byteBuffer0, z, null);
        }
        int v = byteBuffer0.remaining();
        byte[] arr_b = new byte[v];
        byteBuffer0.duplicate().get(arr_b);
        return CodedInputStream.r(arr_b, 0, v, true);
    }

    public static CodedInputStream p(byte[] arr_b) {
        return CodedInputStream.q(arr_b, 0, arr_b.length);
    }

    public static CodedInputStream q(byte[] arr_b, int v, int v1) {
        return CodedInputStream.r(arr_b, v, v1, false);
    }

    static CodedInputStream r(byte[] arr_b, int v, int v1, boolean z) {
        CodedInputStream codedInputStream0 = new ArrayDecoder(arr_b, v, v1, z, null);
        try {
            ((ArrayDecoder)codedInputStream0).t(v1);
            return codedInputStream0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new IllegalArgumentException(invalidProtocolBufferException0);
        }
    }

    public abstract void s(int arg1);

    public abstract int t(int arg1) throws InvalidProtocolBufferException;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract ByteString x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;

    class androidx.datastore.preferences.protobuf.CodedInputStream.1 {
    }

}

