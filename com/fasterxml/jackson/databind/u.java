package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class u implements Closeable, Iterator {
    protected final m a;
    protected final h b;
    protected final n c;
    protected final com.fasterxml.jackson.core.n d;
    protected final q e;
    protected final Object f;
    protected final boolean g;
    protected int h;
    protected static final u i = null;
    protected static final int j = 0;
    protected static final int k = 1;
    protected static final int l = 2;
    protected static final int m = 3;

    static {
        u.i = new u(null, null, null, null, false, null);
    }

    protected u(m m0, com.fasterxml.jackson.core.n n0, h h0, n n1, boolean z, Object object0) {
        this.a = m0;
        this.d = n0;
        this.b = h0;
        this.c = n1;
        this.g = z;
        this.f = object0 == null ? null : object0;
        if(n0 == null) {
            this.e = null;
            this.h = 0;
            return;
        }
        q q0 = n0.A2();
        if(!z || !n0.d4()) {
            r r0 = n0.Y();
            if(r0 == r.k || r0 == r.m) {
                q0 = q0.f();
            }
        }
        else {
            n0.L();
        }
        this.e = q0;
        this.h = 2;
    }

    protected Object a(IOException iOException0) {
        throw new RuntimeException(iOException0.getMessage(), iOException0);
    }

    protected Object b(o o0) {
        throw new E(o0.getMessage(), o0);
    }

    protected void c() throws IOException {
        com.fasterxml.jackson.core.n n0 = this.d;
        if(n0.A2() == this.e) {
            return;
        }
        while(true) {
            do {
            label_3:
                r r0 = n0.m4();
                if(r0 == r.n || r0 == r.l) {
                    goto label_10;
                }
                if(r0 == r.m || r0 == r.k) {
                    n0.I4();
                    goto label_3;
                }
            }
            while(r0 != null);
            return;
        label_10:
            if(n0.A2() != this.e) {
                goto label_3;
            }
            break;
        }
        n0.L();
    }

    @Override
    public void close() throws IOException {
        if(this.h != 0) {
            this.h = 0;
            com.fasterxml.jackson.core.n n0 = this.d;
            if(n0 != null) {
                n0.close();
            }
        }
    }

    protected Object e() {
        throw new NoSuchElementException();
    }

    public static u f() {
        return u.i;
    }

    @Override
    public boolean hasNext() {
        try {
            return this.n();
        }
        catch(o o0) {
            return ((Boolean)this.b(o0)).booleanValue();
        }
        catch(IOException iOException0) {
            return ((Boolean)this.a(iOException0)).booleanValue();
        }
    }

    public l i() {
        return this.d.b1();
    }

    public com.fasterxml.jackson.core.n j() {
        return this.d;
    }

    public e k() {
        return this.d.I2();
    }

    public boolean n() throws IOException {
        switch(this.h) {
            case 0: {
                return false;
            }
            case 1: {
                this.c();
                break;
            }
            case 2: {
                break;
            }
            default: {
                return true;
            }
        }
        com.fasterxml.jackson.core.n n0 = this.d;
        if(n0 == null) {
            return false;
        }
        if(n0.Y() == null) {
            r r0 = this.d.m4();
            if(r0 == null || r0 == r.n) {
                this.h = 0;
                if(this.g) {
                    this.d.close();
                }
                return false;
            }
        }
        this.h = 3;
        return true;
    }

    @Override
    public Object next() {
        try {
            return this.o();
        }
        catch(o o0) {
            return this.b(o0);
        }
        catch(IOException iOException0) {
            return this.a(iOException0);
        }
    }

    public Object o() throws IOException {
        Object object1;
        switch(this.h) {
            case 0: {
                return this.e();
            }
            case 1: 
            case 2: {
                if(!this.n()) {
                    return this.e();
                }
            }
        }
        try {
            Object object0 = this.f;
            if(object0 == null) {
                object1 = this.c.g(this.d, this.b);
            }
            else {
                this.c.h(this.d, this.b, object0);
                object1 = this.f;
            }
        }
        catch(Throwable throwable0) {
            this.h = 1;
            this.d.L();
            throw throwable0;
        }
        this.h = 2;
        this.d.L();
        return object1;
    }

    public Collection p(Collection collection0) throws IOException {
        while(this.n()) {
            collection0.add(this.o());
        }
        return collection0;
    }

    public List q() throws IOException {
        return this.s(new ArrayList());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public List s(List list0) throws IOException {
        while(this.n()) {
            list0.add(this.o());
        }
        return list0;
    }
}

