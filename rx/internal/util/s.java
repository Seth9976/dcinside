package rx.internal.util;

import rx.functions.p;

public final class s {
    static enum a implements p {
        INSTANCE;

        public Boolean a(Object object0) {
            return false;
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(object0);
        }
    }

    static enum b implements p {
        INSTANCE;

        public Boolean a(Object object0) {
            return true;
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(object0);
        }
    }

    static enum c implements p {
        INSTANCE;

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return object0;
        }
    }

    private s() {
        throw new IllegalStateException("No instances!");
    }

    public static p a() {
        return a.a;
    }

    public static p b() [...] // Inlined contents

    public static p c() {
        return c.a;
    }
}

