package androidx.constraintlayout.core;

import java.util.Arrays;

public class SolverVariableValues implements ArrayRowVariables {
    private final int a;
    private int b;
    private int c;
    int[] d;
    int[] e;
    int[] f;
    float[] g;
    int[] h;
    int[] i;
    int j;
    int k;
    private final ArrayRow l;
    protected final Cache m;
    private static final boolean n = false;
    private static final boolean o = true;
    private static float p = 0.001f;

    static {
    }

    SolverVariableValues(ArrayRow arrayRow0, Cache cache0) {
        this.a = -1;
        this.b = 16;
        this.c = 16;
        this.d = new int[16];
        this.e = new int[16];
        this.f = new int[16];
        this.g = new float[16];
        this.h = new int[16];
        this.i = new int[16];
        this.j = 0;
        this.k = -1;
        this.l = arrayRow0;
        this.m = cache0;
        this.clear();
    }

    private void a(SolverVariable solverVariable0, int v) {
        int[] arr_v1;
        int v1 = solverVariable0.c % this.c;
        int[] arr_v = this.d;
        int v2 = arr_v[v1];
        if(v2 == -1) {
            arr_v[v1] = v;
        }
        else {
            while(true) {
                arr_v1 = this.e;
                int v3 = arr_v1[v2];
                if(v3 == -1) {
                    break;
                }
                v2 = v3;
            }
            arr_v1[v2] = v;
        }
        this.e[v] = -1;
    }

    private void b(int v, SolverVariable solverVariable0, float f) {
        this.f[v] = solverVariable0.c;
        this.g[v] = f;
        this.h[v] = -1;
        this.i[v] = -1;
        solverVariable0.a(this.l);
        ++solverVariable0.m;
        ++this.j;
    }

