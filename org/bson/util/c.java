package org.bson.util;

import java.util.List;
import java.util.Map;

@Deprecated
public class c {
    static class a {
    }

    final class b implements f {
        final c a;

        private b() {
        }

        b(a c$a0) {
        }

        public Object a(Class class0) {
            for(Object object0: c.d(class0)) {
                Object object1 = c.this.a.get(((Class)object0));
                if(object1 != null) {
                    return object1;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        @Override  // org.bson.util.f
        public Object apply(Object object0) {
            return this.a(((Class)object0));
        }
    }

    private final Map a;
    private final Map b;

    public c() {
        this.a = e.i();
        this.b = d.a(new b(this, null));
    }

    public void b() {
        this.a.clear();
        this.b.clear();
    }

    public Object c(Object object0) {
        return this.b.get(object0);
    }

    public static List d(Class class0) {
        return org.bson.util.b.c(class0);
    }

    public boolean e() {
        return this.a.isEmpty();
    }

    public Object f(Class class0, Object object0) {
        try {
            return this.a.put(class0, object0);
        }
        finally {
            this.b.clear();
        }
    }

    public Object g(Object object0) {
        try {
            return this.a.remove(object0);
        }
        finally {
            this.b.clear();
        }
    }

    public int h() {
        return this.a.size();
    }
}

