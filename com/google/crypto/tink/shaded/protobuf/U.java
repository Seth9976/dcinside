package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

@y
public abstract class u implements Serializable, Iterable {
    class b implements Comparator {
        b() {
            super();
        }

        public int b(u u0, u u1) {
            g u$g0 = u0.J();
            g u$g1 = u1.J();
            while(u$g0.hasNext() && u$g1.hasNext()) {
                int v = u.a(u$g0.nextByte()).compareTo(u.a(u$g1.nextByte()));
                if(v != 0) {
                    return v;
                }
                if(false) {
                    break;
                }
            }
            return u0.size().compareTo(u1.size());
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((u)object0), ((u)object1));
        }
    }

    static abstract class c implements g {
        public final Byte a() {
            return this.nextByte();
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static final class d implements f {
        private d() {
        }

        d(a u$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$f
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            return Arrays.copyOfRange(arr_b, v, v1 + v);
        }
    }

    static final class e extends j {
        private final int k;
        private final int l;
        private static final long m = 1L;

        e(byte[] arr_b, int v, int v1) {
            super(arr_b);
            u.i(v, v + v1, arr_b.length);
            this.k = v;
            this.l = v1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$j
        byte G(int v) {
            return this.i[this.k + v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$j
        public byte g(int v) {
            u.h(v, this.size());
            return this.i[this.k + v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$j
        public int size() {
            return this.l;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$j
        protected int v0() {
            return this.k;
        }

        private void w0(ObjectInputStream objectInputStream0) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        Object y0() {
            return u.n0(this.a0());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$j
        protected void z(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.i, this.v0() + v, arr_b, v1, v2);
        }
    }

    interface f {
        byte[] copyFrom(byte[] arg1, int arg2, int arg3);
    }

    public interface g extends Iterator {
        byte nextByte();
    }

    static final class h {
        private final B a;
        private final byte[] b;

        private h(int v) {
            byte[] arr_b = new byte[v];
            this.b = arr_b;
            this.a = B.A0(arr_b);
        }

        h(int v, a u$a0) {
            this(v);
        }

        public u a() {
            this.a.m();
            return new j(this.b);
        }

        public B b() {
            return this.a;
        }
    }

    static abstract class i extends u {
        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected final int E() {
            return 0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected final boolean H() {
            return true;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public Iterator iterator() {
            return super.J();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        void t0(t t0) throws IOException {
            this.p0(t0);
        }

        abstract boolean u0(u arg1, int arg2, int arg3);
    }

    static class j extends i {
        protected final byte[] i;
        private static final long j = 1L;

        j(byte[] arr_b) {
            arr_b.getClass();
            this.i = arr_b;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        byte G(int v) {
            return this.i[v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final boolean I() {
            int v = this.v0();
            return Z1.u(this.i, v, this.size() + v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final z M() {
            return z.s(this.i, this.v0(), this.size(), true);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final InputStream N() {
            return new ByteArrayInputStream(this.i, this.v0(), this.size());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected final int Q(int v, int v1, int v2) {
            return t0.w(v, this.i, this.v0() + v1, v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected final int R(int v, int v1, int v2) {
            int v3 = this.v0();
            return Z1.w(v, this.i, v3 + v1, v2 + (v3 + v1));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final u Z(int v, int v1) {
            int v2 = u.i(v, v1, this.size());
            return v2 == 0 ? u.e : new e(this.i, this.v0() + v, v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.i, this.v0(), this.size()).asReadOnlyBuffer();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final List c() {
            return Collections.singletonList(this.b());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof u)) {
                return false;
            }
            if(this.size() != ((u)object0).size()) {
                return false;
            }
            if(this.size() == 0) {
                return true;
            }
            if(object0 instanceof j) {
                int v = this.S();
                int v1 = ((j)object0).S();
                return v == 0 || v1 == 0 || v == v1 ? this.u0(((j)object0), 0, this.size()) : false;
            }
            return object0.equals(this);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public byte g(int v) {
            return this.i[v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected final String h0(Charset charset0) {
            return new String(this.i, this.v0(), this.size(), charset0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        final void p0(t t0) throws IOException {
            t0.k(this.i, this.v0(), this.size());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final void q0(OutputStream outputStream0) throws IOException {
            outputStream0.write(this.a0());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        final void s0(OutputStream outputStream0, int v, int v1) throws IOException {
            outputStream0.write(this.i, this.v0() + v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public int size() {
            return this.i.length;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        public final void u(ByteBuffer byteBuffer0) {
            byteBuffer0.put(this.i, this.v0(), this.size());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$i
        final boolean u0(u u0, int v, int v1) {
            if(v1 > u0.size()) {
                throw new IllegalArgumentException("Length too large: " + v1 + this.size());
            }
            int v2 = v + v1;
            if(v2 > u0.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + u0.size());
            }
            if(u0 instanceof j) {
                byte[] arr_b = this.i;
                byte[] arr_b1 = ((j)u0).i;
                int v3 = this.v0();
                int v4 = this.v0();
                for(int v5 = ((j)u0).v0() + v; v4 < v3 + v1; ++v5) {
                    if(arr_b[v4] != arr_b1[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            return u0.Z(v, v2).equals(this.Z(0, v1));
        }

        protected int v0() {
            return 0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u
        protected void z(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.i, v, arr_b, v1, v2);
        }
    }

    public static final class k extends OutputStream {
        private final int a;
        private final ArrayList b;
        private int c;
        private byte[] d;
        private int e;
        private static final byte[] f;

        static {
            k.f = new byte[0];
        }

        k(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.a = v;
            this.b = new ArrayList();
            this.d = new byte[v];
        }

        private byte[] a(byte[] arr_b, int v) {
            byte[] arr_b1 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, v));
            return arr_b1;
        }

        private void b(int v) {
            j u$j0 = new j(this.d);
            this.b.add(u$j0);
            int v1 = this.c + this.d.length;
            this.c = v1;
            this.d = new byte[Math.max(this.a, Math.max(v, v1 >>> 1))];
            this.e = 0;
        }

        private void c() {
            int v = this.e;
            byte[] arr_b = this.d;
            if(v >= arr_b.length) {
                j u$j1 = new j(this.d);
                this.b.add(u$j1);
                this.d = k.f;
            }
            else if(v > 0) {
                j u$j0 = new j(this.a(arr_b, v));
                this.b.add(u$j0);
            }
            this.c += this.e;
            this.e = 0;
        }

        public u e() {
            synchronized(this) {
                this.c();
                return u.k(this.b);
            }
        }

        public void f(OutputStream outputStream0) throws IOException {
            int v1;
            byte[] arr_b;
            u[] arr_u;
            synchronized(this) {
                arr_u = (u[])this.b.toArray(new u[this.b.size()]);
                arr_b = this.d;
                v1 = this.e;
            }
            for(int v2 = 0; v2 < arr_u.length; ++v2) {
                arr_u[v2].q0(outputStream0);
            }
            outputStream0.write(this.a(arr_b, v1));
        }

        public void reset() {
            synchronized(this) {
                this.b.clear();
                this.c = 0;
                this.e = 0;
            }
        }

        public int size() {
            synchronized(this) {
            }
            return this.c + this.e;
        }

        @Override
        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
        }

        @Override
        public void write(int v) {
            synchronized(this) {
                if(this.e == this.d.length) {
                    this.b(1);
                }
                int v2 = this.e;
                this.e = v2 + 1;
                this.d[v2] = (byte)v;
            }
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            synchronized(this) {
                byte[] arr_b1 = this.d;
                int v3 = this.e;
                if(v1 <= arr_b1.length - v3) {
                    System.arraycopy(arr_b, v, arr_b1, v3, v1);
                    this.e += v1;
                }
                else {
                    int v4 = arr_b1.length - v3;
                    System.arraycopy(arr_b, v, arr_b1, v3, v4);
                    int v5 = v1 - v4;
                    this.b(v5);
                    System.arraycopy(arr_b, v + v4, this.d, 0, v5);
                    this.e = v5;
                }
            }
        }
    }

    static final class l implements f {
        private l() {
        }

        l(a u$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.u$f
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            return arr_b1;
        }
    }

    private int a;
    static final int b = 0x80;
    static final int c = 0x100;
    static final int d = 0x2000;
    public static final u e = null;
    private static final f f = null;
    private static final int g = 0xFF;
    private static final Comparator h;

    static {
        u.e = new j(t0.e);
        u.f = new d(null);
        u.h = new b();
    }

    u() {
        this.a = 0;
    }

    public static final u A() {
        return u.e;
    }

    public final boolean B(u u0) {
        return this.size() >= u0.size() && this.Y(this.size() - u0.size()).equals(u0);
    }

    private static int C(String s, int v) {
        int v1 = u.F(s.charAt(v));
        if(v1 == -1) {
            throw new NumberFormatException("Invalid hexString " + s + " must only contain [0-9a-fA-F] but contained " + s.charAt(v) + " at index " + v);
        }
        return v1;
    }

    public static u D(@D String s) {
        if(s.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + s + " of length " + s.length() + " must be even.");
        }
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = u.C(s, v1 * 2);
            arr_b[v1] = (byte)(u.C(s, v1 * 2 + 1) | v2 << 4);
        }
        return new j(arr_b);
    }

    protected abstract int E();

    private static int F(char c) {
        if(c >= 0x30 && c <= 57) {
            return c - 0x30;
        }
        if(c >= 65 && c <= 70) {
            return c - 55;
        }
        return c < 97 || c > 102 ? -1 : c - 87;
    }

    abstract byte G(int arg1);

    protected abstract boolean H();

    public abstract boolean I();

    public g J() {
        class a extends c {
            private int a;
            private final int b;
            final u c;

            a() {
                this.a = 0;
                this.b = u0.size();
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.u$g
            public byte nextByte() {
                int v = this.a;
                if(v >= this.b) {
                    throw new NoSuchElementException();
                }
                this.a = v + 1;
                return u.this.G(v);
            }
        }

        return new a(this);
    }

    static h K(int v) {
        return new h(v, null);
    }

    public abstract z M();

    public abstract InputStream N();

    public static k O() {
        return new k(0x80);
    }

    public static k P(int v) {
        return new k(v);
    }

    protected abstract int Q(int arg1, int arg2, int arg3);

    protected abstract int R(int arg1, int arg2, int arg3);

    protected final int S() {
        return this.a;
    }

    private static u T(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        int v1;
        for(v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                break;
            }
        }
        return v1 == 0 ? null : u.q(arr_b, 0, v1);
    }

    public static u U(InputStream inputStream0) throws IOException {
        return u.W(inputStream0, 0x100, 0x2000);
    }

    public static u V(InputStream inputStream0, int v) throws IOException {
        return u.W(inputStream0, v, v);
    }

    public static u W(InputStream inputStream0, int v, int v1) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        u u0;
        while((u0 = u.T(inputStream0, v)) != null) {
            arrayList0.add(u0);
            v = Math.min(v * 2, v1);
        }
        return u.k(arrayList0);
    }

    public final boolean X(u u0) {
        return this.size() >= u0.size() && this.Z(0, u0.size()).equals(u0);
    }

    public final u Y(int v) {
        return this.Z(v, this.size());
    }

    public abstract u Z(int arg1, int arg2);

    static int a(byte b) {
        return b & 0xFF;
    }

    public final byte[] a0() {
        int v = this.size();
        if(v == 0) {
            return t0.e;
        }
        byte[] arr_b = new byte[v];
        this.z(arr_b, 0, 0, v);
        return arr_b;
    }

    public abstract ByteBuffer b();

    private static int b0(byte b) [...] // Inlined contents

    public abstract List c();

    public final String c0(String s) throws UnsupportedEncodingException {
        try {
            return this.g0(Charset.forName(s));
        }
        catch(UnsupportedCharsetException unsupportedCharsetException0) {
            UnsupportedEncodingException unsupportedEncodingException0 = new UnsupportedEncodingException(s);
            unsupportedEncodingException0.initCause(unsupportedCharsetException0);
            throw unsupportedEncodingException0;
        }
    }

    private static u d(Iterator iterator0, int v) {
        if(v < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
        }
        return v == 1 ? iterator0.next() : u.d(iterator0, v >>> 1).j(u.d(iterator0, v - (v >>> 1)));
    }

    @Override
    public abstract boolean equals(Object arg1);

    public abstract byte g(int arg1);

    public final String g0(Charset charset0) {
        return this.size() == 0 ? "" : this.h0(charset0);
    }

    static void h(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    protected abstract String h0(Charset arg1);

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = this.size();
            v = this.Q(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.a = v;
        }
        return v;
    }

    @x
    static int i(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    public final String i0() {
        return this.g0(t0.b);
    }

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        return this.J();
    }

    public final u j(u u0) {
        if(0x7FFFFFFF - this.size() < u0.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + this.size() + "+" + u0.size());
        }
        return s1.w0(this, u0);
    }

    private String j0() {
        return this.size() > 50 ? H1.a(this.Z(0, 0x2F)) + "..." : H1.a(this);
    }

    public static u k(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? u.e : u.d(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? u.e : u.d(iterable0.iterator(), v);
    }

    public static Comparator k0() {
        return u.h;
    }

    public static u l(String s, String s1) throws UnsupportedEncodingException {
        return new j(s.getBytes(s1));
    }

    public static u m(String s, Charset charset0) {
        return new j(s.getBytes(charset0));
    }

    static u m0(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            return u.o0(byteBuffer0.array(), v + byteBuffer0.position(), byteBuffer0.remaining());
        }
        return new e1(byteBuffer0);
    }

    public static u n(ByteBuffer byteBuffer0) {
        return u.o(byteBuffer0, byteBuffer0.remaining());
    }

    static u n0(byte[] arr_b) {
        return new j(arr_b);
    }

    public static u o(ByteBuffer byteBuffer0, int v) {
        u.i(0, v, byteBuffer0.remaining());
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return new j(arr_b);
    }

    static u o0(byte[] arr_b, int v, int v1) {
        return new e(arr_b, v, v1);
    }

    public static u p(byte[] arr_b) {
        return u.q(arr_b, 0, arr_b.length);
    }

    abstract void p0(t arg1) throws IOException;

    public static u q(byte[] arr_b, int v, int v1) {
        u.i(v, v + v1, arr_b.length);
        return new j(u.f.copyFrom(arr_b, v, v1));
    }

    public abstract void q0(OutputStream arg1) throws IOException;

    public static u r(String s) {
        return new j(s.getBytes(t0.b));
    }

    final void r0(OutputStream outputStream0, int v, int v1) throws IOException {
        u.i(v, v + v1, this.size());
        if(v1 > 0) {
            this.s0(outputStream0, v, v1);
        }
    }

    abstract void s0(OutputStream arg1, int arg2, int arg3) throws IOException;

    public abstract int size();

    abstract void t0(t arg1) throws IOException;

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = this.j0();
        return String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), this.size(), s);
    }

    public abstract void u(ByteBuffer arg1);

    public void x(byte[] arr_b, int v) {
        this.y(arr_b, 0, v, this.size());
    }

    @Deprecated
    public final void y(byte[] arr_b, int v, int v1, int v2) {
        u.i(v, v + v2, this.size());
        u.i(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.z(arr_b, v, v1, v2);
        }
    }

    protected abstract void z(byte[] arg1, int arg2, int arg3, int arg4);
}

