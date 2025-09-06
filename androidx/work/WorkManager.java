package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.UUID;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlinx.coroutines.flow.i;
import y4.l;
import z3.n;

@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @k(message = "Use the overload receiving Context", replaceWith = @c0(expression = "WorkManager.getContext(context)", imports = {}))
        @l
        @n
        public WorkManager a() {
            WorkManager workManager0 = WorkManagerImpl.N();
            if(workManager0 == null) {
                throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
            }
            return workManager0;
        }

        @l
        @n
        public WorkManager b(@l Context context0) {
            L.p(context0, "context");
            WorkManager workManager0 = WorkManagerImpl.O(context0);
            L.o(workManager0, "getInstance(context)");
            return workManager0;
        }

        @n
        public void c(@l Context context0, @l Configuration configuration0) {
            L.p(context0, "context");
            L.p(configuration0, "configuration");
            WorkManagerImpl.F(context0, configuration0);
        }

        @n
        public boolean d() {
            return WorkManagerImpl.G();
        }
    }

    public static enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;

        private static final UpdateResult[] a() [...] // Inlined contents
    }

    @l
    public static final Companion a;

    static {
        WorkManager.a = new Companion(null);
    }

    @l
    public abstract i A(@l WorkQuery arg1);

    @l
    public abstract t0 B(@l String arg1);

    @l
    public abstract i C(@l String arg1);

    @l
    public abstract LiveData D(@l String arg1);

    @l
    public abstract LiveData E(@l WorkQuery arg1);

    @n
    public static void F(@l Context context0, @l Configuration configuration0) {
        WorkManager.a.c(context0, configuration0);
    }

    @n
    public static boolean G() {
        return WorkManager.a.d();
    }

    @l
    public abstract Operation H();

    @l
    public abstract t0 I(@l WorkRequest arg1);

    @l
    public final WorkContinuation a(@l String s, @l ExistingWorkPolicy existingWorkPolicy0, @l OneTimeWorkRequest oneTimeWorkRequest0) {
        L.p(s, "uniqueWorkName");
        L.p(existingWorkPolicy0, "existingWorkPolicy");
        L.p(oneTimeWorkRequest0, "request");
        return this.b(s, existingWorkPolicy0, u.k(oneTimeWorkRequest0));
    }

    @l
    public abstract WorkContinuation b(@l String arg1, @l ExistingWorkPolicy arg2, @l List arg3);

    @l
    public final WorkContinuation c(@l OneTimeWorkRequest oneTimeWorkRequest0) {
        L.p(oneTimeWorkRequest0, "request");
        return this.d(u.k(oneTimeWorkRequest0));
    }

    @l
    public abstract WorkContinuation d(@l List arg1);

    @l
    public abstract Operation e();

    @l
    public abstract Operation f(@l String arg1);

    @l
    public abstract Operation g(@l String arg1);

    @l
    public abstract Operation h(@l UUID arg1);

    @l
    public abstract PendingIntent i(@l UUID arg1);

    @l
    public final Operation j(@l WorkRequest workRequest0) {
        L.p(workRequest0, "request");
        return this.k(u.k(workRequest0));
    }

    @l
    public abstract Operation k(@l List arg1);

    @l
    public abstract Operation l(@l String arg1, @l ExistingPeriodicWorkPolicy arg2, @l PeriodicWorkRequest arg3);

    @l
    public Operation m(@l String s, @l ExistingWorkPolicy existingWorkPolicy0, @l OneTimeWorkRequest oneTimeWorkRequest0) {
        L.p(s, "uniqueWorkName");
        L.p(existingWorkPolicy0, "existingWorkPolicy");
        L.p(oneTimeWorkRequest0, "request");
        return this.n(s, existingWorkPolicy0, u.k(oneTimeWorkRequest0));
    }

    @l
    public abstract Operation n(@l String arg1, @l ExistingWorkPolicy arg2, @l List arg3);

    @l
    public abstract Configuration o();

    @k(message = "Use the overload receiving Context", replaceWith = @c0(expression = "WorkManager.getContext(context)", imports = {}))
    @l
    @n
    public static WorkManager p() {
        return WorkManager.a.a();
    }

    @l
    @n
    public static WorkManager q(@l Context context0) {
        return WorkManager.a.b(context0);
    }

    @l
    public abstract t0 r();

    @l
    public abstract LiveData s();

    @l
    public abstract t0 t(@l UUID arg1);

    @l
    public abstract i u(@l UUID arg1);

    @l
    public abstract LiveData v(@l UUID arg1);

    @l
    public abstract t0 w(@l WorkQuery arg1);

    @l
    public abstract t0 x(@l String arg1);

    @l
    public abstract i y(@l String arg1);

    @l
    public abstract LiveData z(@l String arg1);
}

