package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;

public class AlignHorizontallyReference extends HelperReference {
    private float q0;

    public AlignHorizontallyReference(State state0) {
        super(state0, Helper.d);
        this.q0 = 0.5f;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        for(Object object0: this.o0) {
            ConstraintReference constraintReference0 = this.m0.f(object0);
            constraintReference0.x();
            Object object1 = this.O;
            if(object1 == null) {
                Object object2 = this.P;
                if(object2 == null) {
                    constraintReference0.D0(State.o);
                }
                else {
                    constraintReference0.C0(object2);
                }
            }
            else {
                constraintReference0.D0(object1);
            }
            Object object3 = this.Q;
            if(object3 == null) {
                Object object4 = this.R;
                if(object4 == null) {
                    constraintReference0.C(State.o);
                }
                else {
                    constraintReference0.C(object4);
                }
            }
            else {
                constraintReference0.D(object3);
            }
            float f = this.q0;
            if(f != 0.5f) {
                constraintReference0.a0(f);
            }
        }
    }
}

