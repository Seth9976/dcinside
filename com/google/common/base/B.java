package com.google.common.base;

import J1.b;
import java.util.Iterator;
import java.util.NoSuchElementException;

@b
@k
abstract class com.google.common.base.b implements Iterator {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.common.base.b.b.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.common.base.b.b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.common.base.b.b.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum com.google.common.base.b.b {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        private static com.google.common.base.b.b[] a() [...] // Inlined contents
    }

    private com.google.common.base.b.b a;
    @o3.a
    private Object b;

    protected com.google.common.base.b() {
        this.a = com.google.common.base.b.b.b;
    }

    @o3.a
    protected abstract Object a();

    @O1.a
    @o3.a
    protected final Object b() {
        this.a = com.google.common.base.b.b.c;
        return null;
    }

    private boolean c() {
        this.a = com.google.common.base.b.b.d;
        this.b = this.a();
        if(this.a != com.google.common.base.b.b.c) {
            this.a = com.google.common.base.b.b.a;
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        H.g0(this.a != com.google.common.base.b.b.d);
        switch(this.a) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            default: {
                return this.c();
            }
        }
    }

    @Override
    @E
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = com.google.common.base.b.b.b;
        Object object0 = this.b;
        this.b = null;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

