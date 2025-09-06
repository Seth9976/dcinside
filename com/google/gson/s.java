package com.google.gson;

import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.e;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {
    private final a a;
    private final Object b;

    public s(Reader reader0) {
        a a0 = new a(reader0);
        this.a = a0;
        a0.E0(true);
        this.b = new Object();
    }

    public s(String s) {
        this(new StringReader(s));
    }

    public j a() throws n {
        if(this.hasNext()) {
            try {
                return com.google.gson.internal.n.a(this.a);
            }
            catch(StackOverflowError stackOverflowError0) {
                throw new n("Failed parsing JSON source to Json", stackOverflowError0);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                throw new n("Failed parsing JSON source to Json", outOfMemoryError0);
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        synchronized(this.b) {
            try {
                if(this.a.f0() == c.j) {
                    return false;
                }
                else {
                    return true;
                }
                return z;
            }
            catch(e e0) {
                throw new t(e0);
            }
            catch(IOException iOException0) {
                throw new k(iOException0);
            }
        }
    }

    @Override
    public Object next() {
        return this.a();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

