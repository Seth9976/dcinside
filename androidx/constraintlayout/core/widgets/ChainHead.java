package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

public class ChainHead {
    protected ConstraintWidget a;
    protected ConstraintWidget b;
    protected ConstraintWidget c;
    protected ConstraintWidget d;
    protected ConstraintWidget e;
    protected ConstraintWidget f;
    protected ConstraintWidget g;
    protected ArrayList h;
    protected int i;
    protected int j;
    protected float k;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public ChainHead(ConstraintWidget constraintWidget0, int v, boolean z) {
        this.k = 0.0f;
        this.a = constraintWidget0;
        this.p = v;
        this.q = z;
    }

    public void a() {
        if(!this.v) {
            this.b();
        }
        this.v = true;
    }

    private void b() {
        int v = this.p * 2;
        ConstraintWidget constraintWidget0 = this.a;
        boolean z = true;
        this.o = true;
        ConstraintWidget constraintWidget1 = constraintWidget0;
        boolean z1 = false;
        while(!z1) {
            ++this.i;
            int v1 = this.p;
            ConstraintWidget constraintWidget2 = null;
            constraintWidget0.P0[v1] = null;
            constraintWidget0.O0[v1] = null;
            if(constraintWidget0.l0() != 8) {
                ++this.l;
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.c;
                if(constraintWidget0.z(this.p) != constraintWidget$DimensionBehaviour0) {
                    this.m += constraintWidget0.M(this.p);
                }
                this.m = this.m + constraintWidget0.Y[v].g() + constraintWidget0.Y[v + 1].g();
                this.n = this.n + constraintWidget0.Y[v].g() + constraintWidget0.Y[v + 1].g();
                if(this.b == null) {
                    this.b = constraintWidget0;
                }
                this.d = constraintWidget0;
                int v2 = this.p;
                if(constraintWidget0.b0[v2] == constraintWidget$DimensionBehaviour0) {
                    switch(constraintWidget0.y[v2]) {
                        case 0: 
                        case 2: 
                        case 3: {
                            ++this.j;
                            float f = constraintWidget0.N0[v2];
                            if(f > 0.0f) {
                                this.k += f;
                            }
                            if(ChainHead.k(constraintWidget0, v2)) {
                                if(f < 0.0f) {
                                    this.r = true;
                                }
                                else {
                                    this.s = true;
                                }
                                if(this.h == null) {
                                    this.h = new ArrayList();
                                }
                                this.h.add(constraintWidget0);
                            }
                            if(this.f == null) {
                                this.f = constraintWidget0;
                            }
                            ConstraintWidget constraintWidget3 = this.g;
                            if(constraintWidget3 != null) {
                                constraintWidget3.O0[this.p] = constraintWidget0;
                            }
                            this.g = constraintWidget0;
                        }
                    }
                    if(this.p != 0) {
                        if(constraintWidget0.x != 0) {
                            this.o = false;
                        }
                        else if(constraintWidget0.C != 0 || constraintWidget0.D != 0) {
                            this.o = false;
                        }
                    }
                    else if(constraintWidget0.w != 0) {
                        this.o = false;
                    }
                    else if(constraintWidget0.z != 0 || constraintWidget0.A != 0) {
                        this.o = false;
                    }
                    if(constraintWidget0.f0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if(constraintWidget1 != constraintWidget0) {
                constraintWidget1.P0[this.p] = constraintWidget0;
            }
            ConstraintAnchor constraintAnchor0 = constraintWidget0.Y[v + 1].f;
            if(constraintAnchor0 != null) {
                ConstraintWidget constraintWidget4 = constraintAnchor0.d;
                ConstraintAnchor constraintAnchor1 = constraintWidget4.Y[v].f;
                if(constraintAnchor1 != null && constraintAnchor1.d == constraintWidget0) {
                    constraintWidget2 = constraintWidget4;
                }
            }
            if(constraintWidget2 == null) {
                constraintWidget2 = constraintWidget0;
                z1 = true;
            }
            constraintWidget1 = constraintWidget0;
            constraintWidget0 = constraintWidget2;
        }
        ConstraintWidget constraintWidget5 = this.b;
        if(constraintWidget5 != null) {
            this.m -= constraintWidget5.Y[v].g();
        }
        ConstraintWidget constraintWidget6 = this.d;
        if(constraintWidget6 != null) {
            this.m -= constraintWidget6.Y[v + 1].g();
        }
        this.c = constraintWidget0;
        this.e = this.p != 0 || !this.q ? this.a : constraintWidget0;
        if(!this.s || !this.r) {
            z = false;
        }
        this.t = z;
    }

    public ConstraintWidget c() {
        return this.a;
    }

    public ConstraintWidget d() {
        return this.f;
    }

    public ConstraintWidget e() {
        return this.b;
    }

    public ConstraintWidget f() {
        return this.e;
    }

    public ConstraintWidget g() {
        return this.c;
    }

    public ConstraintWidget h() {
        return this.g;
    }

    public ConstraintWidget i() {
        return this.d;
    }

    public float j() {
        return this.k;
    }

    private static boolean k(ConstraintWidget constraintWidget0, int v) {
        if(constraintWidget0.l0() != 8 && constraintWidget0.b0[v] == DimensionBehaviour.c) {
            switch(constraintWidget0.y[v]) {
                case 0: 
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

