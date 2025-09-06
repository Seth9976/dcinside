package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public final class f {
    static {
    }

    @m
    public static StartStopToken a(StartStopTokens startStopTokens0, @l WorkSpec workSpec0) {
        L.p(workSpec0, "spec");
        return startStopTokens0.c(WorkSpecKt.a(workSpec0));
    }

    @l
    public static StartStopToken b(StartStopTokens startStopTokens0, @l WorkSpec workSpec0) {
        L.p(workSpec0, "spec");
        return startStopTokens0.e(WorkSpecKt.a(workSpec0));
    }

    @l
    @j
    @n
    public static StartStopTokens c() {
        return StartStopTokens.a.a();
    }

    @l
    @j
    @n
    public static StartStopTokens d(boolean z) {
        return StartStopTokens.a.b(z);
    }
}

