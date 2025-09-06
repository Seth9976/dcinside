package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;

public class ConstraintProperties {
    LayoutParams a;
    View b;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 0;
    public static final int m = -2;
    public static final int n = 1;
    public static final int o;

    public ConstraintProperties(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.a = (LayoutParams)viewGroup$LayoutParams0;
        this.b = view0;
    }

    public ConstraintProperties A(float f) {
        this.a.L = f;
        return this;
    }

    public ConstraintProperties B(int v, int v1) {
        switch(v) {
            case 1: {
                this.a.leftMargin = v1;
                return this;
            }
            case 2: {
                this.a.rightMargin = v1;
                return this;
            }
            case 3: {
                this.a.topMargin = v1;
                return this;
            }
            case 4: {
                this.a.bottomMargin = v1;
                return this;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 6: {
                this.a.setMarginStart(v1);
                return this;
            }
            case 7: {
                this.a.setMarginEnd(v1);
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties C(int v) {
        switch(v) {
            case 1: {
                this.a.f = -1;
                this.a.e = -1;
                this.a.leftMargin = -1;
                this.a.w = 0x80000000;
                return this;
            }
            case 2: {
                this.a.h = -1;
                this.a.g = -1;
                this.a.rightMargin = -1;
                this.a.y = 0x80000000;
                return this;
            }
            case 3: {
                this.a.j = -1;
                this.a.i = -1;
                this.a.topMargin = -1;
                this.a.x = 0x80000000;
                return this;
            }
            case 4: {
                this.a.k = -1;
                this.a.l = -1;
                this.a.bottomMargin = -1;
                this.a.z = 0x80000000;
                return this;
            }
            case 5: {
                this.a.m = -1;
                return this;
            }
            case 6: {
                this.a.s = -1;
                this.a.t = -1;
                this.a.setMarginStart(-1);
                this.a.A = 0x80000000;
                return this;
            }
            case 7: {
                this.a.u = -1;
                this.a.v = -1;
                this.a.setMarginEnd(-1);
                this.a.B = 0x80000000;
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties D() {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        int v = constraintLayout$LayoutParams0.f;
        int v1 = constraintLayout$LayoutParams0.g;
        if(v == -1 && v1 == -1) {
            int v2 = constraintLayout$LayoutParams0.s;
            int v3 = constraintLayout$LayoutParams0.u;
            if(v2 != -1 || v3 != -1) {
                ConstraintProperties constraintProperties0 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v2));
                ConstraintProperties constraintProperties1 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v3));
                LayoutParams constraintLayout$LayoutParams1 = this.a;
                if(v2 != -1 && v3 != -1) {
                    constraintProperties0.m(7, v3, 6, 0);
                    constraintProperties1.m(6, -1, 7, 0);
                }
                else if(v3 != -1) {
                    int v4 = constraintLayout$LayoutParams1.h;
                    if(v4 == -1) {
                        int v5 = constraintLayout$LayoutParams1.e;
                        if(v5 != -1) {
                            constraintProperties1.m(6, v5, 6, 0);
                        }
                    }
                    else {
                        constraintProperties0.m(7, v4, 7, 0);
                    }
                }
            }
            this.C(6);
            this.C(7);
            return this;
        }
        ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v));
        ConstraintProperties constraintProperties3 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1));
        LayoutParams constraintLayout$LayoutParams2 = this.a;
        if(v != -1 && v1 != -1) {
            constraintProperties2.m(2, v1, 1, 0);
            constraintProperties3.m(1, v, 2, 0);
        }
        else if(v != -1 || v1 != -1) {
            int v6 = constraintLayout$LayoutParams2.h;
            if(v6 == -1) {
                int v7 = constraintLayout$LayoutParams2.e;
                if(v7 != -1) {
                    constraintProperties3.m(1, v7, 1, 0);
                }
            }
            else {
                constraintProperties2.m(2, v6, 2, 0);
            }
        }
        this.C(1);
        this.C(2);
        return this;
    }

    public ConstraintProperties E() {
        int v = this.a.j;
        int v1 = this.a.k;
        if(v != -1 || v1 != -1) {
            ConstraintProperties constraintProperties0 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v));
            ConstraintProperties constraintProperties1 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1));
            LayoutParams constraintLayout$LayoutParams0 = this.a;
            if(v != -1 && v1 != -1) {
                constraintProperties0.m(4, v1, 3, 0);
                constraintProperties1.m(3, v, 4, 0);
            }
            else if(v != -1 || v1 != -1) {
                int v2 = constraintLayout$LayoutParams0.l;
                if(v2 == -1) {
                    int v3 = constraintLayout$LayoutParams0.i;
                    if(v3 != -1) {
                        constraintProperties1.m(3, v3, 3, 0);
                    }
                }
                else {
                    constraintProperties0.m(4, v2, 4, 0);
                }
            }
        }
        this.C(3);
        this.C(4);
        return this;
    }

    public ConstraintProperties F(float f) {
        this.b.setRotation(f);
        return this;
    }

    public ConstraintProperties G(float f) {
        this.b.setRotationX(f);
        return this;
    }

    public ConstraintProperties H(float f) {
        this.b.setRotationY(f);
        return this;
    }

    public ConstraintProperties I(float f) {
        this.b.setScaleY(f);
        return this;
    }

    public ConstraintProperties J(float f) {
        return this;
    }

    private String K(int v) {
        switch(v) {
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            case 7: {
                return "end";
            }
            default: {
                return "undefined";
            }
        }
    }

    public ConstraintProperties L(float f, float f1) {
        this.b.setPivotX(f);
        this.b.setPivotY(f1);
        return this;
    }

    public ConstraintProperties M(float f) {
        this.b.setPivotX(f);
        return this;
    }

    public ConstraintProperties N(float f) {
        this.b.setPivotY(f);
        return this;
    }

    public ConstraintProperties O(float f, float f1) {
        this.b.setTranslationX(f);
        this.b.setTranslationY(f1);
        return this;
    }

    public ConstraintProperties P(float f) {
        this.b.setTranslationX(f);
        return this;
    }

    public ConstraintProperties Q(float f) {
        this.b.setTranslationY(f);
        return this;
    }

    public ConstraintProperties R(float f) {
        this.b.setTranslationZ(f);
        return this;
    }

    public ConstraintProperties S(float f) {
        this.a.H = f;
        return this;
    }

    public ConstraintProperties T(int v) {
        this.a.O = v;
        return this;
    }

    public ConstraintProperties U(float f) {
        this.a.M = f;
        return this;
    }

    public ConstraintProperties V(int v) {
        this.b.setVisibility(v);
        return this;
    }

    public ConstraintProperties a(int v, int v1) {
        this.m(1, v, (v == 0 ? 1 : 2), 0);
        this.m(2, v1, (v1 == 0 ? 2 : 1), 0);
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v)).m(2, this.b.getId(), 1, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1)).m(1, this.b.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperties b(int v, int v1) {
        this.m(6, v, (v == 0 ? 6 : 7), 0);
        this.m(7, v1, (v1 == 0 ? 7 : 6), 0);
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v)).m(7, this.b.getId(), 6, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1)).m(6, this.b.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperties c(int v, int v1) {
        this.m(3, v, (v == 0 ? 3 : 4), 0);
        this.m(4, v1, (v1 == 0 ? 4 : 3), 0);
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v)).m(4, this.b.getId(), 3, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1)).m(3, this.b.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperties d(float f) {
        this.b.setAlpha(f);
        return this;
    }

    public void e() {
    }

    public ConstraintProperties f(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        if(v2 < 0 || v5 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if(f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if(v1 != 1 && v1 != 2) {
            if(v1 != 6 && v1 != 7) {
                this.m(3, v, v1, v2);
                this.m(4, v3, v4, v5);
                this.a.H = f;
                return this;
            }
            this.m(6, v, v1, v2);
            this.m(7, v3, v4, v5);
            this.a.G = f;
            return this;
        }
        this.m(1, v, v1, v2);
        this.m(2, v3, v4, v5);
        this.a.G = f;
        return this;
    }

    public ConstraintProperties g(int v) {
        if(v == 0) {
            this.f(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        this.f(v, 2, 0, v, 1, 0, 0.5f);
        return this;
    }

    public ConstraintProperties h(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.m(1, v, v1, v2);
        this.m(2, v3, v4, v5);
        this.a.G = f;
        return this;
    }

    public ConstraintProperties i(int v) {
        if(v == 0) {
            this.f(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        this.f(v, 7, 0, v, 6, 0, 0.5f);
        return this;
    }

    public ConstraintProperties j(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.m(6, v, v1, v2);
        this.m(7, v3, v4, v5);
        this.a.G = f;
        return this;
    }

    public ConstraintProperties k(int v) {
        if(v == 0) {
            this.f(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        this.f(v, 4, 0, v, 3, 0, 0.5f);
        return this;
    }

    public ConstraintProperties l(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.m(3, v, v1, v2);
        this.m(4, v3, v4, v5);
        this.a.H = f;
        return this;
    }

    public ConstraintProperties m(int v, int v1, int v2, int v3) {
        switch(v) {
            case 1: {
                if(v2 == 1) {
                    this.a.e = v1;
                    this.a.f = -1;
                }
                else if(v2 == 2) {
                    this.a.f = v1;
                    this.a.e = -1;
                }
                else {
                    throw new IllegalArgumentException("Left to " + this.K(v2) + " undefined");
                }
                this.a.leftMargin = v3;
                return this;
            }
            case 2: {
                if(v2 == 1) {
                    this.a.g = v1;
                    this.a.h = -1;
                }
                else if(v2 == 2) {
                    this.a.h = v1;
                    this.a.g = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                }
                this.a.rightMargin = v3;
                return this;
            }
            case 3: {
                if(v2 == 3) {
                    this.a.i = v1;
                    this.a.j = -1;
                    this.a.m = -1;
                    this.a.n = -1;
                    this.a.o = -1;
                }
                else if(v2 == 4) {
                    this.a.j = v1;
                    this.a.i = -1;
                    this.a.m = -1;
                    this.a.n = -1;
                    this.a.o = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                }
                this.a.topMargin = v3;
                return this;
            }
            case 4: {
                if(v2 == 4) {
                    this.a.l = v1;
                    this.a.k = -1;
                    this.a.m = -1;
                    this.a.n = -1;
                    this.a.o = -1;
                }
                else if(v2 == 3) {
                    this.a.k = v1;
                    this.a.l = -1;
                    this.a.m = -1;
                    this.a.n = -1;
                    this.a.o = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                }
                this.a.bottomMargin = v3;
                return this;
            }
            case 5: {
                switch(v2) {
                    case 3: {
                        this.a.n = v1;
                        this.a.l = -1;
                        this.a.k = -1;
                        this.a.i = -1;
                        this.a.j = -1;
                        break;
                    }
                    case 4: {
                        this.a.o = v1;
                        this.a.l = -1;
                        this.a.k = -1;
                        this.a.i = -1;
                        this.a.j = -1;
                        break;
                    }
                    case 5: {
                        this.a.m = v1;
                        this.a.l = -1;
                        this.a.k = -1;
                        this.a.i = -1;
                        this.a.j = -1;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                    }
                }
                this.a.D = v3;
                return this;
            }
            case 6: {
                if(v2 == 6) {
                    this.a.t = v1;
                    this.a.s = -1;
                }
                else if(v2 == 7) {
                    this.a.s = v1;
                    this.a.t = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                }
                this.a.setMarginStart(v3);
                return this;
            }
            case 7: {
                if(v2 == 7) {
                    this.a.v = v1;
                    this.a.u = -1;
                }
                else if(v2 == 6) {
                    this.a.u = v1;
                    this.a.v = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K(v2) + " undefined");
                }
                this.a.setMarginEnd(v3);
                return this;
            }
            default: {
                throw new IllegalArgumentException(this.K(v) + " to " + this.K(v2) + " unknown");
            }
        }
    }

    public ConstraintProperties n(int v) {
        this.a.Q = v;
        return this;
    }

    public ConstraintProperties o(int v) {
        this.a.P = v;
        return this;
    }

    public ConstraintProperties p(int v) {
        this.a.height = v;
        return this;
    }

    public ConstraintProperties q(int v) {
        this.a.U = v;
        return this;
    }

    public ConstraintProperties r(int v) {
        this.a.T = v;
        return this;
    }

    public ConstraintProperties s(int v) {
        this.a.S = v;
        return this;
    }

    public ConstraintProperties t(int v) {
        this.a.R = v;
        return this;
    }

    public ConstraintProperties u(int v) {
        this.a.width = v;
        return this;
    }

    public ConstraintProperties v(String s) {
        this.a.I = s;
        return this;
    }

    public ConstraintProperties w(float f) {
        this.b.setElevation(f);
        return this;
    }

    public ConstraintProperties x(int v, int v1) {
        switch(v) {
            case 1: {
                this.a.w = v1;
                return this;
            }
            case 2: {
                this.a.y = v1;
                return this;
            }
            case 3: {
                this.a.x = v1;
                return this;
            }
            case 4: {
                this.a.z = v1;
                return this;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 6: {
                this.a.A = v1;
                return this;
            }
            case 7: {
                this.a.B = v1;
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties y(float f) {
        this.a.G = f;
        return this;
    }

    public ConstraintProperties z(int v) {
        this.a.N = v;
        return this;
    }
}

