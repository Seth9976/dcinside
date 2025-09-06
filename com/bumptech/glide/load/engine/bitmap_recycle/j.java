package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class j implements b {
    static final class a implements m {
        private final com.bumptech.glide.load.engine.bitmap_recycle.j.b a;
        int b;
        private Class c;

        a(com.bumptech.glide.load.engine.bitmap_recycle.j.b j$b0) {
            this.a = j$b0;
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.a.c(this);
        }

        void b(int v, Class class0) {
            this.b = v;
            this.c = class0;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a && this.b == ((a)object0).b && this.c == ((a)object0).c;
        }

        @Override
        public int hashCode() {
            int v = this.b * 0x1F;
            return this.c == null ? v : v + this.c.hashCode();
        }

        @Override
        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    static final class com.bumptech.glide.load.engine.bitmap_recycle.j.b extends d {
        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected m a() {
            return this.d();
        }

        protected a d() {
            return new a(this);
        }

        a e(int v, Class class0) {
            a j$a0 = (a)this.b();
            j$a0.b(v, class0);
            return j$a0;
        }
    }

    private final h b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.j.b c;
    private final Map d;
    private final Map e;
    private final int f;
    private int g;
    private static final int h = 0x400000;
    @VisibleForTesting
    static final int i = 8;
    private static final int j = 2;

    @VisibleForTesting
    public j() {
        this.b = new h();
        this.c = new com.bumptech.glide.load.engine.bitmap_recycle.j.b();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = 0x400000;
    }

    public j(int v) {
        this.b = new h();
        this.c = new com.bumptech.glide.load.engine.bitmap_recycle.j.b();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = v;
    }

    private void a(int v, Class class0) {
        NavigableMap navigableMap0 = this.n(class0);
        Integer integer0 = (Integer)navigableMap0.get(v);
        if(integer0 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + v + ", this: " + this);
        }
        if(((int)integer0) == 1) {
            navigableMap0.remove(v);
            return;
        }
        navigableMap0.put(v, ((int)(((int)integer0) - 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    public void b(int v) {
        synchronized(this) {
            if(v >= 40) {
                this.c();
            }
            else if(v >= 20 || v == 15) {
                this.h(this.f / 2);
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    public void c() {
        synchronized(this) {
            this.h(0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    public Object d(int v, Class class0) {
        synchronized(this) {
            Integer integer0 = (Integer)this.n(class0).ceilingKey(v);
            return this.m((this.q(v, integer0) ? this.c.e(((int)integer0), class0) : this.c.e(v, class0)), class0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    public Object e(int v, Class class0) {
        synchronized(this) {
            return this.m(this.c.e(v, class0), class0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public void f(Object object0, Class class0) {
        this.put(object0);
    }

    private void g() {
        this.h(this.f);
    }

    private void h(int v) {
        while(this.g > v) {
            Object object0 = this.b.f();
            com.bumptech.glide.util.m.e(object0);
            com.bumptech.glide.load.engine.bitmap_recycle.a a0 = this.i(object0);
            this.g -= a0.a(object0) * a0.b();
            this.a(a0.a(object0), object0.getClass());
            if(Log.isLoggable(a0.getTag(), 2)) {
                Log.v(a0.getTag(), "evicted: " + a0.a(object0));
            }
        }
    }

    private com.bumptech.glide.load.engine.bitmap_recycle.a i(Object object0) {
        return this.j(object0.getClass());
    }

    private com.bumptech.glide.load.engine.bitmap_recycle.a j(Class class0) {
        com.bumptech.glide.load.engine.bitmap_recycle.a a0 = (com.bumptech.glide.load.engine.bitmap_recycle.a)this.e.get(class0);
        if(a0 == null) {
            if(class0.equals(int[].class)) {
                a0 = new i();
            }
            else if(class0.equals(byte[].class)) {
                a0 = new g();
            }
            else {
                throw new IllegalArgumentException("No array pool found for: " + class0.getSimpleName());
            }
            this.e.put(class0, a0);
            return a0;
        }
        return a0;
    }

    @Nullable
    private Object k(a j$a0) {
        return this.b.a(j$a0);
    }

    int l() {
        int v = 0;
        for(Object object0: this.d.keySet()) {
            Class class0 = (Class)object0;
            for(Object object1: ((NavigableMap)this.d.get(class0)).keySet()) {
                com.bumptech.glide.load.engine.bitmap_recycle.a a0 = this.j(class0);
                v += ((int)(((Integer)object1))) * ((int)(((Integer)((NavigableMap)this.d.get(class0)).get(((Integer)object1))))) * a0.b();
            }
        }
        return v;
    }

    private Object m(a j$a0, Class class0) {
        com.bumptech.glide.load.engine.bitmap_recycle.a a0 = this.j(class0);
        Object object0 = this.k(j$a0);
        if(object0 != null) {
            this.g -= a0.a(object0) * a0.b();
            this.a(a0.a(object0), class0);
        }
        if(object0 == null) {
            if(Log.isLoggable(a0.getTag(), 2)) {
                Log.v(a0.getTag(), "Allocated " + j$a0.b + " bytes");
            }
            return a0.newArray(j$a0.b);
        }
        return object0;
    }

    private NavigableMap n(Class class0) {
        NavigableMap navigableMap0 = (NavigableMap)this.d.get(class0);
        if(navigableMap0 == null) {
            navigableMap0 = new TreeMap();
            this.d.put(class0, navigableMap0);
        }
        return navigableMap0;
    }

    private boolean o() {
        return this.g == 0 || this.f / this.g >= 2;
    }

    private boolean p(int v) {
        return v <= this.f / 2;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.b
    public void put(Object object0) {
        synchronized(this) {
            Class class0 = object0.getClass();
            com.bumptech.glide.load.engine.bitmap_recycle.a a0 = this.j(class0);
            int v1 = a0.a(object0);
            int v2 = a0.b() * v1;
            if(!this.p(v2)) {
                return;
            }
            a j$a0 = this.c.e(v1, class0);
            this.b.d(j$a0, object0);
            NavigableMap navigableMap0 = this.n(class0);
            Integer integer0 = (Integer)navigableMap0.get(j$a0.b);
            navigableMap0.put(j$a0.b, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
            this.g += v2;
            this.g();
        }
    }

    private boolean q(int v, Integer integer0) {
        return integer0 != null && (this.o() || ((int)integer0) <= v * 8);
    }
}

