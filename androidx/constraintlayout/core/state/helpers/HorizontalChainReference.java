package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class HorizontalChainReference extends ChainReference {
    public HorizontalChainReference(State state0) {
        super(state0, Helper.a);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.o0) {
            this.m0.f(object0).x();
        }
        ConstraintReference constraintReference0 = null;
        ConstraintReference constraintReference1 = null;
        for(Object object1: this.o0) {
            ConstraintReference constraintReference2 = this.m0.f(object1);
            if(constraintReference1 == null) {
                Object object2 = this.O;
                if(object2 == null) {
                    Object object3 = this.P;
                    if(object3 == null) {
                        Object object4 = this.K;
                        if(object4 == null) {
                            Object object5 = this.L;
                            if(object5 == null) {
                                String s = constraintReference2.getKey().toString();
                                constraintReference2.D0(State.o).f0(this.b1(s)).h0(this.a1(s));
                            }
                            else {
                                constraintReference2.C0(object5).e0(this.k).g0(this.q);
                            }
                        }
                        else {
                            constraintReference2.D0(object4).e0(this.k).g0(this.q);
                        }
                    }
                    else {
                        constraintReference2.C0(object3).e0(this.m).g0(this.s);
                    }
                }
                else {
                    constraintReference2.D0(object2).e0(this.m).g0(this.s);
                }
                constraintReference1 = constraintReference2;
            }
            if(constraintReference0 != null) {
                String s1 = constraintReference0.getKey().toString();
                String s2 = constraintReference2.getKey().toString();
                constraintReference0.D(constraintReference2.getKey()).f0(this.Z0(s1)).h0(this.Y0(s1));
                constraintReference2.C0(constraintReference0.getKey()).f0(this.b1(s2)).h0(this.a1(s2));
            }
            float f = this.d1(object1.toString());
            if(f != -1.0f) {
                constraintReference2.v0(f);
            }
            constraintReference0 = constraintReference2;
        }
        if(constraintReference0 != null) {
            Object object6 = this.Q;
            if(object6 == null) {
                Object object7 = this.R;
                if(object7 == null) {
                    Object object8 = this.M;
                    if(object8 == null) {
                        Object object9 = this.N;
                        if(object9 == null) {
                            String s3 = constraintReference0.getKey().toString();
                            constraintReference0.C(State.o).f0(this.Z0(s3)).h0(this.Y0(s3));
                        }
                        else {
                            constraintReference0.C(object9).e0(this.l).g0(this.r);
                        }
                    }
                    else {
                        constraintReference0.D(object8).e0(this.l).g0(this.r);
                    }
                }
                else {
                    constraintReference0.C(object7).e0(this.n).g0(this.t);
                }
            }
            else {
                constraintReference0.D(object6).e0(this.n).g0(this.t);
            }
        }
        if(constraintReference1 == null) {
            return;
        }
        float f1 = this.q0;
        if(f1 != 0.5f) {
            constraintReference1.a0(f1);
        }
        switch(this.w0) {
            case 1: {
                constraintReference1.u0(0);
                return;
            }
            case 2: {
                constraintReference1.u0(1);
                return;
            }
            case 3: {
                constraintReference1.u0(2);
            }
        }
    }
}

