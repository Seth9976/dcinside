package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class PointerEventType {
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

        // 去混淆评级： 低(20)
        public final int f() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int g() [...] // 潜在的解密器
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;

    static {
        PointerEventType.b = new Companion(null);
        PointerEventType.c = 0;
        PointerEventType.d = 1;
        PointerEventType.e = 2;
        PointerEventType.f = 3;
        PointerEventType.g = 4;
        PointerEventType.h = 5;
        PointerEventType.i = 6;
    }

    private PointerEventType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return PointerEventType.j(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final PointerEventType h(int v) {
        return new PointerEventType(v);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    private static int i(int v) [...] // Inlined contents

    public static boolean j(int v, Object object0) {
        return object0 instanceof PointerEventType ? v == ((PointerEventType)object0).n() : false;
    }

    public static final boolean k(int v, int v1) {
        return v == v1;
    }

    public static int l(int v) [...] // Inlined contents

    @l
    public static String m(int v) {
        if(PointerEventType.k(v, PointerEventType.d)) {
            return "Press";
        }
        if(PointerEventType.k(v, PointerEventType.e)) {
            return "Release";
        }
        if(PointerEventType.k(v, 3)) {
            return "Move";
        }
        if(PointerEventType.k(v, 4)) {
            return "Enter";
        }
        if(PointerEventType.k(v, 5)) {
            return "Exit";
        }
        return PointerEventType.k(v, PointerEventType.i) ? "Scroll" : "Unknown";
    }

    public final int n() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return PointerEventType.m(this.a);
    }
}

