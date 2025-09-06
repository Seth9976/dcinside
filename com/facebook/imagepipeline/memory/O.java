package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedList;
import k1.G;
import k1.n.a;
import k1.n;
import o3.h;

@G
@n(a.a)
public class o {
    @VisibleForTesting
    static class com.facebook.imagepipeline.memory.o.a {
        @h
        com.facebook.imagepipeline.memory.o.a a;
        int b;
        LinkedList c;
        @h
        com.facebook.imagepipeline.memory.o.a d;

        private com.facebook.imagepipeline.memory.o.a(@h com.facebook.imagepipeline.memory.o.a o$a0, int v, LinkedList linkedList0, @h com.facebook.imagepipeline.memory.o.a o$a1) {
            this.a = o$a0;
            this.b = v;
            this.c = linkedList0;
            this.d = o$a1;
        }

        com.facebook.imagepipeline.memory.o.a(com.facebook.imagepipeline.memory.o.a o$a0, int v, LinkedList linkedList0, com.facebook.imagepipeline.memory.o.a o$a1, p p0) {
            this(o$a0, v, linkedList0, o$a1);
        }

        @Override
        public String toString() {
            return "LinkedEntry(key: " + this.b + ")";
        }
    }

    protected final SparseArray a;
    @VisibleForTesting
    @h
    com.facebook.imagepipeline.memory.o.a b;
    @VisibleForTesting
    @h
    com.facebook.imagepipeline.memory.o.a c;

    public o() {
        this.a = new SparseArray();
    }

    @h
    public Object a(int v) {
        synchronized(this) {
            com.facebook.imagepipeline.memory.o.a o$a0 = (com.facebook.imagepipeline.memory.o.a)this.a.get(v);
            if(o$a0 == null) {
                return null;
            }
            Object object0 = o$a0.c.pollFirst();
            this.c(o$a0);
            return object0;
        }
    }

    private void b(com.facebook.imagepipeline.memory.o.a o$a0) {
        if(o$a0 != null && o$a0.c.isEmpty()) {
            this.d(o$a0);
            this.a.remove(o$a0.b);
        }
    }

    private void c(com.facebook.imagepipeline.memory.o.a o$a0) {
        if(this.b == o$a0) {
            return;
        }
        this.d(o$a0);
        com.facebook.imagepipeline.memory.o.a o$a1 = this.b;
        if(o$a1 == null) {
            this.b = o$a0;
            this.c = o$a0;
            return;
        }
        o$a0.d = o$a1;
        o$a1.a = o$a0;
        this.b = o$a0;
    }

    private void d(com.facebook.imagepipeline.memory.o.a o$a0) {
        synchronized(this) {
            com.facebook.imagepipeline.memory.o.a o$a1 = o$a0.a;
            com.facebook.imagepipeline.memory.o.a o$a2 = o$a0.d;
            if(o$a1 != null) {
                o$a1.d = o$a2;
            }
            if(o$a2 != null) {
                o$a2.a = o$a1;
            }
            o$a0.a = null;
            o$a0.d = null;
            if(o$a0 == this.b) {
                this.b = o$a2;
            }
            if(o$a0 == this.c) {
                this.c = o$a1;
            }
        }
    }

    public void e(int v, Object object0) {
        synchronized(this) {
            com.facebook.imagepipeline.memory.o.a o$a0 = (com.facebook.imagepipeline.memory.o.a)this.a.get(v);
            if(o$a0 == null) {
                o$a0 = new com.facebook.imagepipeline.memory.o.a(null, v, new LinkedList(), null, null);
                this.a.put(v, o$a0);
            }
            o$a0.c.addLast(object0);
            this.c(o$a0);
        }
    }

    @h
    public Object f() {
        synchronized(this) {
            com.facebook.imagepipeline.memory.o.a o$a0 = this.c;
            if(o$a0 == null) {
                return null;
            }
            Object object0 = o$a0.c.pollLast();
            this.b(o$a0);
            return object0;
        }
    }

    @VisibleForTesting
    int g() {
        synchronized(this) {
            com.facebook.imagepipeline.memory.o.a o$a0 = this.b;
            int v1 = 0;
            while(o$a0 != null) {
                LinkedList linkedList0 = o$a0.c;
                if(linkedList0 != null) {
                    v1 += linkedList0.size();
                }
                o$a0 = o$a0.d;
            }
            return v1;
        }
    }
}

