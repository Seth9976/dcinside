package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcaj;

public final class zzck {
    private final View zza;
    private Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzck(Activity activity0, View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        this.zzb = activity0;
        this.zza = view0;
        this.zzf = viewTreeObserver$OnGlobalLayoutListener0;
    }

    public final void zza() {
        this.zze = false;
        this.zzh();
    }

    public final void zzb() {
        this.zze = true;
        if(this.zzd) {
            this.zzg();
        }
    }

    public final void zzc() {
        this.zzd = true;
        if(this.zze) {
            this.zzg();
        }
    }

    public final void zzd() {
        this.zzd = false;
        this.zzh();
    }

    public final void zze(Activity activity0) {
        this.zzb = activity0;
    }

    private static ViewTreeObserver zzf(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.getDecorView();
            return view0 == null ? null : view0.getViewTreeObserver();
        }
        return null;
    }

    private final void zzg() {
        if(!this.zzc) {
            Activity activity0 = this.zzb;
            if(activity0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.zzf;
                ViewTreeObserver viewTreeObserver0 = zzck.zzf(activity0);
                if(viewTreeObserver0 != null) {
                    viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
                }
            }
            zzcaj.zza(this.zza, this.zzf);
            this.zzc = true;
        }
    }

    private final void zzh() {
        Activity activity0 = this.zzb;
        if(activity0 != null && this.zzc) {
            ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.zzf;
            ViewTreeObserver viewTreeObserver0 = zzck.zzf(activity0);
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
            this.zzc = false;
        }
    }
}

