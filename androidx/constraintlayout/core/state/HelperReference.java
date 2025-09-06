package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

public class HelperReference extends ConstraintReference implements Facade {
    protected final State m0;
    final Helper n0;
    protected ArrayList o0;
    private HelperWidget p0;

    public HelperReference(State state0, Helper state$Helper0) {
        super(state0);
        this.o0 = new ArrayList();
        this.m0 = state0;
        this.n0 = state$Helper0;
    }

    public HelperReference P0(Object[] arr_object) {
        Collections.addAll(this.o0, arr_object);
        return this;
    }

    public void Q0() {
        super.apply();
    }

    public HelperWidget R0() {
        return this.p0;
    }

    public Helper S0() {
        return this.n0;
    }

    public void T0(HelperWidget helperWidget0) {
        this.p0 = helperWidget0;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.helpers.Facade
    public ConstraintWidget a() {
        return this.R0();
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.helpers.Facade
    public void apply() {
    }
}

