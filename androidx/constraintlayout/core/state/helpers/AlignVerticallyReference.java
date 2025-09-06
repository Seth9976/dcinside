package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class AlignVerticallyReference extends HelperReference {
    private float q0;

    public AlignVerticallyReference(State state0) {
        super(state0, Helper.d);
        this.q0 = 0.5f;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.o0) {
            ConstraintReference constraintReference0 = this.m0.f(object0);
            constraintReference0.y();
            Object object1 = this.S;
            if(object1 == null) {
                Object object2 = this.T;
                if(object2 == null) {
                    constraintReference0.H0(State.o);
                }
                else {
                    constraintReference0.G0(object2);
                }
            }
            else {
                constraintReference0.H0(object1);
            }
            Object object3 = this.V;
            if(object3 == null) {
                Object object4 = this.W;
                if(object4 == null) {
                    constraintReference0.q(State.o);
                }
                else {
                    constraintReference0.q(object4);
                }
            }
            else {
                constraintReference0.r(object3);
            }
            float f = this.q0;
            if(f != 0.5f) {
                constraintReference0.M0(f);
            }
        }
    }
}

