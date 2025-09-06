package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class AutoCloser {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public SupportSQLiteOpenHelper a;
    @l
    private final Handler b;
    @m
    private Runnable c;
    @l
    private final Object d;
    private long e;
    @l
    private final Executor f;
    @GuardedBy("lock")
    private int g;
    @GuardedBy("lock")
    private long h;
    @GuardedBy("lock")
    @m
    private SupportSQLiteDatabase i;
    private boolean j;
    @l
    private final Runnable k;
    @l
    private final Runnable l;
    @l
    public static final Companion m = null;
    @l
    public static final String n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    static {
        AutoCloser.m = new Companion(null);
    }

    public AutoCloser(long v, @l TimeUnit timeUnit0, @l Executor executor0) {
        L.p(timeUnit0, "autoCloseTimeUnit");
        L.p(executor0, "autoCloseExecutor");
        super();
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit0.toMillis(v);
        this.f = executor0;
        this.h = SystemClock.uptimeMillis();
        this.k = () -> {
            L.p(this, "this$0");
            this.f.execute(this.l);
        };
        this.l = () -> {
            S0 s00;
            L.p(this, "this$0");
            synchronized(this.d) {
                if(SystemClock.uptimeMillis() - this.h < this.e) {
                    return;
                }
                goto label_6;
            }
            return;
        label_6:
            if(this.g != 0) {
                return;
            }
            Runnable runnable0 = this.c;
            if(runnable0 == null) {
                s00 = null;
            }
            else {
                runnable0.run();
                s00 = S0.a;
            }
            if(s00 == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.i;
            if(supportSQLiteDatabase0 != null && supportSQLiteDatabase0.isOpen()) {
                supportSQLiteDatabase0.close();
            }
            this.i = null;
        };
    }

    // 检测为 Lambda 实现
    private static final void c(AutoCloser autoCloser0) [...]

    public final void d() throws IOException {
        synchronized(this.d) {
            this.j = true;
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.i;
            if(supportSQLiteDatabase0 != null) {
                supportSQLiteDatabase0.close();
            }
            this.i = null;
        }
    }

    public final void e() {
        int v;
        synchronized(this.d) {
            v = this.g;
            if(v <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we\'re supposed to decrement");
            }
        }
        this.g = v - 1;
        if(v - 1 == 0) {
            if(this.i == null) {
                return;
            }
            try {
                this.b.postDelayed(this.k, this.e);
                return;
            }
            catch(Throwable throwable0) {
            }
            throw throwable0;
        }
    }

    // 检测为 Lambda 实现
    private static final void f(AutoCloser autoCloser0) [...]

    public final Object g(@l Function1 function10) {
        L.p(function10, "block");
        try {
            return function10.invoke(this.n());
        }
        finally {
            this.e();
        }
    }

    @m
    public final SupportSQLiteDatabase h() {
        return this.i;
    }

    @l
    public final SupportSQLiteOpenHelper i() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.a;
        if(supportSQLiteOpenHelper0 != null) {
            return supportSQLiteOpenHelper0;
        }
        L.S("delegateOpenHelper");
        return null;
    }

    public final long j() {
        return this.h;
    }

    @m
    public final Runnable k() {
        return this.c;
    }

    public final int l() {
        return this.g;
    }

    @VisibleForTesting
    public final int m() {
        synchronized(this.d) {
        }
        return this.g;
    }

    @l
    public final SupportSQLiteDatabase n() {
        synchronized(this.d) {
            this.b.removeCallbacks(this.k);
            ++this.g;
            if(!this.j) {
                SupportSQLiteDatabase supportSQLiteDatabase0 = this.i;
                if(supportSQLiteDatabase0 != null && supportSQLiteDatabase0.isOpen()) {
                    return supportSQLiteDatabase0;
                }
                SupportSQLiteDatabase supportSQLiteDatabase1 = this.i().getWritableDatabase();
                this.i = supportSQLiteDatabase1;
                return supportSQLiteDatabase1;
            }
        }
        throw new IllegalStateException("Attempting to open already closed database.");
    }

    public final void o(@l SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        L.p(supportSQLiteOpenHelper0, "delegateOpenHelper");
        this.s(supportSQLiteOpenHelper0);
    }

    public final boolean p() {
        return !this.j;
    }

    public final void q(@l Runnable runnable0) {
        L.p(runnable0, "onAutoClose");
        this.c = runnable0;
    }

    public final void r(@m SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.i = supportSQLiteDatabase0;
    }

    public final void s(@l SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        L.p(supportSQLiteOpenHelper0, "<set-?>");
        this.a = supportSQLiteOpenHelper0;
    }

    public final void t(long v) {
        this.h = v;
    }

    public final void u(@m Runnable runnable0) {
        this.c = runnable0;
    }

    public final void v(int v) {
        this.g = v;
    }
}

