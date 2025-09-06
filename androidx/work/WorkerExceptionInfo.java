package androidx.work;

import kotlin.jvm.internal.L;
import y4.l;

public final class WorkerExceptionInfo {
    @l
    private final String a;
    @l
    private final WorkerParameters b;
    @l
    private final Throwable c;

    public WorkerExceptionInfo(@l String s, @l WorkerParameters workerParameters0, @l Throwable throwable0) {
        L.p(s, "workerClassName");
        L.p(workerParameters0, "workerParameters");
        L.p(throwable0, "throwable");
        super();
        this.a = s;
        this.b = workerParameters0;
        this.c = throwable0;
    }

    @l
    public final Throwable a() {
        return this.c;
    }

    @l
    public final String b() {
        return this.a;
    }

    @l
    public final WorkerParameters c() {
        return this.b;
    }
}

