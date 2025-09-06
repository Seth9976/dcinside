package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

@c
@d
@q
class a extends Writer {
    private final Appendable a;
    private boolean b;

    a(Appendable appendable0) {
        this.a = (Appendable)H.E(appendable0);
    }

    private void a() throws IOException {
        if(this.b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override
    public Writer append(char c) throws IOException {
        this.a();
        this.a.append(c);
        return this;
    }

    @Override
    public Writer append(@o3.a CharSequence charSequence0) throws IOException {
        this.a();
        this.a.append(charSequence0);
        return this;
    }

    @Override
    public Writer append(@o3.a CharSequence charSequence0, int v, int v1) throws IOException {
        this.a();
        this.a.append(charSequence0, v, v1);
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return this.append(c);
    }

    @Override
    public Appendable append(@o3.a CharSequence charSequence0) throws IOException {
        return this.append(charSequence0);
    }

    @Override
    public Appendable append(@o3.a CharSequence charSequence0, int v, int v1) throws IOException {
        return this.append(charSequence0, v, v1);
    }

    @Override
    public void close() throws IOException {
        this.b = true;
        Appendable appendable0 = this.a;
        if(appendable0 instanceof Closeable) {
            ((Closeable)appendable0).close();
        }
    }

    @Override
    public void flush() throws IOException {
        this.a();
        Appendable appendable0 = this.a;
        if(appendable0 instanceof Flushable) {
            ((Flushable)appendable0).flush();
        }
    }

    @Override
    public void write(int v) throws IOException {
        this.a();
        this.a.append(((char)v));
    }

    @Override
    public void write(String s) throws IOException {
        H.E(s);
        this.a();
        this.a.append(s);
    }

    @Override
    public void write(String s, int v, int v1) throws IOException {
        H.E(s);
        this.a();
        this.a.append(s, v, v1 + v);
    }

    @Override
    public void write(char[] arr_c, int v, int v1) throws IOException {
        this.a();
        String s = new String(arr_c, v, v1);
        this.a.append(s);
    }
}

