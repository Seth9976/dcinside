package okhttp3.internal.concurrent;

import A3.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.L;
import y4.l;

public final class TaskLoggerKt {
    @l
    public static final String formatDuration(long v) {
        String s;
        if(v <= -999500000L) {
            s = (v - 500000000L) / 1000000000L + " s ";
        }
        else if(v <= 0xFFFFFFFFFFF0BFB4L) {
            s = (v - 500000L) / 1000000L + " ms";
        }
        else if(v <= 0L) {
            s = (v - 500L) / 1000L + " µs";
        }
        else if(v < 0xF404CL) {
            s = (v + 500L) / 1000L + " µs";
        }
        else {
            s = v >= 999500000L ? (v + 500000000L) / 1000000000L + " s " : (v + 500000L) / 1000000L + " ms";
        }
        String s1 = String.format("%6s", Arrays.copyOf(new Object[]{s}, 1));
        L.o(s1, "format(format, *args)");
        return s1;
    }

    private static final void log(Task task0, TaskQueue taskQueue0, String s) {
        Logger logger0 = TaskRunner.Companion.getLogger();
        String s1 = String.format("%-22s", Arrays.copyOf(new Object[]{s}, 1));
        L.o(s1, "format(format, *args)");
        logger0.fine(taskQueue0.getName$okhttp() + ' ' + s1 + ": " + task0.getName());
    }

    public static final Object logElapsed(@l Task task0, @l TaskQueue taskQueue0, @l a a0) {
        Object object0;
        long v;
        L.p(task0, "task");
        L.p(taskQueue0, "queue");
        L.p(a0, "block");
        boolean z = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if(z) {
            v = taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime();
            TaskLoggerKt.log(task0, taskQueue0, "starting");
        }
        else {
            v = -1L;
        }
        try {
            object0 = a0.invoke();
        }
        catch(Throwable throwable0) {
            if(z) {
                TaskLoggerKt.log(task0, taskQueue0, "failed a run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v));
            }
            throw throwable0;
        }
        if(z) {
            TaskLoggerKt.log(task0, taskQueue0, "finished run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v));
        }
        return object0;
    }

    public static final void taskLog(@l Task task0, @l TaskQueue taskQueue0, @l a a0) {
        L.p(task0, "task");
        L.p(taskQueue0, "queue");
        L.p(a0, "messageBlock");
        if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.log(task0, taskQueue0, ((String)a0.invoke()));
        }
    }
}

