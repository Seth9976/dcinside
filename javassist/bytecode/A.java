package javassist.bytecode;

public class a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 0x20;
    public static final int g = 0x40;
    public static final int h = 0x40;
    public static final int i = 0x80;
    public static final int j = 0x80;
    public static final int k = 0x100;
    public static final int l = 0x200;
    public static final int m = 0x400;
    public static final int n = 0x800;
    public static final int o = 0x1000;
    public static final int p = 0x2000;
    public static final int q = 0x4000;
    public static final int r = 0x8000;
    public static final int s = 0x20;
    public static final int t = 0x8000;

    public static int a(int v, int v1) {
        return v & ~v1;
    }

    public static boolean b(int v) {
        return (v & 7) == 0;
    }

    public static boolean c(int v) {
        return (v & 2) != 0;
    }

    public static boolean d(int v) {
        return (v & 4) != 0;
    }

    public static boolean e(int v) {
        return (v & 1) != 0;
    }

    public static int f(int v) [...] // Inlined contents

    public static int g(int v) [...] // Inlined contents

    public static int h(int v) {
        return v & -6 | 2;
    }

    public static int i(int v) {
        return v & -4 | 4;
    }

    public static int j(int v) {
        return v & -7 | 1;
    }

    public static int k(int v) [...] // Inlined contents
}

