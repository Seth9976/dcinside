package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class Dimension {
    public static enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT;

        private static Type[] a() [...] // Inlined contents
    }

    private final int a;
    int b;
    int c;
    float d;
    int e;
    String f;
    Object g;
    boolean h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;
    public static final Object m;
    public static final Object n;

    static {
        Dimension.i = new String("FIXED_DIMENSION");
        Dimension.j = new String("WRAP_DIMENSION");
        Dimension.k = new String("SPREAD_DIMENSION");
        Dimension.l = new String("PARENT_DIMENSION");
        Dimension.m = new String("PERCENT_DIMENSION");
        Dimension.n = new String("RATIO_DIMENSION");
    }

    private Dimension() {
        this.a = -2;
        this.b = 0;
        this.c = 0x7FFFFFFF;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = Dimension.j;
        this.h = false;
    }

    private Dimension(Object object0) {
        this.a = -2;
        this.b = 0;
        this.c = 0x7FFFFFFF;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.h = false;
        this.g = object0;
    }

    public void a(State state0, ConstraintWidget constraintWidget0, int v) {
        String s = this.f;
        if(s != null) {
            constraintWidget0.o1(s);
        }
        int v1 = 2;
        if(v == 0) {
            if(this.h) {
                constraintWidget0.E1(DimensionBehaviour.c);
                Object object0 = this.g;
                if(object0 == Dimension.j) {
                    v1 = 1;
                }
                else if(object0 != Dimension.m) {
                    v1 = 0;
                }
                constraintWidget0.F1(v1, this.b, this.c, this.d);
                return;
            }
            int v2 = this.b;
            if(v2 > 0) {
                constraintWidget0.Q1(v2);
            }
            int v3 = this.c;
            if(v3 < 0x7FFFFFFF) {
                constraintWidget0.N1(v3);
            }
            Object object1 = this.g;
            if(object1 == Dimension.j) {
                constraintWidget0.E1(DimensionBehaviour.b);
                return;
            }
            if(object1 == Dimension.l) {
                constraintWidget0.E1(DimensionBehaviour.d);
                return;
            }
            if(object1 == null) {
                constraintWidget0.E1(DimensionBehaviour.a);
                constraintWidget0.d2(this.e);
            }
        }
        else {
            if(this.h) {
                constraintWidget0.Z1(DimensionBehaviour.c);
                Object object2 = this.g;
                if(object2 == Dimension.j) {
                    v1 = 1;
                }
                else if(object2 != Dimension.m) {
                    v1 = 0;
                }
                constraintWidget0.a2(v1, this.b, this.c, this.d);
                return;
            }
            int v4 = this.b;
            if(v4 > 0) {
                constraintWidget0.P1(v4);
            }
            int v5 = this.c;
            if(v5 < 0x7FFFFFFF) {
                constraintWidget0.M1(v5);
            }
            Object object3 = this.g;
            if(object3 == Dimension.j) {
                constraintWidget0.Z1(DimensionBehaviour.b);
                return;
            }
            if(object3 == Dimension.l) {
                constraintWidget0.Z1(DimensionBehaviour.d);
                return;
            }
            if(object3 == null) {
                constraintWidget0.Z1(DimensionBehaviour.a);
                constraintWidget0.z1(this.e);
            }
        }
    }

    public static Dimension b(int v) {
        Dimension dimension0 = new Dimension(Dimension.i);
        dimension0.l(v);
        return dimension0;
    }

    public static Dimension c(Object object0) {
        Dimension dimension0 = new Dimension(Dimension.i);
        dimension0.m(object0);
        return dimension0;
    }

    public static Dimension d() {
        return new Dimension(Dimension.l);
    }

    public static Dimension e(Object object0, float f) {
        Dimension dimension0 = new Dimension(Dimension.m);
        dimension0.s(object0, f);
        return dimension0;
    }

    public static Dimension f(String s) {
        Dimension dimension0 = new Dimension(Dimension.n);
        dimension0.t(s);
        return dimension0;
    }

    public static Dimension g() {
        return new Dimension(Dimension.k);
    }

    public static Dimension h(int v) {
        Dimension dimension0 = new Dimension();
        dimension0.v(v);
        return dimension0;
    }

    public static Dimension i(Object object0) {
        Dimension dimension0 = new Dimension();
        dimension0.w(object0);
        return dimension0;
    }

    public static Dimension j() {
        return new Dimension(Dimension.j);
    }

    public boolean k(int v) {
        return this.g == null && this.e == v;
    }

    public Dimension l(int v) {
        this.g = null;
        this.e = v;
        return this;
    }

    public Dimension m(Object object0) {
        this.g = object0;
        if(object0 instanceof Integer) {
            this.e = (int)(((Integer)object0));
            this.g = null;
        }
        return this;
    }

    int n() {
        return this.e;
    }

    public Dimension o(int v) {
        if(this.c >= 0) {
            this.c = v;
        }
        return this;
    }

    public Dimension p(Object object0) {
        Object object1 = Dimension.j;
        if(object0 == object1 && this.h) {
            this.g = object1;
            this.c = 0x7FFFFFFF;
        }
        return this;
    }

    public Dimension q(int v) {
        if(v >= 0) {
            this.b = v;
        }
        return this;
    }

    public Dimension r(Object object0) {
        if(object0 == Dimension.j) {
            this.b = -2;
        }
        return this;
    }

    public Dimension s(Object object0, float f) {
        this.d = f;
        return this;
    }

    public Dimension t(String s) {
        this.f = s;
        return this;
    }

    void u(int v) {
        this.h = false;
        this.g = null;
        this.e = v;
    }

    public Dimension v(int v) {
        this.h = true;
        if(v >= 0) {
            this.c = v;
        }
        return this;
    }

    public Dimension w(Object object0) {
        this.g = object0;
        this.h = true;
        return this;
    }
}

