package androidx.work.impl.constraints.controllers;

import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class NetworkNotRoamingController extends BaseConstraintController {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    private final int b;
    @l
    public static final Companion c;
    @l
    private static final String d;

    static {
        NetworkNotRoamingController.c = new Companion(null);
        L.o("WM-NetworkNotRoamingCtr", "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        NetworkNotRoamingController.d = "WM-NetworkNotRoamingCtr";
    }

    public NetworkNotRoamingController(@l ConstraintTracker constraintTracker0) {
        L.p(constraintTracker0, "tracker");
        super(constraintTracker0);
        this.b = 7;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean c(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        return workSpec0.j.f() == NetworkType.d;
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
        if(Build.VERSION.SDK_INT < 24) {
            Logger.e().a("WM-NetworkNotRoamingCtr", "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            return !networkState0.g();
        }
        return !networkState0.g() || !networkState0.i();
    }
}

