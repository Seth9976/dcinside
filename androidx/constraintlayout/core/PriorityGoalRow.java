package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityGoalRow extends ArrayRow {
    class GoalVariableAccessor {
        SolverVariable a;
        PriorityGoalRow b;
        final PriorityGoalRow c;

        GoalVariableAccessor(PriorityGoalRow priorityGoalRow1) {
            this.b = priorityGoalRow1;
        }

        public void a(SolverVariable solverVariable0) {
            for(int v = 0; v < 9; ++v) {
                float[] arr_f = this.a.i;
                float f = arr_f[v] + solverVariable0.i[v];
                arr_f[v] = f;
                if(Math.abs(f) < 0.0001f) {
                    this.a.i[v] = 0.0f;
                }
            }
        }

        public boolean b(SolverVariable solverVariable0, float f) {
            boolean z = true;
            if(this.a.a) {
                for(int v1 = 0; v1 < 9; ++v1) {
                    float[] arr_f = this.a.i;
                    float f1 = arr_f[v1] + solverVariable0.i[v1] * f;
                    arr_f[v1] = f1;
                    if(Math.abs(f1) < 0.0001f) {
                        this.a.i[v1] = 0.0f;
                    }
                    else {
                        z = false;
                    }
                }
                if(z) {
                    PriorityGoalRow.this.J(this.a);
                }
                return false;
            }
            for(int v = 0; v < 9; ++v) {
                float f2 = solverVariable0.i[v];
                if(f2 == 0.0f) {
                    this.a.i[v] = 0.0f;
                }
                else {
                    this.a.i[v] = Math.abs(f2 * f) < 0.0001f ? 0.0f : f2 * f;
                }
            }
            return true;
        }

        public void c(SolverVariable solverVariable0) {
            this.a = solverVariable0;
        }

        public final boolean d() {
            for(int v = 8; v >= 0; --v) {
                float f = this.a.i[v];
                if(f > 0.0f) {
                    return false;
                }
                if(f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for(int v = 0; v < 9; ++v) {
                if(this.a.i[v] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(SolverVariable solverVariable0) {
            int v = 8;
            while(v >= 0) {
                float f = solverVariable0.i[v];
                float f1 = this.a.i[v];
                if(f1 == f) {
                    --v;
                    continue;
                }
                return f1 < f;
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.a.i, 0.0f);
        }

        @Override
        public String toString() {
            String s = "[ ";
            if(this.a != null) {
                for(int v = 0; v < 9; ++v) {
                    s = s + this.a.i[v] + " ";
                }
            }
            return s + "] " + this.a;
        }
    }

    private int i;
    private SolverVariable[] j;
    private SolverVariable[] k;
    private int l;
    GoalVariableAccessor m;
    Cache n;
    private static final float o = 0.0001f;
    private static final boolean p = false;
    static final int q = -1;

    public PriorityGoalRow(Cache cache0) {
        super(cache0);
        this.i = 0x80;
        this.j = new SolverVariable[0x80];
        this.k = new SolverVariable[0x80];
        this.l = 0;
        this.m = new GoalVariableAccessor(this, this);
        this.n = cache0;
    }

    private void I(SolverVariable solverVariable0) {
        int v3;
        SolverVariable[] arr_solverVariable = this.j;
        if(this.l + 1 > arr_solverVariable.length) {
            SolverVariable[] arr_solverVariable1 = (SolverVariable[])Arrays.copyOf(arr_solverVariable, arr_solverVariable.length * 2);
            this.j = arr_solverVariable1;
            this.k = (SolverVariable[])Arrays.copyOf(arr_solverVariable1, arr_solverVariable1.length * 2);
        }
        SolverVariable[] arr_solverVariable2 = this.j;
        int v = this.l;
        arr_solverVariable2[v] = solverVariable0;
        this.l = v + 1;
        if(v + 1 > 1 && arr_solverVariable2[v].c > solverVariable0.c) {
            for(int v2 = 0; true; ++v2) {
                v3 = this.l;
                if(v2 >= v3) {
                    break;
                }
                this.k[v2] = this.j[v2];
            }
            Arrays.sort(this.k, 0, v3, new Comparator() {
                final PriorityGoalRow a;

                public int b(SolverVariable solverVariable0, SolverVariable solverVariable1) {
                    return solverVariable0.c - solverVariable1.c;
                }

                @Override
                public int compare(Object object0, Object object1) {
                    return this.b(((SolverVariable)object0), ((SolverVariable)object1));
                }
            });
            for(int v1 = 0; v1 < this.l; ++v1) {
                this.j[v1] = this.k[v1];
            }
        }
        solverVariable0.a = true;
        solverVariable0.a(this);
    }

    private void J(SolverVariable solverVariable0) {
        int v1;
        for(int v = 0; v < this.l; ++v) {
            if(this.j[v] == solverVariable0) {
                while(true) {
                    v1 = this.l;
                    if(v >= v1 - 1) {
                        break;
                    }
                    this.j[v] = this.j[v + 1];
                    ++v;
                }
                this.l = v1 - 1;
                solverVariable0.a = false;
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void b(LinearSystem linearSystem0, ArrayRow arrayRow0, boolean z) {
        SolverVariable solverVariable0 = arrayRow0.a;
        if(solverVariable0 == null) {
            return;
        }
        ArrayRowVariables arrayRow$ArrayRowVariables0 = arrayRow0.e;
        int v = arrayRow$ArrayRowVariables0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable1 = arrayRow$ArrayRowVariables0.h(v1);
            float f = arrayRow$ArrayRowVariables0.r(v1);
            this.m.c(solverVariable1);
            if(this.m.b(solverVariable0, f)) {
                this.I(solverVariable1);
            }
            this.b += arrayRow0.b * f;
        }
        this.J(solverVariable0);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public SolverVariable c(LinearSystem linearSystem0, boolean[] arr_z) {
        int v1 = -1;
        for(int v = 0; v < this.l; ++v) {
            SolverVariable solverVariable0 = this.j[v];
            if(!arr_z[solverVariable0.c]) {
                this.m.c(solverVariable0);
                if(v1 != -1) {
                    if(this.m.f(this.j[v1])) {
                        v1 = v;
                    }
                }
                else if(this.m.d()) {
                    v1 = v;
                }
            }
        }
        return v1 == -1 ? null : this.j[v1];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void clear() {
        this.l = 0;
        this.b = 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void f(SolverVariable solverVariable0) {
        this.m.c(solverVariable0);
        this.m.g();
        solverVariable0.i[solverVariable0.e] = 1.0f;
        this.I(solverVariable0);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public boolean isEmpty() {
        return this.l == 0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String s = " goal -> (" + this.b + ") : ";
        for(int v = 0; v < this.l; ++v) {
            this.m.c(this.j[v]);
            s = s + this.m + " ";
        }
        return s;
    }
}

