package javassist.scopedpool;

import javassist.g;

public class c implements b {
    @Override  // javassist.scopedpool.b
    public a a(ClassLoader classLoader0, g g0, d d0) {
        return new a(classLoader0, g0, d0, false);
    }

    @Override  // javassist.scopedpool.b
    public a b(g g0, d d0) {
        return new a(null, g0, d0, true);
    }
}

