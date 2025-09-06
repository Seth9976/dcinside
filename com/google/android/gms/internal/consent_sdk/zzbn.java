package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.ump.c.d;
import com.google.android.ump.f.a;
import com.google.android.ump.f.b;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbn {
    private final zzds zza;
    private final Executor zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;

    zzbn(zzds zzds0, Executor executor0) {
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zza = zzds0;
        this.zzb = executor0;
    }

    // 检测为 Lambda 实现
    final void zza(zzbb zzbb0) [...]

    public final void zzb(b f$b0, a f$a0) {
        zzcr.zza();
        zzbp zzbp0 = (zzbp)this.zzc.get();
        if(zzbp0 == null) {
            f$a0.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        ((zzav)this.zza.zza()).zza(zzbp0).zzb().zza().zzf(f$b0, f$a0);
    }

    // 检测为 Lambda 实现
    @WorkerThread
    public final void zzc() [...]

    public final void zzd(zzbp zzbp0) {
        this.zzc.set(zzbp0);
    }

    public final void zze(Activity activity0, com.google.android.ump.b.a b$a0) {
        zzcr.zza();
        zzj zzj0 = zza.zza(activity0).zzb();
        if(zzj0 == null) {
            zzbg zzbg0 = new zzbg(b$a0);
            zzcr.zza.post(zzbg0);
            return;
        }
        if(!zzj0.isConsentFormAvailable() && zzj0.getPrivacyOptionsRequirementStatus() != d.b) {
            zzbh zzbh0 = new zzbh(b$a0);
            zzcr.zza.post(zzbh0);
            zzj0.zza(activity0);
            return;
        }
        if(zzj0.getPrivacyOptionsRequirementStatus() == d.b) {
            zzbi zzbi0 = new zzbi(b$a0);
            zzcr.zza.post(zzbi0);
            return;
        }
        com.google.android.ump.b b0 = (com.google.android.ump.b)this.zzd.get();
        if(b0 == null) {
            zzbj zzbj0 = new zzbj(b$a0);
            zzcr.zza.post(zzbj0);
            return;
        }
        b0.show(activity0, b$a0);
        zzbk zzbk0 = () -> {
            zzbp zzbp0 = (zzbp)this.zzc.get();
            if(zzbp0 == null) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                return;
            }
            zzbb zzbb0 = ((zzav)this.zza.zza()).zza(zzbp0).zzb().zza();
            zzbb0.zza = true;
            zzbd zzbd0 = () -> {
                Objects.requireNonNull(this.zzd);
                zzbb0.zzf(new zzbe(this.zzd), new zzbf());
            };
            zzcr.zza.post(zzbd0);
        };
        this.zzb.execute(zzbk0);
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}

