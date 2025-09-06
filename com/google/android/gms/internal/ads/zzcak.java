package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class zzcak extends zzcam implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference zza;

    public zzcak(View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        super(view0);
        this.zza = new WeakReference(viewTreeObserver$OnGlobalLayoutListener0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = (ViewTreeObserver.OnGlobalLayoutListener)this.zza.get();
        if(viewTreeObserver$OnGlobalLayoutListener0 != null) {
            viewTreeObserver$OnGlobalLayoutListener0.onGlobalLayout();
            return;
        }
        this.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcam
    protected final void zza(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnGlobalLayoutListener(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzcam
    protected final void zzb(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.removeOnGlobalLayoutListener(this);
    }
}

