package kotlin.internal;

import kotlin.b0;
import kotlin.h0;
import kotlin.internal.jdk8.d;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class m {
    @l
    @f
    public static final kotlin.internal.l a;

    static {
        m.a = new d();
    }

    @b0
    @h0(version = "1.2")
    public static final boolean a(int v, int v1, int v2) [...] // 潜在的解密器

    @kotlin.internal.f
    private static final Object b(Object object0) {
        try {
            L.y(1, "T");
            return object0;
        }
        catch(ClassCastException classCastException0) {
            ClassLoader classLoader0 = object0.getClass().getClassLoader();
            L.y(4, "T");
            ClassLoader classLoader1 = Object.class.getClassLoader();
            if(!L.g(classLoader0, classLoader1)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader0 + ", base type classloader: " + classLoader1, classCastException0);
            }
            throw classCastException0;
        }
    }
}

