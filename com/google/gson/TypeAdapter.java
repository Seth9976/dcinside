package com.google.gson;

import com.google.gson.internal.bind.b;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter {
    public final Object a(Reader reader0) throws IOException {
        return this.e(new a(reader0));
    }

    public final Object b(String s) throws IOException {
        return this.a(new StringReader(s));
    }

    public final Object c(j j0) {
        try {
            return this.e(new com.google.gson.internal.bind.a(j0));
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
    }

    public final TypeAdapter d() {
        return new TypeAdapter() {
            final TypeAdapter a;

            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                if(a0.f0() == c.i) {
                    a0.T();
                    return null;
                }
                return TypeAdapter.this.e(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                if(object0 == null) {
                    d0.v();
                    return;
                }
                TypeAdapter.this.i(d0, object0);
            }
        };
    }

    public abstract Object e(a arg1) throws IOException;

    public final String f(Object object0) {
        StringWriter stringWriter0 = new StringWriter();
        try {
            this.g(stringWriter0, object0);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
    }

    public final void g(Writer writer0, Object object0) throws IOException {
        this.i(new d(writer0), object0);
    }

    public final j h(Object object0) {
        try {
            b b0 = new b();
            this.i(b0, object0);
            return b0.Y0();
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
    }

    public abstract void i(d arg1, Object arg2) throws IOException;
}

