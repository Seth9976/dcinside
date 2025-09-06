package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdjt {
    private final zzdow zza;
    private final zzdnl zzb;
    private final zzcnr zzc;
    private final zzdin zzd;

    public zzdjt(zzdow zzdow0, zzdnl zzdnl0, zzcnr zzcnr0, zzdin zzdin0) {
        this.zza = zzdow0;
        this.zzb = zzdnl0;
        this.zzc = zzcnr0;
        this.zzd = zzdin0;
    }

    public final View zza() throws zzcfj {
        zzs zzs0 = zzs.zzc();
        zzcex zzcex0 = this.zza.zza(zzs0, null, null);
        zzcex0.zzF().setVisibility(8);
        zzcex0.zzag("/sendMessageToSdk", (zzcex zzcex0, Map map0) -> this.zzb.zzj("sendMessageToNativeJs", map0));
        zzcex0.zzag("/adMuted", (zzcex zzcex0, Map map0) -> this.zzd.zzh());
        WeakReference weakReference0 = new WeakReference(zzcex0);
        zzdjp zzdjp0 = new zzdjp(this);
        this.zzb.zzm(weakReference0, "/loadHtml", zzdjp0);
        WeakReference weakReference1 = new WeakReference(zzcex0);
        zzdjq zzdjq0 = (zzcex zzcex0, Map map0) -> {
            zzo.zzi("Showing native ads overlay.");
            zzcex0.zzF().setVisibility(0);
            this.zzc.zze(true);
        };
        this.zzb.zzm(weakReference1, "/showOverlay", zzdjq0);
        WeakReference weakReference2 = new WeakReference(zzcex0);
        zzdjr zzdjr0 = (zzcex zzcex0, Map map0) -> {
            zzo.zzi("Hiding native ads overlay.");
            zzcex0.zzF().setVisibility(8);
            this.zzc.zze(false);
        };
        this.zzb.zzm(weakReference2, "/hideOverlay", zzdjr0);
        return zzcex0.zzF();
    }

    // 检测为 Lambda 实现
    final void zzb(zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(zzcex zzcex0, Map map0) [...]

    final void zzd(Map map0, boolean z, int v, String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("messageType", "htmlLoaded");
        hashMap0.put("id", ((String)map0.get("id")));
        this.zzb.zzj("sendMessageToNativeJs", hashMap0);
    }

    // 检测为 Lambda 实现
    final void zze(zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzf(zzcex zzcex0, Map map0) [...]
}

