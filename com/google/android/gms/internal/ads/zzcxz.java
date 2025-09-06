package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.Set;

public final class zzcxz extends zzdbj implements zzr {
    public zzcxz(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        synchronized(this) {
            this.zzq(new zzcxx());
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        synchronized(this) {
            this.zzq(new zzcxu());
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        synchronized(this) {
            this.zzq(new zzcxw());
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        synchronized(this) {
            this.zzq(new zzcxt());
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        synchronized(this) {
            this.zzq(new zzcxy());
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        synchronized(this) {
            this.zzq(new zzcxv(v));
        }
    }
}

