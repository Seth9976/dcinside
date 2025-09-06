package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class Role {
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
        Role.b = new Companion(null);
        Role.c = 0;
        Role.d = 1;
        Role.e = 2;
        Role.f = 3;
        Role.g = 4;
        Role.h = 5;
        Role.i = 6;
    }

    private Role(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return Role.j(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final Role h(int v) {
        return new Role(v);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    private static int i(int v) [...] // Inlined contents

    public static boolean j(int v, Object object0) {
        return object0 instanceof Role ? v == ((Role)object0).n() : false;
    }

    public static final boolean k(int v, int v1) {
        return v == v1;
    }

    public static int l(int v) [...] // Inlined contents

    @l
    public static String m(int v) {
        if(Role.k(v, Role.c)) {
            return "Button";
        }
        if(Role.k(v, Role.d)) {
            return "Checkbox";
        }
        if(Role.k(v, 2)) {
            return "Switch";
        }
        if(Role.k(v, Role.f)) {
            return "RadioButton";
        }
        if(Role.k(v, 4)) {
            return "Tab";
        }
        if(Role.k(v, 5)) {
            return "Image";
        }
        return Role.k(v, Role.i) ? "DropdownList" : "Unknown";
    }

    public final int n() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return Role.m(this.a);
    }
}

