package kotlinx.coroutines.scheduling;

import y4.l;
import z3.i;

public final class b {
    @i(name = "isSchedulerWorker")
    public static final boolean a(@l Thread thread0) {
        return thread0 instanceof c;
    }

    @i(name = "mayNotBlock")
    public static final boolean b(@l Thread thread0) {
        return thread0 instanceof c && ((c)thread0).c == d.a;
    }
}

