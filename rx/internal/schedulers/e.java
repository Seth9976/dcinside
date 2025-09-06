package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.functions.o;
import rx.internal.util.n;
import rx.plugins.c;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
final class e extends Enum {
    static final String a = "RxScheduledExecutorPool-";
    static final n b;
    private static final e[] c;

    static {
        e.c = new e[0];
        e.b = new n("RxScheduledExecutorPool-");
    }

    private e(String s, int v) {
        super(s, v);
    }

    public static ScheduledExecutorService a() {
        o o0 = c.j();
        return o0 == null ? e.b() : ((ScheduledExecutorService)o0.call());
    }

    static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(1, e.c());
    }

    static ThreadFactory c() {
        return e.b;
    }

    public static e valueOf(String s) {
        return (e)Enum.valueOf(e.class, s);
    }

    public static e[] values() {
        return (e[])e.c.clone();
    }
}

