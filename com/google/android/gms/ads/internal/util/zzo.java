package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzhfk;

final class zzo implements zzbdl {
    final zzbdm zza;
    final Context zzb;
    final Uri zzc;

    zzo(zzs zzs0, zzbdm zzbdm0, Context context0, Uri uri0) {
        this.zza = zzbdm0;
        this.zzb = context0;
        this.zzc = uri0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbdl
    public final void zza() {
        CustomTabsIntent customTabsIntent0 = new Builder(this.zza.zza()).d();
        String s = zzhfk.zza(this.zzb);
        customTabsIntent0.a.setPackage(s);
        customTabsIntent0.t(this.zzb, this.zzc);
        this.zza.zzf(((Activity)this.zzb));
    }
}

