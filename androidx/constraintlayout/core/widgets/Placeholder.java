package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

public class Placeholder extends VirtualLayout {
    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(LinearSystem linearSystem0, boolean z) {
        super.g(linearSystem0, z);
        if(this.C1 > 0) {
            ConstraintWidget constraintWidget0 = this.B1[0];
            constraintWidget0.S0();
            constraintWidget0.j(Type.b, this, Type.b);
            constraintWidget0.j(Type.d, this, Type.d);
            constraintWidget0.j(Type.c, this, Type.c);
            constraintWidget0.j(Type.e, this, Type.e);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.VirtualLayout
    public void w2(int v, int v1, int v2, int v3) {
        int v4 = this.t2() + this.u2();
        int v5 = this.v2() + this.s2();
        boolean z = false;
        if(this.C1 > 0) {
            v4 += this.B1[0].m0();
            v5 += this.B1[0].D();
        }
        int v6 = Math.max(this.Q(), v4);
        int v7 = Math.max(this.P(), v5);
        switch(v) {
            case 0x80000000: {
                v1 = Math.min(v6, v1);
                break;
            }
            case 0: {
                v1 = v6;
                break;
            }
            case 0x40000000: {
                break;
            }
            default: {
                v1 = 0;
            }
        }
        switch(v2) {
            case 0x80000000: {
                v3 = Math.min(v7, v3);
                break;
            }
            case 0: {
                v3 = v7;
                break;
            }
            case 0x40000000: {
                break;
            }
            default: {
                v3 = 0;
            }
        }
        this.B2(v1, v3);
        this.d2(v1);
        this.z1(v3);
        if(this.C1 > 0) {
            z = true;
        }
        this.A2(z);
    }
}

