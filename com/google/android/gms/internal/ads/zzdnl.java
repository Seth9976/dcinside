package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.t0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdnl {
    private final zzdmy zza;
    private final zza zzb;
    private final Context zzc;
    private final zzdrw zzd;
    private final Executor zze;
    private final zzava zzf;
    private final VersionInfoParcel zzg;
    private final zzbkf zzh;
    private final zzebk zzi;
    private final zzfja zzj;
    private final zzebv zzk;
    private final zzfcn zzl;
    private t0 zzm;

    zzdnl(zzdni zzdni0) {
        this.zzc = zzdni0.zzb;
        this.zze = zzdni0.zze;
        this.zzf = zzdni0.zzf;
        this.zzg = zzdni0.zzg;
        this.zzb = zzdni0.zza;
        this.zza = new zzdmy();
        this.zzh = new zzbkf();
        this.zzi = zzdni0.zzd;
        this.zzj = zzdni0.zzh;
        this.zzd = zzdni0.zzc;
        this.zzk = zzdni0.zzi;
        this.zzl = zzdni0.zzj;
    }

    final zzcex zza(zzcex zzcex0) {
        zzcex0.zzag("/result", this.zzh);
        zzcgp zzcgp0 = zzcex0.zzN();
        zzb zzb0 = new zzb(this.zzc, null, null);
        zzcgp0.zzV(null, this.zza, this.zza, this.zza, this.zza, false, null, zzb0, null, null, this.zzi, this.zzj, this.zzd, null, null, null, null, null, null);
        return zzcex0;
    }

    // 检测为 Lambda 实现
    final t0 zzf(String s, JSONObject jSONObject0, zzcex zzcex0) throws Exception [...]

    public final t0 zzg(String s, JSONObject jSONObject0) {
        synchronized(this) {
            t0 t00 = this.zzm;
            return t00 == null ? zzgch.zzh(null) : zzgch.zzn(t00, (zzcex zzcex0) -> this.zzh.zzb(zzcex0, s, jSONObject0), this.zze);
        }
    }

    public final void zzh(zzfbo zzfbo0, zzfbr zzfbr0, zzcmk zzcmk0) {
        synchronized(this) {
            t0 t00 = this.zzm;
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdnf(this, zzfbo0, zzfbr0, zzcmk0), this.zze);
        }
    }

    public final void zzi() {
        synchronized(this) {
            t0 t00 = this.zzm;
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdnb(this), this.zze);
            this.zzm = null;
        }
    }

    public final void zzj(String s, Map map0) {
        synchronized(this) {
            t0 t00 = this.zzm;
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdne(this, "sendMessageToNativeJs", map0), this.zze);
        }
    }

    public final void zzk() {
        synchronized(this) {
            Object object0 = zzbe.zzc().zza(zzbcl.zzdQ);
            t0 t00 = zzgch.zzm(zzgch.zzk(new zzcfi(this.zzc, this.zzf, this.zzg, this.zzb, this.zzk, this.zzl, ((String)object0)), zzbzw.zzf), new zzdna(this), this.zze);
            this.zzm = t00;
            zzbzz.zza(t00, "NativeJavascriptExecutor.initializeEngine");
        }
    }

    public final void zzl(String s, zzbjp zzbjp0) {
        synchronized(this) {
            t0 t00 = this.zzm;
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdnc(this, s, zzbjp0), this.zze);
        }
    }

    public final void zzm(WeakReference weakReference0, String s, zzbjp zzbjp0) {
        this.zzl(s, new zzdnj(this, weakReference0, s, zzbjp0, null));
    }

    public final void zzn(String s, zzbjp zzbjp0) {
        synchronized(this) {
            t0 t00 = this.zzm;
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdnd(this, s, zzbjp0), this.zze);
        }
    }
}

