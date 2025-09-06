package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Direction;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class BarrierReference extends HelperReference {
    private Direction q0;
    private int r0;
    private Barrier s0;

    public BarrierReference(State state0) {
        super(state0, Helper.e);
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget R0() {
        if(this.s0 == null) {
            this.s0 = new Barrier();
        }
        return this.s0;
    }

    public void U0(Direction state$Direction0) {
        this.q0 = state$Direction0;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        this.R0();
        int v = 3;
        switch(this.q0) {
            case 3: 
            case 4: {
                v = 1;
                break;
            }
            case 5: {
                v = 2;
                break;
            }
            case 6: {
                break;
            }
            default: {
                v = 0;
            }
        }
        this.s0.v2(v);
        this.s0.w2(this.r0);
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference e0(int v) {
        this.r0 = v;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference f0(Object object0) {
        this.e0(this.m0.g(object0));
        return this;
    }
}

