package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.ump.c.b;
import com.google.android.ump.c;
import com.google.android.ump.d.a;
import com.google.android.ump.d;

public final class zzj implements c {
    private final zzap zza;
    private final zzu zzb;
    private final zzbn zzc;
    private final Object zzd;
    private final Object zze;
    private boolean zzf;
    private boolean zzg;
    private d zzh;

    public zzj(zzap zzap0, zzu zzu0, zzbn zzbn0) {
        this.zzd = new Object();
        this.zze = new Object();
        this.zzf = false;
        this.zzg = false;
        this.zzh = new a().a();
        this.zza = zzap0;
        this.zzb = zzu0;
        this.zzc = zzbn0;
    }

    @Override  // com.google.android.ump.c
    public final boolean canRequestAds() {
        if(!this.zza.zzk()) {
            int v = this.zzc() ? this.zza.zza() : 0;
            return v == 1 || v == 3;
        }
        return true;
    }

    @Override  // com.google.android.ump.c
    public final int getConsentStatus() {
        return this.zzc() ? this.zza.zza() : 0;
    }

    @Override  // com.google.android.ump.c
    public final com.google.android.ump.c.d getPrivacyOptionsRequirementStatus() {
        return this.zzc() ? this.zza.zzb() : com.google.android.ump.c.d.a;
    }

    @Override  // com.google.android.ump.c
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override  // com.google.android.ump.c
    public final void requestConsentInfoUpdate(@Nullable Activity activity0, d d0, com.google.android.ump.c.c c$c0, b c$b0) {
        synchronized(this.zzd) {
            this.zzf = true;
        }
        this.zzh = d0;
        this.zzb.zzc(activity0, d0, c$c0, c$b0);
    }

    @Override  // com.google.android.ump.c
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized(this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(@Nullable Activity activity0) {
        if(this.zzc() && !this.zzd()) {
            this.zzb(true);
            d d0 = this.zzh;
            zzh zzh0 = () -> synchronized(this.zze) {
                this.zzg = false;
            };
            zzi zzi0 = (/* 缺少LAMBDA参数 */) -> synchronized(this.zze) {
                this.zzg = false;
            };
            this.zzb.zzc(activity0, d0, zzh0, zzi0);
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + this.zzc() + ", retryRequestIsInProgress=" + this.zzd());
    }

    // 检测为 Lambda 实现
    public final void zzb(boolean z) [...]

    public final boolean zzc() {
        synchronized(this.zzd) {
        }
        return this.zzf;
    }

    public final boolean zzd() {
        synchronized(this.zze) {
        }
        return this.zzg;
    }
}

