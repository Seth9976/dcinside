package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zzau;

@VisibleForTesting
final class zzh extends RelativeLayout {
    @VisibleForTesting
    final zzau zza;
    @VisibleForTesting
    boolean zzb;

    public zzh(Context context0, String s, String s1, String s2) {
        super(context0);
        zzau zzau0 = new zzau(context0, s);
        this.zza = zzau0;
        zzau0.zzo(s1);
        zzau0.zzn(s2);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(!this.zzb) {
            this.zza.zzm(motionEvent0);
        }
        return false;
    }
}

