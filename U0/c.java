package u0;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c implements b {
    @h
    private static c a;

    static {
    }

    @Override  // u0.b
    public void a(u0.a a0) {
    }

    @Override  // u0.b
    public void b(u0.a a0) {
    }

    public static c c() {
        synchronized(c.class) {
            if(c.a == null) {
                c.a = new c();
            }
            return c.a;
        }
    }
}