    private void c() {
        for(int v = 0; v < this.c; ++v) {
            if(this.d[v] != -1) {
                String s = this.hashCode() + " hash [" + v + "] => ";
                int v1 = this.d[v];
                boolean z = false;
                while(!z) {
                    s = s + " " + this.f[v1];
                    int v2 = this.e[v1];
                    if(v2 == -1) {
                        z = true;
                    }
                    else {
                        v1 = v2;
                    }
                }
                System.out.println(s);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void clear() {
        int v = this.j;
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.h(v1);
            if(solverVariable0 != null) {
                solverVariable0.g(this.l);
            }
        }
        for(int v2 = 0; v2 < this.b; ++v2) {
            this.f[v2] = -1;
            this.e[v2] = -1;
        }
        for(int v3 = 0; v3 < this.c; ++v3) {
            this.d[v3] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    private int d() {
        for(int v = 0; v < this.b; ++v) {
            if(this.f[v] == -1) {
                return v;
            }
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int e() {
        return this.j;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int f(SolverVariable solverVariable0) {
        if(this.j != 0 && solverVariable0 != null) {
            int v = solverVariable0.c;
            int v1 = this.d[v % this.c];
            if(v1 == -1) {
                return -1;
            }
            if(this.f[v1] == v) {
                return v1;
            }
            do {
                v1 = this.e[v1];
            }
            while(v1 != -1 && this.f[v1] != v);
            if(v1 == -1) {
                return -1;
            }
            return this.f[v1] == v ? v1 : -1;
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public boolean g(SolverVariable solverVariable0) {
        return this.f(solverVariable0) != -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public SolverVariable h(int v) {
        int v1 = this.j;
        if(v1 == 0) {
            return null;
        }
        int v2 = this.k;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v && v2 != -1) {
                return this.m.d[this.f[v2]];
            }
            v2 = this.i[v2];
            if(v2 == -1) {
                break;
            }
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void i(SolverVariable solverVariable0, float f) {
        if(f > -SolverVariableValues.p && f < SolverVariableValues.p) {
            this.n(solverVariable0, true);
            return;
        }
        if(this.j == 0) {
            this.b(0, solverVariable0, f);
            this.a(solverVariable0, 0);
            this.k = 0;
            return;
        }
        int v1 = this.f(solverVariable0);
        if(v1 != -1) {
            this.g[v1] = f;
            return;
        }
        if(this.j + 1 >= this.b) {
            this.s();
        }
        int v2 = this.j;
        int v3 = this.k;
        int v4 = -1;
        for(int v = 0; v < v2; ++v) {
            int v5 = this.f[v3];
            int v6 = solverVariable0.c;
            if(v5 == v6) {
                this.g[v3] = f;
                return;
            }
            if(v5 < v6) {
                v4 = v3;
            }
            v3 = this.i[v3];
            if(v3 == -1) {
                break;
            }
        }
        this.t(v4, solverVariable0, f);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float j(SolverVariable solverVariable0) {
        int v = this.f(solverVariable0);
        return v == -1 ? 0.0f : this.g[v];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void k(float f) {
        int v = this.j;
        int v1 = this.k;
        for(int v2 = 0; v2 < v; ++v2) {
            this.g[v1] /= f;
            v1 = this.i[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void l(SolverVariable solverVariable0, float f, boolean z) {
        if(f > -SolverVariableValues.p && f < SolverVariableValues.p) {
            return;
        }
        int v = this.f(solverVariable0);
        if(v == -1) {
            this.i(solverVariable0, f);
            return;
        }
        float[] arr_f = this.g;
        float f1 = arr_f[v] + f;
        arr_f[v] = f1;
        if(f1 > -SolverVariableValues.p && f1 < SolverVariableValues.p) {
            arr_f[v] = 0.0f;
            this.n(solverVariable0, z);
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void m() {
        int v = this.j;
        int v1 = this.k;
        for(int v2 = 0; v2 < v; ++v2) {
            this.g[v1] *= -1.0f;
            v1 = this.i[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float n(SolverVariable solverVariable0, boolean z) {
        int v = this.f(solverVariable0);
        if(v == -1) {
            return 0.0f;
        }
        this.u(solverVariable0);
        float f = this.g[v];
        if(this.k == v) {
            this.k = this.i[v];
        }
        this.f[v] = -1;
        int[] arr_v = this.h;
        int v1 = arr_v[v];
        if(v1 != -1) {
            this.i[v1] = this.i[v];
        }
        int v2 = this.i[v];
        if(v2 != -1) {
            arr_v[v2] = arr_v[v];
        }
        --this.j;
        --solverVariable0.m;
        if(z) {
            solverVariable0.g(this.l);
        }
        return f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int o() {
        return 0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void p() {
        int v = this.j;
        System.out.print("{ ");
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.h(v1);
            if(solverVariable0 != null) {
                System.out.print(solverVariable0 + " = " + this.r(v1) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float q(ArrayRow arrayRow0, boolean z) {
        float f = this.j(arrayRow0.a);
        this.n(arrayRow0.a, z);
        SolverVariableValues solverVariableValues0 = (SolverVariableValues)arrayRow0.e;
        int v = solverVariableValues0.e();
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = solverVariableValues0.f[v2];
            if(v3 != -1) {
                this.l(this.m.d[v3], solverVariableValues0.g[v2] * f, z);
                ++v1;
            }
        }
        return f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float r(int v) {
        int v1 = this.j;
        int v2 = this.k;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v) {
                return this.g[v2];
            }
            v2 = this.i[v2];
            if(v2 == -1) {
                break;
            }
        }
        return 0.0f;
    }

    private void s() {
        int v = this.b * 2;
        this.f = Arrays.copyOf(this.f, v);
        this.g = Arrays.copyOf(this.g, v);
        this.h = Arrays.copyOf(this.h, v);
        this.i = Arrays.copyOf(this.i, v);
        this.e = Arrays.copyOf(this.e, v);
        for(int v1 = this.b; v1 < v; ++v1) {
            this.f[v1] = -1;
            this.e[v1] = -1;
        }
        this.b = v;
    }

    private void t(int v, SolverVariable solverVariable0, float f) {
        int v1 = this.d();
        this.b(v1, solverVariable0, f);
        if(v == -1) {
            this.h[v1] = -1;
            if(this.j > 0) {
                this.i[v1] = this.k;
                this.k = v1;
            }
            else {
                this.i[v1] = -1;
            }
        }
        else {
            this.h[v1] = v;
            int[] arr_v = this.i;
            arr_v[v1] = arr_v[v];
            arr_v[v] = v1;
        }
        int v2 = this.i[v1];
        if(v2 != -1) {
            this.h[v2] = v1;
        }
        this.a(solverVariable0, v1);
    }

    @Override
    public String toString() {
        String s = this.hashCode() + " { ";
        int v = this.j;
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.h(v1);
            if(solverVariable0 != null) {
                int v2 = this.f(solverVariable0);
                String s1 = s + solverVariable0 + " = " + this.r(v1) + " " + "[p: ";
                String s2 = this.h[v2] == -1 ? s1 + "none" : s1 + this.m.d[this.f[this.h[v2]]];
                s = (this.i[v2] == -1 ? s2 + ", n: " + "none" : s2 + ", n: " + this.m.d[this.f[this.i[v2]]]) + "]";
            }
        }
        return s + " }";
    }

    private void u(SolverVariable solverVariable0) {
        int v3;
        int[] arr_v2;
        int v = solverVariable0.c;
        int v1 = v % this.c;
        int[] arr_v = this.d;
        int v2 = arr_v[v1];
        if(v2 == -1) {
            return;
        }
        if(this.f[v2] == v) {
            int[] arr_v1 = this.e;
            arr_v[v1] = arr_v1[v2];
            arr_v1[v2] = -1;
            return;
        }
        while(true) {
            arr_v2 = this.e;
            v3 = arr_v2[v2];
            if(v3 == -1 || this.f[v3] == v) {
                break;
            }
            v2 = v3;
        }
        if(v3 != -1 && this.f[v3] == v) {
            arr_v2[v2] = arr_v2[v3];
            arr_v2[v3] = -1;
        }
    }
}

