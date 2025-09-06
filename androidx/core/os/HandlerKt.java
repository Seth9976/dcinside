package androidx.core.os;

import A3.a;
import android.os.Handler;
import y4.l;
import y4.m;

public final class HandlerKt {
    @l
    public static final Runnable a(@l Handler handler0, long v, @m Object object0, @l a a0) {
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                a0.invoke();
            }
        };
        handler0.postAtTime(runnable0, object0, v);
        return runnable0;
    }

    public static Runnable b(Handler handler0, long v, Object object0, a a0, int v1, Object object1) {
        if((v1 & 2) != 0) {
            object0 = null;
        }
        Runnable runnable0 = new androidx.core.os.HandlerKt.postAtTime.runnable.1(a0);
        handler0.postAtTime(runnable0, object0, v);
        return runnable0;
    }

    @l
    public static final Runnable c(@l Handler handler0, long v, @m Object object0, @l a a0) {
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                a0.invoke();
            }
        };
        if(object0 == null) {
            handler0.postDelayed(runnable0, v);
            return runnable0;
        }
        HandlerCompat.d(handler0, runnable0, object0, v);
        return runnable0;
    }

    public static Runnable d(Handler handler0, long v, Object object0, a a0, int v1, Object object1) {
        if((v1 & 2) != 0) {
            object0 = null;
        }
        Runnable runnable0 = new androidx.core.os.HandlerKt.postDelayed.runnable.1(a0);
        if(object0 == null) {
            handler0.postDelayed(runnable0, v);
            return runnable0;
        }
        HandlerCompat.d(handler0, runnable0, object0, v);
        return runnable0;
    }
}

