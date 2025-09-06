package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class zzdoq implements View.OnTouchListener {
    public final zzdov zza;

    public zzdoq(zzdov zzdov0) {
        this.zza = zzdov0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        this.zza.zzh(view0, motionEvent0);
        return false;
    }
}

