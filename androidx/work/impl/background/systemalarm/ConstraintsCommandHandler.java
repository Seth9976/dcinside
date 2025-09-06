package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.b})
class ConstraintsCommandHandler {
    private final Context a;
    private final Clock b;
    private final int c;
    private final SystemAlarmDispatcher d;
    private final WorkConstraintsTracker e;
    private static final String f;

    static {
        ConstraintsCommandHandler.f = "WM-ConstraintsCmdHandle";
    }

    ConstraintsCommandHandler(@NonNull Context context0, Clock clock0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        this.a = context0;
        this.b = clock0;
        this.c = v;
        this.d = systemAlarmDispatcher0;
        this.e = new WorkConstraintsTracker(systemAlarmDispatcher0.g().T());
    }

    @WorkerThread
    void a() {
        List list0 = this.d.g().U().Z().E();
        ConstraintProxy.a(this.a, list0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        long v = this.b.currentTimeMillis();
        for(Object object0: list0) {
            WorkSpec workSpec0 = (WorkSpec)object0;
            if(v >= workSpec0.c() && (!workSpec0.J() || this.e.a(workSpec0))) {
                arrayList0.add(workSpec0);
            }
        }
        for(Object object1: arrayList0) {
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(((WorkSpec)object1));
            Intent intent0 = CommandHandler.b(this.a, workGenerationalId0);
            Logger.e().a("WM-ConstraintsCmdHandle", "Creating a delay_met command for workSpec with id (" + ((WorkSpec)object1).a + ")");
            this.d.f().c().execute(new AddRunnable(this.d, intent0, this.c));
        }
    }
}

