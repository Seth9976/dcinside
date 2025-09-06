package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class VerticalChainReference extends ChainReference {
    public VerticalChainReference(State state0) {
        super(state0, Helper.b);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.o0) {
            this.m0.f(object0).y();
        }
        ConstraintReference constraintReference0 = null;
        ConstraintReference constraintReference1 = null;
        for(Object object1: this.o0) {
            ConstraintReference constraintReference2 = this.m0.f(object1);
            if(constraintReference1 == null) {
                Object object2 = this.S;
                if(object2 == null) {
                    Object object3 = this.T;
                    if(object3 == null) {
                        String s = constraintReference2.getKey().toString();
                        constraintReference2.H0(State.o).f0(this.b1(s)).h0(this.a1(s));
                    }
                    else {
                        constraintReference2.G0(object3).e0(this.o).g0(this.u);
                    }
                }
                else {
                    constraintReference2.H0(object2).e0(this.o).g0(this.u);
                }
                constraintReference1 = constraintReference2;
            }
            if(constraintReference0 != null) {
                String s1 = constraintReference0.getKey().toString();
                String s2 = constraintReference2.getKey().toString();
                constraintReference0.r(constraintReference2.getKey()).f0(this.Z0(s1)).h0(this.Y0(s1));
                constraintReference2.G0(constraintReference0.getKey()).f0(this.b1(s2)).h0(this.a1(s2));
            }
            float f = this.d1(object1.toString());
            if(f != -1.0f) {
                constraintReference2.y0(f);
            }
            constraintReference0 = constraintReference2;
        }
        if(constraintReference0 != null) {
            Object object4 = this.V;
            if(object4 == null) {
                Object object5 = this.W;
                if(object5 == null) {
                    String s3 = constraintReference0.getKey().toString();
                    constraintReference0.q(State.o).f0(this.Z0(s3)).h0(this.Y0(s3));
                }
                else {
                    constraintReference0.q(object5).e0(this.p).g0(this.v);
                }
            }
            else {
                constraintReference0.r(object4).e0(this.p).g0(this.v);
            }
        }
        if(constraintReference1 == null) {
            return;
        }
        float f1 = this.q0;
        if(f1 != 0.5f) {
            constraintReference1.M0(f1);
        }
        switch(this.w0) {
            case 1: {
                constraintReference1.x0(0);
                return;
            }
            case 2: {
                constraintReference1.x0(1);
                return;
            }
            case 3: {
                constraintReference1.x0(2);
            }
        }
    }
}

