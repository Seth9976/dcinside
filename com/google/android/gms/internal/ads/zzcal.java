package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class zzcal extends zzcam implements ViewTreeObserver.OnScrollChangedListener {
    private final WeakReference zza;

    public zzcal(View view0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        super(view0);
        this.zza = new WeakReference(viewTreeObserver$OnScrollChangedListener0);
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0 = (ViewTreeObserver.OnScrollChangedListener)this.zza.get();
        if(viewTreeObserver$OnScrollChangedListener0 != null) {
            viewTreeObserver$OnScrollChangedListener0.onScrollChanged();
            return;
        }
        this.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcam
    protected final void zza(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnScrollChangedListener(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzcam
    protected final void zzb(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.removeOnScrollChangedListener(this);
    }
}

