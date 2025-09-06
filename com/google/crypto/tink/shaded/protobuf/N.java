package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;

@y
abstract class n extends t implements e2 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.j.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.q.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.crypto.tink.shaded.protobuf.n.b extends n {
        private ByteBuffer h;
        private int i;
        private int j;

        com.google.crypto.tink.shaded.protobuf.n.b(r r0, int v) {
            super(r0, v, null);
            this.m0();
        }

        private void A0(long v) {
            this.s0(((int)v));
        }

        private void B0(long v) {
            int v1 = this.j - 7;
            this.j = v1;
            this.h.putLong(v1, (v & 0x7FL | 0x80L) << 8 | ((0x1FC0000000000L & v) << 14 | (0x3F800000000L & v | 0x40000000000L) << 13 | (0x7F0000000L & v | 0x800000000L) << 12 | (0xFE00000L & v | 0x10000000L) << 11 | (0x1FC000L & v | 0x200000L) << 10 | (0x3F80L & v | 0x4000L) << 9));
        }

        private void C0(long v) {
            int v1 = this.j;
            this.j = v1 - 6;
            this.h.putLong(v1 - 7, (v & 0x7FL | 0x80L) << 16 | ((0x3F800000000L & v) << 21 | (0x7F0000000L & v | 0x800000000L) << 20 | (0xFE00000L & v | 0x10000000L) << 19 | (0x1FC000L & v | 0x200000L) << 18 | (0x3F80L & v | 0x4000L) << 17));
        }

