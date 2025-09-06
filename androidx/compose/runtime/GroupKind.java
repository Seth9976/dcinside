package androidx.compose.runtime;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
final class GroupKind {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        GroupKind.b = new Companion(null);
        GroupKind.c = 0;
        GroupKind.d = 1;
        GroupKind.e = 2;
    }

    private GroupKind(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final GroupKind d(int v) {
        return new GroupKind(v);
    }

    private static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return GroupKind.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof GroupKind ? v == ((GroupKind)object0).m() : false;
    }

    public static final boolean g(int v, int v1) {
        return v == v1;
    }

    public final int h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static final boolean j(int v) {
        return v != 0;
    }

    // 去混淆评级： 低(20)
    public static final boolean k(int v) {
        return v != 1;
    }

    public static String l(int v) [...] // Inlined contents

    public final int m() {
        return this.a;
    }

    @Override
    public String toString() {
        return "GroupKind(value=" + this.a + ')';
    }
}

