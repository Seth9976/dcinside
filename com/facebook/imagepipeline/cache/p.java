package com.facebook.imagepipeline.cache;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public class p {
    private final H a;
    @p3.a("this")
    private final LinkedHashMap b;
    @p3.a("this")
    private int c;

    public p(H h0) {
        this.b = new LinkedHashMap();
        this.c = 0;
        this.a = h0;
    }

    public ArrayList a() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.b.values());
            this.b.clear();
            this.c = 0;
            return arrayList0;
        }
    }

    public boolean b(Object object0) {
        synchronized(this) {
            return this.b.containsKey(object0);
        }
    }

    @h
    public Object c(Object object0) {
        synchronized(this) {
            return this.b.get(object0);
        }
    }

    public int d() {
        synchronized(this) {
        }
        return this.b.size();
    }

    @h
    public Object e() {
        synchronized(this) {
            return this.b.isEmpty() ? null : this.b.keySet().iterator().next();
        }
    }

    @VisibleForTesting
    ArrayList f() {
        synchronized(this) {
            return new ArrayList(this.b.keySet());
        }
    }

    public ArrayList g(@h o o0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.b.entrySet().size());
            for(Object object0: this.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(o0 == null || o0.apply(map$Entry0.getKey())) {
                    arrayList0.add(map$Entry0);
                }
            }
            return arrayList0;
        }
    }

    public int h() {
        synchronized(this) {
        }
        return this.c;
    }

    private int i(@h Object object0) {
        return object0 == null ? 0 : this.a.a(object0);
    }

    @VisibleForTesting
    ArrayList j() {
        synchronized(this) {
            return new ArrayList(this.b.values());
        }
    }

    @h
    public Object k(Object object0, Object object1) {
        synchronized(this) {
            Object object2 = this.b.remove(object0);
            this.c -= this.i(object2);
            this.b.put(object0, object1);
            this.c += this.i(object1);
            return object2;
        }
    }

    @h
    public Object l(Object object0) {
        synchronized(this) {
            Object object1 = this.b.remove(object0);
            this.c -= this.i(object1);
            return object1;
        }
    }

    public ArrayList m(@h o o0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = this.b.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(o0 == null || o0.apply(map$Entry0.getKey())) {
                    arrayList0.add(map$Entry0.getValue());
                    this.c -= this.i(map$Entry0.getValue());
                    iterator0.remove();
                }
            }
            return arrayList0;
        }
    }

    public void n() {
        synchronized(this) {
            if(this.b.isEmpty()) {
                this.c = 0;
            }
        }
    }
}

