package com.google.common.hash;

import J1.a;
import com.google.common.base.H;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@a
@k
public final class o {
    static enum com.google.common.hash.o.a implements n {
        INSTANCE;

        private static com.google.common.hash.o.a[] a() [...] // Inlined contents

        public void b(byte[] arr_b, J j0) {
            j0.h(arr_b);
        }

        @Override
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.b(((byte[])object0), j0);
        }
    }

    static enum b implements n {
        INSTANCE;

        private static b[] a() [...] // Inlined contents

        public void b(Integer integer0, J j0) {
            j0.b(((int)integer0));
        }

        @Override
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.b(((Integer)object0), j0);
        }
    }

    static enum c implements n {
        INSTANCE;

        private static c[] a() [...] // Inlined contents

        public void b(Long long0, J j0) {
            j0.c(((long)long0));
        }

        @Override
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.b(((Long)object0), j0);
        }
    }

    static class d implements n, Serializable {
        private final n a;

        d(n n0) {
            this.a = (n)H.E(n0);
        }

        public void a(Iterable iterable0, J j0) {
            for(Object object0: iterable0) {
                this.a.v(object0, j0);
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof d ? this.a.equals(((d)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return d.class.hashCode() ^ this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Funnels.sequentialFunnel(" + this.a + ")";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.a(((Iterable)object0), j0);
        }
    }

    static class e extends OutputStream {
        final J a;

        e(J j0) {
            this.a = (J)H.E(j0);
        }

        @Override
        public String toString() {
            return "Funnels.asOutputStream(" + this.a + ")";
        }

        @Override
        public void write(int v) {
            this.a.g(((byte)v));
        }

        @Override
        public void write(byte[] arr_b) {
            this.a.h(arr_b);
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            this.a.k(arr_b, v, v1);
        }
    }

    static class f implements n, Serializable {
        static class com.google.common.hash.o.f.a implements Serializable {
            private final String a;
            private static final long b;

            com.google.common.hash.o.f.a(Charset charset0) {
                this.a = charset0.name();
            }

            private Object a() {
                return o.f(Charset.forName(this.a));
            }
        }

        private final Charset a;

        f(Charset charset0) {
            this.a = (Charset)H.E(charset0);
        }

        public void a(CharSequence charSequence0, J j0) {
            j0.m(charSequence0, this.a);
        }

        private void b(ObjectInputStream objectInputStream0) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        Object c() {
            return new com.google.common.hash.o.f.a(this.a);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof f ? this.a.equals(((f)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return f.class.hashCode() ^ this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Funnels.stringFunnel(" + this.a.name() + ")";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.a(((CharSequence)object0), j0);
        }
    }

    static enum g implements n {
        INSTANCE;

        private static g[] a() [...] // Inlined contents

        public void b(CharSequence charSequence0, J j0) {
            j0.j(charSequence0);
        }

        @Override
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override  // com.google.common.hash.n
        public void v(Object object0, J j0) {
            this.b(((CharSequence)object0), j0);
        }
    }

    public static OutputStream a(J j0) {
        return new e(j0);
    }

    public static n b() {
        return com.google.common.hash.o.a.a;
    }

    public static n c() {
        return b.a;
    }

    public static n d() {
        return c.a;
    }

    public static n e(n n0) {
        return new d(n0);
    }

    public static n f(Charset charset0) {
        return new f(charset0);
    }

    public static n g() {
        return g.a;
    }
}

