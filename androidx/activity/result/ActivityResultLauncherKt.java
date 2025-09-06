package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

public final class ActivityResultLauncherKt {
    public static final void a(@l ActivityResultLauncher activityResultLauncher0, @m ActivityOptionsCompat activityOptionsCompat0) {
        L.p(activityResultLauncher0, "<this>");
        activityResultLauncher0.c(null, activityOptionsCompat0);
    }

    public static void b(ActivityResultLauncher activityResultLauncher0, ActivityOptionsCompat activityOptionsCompat0, int v, Object object0) {
        if((v & 1) != 0) {
            activityOptionsCompat0 = null;
        }
        ActivityResultLauncherKt.a(activityResultLauncher0, activityOptionsCompat0);
    }

    @i(name = "launchUnit")
    public static final void c(@l ActivityResultLauncher activityResultLauncher0, @m ActivityOptionsCompat activityOptionsCompat0) {
        L.p(activityResultLauncher0, "<this>");
        activityResultLauncher0.c(S0.a, activityOptionsCompat0);
    }

    public static void d(ActivityResultLauncher activityResultLauncher0, ActivityOptionsCompat activityOptionsCompat0, int v, Object object0) {
        if((v & 1) != 0) {
            activityOptionsCompat0 = null;
        }
        ActivityResultLauncherKt.c(activityResultLauncher0, activityOptionsCompat0);
    }
}

