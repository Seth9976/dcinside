package androidx.work.impl.constraints.controllers;

import android.os.Build.VERSION;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.L;
import y4.l;

public final class NetworkConnectedController extends BaseConstraintController {
    private final int b;

    public NetworkConnectedController(@l ConstraintTracker constraintTracker0) {
        L.p(constraintTracker0, "tracker");
        super(constraintTracker0);
        this.b = 7;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean c(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        return workSpec0.j.f() == NetworkType.b;
    }

    @Override  // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int e() {
        return this.b;
    }

    @Override  // androidx.work.impl.constraints.controllers.BaseConstraintController
    public boolean g(Object object0) {
        return this.h(((NetworkState)object0));
    }

    protected boolean h(@l NetworkState networkState0) {
        L.p(networkState0, "value");
        return Build.VERSION.SDK_INT < 26 ? !networkState0.g() : !networkState0.g() || !networkState0.j();
    }
}

