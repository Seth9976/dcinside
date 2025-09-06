package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.t0;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzeul implements zzetr {
    private final zzg zza;
    private final Context zzb;
    private final zzgcs zzc;
    private final ScheduledExecutorService zzd;
    private final zzecu zze;
    private final zzfcj zzf;
    private final VersionInfoParcel zzg;

    zzeul(zzg zzg0, Context context0, zzgcs zzgcs0, ScheduledExecutorService scheduledExecutorService0, zzecu zzecu0, zzfcj zzfcj0, VersionInfoParcel versionInfoParcel0) {
        this.zza = zzg0;
        this.zzb = context0;
        this.zzc = zzgcs0;
        this.zzd = scheduledExecutorService0;
        this.zze = zzecu0;
        this.zzf = zzfcj0;
        this.zzg = versionInfoParcel0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 56;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        t0 t00;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue() && this.zza.zzO() && (!((Boolean)zzbe.zzc().zza(zzbcl.zzkq)).booleanValue() || this.zzf.zzd.zzy != PublisherPrivacyPersonalizationState.DISABLED.getValue()) && this.zzg.clientJarVersion >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkk)))) && Build.VERSION.SDK_INT >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkl))))) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzki)).booleanValue()) {
                goto label_4;
            }
            String s = (String)zzbe.zzc().zza(zzbcl.zzkj);
            if(!TextUtils.isEmpty(s) && Arrays.asList(s.split(",")).contains("com.dcinside.app.android")) {
                try {
                label_4:
                    t00 = zzgch.zzo(this.zze.zza(false), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzko)))))), TimeUnit.MILLISECONDS, this.zzd);
                }
                catch(Exception exception0) {
                    t00 = zzgch.zzg(exception0);
                }
                zzgby zzgby0 = (zzgby)zzgch.zzn(zzgby.zzu(t00), new zzeuj(), this.zzc);
                zzeuk zzeuk0 = (Throwable throwable0) -> {
                    zzeui zzeui0 = new zzeui(throwable0);
                    this.zzc.zza(zzeui0);
                    if(throwable0 instanceof SecurityException) {
                        return zzgch.zzh(new zzeun("", 2, null));
                    }
                    if(throwable0 instanceof IllegalStateException) {
                        return zzgch.zzh(new zzeun("", 3, null));
                    }
                    if(throwable0 instanceof IllegalArgumentException) {
                        return zzgch.zzh(new zzeun("", 4, null));
                    }
                    return throwable0 instanceof TimeoutException ? zzgch.zzh(new zzeun("", 5, null)) : zzgch.zzh(new zzeun("", 0, null));
                };
                return zzgch.zzo(((zzgby)zzgch.zzf(zzgby0, Throwable.class, zzeuk0, this.zzc)), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzko)))))), TimeUnit.MILLISECONDS, this.zzd);
            }
        }
        return zzgch.zzh(new zzeun("", -1, null));
    }

    // 检测为 Lambda 实现
    final t0 zzc(Throwable throwable0) throws Exception [...]
}

