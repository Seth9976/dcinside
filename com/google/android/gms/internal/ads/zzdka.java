package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

public final class zzdka implements ViewTreeObserver.OnScrollChangedListener {
    public final View zza;
    public final zzcex zzb;
    public final String zzc;
    public final WindowManager.LayoutParams zzd;
    public final int zze;
    public final WindowManager zzf;

    public zzdka(View view0, zzcex zzcex0, String s, WindowManager.LayoutParams windowManager$LayoutParams0, int v, WindowManager windowManager0) {
        this.zza = view0;
        this.zzb = zzcex0;
        this.zzc = s;
        this.zzd = windowManager$LayoutParams0;
        this.zze = v;
        this.zzf = windowManager0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        Rect rect0 = new Rect();
        if(this.zza.getGlobalVisibleRect(rect0)) {
            zzcex zzcex0 = this.zzb;
            if(zzcex0.zzF().getWindowToken() != null) {
                int v = this.zze;
                WindowManager.LayoutParams windowManager$LayoutParams0 = this.zzd;
                windowManager$LayoutParams0.y = "1".equals(this.zzc) || "2".equals(this.zzc) ? rect0.bottom - v : rect0.top - v;
                View view0 = zzcex0.zzF();
                this.zzf.updateViewLayout(view0, windowManager$LayoutParams0);
            }
        }
    }
}

