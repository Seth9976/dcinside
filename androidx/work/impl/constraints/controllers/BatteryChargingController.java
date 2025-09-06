package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.L;
import y4.l;

public final class BatteryChargingController extends BaseConstraintController {
    private final int b;

    public BatteryChargingController(@l ConstraintTracker constraintTracker0) {
        L.p(constraintTracker0, "tracker");
        super(constraintTracker0);
        this.b = 6;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean c(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        return workSpec0.j.i();
    }

    @Override  // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int e() {
        return this.b;
    }

    @Override  // androidx.work.impl.constraints.controllers.BaseConstraintController
    public boolean g(Object object0) {
        return this.h(((Boolean)object0).booleanValue());
    }

    protected boolean h(boolean z) {
        return !z;
    }
}

