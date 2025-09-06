package dagger.internal;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import r3.c;

public final class s implements g {
    static class a {
    }

    public static final class b {
        private final List a;
        private final List b;
        static final boolean c;

        static {
        }

        private b(int v, int v1) {
            this.a = d.e(v);
            this.b = d.e(v1);
        }

        b(int v, int v1, a s$a0) {
            this(v, v1);
        }

        public b a(c c0) {
            this.b.add(c0);
            return this;
        }

        public b b(c c0) {
            this.a.add(c0);
            return this;
        }

        public s c() {
            return new s(this.a, this.b, null);
        }
    }

    private final List a;
    private final List b;
    private static final g c;

    static {
        s.c = j.a(Collections.emptySet());
    }

    private s(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    s(List list0, List list1, a s$a0) {
        this(list0, list1);
    }

    public static b a(int v, int v1) {
        return new b(v, v1, null);
    }

    public static g b() {
        return s.c;
    }

    public Set c() {
        int v = this.a.size();
        ArrayList arrayList0 = new ArrayList(this.b.size());
        int v1 = this.b.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Collection collection0 = (Collection)((c)this.b.get(v3)).get();
            v += collection0.size();
            arrayList0.add(collection0);
        }
        HashSet hashSet0 = d.c(v);
        int v4 = this.a.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            hashSet0.add(p.b(((c)this.a.get(v5)).get()));
        }
        int v6 = arrayList0.size();
        for(int v2 = 0; v2 < v6; ++v2) {
            for(Object object0: ((Collection)arrayList0.get(v2))) {
                hashSet0.add(p.b(object0));
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet0);
    }

    @Override  // r3.c
    public Object get() {
        return this.c();
    }
}

