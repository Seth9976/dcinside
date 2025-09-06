package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

public class DifferentialMotionFlingController {
    @VisibleForTesting
    interface DifferentialVelocityProvider {
        float a(VelocityTracker arg1, MotionEvent arg2, int arg3);
    }

    @VisibleForTesting
    interface FlingVelocityThresholdCalculator {
        void a(Context arg1, int[] arg2, MotionEvent arg3, int arg4);
    }

    private final Context a;
    private final DifferentialMotionFlingTarget b;
    private final FlingVelocityThresholdCalculator c;
    private final DifferentialVelocityProvider d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    public DifferentialMotionFlingController(Context context0, DifferentialMotionFlingTarget differentialMotionFlingTarget0) {
        this(context0, differentialMotionFlingTarget0, (Context context0, int[] arr_v, MotionEvent motionEvent0, int v) -> {
            ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
            arr_v[0] = ViewConfigurationCompat.i(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
            arr_v[1] = ViewConfigurationCompat.h(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
        }, (VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) -> {
            VelocityTrackerCompat.a(velocityTracker0, motionEvent0);
            VelocityTrackerCompat.c(velocityTracker0, 1000);
            return VelocityTrackerCompat.e(velocityTracker0, v);
        });
    }

    @VisibleForTesting
    DifferentialMotionFlingController(Context context0, DifferentialMotionFlingTarget differentialMotionFlingTarget0, FlingVelocityThresholdCalculator differentialMotionFlingController$FlingVelocityThresholdCalculator0, DifferentialVelocityProvider differentialMotionFlingController$DifferentialVelocityProvider0) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{0x7FFFFFFF, 0};
        this.a = context0;
        this.b = differentialMotionFlingTarget0;
        this.c = differentialMotionFlingController$FlingVelocityThresholdCalculator0;
        this.d = differentialMotionFlingController$DifferentialVelocityProvider0;
    }

    // 检测为 Lambda 实现
    private static void c(Context context0, int[] arr_v, MotionEvent motionEvent0, int v) [...]

    private boolean d(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getSource();
        int v2 = motionEvent0.getDeviceId();
        if(this.h == v1 && this.i == v2 && this.g == v) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent0, v);
        this.h = v1;
        this.i = v2;
        this.g = v;
        return true;
    }

    private float e(MotionEvent motionEvent0, int v) {
        if(this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent0, v);
    }

    // 检测为 Lambda 实现
    private static float f(VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) [...]

    public void g(MotionEvent motionEvent0, int v) {
        boolean z = this.d(motionEvent0, v);
        if(this.j[0] == 0x7FFFFFFF) {
            VelocityTracker velocityTracker0 = this.e;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.e = null;
            }
            return;
        }
        float f = this.e(motionEvent0, v) * this.b.a();
        float f1 = Math.signum(f);
        float f2 = 0.0f;
        if(z || f1 != Math.signum(this.f) && f1 != 0.0f) {
            this.b.c();
        }
        int[] arr_v = this.j;
        if(Math.abs(f) < ((float)arr_v[0])) {
            return;
        }
        float f3 = Math.max(-arr_v[1], Math.min(f, arr_v[1]));
        if(this.b.b(f3)) {
            f2 = f3;
        }
        this.f = f2;
    }
}

