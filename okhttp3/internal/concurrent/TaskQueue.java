package okhttp3.internal.concurrent;

import A3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.Util;
import y4.l;
import y4.m;

@s0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class TaskQueue {
    static final class AwaitIdleTask extends Task {
        @l
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(Util.okHttpName + " awaitIdle", false);
            this.latch = new CountDownLatch(1);
        }

        @l
        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override  // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    @m
    private Task activeTask;
    private boolean cancelActiveTask;
    @l
    private final List futureTasks;
    @l
    private final String name;
    private boolean shutdown;
    @l
    private final TaskRunner taskRunner;

    public TaskQueue(@l TaskRunner taskRunner0, @l String s) {
        L.p(taskRunner0, "taskRunner");
        L.p(s, "name");
        super();
        this.taskRunner = taskRunner0;
        this.name = s;
        this.futureTasks = new ArrayList();
    }

    public final void cancelAll() {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12519 MUST NOT hold lock on " + this);
        }
        synchronized(this.taskRunner) {
            if(this.cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task0 = this.activeTask;
        if(task0 != null) {
            L.m(task0);
            if(task0.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        int v = this.futureTasks.size() - 1;
        boolean z = false;
        while(-1 < v) {
            if(((Task)this.futureTasks.get(v)).getCancelable()) {
                Task task1 = (Task)this.futureTasks.get(v);
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task1, this, "canceled");
                }
                this.futureTasks.remove(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    public final void execute(@l String s, long v, boolean z, @l a a0) {
        L.p(s, "name");
        L.p(a0, "block");
        this.schedule(new Task(z, a0) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.$block.invoke();
                return -1L;
            }
        }, v);
    }

    public static void execute$default(TaskQueue taskQueue0, String s, long v, boolean z, a a0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        L.p(s, "name");
        L.p(a0, "block");
        taskQueue0.schedule(new okhttp3.internal.concurrent.TaskQueue.execute.1(s, z, a0), v);
    }

    @m
    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    @l
    public final List getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    @l
    public final String getName$okhttp() {
        return this.name;
    }

    @l
    public final List getScheduledTasks() {
        synchronized(this.taskRunner) {
            return u.V5(this.futureTasks);
        }
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    @l
    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    @l
    public final CountDownLatch idleLatch() {
        AwaitIdleTask taskQueue$AwaitIdleTask0;
        synchronized(this.taskRunner) {
            if(this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task0 = this.activeTask;
            if(task0 instanceof AwaitIdleTask) {
                return ((AwaitIdleTask)task0).getLatch();
            }
            for(Object object0: this.futureTasks) {
                Task task1 = (Task)object0;
                if(task1 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask)task1).getLatch();
                }
                if(false) {
                    break;
                }
            }
            taskQueue$AwaitIdleTask0 = new AwaitIdleTask();
            if(this.scheduleAndDecide$okhttp(taskQueue$AwaitIdleTask0, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
        return taskQueue$AwaitIdleTask0.getLatch();
    }

    public final void schedule(@l String s, long v, @l a a0) {
        L.p(s, "name");
        L.p(a0, "block");
        this.schedule(new Task(a0) {
            final a $block;

            {
                this.$block = a0;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return ((Number)this.$block.invoke()).longValue();
            }
        }, v);
    }

    public final void schedule(@l Task task0, long v) {
        L.p(task0, "task");
        synchronized(this.taskRunner) {
            if(this.shutdown) {
                if(task0.getCancelable()) {
                    if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.log(task0, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task0, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if(this.scheduleAndDecide$okhttp(task0, v, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public static void schedule$default(TaskQueue taskQueue0, String s, long v, a a0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        L.p(s, "name");
        L.p(a0, "block");
        taskQueue0.schedule(new okhttp3.internal.concurrent.TaskQueue.schedule.2(s, a0), v);
    }

    public static void schedule$default(TaskQueue taskQueue0, Task task0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        taskQueue0.schedule(task0, v);
    }

    public final boolean scheduleAndDecide$okhttp(@l Task task0, long v, boolean z) {
        L.p(task0, "task");
        task0.initQueue$okhttp(this);
        long v1 = this.taskRunner.getBackend().nanoTime();
        long v2 = v1 + v;
        int v3 = this.futureTasks.indexOf(task0);
        if(v3 != -1) {
            if(task0.getNextExecuteNanoTime$okhttp() <= v2) {
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task0, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(v3);
        }
        task0.setNextExecuteNanoTime$okhttp(v2);
        if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.log(task0, this, (z ? "run again after " + TaskLoggerKt.formatDuration(v2 - v1) : "scheduled after " + TaskLoggerKt.formatDuration(v2 - v1)));
        }
        int v4 = 0;
        Iterator iterator0 = this.futureTasks.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v4 = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(((Task)object0).getNextExecuteNanoTime$okhttp() - v1 > v) {
                break;
            }
            ++v4;
        }
        if(v4 == -1) {
            v4 = this.futureTasks.size();
        }
        this.futureTasks.add(v4, task0);
        return v4 == 0;
    }

    public final void setActiveTask$okhttp(@m Task task0) {
        this.activeTask = task0;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    public final void shutdown() {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12523 MUST NOT hold lock on " + this);
        }
        synchronized(this.taskRunner) {
            this.shutdown = true;
            if(this.cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    @Override
    @l
    public String toString() {
        return this.name;
    }
}

