package androidx.constraintlayout.core;

import java.util.ArrayList;

public class ArrayRow implements Row {
    public interface ArrayRowVariables {
        void clear();

        int e();

        int f(SolverVariable arg1);

        boolean g(SolverVariable arg1);

        SolverVariable h(int arg1);

        void i(SolverVariable arg1, float arg2);

        float j(SolverVariable arg1);

        void k(float arg1);

        void l(SolverVariable arg1, float arg2, boolean arg3);

        void m();

        float n(SolverVariable arg1, boolean arg2);

        int o();

        void p();

        float q(ArrayRow arg1, boolean arg2);

        float r(int arg1);
    }

    SolverVariable a;
    float b;
    boolean c;
    ArrayList d;
    public ArrayRowVariables e;
    boolean f;
    private static final boolean g = false;
    private static final boolean h = false;

    public ArrayRow() {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList();
        this.f = false;
    }

    public ArrayRow(Cache cache0) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList();
        this.f = false;
        this.e = new ArrayLinkedVariables(this, cache0);
    }

    public SolverVariable A(SolverVariable solverVariable0) {
        return this.B(null, solverVariable0);
    }

    private SolverVariable B(boolean[] arr_z, SolverVariable solverVariable0) {
        int v = this.e.e();
        SolverVariable solverVariable1 = null;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = this.e.r(v1);
            if(f1 < 0.0f) {
                SolverVariable solverVariable2 = this.e.h(v1);
                if((arr_z == null || !arr_z[solverVariable2.c]) && solverVariable2 != solverVariable0 && ((solverVariable2.j == Type.c || solverVariable2.j == Type.d) && f1 < f)) {
                    f = f1;
                    solverVariable1 = solverVariable2;
                }
            }
        }
        return solverVariable1;
    }

    void C(SolverVariable solverVariable0) {
        SolverVariable solverVariable1 = this.a;
        if(solverVariable1 != null) {
            this.e.i(solverVariable1, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = this.e.n(solverVariable0, true);
        this.a = solverVariable0;
        if(f * -1.0f == 1.0f) {
            return;
        }
        this.b /= f * -1.0f;
        this.e.k(f * -1.0f);
    }

    public void D() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    int E() {
        return this.a == null ? this.e.o() + 8 : this.e.o() + 12;
    }

    String F() {
        boolean z;
        String s = (this.a == null ? "0" : "" + this.a) + " = ";
        if(this.b == 0.0f) {
            z = false;
        }
        else {
            s = s + this.b;
            z = true;
        }
        int v1 = this.e.e();
        for(int v = 0; v < v1; ++v) {
            SolverVariable solverVariable0 = this.e.h(v);
            if(solverVariable0 != null) {
                float f = this.e.r(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    String s1 = solverVariable0.toString();
                    if(z) {
                        if(v2 > 0) {
                            s = s + " + ";
                        }
                        else {
                            s = s + " - ";
                            f *= -1.0f;
                        }
                    }
                    else if(f < 0.0f) {
                        s = s + "- ";
                        f *= -1.0f;
                    }
                    s = f == 1.0f ? s + s1 : s + f + " " + s1;
                    z = true;
                }
            }
        }
        return z ? s : s + "0.0";
    }

    public void G(LinearSystem linearSystem0, SolverVariable solverVariable0, boolean z) {
        if(solverVariable0 != null && solverVariable0.n) {
            float f = this.e.j(solverVariable0);
            this.b += solverVariable0.p * f;
            this.e.n(solverVariable0, z);
            if(z) {
                solverVariable0.g(this);
            }
            this.e.l(linearSystem0.o.d[solverVariable0.o], f, z);
            if(LinearSystem.y && this.e.e() == 0) {
                this.f = true;
                linearSystem0.b = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void a(LinearSystem linearSystem0, SolverVariable solverVariable0, boolean z) {
        if(solverVariable0 != null && solverVariable0.g) {
            float f = this.e.j(solverVariable0);
            this.b += solverVariable0.f * f;
            this.e.n(solverVariable0, z);
            if(z) {
                solverVariable0.g(this);
            }
            if(LinearSystem.y && this.e.e() == 0) {
                this.f = true;
                linearSystem0.b = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void b(LinearSystem linearSystem0, ArrayRow arrayRow0, boolean z) {
        float f = this.e.q(arrayRow0, z);
        this.b += arrayRow0.b * f;
        if(z) {
            arrayRow0.a.g(this);
        }
        if(LinearSystem.y && this.a != null && this.e.e() == 0) {
            this.f = true;
            linearSystem0.b = true;
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public SolverVariable c(LinearSystem linearSystem0, boolean[] arr_z) {
        return this.B(arr_z, null);
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void d(LinearSystem linearSystem0) {
        if(linearSystem0.h.length == 0) {
            return;
        }
        boolean z = false;
        while(!z) {
            int v = this.e.e();
            for(int v1 = 0; v1 < v; ++v1) {
                SolverVariable solverVariable0 = this.e.h(v1);
                if(solverVariable0.d != -1 || solverVariable0.g || solverVariable0.n) {
                    this.d.add(solverVariable0);
                }
            }
            int v2 = this.d.size();
            if(v2 > 0) {
                for(int v3 = 0; v3 < v2; ++v3) {
                    SolverVariable solverVariable1 = (SolverVariable)this.d.get(v3);
                    if(solverVariable1.g) {
                        this.a(linearSystem0, solverVariable1, true);
                    }
                    else if(solverVariable1.n) {
                        this.G(linearSystem0, solverVariable1, true);
                    }
                    else {
                        this.b(linearSystem0, linearSystem0.h[solverVariable1.d], true);
                    }
                }
                this.d.clear();
            }
            else {
                z = true;
            }
        }
        if(LinearSystem.y && this.a != null && this.e.e() == 0) {
            this.f = true;
            linearSystem0.b = true;
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void e(Row linearSystem$Row0) {
        if(linearSystem$Row0 instanceof ArrayRow) {
            this.a = null;
            this.e.clear();
            for(int v = 0; v < ((ArrayRow)linearSystem$Row0).e.e(); ++v) {
                SolverVariable solverVariable0 = ((ArrayRow)linearSystem$Row0).e.h(v);
                float f = ((ArrayRow)linearSystem$Row0).e.r(v);
                this.e.l(solverVariable0, f, true);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void f(SolverVariable solverVariable0) {
        float f = 1.0f;
        switch(solverVariable0.e) {
            case 2: {
                f = 1000.0f;
                break;
            }
            case 3: {
                f = 1000000.0f;
                break;
            }
            case 4: {
                f = 1000000000.0f;
                break;
            }
            case 5: {
                f = 999999995904.0f;
            }
        }
        this.e.i(solverVariable0, f);
    }

    public ArrayRow g(LinearSystem linearSystem0, int v) {
        this.e.i(linearSystem0.q(v, "ep"), 1.0f);
        this.e.i(linearSystem0.q(v, "em"), -1.0f);
        return this;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public SolverVariable getKey() {
        return this.a;
    }

    ArrayRow h(SolverVariable solverVariable0, int v) {
        this.e.i(solverVariable0, ((float)v));
        return this;
    }

    boolean i(LinearSystem linearSystem0) {
        boolean z;
        SolverVariable solverVariable0 = this.j(linearSystem0);
        if(solverVariable0 == null) {
            z = true;
        }
        else {
            this.C(solverVariable0);
            z = false;
        }
        if(this.e.e() == 0) {
            this.f = true;
        }
        return z;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.e() == 0;
    }

    SolverVariable j(LinearSystem linearSystem0) {
        boolean z2;
        boolean z3;
        int v = this.e.e();
        SolverVariable solverVariable0 = null;
        SolverVariable solverVariable1 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        float f = 0.0f;
        float f1 = 0.0f;
        while(v1 < v) {
            float f2 = this.e.r(v1);
            SolverVariable solverVariable2 = this.e.h(v1);
            if(solverVariable2.j != Type.a) {
                if(solverVariable0 == null && f2 < 0.0f) {
                    if(solverVariable1 == null) {
                        z3 = this.z(solverVariable2, linearSystem0);
                        goto label_32;
                    }
                    else if(f1 > f2) {
                        z3 = this.z(solverVariable2, linearSystem0);
                    label_32:
                        z1 = z3;
                        f1 = f2;
                        solverVariable1 = solverVariable2;
                    }
                    else if(!z1 && this.z(solverVariable2, linearSystem0)) {
                        f1 = f2;
                        solverVariable1 = solverVariable2;
                        z1 = true;
                    }
                }
            }
            else if(solverVariable0 == null) {
                z2 = this.z(solverVariable2, linearSystem0);
                goto label_17;
            }
            else if(f > f2) {
                z2 = this.z(solverVariable2, linearSystem0);
            label_17:
                z = z2;
                f = f2;
                solverVariable0 = solverVariable2;
            }
            else if(!z && this.z(solverVariable2, linearSystem0)) {
                f = f2;
                solverVariable0 = solverVariable2;
                z = true;
            }
            ++v1;
        }
        return solverVariable0 == null ? solverVariable1 : solverVariable0;
    }

    ArrayRow k(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, float f, SolverVariable solverVariable2, SolverVariable solverVariable3, int v1) {
        if(solverVariable1 == solverVariable2) {
            this.e.i(solverVariable0, 1.0f);
            this.e.i(solverVariable3, 1.0f);
            this.e.i(solverVariable1, -2.0f);
            return this;
        }
        if(f == 0.5f) {
            this.e.i(solverVariable0, 1.0f);
            this.e.i(solverVariable1, -1.0f);
            this.e.i(solverVariable2, -1.0f);
            this.e.i(solverVariable3, 1.0f);
            if(v > 0 || v1 > 0) {
                this.b = (float)(v1 - v);
                return this;
            }
        }
        else {
            if(f <= 0.0f) {
                this.e.i(solverVariable0, -1.0f);
                this.e.i(solverVariable1, 1.0f);
                this.b = (float)v;
                return this;
            }
            if(f >= 1.0f) {
                this.e.i(solverVariable3, -1.0f);
                this.e.i(solverVariable2, 1.0f);
                this.b = (float)(-v1);
                return this;
            }
            this.e.i(solverVariable0, (1.0f - f) * 1.0f);
            this.e.i(solverVariable1, (1.0f - f) * -1.0f);
            this.e.i(solverVariable2, -1.0f * f);
            this.e.i(solverVariable3, 1.0f * f);
            if(v > 0 || v1 > 0) {
                this.b = ((float)(-v)) * (1.0f - f) + ((float)v1) * f;
            }
        }
        return this;
    }

    ArrayRow l(SolverVariable solverVariable0, int v) {
        this.a = solverVariable0;
        solverVariable0.f = (float)v;
        this.b = (float)v;
        this.f = true;
        return this;
    }

    ArrayRow m(SolverVariable solverVariable0, SolverVariable solverVariable1, float f) {
        this.e.i(solverVariable0, -1.0f);
        this.e.i(solverVariable1, f);
        return this;
    }

    public ArrayRow n(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.e.i(solverVariable0, -1.0f);
        this.e.i(solverVariable1, 1.0f);
        this.e.i(solverVariable2, f);
        this.e.i(solverVariable3, -f);
        return this;
    }

    public ArrayRow o(float f, float f1, float f2, SolverVariable solverVariable0, int v, SolverVariable solverVariable1, int v1, SolverVariable solverVariable2, int v2, SolverVariable solverVariable3, int v3) {
        if(f1 != 0.0f && f != f2) {
            float f3 = f / f1 / (f2 / f1);
            this.b = ((float)(-v - v1)) + ((float)v2) * f3 + ((float)v3) * f3;
            this.e.i(solverVariable0, 1.0f);
            this.e.i(solverVariable1, -1.0f);
            this.e.i(solverVariable3, f3);
            this.e.i(solverVariable2, -f3);
            return this;
        }
        this.b = (float)(-v - v1 + v2 + v3);
        this.e.i(solverVariable0, 1.0f);
        this.e.i(solverVariable1, -1.0f);
        this.e.i(solverVariable3, 1.0f);
        this.e.i(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow p(float f, float f1, float f2, SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3) {
        this.b = 0.0f;
        if(f1 != 0.0f && f != f2) {
            if(f == 0.0f) {
                this.e.i(solverVariable0, 1.0f);
                this.e.i(solverVariable1, -1.0f);
                return this;
            }
            if(f2 == 0.0f) {
                this.e.i(solverVariable2, 1.0f);
                this.e.i(solverVariable3, -1.0f);
                return this;
            }
            float f3 = f / f1 / (f2 / f1);
            this.e.i(solverVariable0, 1.0f);
            this.e.i(solverVariable1, -1.0f);
            this.e.i(solverVariable3, f3);
            this.e.i(solverVariable2, -f3);
            return this;
        }
        this.e.i(solverVariable0, 1.0f);
        this.e.i(solverVariable1, -1.0f);
        this.e.i(solverVariable3, 1.0f);
        this.e.i(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow q(SolverVariable solverVariable0, int v) {
        if(v < 0) {
            this.b = (float)(-v);
            this.e.i(solverVariable0, 1.0f);
            return this;
        }
        this.b = (float)v;
        this.e.i(solverVariable0, -1.0f);
        return this;
    }

    public ArrayRow r(SolverVariable solverVariable0, SolverVariable solverVariable1, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.i(solverVariable0, -1.0f);
            this.e.i(solverVariable1, 1.0f);
            return this;
        }
        this.e.i(solverVariable0, 1.0f);
        this.e.i(solverVariable1, -1.0f);
        return this;
    }

    public ArrayRow s(SolverVariable solverVariable0, int v, SolverVariable solverVariable1) {
        this.b = (float)v;
        this.e.i(solverVariable0, -1.0f);
        return this;
    }

    public ArrayRow t(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.i(solverVariable0, -1.0f);
            this.e.i(solverVariable1, 1.0f);
            this.e.i(solverVariable2, 1.0f);
            return this;
        }
        this.e.i(solverVariable0, 1.0f);
        this.e.i(solverVariable1, -1.0f);
        this.e.i(solverVariable2, -1.0f);
        return this;
    }

    @Override
    public String toString() {
        return this.F();
    }

    public ArrayRow u(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.i(solverVariable0, -1.0f);
            this.e.i(solverVariable1, 1.0f);
            this.e.i(solverVariable2, -1.0f);
            return this;
        }
        this.e.i(solverVariable0, 1.0f);
        this.e.i(solverVariable1, -1.0f);
        this.e.i(solverVariable2, 1.0f);
        return this;
    }

    public ArrayRow v(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.e.i(solverVariable2, 0.5f);
        this.e.i(solverVariable3, 0.5f);
        this.e.i(solverVariable0, -0.5f);
        this.e.i(solverVariable1, -0.5f);
        this.b = -f;
        return this;
    }

    void w() {
        float f = this.b;
        if(f < 0.0f) {
            this.b = f * -1.0f;
            this.e.m();
        }
    }

    boolean x() {
        return this.a != null && (this.a.j == Type.a || this.b >= 0.0f);
    }

    boolean y(SolverVariable solverVariable0) {
        return this.e.g(solverVariable0);
    }

    private boolean z(SolverVariable solverVariable0, LinearSystem linearSystem0) {
        return solverVariable0.m <= 1;
    }
}

