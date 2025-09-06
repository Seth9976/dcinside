package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class s1 extends u {
    static class b {
        private final ArrayDeque a;

        private b() {
            this.a = new ArrayDeque();
        }

        b(a s1$a0) {
        }

        private u b(u u0, u u1) {
            this.c(u0);
            this.c(u1);
            u u2;
            for(u2 = (u)this.a.pop(); !this.a.isEmpty(); u2 = new s1(((u)this.a.pop()), u2, null)) {
            }
            return u2;
        }

        private void c(u u0) {
            if(u0.H()) {
                this.e(u0);
                return;
            }
            if(!(u0 instanceof s1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + u0.getClass());
            }
            this.c(((s1)u0).j);
            this.c(((s1)u0).k);
        }

        private int d(int v) {
            int v1 = Arrays.binarySearch(s1.n, v);
            return v1 >= 0 ? v1 : -(v1 + 1) - 1;
        }

        private void e(u u0) {
            int v = this.d(u0.size());
            int v1 = s1.A0(v + 1);
            if(!this.a.isEmpty() && ((u)this.a.peek()).size() < v1) {
                int v2 = s1.A0(v);
                u u1;
                for(u1 = (u)this.a.pop(); !this.a.isEmpty() && ((u)this.a.peek()).size() < v2; u1 = new s1(((u)this.a.pop()), u1, null)) {
                }
                s1 s10;
                for(s10 = new s1(u1, u0, null); !this.a.isEmpty(); s10 = new s1(((u)this.a.pop()), s10, null)) {
                    int v3 = s1.A0(this.d(s10.size()) + 1);
                    if(((u)this.a.peek()).size() >= v3) {
                        break;
                    }
                }
                this.a.push(s10);
                return;
            }
            this.a.push(u0);
        }
    }

    static final class c implements Iterator {
        private final ArrayDeque a;
        private i b;

        private c(u u0) {
            if(u0 instanceof s1) {
                ArrayDeque arrayDeque0 = new ArrayDeque(((s1)u0).E());
                this.a = arrayDeque0;
                arrayDeque0.push(((s1)u0));
                this.b = this.a(((s1)u0).j);
                return;
            }
            this.a = null;
            this.b = (i)u0;
        }

        c(u u0, a s1$a0) {
            this(u0);
        }

        private i a(u u0) {
            while(u0 instanceof s1) {
                this.a.push(((s1)u0));
                u0 = ((s1)u0).j;
            }
            return (i)u0;
        }

        private i b() {
            while(this.a != null && !this.a.isEmpty()) {
                i u$i0 = this.a(((s1)this.a.pop()).k);
                if(!u$i0.isEmpty()) {
                    return u$i0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        public i c() {
            i u$i0 = this.b;
            if(u$i0 == null) {
                throw new NoSuchElementException();
            }
            this.b = this.b();
            return u$i0;
        }

        @Override
        public boolean hasNext() {
            return this.b != null;
        }

        @Override
        public Object next() {
            return this.c();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class d extends InputStream {
        private c a;
        private i b;
        private int c;
        private int d;
        private int e;
        private int f;
        final s1 g;

        public d() {
            this.c();
        }

        private void a() {
            if(this.b != null) {
                int v = this.c;
                if(this.d == v) {
                    this.e += v;
                    this.d = 0;
                    if(this.a.hasNext()) {
                        i u$i0 = this.a.c();
                        this.b = u$i0;
                        this.c = u$i0.size();
                        return;
                    }
                    this.b = null;
                    this.c = 0;
                }
            }
        }

        @Override
        public int available() throws IOException {
            return this.b();
        }

        private int b() {
            return s1.this.size() - (this.e + this.d);
        }

        private void c() {
            c s1$c0 = new c(s1.this, null);
            this.a = s1$c0;
            i u$i0 = s1$c0.c();
            this.b = u$i0;
            this.c = u$i0.size();
            this.d = 0;
            this.e = 0;
        }

        private int e(byte[] arr_b, int v, int v1) {
            int v2;
            for(v2 = v1; v2 > 0; v2 -= v3) {
                this.a();
                if(this.b == null) {
                    break;
                }
                int v3 = Math.min(this.c - this.d, v2);
                if(arr_b != null) {
                    this.b.y(arr_b, this.d, v, v3);
                    v += v3;
                }
                this.d += v3;
            }
            return v1 - v2;
        }

        @Override
        public void mark(int v) {
            this.f = this.e + this.d;
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() throws IOException {
            this.a();
            i u$i0 = this.b;
            if(u$i0 == null) {
                return -1;
            }
            int v = this.d;
            this.d = v + 1;
            return u$i0.g(v) & 0xFF;
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) {
            arr_b.getClass();
            if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
                throw new IndexOutOfBoundsException();
            }
            int v2 = this.e(arr_b, v, v1);
            return v2 != 0 || v1 <= 0 && this.b() != 0 ? v2 : -1;
        }

        @Override
        public void reset() {
            synchronized(this) {
                this.c();
                this.e(null, 0, this.f);
            }
        }

        @Override
        public long skip(long v) {
            if(v < 0L) {
                throw new IndexOutOfBoundsException();
            }
            if(v > 0x7FFFFFFFL) {
                v = 0x7FFFFFFFL;
            }
            return (long)this.e(null, 0, ((int)v));
        }
    }

    private final int i;
    private final u j;
    private final u k;
    private final int l;
    private final int m;
    static final int[] n = null;
    private static final long o = 1L;

    static {
        s1.n = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    private s1(u u0, u u1) {
        this.j = u0;
        this.k = u1;
        int v = u0.size();
        this.l = v;
        this.i = v + u1.size();
        this.m = Math.max(u0.E(), u1.E()) + 1;
    }

    s1(u u0, u u1, a s1$a0) {
        this(u0, u1);
    }

    static int A0(int v) {
        return v < s1.n.length ? s1.n[v] : 0x7FFFFFFF;
    }

    static s1 B0(u u0, u u1) {
        return new s1(u0, u1);
    }

    private void C0(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    Object D0() {
        return u.n0(this.a0());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected int E() {
        return this.m;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    byte G(int v) {
        return v >= this.l ? this.k.G(v - this.l) : this.j.G(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected boolean H() {
        int v = s1.A0(this.m);
        return this.i >= v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public boolean I() {
        int v = this.j.R(0, 0, this.l);
        return this.k.R(v, 0, this.k.size()) == 0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public g J() {
        class a extends com.google.crypto.tink.shaded.protobuf.u.c {
            final c a;
            g b;
            final s1 c;

            a() {
                this.a = new c(s10, null);
                this.b = this.b();
            }

            // 去混淆评级： 低(20)
            private g b() {
                return this.a.hasNext() ? this.a.c().J() : null;
            }

            @Override
            public boolean hasNext() {
                return this.b != null;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.u$g
            public byte nextByte() {
                g u$g0 = this.b;
                if(u$g0 == null) {
                    throw new NoSuchElementException();
                }
                byte b = u$g0.nextByte();
                if(!this.b.hasNext()) {
                    this.b = this.b();
                }
                return b;
            }
        }

        return new a(this);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public z M() {
        return z.n(this.c(), true);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public InputStream N() {
        return new d(this);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected int Q(int v, int v1, int v2) {
        int v3 = this.l;
        if(v1 + v2 <= v3) {
            return this.j.Q(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.k.Q(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.j.Q(v, v1, v4);
        return this.k.Q(v5, 0, v2 - v4);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected int R(int v, int v1, int v2) {
        int v3 = this.l;
        if(v1 + v2 <= v3) {
            return this.j.R(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.k.R(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.j.R(v, v1, v4);
        return this.k.R(v5, 0, v2 - v4);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public u Z(int v, int v1) {
        int v2 = u.i(v, v1, this.i);
        if(v2 == 0) {
            return u.e;
        }
        if(v2 == this.i) {
            return this;
        }
        int v3 = this.l;
        if(v1 <= v3) {
            return this.j.Z(v, v1);
        }
        return v >= v3 ? this.k.Z(v - v3, v1 - v3) : new s1(this.j.Y(v), this.k.Z(0, v1 - this.l));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public ByteBuffer b() {
        return ByteBuffer.wrap(this.a0()).asReadOnlyBuffer();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public List c() {
        List list0 = new ArrayList();
        c s1$c0 = new c(this, null);
        while(s1$c0.hasNext()) {
            list0.add(s1$c0.c().b());
        }
        return list0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        if(this.i != ((u)object0).size()) {
            return false;
        }
        if(this.i == 0) {
            return true;
        }
        int v = this.S();
        int v1 = ((u)object0).S();
        return v == 0 || v1 == 0 || v == v1 ? this.z0(((u)object0)) : false;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public byte g(int v) {
        u.h(v, this.i);
        return this.G(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected String h0(Charset charset0) {
        return new String(this.a0(), charset0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public Iterator iterator() {
        return this.J();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    void p0(t t0) throws IOException {
        this.j.p0(t0);
        this.k.p0(t0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public void q0(OutputStream outputStream0) throws IOException {
        this.j.q0(outputStream0);
        this.k.q0(outputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    void s0(OutputStream outputStream0, int v, int v1) throws IOException {
        int v2 = this.l;
        if(v + v1 <= v2) {
            this.j.s0(outputStream0, v, v1);
            return;
        }
        if(v >= v2) {
            this.k.s0(outputStream0, v - v2, v1);
            return;
        }
        int v3 = v2 - v;
        this.j.s0(outputStream0, v, v3);
        this.k.s0(outputStream0, 0, v1 - v3);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public int size() {
        return this.i;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    void t0(t t0) throws IOException {
        this.k.t0(t0);
        this.j.t0(t0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public void u(ByteBuffer byteBuffer0) {
        this.j.u(byteBuffer0);
        this.k.u(byteBuffer0);
    }

    static u w0(u u0, u u1) {
        if(u1.size() == 0) {
            return u0;
        }
        if(u0.size() == 0) {
            return u1;
        }
        int v = u0.size() + u1.size();
        if(v < 0x80) {
            return s1.y0(u0, u1);
        }
        if(u0 instanceof s1) {
            if(((s1)u0).k.size() + u1.size() < 0x80) {
                u u2 = s1.y0(((s1)u0).k, u1);
                return new s1(((s1)u0).j, u2);
            }
            if(((s1)u0).j.E() > ((s1)u0).k.E() && ((s1)u0).E() > u1.E()) {
                s1 s10 = new s1(((s1)u0).k, u1);
                return new s1(((s1)u0).j, s10);
            }
        }
        return v >= s1.A0(Math.max(u0.E(), u1.E()) + 1) ? new s1(u0, u1) : new b(null).b(u0, u1);
    }

    private static u y0(u u0, u u1) {
        int v = u0.size();
        int v1 = u1.size();
        byte[] arr_b = new byte[v + v1];
        u0.y(arr_b, 0, 0, v);
        u1.y(arr_b, 0, v, v1);
        return u.n0(arr_b);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected void z(byte[] arr_b, int v, int v1, int v2) {
        int v3 = this.l;
        if(v + v2 <= v3) {
            this.j.z(arr_b, v, v1, v2);
            return;
        }
        if(v >= v3) {
            this.k.z(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        this.j.z(arr_b, v, v1, v4);
        this.k.z(arr_b, 0, v1 + v4, v2 - v4);
    }

    private boolean z0(u u0) {
        c s1$c0 = new c(this, null);
        Object object0 = s1$c0.next();
        i u$i0 = (i)object0;
        c s1$c1 = new c(u0, null);
        Object object1 = s1$c1.next();
        i u$i1 = (i)object1;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = u$i0.size() - v;
            int v4 = u$i1.size() - v1;
            int v5 = Math.min(v3, v4);
            if(!(v == 0 ? u$i0.u0(u$i1, v1, v5) : u$i1.u0(u$i0, v, v5))) {
                return false;
            }
            v2 += v5;
            int v6 = this.i;
            if(v2 >= v6) {
                if(v2 != v6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v5 == v3) {
                Object object2 = s1$c0.next();
                u$i0 = (i)object2;
                v = 0;
            }
            else {
                v += v5;
            }
            if(v5 == v4) {
                Object object3 = s1$c1.next();
                u$i1 = (i)object3;
                v1 = 0;
            }
            else {
                v1 += v5;
            }
        }
    }
}

