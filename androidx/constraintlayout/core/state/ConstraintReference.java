package androidx.constraintlayout.core.state;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintReference implements Reference {
    public interface ConstraintReferenceFactory {
        ConstraintReference a(State arg1);
    }

    static class IncorrectConstraintException extends Exception {
        private final ArrayList a;

        IncorrectConstraintException(ArrayList arrayList0) {
            this.a = arrayList0;
        }

        public ArrayList a() {
            return this.a;
        }

        @Override
        public String getMessage() {
            return this.toString();
        }

        @Override
        public String toString() {
            return "IncorrectConstraintException: " + this.a.toString();
        }
    }

    float A;
    float B;
    float C;
    float D;
    float E;
    float F;
    float G;
    float H;
    float I;
    int J;
    protected Object K;
    protected Object L;
    protected Object M;
    protected Object N;
    protected Object O;
    protected Object P;
    protected Object Q;
    protected Object R;
    protected Object S;
    protected Object T;
    @Nullable
    Object U;
    protected Object V;
    protected Object W;
    @Nullable
    Object X;
    Object Y;
    Object Z;
    private Object a;
    Object a0;
    final State b;
    Object b0;
    String c;
    private float c0;
    Facade d;
    private float d0;
    int e;
    Constraint e0;
    int f;
    Dimension f0;
    float g;
    Dimension g0;
    float h;
    private Object h0;
    protected float i;
    private ConstraintWidget i0;
    protected float j;
    private HashMap j0;
    protected int k;
    private HashMap k0;
    protected int l;
    TypedBundle l0;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    int w;
    int x;
    float y;
    float z;

    public ConstraintReference(State state0) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = -1.0f;
        this.h = -1.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = NaNf;
        this.z = NaNf;
        this.A = NaNf;
        this.B = NaNf;
        this.C = NaNf;
        this.D = NaNf;
        this.E = NaNf;
        this.F = NaNf;
        this.G = NaNf;
        this.H = NaNf;
        this.I = NaNf;
        this.J = 0;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.e0 = null;
        this.f0 = Dimension.c(Dimension.j);
        this.g0 = Dimension.c(Dimension.j);
        this.j0 = new HashMap();
        this.k0 = new HashMap();
        this.l0 = null;
        this.b = state0;
    }

    private void A() {
        this.K = this.E(this.K);
        this.L = this.E(this.L);
        this.M = this.E(this.M);
        this.N = this.E(this.N);
        this.O = this.E(this.O);
        this.P = this.E(this.P);
        this.Q = this.E(this.Q);
        this.R = this.E(this.R);
        this.S = this.E(this.S);
        this.T = this.E(this.T);
        this.V = this.E(this.V);
        this.W = this.E(this.W);
        this.Y = this.E(this.Y);
        this.Z = this.E(this.Z);
        this.a0 = this.E(this.a0);
    }

    public ConstraintReference A0(Dimension dimension0) {
        this.f0 = dimension0;
        return this;
    }

    public ConstraintReference B() {
        if(this.Q != null) {
            this.e0 = Constraint.g;
            return this;
        }
        this.e0 = Constraint.h;
        return this;
    }

    public ConstraintReference B0() {
        if(this.O != null) {
            this.e0 = Constraint.e;
            return this;
        }
        this.e0 = Constraint.f;
        return this;
    }

    public ConstraintReference C(Object object0) {
        this.e0 = Constraint.h;
        this.R = object0;
        return this;
    }

    public ConstraintReference C0(Object object0) {
        this.e0 = Constraint.f;
        this.P = object0;
        return this;
    }

    public ConstraintReference D(Object object0) {
        this.e0 = Constraint.g;
        this.Q = object0;
        return this;
    }

    public ConstraintReference D0(Object object0) {
        this.e0 = Constraint.e;
        this.O = object0;
        return this;
    }

    private Object E(Object object0) {
        if(object0 == null) {
            return null;
        }
        return !(object0 instanceof ConstraintReference) ? this.b.C(object0) : object0;
    }

    public ConstraintReference E0() {
        if(this.S != null) {
            this.e0 = Constraint.i;
            return this;
        }
        this.e0 = Constraint.j;
        return this;
    }

    public float F() {
        return this.G;
    }

    ConstraintReference F0(Object object0) {
        this.e0 = Constraint.k;
        this.U = object0;
        return this;
    }

    public Dimension G() {
        return this.g0;
    }

    public ConstraintReference G0(Object object0) {
        this.e0 = Constraint.j;
        this.T = object0;
        return this;
    }

    public int H() {
        return this.e;
    }

    public ConstraintReference H0(Object object0) {
        this.e0 = Constraint.i;
        this.S = object0;
        return this;
    }

    public float I() {
        return this.g;
    }

    public ConstraintReference I0(float f) {
        this.D = f;
        return this;
    }

    public float J() {
        return this.y;
    }

    public ConstraintReference J0(float f) {
        this.E = f;
        return this;
    }

    public float K() {
        return this.z;
    }

    public ConstraintReference K0(float f) {
        this.F = f;
        return this;
    }

    public float L() {
        return this.A;
    }

    public void L0() throws IncorrectConstraintException {
        ArrayList arrayList0 = new ArrayList();
        if(this.K != null && this.L != null) {
            arrayList0.add("LeftToLeft and LeftToRight both defined");
        }
        if(this.M != null && this.N != null) {
            arrayList0.add("RightToLeft and RightToRight both defined");
        }
        if(this.O != null && this.P != null) {
            arrayList0.add("StartToStart and StartToEnd both defined");
        }
        if(this.Q != null && this.R != null) {
            arrayList0.add("EndToStart and EndToEnd both defined");
        }
        if((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList0.add("Both left/right and start/end constraints defined");
        }
        if(arrayList0.size() > 0) {
            throw new IncorrectConstraintException(arrayList0);
        }
    }

    public float M() {
        return this.B;
    }

    public ConstraintReference M0(float f) {
        this.j = f;
        return this;
    }

    public float N() {
        return this.C;
    }

    public ConstraintReference N0(int v) {
        this.J = v;
        return this;
    }

    public float O() {
        return this.H;
    }

    public ConstraintReference O0(Dimension dimension0) {
        return this.A0(dimension0);
    }

    public float P() {
        return this.I;
    }

    public String Q() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    private ConstraintWidget R(Object object0) {
        return object0 instanceof Reference ? ((Reference)object0).a() : null;
    }

    public float S() {
        return this.D;
    }

    public float T() {
        return this.E;
    }

    public float U() {
        return this.F;
    }

    public int V(int v) {
        return this.f;
    }

    public float W() {
        return this.h;
    }

    public Object X() {
        return this.h0;
    }

    public Dimension Y() {
        return this.f0;
    }

    public ConstraintReference Z(Dimension dimension0) {
        return this.t0(dimension0);
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget a() {
        if(this.i0 == null) {
            ConstraintWidget constraintWidget0 = this.z();
            this.i0 = constraintWidget0;
            constraintWidget0.i1(this.h0);
        }
        return this.i0;
    }

    public ConstraintReference a0(float f) {
        this.i = f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if(this.i0 == null) {
            return;
        }
        Facade facade0 = this.d;
        if(facade0 != null) {
            facade0.apply();
        }
        this.f0.a(this.b, this.i0, 0);
        this.g0.a(this.b, this.i0, 1);
        this.A();
        this.i();
        int v = this.e;
        if(v != 0) {
            this.i0.C1(v);
        }
        int v1 = this.f;
        if(v1 != 0) {
            this.i0.X1(v1);
        }
        float f = this.g;
        if(f != -1.0f) {
            this.i0.G1(f);
        }
        float f1 = this.h;
        if(f1 != -1.0f) {
            this.i0.b2(f1);
        }
        this.i0.B1(this.i);
        this.i0.W1(this.j);
        WidgetFrame widgetFrame0 = this.i0.n;
        widgetFrame0.f = this.y;
        widgetFrame0.g = this.z;
        widgetFrame0.h = this.A;
        widgetFrame0.i = this.B;
        widgetFrame0.j = this.C;
        widgetFrame0.k = this.D;
        widgetFrame0.l = this.E;
        widgetFrame0.m = this.F;
        widgetFrame0.n = this.H;
        widgetFrame0.o = this.I;
        widgetFrame0.p = this.G;
        widgetFrame0.r = this.J;
        this.i0.c2(this.J);
        this.i0.n.C(this.l0);
        HashMap hashMap0 = this.j0;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.keySet()) {
                Integer integer0 = (Integer)this.j0.get(((String)object0));
                this.i0.n.y(((String)object0), 902, ((int)integer0));
            }
        }
        HashMap hashMap1 = this.k0;
        if(hashMap1 != null) {
            for(Object object1: hashMap1.keySet()) {
                float f2 = (float)(((Float)this.k0.get(((String)object1))));
                this.i0.n.x(((String)object1), 901, f2);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void b(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 == null) {
            return;
        }
        this.i0 = constraintWidget0;
        constraintWidget0.i1(this.h0);
    }

    public ConstraintReference b0() {
        if(this.K != null) {
            this.e0 = Constraint.a;
            return this;
        }
        this.e0 = Constraint.b;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void c(Object object0) {
        this.a = object0;
    }

    public ConstraintReference c0(Object object0) {
        this.e0 = Constraint.a;
        this.K = object0;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Facade d() {
        return this.d;
    }

    public ConstraintReference d0(Object object0) {
        this.e0 = Constraint.b;
        this.L = object0;
        return this;
    }

    public void e(String s, int v) {
        this.j0.put(s, v);
    }

    public ConstraintReference e0(int v) {
        Constraint state$Constraint0 = this.e0;
        if(state$Constraint0 != null) {
            switch(state$Constraint0) {
                case 1: 
                case 2: {
                    this.k = v;
                    return this;
                }
                case 3: 
                case 4: {
                    this.l = v;
                    return this;
                }
                case 5: 
                case 6: {
                    this.m = v;
                    return this;
                }
                case 7: 
                case 8: {
                    this.n = v;
                    return this;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.o = v;
                    return this;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.p = v;
                    return this;
                }
                case 15: 
                case 16: 
                case 17: {
                    this.w = v;
                    return this;
                }
                case 18: {
                    this.d0 = (float)v;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.k = v;
        this.l = v;
        this.m = v;
        this.n = v;
        this.o = v;
        this.p = v;
        return this;
    }

    public void f(String s, float f) {
        if(this.k0 == null) {
            this.k0 = new HashMap();
        }
        this.k0.put(s, f);
    }

    public ConstraintReference f0(Object object0) {
        return this.e0(this.b.g(object0));
    }

    public ConstraintReference g(float f) {
        this.G = f;
        return this;
    }

    public ConstraintReference g0(int v) {
        Constraint state$Constraint0 = this.e0;
        if(state$Constraint0 != null) {
            switch(state$Constraint0) {
                case 1: 
                case 2: {
                    this.q = v;
                    return this;
                }
                case 3: 
                case 4: {
                    this.r = v;
                    return this;
                }
                case 5: 
                case 6: {
                    this.s = v;
                    return this;
                }
                case 7: 
                case 8: {
                    this.t = v;
                    return this;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.u = v;
                    return this;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.v = v;
                    return this;
                }
                case 15: 
                case 16: 
                case 17: {
                    this.x = v;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.q = v;
        this.r = v;
        this.s = v;
        this.t = v;
        this.u = v;
        this.v = v;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.a;
    }

    private void h(ConstraintWidget constraintWidget0, Object object0, Constraint state$Constraint0) {
        ConstraintWidget constraintWidget1 = this.R(object0);
        if(constraintWidget1 == null) {
            return;
        }
        int v = androidx.constraintlayout.core.state.ConstraintReference.1.a[state$Constraint0.ordinal()];
        switch(state$Constraint0) {
            case 1: {
                constraintWidget0.r(Type.b).b(constraintWidget1.r(Type.b), this.k, this.q, false);
                return;
            }
            case 2: {
                constraintWidget0.r(Type.b).b(constraintWidget1.r(Type.d), this.k, this.q, false);
                return;
            }
            case 3: {
                constraintWidget0.r(Type.d).b(constraintWidget1.r(Type.b), this.l, this.r, false);
                return;
            }
            case 4: {
                constraintWidget0.r(Type.d).b(constraintWidget1.r(Type.d), this.l, this.r, false);
                return;
            }
            case 5: {
                constraintWidget0.r(Type.b).b(constraintWidget1.r(Type.b), this.m, this.s, false);
                return;
            }
            case 6: {
                constraintWidget0.r(Type.b).b(constraintWidget1.r(Type.d), this.m, this.s, false);
                return;
            }
            case 7: {
                constraintWidget0.r(Type.d).b(constraintWidget1.r(Type.b), this.n, this.t, false);
                return;
            }
            case 8: {
                constraintWidget0.r(Type.d).b(constraintWidget1.r(Type.d), this.n, this.t, false);
                return;
            }
            case 9: {
                constraintWidget0.r(Type.c).b(constraintWidget1.r(Type.c), this.o, this.u, false);
                return;
            }
            case 10: {
                constraintWidget0.r(Type.c).b(constraintWidget1.r(Type.e), this.o, this.u, false);
                return;
            }
            case 11: {
                constraintWidget0.v0(Type.c, constraintWidget1, Type.f, this.o, this.u);
                return;
            }
            case 12: {
                constraintWidget0.r(Type.e).b(constraintWidget1.r(Type.c), this.p, this.v, false);
                return;
            }
            case 13: {
                constraintWidget0.r(Type.e).b(constraintWidget1.r(Type.e), this.p, this.v, false);
                return;
            }
            case 14: {
                constraintWidget0.v0(Type.e, constraintWidget1, Type.f, this.p, this.v);
                return;
            }
            case 15: {
                constraintWidget0.v0(Type.f, constraintWidget1, Type.e, this.w, this.x);
                return;
            }
            case 16: {
                constraintWidget0.v0(Type.f, constraintWidget1, Type.c, this.w, this.x);
                return;
            }
            case 17: {
                constraintWidget0.v0(Type.f, constraintWidget1, Type.f, this.w, this.x);
                return;
            }
            case 18: {
                constraintWidget0.m(constraintWidget1, this.c0, ((int)this.d0));
            }
        }
    }

    public ConstraintReference h0(Object object0) {
        return this.g0(this.b.g(object0));
    }

    public void i() {
        this.h(this.i0, this.K, Constraint.a);
        this.h(this.i0, this.L, Constraint.b);
        this.h(this.i0, this.M, Constraint.c);
        this.h(this.i0, this.N, Constraint.d);
        this.h(this.i0, this.O, Constraint.e);
        this.h(this.i0, this.P, Constraint.f);
        this.h(this.i0, this.Q, Constraint.g);
        this.h(this.i0, this.R, Constraint.h);
        this.h(this.i0, this.S, Constraint.i);
        this.h(this.i0, this.T, Constraint.j);
        this.h(this.i0, this.U, Constraint.k);
        this.h(this.i0, this.V, Constraint.l);
        this.h(this.i0, this.W, Constraint.m);
        this.h(this.i0, this.X, Constraint.n);
        this.h(this.i0, this.Y, Constraint.o);
        this.h(this.i0, this.Z, Constraint.p);
        this.h(this.i0, this.a0, Constraint.q);
        this.h(this.i0, this.b0, Constraint.t);
    }

    public ConstraintReference i0(float f) {
        this.y = f;
        return this;
    }

    public ConstraintReference j() {
        this.e0 = Constraint.o;
        return this;
    }

    public ConstraintReference j0(float f) {
        this.z = f;
        return this;
    }

    public ConstraintReference k(Object object0) {
        this.e0 = Constraint.o;
        this.Y = object0;
        return this;
    }

    public ConstraintReference k0() {
        if(this.M != null) {
            this.e0 = Constraint.c;
            return this;
        }
        this.e0 = Constraint.d;
        return this;
    }

    public ConstraintReference l(Object object0) {
        this.e0 = Constraint.q;
        this.a0 = object0;
        return this;
    }

    public ConstraintReference l0(Object object0) {
        this.e0 = Constraint.c;
        this.M = object0;
        return this;
    }

    public ConstraintReference m(Object object0) {
        this.e0 = Constraint.p;
        this.Z = object0;
        return this;
    }

    public ConstraintReference m0(Object object0) {
        this.e0 = Constraint.d;
        this.N = object0;
        return this;
    }

    public ConstraintReference n(float f) {
        Constraint state$Constraint0 = this.e0;
        if(state$Constraint0 == null) {
            return this;
        }
        switch(state$Constraint0) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 19: {
                this.i = f;
                return this;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 20: {
                this.j = f;
                return this;
            }
            default: {
                return this;
            }
        }
    }

    public ConstraintReference n0(float f) {
        this.A = f;
        return this;
    }

    public ConstraintReference o() {
        if(this.V != null) {
            this.e0 = Constraint.l;
            return this;
        }
        this.e0 = Constraint.m;
        return this;
    }

    public ConstraintReference o0(float f) {
        this.B = f;
        return this;
    }

    ConstraintReference p(Object object0) {
        this.e0 = Constraint.n;
        this.X = object0;
        return this;
    }

    public ConstraintReference p0(float f) {
        this.C = f;
        return this;
    }

    public ConstraintReference q(Object object0) {
        this.e0 = Constraint.m;
        this.W = object0;
        return this;
    }

    public ConstraintReference q0(float f) {
        this.H = f;
        return this;
    }

    public ConstraintReference r(Object object0) {
        this.e0 = Constraint.l;
        this.V = object0;
        return this;
    }

    public ConstraintReference r0(float f) {
        this.I = f;
        return this;
    }

    public ConstraintReference s(Object object0) {
        Object object1 = this.E(object0);
        this.O = object1;
        this.R = object1;
        this.e0 = Constraint.r;
        this.i = 0.5f;
        return this;
    }

    public void s0(Facade facade0) {
        this.d = facade0;
        if(facade0 != null) {
            this.b(facade0.a());
        }
    }

    public ConstraintReference t(Object object0) {
        Object object1 = this.E(object0);
        this.S = object1;
        this.W = object1;
        this.e0 = Constraint.s;
        this.j = 0.5f;
        return this;
    }

    public ConstraintReference t0(Dimension dimension0) {
        this.g0 = dimension0;
        return this;
    }

    public ConstraintReference u(Object object0, float f, float f1) {
        this.b0 = this.E(object0);
        this.c0 = f;
        this.d0 = f1;
        this.e0 = Constraint.t;
        return this;
    }

    public void u0(int v) {
        this.e = v;
    }

    public ConstraintReference v() {
        Constraint state$Constraint0 = this.e0;
        if(state$Constraint0 != null) {
            switch(state$Constraint0) {
                case 1: 
                case 2: {
                    this.K = null;
                    this.L = null;
                    this.k = 0;
                    this.q = 0;
                    return this;
                }
                case 3: 
                case 4: {
                    this.M = null;
                    this.N = null;
                    this.l = 0;
                    this.r = 0;
                    return this;
                }
                case 5: 
                case 6: {
                    this.O = null;
                    this.P = null;
                    this.m = 0;
                    this.s = 0;
                    return this;
                }
                case 7: 
                case 8: {
                    this.Q = null;
                    this.R = null;
                    this.n = 0;
                    this.t = 0;
                    return this;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.S = null;
                    this.T = null;
                    this.U = null;
                    this.o = 0;
                    this.u = 0;
                    return this;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.V = null;
                    this.W = null;
                    this.X = null;
                    this.p = 0;
                    this.v = 0;
                    return this;
                }
                case 17: {
                    this.Y = null;
                    return this;
                }
                case 18: {
                    this.b0 = null;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.w();
        return this;
    }

    public void v0(float f) {
        this.g = f;
    }

    public ConstraintReference w() {
        this.K = null;
        this.L = null;
        this.k = 0;
        this.M = null;
        this.N = null;
        this.l = 0;
        this.O = null;
        this.P = null;
        this.m = 0;
        this.Q = null;
        this.R = null;
        this.n = 0;
        this.S = null;
        this.T = null;
        this.o = 0;
        this.V = null;
        this.W = null;
        this.p = 0;
        this.Y = null;
        this.b0 = null;
        this.i = 0.5f;
        this.j = 0.5f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        return this;
    }

    public void w0(String s) {
        this.c = s;
    }

    public ConstraintReference x() {
        this.B0().v();
        this.B().v();
        this.b0().v();
        this.k0().v();
        return this;
    }

    public void x0(int v) {
        this.f = v;
    }

    public ConstraintReference y() {
        this.E0().v();
        this.j().v();
        this.o().v();
        return this;
    }

    public void y0(float f) {
        this.h = f;
    }

    public ConstraintWidget z() {
        return new ConstraintWidget(this.Y().n(), this.G().n());
    }

    public void z0(Object object0) {
        this.h0 = object0;
        ConstraintWidget constraintWidget0 = this.i0;
        if(constraintWidget0 != null) {
            constraintWidget0.i1(object0);
        }
    }
}

