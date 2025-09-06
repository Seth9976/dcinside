package j$.util.stream;

import j..util.Map.-EL;
import j..util.Spliterator;
import java.util.EnumMap;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
final class c3 extends Enum {
    public static final enum c3 DISTINCT;
    public static final enum c3 ORDERED;
    public static final enum c3 SHORT_CIRCUIT;
    public static final enum c3 SIZED;
    public static final enum c3 SORTED;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final c3[] v;

    static {
        a3 a30 = new a3(new EnumMap(b3.class));
        a30.a(b3.SPLITERATOR);
        a30.a(b3.STREAM);
        a30.a.put(b3.OP, 3);
        c3.DISTINCT = new c3("DISTINCT", 0, 0, a30);
        a3 a31 = new a3(new EnumMap(b3.class));
        a31.a(b3.SPLITERATOR);
        a31.a(b3.STREAM);
        a31.a.put(b3.OP, 3);
        c3.SORTED = new c3("SORTED", 1, 1, a31);
        a3 a32 = new a3(new EnumMap(b3.class));
        a32.a(b3.SPLITERATOR);
        a32.a(b3.STREAM);
        a32.a.put(b3.OP, 3);
        a32.a.put(b3.TERMINAL_OP, 2);
        a32.a.put(b3.UPSTREAM_TERMINAL_OP, 2);
        c3.ORDERED = new c3("ORDERED", 2, 2, a32);
        a3 a33 = new a3(new EnumMap(b3.class));
        a33.a(b3.SPLITERATOR);
        a33.a(b3.STREAM);
        a33.a.put(b3.OP, 2);
        c3.SIZED = new c3("SIZED", 3, 3, a33);
        a3 a34 = new a3(new EnumMap(b3.class));
        a34.a(b3.OP);
        a34.a(b3.TERMINAL_OP);
        c3.SHORT_CIRCUIT = new c3("SHORT_CIRCUIT", 4, 12, a34);
        c3.v = new c3[]{c3.DISTINCT, c3.SORTED, c3.ORDERED, c3.SIZED, c3.SHORT_CIRCUIT};
        b3 b30 = b3.SPLITERATOR;
        c3[] arr_c3 = (c3[])c3.v.clone();
        int v2 = 0;
        for(int v1 = 0; v1 < arr_c3.length; ++v1) {
            c3 c30 = arr_c3[v1];
            v2 |= ((int)(((Integer)c30.a.get(b30)))) << c30.b;
        }
        c3.f = v2;
        b3 b31 = b3.STREAM;
        c3[] arr_c31 = (c3[])c3.v.clone();
        int v4 = 0;
        for(int v3 = 0; v3 < arr_c31.length; ++v3) {
            c3 c31 = arr_c31[v3];
            v4 |= ((int)(((Integer)c31.a.get(b31)))) << c31.b;
        }
        c3.g = v4;
        b3 b32 = b3.OP;
        c3[] arr_c32 = (c3[])c3.v.clone();
        int v6 = 0;
        for(int v5 = 0; v5 < arr_c32.length; ++v5) {
            c3 c32 = arr_c32[v5];
            v6 |= ((int)(((Integer)c32.a.get(b32)))) << c32.b;
        }
        c3.h = v6;
        b3 b33 = b3.TERMINAL_OP;
        c3[] arr_c33 = (c3[])c3.v.clone();
        int v8 = 0;
        for(int v7 = 0; v7 < arr_c33.length; ++v7) {
            c3 c33 = arr_c33[v7];
            v8 |= ((int)(((Integer)c33.a.get(b33)))) << c33.b;
        }
        b3 b34 = b3.UPSTREAM_TERMINAL_OP;
        c3[] arr_c34 = (c3[])c3.v.clone();
        int v10 = 0;
        for(int v9 = 0; v9 < arr_c34.length; ++v9) {
            c3 c34 = arr_c34[v9];
            v10 |= ((int)(((Integer)c34.a.get(b34)))) << c34.b;
        }
        c3[] arr_c35 = (c3[])c3.v.clone();
        int v11 = 0;
        for(int v = 0; v < arr_c35.length; ++v) {
            v11 |= arr_c35[v].e;
        }
        c3.i = v11;
        c3.j = c3.g;
        c3.k = c3.g << 1;
        c3.l = c3.g | c3.g << 1;
        c3.m = c3.DISTINCT.c;
        c3.n = c3.DISTINCT.d;
        c3.o = c3.SORTED.c;
        c3.p = c3.SORTED.d;
        c3.q = c3.ORDERED.c;
        c3.r = c3.ORDERED.d;
        c3.s = c3.SIZED.c;
        c3.t = c3.SIZED.d;
        c3.u = c3.SHORT_CIRCUIT.c;
    }

    private c3(String s, int v, int v1, a3 a30) {
        super(s, v);
        EnumMap enumMap0;
        b3[] arr_b3 = b3.values();
        for(int v2 = 0; true; ++v2) {
            enumMap0 = a30.a;
            if(v2 >= arr_b3.length) {
                break;
            }
            Map.-EL.putIfAbsent(enumMap0, arr_b3[v2], 0);
        }
        this.a = enumMap0;
        this.b = v1 * 2;
        this.c = 1 << v1 * 2;
        this.d = 2 << v1 * 2;
        this.e = 3 << v1 * 2;
    }

    static int l(int v, int v1) {
        return v == 0 ? v1 & c3.i : v | v1 & ~((c3.j & v) << 1 | v | (c3.k & v) >> 1);
    }

    private static int n(b3 b30) [...] // Inlined contents

    static int p(Spliterator spliterator0) {
        int v = spliterator0.characteristics();
        return (v & 4) == 0 || spliterator0.getComparator() == null ? v & c3.f : v & c3.f & -5;
    }

    final boolean q(int v) {
        return (v & this.e) == this.c;
    }

    final boolean u(int v) {
        return (v & this.e) == this.e;
    }

    public static c3 valueOf(String s) {
        return (c3)Enum.valueOf(c3.class, s);
    }

    public static c3[] values() [...] // Inlined contents

    private static a3 y(b3 b30) [...] // Inlined contents

    static int z(int v) {
        return v & (~v >> 1 & c3.j);
    }
}

