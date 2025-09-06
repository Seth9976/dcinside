package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import h4.e;

public final class zzcem extends zzcay {
    private final zzcbt zzc;
    @Nullable
    private zzcen zzd;
    private Uri zze;
    private zzcax zzf;
    private boolean zzg;
    private int zzh;

    public zzcem(Context context0, zzcbt zzcbt0) {
        super(context0);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcbt0;
        zzcbt0.zza(this);
    }

    // 去混淆评级： 低(40)
    @Override  // android.view.View
    public final String toString() {
        return "com.google.android.gms.internal.ads.zzcem@" + Integer.toHexString(this.hashCode());
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        return this.zzm() ? 0 : -1;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        return this.zzm() ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        return 0L;
    }

    // 检测为 Lambda 实现
    final void zzi() [...]

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return "ImmersivePlayer";
    }

    // 检测为 Lambda 实现
    final void zzk() [...]

    // 检测为 Lambda 实现
    final void zzl() [...]

    @e(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzm() {
        return this.zzh != 1 && this.zzh != 2 && this.zzd != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzn() {
        if(this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        zze.zza("AdImmersivePlayerView pause");
        if(this.zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            this.zzv(5);
            zzcel zzcel0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    zzcax0.zzd();
                }
            };
            zzs.zza.post(zzcel0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        zze.zza("AdImmersivePlayerView play");
        if(this.zzm()) {
            this.zzd.zzb();
            this.zzv(4);
            this.zza.zzb();
            zzcek zzcek0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    if(!this.zzg) {
                        zzcax0.zzg();
                        this.zzg = true;
                    }
                    this.zzf.zze();
                }
            };
            zzs.zza.post(zzcek0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int v) {
        zze.zza(("AdImmersivePlayerView seek " + v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcax0) {
        this.zzf = zzcax0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String s) {
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            this.zze = uri0;
            this.zzd = new zzcen(uri0.toString());
            this.zzv(3);
            zzcej zzcej0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    zzcax0.zzf();
                }
            };
            zzs.zza.post(zzcej0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        zze.zza("AdImmersivePlayerView stop");
        zzcen zzcen0 = this.zzd;
        if(zzcen0 != null) {
            zzcen0.zzc();
            this.zzd = null;
            this.zzv(1);
        }
        this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f1) {
    }

    private final void zzv(int v) {
        if(v == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        }
        else if(this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = v;
    }
}

