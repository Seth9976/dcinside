package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.util.NoSuchElementException;

@b
@C1
public abstract class c extends u5 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.common.collect.c.b.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.common.collect.c.b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.common.collect.c.b.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum com.google.common.collect.c.b {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        private static com.google.common.collect.c.b[] a() [...] // Inlined contents
    }

    private com.google.common.collect.c.b a;
    @o3.a
    private Object b;

    protected c() {
        this.a = com.google.common.collect.c.b.b;
    }

    @o3.a
    protected abstract Object a();

    @O1.a
    @o3.a
    protected final Object b() {
        this.a = com.google.common.collect.c.b.c;
        return null;
    }

    private boolean c() {
        this.a = com.google.common.collect.c.b.d;
        this.b = this.a();
        if(this.a != com.google.common.collect.c.b.c) {
            this.a = com.google.common.collect.c.b.a;
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        H.g0(this.a != com.google.common.collect.c.b.d);
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
    @O1.a
    @d4
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = com.google.common.collect.c.b.b;
        Object object0 = this.b;
        this.b = null;
        return object0;
    }

    @d4
    public final Object peek() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.b;
    }
}

