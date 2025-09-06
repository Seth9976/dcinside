package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

@RestrictTo({Scope.b})
public final class Trackers {
    @l
    private final Context a;
    @l
    private final ConstraintTracker b;
    @l
    private final BatteryNotLowTracker c;
    @l
    private final ConstraintTracker d;
    @l
    private final ConstraintTracker e;

    @j
    public Trackers(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        this(context0, taskExecutor0, null, null, null, null, 60, null);
    }

    @j
    public Trackers(@l Context context0, @l TaskExecutor taskExecutor0, @l ConstraintTracker constraintTracker0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        L.p(constraintTracker0, "batteryChargingTracker");
        this(context0, taskExecutor0, constraintTracker0, null, null, null, 56, null);
    }

    @j
    public Trackers(@l Context context0, @l TaskExecutor taskExecutor0, @l ConstraintTracker constraintTracker0, @l BatteryNotLowTracker batteryNotLowTracker0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        L.p(constraintTracker0, "batteryChargingTracker");
        L.p(batteryNotLowTracker0, "batteryNotLowTracker");
        this(context0, taskExecutor0, constraintTracker0, batteryNotLowTracker0, null, null, 0x30, null);
    }

    @j
    public Trackers(@l Context context0, @l TaskExecutor taskExecutor0, @l ConstraintTracker constraintTracker0, @l BatteryNotLowTracker batteryNotLowTracker0, @l ConstraintTracker constraintTracker1) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        L.p(constraintTracker0, "batteryChargingTracker");
        L.p(batteryNotLowTracker0, "batteryNotLowTracker");
        L.p(constraintTracker1, "networkStateTracker");
        this(context0, taskExecutor0, constraintTracker0, batteryNotLowTracker0, constraintTracker1, null, 0x20, null);
    }

    @j
    public Trackers(@l Context context0, @l TaskExecutor taskExecutor0, @l ConstraintTracker constraintTracker0, @l BatteryNotLowTracker batteryNotLowTracker0, @l ConstraintTracker constraintTracker1, @l ConstraintTracker constraintTracker2) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        L.p(constraintTracker0, "batteryChargingTracker");
        L.p(batteryNotLowTracker0, "batteryNotLowTracker");
        L.p(constraintTracker1, "networkStateTracker");
        L.p(constraintTracker2, "storageNotLowTracker");
        super();
        this.a = context0;
        this.b = constraintTracker0;
        this.c = batteryNotLowTracker0;
        this.d = constraintTracker1;
        this.e = constraintTracker2;
    }

    public Trackers(Context context0, TaskExecutor taskExecutor0, ConstraintTracker constraintTracker0, BatteryNotLowTracker batteryNotLowTracker0, ConstraintTracker constraintTracker1, ConstraintTracker constraintTracker2, int v, w w0) {
        ConstraintTracker constraintTracker5;
        ConstraintTracker constraintTracker4;
        BatteryNotLowTracker batteryNotLowTracker1;
        ConstraintTracker constraintTracker3;
        if((v & 4) == 0) {
            constraintTracker3 = constraintTracker0;
        }
        else {
            Context context1 = context0.getApplicationContext();
            L.o(context1, "context.applicationContext");
            constraintTracker3 = new BatteryChargingTracker(context1, taskExecutor0);
        }
        if((v & 8) == 0) {
            batteryNotLowTracker1 = batteryNotLowTracker0;
        }
        else {
            Context context2 = context0.getApplicationContext();
            L.o(context2, "context.applicationContext");
            batteryNotLowTracker1 = new BatteryNotLowTracker(context2, taskExecutor0);
        }
        if((v & 16) == 0) {
            constraintTracker4 = constraintTracker1;
        }
        else {
            Context context3 = context0.getApplicationContext();
            L.o(context3, "context.applicationContext");
            constraintTracker4 = NetworkStateTrackerKt.a(context3, taskExecutor0);
        }
        if((v & 0x20) == 0) {
            constraintTracker5 = constraintTracker2;
        }
        else {
            Context context4 = context0.getApplicationContext();
            L.o(context4, "context.applicationContext");
            constraintTracker5 = new StorageNotLowTracker(context4, taskExecutor0);
        }
        this(context0, taskExecutor0, constraintTracker3, batteryNotLowTracker1, constraintTracker4, constraintTracker5);
    }

    @l
    public final ConstraintTracker a() {
        return this.b;
    }

    @l
    public final BatteryNotLowTracker b() {
        return this.c;
    }

    @l
    public final Context c() {
        return this.a;
    }

    @l
    public final ConstraintTracker d() {
        return this.d;
    }

    @l
    public final ConstraintTracker e() {
        return this.e;
    }
}

