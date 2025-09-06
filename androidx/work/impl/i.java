package androidx.work.impl;

import kotlin.jvm.internal.L;
import y4.l;

public final class i {
    public static void a(WorkLauncher workLauncher0, @l StartStopToken startStopToken0) {
        L.p(startStopToken0, "workSpecId");
        workLauncher0.c(startStopToken0, null);
    }

    public static void b(WorkLauncher workLauncher0, @l StartStopToken startStopToken0) {
        L.p(startStopToken0, "workSpecId");
        workLauncher0.d(startStopToken0, 0xFFFFFE00);
    }

    public static void c(WorkLauncher workLauncher0, @l StartStopToken startStopToken0, int v) {
        L.p(startStopToken0, "workSpecId");
        workLauncher0.d(startStopToken0, v);
    }
}

