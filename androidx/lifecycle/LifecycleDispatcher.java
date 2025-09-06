package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class LifecycleDispatcher {
    @VisibleForTesting
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
        public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
            L.p(activity0, "activity");
            ReportFragment.b.d(activity0);
        }
    }

    @l
    public static final LifecycleDispatcher a;
    @l
    private static final AtomicBoolean b;

    static {
        LifecycleDispatcher.a = new LifecycleDispatcher();
        LifecycleDispatcher.b = new AtomicBoolean(false);
    }

    @n
    public static final void a(@l Context context0) {
        L.p(context0, "context");
        if(LifecycleDispatcher.b.getAndSet(true)) {
            return;
        }
        Context context1 = context0.getApplicationContext();
        L.n(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}

