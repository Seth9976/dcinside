package org.bson.internal;

import java.util.NoSuchElementException;

abstract class g {
    class a extends g {
        a() {
            super();
        }

        @Override  // org.bson.internal.g
        public Object b() {
            throw new NoSuchElementException(".get call on None!");
        }

        @Override  // org.bson.internal.g
        public boolean d() {
            return true;
        }
    }

    public static class b extends g {
        private final Object b;

        b(Object object0) {
            this.b = object0;
        }

        @Override  // org.bson.internal.g
        public Object b() {
            return this.b;
        }

        @Override  // org.bson.internal.g
        public boolean c() {
            return super.c();
        }

        @Override  // org.bson.internal.g
        public boolean d() {
            return false;
        }

        @Override  // org.bson.internal.g
        public String toString() {
            return String.format("Some(%s)", this.b);
        }
    }

    private static final g a;

    static {
        g.a = new a();
    }

    public static g a() {
        return g.a;
    }

    public abstract Object b();

    public boolean c() {
        return !this.d();
    }

    public abstract boolean d();

    public static g e(Object object0) {
        return object0 == null ? g.a : new b(object0);
    }

    @Override
    public String toString() {
        return "None";
    }
}

