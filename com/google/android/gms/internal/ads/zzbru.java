package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzbru implements zzr {
    final zzbrw zza;

    zzbru(zzbrw zzbrw0) {
        this.zza = zzbrw0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        this.zza.zzb.onAdOpened(this.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        this.zza.zzb.onAdClosed(this.zza);
    }
}

