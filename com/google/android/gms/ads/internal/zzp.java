package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

final class zzp implements View.OnTouchListener {
    final zzu zza;

    zzp(zzu zzu0) {
        this.zza = zzu0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        zzu zzu0 = this.zza;
        if(zzu0.zzh != null) {
            zzu0.zzh.zzd(motionEvent0);
        }
        return false;
    }
}

