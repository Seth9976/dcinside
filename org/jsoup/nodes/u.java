package org.jsoup.nodes;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jsoup.helper.i;

public class u implements Iterator {
    private t a;
    private t b;
    private t c;
    private t d;
    private t e;
    private final Class f;

    public u(t t0, Class class0) {
        i.o(t0);
        i.o(class0);
        this.f = class0;
        this.e(t0);
    }

    private t a() {
        t t0 = this.c;
    alab1:
        while(true) {
            if(t0.p() > 0) {
                t0 = t0.o(0);
            }
            else if(this.a.equals(t0)) {
                t0 = null;
            }
            else {
                if(t0.M() == null) {
                    do {
                        t0 = t0.X();
                        if(t0 == null || this.a.equals(t0)) {
                            break alab1;
                        }
                    }
                    while(t0.M() == null);
                }
                t0 = t0.M();
            }
            if(t0 == null) {
                return null;
            }
            if(this.f.isInstance(t0)) {
                return t0;
            }
        }
        return null;
    }

    public static u b(t t0) {
        return new u(t0, t.class);
    }

    private void c() {
        if(this.b != null) {
            return;
        }
        if(this.e != null && !this.c.F()) {
            this.c = this.d;
        }
        this.b = this.a();
    }

    public t d() {
        this.c();
        t t0 = this.b;
        if(t0 == null) {
            throw new NoSuchElementException();
        }
        this.d = this.c;
        this.c = t0;
        this.e = t0.X();
        this.b = null;
        return t0;
    }

    public void e(t t0) {
        if(this.f.isInstance(t0)) {
            this.b = t0;
        }
        this.c = t0;
        this.d = t0;
        this.a = t0;
        this.e = t0.X();
    }

    @Override
    public boolean hasNext() {
        this.c();
        return this.b != null;
    }

    @Override
    public Object next() {
        return this.d();
    }

    @Override
    public void remove() {
        this.c.d0();
    }
}

