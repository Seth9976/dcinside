package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable implements Comparable {
    public static enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

        private static Type[] a() [...] // Inlined contents
    }

    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    private static int D = 1;
    private static int E = 1;
    private static int F = 1;
    private static int G = 1;
    private static int H = 1;
    static final int I = 9;
    public boolean a;
    private String b;
    public int c;
    int d;
    public int e;
    public float f;
    public boolean g;
    float[] h;
    float[] i;
    Type j;
    ArrayRow[] k;
    int l;
    public int m;
    boolean n;
    int o;
    float p;
    HashSet q;
    private static final boolean r = false;
    private static final boolean s = false;
    private static final boolean t = false;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;

    static {
    }

    public SolverVariable(Type solverVariable$Type0, String s) {
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.g = false;
        this.h = new float[9];
        this.i = new float[9];
        this.k = new ArrayRow[16];
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        this.q = null;
        this.j = solverVariable$Type0;
    }

    public SolverVariable(String s, Type solverVariable$Type0) {
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.g = false;
        this.h = new float[9];
        this.i = new float[9];
        this.k = new ArrayRow[16];
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        this.q = null;
        this.b = s;
        this.j = solverVariable$Type0;
    }

    public final void a(ArrayRow arrayRow0) {
        for(int v = 0; true; ++v) {
            int v1 = this.l;
            if(v >= v1) {
                break;
            }
            if(this.k[v] == arrayRow0) {
                return;
            }
        }
        ArrayRow[] arr_arrayRow = this.k;
        if(v1 >= arr_arrayRow.length) {
            this.k = (ArrayRow[])Arrays.copyOf(arr_arrayRow, arr_arrayRow.length * 2);
        }
        int v2 = this.l;
        this.k[v2] = arrayRow0;
        this.l = v2 + 1;
    }

    void b() {
        for(int v = 0; v < 9; ++v) {
            this.h[v] = 0.0f;
        }
    }

    public int c(SolverVariable solverVariable0) {
        return this.c - solverVariable0.c;
    }

    @Override
    public int compareTo(Object object0) {
        return this.c(((SolverVariable)object0));
    }

    public String d() {
        return this.b;
    }

    private static String e(Type solverVariable$Type0, String s) {
        if(s != null) {
            return s + SolverVariable.E;
        }
        switch(solverVariable$Type0.ordinal()) {
            case 0: {
                int v = SolverVariable.F + 1;
                SolverVariable.F = v;
                return "U" + v;
            }
            case 1: {
                int v1 = SolverVariable.G + 1;
                SolverVariable.G = v1;
                return "C" + v1;
            }
            case 2: {
                int v2 = SolverVariable.D + 1;
                SolverVariable.D = v2;
                return "S" + v2;
            }
            case 3: {
                int v3 = SolverVariable.E + 1;
                SolverVariable.E = v3;
                return "e" + v3;
            }
            case 4: {
                int v4 = SolverVariable.H + 1;
                SolverVariable.H = v4;
                return "V" + v4;
            }
            default: {
                throw new AssertionError(solverVariable$Type0.name());
            }
        }
    }

    static void f() {
        ++SolverVariable.E;
    }

    public final void g(ArrayRow arrayRow0) {
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.k[v1] == arrayRow0) {
                while(v1 < v - 1) {
                    this.k[v1] = this.k[v1 + 1];
                    ++v1;
                }
                --this.l;
                return;
            }
        }
    }

    public void h() {
        this.b = null;
        this.j = Type.e;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void i(LinearSystem linearSystem0, float f) {
        this.f = f;
        this.g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int v = this.l;
        this.d = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1].a(linearSystem0, this, false);
        }
        this.l = 0;
    }

    public void j(String s) {
        this.b = s;
    }

    public void k(LinearSystem linearSystem0, SolverVariable solverVariable0, float f) {
        this.n = true;
        this.o = solverVariable0.c;
        this.p = f;
        int v = this.l;
        this.d = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1].G(linearSystem0, this, false);
        }
        this.l = 0;
        linearSystem0.x();
    }

    public void l(Type solverVariable$Type0, String s) {
        this.j = solverVariable$Type0;
    }

    String m() {
        String s = this + "[";
        boolean z = false;
        boolean z1 = true;
        for(int v = 0; v < this.h.length; ++v) {
            String s1 = s + this.h[v];
            float[] arr_f = this.h;
            float f = arr_f[v];
            if(f > 0.0f) {
                z = false;
            }
            else if(f < 0.0f) {
                z = true;
            }
            if(f != 0.0f) {
                z1 = false;
            }
            s = v >= arr_f.length - 1 ? s1 + "] " : s1 + ", ";
        }
        if(z) {
            s = s + " (-)";
        }
        return z1 ? s + " (*)" : s;
    }

    public final void n(LinearSystem linearSystem0, ArrayRow arrayRow0) {
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1].b(linearSystem0, arrayRow0, false);
        }
        this.l = 0;
    }

    @Override
    public String toString() {
        return this.b == null ? "" + this.c : "" + this.b;
    }
}

