package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzdxe implements zzdyg {
    private static final Pattern zza;
    private final zzdwg zzb;
    private final zzgcs zzc;
    private final zzfcj zzd;
    private final ScheduledExecutorService zze;
    private final zzeag zzf;
    private final zzfhh zzg;
    private final Context zzh;

    static {
        zzdxe.zza = Pattern.compile("Received error HTTP response code: (.*)");
    }

    zzdxe(Context context0, zzfcj zzfcj0, zzdwg zzdwg0, zzgcs zzgcs0, ScheduledExecutorService scheduledExecutorService0, zzeag zzeag0, zzfhh zzfhh0) {
        this.zzh = context0;
        this.zzd = zzfcj0;
        this.zzb = zzdwg0;
        this.zzc = zzgcs0;
        this.zze = scheduledExecutorService0;
        this.zzf = zzeag0;
        this.zzg = zzfhh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdyg
    public final t0 zzb(zzbvk zzbvk0) {
        t0 t00 = this.zzb.zzc(zzbvk0);
        zzfgw zzfgw0 = zzfgv.zza(this.zzh, 11);
        zzfhg.zzd(t00, zzfgw0);
        t0 t01 = zzgch.zzn(t00, (zzdyi zzdyi0) -> zzgch.zzh(new zzfca(new zzfbx(this.zzd), zzfbz.zza(new InputStreamReader(zzdyi0.zzb()), zzdyi0.zza()))), this.zzc);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            t0 t02 = zzgch.zzo(t01, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS, this.zze);
            zzdxc zzdxc0 = new zzdxc();
            t01 = zzgch.zzf(t02, TimeoutException.class, zzdxc0, zzbzw.zzg);
        }
        zzfhg.zza(t01, this.zzg, zzfgw0);
        zzgch.zzr(t01, new zzdxd(this), zzbzw.zzg);
        return t01;
    }

    // 检测为 Lambda 实现
    final t0 zzc(zzdyi zzdyi0) throws Exception [...]
}

