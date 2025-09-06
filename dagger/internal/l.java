package dagger.internal;

import j..util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import r3.c;

public final class l extends a {
    static class dagger.internal.l.a {
    }

    public static final class b extends dagger.internal.a.a {
        private b(int v) {
            super(v);
        }

        b(int v, dagger.internal.l.a l$a0) {
            this(v);
        }

        @Override  // dagger.internal.a$a
        public dagger.internal.a.a a(Object object0, c c0) {
            return this.d(object0, c0);
        }

        @Override  // dagger.internal.a$a
        public dagger.internal.a.a b(c c0) {
            return this.e(c0);
        }

        public l c() {
            return new l(this.a, null);
        }

        public b d(Object object0, c c0) {
            super.a(object0, c0);
            return this;
        }

        public b e(c c0) {
            super.b(c0);
            return this;
        }
    }

    private static final c b;

    static {
        l.b = j.a(Collections.emptyMap());
    }

    private l(Map map0) {
        super(map0);
    }

    l(Map map0, dagger.internal.l.a l$a0) {
        this(map0);
    }

    public static b c(int v) {
        return new b(v, null);
    }

    public static c d() {
        return l.b;
    }

    public Map e() {
        LinkedHashMap linkedHashMap0 = d.d(this.b().size());
        for(Object object0: this.b().entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((c)((Map.Entry)object0).getValue()).get());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    @Override  // r3.c
    public Object get() {
        return this.e();
    }
}

