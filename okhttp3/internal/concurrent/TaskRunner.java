package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class TaskRunner {
    public interface Backend {
        void beforeTask(@l TaskRunner arg1);

        void coordinatorNotify(@l TaskRunner arg1);

        void coordinatorWait(@l TaskRunner arg1, long arg2);

        void execute(@l Runnable arg1);

        long nanoTime();
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    @s0({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class RealBackend implements Backend {
        @l
        private final ThreadPoolExecutor executor;

        public RealBackend(@l ThreadFactory threadFactory0) {
            L.p(threadFactory0, "threadFactory");
            super();
            this.executor = new ThreadPoolExecutor(0, 0x7FFFFFFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory0);
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void beforeTask(@l TaskRunner taskRunner0) {
            L.p(taskRunner0, "taskRunner");
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void coordinatorNotify(@l TaskRunner taskRunner0) {
            L.p(taskRunner0, "taskRunner");
            taskRunner0.notify();
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void coordinatorWait(@l TaskRunner taskRunner0, long v) throws InterruptedException {
            L.p(taskRunner0, "taskRunner");
            if(v / 1000000L > 0L || v > 0L) {
                taskRunner0.wait(v / 1000000L, ((int)(v - 1000000L * (v / 1000000L))));
            }
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void execute(@l Runnable runnable0) {
            L.p(runnable0, "runnable");
            this.executor.execute(runnable0);
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final TaskRunner INSTANCE;
    @l
    private final Backend backend;
    @l
    private final List busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    @l
    private static final Logger logger;
    private int nextQueueName;
    @l
    private final List readyQueues;
    @l
    private final Runnable runnable;

    static {
        TaskRunner.Companion = new Companion(null);
        TaskRunner.INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory((Util.okHttpName + " TaskRunner"), true)));
        Logger logger0 = Logger.getLogger("okhttp3.internal.concurrent.TaskRunner");
        L.o(logger0, "getLogger(TaskRunner::class.java.name)");
        TaskRunner.logger = logger0;
    }

    public TaskRunner(@l Backend taskRunner$Backend0) {
        L.p(taskRunner$Backend0, "backend");
        super();
        this.backend = taskRunner$Backend0;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() {
            @Override
            public void run() {
                Task task0;
                long v1;
                while(true) {
                    synchronized(TaskRunner.this) {
                        task0 = TaskRunner.this.awaitTaskToRun();
                    }
                    if(task0 == null) {
                        return;
                    }
                    TaskQueue taskQueue0 = task0.getQueue$okhttp();
                    L.m(taskQueue0);
                    TaskRunner taskRunner0 = TaskRunner.this;
                    boolean z = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if(z) {
                        v1 = taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.log(task0, taskQueue0, "starting");
                    }
                    else {
                        v1 = -1L;
                    }
                    try {
                        taskRunner0.runTask(task0);
                        if(!z) {
                            continue;
                        }
                    }
                    catch(Throwable throwable0) {
                        try {
                            taskRunner0.getBackend().execute(this);
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            if(z) {
                                TaskLoggerKt.log(task0, taskQueue0, "failed a run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v1));
                            }
                            throw throwable1;
                        }
                    }
                    TaskLoggerKt.log(task0, taskQueue0, "finished run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v1));
                }
            }
        };
    }

    @l
    public final List activeQueues() {
        synchronized(this) {
            return u.D4(this.busyQueues, this.readyQueues);
        }
    }

    private final void afterRun(Task task0, long v) {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12456 MUST hold lock on " + this);
        }
        TaskQueue taskQueue0 = task0.getQueue$okhttp();
        L.m(taskQueue0);
        if(taskQueue0.getActiveTask$okhttp() != task0) {
            throw new IllegalStateException("Check failed.");
        }
        taskQueue0.setCancelActiveTask$okhttp(false);
        taskQueue0.setActiveTask$okhttp(null);
        this.busyQueues.remove(taskQueue0);
        if(v != -1L && !taskQueue0.getCancelActiveTask$okhttp() && !taskQueue0.getShutdown$okhttp()) {
            taskQueue0.scheduleAndDecide$okhttp(task0, v, true);
        }
        if(!taskQueue0.getFutureTasks$okhttp().isEmpty()) {
            this.readyQueues.add(taskQueue0);
        }
    }

    @m
    public final Task awaitTaskToRun() {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12508 MUST hold lock on " + this);
        }
        while(true) {
            if(this.readyQueues.isEmpty()) {
                return null;
            }
            long v = this.backend.nanoTime();
            long v1 = 0x7FFFFFFFFFFFFFFFL;
            Task task0 = null;
            Iterator iterator0 = this.readyQueues.iterator();
            while(true) {
                boolean z = false;
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    Task task1 = (Task)((TaskQueue)object0).getFutureTasks$okhttp().get(0);
                    long v2 = Math.max(0L, task1.getNextExecuteNanoTime$okhttp() - v);
                    if(v2 > 0L) {
                        v1 = Math.min(v2, v1);
                        continue;
                    }
                    else if(task0 == null) {
                        task0 = task1;
                        continue;
                    }
                    else {
                        z = true;
                    }
                }
                break;
            }
            if(task0 != null) {
                this.beforeRun(task0);
                if(z || !this.coordinatorWaiting && !this.readyQueues.isEmpty()) {
                    this.backend.execute(this.runnable);
                }
                return task0;
            }
            if(this.coordinatorWaiting) {
                if(v1 < this.coordinatorWakeUpAt - v) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            try {
                this.coordinatorWaiting = true;
                this.coordinatorWakeUpAt = v + v1;
                this.backend.coordinatorWait(this, v1);
            }
            catch(InterruptedException unused_ex) {
                this.cancelAll();
            }
            finally {
                this.coordinatorWaiting = false;
            }
        }
    }

    private final void beforeRun(Task task0) {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12402 MUST hold lock on " + this);
        }
        task0.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue taskQueue0 = task0.getQueue$okhttp();
        L.m(taskQueue0);
        taskQueue0.getFutureTasks$okhttp().remove(task0);
        this.readyQueues.remove(taskQueue0);
        taskQueue0.setActiveTask$okhttp(task0);
        this.busyQueues.add(taskQueue0);
    }

    public final void cancelAll() {
        for(int v = this.busyQueues.size() - 1; -1 < v; --v) {
            ((TaskQueue)this.busyQueues.get(v)).cancelAllAndDecide$okhttp();
        }
        for(int v1 = this.readyQueues.size() - 1; -1 < v1; --v1) {
            TaskQueue taskQueue0 = (TaskQueue)this.readyQueues.get(v1);
            taskQueue0.cancelAllAndDecide$okhttp();
            if(taskQueue0.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(v1);
            }
        }
    }

    @l
    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(@l TaskQueue taskQueue0) {
        L.p(taskQueue0, "taskQueue");
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12465 MUST hold lock on " + this);
        }
        if(taskQueue0.getActiveTask$okhttp() == null) {
            if(taskQueue0.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(taskQueue0);
            }
            else {
                Util.addIfAbsent(this.readyQueues, taskQueue0);
            }
        }
        if(this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
            return;
        }
        this.backend.execute(this.runnable);
    }

    @l
    public final TaskQueue newQueue() {
        int v;
        synchronized(this) {
            v = this.nextQueueName;
            this.nextQueueName = v + 1;
        }
        return new TaskQueue(this, 'Q' + v);
    }

    private final void runTask(Task task0) {
        long v;
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12349 MUST NOT hold lock on " + this);
        }
        Thread thread0 = Thread.currentThread();
        thread0.setName(task0.getName());
        try {
            v = task0.runOnce();
        }
        catch(Throwable throwable0) {
            synchronized(this) {
                this.afterRun(task0, -1L);
            }
            thread0.setName("jeb-dexdec-sb-st-12349");
            throw throwable0;
        }
        synchronized(this) {
            this.afterRun(task0, v);
        }
        thread0.setName("jeb-dexdec-sb-st-12349");
    }
}

