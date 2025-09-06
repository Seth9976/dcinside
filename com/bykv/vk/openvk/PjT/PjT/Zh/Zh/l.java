package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class l {
    public class a {
        final String a;
        int b;
        final l c;

        a(String s) {
            this.a = s;
        }

        void a() {
            l.f.add(this.a);
        }

        void b() {
            l.g.add(this.a);
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final ArrayList a;
    private final int b;
    private int c;
    private int d;
    private final int e;
    private static final Set f;
    private static final Set g;

    static {
        l.f = new HashSet();
        l.g = new HashSet();
    }

    l(String s) {
        this.c = -1;
        ArrayList arrayList0 = new ArrayList(1);
        this.a = arrayList0;
        arrayList0.add(new a(this, s));
        this.b = 1;
        this.e = 1;
    }

    l(List list0) {
        int v1;
        this.c = -1;
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("urls can\'t be empty");
        }
        int v = list0.size();
        this.b = v;
        this.a = new ArrayList(v);
        Collection collection0 = null;
        ArrayList arrayList0 = null;
        for(Object object0: list0) {
            String s = (String)object0;
            a l$a0 = new a(this, s);
            if(l.f.contains(s)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(l$a0);
            }
            else if(l.g.contains(s)) {
                if(collection0 == null) {
                    collection0 = new ArrayList();
                }
                ((ArrayList)collection0).add(l$a0);
            }
            else {
                this.a.add(l$a0);
            }
        }
        if(collection0 != null) {
            this.a.addAll(collection0);
        }
        if(arrayList0 != null) {
            this.a.addAll(arrayList0);
        }
        Integer integer0 = c.k;
        if(integer0 == null || ((int)integer0) <= 0) {
            v1 = this.b < 2 ? 2 : 1;
        }
        else {
            v1 = (int)integer0;
        }
        this.e = v1;
    }

    boolean a() {
        return this.d < this.e;
    }

    a c() {
        if(!this.a()) {
            throw new NoSuchElementException();
        }
        int v = this.c + 1;
        if(v >= this.b - 1) {
            this.c = -1;
            ++this.d;
        }
        else {
            this.c = v;
        }
        a l$a0 = (a)this.a.get(v);
        l$a0.b = this.d * this.b + this.c;
        return l$a0;
    }
}

