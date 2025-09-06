package androidx.compose.ui.input.pointer;

public final class PointerEvent_androidKt {
    public static final int a() [...] // 潜在的解密器

    public static final boolean b(int v) {
        return v != 0;
    }

    public static final int c(int v) {
        if(v == 0) {
            return -1;
        }
        int v1 = v & -97 | (v & 0x60) >>> 5;
        int v2 = 0;
        while((v1 & 1) == 0) {
            ++v2;
            v1 >>>= 1;
        }
        return v2;
    }

    public static final int d(int v) {
        int v1 = v & -97 | (v & 0x60) >>> 5;
        int v2 = -1;
        while(v1 != 0) {
            ++v2;
            v1 >>>= 1;
        }
        return v2;
    }

    public static final boolean e(int v) {
        return false;
    }

    public static final boolean f(int v) {
        return (v & 2) != 0;
    }

    public static final boolean g(int v) {
        return (v & 8) != 0;
    }

    public static final boolean h(int v) {
        return (v & 0x100000) != 0;
    }

    public static final boolean i(int v) {
        return (v & 0x1000) != 0;
    }

    public static final boolean j(int v) {
        return (v & 16) != 0;
    }

    public static final boolean k(int v) {
        return (v & 8) != 0;
    }

    public static final boolean l(int v) {
        return (v & 0x10000) != 0;
    }

    public static final boolean m(int v) {
        return (v & 0x200000) != 0;
    }

    public static final boolean n(int v, int v1) {
        switch(v1) {
            case 0: {
                return PointerEvent_androidKt.o(v);
            }
            case 1: {
                return PointerEvent_androidKt.q(v);
            }
            case 2: 
            case 3: 
            case 4: {
                return (v & 1 << v1) != 0;
            }
            default: {
                return (v & 1 << v1 + 2) != 0;
            }
        }
    }

    public static final boolean o(int v) {
        return (v & 33) != 0;
    }

    public static final boolean p(int v) {
        return (v & 0x400000) != 0;
    }

    public static final boolean q(int v) {
        return (v & 66) != 0;
    }

    public static final boolean r(int v) {
        return (v & 1) != 0;
    }

    public static final boolean s(int v) {
        return (v & 4) != 0;
    }

    public static final boolean t(int v) {
        return (v & 4) != 0;
    }
}

