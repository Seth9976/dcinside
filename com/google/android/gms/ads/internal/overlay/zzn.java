package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdrw;

public final class zzn {
    public static final void zza(Context context0, AdOverlayInfoParcel adOverlayInfoParcel0, boolean z, @Nullable zzdrw zzdrw0) {
        if(adOverlayInfoParcel0.zzk == 4 && adOverlayInfoParcel0.zzc == null) {
            zza zza0 = adOverlayInfoParcel0.zzb;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
            zzdds zzdds0 = adOverlayInfoParcel0.zzu;
            if(zzdds0 != null) {
                zzdds0.zzdd();
            }
            Activity activity0 = adOverlayInfoParcel0.zzd.zzi();
            Context context1 = adOverlayInfoParcel0.zza == null || !adOverlayInfoParcel0.zza.zzj || activity0 == null ? context0 : activity0;
            com.google.android.gms.ads.internal.overlay.zza.zzb(context1, adOverlayInfoParcel0.zza, adOverlayInfoParcel0.zzi, (adOverlayInfoParcel0.zza == null ? null : adOverlayInfoParcel0.zza.zzi), zzdrw0, adOverlayInfoParcel0.zzq);
            return;
        }
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.AdActivity");
        intent0.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel0.zzm.isClientJar);
        intent0.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle0 = new Bundle(1);
        bundle0.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel0);
        intent0.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle0);
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmU)).booleanValue()) {
            zzs.zzX(context0, intent0, zzdrw0, adOverlayInfoParcel0.zzq);
            return;
        }
        zzs.zzT(context0, intent0);
    }
}

