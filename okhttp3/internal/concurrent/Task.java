package okhttp3.internal.concurrent;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class Task {
    private final boolean cancelable;
    @l
    private final String name;
    private long nextExecuteNanoTime;
    @m
    private TaskQueue queue;

    public Task(@l String s, boolean z) {
        L.p(s, "name");
        super();
        this.name = s;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public Task(String s, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = true;
        }
        this(s, z);
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    @m
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(@l TaskQueue taskQueue0) {
        L.p(taskQueue0, "queue");
        TaskQueue taskQueue1 = this.queue;
        if(taskQueue1 == taskQueue0) {
            return;
        }
        if(taskQueue1 != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.queue = taskQueue0;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long v) {
        this.nextExecuteNanoTime = v;
    }

    public final void setQueue$okhttp(@m TaskQueue taskQueue0) {
        this.queue = taskQueue0;
    }

    @Override
    @l
    public String toString() {
        return this.name;
    }
}

