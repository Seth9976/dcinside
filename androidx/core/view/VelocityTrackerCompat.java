package androidx.core.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.WeakHashMap;

public final class VelocityTrackerCompat {
    @RequiresApi(34)
    static class Api34Impl {
        static float a(VelocityTracker velocityTracker0, int v) {
            return velocityTracker0.getAxisVelocity(v);
        }

        static float b(VelocityTracker velocityTracker0, int v, int v1) {
            return velocityTracker0.getAxisVelocity(v, v1);
        }

        static boolean c(VelocityTracker velocityTracker0, int v) {
            return velocityTracker0.isAxisSupported(v);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    private static Map a;

    static {
        VelocityTrackerCompat.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public static void a(VelocityTracker velocityTracker0, MotionEvent motionEvent0) {
        velocityTracker0.addMovement(motionEvent0);
        if(Build.VERSION.SDK_INT >= 34) {
            return;
        }
        if(motionEvent0.getSource() == 0x400000) {
            if(!VelocityTrackerCompat.a.containsKey(velocityTracker0)) {
                VelocityTrackerCompat.a.put(velocityTracker0, new VelocityTrackerFallback());
            }
            ((VelocityTrackerFallback)VelocityTrackerCompat.a.get(velocityTracker0)).a(motionEvent0);
        }
    }

    public static void b(VelocityTracker velocityTracker0) {
        velocityTracker0.clear();
        VelocityTrackerCompat.l(velocityTracker0);
    }

    public static void c(VelocityTracker velocityTracker0, int v) {
        VelocityTrackerCompat.d(velocityTracker0, v, 3.402823E+38f);
    }

    public static void d(VelocityTracker velocityTracker0, int v, float f) {
        velocityTracker0.computeCurrentVelocity(v, f);
        VelocityTrackerFallback velocityTrackerFallback0 = VelocityTrackerCompat.g(velocityTracker0);
        if(velocityTrackerFallback0 != null) {
            velocityTrackerFallback0.d(v, f);
        }
    }

    public static float e(VelocityTracker velocityTracker0, int v) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.a(velocityTracker0, v);
        }
        if(v == 0) {
            return velocityTracker0.getXVelocity();
        }
        if(v == 1) {
            return velocityTracker0.getYVelocity();
        }
        VelocityTrackerFallback velocityTrackerFallback0 = VelocityTrackerCompat.g(velocityTracker0);
        return velocityTrackerFallback0 == null ? 0.0f : velocityTrackerFallback0.e(v);
    }

    public static float f(VelocityTracker velocityTracker0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.b(velocityTracker0, v, v1);
        }
        if(v == 0) {
            return velocityTracker0.getXVelocity(v1);
        }
        return v == 1 ? velocityTracker0.getYVelocity(v1) : 0.0f;
    }

    private static VelocityTrackerFallback g(VelocityTracker velocityTracker0) {
        return (VelocityTrackerFallback)VelocityTrackerCompat.a.get(velocityTracker0);
    }

    @ReplaceWith(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float h(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getXVelocity(v);
    }

    @ReplaceWith(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float i(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getYVelocity(v);
    }

    public static boolean j(VelocityTracker velocityTracker0, int v) {
        return Build.VERSION.SDK_INT < 34 ? v == 0 || v == 1 || v == 26 : Api34Impl.c(velocityTracker0, v);
    }

    public static void k(VelocityTracker velocityTracker0) {
        velocityTracker0.recycle();
        VelocityTrackerCompat.l(velocityTracker0);
    }

    private static void l(VelocityTracker velocityTracker0) {
        VelocityTrackerCompat.a.remove(velocityTracker0);
    }
}

