package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

abstract class zzcam {
    private final WeakReference zza;

    public zzcam(View view0) {
        this.zza = new WeakReference(view0);
    }

    protected abstract void zza(ViewTreeObserver arg1);

    protected abstract void zzb(ViewTreeObserver arg1);

    @Nullable
    protected final ViewTreeObserver zzc() {
        View view0 = (View)this.zza.get();
        if(view0 == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        return viewTreeObserver0 == null || !viewTreeObserver0.isAlive() ? null : viewTreeObserver0;
    }

    public final void zzd() {
        ViewTreeObserver viewTreeObserver0 = this.zzc();
        if(viewTreeObserver0 != null) {
            this.zza(viewTreeObserver0);
        }
    }

    public final void zze() {
        ViewTreeObserver viewTreeObserver0 = this.zzc();
        if(viewTreeObserver0 != null) {
            this.zzb(viewTreeObserver0);
        }
    }
}

