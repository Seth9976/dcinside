package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    interface Row {
        void a(LinearSystem arg1, SolverVariable arg2, boolean arg3);

        void b(LinearSystem arg1, ArrayRow arg2, boolean arg3);

        SolverVariable c(LinearSystem arg1, boolean[] arg2);

        void clear();

        void d(LinearSystem arg1);

        void e(Row arg1);

        void f(SolverVariable arg1);

        SolverVariable getKey();

        boolean isEmpty();
    }

    static class ValuesRow extends ArrayRow {
        ValuesRow(Cache cache0) {
            this.e = new SolverVariableValues(this, cache0);
        }
    }

    public static boolean A = true;
    public static boolean B = false;
    public static Metrics C = null;
    public static long D = 0L;
    public static long E = 0L;
    private int a;
    public boolean b;
    int c;
    private HashMap d;
    private Row e;
    private int f;
    private int g;
    ArrayRow[] h;
    public boolean i;
    public boolean j;
    private boolean[] k;
    int l;
    int m;
    private int n;
    final Cache o;
    private SolverVariable[] p;
    private int q;
    private Row r;
    public static final boolean s = false;
    public static final boolean t = false;
    private static final boolean u = false;
    private static final boolean v = false;
    public static boolean w = false;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = true;

    static {
    }

    public LinearSystem() {
        this.a = 1000;
        this.b = false;
        this.c = 0;
        this.d = null;
        this.f = 0x20;
        this.g = 0x20;
        this.i = false;
        this.j = false;
        this.k = new boolean[0x20];
        this.l = 1;
        this.m = 0;
        this.n = 0x20;
        this.p = new SolverVariable[1000];
        this.q = 0;
        this.h = new ArrayRow[0x20];
        this.U();
        Cache cache0 = new Cache();
        this.o = cache0;
        this.e = new PriorityGoalRow(cache0);
        if(LinearSystem.B) {
            this.r = new ValuesRow(cache0);
            return;
        }
        this.r = new ArrayRow(cache0);
    }

    void A() {
        int v1 = 0;
        for(int v = 0; v < this.f; ++v) {
            ArrayRow arrayRow0 = this.h[v];
            if(arrayRow0 != null) {
                v1 += arrayRow0.E();
            }
        }
        int v3 = 0;
        for(int v2 = 0; v2 < this.m; ++v2) {
            ArrayRow arrayRow1 = this.h[v2];
            if(arrayRow1 != null) {
                v3 += arrayRow1.E();
            }
        }
        System.out.println("Linear System -> Table size: " + this.f + " (" + this.F(this.f * this.f) + ") -- row sizes: " + this.F(v1) + ", actual size: " + this.F(v3) + " rows: " + this.m + "/" + this.n + " cols: " + this.l + "/" + this.g + " " + 0 + " occupied cells, " + "0 bytes");
    }

    public void B() {
        this.z();
        String s = "";
        for(int v = 0; v < this.m; ++v) {
            if(this.h[v].a.j == Type.a) {
                s = s + this.h[v].F() + "\n";
            }
        }
        System.out.println(s + this.e + "\n");
    }

    private int C(Row linearSystem$Row0) throws Exception {
        for(int v = 0; v < this.m; ++v) {
            ArrayRow arrayRow0 = this.h[v];
            if(arrayRow0.a.j != Type.a && arrayRow0.b < 0.0f) {
                int v1 = 0;
                boolean z = false;
                while(!z) {
                    Metrics metrics0 = LinearSystem.C;
                    if(metrics0 != null) {
                        ++metrics0.o;
                    }
                    ++v1;
                    float f = 3.402823E+38f;
                    int v3 = -1;
                    int v4 = -1;
                    int v5 = 0;
                    for(int v2 = 0; v2 < this.m; ++v2) {
                        ArrayRow arrayRow1 = this.h[v2];
                        if(arrayRow1.a.j != Type.a && !arrayRow1.f && arrayRow1.b < 0.0f) {
                            if(LinearSystem.A) {
                                int v7 = arrayRow1.e.e();
                                for(int v8 = 0; v8 < v7; ++v8) {
                                    SolverVariable solverVariable0 = arrayRow1.e.h(v8);
                                    float f1 = arrayRow1.e.j(solverVariable0);
                                    if(f1 > 0.0f) {
                                        for(int v9 = 0; v9 < 9; ++v9) {
                                            float f2 = solverVariable0.h[v9] / f1;
                                            if(f2 < f && v9 == v5 || v9 > v5) {
                                                v5 = v9;
                                                v4 = solverVariable0.c;
                                                v3 = v2;
                                                f = f2;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                for(int v6 = 1; v6 < this.l; ++v6) {
                                    SolverVariable solverVariable1 = this.o.d[v6];
                                    float f3 = arrayRow1.e.j(solverVariable1);
                                    if(f3 > 0.0f) {
                                        for(int v10 = 0; v10 < 9; ++v10) {
                                            float f4 = solverVariable1.h[v10] / f3;
                                            if(f4 < f && v10 == v5 || v10 > v5) {
                                                v5 = v10;
                                                v3 = v2;
                                                v4 = v6;
                                                f = f4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v3 == -1) {
                        z = true;
                    }
                    else {
                        ArrayRow arrayRow2 = this.h[v3];
                        arrayRow2.a.d = -1;
                        Metrics metrics1 = LinearSystem.C;
                        if(metrics1 != null) {
                            ++metrics1.n;
                        }
                        arrayRow2.C(this.o.d[v4]);
                        arrayRow2.a.d = v3;
                        arrayRow2.a.n(this, arrayRow2);
                    }
                    if(v1 > this.l / 2) {
                        z = true;
                    }
                }
                return v1;
            }
        }
        return 0;
    }

    public void D(Metrics metrics0) {
        LinearSystem.C = metrics0;
    }

    public Cache E() {
        return this.o;
    }

    private String F(int v) [...] // 潜在的解密器

    private String G(int v) {
        switch(v) {
            case 1: {
                return "LOW";
            }
            case 2: {
                return "MEDIUM";
            }
            case 3: {
                return "HIGH";
            }
            case 4: {
                return "HIGHEST";
            }
            case 5: {
                return "EQUALITY";
            }
            case 6: {
                return "BARRIER";
            }
            case 8: {
                return "FIXED";
            }
            default: {
                return "NONE";
            }
        }
    }

    Row H() {
        return this.e;
    }

    public int I() {
        int v1 = 0;
        for(int v = 0; v < this.m; ++v) {
            ArrayRow arrayRow0 = this.h[v];
            if(arrayRow0 != null) {
                v1 += arrayRow0.E();
            }
        }
        return v1;
    }

    public static Metrics J() {
        return LinearSystem.C;
    }

    public int K() {
        return this.m;
    }

    public int L() {
        return this.c;
    }

    public int M(Object object0) {
        SolverVariable solverVariable0 = ((ConstraintAnchor)object0).j();
        return solverVariable0 == null ? 0 : ((int)(solverVariable0.f + 0.5f));
    }

    ArrayRow N(int v) {
        return this.h[v];
    }

    float O(String s) {
        SolverVariable solverVariable0 = this.P(s, Type.a);
        return solverVariable0 == null ? 0.0f : solverVariable0.f;
    }

    SolverVariable P(String s, Type solverVariable$Type0) {
        if(this.d == null) {
            this.d = new HashMap();
        }
        SolverVariable solverVariable0 = (SolverVariable)this.d.get(s);
        return solverVariable0 == null ? this.w(s, solverVariable$Type0) : solverVariable0;
    }

    private void Q() {
        int v = this.f * 2;
        this.f = v;
        this.h = (ArrayRow[])Arrays.copyOf(this.h, v);
        this.o.d = (SolverVariable[])Arrays.copyOf(this.o.d, this.f);
        int v1 = this.f;
        this.k = new boolean[v1];
        this.g = v1;
        this.n = v1;
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.h;
            metrics0.t = Math.max(metrics0.t, v1);
            LinearSystem.C.E = LinearSystem.C.t;
        }
    }

    public void R() throws Exception {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.i;
        }
        if(this.e.isEmpty()) {
            this.p();
            return;
        }
        if(!this.i && !this.j) {
            this.S(this.e);
            return;
        }
        Metrics metrics1 = LinearSystem.C;
        if(metrics1 != null) {
            ++metrics1.v;
        }
        for(int v = 0; v < this.m; ++v) {
            if(!this.h[v].f) {
                this.S(this.e);
                return;
            }
        }
        Metrics metrics2 = LinearSystem.C;
        if(metrics2 != null) {
            ++metrics2.u;
        }
        this.p();
    }

    void S(Row linearSystem$Row0) throws Exception {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.z;
            metrics0.A = Math.max(metrics0.A, this.l);
            LinearSystem.C.B = Math.max(LinearSystem.C.B, this.m);
        }
        this.C(linearSystem$Row0);
        this.T(linearSystem$Row0, false);
        this.p();
    }

    private int T(Row linearSystem$Row0, boolean z) {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.l;
        }
        for(int v = 0; v < this.l; ++v) {
            this.k[v] = false;
        }
        int v1 = 0;
        boolean z1 = false;
        while(!z1) {
            Metrics metrics1 = LinearSystem.C;
            if(metrics1 != null) {
                ++metrics1.m;
            }
            ++v1;
            if(v1 >= this.l * 2) {
                return v1;
            }
            if(linearSystem$Row0.getKey() != null) {
                boolean[] arr_z = this.k;
                arr_z[linearSystem$Row0.getKey().c] = true;
            }
            SolverVariable solverVariable0 = linearSystem$Row0.c(this, this.k);
            if(solverVariable0 != null) {
                boolean[] arr_z1 = this.k;
                int v2 = solverVariable0.c;
                if(arr_z1[v2]) {
                    return v1;
                }
                arr_z1[v2] = true;
            }
            if(solverVariable0 == null) {
                z1 = true;
            }
            else {
                float f = 3.402823E+38f;
                int v4 = -1;
                for(int v3 = 0; v3 < this.m; ++v3) {
                    ArrayRow arrayRow0 = this.h[v3];
                    if(arrayRow0.a.j != Type.a && !arrayRow0.f && arrayRow0.y(solverVariable0)) {
                        float f1 = arrayRow0.e.j(solverVariable0);
                        if(f1 < 0.0f) {
                            float f2 = -arrayRow0.b / f1;
                            if(f2 < f) {
                                v4 = v3;
                                f = f2;
                            }
                        }
                    }
                }
                if(v4 <= -1) {
                    continue;
                }
                ArrayRow arrayRow1 = this.h[v4];
                arrayRow1.a.d = -1;
                Metrics metrics2 = LinearSystem.C;
                if(metrics2 != null) {
                    ++metrics2.n;
                }
                arrayRow1.C(solverVariable0);
                arrayRow1.a.d = v4;
                arrayRow1.a.n(this, arrayRow1);
            }
        }
        return v1;
    }

    private void U() {
        int v = 0;
        if(LinearSystem.B) {
            while(v < this.m) {
                ArrayRow arrayRow0 = this.h[v];
                if(arrayRow0 != null) {
                    this.o.a.a(arrayRow0);
                }
                this.h[v] = null;
                ++v;
            }
            return;
        }
        while(v < this.m) {
            ArrayRow arrayRow1 = this.h[v];
            if(arrayRow1 != null) {
                this.o.b.a(arrayRow1);
            }
            this.h[v] = null;
            ++v;
        }
    }

    public void V(ArrayRow arrayRow0) {
        int v1;
        if(arrayRow0.f) {
            SolverVariable solverVariable0 = arrayRow0.a;
            if(solverVariable0 != null) {
                int v = solverVariable0.d;
                if(v != -1) {
                    while(true) {
                        v1 = this.m;
                        if(v >= v1 - 1) {
                            break;
                        }
                        ArrayRow[] arr_arrayRow = this.h;
                        ArrayRow arrayRow1 = arr_arrayRow[v + 1];
                        SolverVariable solverVariable1 = arrayRow1.a;
                        if(solverVariable1.d == v + 1) {
                            solverVariable1.d = v;
                        }
                        arr_arrayRow[v] = arrayRow1;
                        ++v;
                    }
                    this.m = v1 - 1;
                }
                SolverVariable solverVariable2 = arrayRow0.a;
                if(!solverVariable2.g) {
                    solverVariable2.i(this, arrayRow0.b);
                }
                if(LinearSystem.B) {
                    this.o.a.a(arrayRow0);
                    return;
                }
                this.o.b.a(arrayRow0);
            }
        }
    }

    public void W() {
        Cache cache0;
        for(int v = 0; true; ++v) {
            cache0 = this.o;
            SolverVariable[] arr_solverVariable = cache0.d;
            if(v >= arr_solverVariable.length) {
                break;
            }
            SolverVariable solverVariable0 = arr_solverVariable[v];
            if(solverVariable0 != null) {
                solverVariable0.h();
            }
        }
        cache0.c.c(this.p, this.q);
        this.q = 0;
        Arrays.fill(this.o.d, null);
        HashMap hashMap0 = this.d;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
        this.c = 0;
        this.e.clear();
        this.l = 1;
        for(int v1 = 0; v1 < this.m; ++v1) {
            ArrayRow arrayRow0 = this.h[v1];
            if(arrayRow0 != null) {
                arrayRow0.c = false;
            }
        }
        this.U();
        this.m = 0;
        if(LinearSystem.B) {
            this.r = new ValuesRow(this.o);
            return;
        }
        this.r = new ArrayRow(this.o);
    }

    private SolverVariable a(Type solverVariable$Type0, String s) {
        SolverVariable solverVariable0 = (SolverVariable)this.o.c.b();
        if(solverVariable0 == null) {
            solverVariable0 = new SolverVariable(solverVariable$Type0, s);
        }
        else {
            solverVariable0.h();
        }
        solverVariable0.l(solverVariable$Type0, s);
        int v = this.a;
        if(this.q >= v) {
            this.a = v * 2;
            this.p = (SolverVariable[])Arrays.copyOf(this.p, v * 2);
        }
        int v1 = this.q;
        this.q = v1 + 1;
        this.p[v1] = solverVariable0;
        return solverVariable0;
    }

    public void b(ConstraintWidget constraintWidget0, ConstraintWidget constraintWidget1, float f, int v) {
        SolverVariable solverVariable0 = this.s(constraintWidget0.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.b));
        SolverVariable solverVariable1 = this.s(constraintWidget0.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.c));
        SolverVariable solverVariable2 = this.s(constraintWidget0.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.d));
        SolverVariable solverVariable3 = this.s(constraintWidget0.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.e));
        SolverVariable solverVariable4 = this.s(constraintWidget1.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.b));
        SolverVariable solverVariable5 = this.s(constraintWidget1.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.c));
        SolverVariable solverVariable6 = this.s(constraintWidget1.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.d));
        SolverVariable solverVariable7 = this.s(constraintWidget1.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.e));
        ArrayRow arrayRow0 = this.t();
        arrayRow0.v(solverVariable1, solverVariable3, solverVariable5, solverVariable7, ((float)(Math.sin(f) * ((double)v))));
        this.d(arrayRow0);
        ArrayRow arrayRow1 = this.t();
        arrayRow1.v(solverVariable0, solverVariable2, solverVariable4, solverVariable6, ((float)(Math.cos(f) * ((double)v))));
        this.d(arrayRow1);
    }

    public void c(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, float f, SolverVariable solverVariable2, SolverVariable solverVariable3, int v1, int v2) {
        ArrayRow arrayRow0 = this.t();
        arrayRow0.k(solverVariable0, solverVariable1, v, f, solverVariable2, solverVariable3, v1);
        if(v2 != 8) {
            arrayRow0.g(this, v2);
        }
        this.d(arrayRow0);
    }

    public void d(ArrayRow arrayRow0) {
        if(arrayRow0 == null) {
            return;
        }
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.j;
            if(arrayRow0.f) {
                ++metrics0.k;
            }
        }
        int v = 1;
        if(this.m + 1 >= this.n || this.l + 1 >= this.g) {
            this.Q();
        }
        int v1 = 0;
        if(!arrayRow0.f) {
            arrayRow0.d(this);
            if(arrayRow0.isEmpty()) {
                return;
            }
            arrayRow0.w();
            if(arrayRow0.i(this)) {
                SolverVariable solverVariable0 = this.r();
                arrayRow0.a = solverVariable0;
                int v2 = this.m;
                this.l(arrayRow0);
                if(this.m == v2 + 1) {
                    this.r.e(arrayRow0);
                    this.T(this.r, true);
                    if(solverVariable0.d == -1) {
                        if(arrayRow0.a == solverVariable0) {
                            SolverVariable solverVariable1 = arrayRow0.A(solverVariable0);
                            if(solverVariable1 != null) {
                                Metrics metrics1 = LinearSystem.C;
                                if(metrics1 != null) {
                                    ++metrics1.n;
                                }
                                arrayRow0.C(solverVariable1);
                            }
                        }
                        if(!arrayRow0.f) {
                            arrayRow0.a.n(this, arrayRow0);
                        }
                        if(LinearSystem.B) {
                            this.o.a.a(arrayRow0);
                        }
                        else {
                            this.o.b.a(arrayRow0);
                        }
                        --this.m;
                    }
                }
                else {
                    v = 0;
                }
            }
            else {
                v = 0;
            }
            if(!arrayRow0.x()) {
                return;
            }
            v1 = v;
        }
        if(v1 == 0) {
            this.l(arrayRow0);
        }
    }

    public ArrayRow e(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.U;
        }
        if(LinearSystem.x && v1 == 8 && solverVariable1.g && solverVariable0.d == -1) {
            solverVariable0.i(this, solverVariable1.f + ((float)v));
            return null;
        }
        ArrayRow arrayRow0 = this.t();
        arrayRow0.r(solverVariable0, solverVariable1, v);
        if(v1 != 8) {
            arrayRow0.g(this, v1);
        }
        this.d(arrayRow0);
        return arrayRow0;
    }

    public void f(SolverVariable solverVariable0, int v) {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.U;
        }
        if(LinearSystem.x && solverVariable0.d == -1) {
            solverVariable0.i(this, ((float)v));
            for(int v1 = 0; v1 < this.c + 1; ++v1) {
                SolverVariable solverVariable1 = this.o.d[v1];
                if(solverVariable1 != null && solverVariable1.n && solverVariable1.o == solverVariable0.c) {
                    solverVariable1.i(this, solverVariable1.p + ((float)v));
                }
            }
            return;
        }
        int v2 = solverVariable0.d;
        if(v2 != -1) {
            ArrayRow arrayRow0 = this.h[v2];
            if(arrayRow0.f) {
                arrayRow0.b = (float)v;
                return;
            }
            if(arrayRow0.e.e() == 0) {
                arrayRow0.f = true;
                arrayRow0.b = (float)v;
                return;
            }
            ArrayRow arrayRow1 = this.t();
            arrayRow1.q(solverVariable0, v);
            this.d(arrayRow1);
            return;
        }
        ArrayRow arrayRow2 = this.t();
        arrayRow2.l(solverVariable0, v);
        this.d(arrayRow2);
    }

    public void g(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, boolean z) {
        ArrayRow arrayRow0 = this.t();
        SolverVariable solverVariable2 = this.v();
        solverVariable2.e = 0;
        arrayRow0.t(solverVariable0, solverVariable1, solverVariable2, v);
        this.d(arrayRow0);
    }

    public void h(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        ArrayRow arrayRow0 = this.t();
        SolverVariable solverVariable2 = this.v();
        solverVariable2.e = 0;
        arrayRow0.t(solverVariable0, solverVariable1, solverVariable2, v);
        if(v1 != 8) {
            this.m(arrayRow0, ((int)(arrayRow0.e.j(solverVariable2) * -1.0f)), v1);
        }
        this.d(arrayRow0);
    }

    public void i(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, boolean z) {
        ArrayRow arrayRow0 = this.t();
        SolverVariable solverVariable2 = this.v();
        solverVariable2.e = 0;
        arrayRow0.u(solverVariable0, solverVariable1, solverVariable2, v);
        this.d(arrayRow0);
    }

    public void j(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        ArrayRow arrayRow0 = this.t();
        SolverVariable solverVariable2 = this.v();
        solverVariable2.e = 0;
        arrayRow0.u(solverVariable0, solverVariable1, solverVariable2, v);
        if(v1 != 8) {
            this.m(arrayRow0, ((int)(arrayRow0.e.j(solverVariable2) * -1.0f)), v1);
        }
        this.d(arrayRow0);
    }

    public void k(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, int v) {
        ArrayRow arrayRow0 = this.t();
        arrayRow0.n(solverVariable0, solverVariable1, solverVariable2, solverVariable3, f);
        if(v != 8) {
            arrayRow0.g(this, v);
        }
        this.d(arrayRow0);
    }

    private void l(ArrayRow arrayRow0) {
        int v4;
        if(!LinearSystem.y || !arrayRow0.f) {
            int v = this.m;
            this.h[v] = arrayRow0;
            arrayRow0.a.d = v;
            this.m = v + 1;
            arrayRow0.a.n(this, arrayRow0);
        }
        else {
            arrayRow0.a.i(this, arrayRow0.b);
        }
        if(LinearSystem.y && this.b) {
            for(int v1 = 0; v1 < this.m; ++v1) {
                if(this.h[v1] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow1 = this.h[v1];
                if(arrayRow1 != null && arrayRow1.f) {
                    arrayRow1.a.i(this, arrayRow1.b);
                    if(LinearSystem.B) {
                        this.o.a.a(arrayRow1);
                    }
                    else {
                        this.o.b.a(arrayRow1);
                    }
                    this.h[v1] = null;
                    int v2 = v1 + 1;
                    int v3 = v2;
                    while(true) {
                        v4 = this.m;
                        if(v2 >= v4) {
                            break;
                        }
                        ArrayRow[] arr_arrayRow = this.h;
                        ArrayRow arrayRow2 = arr_arrayRow[v2];
                        arr_arrayRow[v2 - 1] = arrayRow2;
                        SolverVariable solverVariable0 = arrayRow2.a;
                        if(solverVariable0.d == v2) {
                            solverVariable0.d = v2 - 1;
                        }
                        v3 = v2;
                        ++v2;
                    }
                    if(v3 < v4) {
                        this.h[v3] = null;
                    }
                    this.m = v4 - 1;
                    --v1;
                }
            }
            this.b = false;
        }
    }

    void m(ArrayRow arrayRow0, int v, int v1) {
        arrayRow0.h(this.q(v1, null), v);
    }

    public void n(SolverVariable solverVariable0, SolverVariable solverVariable1, int v) {
        if(solverVariable0.d == -1 && v == 0) {
            if(solverVariable1.n) {
                solverVariable1 = this.o.d[solverVariable1.o];
            }
            if(solverVariable0.n) {
                SolverVariable solverVariable2 = this.o.d[solverVariable0.o];
                return;
            }
            solverVariable0.k(this, solverVariable1, 0.0f);
            return;
        }
        this.e(solverVariable0, solverVariable1, v, 8);
    }

    final void o() {
        int v2;
        for(int v = 0; v < this.m; ++v) {
            ArrayRow arrayRow0 = this.h[v];
            if(arrayRow0.e.e() == 0) {
                arrayRow0.f = true;
            }
            if(arrayRow0.f) {
                arrayRow0.a.f = arrayRow0.b;
                arrayRow0.a.g(arrayRow0);
                for(int v1 = v; true; ++v1) {
                    v2 = this.m;
                    if(v1 >= v2 - 1) {
                        break;
                    }
                    this.h[v1] = this.h[v1 + 1];
                }
                this.h[v2 - 1] = null;
                this.m = v2 - 1;
                --v;
                if(LinearSystem.B) {
                    this.o.a.a(arrayRow0);
                }
                else {
                    this.o.b.a(arrayRow0);
                }
            }
        }
    }

    private void p() {
        for(int v = 0; v < this.m; ++v) {
            ArrayRow arrayRow0 = this.h[v];
            arrayRow0.a.f = arrayRow0.b;
        }
    }

    public SolverVariable q(int v, String s) {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.q;
        }
        if(this.l + 1 >= this.g) {
            this.Q();
        }
        SolverVariable solverVariable0 = this.a(Type.d, s);
        int v1 = this.c + 1;
        this.c = v1;
        ++this.l;
        solverVariable0.c = v1;
        solverVariable0.e = v;
        this.o.d[v1] = solverVariable0;
        this.e.f(solverVariable0);
        return solverVariable0;
    }

    public SolverVariable r() {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.s;
        }
        if(this.l + 1 >= this.g) {
            this.Q();
        }
        SolverVariable solverVariable0 = this.a(Type.c, null);
        int v = this.c + 1;
        this.c = v;
        ++this.l;
        solverVariable0.c = v;
        this.o.d[v] = solverVariable0;
        return solverVariable0;
    }

    public SolverVariable s(Object object0) {
        SolverVariable solverVariable0 = null;
        if(object0 == null) {
            return null;
        }
        if(this.l + 1 >= this.g) {
            this.Q();
        }
        if(object0 instanceof ConstraintAnchor) {
            solverVariable0 = ((ConstraintAnchor)object0).j();
            if(solverVariable0 == null) {
                ((ConstraintAnchor)object0).z(this.o);
                solverVariable0 = ((ConstraintAnchor)object0).j();
            }
            int v = solverVariable0.c;
            if(v == -1 || v > this.c || this.o.d[v] == null) {
                if(v != -1) {
                    solverVariable0.h();
                }
                int v1 = this.c + 1;
                this.c = v1;
                ++this.l;
                solverVariable0.c = v1;
                solverVariable0.j = Type.a;
                this.o.d[v1] = solverVariable0;
            }
        }
        return solverVariable0;
    }

    public ArrayRow t() {
        ArrayRow arrayRow0;
        if(LinearSystem.B) {
            arrayRow0 = (ArrayRow)this.o.a.b();
            if(arrayRow0 == null) {
                arrayRow0 = new ValuesRow(this.o);
                ++LinearSystem.E;
            }
            else {
                arrayRow0.D();
            }
        }
        else {
            arrayRow0 = (ArrayRow)this.o.b.b();
            if(arrayRow0 == null) {
                arrayRow0 = new ArrayRow(this.o);
                ++LinearSystem.D;
            }
            else {
                arrayRow0.D();
            }
        }
        SolverVariable.f();
        return arrayRow0;
    }

    public static ArrayRow u(LinearSystem linearSystem0, SolverVariable solverVariable0, SolverVariable solverVariable1, float f) {
        return linearSystem0.t().m(solverVariable0, solverVariable1, f);
    }

    public SolverVariable v() {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.r;
        }
        if(this.l + 1 >= this.g) {
            this.Q();
        }
        SolverVariable solverVariable0 = this.a(Type.c, null);
        int v = this.c + 1;
        this.c = v;
        ++this.l;
        solverVariable0.c = v;
        this.o.d[v] = solverVariable0;
        return solverVariable0;
    }

    private SolverVariable w(String s, Type solverVariable$Type0) {
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.p;
        }
        if(this.l + 1 >= this.g) {
            this.Q();
        }
        SolverVariable solverVariable0 = this.a(solverVariable$Type0, null);
        solverVariable0.j(s);
        int v = this.c + 1;
        this.c = v;
        ++this.l;
        solverVariable0.c = v;
        if(this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(s, solverVariable0);
        this.o.d[this.c] = solverVariable0;
        return solverVariable0;
    }

    public void x() {
        this.z();
        String s = " num vars " + this.c + "\n";
        for(int v1 = 0; v1 < this.c + 1; ++v1) {
            SolverVariable solverVariable0 = this.o.d[v1];
            if(solverVariable0 != null && solverVariable0.g) {
                s = s + " $[" + v1 + "] => " + solverVariable0 + " = " + solverVariable0.f + "\n";
            }
        }
        String s1 = s + "\n";
        for(int v2 = 0; v2 < this.c + 1; ++v2) {
            SolverVariable[] arr_solverVariable = this.o.d;
            SolverVariable solverVariable1 = arr_solverVariable[v2];
            if(solverVariable1 != null && solverVariable1.n) {
                s1 = s1 + " ~[" + v2 + "] => " + solverVariable1 + " = " + arr_solverVariable[solverVariable1.o] + " + " + solverVariable1.p + "\n";
            }
        }
        String s2 = s1 + "\n\n #  ";
        for(int v = 0; v < this.m; ++v) {
            s2 = s2 + this.h[v].F() + "\n #  ";
        }
        if(this.e != null) {
            s2 = s2 + "Goal: " + this.e + "\n";
        }
        System.out.println(s2);
    }

    private void y() {
        this.z();
        String s = "";
        for(int v = 0; v < this.m; ++v) {
            s = s + this.h[v] + "\n";
        }
        System.out.println(s + this.e + "\n");
    }

    private void z() {
        System.out.println("Display Rows (" + this.m + "x" + this.l + ")\n");
    }
}

