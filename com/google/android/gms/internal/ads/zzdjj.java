package com.google.android.gms.internal.ads;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import androidx.annotation.GuardedBy;

public final class zzdjj implements GestureDetector.OnGestureListener {
    @GuardedBy("this")
    private final zzdia zza;
    private final zzdjb zzb;

    zzdjj(zzdia zzdia0, zzdjb zzdjb0) {
        this.zza = zzdia0;
        this.zzb = zzdjb0;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        int v2;
        int v = -1;
        synchronized(this) {
            if(this.zza != null) {
                if(Math.abs(f) <= Math.abs(f1)) {
                    if(f1 > 0.0f) {
                        v2 = (int)((motionEvent1.getY() - motionEvent0.getY()) / f1 * 1000.0f);
                        v = 8;
                    }
                    else if(f1 < 0.0f) {
                        v2 = (int)((motionEvent1.getY() - motionEvent0.getY()) / f1 * 1000.0f);
                        v = 4;
                    }
                    else {
                        v2 = 0;
                    }
                }
                else if(f > 0.0f) {
                    v2 = (int)((motionEvent1.getX() - motionEvent0.getX()) / f * 1000.0f);
                    v = 1;
                }
                else if(f < 0.0f) {
                    v2 = (int)((motionEvent1.getX() - motionEvent0.getX()) / f * 1000.0f);
                    v = 2;
                }
                else {
                    v2 = 0;
                }
                if(v == this.zza.zza()) {
                    this.zza.zzE(this.zzb.zzr(), v2);
                    return false;
                }
            }
            return false;
        }
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onShowPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent0) {
        synchronized(this) {
        }
        return false;
    }
}

