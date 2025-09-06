package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzent implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzent(zzgcs zzgcs0, Context context0) {
        this.zza = zzgcs0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 13;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzens zzens0 = () -> {
            AudioManager audioManager0 = (AudioManager)this.zzb.getSystemService("audio");
            float f = zzv.zzs().zza();
            boolean z = zzv.zzs().zze();
            if(audioManager0 == null) {
                return new zzenu(-1, false, false, -1, -1, -1, -1, -1, f, z, true);
            }
            int v = audioManager0.getMode();
            boolean z1 = audioManager0.isMusicActive();
            boolean z2 = audioManager0.isSpeakerphoneOn();
            int v1 = audioManager0.getStreamVolume(3);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkQ)).booleanValue()) {
                int v2 = audioManager0.getStreamMaxVolume(3);
                return new zzenu(v, z1, z2, v1, zzv.zzr().zzj(audioManager0), v2, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), f, z, false);
            }
            return new zzenu(v, z1, z2, v1, -1, -1, audioManager0.getRingerMode(), audioManager0.getStreamVolume(2), f, z, false);
        };
        return this.zza.zzb(zzens0);
    }

    // 检测为 Lambda 实现
    final zzenu zzc() throws Exception [...]
}

