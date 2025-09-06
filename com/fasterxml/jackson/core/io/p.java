package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.a;
import com.fasterxml.jackson.core.util.x;
import java.io.IOException;
import java.io.Writer;

public final class p extends Writer {
    private final x a;

    public p(a a0) {
        this.a = new x(a0);
    }

    public String a() throws IOException {
        String s = this.a.q();
        this.a.G();
        return s;
    }

    @Override
    public Writer append(char c) throws IOException {
        this.write(((int)c));
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence0) throws IOException {
        String s = charSequence0.toString();
        this.a.d(s, 0, s.length());
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence0, int v, int v1) throws IOException {
        String s = charSequence0.subSequence(v, v1).toString();
        this.a.d(s, 0, s.length());
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return this.append(c);
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
        this.a.c(((char)v));
    }

    @Override
    public void write(String s) throws IOException {
        this.a.d(s, 0, s.length());
    }

    @Override
    public void write(String s, int v, int v1) throws IOException {
        this.a.d(s, v, v1);
    }

    @Override
    public void write(char[] arr_c) throws IOException {
        this.a.e(arr_c, 0, arr_c.length);
    }

    @Override
    public void write(char[] arr_c, int v, int v1) throws IOException {
        this.a.e(arr_c, v, v1);
    }
}

