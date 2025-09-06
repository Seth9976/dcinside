package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class PointerType {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int d() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int e() [...] // 潜在的解密器
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;

    static {
        PointerType.b = new Companion(null);
        PointerType.c = 0;
        PointerType.d = 1;
        PointerType.e = 2;
        PointerType.f = 3;
        PointerType.g = 4;
    }

    private PointerType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return PointerType.h(this.a, object0);
    }

    public static final PointerType f(int v) {
        return new PointerType(v);
    }

    private static int g(int v) [...] // Inlined contents

    public static boolean h(int v, Object object0) {
        return object0 instanceof PointerType ? v == ((PointerType)object0).l() : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final boolean i(int v, int v1) {
        return v == v1;
    }

    public static int j(int v) [...] // Inlined contents

    @l
    public static String k(int v) {
        switch(v) {
            case 1: {
                return "Touch";
            }
            case 2: {
                return "Mouse";
            }
            case 3: {
                return "Stylus";
            }
            case 4: {
                return "Eraser";
            }
            default: {
                return "Unknown";
            }
        }
    }

    public final int l() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return PointerType.k(this.a);
    }
}

