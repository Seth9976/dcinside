package androidx.constraintlayout.core;

import java.util.Arrays;

public class ArrayLinkedVariables implements ArrayRowVariables {
    int a;
    private final ArrayRow b;
    protected final Cache c;
    private int d;
    private SolverVariable e;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;
    private static final boolean l = false;
    static final int m = -1;
    private static float n = 0.001f;

    static {
    }

    ArrayLinkedVariables(ArrayRow arrayRow0, Cache cache0) {
        this.a = 0;
        this.d = 8;
        this.e = null;
        this.f = new int[8];
        this.g = new int[8];
        this.h = new float[8];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = arrayRow0;
        this.c = cache0;
    }

    public int a() {
        return this.i;
    }

    public final int b(int v) {
        return this.f[v];
    }

    public final int c(int v) {
        return this.g[v];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void clear() {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            SolverVariable solverVariable0 = this.c.d[this.f[v]];
            if(solverVariable0 != null) {
                solverVariable0.g(this.b);
            }
            v = this.g[v];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    SolverVariable d() {
        SolverVariable solverVariable0 = this.e;
        if(solverVariable0 == null) {
            int v = this.i;
            SolverVariable solverVariable1 = null;
            for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
                if(this.h[v] < 0.0f) {
                    SolverVariable solverVariable2 = this.c.d[this.f[v]];
                    if(solverVariable1 == null || solverVariable1.e < solverVariable2.e) {
                        solverVariable1 = solverVariable2;
                    }
                }
                v = this.g[v];
            }
            return solverVariable1;
        }
        return solverVariable0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int e() {
        return this.a;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int f(SolverVariable solverVariable0) {
        int v = this.i;
        if(v == -1) {
            return -1;
        }
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.f[v] == solverVariable0.c) {
                return v;
            }
            v = this.g[v];
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public boolean g(SolverVariable solverVariable0) {
        int v = this.i;
        if(v == -1) {
            return false;
        }
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.f[v] == solverVariable0.c) {
                return true;
            }
            v = this.g[v];
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public SolverVariable h(int v) {
        int v1 = this.i;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.c.d[this.f[v1]];
            }
            v1 = this.g[v1];
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void i(SolverVariable solverVariable0, float f) {
        if(f == 0.0f) {
            this.n(solverVariable0, true);
            return;
        }
        int v = this.i;
        if(v == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = solverVariable0.c;
            this.g[0] = -1;
            ++solverVariable0.m;
            solverVariable0.a(this.b);
            ++this.a;
            if(!this.k) {
                int v1 = this.j + 1;
                this.j = v1;
                int[] arr_v = this.f;
                if(v1 >= arr_v.length) {
                    this.k = true;
                    this.j = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.f[v];
            int v5 = solverVariable0.c;
            if(v4 == v5) {
                this.h[v] = f;
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.g[v];
        }
        int v6 = this.j;
        if(this.k) {
            int[] arr_v1 = this.f;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.f.length && this.a < this.f.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.f;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.f;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.k = false;
            this.j = v6 - 1;
            this.h = Arrays.copyOf(this.h, v8);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[v6] = solverVariable0.c;
        this.h[v6] = f;
        if(v3 == -1) {
            this.g[v6] = this.i;
            this.i = v6;
        }
        else {
            int[] arr_v4 = this.g;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++solverVariable0.m;
        solverVariable0.a(this.b);
        int v9 = this.a + 1;
        this.a = v9;
        if(!this.k) {
            ++this.j;
        }
        int[] arr_v5 = this.f;
        if(v9 >= arr_v5.length) {
            this.k = true;
        }
        if(this.j >= arr_v5.length) {
            this.k = true;
            this.j = arr_v5.length - 1;
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float j(SolverVariable solverVariable0) {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.f[v] == solverVariable0.c) {
                return this.h[v];
            }
            v = this.g[v];
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void k(float f) {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.h[v] /= f;
            v = this.g[v];
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void l(SolverVariable solverVariable0, float f, boolean z) {
        if(f > -ArrayLinkedVariables.n && f < ArrayLinkedVariables.n) {
            return;
        }
        int v = this.i;
        if(v == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = solverVariable0.c;
            this.g[0] = -1;
            ++solverVariable0.m;
            solverVariable0.a(this.b);
            ++this.a;
            if(!this.k) {
                int v1 = this.j + 1;
                this.j = v1;
                int[] arr_v = this.f;
                if(v1 >= arr_v.length) {
                    this.k = true;
                    this.j = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.f[v];
            int v5 = solverVariable0.c;
            if(v4 == v5) {
                float[] arr_f = this.h;
                float f1 = arr_f[v] + f;
                if(f1 > -ArrayLinkedVariables.n && f1 < ArrayLinkedVariables.n) {
                    f1 = 0.0f;
                }
                arr_f[v] = f1;
                if(f1 == 0.0f) {
                    if(v == this.i) {
                        this.i = this.g[v];
                    }
                    else {
                        this.g[v3] = this.g[v];
                    }
                    if(z) {
                        solverVariable0.g(this.b);
                    }
                    if(this.k) {
                        this.j = v;
                    }
                    --solverVariable0.m;
                    --this.a;
                }
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.g[v];
        }
        int v6 = this.j;
        if(this.k) {
            int[] arr_v1 = this.f;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.f.length && this.a < this.f.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.f;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.f;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.k = false;
            this.j = v6 - 1;
            this.h = Arrays.copyOf(this.h, v8);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[v6] = solverVariable0.c;
        this.h[v6] = f;
        if(v3 == -1) {
            this.g[v6] = this.i;
            this.i = v6;
        }
        else {
            int[] arr_v4 = this.g;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++solverVariable0.m;
        solverVariable0.a(this.b);
        ++this.a;
        if(!this.k) {
            ++this.j;
        }
        int[] arr_v5 = this.f;
        if(this.j >= arr_v5.length) {
            this.k = true;
            this.j = arr_v5.length - 1;
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void m() {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.h[v] *= -1.0f;
            v = this.g[v];
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float n(SolverVariable solverVariable0, boolean z) {
        if(this.e == solverVariable0) {
            this.e = null;
        }
        int v = this.i;
        if(v == -1) {
            return 0.0f;
        }
        int v1 = 0;
        int v2 = -1;
        while(v != -1 && v1 < this.a) {
            if(this.f[v] == solverVariable0.c) {
                if(v == this.i) {
                    this.i = this.g[v];
                }
                else {
                    this.g[v2] = this.g[v];
                }
                if(z) {
                    solverVariable0.g(this.b);
                }
                --solverVariable0.m;
                --this.a;
                this.f[v] = -1;
                if(this.k) {
                    this.j = v;
                }
                return this.h[v];
            }
            ++v1;
            v2 = v;
            v = this.g[v];
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int o() {
        return this.f.length * 12 + 36;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void p() {
        int v = this.a;
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
        ArrayRowVariables arrayRow$ArrayRowVariables0 = arrayRow0.e;
        int v = arrayRow$ArrayRowVariables0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = arrayRow$ArrayRowVariables0.h(v1);
            this.l(solverVariable0, arrayRow$ArrayRowVariables0.j(solverVariable0) * f, z);
        }
        return f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float r(int v) {
        int v1 = this.i;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.h[v1];
            }
            v1 = this.g[v1];
        }
        return 0.0f;
    }

    public final float s(int v) {
        return this.h[v];
    }

    boolean t() {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.h[v] > 0.0f) {
                return true;
            }
            v = this.g[v];
        }
        return false;
    }

    @Override
    public String toString() {
        int v = this.i;
        String s = "";
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            s = s + " -> " + this.h[v] + " : " + this.c.d[this.f[v]];
            v = this.g[v];
        }
        return s;
    }
}

