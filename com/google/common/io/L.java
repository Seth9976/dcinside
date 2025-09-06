package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

@c
@d
@q
public final class l {
    static final class a extends Writer {
        private static final a a;

        static {
            a.a = new a();
        }

        @Override
        public Writer append(char c) [...] // Inlined contents

        @Override
        public Writer append(@o3.a CharSequence charSequence0) [...] // Inlined contents

        @Override
        public Writer append(@o3.a CharSequence charSequence0, int v, int v1) {
            H.f0(v, v1, (charSequence0 == null ? 4 : charSequence0.length()));
            return this;
        }

        @Override
        public Appendable append(char c) throws IOException {
            return this;
        }

        @Override
        public Appendable append(@o3.a CharSequence charSequence0) throws IOException {
            return this;
        }

        @Override
        public Appendable append(@o3.a CharSequence charSequence0, int v, int v1) throws IOException {
            return this.append(charSequence0, v, v1);
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
        }

        @Override
        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override
        public void write(int v) {
        }

        @Override
        public void write(String s) {
            H.E(s);
        }

        @Override
        public void write(String s, int v, int v1) {
            H.f0(v, v1 + v, s.length());
        }

        @Override
        public void write(char[] arr_c) {
            H.E(arr_c);
        }

        @Override
        public void write(char[] arr_c, int v, int v1) {
            H.f0(v, v1 + v, arr_c.length);
        }
    }

    private static final int a = 0x800;

    public static Writer a(Appendable appendable0) {
        return appendable0 instanceof Writer ? ((Writer)appendable0) : new com.google.common.io.a(appendable0);
    }

    @O1.a
    public static long b(Readable readable0, Appendable appendable0) throws IOException {
        if(readable0 instanceof Reader) {
            return appendable0 instanceof StringBuilder ? l.c(((Reader)readable0), ((StringBuilder)appendable0)) : l.d(((Reader)readable0), l.a(appendable0));
        }
        H.E(readable0);
        H.E(appendable0);
        CharBuffer charBuffer0 = l.e();
        long v = 0L;
        while(readable0.read(charBuffer0) != -1) {
            w.b(charBuffer0);
            appendable0.append(charBuffer0);
            v += (long)charBuffer0.remaining();
            w.a(charBuffer0);
        }
        return v;
    }

    @O1.a
    static long c(Reader reader0, StringBuilder stringBuilder0) throws IOException {
        H.E(reader0);
        H.E(stringBuilder0);
        char[] arr_c = new char[0x800];
        long v = 0L;
        int v1;
        while((v1 = reader0.read(arr_c)) != -1) {
            stringBuilder0.append(arr_c, 0, v1);
            v += (long)v1;
        }
        return v;
    }

    @O1.a
    static long d(Reader reader0, Writer writer0) throws IOException {
        H.E(reader0);
        H.E(writer0);
        char[] arr_c = new char[0x800];
        long v = 0L;
        int v1;
        while((v1 = reader0.read(arr_c)) != -1) {
            writer0.write(arr_c, 0, v1);
            v += (long)v1;
        }
        return v;
    }

    static CharBuffer e() {
        return CharBuffer.allocate(0x800);
    }

    @O1.a
    public static long f(Readable readable0) throws IOException {
        CharBuffer charBuffer0 = l.e();
        long v = 0L;
        long v1;
        while((v1 = (long)readable0.read(charBuffer0)) != -1L) {
            v += v1;
            w.a(charBuffer0);
        }
        return v;
    }

    public static Writer g() {
        return a.a;
    }

    @O1.a
    @E
    public static Object h(Readable readable0, y y0) throws IOException {
        H.E(readable0);
        H.E(y0);
        z z0 = new z(readable0);
        do {
            String s = z0.b();
        }
        while(s != null && y0.a(s));
        return y0.getResult();
    }

    public static List i(Readable readable0) throws IOException {
        List list0 = new ArrayList();
        z z0 = new z(readable0);
        String s;
        while((s = z0.b()) != null) {
            list0.add(s);
        }
        return list0;
    }

    public static void j(Reader reader0, long v) throws IOException {
        H.E(reader0);
        while(v > 0L) {
            long v1 = reader0.skip(v);
            if(v1 == 0L) {
                throw new EOFException();
            }
            v -= v1;
        }
    }

    public static String k(Readable readable0) throws IOException {
        return l.l(readable0).toString();
    }

    private static StringBuilder l(Readable readable0) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(readable0 instanceof Reader) {
            l.c(((Reader)readable0), stringBuilder0);
            return stringBuilder0;
        }
        l.b(readable0, stringBuilder0);
        return stringBuilder0;
    }
}