        private void D0(long v) {
            int v1 = this.j;
            this.j = v1 - 1;
            this.h.put(v1, ((byte)(((int)(v >>> 0x3F)))));
            int v2 = this.j;
            this.j = v2 - 1;
            this.h.put(v2, ((byte)(((int)(v >>> 56 & 0x7FL | 0x80L)))));
            this.w0(v & 0xFFFFFFFFFFFFFFL);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void E(int v) {
            if(this.p0() < v) {
                this.n0(v);
            }
        }

        private void E0(long v) {
            this.t0(((int)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void F(boolean z) {
            this.g(((byte)z));
        }

        private void F0(long v) {
            this.u0(((int)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void K(int v) {
            int v1 = this.j;
            this.j = v1 - 4;
            this.h.putInt(v1 - 3, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void N(long v) {
            int v1 = this.j;
            this.j = v1 - 8;
            this.h.putLong(v1 - 7, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void S(int v) {
            if(v >= 0) {
                this.j0(v);
                return;
            }
            this.k0(((long)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void X(int v) {
            this.j0(v >> 0x1F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void a0(long v) {
            this.k0(v >> 0x3F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void b(int v, Object object0, t1 t10) throws IOException {
            this.e0(v, 4);
            t10.c(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void d(int v, Object object0, t1 t10) throws IOException {
            int v1 = this.p();
            t10.c(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void d0(String s) {
            this.E(s.length());
            int v = s.length() - 1;
            this.j -= v;
            while(v >= 0) {
                int v1 = s.charAt(v);
                if(v1 >= 0x80) {
                    break;
                }
                this.h.put(this.j + v, ((byte)v1));
                --v;
            }
            if(v == -1) {
                --this.j;
                return;
            }
            this.j += v;
            while(v >= 0) {
                int v2 = s.charAt(v);
                if(v2 < 0x80) {
                    int v3 = this.j;
                    if(v3 >= 0) {
                        this.j = v3 - 1;
                        this.h.put(v3, ((byte)v2));
                    }
                }
                else {
                    if(v2 < 0x800) {
                        int v4 = this.j;
                        if(v4 > 0) {
                            this.j = v4 - 1;
                            this.h.put(v4, ((byte)(v2 & 0x3F | 0x80)));
                            int v5 = this.j;
                            this.j = v5 - 1;
                            this.h.put(v5, ((byte)(v2 >>> 6 | 960)));
                            goto label_64;
                        }
                    }
                    if(v2 < 0xD800 || 0xDFFF < v2) {
                        int v6 = this.j;
                        if(v6 > 1) {
                            this.j = v6 - 1;
                            this.h.put(v6, ((byte)(v2 & 0x3F | 0x80)));
                            int v7 = this.j;
                            this.j = v7 - 1;
                            this.h.put(v7, ((byte)(v2 >>> 6 & 0x3F | 0x80)));
                            int v8 = this.j;
                            this.j = v8 - 1;
                            this.h.put(v8, ((byte)(v2 >>> 12 | 480)));
                            goto label_64;
                        }
                    }
                    if(this.j > 2) {
                        if(v != 0) {
                            int v9 = s.charAt(v - 1);
                            if(Character.isSurrogatePair(((char)v9), ((char)v2))) {
                                --v;
                                int v10 = Character.toCodePoint(((char)v9), ((char)v2));
                                int v11 = this.j;
                                this.j = v11 - 1;
                                this.h.put(v11, ((byte)(v10 & 0x3F | 0x80)));
                                int v12 = this.j;
                                this.j = v12 - 1;
                                this.h.put(v12, ((byte)(v10 >>> 6 & 0x3F | 0x80)));
                                int v13 = this.j;
                                this.j = v13 - 1;
                                this.h.put(v13, ((byte)(v10 >>> 12 & 0x3F | 0x80)));
                                int v14 = this.j;
                                this.j = v14 - 1;
                                this.h.put(v14, ((byte)(v10 >>> 18 | 0xF0)));
                                goto label_64;
                            }
                        }
                        throw new d(v - 1, v);
                    }
                    else {
                        this.E(v);
                        ++v;
                    }
                }
            label_64:
                --v;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void e0(int v, int v1) {
            this.j0(v << 3 | v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void f(int v, u u0) {
            try {
                u0.t0(this);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            this.E(10);
            this.j0(u0.size());
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void g(byte b) {
            int v = this.j;
            this.j = v - 1;
            this.h.put(v, b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void h(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.p0() < v) {
                this.n0(v);
            }
            int v1 = this.j - v;
            this.j = v1;
            this.h.position(v1 + 1);
            this.h.put(byteBuffer0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void i(byte[] arr_b, int v, int v1) {
            if(this.p0() < v1) {
                this.n0(v1);
            }
            int v2 = this.j - v1;
            this.j = v2;
            this.h.position(v2 + 1);
            this.h.put(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void j(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.p0() < v) {
                this.d += v;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.j(byteBuffer0);
                this.c.addFirst(d0);
                this.m0();
                return;
            }
            int v1 = this.j - v;
            this.j = v1;
            this.h.position(v1 + 1);
            this.h.put(byteBuffer0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void j0(int v) {
            if((v & 0xFFFFFF80) == 0) {
                this.s0(v);
                return;
            }
            if((v & 0xFFFFC000) == 0) {
                this.u0(v);
                return;
            }
            if((0xFFE00000 & v) == 0) {
                this.t0(v);
                return;
            }
            if((0xF0000000 & v) == 0) {
                this.r0(v);
                return;
            }
            this.q0(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void k(byte[] arr_b, int v, int v1) {
            if(this.p0() < v1) {
                this.d += v1;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.l(arr_b, v, v1);
                this.c.addFirst(d0);
                this.m0();
                return;
            }
            int v2 = this.j - v1;
            this.j = v2;
            this.h.position(v2 + 1);
            this.h.put(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void k0(long v) {
            switch(n.n(v)) {
                case 1: {
                    this.A0(v);
                    return;
                }
                case 2: {
                    this.F0(v);
                    return;
                }
                case 3: {
                    this.E0(v);
                    return;
                }
                case 4: {
                    this.y0(v);
                    return;
                }
                case 5: {
                    this.x0(v);
                    return;
                }
                case 6: {
                    this.C0(v);
                    return;
                }
                case 7: {
                    this.B0(v);
                    return;
                }
                case 8: {
                    this.v0(v);
                    return;
                }
                case 9: {
                    this.z0(v);
                    return;
                }
                case 10: {
                    this.D0(v);
                }
            }
        }

        private int l0() {
            return this.i - this.j;
        }

        private void m0() {
            this.o0(this.s());
        }

        private void n0(int v) {
            this.o0(this.t(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void o() {
            if(this.h != null) {
                this.d += this.l0();
                this.h.position(this.j + 1);
                this.h = null;
                this.j = 0;
                this.i = 0;
            }
        }

        private void o0(com.google.crypto.tink.shaded.protobuf.d d0) {
            if(!d0.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBuffer0 = d0.f();
            if(!byteBuffer0.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            this.o();
            this.c.addFirst(d0);
            this.h = byteBuffer0;
            byteBuffer0.limit(byteBuffer0.capacity());
            this.h.position(0);
            this.h.order(ByteOrder.LITTLE_ENDIAN);
            int v = this.h.limit();
            this.i = v - 1;
            this.j = v - 1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        public int p() {
            return this.d + this.l0();
        }

        private int p0() {
            return this.j + 1;
        }

        private void q0(int v) {
            int v1 = this.j;
            this.j = v1 - 1;
            this.h.put(v1, ((byte)(v >>> 28)));
            int v2 = this.j;
            this.j = v2 - 4;
            this.h.putInt(v2 - 3, v & 0x7F | 0x80 | ((v >>> 21 & 0x7F | 0x80) << 24 | (v >>> 14 & 0x7F | 0x80) << 16 | (v >>> 7 & 0x7F | 0x80) << 8));
        }

        private void r0(int v) {
            int v1 = this.j;
            this.j = v1 - 4;
            this.h.putInt(v1 - 3, v & 0x7F | 0x80 | ((0xFE00000 & v) << 3 | (0x1FC000 & v | 0x200000) << 2 | (v & 0x3F80 | 0x4000) << 1));
        }

        private void s0(int v) {
            int v1 = this.j;
            this.j = v1 - 1;
            this.h.put(v1, ((byte)v));
        }

        private void t0(int v) {
            int v1 = this.j - 3;
            this.j = v1;
            this.h.putInt(v1, (v & 0x7F | 0x80) << 8 | ((0x1FC000 & v) << 10 | (v & 0x3F80 | 0x4000) << 9));
        }

        private void u0(int v) {
            int v1 = this.j;
            this.j = v1 - 2;
            this.h.putShort(v1 - 1, ((short)(v & 0x7F | 0x80 | (v & 0x3F80) << 1)));
        }

        private void v0(long v) {
            int v1 = this.j;
            this.j = v1 - 8;
            this.h.putLong(v1 - 7, v & 0x7FL | 0x80L | ((0xFE000000000000L & v) << 7 | (0x1FC0000000000L & v | 0x2000000000000L) << 6 | (0x3F800000000L & v | 0x40000000000L) << 5 | (0x7F0000000L & v | 0x800000000L) << 4 | (0xFE00000L & v | 0x10000000L) << 3 | (0x1FC000L & v | 0x200000L) << 2 | (0x3F80L & v | 0x4000L) << 1));
        }

        private void w0(long v) {
            int v1 = this.j;
            this.j = v1 - 8;
            this.h.putLong(v1 - 7, v & 0x7FL | 0x80L | ((0xFE000000000000L & v | 0x100000000000000L) << 7 | (0x1FC0000000000L & v | 0x2000000000000L) << 6 | (0x3F800000000L & v | 0x40000000000L) << 5 | (0x7F0000000L & v | 0x800000000L) << 4 | (0xFE00000L & v | 0x10000000L) << 3 | (0x1FC000L & v | 0x200000L) << 2 | (0x3F80L & v | 0x4000L) << 1));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeBool(int v, boolean z) {
            this.E(6);
            this.g(((byte)z));
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeEndGroup(int v) {
            this.e0(v, 4);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed32(int v, int v1) {
            this.E(9);
            this.K(v1);
            this.e0(v, 5);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed64(int v, long v1) {
            this.E(13);
            this.N(v1);
            this.e0(v, 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeGroup(int v, Object object0) throws IOException {
            this.e0(v, 4);
            m1.a().k(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeInt32(int v, int v1) {
            this.E(15);
            this.S(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeMessage(int v, Object object0) throws IOException {
            int v1 = this.p();
            m1.a().k(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt32(int v, int v1) {
            this.E(10);
            this.X(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt64(int v, long v1) {
            this.E(15);
            this.a0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeStartGroup(int v) {
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeString(int v, String s) {
            int v1 = this.p();
            this.d0(s);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt32(int v, int v1) {
            this.E(10);
            this.j0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt64(int v, long v1) {
            this.E(15);
            this.k0(v1);
            this.e0(v, 0);
        }

        private void x0(long v) {
            int v1 = this.j;
            this.j = v1 - 5;
            this.h.putLong(v1 - 7, (v & 0x7FL | 0x80L) << 24 | ((0x7F0000000L & v) << 28 | (0xFE00000L & v | 0x10000000L) << 27 | (0x1FC000L & v | 0x200000L) << 26 | (0x3F80L & v | 0x4000L) << 25));
        }

        private void y0(long v) {
            this.r0(((int)v));
        }

        private void z0(long v) {
            int v1 = this.j;
            this.j = v1 - 1;
            this.h.put(v1, ((byte)(((int)(v >>> 56)))));
            this.w0(v & 0xFFFFFFFFFFFFFFL);
        }
    }

    static final class c extends n {
        private com.google.crypto.tink.shaded.protobuf.d h;
        private byte[] i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;

        c(r r0, int v) {
            super(r0, v, null);
            this.m0();
        }

        private void A0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 42)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 35 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 28 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 7;
            arr_b[v1 - 6] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void B0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 35)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 28 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void C0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 0x3F)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 56 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 49 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 42 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >>> 35 & 0x7FL | 0x80L)));
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v >>> 28 & 0x7FL | 0x80L)));
            this.n = v1 - 7;
            arr_b[v1 - 6] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 8;
            arr_b[v1 - 7] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 9;
            arr_b[v1 - 8] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 10;
            arr_b[v1 - 9] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void D0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)v) >>> 14);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void E(int v) {
            if(this.p0() < v) {
                this.n0(v);
            }
        }

        private void E0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 7)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)v) & 0x7F | 0x80);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void F(boolean z) {
            this.g(((byte)z));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void K(int v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(v >> 24 & 0xFF);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(v >> 16 & 0xFF);
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(v >> 8 & 0xFF);
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(v & 0xFF);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void N(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >> 56)) & 0xFF);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >> 40)) & 0xFF);
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >> 24)) & 0xFF);
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v >> 16)) & 0xFF);
            this.n = v1 - 7;
            arr_b[v1 - 6] = (byte)(((int)(v >> 8)) & 0xFF);
            this.n = v1 - 8;
            arr_b[v1 - 7] = (byte)(((int)v) & 0xFF);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void S(int v) {
            if(v >= 0) {
                this.j0(v);
                return;
            }
            this.k0(((long)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void X(int v) {
            this.j0(v >> 0x1F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void a0(long v) {
            this.k0(v >> 0x3F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void b(int v, Object object0, t1 t10) throws IOException {
            this.e0(v, 4);
            t10.c(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void d(int v, Object object0, t1 t10) throws IOException {
            int v1 = this.p();
            t10.c(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void d0(String s) {
            this.E(s.length());
            int v = s.length() - 1;
            this.n -= v;
            while(v >= 0) {
                int v1 = s.charAt(v);
                if(v1 >= 0x80) {
                    break;
                }
                this.i[this.n + v] = (byte)v1;
                --v;
            }
            if(v == -1) {
                --this.n;
                return;
            }
            this.n += v;
            while(v >= 0) {
                int v2 = s.charAt(v);
                if(v2 < 0x80) {
                    int v3 = this.n;
                    if(v3 > this.l) {
                        this.n = v3 - 1;
                        this.i[v3] = (byte)v2;
                    }
                }
                else {
                    if(v2 < 0x800) {
                        int v4 = this.n;
                        if(v4 > this.j) {
                            byte[] arr_b = this.i;
                            this.n = v4 - 1;
                            arr_b[v4] = (byte)(v2 & 0x3F | 0x80);
                            this.n = v4 - 2;
                            arr_b[v4 - 1] = (byte)(v2 >>> 6 | 960);
                            goto label_61;
                        }
                    }
                    if(v2 < 0xD800 || 0xDFFF < v2) {
                        int v5 = this.n;
                        if(v5 > this.j + 1) {
                            byte[] arr_b1 = this.i;
                            this.n = v5 - 1;
                            arr_b1[v5] = (byte)(v2 & 0x3F | 0x80);
                            this.n = v5 - 2;
                            arr_b1[v5 - 1] = (byte)(v2 >>> 6 & 0x3F | 0x80);
                            this.n = v5 - 3;
                            arr_b1[v5 - 2] = (byte)(v2 >>> 12 | 480);
                            goto label_61;
                        }
                    }
                    if(this.n > this.j + 2) {
                        if(v != 0) {
                            int v6 = s.charAt(v - 1);
                            if(Character.isSurrogatePair(((char)v6), ((char)v2))) {
                                --v;
                                int v7 = Character.toCodePoint(((char)v6), ((char)v2));
                                byte[] arr_b2 = this.i;
                                int v8 = this.n;
                                this.n = v8 - 1;
                                arr_b2[v8] = (byte)(v7 & 0x3F | 0x80);
                                this.n = v8 - 2;
                                arr_b2[v8 - 1] = (byte)(v7 >>> 6 & 0x3F | 0x80);
                                this.n = v8 - 3;
                                arr_b2[v8 - 2] = (byte)(v7 >>> 12 & 0x3F | 0x80);
                                this.n = v8 - 4;
                                arr_b2[v8 - 3] = (byte)(v7 >>> 18 | 0xF0);
                                goto label_61;
                            }
                        }
                        throw new d(v - 1, v);
                    }
                    else {
                        this.E(v);
                        ++v;
                    }
                }
            label_61:
                --v;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void e0(int v, int v1) {
            this.j0(v << 3 | v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void f(int v, u u0) throws IOException {
            try {
                u0.t0(this);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            this.E(10);
            this.j0(u0.size());
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void g(byte b) {
            int v = this.n;
            this.n = v - 1;
            this.i[v] = b;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void h(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.p0() < v) {
                this.n0(v);
            }
            int v1 = this.n - v;
            this.n = v1;
            byteBuffer0.get(this.i, v1 + 1, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void i(byte[] arr_b, int v, int v1) {
            if(this.p0() < v1) {
                this.n0(v1);
            }
            int v2 = this.n - v1;
            this.n = v2;
            System.arraycopy(arr_b, v, this.i, v2 + 1, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void j(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.p0() < v) {
                this.d += v;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.j(byteBuffer0);
                this.c.addFirst(d0);
                this.m0();
            }
            int v1 = this.n - v;
            this.n = v1;
            byteBuffer0.get(this.i, v1 + 1, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void j0(int v) {
            if((v & 0xFFFFFF80) == 0) {
                this.s0(v);
                return;
            }
            if((v & 0xFFFFC000) == 0) {
                this.u0(v);
                return;
            }
            if((0xFFE00000 & v) == 0) {
                this.t0(v);
                return;
            }
            if((0xF0000000 & v) == 0) {
                this.r0(v);
                return;
            }
            this.q0(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void k(byte[] arr_b, int v, int v1) {
            if(this.p0() < v1) {
                this.d += v1;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.l(arr_b, v, v1);
                this.c.addFirst(d0);
                this.m0();
                return;
            }
            int v2 = this.n - v1;
            this.n = v2;
            System.arraycopy(arr_b, v, this.i, v2 + 1, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void k0(long v) {
            switch(n.n(v)) {
                case 1: {
                    this.z0(v);
                    return;
                }
                case 2: {
                    this.E0(v);
                    return;
                }
                case 3: {
                    this.D0(v);
                    return;
                }
                case 4: {
                    this.x0(v);
                    return;
                }
                case 5: {
                    this.w0(v);
                    return;
                }
                case 6: {
                    this.B0(v);
                    return;
                }
                case 7: {
                    this.A0(v);
                    return;
                }
                case 8: {
                    this.v0(v);
                    return;
                }
                case 9: {
                    this.y0(v);
                    return;
                }
                case 10: {
                    this.C0(v);
                }
            }
        }

        int l0() {
            return this.m - this.n;
        }

        private void m0() {
            this.o0(this.w());
        }

        private void n0(int v) {
            this.o0(this.x(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void o() {
            if(this.h != null) {
                this.d += this.l0();
                this.h.h(this.n - this.h.b() + 1);
                this.h = null;
                this.n = 0;
                this.m = 0;
            }
        }

        private void o0(com.google.crypto.tink.shaded.protobuf.d d0) {
            if(!d0.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            this.o();
            this.c.addFirst(d0);
            this.h = d0;
            this.i = d0.a();
            int v = d0.b();
            this.k = d0.e() + v;
            int v1 = v + d0.g();
            this.j = v1;
            this.l = v1 - 1;
            this.m = this.k - 1;
            this.n = this.k - 1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        public int p() {
            return this.d + this.l0();
        }

        int p0() {
            return this.n - this.l;
        }

        private void q0(int v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(v >>> 28);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(v >>> 21 & 0x7F | 0x80);
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(v >>> 14 & 0x7F | 0x80);
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(v >>> 7 & 0x7F | 0x80);
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(v & 0x7F | 0x80);
        }

        private void r0(int v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(v >>> 21);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(v >>> 14 & 0x7F | 0x80);
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(v >>> 7 & 0x7F | 0x80);
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(v & 0x7F | 0x80);
        }

        private void s0(int v) {
            int v1 = this.n;
            this.n = v1 - 1;
            this.i[v1] = (byte)v;
        }

        private void t0(int v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(v >>> 14);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(v >>> 7 & 0x7F | 0x80);
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(v & 0x7F | 0x80);
        }

        private void u0(int v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(v >>> 7);
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(v & 0x7F | 0x80);
        }

        private void v0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 49)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 42 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 35 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 28 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 7;
            arr_b[v1 - 6] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 8;
            arr_b[v1 - 7] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void w0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 28)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeBool(int v, boolean z) throws IOException {
            this.E(6);
            this.g(((byte)z));
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeEndGroup(int v) {
            this.e0(v, 4);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed32(int v, int v1) throws IOException {
            this.E(9);
            this.K(v1);
            this.e0(v, 5);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed64(int v, long v1) throws IOException {
            this.E(13);
            this.N(v1);
            this.e0(v, 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeGroup(int v, Object object0) throws IOException {
            this.e0(v, 4);
            m1.a().k(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeInt32(int v, int v1) throws IOException {
            this.E(15);
            this.S(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeMessage(int v, Object object0) throws IOException {
            int v1 = this.p();
            m1.a().k(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt32(int v, int v1) throws IOException {
            this.E(10);
            this.X(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt64(int v, long v1) throws IOException {
            this.E(15);
            this.a0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeStartGroup(int v) {
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeString(int v, String s) throws IOException {
            int v1 = this.p();
            this.d0(s);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt32(int v, int v1) throws IOException {
            this.E(10);
            this.j0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt64(int v, long v1) throws IOException {
            this.E(15);
            this.k0(v1);
            this.e0(v, 0);
        }

        private void x0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 21)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void y0(long v) {
            byte[] arr_b = this.i;
            int v1 = this.n;
            this.n = v1 - 1;
            arr_b[v1] = (byte)(((int)(v >>> 56)));
            this.n = v1 - 2;
            arr_b[v1 - 1] = (byte)(((int)(v >>> 49 & 0x7FL | 0x80L)));
            this.n = v1 - 3;
            arr_b[v1 - 2] = (byte)(((int)(v >>> 42 & 0x7FL | 0x80L)));
            this.n = v1 - 4;
            arr_b[v1 - 3] = (byte)(((int)(v >>> 35 & 0x7FL | 0x80L)));
            this.n = v1 - 5;
            arr_b[v1 - 4] = (byte)(((int)(v >>> 28 & 0x7FL | 0x80L)));
            this.n = v1 - 6;
            arr_b[v1 - 5] = (byte)(((int)(v >>> 21 & 0x7FL | 0x80L)));
            this.n = v1 - 7;
            arr_b[v1 - 6] = (byte)(((int)(v >>> 14 & 0x7FL | 0x80L)));
            this.n = v1 - 8;
            arr_b[v1 - 7] = (byte)(((int)(v >>> 7 & 0x7FL | 0x80L)));
            this.n = v1 - 9;
            arr_b[v1 - 8] = (byte)(((int)(v & 0x7FL | 0x80L)));
        }

        private void z0(long v) {
            int v1 = this.n;
            this.n = v1 - 1;
            this.i[v1] = (byte)(((int)v));
        }
    }

    static final class com.google.crypto.tink.shaded.protobuf.n.d extends n {
        private ByteBuffer h;
        private long i;
        private long j;
        private long k;

        com.google.crypto.tink.shaded.protobuf.n.d(r r0, int v) {
            super(r0, v, null);
            this.p0();
        }

        private void A0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 21)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void B0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 56)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 49 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v7 = this.k;
            this.k = v7 - 1L;
            Y1.e0(v7, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v8 = this.k;
            this.k = v8 - 1L;
            Y1.e0(v8, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v9 = this.k;
            this.k = v9 - 1L;
            Y1.e0(v9, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void C0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)v))));
        }

        private void D0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 42)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v7 = this.k;
            this.k = v7 - 1L;
            Y1.e0(v7, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void E(int v) {
            if(this.s0() < v) {
                this.q0(v);
            }
        }

        private void E0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 35)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void F(boolean z) {
            this.g(((byte)z));
        }

        private void F0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 0x3F)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 56 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 49 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v7 = this.k;
            this.k = v7 - 1L;
            Y1.e0(v7, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v8 = this.k;
            this.k = v8 - 1L;
            Y1.e0(v8, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v9 = this.k;
            this.k = v9 - 1L;
            Y1.e0(v9, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v10 = this.k;
            this.k = v10 - 1L;
            Y1.e0(v10, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void G0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)v) >>> 14)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void H0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 7)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)v) & 0x7F | 0x80)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void K(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(v >> 24 & 0xFF)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(v >> 16 & 0xFF)));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(v >> 8 & 0xFF)));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(v & 0xFF)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void N(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >> 56)) & 0xFF)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >> 0x30)) & 0xFF)));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >> 40)) & 0xFF)));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >> 0x20)) & 0xFF)));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >> 24)) & 0xFF)));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v >> 16)) & 0xFF)));
            long v7 = this.k;
            this.k = v7 - 1L;
            Y1.e0(v7, ((byte)(((int)(v >> 8)) & 0xFF)));
            long v8 = this.k;
            this.k = v8 - 1L;
            Y1.e0(v8, ((byte)(((int)v) & 0xFF)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void S(int v) {
            if(v >= 0) {
                this.j0(v);
                return;
            }
            this.k0(((long)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void X(int v) {
            this.j0(v >> 0x1F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void a0(long v) {
            this.k0(v >> 0x3F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void b(int v, Object object0, t1 t10) throws IOException {
            this.e0(v, 4);
            t10.c(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void d(int v, Object object0, t1 t10) throws IOException {
            int v1 = this.p();
            t10.c(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void d0(String s) {
            this.E(s.length());
            int v;
            for(v = s.length() - 1; v >= 0; --v) {
                int v1 = s.charAt(v);
                if(v1 >= 0x80) {
                    break;
                }
                long v2 = this.k;
                this.k = v2 - 1L;
                Y1.e0(v2, ((byte)v1));
            }
            if(v == -1) {
                return;
            }
            while(v >= 0) {
                int v3 = s.charAt(v);
                if(v3 < 0x80) {
                    long v4 = this.k;
                    if(v4 >= this.i) {
                        this.k = v4 - 1L;
                        Y1.e0(v4, ((byte)v3));
                    }
                }
                else {
                    if(v3 < 0x800) {
                        long v5 = this.k;
                        if(v5 > this.i) {
                            this.k = v5 - 1L;
                            Y1.e0(v5, ((byte)(v3 & 0x3F | 0x80)));
                            long v6 = this.k;
                            this.k = v6 - 1L;
                            Y1.e0(v6, ((byte)(v3 >>> 6 | 960)));
                            goto label_63;
                        }
                    }
                    if(v3 < 0xD800 || 0xDFFF < v3) {
                        long v7 = this.k;
                        if(v7 > this.i + 1L) {
                            this.k = v7 - 1L;
                            Y1.e0(v7, ((byte)(v3 & 0x3F | 0x80)));
                            long v8 = this.k;
                            this.k = v8 - 1L;
                            Y1.e0(v8, ((byte)(v3 >>> 6 & 0x3F | 0x80)));
                            long v9 = this.k;
                            this.k = v9 - 1L;
                            Y1.e0(v9, ((byte)(v3 >>> 12 | 480)));
                            goto label_63;
                        }
                    }
                    if(this.k > this.i + 2L) {
                        if(v != 0) {
                            int v10 = s.charAt(v - 1);
                            if(Character.isSurrogatePair(((char)v10), ((char)v3))) {
                                --v;
                                int v11 = Character.toCodePoint(((char)v10), ((char)v3));
                                long v12 = this.k;
                                this.k = v12 - 1L;
                                Y1.e0(v12, ((byte)(v11 & 0x3F | 0x80)));
                                long v13 = this.k;
                                this.k = v13 - 1L;
                                Y1.e0(v13, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                                long v14 = this.k;
                                this.k = v14 - 1L;
                                Y1.e0(v14, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                                long v15 = this.k;
                                this.k = v15 - 1L;
                                Y1.e0(v15, ((byte)(v11 >>> 18 | 0xF0)));
                                goto label_63;
                            }
                        }
                        throw new d(v - 1, v);
                    }
                    else {
                        this.E(v);
                        ++v;
                    }
                }
            label_63:
                --v;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void e0(int v, int v1) {
            this.j0(v << 3 | v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void f(int v, u u0) {
            try {
                u0.t0(this);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            this.E(10);
            this.j0(u0.size());
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void g(byte b) {
            long v = this.k;
            this.k = v - 1L;
            Y1.e0(v, b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void h(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.s0() < v) {
                this.q0(v);
            }
            this.k -= (long)v;
            this.h.position(this.m0() + 1);
            this.h.put(byteBuffer0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void i(byte[] arr_b, int v, int v1) {
            if(this.s0() < v1) {
                this.q0(v1);
            }
            this.k -= (long)v1;
            this.h.position(this.m0() + 1);
            this.h.put(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void j(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.s0() < v) {
                this.d += v;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.j(byteBuffer0);
                this.c.addFirst(d0);
                this.p0();
                return;
            }
            this.k -= (long)v;
            this.h.position(this.m0() + 1);
            this.h.put(byteBuffer0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void j0(int v) {
            if((v & 0xFFFFFF80) == 0) {
                this.v0(v);
                return;
            }
            if((v & 0xFFFFC000) == 0) {
                this.x0(v);
                return;
            }
            if((0xFFE00000 & v) == 0) {
                this.w0(v);
                return;
            }
            if((0xF0000000 & v) == 0) {
                this.u0(v);
                return;
            }
            this.t0(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void k(byte[] arr_b, int v, int v1) {
            if(this.s0() < v1) {
                this.d += v1;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.l(arr_b, v, v1);
                this.c.addFirst(d0);
                this.p0();
                return;
            }
            this.k -= (long)v1;
            this.h.position(this.m0() + 1);
            this.h.put(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void k0(long v) {
            switch(n.n(v)) {
                case 1: {
                    this.C0(v);
                    return;
                }
                case 2: {
                    this.H0(v);
                    return;
                }
                case 3: {
                    this.G0(v);
                    return;
                }
                case 4: {
                    this.A0(v);
                    return;
                }
                case 5: {
                    this.z0(v);
                    return;
                }
                case 6: {
                    this.E0(v);
                    return;
                }
                case 7: {
                    this.D0(v);
                    return;
                }
                case 8: {
                    this.y0(v);
                    return;
                }
                case 9: {
                    this.B0(v);
                    return;
                }
                case 10: {
                    this.F0(v);
                }
            }
        }

        // 去混淆评级： 低(20)
        static boolean l0() [...] // 潜在的解密器

        private int m0() {
            return (int)(this.k - this.i);
        }

        private int n0() {
            return (int)(this.j - this.k);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void o() {
            if(this.h != null) {
                this.d += this.n0();
                this.h.position(this.m0() + 1);
                this.h = null;
                this.k = 0L;
                this.j = 0L;
            }
        }

        // 去混淆评级： 低(20)
        private static boolean o0() [...] // 潜在的解密器

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        public int p() {
            return this.d + this.n0();
        }

        private void p0() {
            this.r0(this.s());
        }

        private void q0(int v) {
            this.r0(this.t(v));
        }

        private void r0(com.google.crypto.tink.shaded.protobuf.d d0) {
            if(!d0.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBuffer0 = d0.f();
            if(!byteBuffer0.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            this.o();
            this.c.addFirst(d0);
            this.h = byteBuffer0;
            byteBuffer0.limit(byteBuffer0.capacity());
            this.h.position(0);
            long v = Y1.k(this.h);
            this.i = v;
            long v1 = v + ((long)(this.h.limit() - 1));
            this.j = v1;
            this.k = v1;
        }

        private int s0() {
            return this.m0() + 1;
        }

        private void t0(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(v >>> 28)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(v >>> 21 & 0x7F | 0x80)));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(v >>> 14 & 0x7F | 0x80)));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(v & 0x7F | 0x80)));
        }

        private void u0(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(v >>> 21)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(v >>> 14 & 0x7F | 0x80)));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(v & 0x7F | 0x80)));
        }

        private void v0(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)v));
        }

        private void w0(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(v >>> 14)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(v & 0x7F | 0x80)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeBool(int v, boolean z) {
            this.E(6);
            this.g(((byte)z));
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeEndGroup(int v) {
            this.e0(v, 4);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed32(int v, int v1) {
            this.E(9);
            this.K(v1);
            this.e0(v, 5);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed64(int v, long v1) {
            this.E(13);
            this.N(v1);
            this.e0(v, 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeGroup(int v, Object object0) throws IOException {
            this.e0(v, 4);
            m1.a().k(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeInt32(int v, int v1) {
            this.E(15);
            this.S(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeMessage(int v, Object object0) throws IOException {
            int v1 = this.p();
            m1.a().k(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt32(int v, int v1) {
            this.E(10);
            this.X(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt64(int v, long v1) {
            this.E(15);
            this.a0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        @Deprecated
        public void writeStartGroup(int v) {
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeString(int v, String s) {
            int v1 = this.p();
            this.d0(s);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt32(int v, int v1) {
            this.E(10);
            this.j0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt64(int v, long v1) {
            this.E(15);
            this.k0(v1);
            this.e0(v, 0);
        }

        private void x0(int v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(v >>> 7)));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(v & 0x7F | 0x80)));
        }

        private void y0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 49)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v6 = this.k;
            this.k = v6 - 1L;
            Y1.e0(v6, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v7 = this.k;
            this.k = v7 - 1L;
            Y1.e0(v7, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v8 = this.k;
            this.k = v8 - 1L;
            Y1.e0(v8, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void z0(long v) {
            long v1 = this.k;
            this.k = v1 - 1L;
            Y1.e0(v1, ((byte)(((int)(v >>> 28)))));
            long v2 = this.k;
            this.k = v2 - 1L;
            Y1.e0(v2, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v3 = this.k;
            this.k = v3 - 1L;
            Y1.e0(v3, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v4 = this.k;
            this.k = v4 - 1L;
            Y1.e0(v4, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v5 = this.k;
            this.k = v5 - 1L;
            Y1.e0(v5, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }
    }

    static final class e extends n {
        private com.google.crypto.tink.shaded.protobuf.d h;
        private byte[] i;
        private long j;
        private long k;
        private long l;
        private long m;
        private long n;

        e(r r0, int v) {
            super(r0, v, null);
            this.o0();
        }

        private void A0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 56)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 49 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v7 = this.n;
            this.n = v7 - 1L;
            Y1.g0(this.i, v7, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v8 = this.n;
            this.n = v8 - 1L;
            Y1.g0(this.i, v8, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v9 = this.n;
            this.n = v9 - 1L;
            Y1.g0(this.i, v9, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void B0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)v))));
        }

        private void C0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 42)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v7 = this.n;
            this.n = v7 - 1L;
            Y1.g0(this.i, v7, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void D0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 35)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void E(int v) {
            if(this.r0() < v) {
                this.p0(v);
            }
        }

        private void E0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 0x3F)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 56 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 49 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v7 = this.n;
            this.n = v7 - 1L;
            Y1.g0(this.i, v7, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v8 = this.n;
            this.n = v8 - 1L;
            Y1.g0(this.i, v8, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v9 = this.n;
            this.n = v9 - 1L;
            Y1.g0(this.i, v9, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v10 = this.n;
            this.n = v10 - 1L;
            Y1.g0(this.i, v10, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void F(boolean z) {
            this.g(((byte)z));
        }

        private void F0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)v) >>> 14)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void G0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 7)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)v) & 0x7F | 0x80)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void K(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(v >> 24 & 0xFF)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(v >> 16 & 0xFF)));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(v >> 8 & 0xFF)));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(v & 0xFF)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void N(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >> 56)) & 0xFF)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >> 0x30)) & 0xFF)));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >> 40)) & 0xFF)));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >> 0x20)) & 0xFF)));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >> 24)) & 0xFF)));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v >> 16)) & 0xFF)));
            long v7 = this.n;
            this.n = v7 - 1L;
            Y1.g0(this.i, v7, ((byte)(((int)(v >> 8)) & 0xFF)));
            long v8 = this.n;
            this.n = v8 - 1L;
            Y1.g0(this.i, v8, ((byte)(((int)v) & 0xFF)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void S(int v) {
            if(v >= 0) {
                this.j0(v);
                return;
            }
            this.k0(((long)v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void X(int v) {
            this.j0(v >> 0x1F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void a0(long v) {
            this.k0(v >> 0x3F ^ v << 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void b(int v, Object object0, t1 t10) throws IOException {
            this.e0(v, 4);
            t10.c(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void d(int v, Object object0, t1 t10) throws IOException {
            int v1 = this.p();
            t10.c(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void d0(String s) {
            this.E(s.length());
            int v;
            for(v = s.length() - 1; v >= 0; --v) {
                int v1 = s.charAt(v);
                if(v1 >= 0x80) {
                    break;
                }
                long v2 = this.n;
                this.n = v2 - 1L;
                Y1.g0(this.i, v2, ((byte)v1));
            }
            if(v == -1) {
                return;
            }
            while(v >= 0) {
                int v3 = s.charAt(v);
                if(v3 < 0x80) {
                    long v4 = this.n;
                    if(v4 > this.l) {
                        this.n = v4 - 1L;
                        Y1.g0(this.i, v4, ((byte)v3));
                    }
                }
                else {
                    if(v3 < 0x800) {
                        long v5 = this.n;
                        if(v5 > this.j) {
                            this.n = v5 - 1L;
                            Y1.g0(this.i, v5, ((byte)(v3 & 0x3F | 0x80)));
                            long v6 = this.n;
                            this.n = v6 - 1L;
                            Y1.g0(this.i, v6, ((byte)(v3 >>> 6 | 960)));
                            goto label_63;
                        }
                    }
                    if(v3 < 0xD800 || 0xDFFF < v3) {
                        long v7 = this.n;
                        if(v7 > this.j + 1L) {
                            this.n = v7 - 1L;
                            Y1.g0(this.i, v7, ((byte)(v3 & 0x3F | 0x80)));
                            long v8 = this.n;
                            this.n = v8 - 1L;
                            Y1.g0(this.i, v8, ((byte)(v3 >>> 6 & 0x3F | 0x80)));
                            long v9 = this.n;
                            this.n = v9 - 1L;
                            Y1.g0(this.i, v9, ((byte)(v3 >>> 12 | 480)));
                            goto label_63;
                        }
                    }
                    if(this.n > this.j + 2L) {
                        if(v != 0) {
                            int v10 = s.charAt(v - 1);
                            if(Character.isSurrogatePair(((char)v10), ((char)v3))) {
                                --v;
                                int v11 = Character.toCodePoint(((char)v10), ((char)v3));
                                long v12 = this.n;
                                this.n = v12 - 1L;
                                Y1.g0(this.i, v12, ((byte)(v11 & 0x3F | 0x80)));
                                long v13 = this.n;
                                this.n = v13 - 1L;
                                Y1.g0(this.i, v13, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                                long v14 = this.n;
                                this.n = v14 - 1L;
                                Y1.g0(this.i, v14, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                                long v15 = this.n;
                                this.n = v15 - 1L;
                                Y1.g0(this.i, v15, ((byte)(v11 >>> 18 | 0xF0)));
                                goto label_63;
                            }
                        }
                        throw new d(v - 1, v);
                    }
                    else {
                        this.E(v);
                        ++v;
                    }
                }
            label_63:
                --v;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void e0(int v, int v1) {
            this.j0(v << 3 | v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void f(int v, u u0) {
            try {
                u0.t0(this);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            this.E(10);
            this.j0(u0.size());
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void g(byte b) {
            long v = this.n;
            this.n = v - 1L;
            Y1.g0(this.i, v, b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void h(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            this.E(v);
            this.n -= (long)v;
            byteBuffer0.get(this.i, this.l0() + 1, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void i(byte[] arr_b, int v, int v1) {
            if(v < 0 || v + v1 > arr_b.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
            }
            this.E(v1);
            this.n -= (long)v1;
            System.arraycopy(arr_b, v, this.i, this.l0() + 1, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void j(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            if(this.r0() < v) {
                this.d += v;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.j(byteBuffer0);
                this.c.addFirst(d0);
                this.o0();
            }
            this.n -= (long)v;
            byteBuffer0.get(this.i, this.l0() + 1, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void j0(int v) {
            if((v & 0xFFFFFF80) == 0) {
                this.u0(v);
                return;
            }
            if((v & 0xFFFFC000) == 0) {
                this.w0(v);
                return;
            }
            if((0xFFE00000 & v) == 0) {
                this.v0(v);
                return;
            }
            if((0xF0000000 & v) == 0) {
                this.t0(v);
                return;
            }
            this.s0(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t
        public void k(byte[] arr_b, int v, int v1) {
            if(v < 0 || v + v1 > arr_b.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
            }
            if(this.r0() < v1) {
                this.d += v1;
                com.google.crypto.tink.shaded.protobuf.d d0 = com.google.crypto.tink.shaded.protobuf.d.l(arr_b, v, v1);
                this.c.addFirst(d0);
                this.o0();
                return;
            }
            this.n -= (long)v1;
            System.arraycopy(arr_b, v, this.i, this.l0() + 1, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void k0(long v) {
            switch(n.n(v)) {
                case 1: {
                    this.B0(v);
                    return;
                }
                case 2: {
                    this.G0(v);
                    return;
                }
                case 3: {
                    this.F0(v);
                    return;
                }
                case 4: {
                    this.z0(v);
                    return;
                }
                case 5: {
                    this.y0(v);
                    return;
                }
                case 6: {
                    this.D0(v);
                    return;
                }
                case 7: {
                    this.C0(v);
                    return;
                }
                case 8: {
                    this.x0(v);
                    return;
                }
                case 9: {
                    this.A0(v);
                    return;
                }
                case 10: {
                    this.E0(v);
                }
            }
        }

        private int l0() {
            return (int)this.n;
        }

        int m0() {
            return (int)(this.m - this.n);
        }

        // 去混淆评级： 低(20)
        static boolean n0() [...] // 潜在的解密器

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        void o() {
            if(this.h != null) {
                this.d += this.m0();
                this.h.h(this.l0() - this.h.b() + 1);
                this.h = null;
                this.n = 0L;
                this.m = 0L;
            }
        }

        private void o0() {
            this.q0(this.w());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.n
        public int p() {
            return this.d + this.m0();
        }

        private void p0(int v) {
            this.q0(this.x(v));
        }

        private void q0(com.google.crypto.tink.shaded.protobuf.d d0) {
            if(!d0.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            this.o();
            this.c.addFirst(d0);
            this.h = d0;
            this.i = d0.a();
            long v = (long)d0.b();
            this.k = ((long)d0.e()) + v;
            long v1 = v + ((long)d0.g());
            this.j = v1;
            this.l = v1 - 1L;
            this.m = this.k - 1L;
            this.n = this.k - 1L;
        }

        int r0() {
            return (int)(this.n - this.l);
        }

        private void s0(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(v >>> 28)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(v >>> 21 & 0x7F | 0x80)));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(v >>> 14 & 0x7F | 0x80)));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(v & 0x7F | 0x80)));
        }

        private void t0(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(v >>> 21)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(v >>> 14 & 0x7F | 0x80)));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(v & 0x7F | 0x80)));
        }

        private void u0(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)v));
        }

        private void v0(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(v >>> 14)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(v >>> 7 & 0x7F | 0x80)));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(v & 0x7F | 0x80)));
        }

        private void w0(int v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(v >>> 7)));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(v & 0x7F | 0x80)));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeBool(int v, boolean z) {
            this.E(6);
            this.g(((byte)z));
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeEndGroup(int v) {
            this.e0(v, 4);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed32(int v, int v1) {
            this.E(9);
            this.K(v1);
            this.e0(v, 5);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeFixed64(int v, long v1) {
            this.E(13);
            this.N(v1);
            this.e0(v, 1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeGroup(int v, Object object0) throws IOException {
            this.e0(v, 4);
            m1.a().k(object0, this);
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeInt32(int v, int v1) {
            this.E(15);
            this.S(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeMessage(int v, Object object0) throws IOException {
            int v1 = this.p();
            m1.a().k(object0, this);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt32(int v, int v1) {
            this.E(10);
            this.X(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeSInt64(int v, long v1) {
            this.E(15);
            this.a0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeStartGroup(int v) {
            this.e0(v, 3);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeString(int v, String s) {
            int v1 = this.p();
            this.d0(s);
            int v2 = this.p();
            this.E(10);
            this.j0(v2 - v1);
            this.e0(v, 2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt32(int v, int v1) {
            this.E(10);
            this.j0(v1);
            this.e0(v, 0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.e2
        public void writeUInt64(int v, long v1) {
            this.E(15);
            this.k0(v1);
            this.e0(v, 0);
        }

        private void x0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 49)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 42 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 35 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 28 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v6 = this.n;
            this.n = v6 - 1L;
            Y1.g0(this.i, v6, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v7 = this.n;
            this.n = v7 - 1L;
            Y1.g0(this.i, v7, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v8 = this.n;
            this.n = v8 - 1L;
            Y1.g0(this.i, v8, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void y0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 28)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 21 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v5 = this.n;
            this.n = v5 - 1L;
            Y1.g0(this.i, v5, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }

        private void z0(long v) {
            long v1 = this.n;
            this.n = v1 - 1L;
            Y1.g0(this.i, v1, ((byte)(((int)(v >>> 21)))));
            long v2 = this.n;
            this.n = v2 - 1L;
            Y1.g0(this.i, v2, ((byte)(((int)(v >>> 14 & 0x7FL | 0x80L)))));
            long v3 = this.n;
            this.n = v3 - 1L;
            Y1.g0(this.i, v3, ((byte)(((int)(v >>> 7 & 0x7FL | 0x80L)))));
            long v4 = this.n;
            this.n = v4 - 1L;
            Y1.g0(this.i, v4, ((byte)(((int)(v & 0x7FL | 0x80L)))));
        }
    }

    private final r a;
    private final int b;
    final ArrayDeque c;
    int d;
    public static final int e = 0x1000;
    private static final int f = 1;
    private static final int g = 2;

    private n(r r0, int v) {
        this.c = new ArrayDeque(4);
        if(v <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.a = (r)t0.e(r0, "alloc");
        this.b = v;
    }

    n(r r0, int v, a n$a0) {
        this(r0, v);
    }

    static n A(r r0, int v) {
        return new com.google.crypto.tink.shaded.protobuf.n.b(r0, v);
    }

    static n B(r r0, int v) {
        return new c(r0, v);
    }

    // 去混淆评级： 低(30)
    static n C(r r0, int v) {
        return new com.google.crypto.tink.shaded.protobuf.n.d(r0, v);
    }

    // 去混淆评级： 低(30)
    static n D(r r0, int v) {
        return new e(r0, v);
    }

    abstract void E(int arg1);

    abstract void F(boolean arg1);

    private final void G(int v, q q0, boolean z) throws IOException {
        if(z) {
            this.E(q0.size() + 10);
            int v1 = this.p();
            for(int v2 = q0.size() - 1; v2 >= 0; --v2) {
                this.F(q0.getBoolean(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = q0.size() - 1; v3 >= 0; --v3) {
            this.writeBool(v, q0.getBoolean(v3));
        }
    }

    private final void H(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.F(((Boolean)list0.get(v2)).booleanValue());
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeBool(v, ((Boolean)list0.get(v3)).booleanValue());
        }
    }

    private final void I(int v, E e0, boolean z) throws IOException {
        if(z) {
            this.E(e0.size() * 8 + 10);
            int v1 = this.p();
            for(int v2 = e0.size() - 1; v2 >= 0; --v2) {
                this.N(Double.doubleToRawLongBits(e0.getDouble(v2)));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = e0.size() - 1; v3 >= 0; --v3) {
            this.writeDouble(v, e0.getDouble(v3));
        }
    }

    private final void J(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 8 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.N(Double.doubleToRawLongBits(((double)(((Double)list0.get(v2))))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeDouble(v, ((double)(((Double)list0.get(v3)))));
        }
    }

    abstract void K(int arg1);

    private final void L(int v, r0 r00, boolean z) throws IOException {
        if(z) {
            this.E(r00.size() * 4 + 10);
            int v1 = this.p();
            for(int v2 = r00.size() - 1; v2 >= 0; --v2) {
                this.K(r00.getInt(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = r00.size() - 1; v3 >= 0; --v3) {
            this.writeFixed32(v, r00.getInt(v3));
        }
    }

    private final void M(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 4 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.K(((int)(((Integer)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeFixed32(v, ((int)(((Integer)list0.get(v3)))));
        }
    }

    abstract void N(long arg1);

    private final void O(int v, I0 i00, boolean z) throws IOException {
        if(z) {
            this.E(i00.size() * 8 + 10);
            int v1 = this.p();
            for(int v2 = i00.size() - 1; v2 >= 0; --v2) {
                this.N(i00.getLong(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = i00.size() - 1; v3 >= 0; --v3) {
            this.writeFixed64(v, i00.getLong(v3));
        }
    }

    private final void P(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 8 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.N(((long)(((Long)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeFixed64(v, ((long)(((Long)list0.get(v3)))));
        }
    }

    private final void Q(int v, h0 h00, boolean z) throws IOException {
        if(z) {
            this.E(h00.size() * 4 + 10);
            int v1 = this.p();
            for(int v2 = h00.size() - 1; v2 >= 0; --v2) {
                this.K(Float.floatToRawIntBits(h00.getFloat(v2)));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = h00.size() - 1; v3 >= 0; --v3) {
            this.writeFloat(v, h00.getFloat(v3));
        }
    }

    private final void R(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 4 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.K(Float.floatToRawIntBits(((float)(((Float)list0.get(v2))))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeFloat(v, ((float)(((Float)list0.get(v3)))));
        }
    }

    abstract void S(int arg1);

    private final void T(int v, r0 r00, boolean z) throws IOException {
        if(z) {
            this.E(r00.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = r00.size() - 1; v2 >= 0; --v2) {
                this.S(r00.getInt(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = r00.size() - 1; v3 >= 0; --v3) {
            this.writeInt32(v, r00.getInt(v3));
        }
    }

    private final void U(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.S(((int)(((Integer)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeInt32(v, ((int)(((Integer)list0.get(v3)))));
        }
    }

    private void V(int v, Object object0) throws IOException {
        if(object0 instanceof String) {
            this.writeString(v, ((String)object0));
            return;
        }
        this.f(v, ((u)object0));
    }

    static final void W(e2 e20, int v, b c2$b0, Object object0) throws IOException {
        switch(c2$b0) {
            case 1: {
                e20.writeBool(v, ((Boolean)object0).booleanValue());
                return;
            }
            case 2: {
                e20.writeFixed32(v, ((int)(((Integer)object0))));
                return;
            }
            case 3: {
                e20.writeFixed64(v, ((long)(((Long)object0))));
                return;
            }
            case 4: {
                e20.writeInt32(v, ((int)(((Integer)object0))));
                return;
            }
            case 5: {
                e20.writeInt64(v, ((long)(((Long)object0))));
                return;
            }
            case 6: {
                e20.writeSFixed32(v, ((int)(((Integer)object0))));
                return;
            }
            case 7: {
                e20.writeSFixed64(v, ((long)(((Long)object0))));
                return;
            }
            case 8: {
                e20.writeSInt32(v, ((int)(((Integer)object0))));
                return;
            }
            case 9: {
                e20.writeSInt64(v, ((long)(((Long)object0))));
                return;
            }
            case 10: {
                e20.writeString(v, ((String)object0));
                return;
            }
            case 11: {
                e20.writeUInt32(v, ((int)(((Integer)object0))));
                return;
            }
            case 12: {
                e20.writeUInt64(v, ((long)(((Long)object0))));
                return;
            }
            case 13: {
                e20.writeFloat(v, ((float)(((Float)object0))));
                return;
            }
            case 14: {
                e20.writeDouble(v, ((double)(((Double)object0))));
                return;
            }
            case 15: {
                e20.writeMessage(v, object0);
                return;
            }
            case 16: {
                e20.f(v, ((u)object0));
                return;
            }
            case 17: {
                if(object0 instanceof com.google.crypto.tink.shaded.protobuf.t0.c) {
                    e20.writeEnum(v, ((com.google.crypto.tink.shaded.protobuf.t0.c)object0).getNumber());
                    return;
                }
                if(!(object0 instanceof Integer)) {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
                e20.writeEnum(v, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new IllegalArgumentException("Unsupported map value type for: " + c2$b0);
            }
        }
    }

    abstract void X(int arg1);

    private final void Y(int v, r0 r00, boolean z) throws IOException {
        if(z) {
            this.E(r00.size() * 5 + 10);
            int v1 = this.p();
            for(int v2 = r00.size() - 1; v2 >= 0; --v2) {
                this.X(r00.getInt(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = r00.size() - 1; v3 >= 0; --v3) {
            this.writeSInt32(v, r00.getInt(v3));
        }
    }

    private final void Z(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 5 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.X(((int)(((Integer)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeSInt32(v, ((int)(((Integer)list0.get(v3)))));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public void a(int v, com.google.crypto.tink.shaded.protobuf.K0.b k0$b0, Map map0) throws IOException {
        for(Object object0: map0.entrySet()) {
            int v1 = this.p();
            Object object1 = ((Map.Entry)object0).getValue();
            n.W(this, 2, k0$b0.c, object1);
            Object object2 = ((Map.Entry)object0).getKey();
            n.W(this, 1, k0$b0.a, object2);
            this.j0(this.p() - v1);
            this.e0(v, 2);
        }
    }

    abstract void a0(long arg1);

    private final void b0(int v, I0 i00, boolean z) throws IOException {
        if(z) {
            this.E(i00.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = i00.size() - 1; v2 >= 0; --v2) {
                this.a0(i00.getLong(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = i00.size() - 1; v3 >= 0; --v3) {
            this.writeSInt64(v, i00.getLong(v3));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void c(int v, List list0, t1 t10) throws IOException {
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            this.d(v, list0.get(v1), t10);
        }
    }

    private final void c0(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.a0(((long)(((Long)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeSInt64(v, ((long)(((Long)list0.get(v3)))));
        }
    }

    abstract void d0(String arg1);

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    @Deprecated
    public final void e(int v, List list0, t1 t10) throws IOException {
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            this.b(v, list0.get(v1), t10);
        }
    }

    abstract void e0(int arg1, int arg2);

    private final void f0(int v, r0 r00, boolean z) throws IOException {
        if(z) {
            this.E(r00.size() * 5 + 10);
            int v1 = this.p();
            for(int v2 = r00.size() - 1; v2 >= 0; --v2) {
                this.j0(r00.getInt(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = r00.size() - 1; v3 >= 0; --v3) {
            this.writeUInt32(v, r00.getInt(v3));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final com.google.crypto.tink.shaded.protobuf.e2.a fieldOrder() {
        return com.google.crypto.tink.shaded.protobuf.e2.a.b;
    }

    private final void g0(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 5 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.j0(((int)(((Integer)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeUInt32(v, ((int)(((Integer)list0.get(v3)))));
        }
    }

    private final void h0(int v, I0 i00, boolean z) throws IOException {
        if(z) {
            this.E(i00.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = i00.size() - 1; v2 >= 0; --v2) {
                this.k0(i00.getLong(v2));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = i00.size() - 1; v3 >= 0; --v3) {
            this.writeUInt64(v, i00.getLong(v3));
        }
    }

    private final void i0(int v, List list0, boolean z) throws IOException {
        if(z) {
            this.E(list0.size() * 10 + 10);
            int v1 = this.p();
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                this.k0(((long)(((Long)list0.get(v2)))));
            }
            this.j0(this.p() - v1);
            this.e0(v, 2);
            return;
        }
        for(int v3 = list0.size() - 1; v3 >= 0; --v3) {
            this.writeUInt64(v, ((long)(((Long)list0.get(v3)))));
        }
    }

    abstract void j0(int arg1);

    abstract void k0(long arg1);

    @x
    public final Queue m() {
        this.o();
        return this.c;
    }

    private static byte n(long v) {
        byte b;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            b = 2;
        }
        else {
            b = 6;
            v >>>= 28;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            b = (byte)(b + 2);
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? b : ((byte)(b + 1));
    }

    abstract void o();

    public abstract int p();

    // 去混淆评级： 低(20)
    static boolean q() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static boolean r() [...] // 潜在的解密器

    final com.google.crypto.tink.shaded.protobuf.d s() {
        return this.a.a(this.b);
    }

    final com.google.crypto.tink.shaded.protobuf.d t(int v) {
        return this.a.a(Math.max(v, this.b));
    }

    public static n u(r r0) {
        return n.v(r0, 0x1000);
    }

    // 去混淆评级： 低(30)
    public static n v(r r0, int v) {
        return n.C(r0, v);
    }

    final com.google.crypto.tink.shaded.protobuf.d w() {
        return this.a.b(this.b);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeBoolList(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof q) {
            this.G(v, ((q)list0), z);
            return;
        }
        this.H(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeBytesList(int v, List list0) throws IOException {
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            this.f(v, ((u)list0.get(v1)));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeDouble(int v, double f) throws IOException {
        this.writeFixed64(v, Double.doubleToRawLongBits(f));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeDoubleList(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof E) {
            this.I(v, ((E)list0), z);
            return;
        }
        this.J(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeEnum(int v, int v1) throws IOException {
        this.writeInt32(v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeEnumList(int v, List list0, boolean z) throws IOException {
        this.writeInt32List(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeFixed32List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof r0) {
            this.L(v, ((r0)list0), z);
            return;
        }
        this.M(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeFixed64List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof I0) {
            this.O(v, ((I0)list0), z);
            return;
        }
        this.P(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeFloat(int v, float f) throws IOException {
        this.writeFixed32(v, Float.floatToRawIntBits(f));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeFloatList(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof h0) {
            this.Q(v, ((h0)list0), z);
            return;
        }
        this.R(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    @Deprecated
    public final void writeGroupList(int v, List list0) throws IOException {
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            this.writeGroup(v, list0.get(v1));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeInt32List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof r0) {
            this.T(v, ((r0)list0), z);
            return;
        }
        this.U(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeInt64(int v, long v1) throws IOException {
        this.writeUInt64(v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeInt64List(int v, List list0, boolean z) throws IOException {
        this.writeUInt64List(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeMessageList(int v, List list0) throws IOException {
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            this.writeMessage(v, list0.get(v1));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeMessageSetItem(int v, Object object0) throws IOException {
        this.e0(1, 4);
        if(object0 instanceof u) {
            this.f(3, ((u)object0));
        }
        else {
            this.writeMessage(3, object0);
        }
        this.writeUInt32(2, v);
        this.e0(1, 3);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSFixed32(int v, int v1) throws IOException {
        this.writeFixed32(v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSFixed32List(int v, List list0, boolean z) throws IOException {
        this.writeFixed32List(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSFixed64(int v, long v1) throws IOException {
        this.writeFixed64(v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSFixed64List(int v, List list0, boolean z) throws IOException {
        this.writeFixed64List(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSInt32List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof r0) {
            this.Y(v, ((r0)list0), z);
            return;
        }
        this.Z(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeSInt64List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof I0) {
            this.b0(v, ((I0)list0), z);
            return;
        }
        this.c0(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeStringList(int v, List list0) throws IOException {
        if(list0 instanceof E0) {
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                this.V(v, ((E0)list0).getRaw(v1));
            }
            return;
        }
        for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
            this.writeString(v, ((String)list0.get(v2)));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeUInt32List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof r0) {
            this.f0(v, ((r0)list0), z);
            return;
        }
        this.g0(v, list0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.e2
    public final void writeUInt64List(int v, List list0, boolean z) throws IOException {
        if(list0 instanceof I0) {
            this.h0(v, ((I0)list0), z);
            return;
        }
        this.i0(v, list0, z);
    }

    final com.google.crypto.tink.shaded.protobuf.d x(int v) {
        return this.a.b(Math.max(v, this.b));
    }

    public static n y(r r0) {
        return n.z(r0, 0x1000);
    }

    // 去混淆评级： 低(30)
    public static n z(r r0, int v) {
        return n.D(r0, v);
    }
}

