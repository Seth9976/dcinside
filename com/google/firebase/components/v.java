package com.google.firebase.components;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class v {
    static class a {
    }

    static class b {
        private final g a;
        private final Set b;
        private final Set c;

        b(g g0) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.a = g0;
        }

        void a(b v$b0) {
            this.b.add(v$b0);
        }

        void b(b v$b0) {
            this.c.add(v$b0);
        }

        g c() {
            return this.a;
        }

        Set d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b v$b0) {
            this.c.remove(v$b0);
        }
    }

    static class c {
        private final K a;
        private final boolean b;

        private c(K k0, boolean z) {
            this.a = k0;
            this.b = z;
        }

        c(K k0, boolean z, a v$a0) {
            this(k0, z);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof c && ((c)object0).a.equals(this.a) && ((c)object0).b == this.b;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    static void a(List list0) {
        Set set0 = v.c(list0);
        Set set1 = v.b(set0);
        int v = 0;
        while(!set1.isEmpty()) {
            Object object0 = set1.iterator().next();
            b v$b0 = (b)object0;
            set1.remove(v$b0);
            ++v;
            for(Object object1: v$b0.d()) {
                b v$b1 = (b)object1;
                v$b1.g(v$b0);
                if(v$b1.f()) {
                    set1.add(v$b1);
                }
            }
        }
        if(v == list0.size()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: set0) {
            b v$b2 = (b)object2;
            if(!v$b2.f() && !v$b2.e()) {
                arrayList0.add(v$b2.c());
            }
        }
        throw new x(arrayList0);
    }

    private static Set b(Set set0) {
        Set set1 = new HashSet();
        for(Object object0: set0) {
            b v$b0 = (b)object0;
            if(v$b0.f()) {
                set1.add(v$b0);
            }
        }
        return set1;
    }

    private static Set c(List list0) {
        HashMap hashMap0 = new HashMap(list0.size());
        for(Object object0: list0) {
            g g0 = (g)object0;
            b v$b0 = new b(g0);
            for(Object object1: g0.m()) {
                K k0 = (K)object1;
                c v$c0 = new c(k0, !g0.v(), null);
                if(!hashMap0.containsKey(v$c0)) {
                    hashMap0.put(v$c0, new HashSet());
                }
                Set set0 = (Set)hashMap0.get(v$c0);
                if(!set0.isEmpty() && !v$c0.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", k0));
                }
                set0.add(v$b0);
            }
        }
        for(Object object2: hashMap0.values()) {
            for(Object object3: ((Set)object2)) {
                b v$b1 = (b)object3;
                for(Object object4: v$b1.c().j()) {
                    w w0 = (w)object4;
                    if(w0.f()) {
                        Set set1 = (Set)hashMap0.get(new c(w0.d(), w0.h(), null));
                        if(set1 != null) {
                            for(Object object5: set1) {
                                v$b1.a(((b)object5));
                                ((b)object5).b(v$b1);
                            }
                        }
                    }
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
        Set set2 = new HashSet();
        for(Object object6: hashMap0.values()) {
            ((AbstractCollection)set2).addAll(((Set)object6));
        }
        return set2;
    }
}

