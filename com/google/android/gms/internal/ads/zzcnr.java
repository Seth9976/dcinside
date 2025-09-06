package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcnr implements zzayk {
    private zzcex zza;
    private final Executor zzb;
    private final zzcnd zzc;
    private final Clock zzd;
    private boolean zze;
    private boolean zzf;
    private final zzcng zzg;

    public zzcnr(Executor executor0, zzcnd zzcnd0, Clock clock0) {
        this.zze = false;
        this.zzf = false;
        this.zzg = new zzcng();
        this.zzb = executor0;
        this.zzc = zzcnd0;
        this.zzd = clock0;
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        this.zzg();
    }

    // 检测为 Lambda 实现
    final void zzd(JSONObject jSONObject0) [...]

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        this.zzg.zza = this.zzf ? false : zzayj0.zzj;
        this.zzg.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzayj0;
        if(this.zze) {
            this.zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcex zzcex0) {
        this.zza = zzcex0;
    }

    private final void zzg() {
        try {
            JSONObject jSONObject0 = this.zzc.zza(this.zzg);
            if(this.zza != null) {
                zzcnq zzcnq0 = () -> this.zza.zzl("AFMA_updateActiveView", jSONObject0);
                this.zzb.execute(zzcnq0);
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed to call video active view js", jSONException0);
        }
    }
}

