package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcnh implements zzr, zzayk, zzcwn, zzcwo {
    private final zzcnc zza;
    private final zzcnd zzb;
    private final Set zzc;
    private final zzbos zzd;
    private final Executor zze;
    private final Clock zzf;
    private final AtomicBoolean zzg;
    private final zzcng zzh;
    private boolean zzi;
    private WeakReference zzj;

    public zzcnh(zzbop zzbop0, zzcnd zzcnd0, Executor executor0, zzcnc zzcnc0, Clock clock0) {
        this.zzc = new HashSet();
        this.zzg = new AtomicBoolean(false);
        this.zzh = new zzcng();
        this.zzi = false;
        this.zzj = new WeakReference(this);
        this.zza = zzcnc0;
        this.zzd = zzbop0.zza("google.afma.activeView.handleUpdate", zzbod.zza, zzbod.zza);
        this.zzb = zzcnd0;
        this.zze = executor0;
        this.zzf = clock0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        synchronized(this) {
            this.zzh.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context0) {
        synchronized(this) {
            this.zzh.zze = "u";
            this.zzg();
            this.zzk();
            this.zzi = true;
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        synchronized(this) {
            this.zzh.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context0) {
        synchronized(this) {
            this.zzh.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context0) {
        synchronized(this) {
            this.zzh.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        synchronized(this) {
            this.zzh.zza = zzayj0.zzj;
            this.zzh.zzf = zzayj0;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
    }

    public final void zzg() {
        synchronized(this) {
            if(this.zzj.get() != null) {
                if(!this.zzi && this.zzg.get()) {
                    try {
                        this.zzh.zzd = this.zzf.elapsedRealtime();
                        JSONObject jSONObject0 = this.zzb.zza(this.zzh);
                        for(Object object0: this.zzc) {
                            zzcnf zzcnf0 = new zzcnf(((zzcex)object0), jSONObject0);
                            this.zze.execute(zzcnf0);
                        }
                        zzbzz.zzb(this.zzd.zzb(jSONObject0), "ActiveViewListener.callActiveViewJs");
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    zze.zzb("Failed to call ActiveViewJS", exception0);
                    return;
                }
                return;
            }
            this.zzj();
        }
    }

    public final void zzh(zzcex zzcex0) {
        synchronized(this) {
            this.zzc.add(zzcex0);
            this.zza.zzd(zzcex0);
        }
    }

    public final void zzi(Object object0) {
        this.zzj = new WeakReference(object0);
    }

    public final void zzj() {
        synchronized(this) {
            this.zzk();
            this.zzi = true;
        }
    }

    private final void zzk() {
        for(Object object0: this.zzc) {
            this.zza.zzf(((zzcex)object0));
        }
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        synchronized(this) {
            if(this.zzg.compareAndSet(false, true)) {
                this.zza.zzc(this);
                this.zzg();
            }
        }
    }
}

