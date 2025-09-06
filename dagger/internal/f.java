package dagger.internal;

import a3.e;
import r3.c;

public final class f implements e, c {
    private volatile c a;
    private volatile Object b;
    private static final Object c;
    static final boolean d;

    static {
        f.c = new Object();
    }

    private f(c c0) {
        this.b = f.c;
        this.a = c0;
    }

    public static e a(c c0) {
        return c0 instanceof e ? ((e)c0) : new f(((c)p.b(c0)));
    }

    public static c b(c c0) {
        p.b(c0);
        return c0 instanceof f ? c0 : new f(c0);
    }

    public static Object c(Object object0, Object object1) {
        if(object0 != f.c && !(object0 instanceof o) && object0 != object1) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object0 + " & " + object1 + ". This is likely due to a circular dependency.");
        }
        return object1;
    }

    @Override  // r3.c, a3.e
    public Object get() {
        Object object0 = this.b;
        Object object1 = f.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.get();
                    this.b = f.c(this.b, object0);
                    this.a = null;
                }
            }
        }
        return object0;
    }
}

