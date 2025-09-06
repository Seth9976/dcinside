package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.stream.d;
import com.google.gson.stream.e;
import com.google.gson.t;
import j..util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class n {
    static class a {
    }

    static final class b extends Writer {
        static class com.google.gson.internal.n.b.a implements CharSequence {
            private char[] a;
            private String b;

            private com.google.gson.internal.n.b.a() {
            }

            com.google.gson.internal.n.b.a(a n$a0) {
            }

            void a(char[] arr_c) {
                this.a = arr_c;
                this.b = null;
            }

            @Override
            public char charAt(int v) {
                return this.a[v];
            }

            @Override
            public int length() {
                return this.a.length;
            }

            @Override
            public CharSequence subSequence(int v, int v1) {
                return new String(this.a, v, v1 - v);
            }

            @Override
            public String toString() {
                if(this.b == null) {
                    this.b = new String(this.a);
                }
                return this.b;
            }
        }

        private final Appendable a;
        private final com.google.gson.internal.n.b.a b;

        b(Appendable appendable0) {
            this.b = new com.google.gson.internal.n.b.a(null);
            this.a = appendable0;
        }

        @Override
        public Writer append(CharSequence charSequence0) throws IOException {
            this.a.append(charSequence0);
            return this;
        }

        @Override
        public Writer append(CharSequence charSequence0, int v, int v1) throws IOException {
            this.a.append(charSequence0, v, v1);
            return this;
        }

        @Override
        public Appendable append(CharSequence charSequence0) throws IOException {
            return this.append(charSequence0);
        }

        @Override
        public Appendable append(CharSequence charSequence0, int v, int v1) throws IOException {
            return this.append(charSequence0, v, v1);
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
        }

        @Override
        public void write(int v) throws IOException {
            this.a.append(((char)v));
        }

        @Override
        public void write(String s, int v, int v1) throws IOException {
            Objects.requireNonNull(s);
            this.a.append(s, v, v1 + v);
        }

        @Override
        public void write(char[] arr_c, int v, int v1) throws IOException {
            this.b.a(arr_c);
            this.a.append(this.b, v, v1 + v);
        }
    }

    private n() {
        throw new UnsupportedOperationException();
    }

    public static j a(com.google.gson.stream.a a0) throws com.google.gson.n {
        try {
            boolean z = true;
            a0.f0();
            z = false;
            return (j)TypeAdapters.V.e(a0);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw new t(eOFException0);
            }
            return l.a;
        }
        catch(e e0) {
            throw new t(e0);
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new t(numberFormatException0);
        }
    }

    public static void b(j j0, d d0) throws IOException {
        TypeAdapters.V.i(d0, j0);
    }

    public static Writer c(Appendable appendable0) {
        return appendable0 instanceof Writer ? ((Writer)appendable0) : new b(appendable0);
    }
}

