package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeur implements zzetr {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzd zzg;

    zzeur(zzbzd zzbzd0, Context context0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, int v, boolean z, boolean z1) {
        this.zzg = zzbzd0;
        this.zza = context0;
        this.zzb = scheduledExecutorService0;
        this.zzc = executor0;
        this.zzd = v;
        this.zze = z;
        this.zzf = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 40;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzgby zzgby0 = (zzgby)zzgch.zzo(((zzgby)zzgch.zzm(zzgby.zzu(this.zzg.zza(this.zza, this.zzd)), (Info advertisingIdClient$Info0) -> {
            zzfra zzfra0 = new zzfra();
            if(!this.zze && ((Boolean)zzbe.zzc().zza(zzbcl.zzdj)).booleanValue() || this.zze && ((Boolean)zzbe.zzc().zza(zzbcl.zzdk)).booleanValue()) {
                try {
                    zzfre zzfre0 = zzfre.zzj(this.zza);
                    Objects.requireNonNull(advertisingIdClient$Info0);
                    String s = advertisingIdClient$Info0.getId();
                    Objects.requireNonNull(s);
                    return new zzeus(advertisingIdClient$Info0, null, zzfre0.zzi(s, "com.dcinside.app.android", ((long)(((Long)zzbe.zzc().zza(zzbcl.zzdp)))), this.zzf));
                }
                catch(IOException | IllegalArgumentException iOException0) {
                    zzv.zzp().zzw(iOException0, "AdIdInfoSignalSource.getPaidV1");
                    return new zzeus(advertisingIdClient$Info0, null, new zzfra());
                }
            }
            return new zzeus(advertisingIdClient$Info0, null, zzfra0);
        }, this.zzc)), ((long)(((Long)zzbe.zzc().zza(zzbcl.zzbe)))), TimeUnit.MILLISECONDS, this.zzb);
        zzeuq zzeuq0 = (Throwable throwable0) -> {
            ContentResolver contentResolver0 = this.zza.getContentResolver();
            return contentResolver0 == null ? new zzeus(null, null, new zzfra()) : new zzeus(null, Settings.Secure.getString(contentResolver0, "android_id"), new zzfra());
        };
        return (zzgby)zzgch.zze(zzgby0, Throwable.class, zzeuq0, this.zzc);
    }

    // 检测为 Lambda 实现
    final zzeus zzc(Info advertisingIdClient$Info0) [...]

    // 检测为 Lambda 实现
    final zzeus zzd(Throwable throwable0) [...]
}

