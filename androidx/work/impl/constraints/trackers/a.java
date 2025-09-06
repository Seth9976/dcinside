package androidx.work.impl.constraints.trackers;

import java.util.List;

public final class a implements Runnable {
    public final List a;
    public final ConstraintTracker b;

    public a(List list0, ConstraintTracker constraintTracker0) {
        this.a = list0;
        this.b = constraintTracker0;
    }

    @Override
    public final void run() {
        ConstraintTracker.b(this.a, this.b);
    }
}

