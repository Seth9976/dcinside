package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzov;

@MainThread
@VisibleForTesting
final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final zzjq zza;

    zzkz(zzjq zzjq0) {
        this.zza = zzjq0;
        super();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        try {
            try {
                this.zza.zzj().zzp().zza("onActivityCreated");
                Intent intent0 = activity0.getIntent();
                if(intent0 != null) {
                    Uri uri0 = intent0.getData();
                    if(uri0 == null || !uri0.isHierarchical()) {
                        Bundle bundle1 = intent0.getExtras();
                        if(bundle1 == null) {
                            uri0 = null;
                        }
                        else {
                            String s = bundle1.getString("com.android.vending.referral_url");
                            uri0 = TextUtils.isEmpty(s) ? null : Uri.parse(s);
                        }
                    }
                    if(uri0 != null && uri0.isHierarchical()) {
                        this.zza.zzq();
                        String s1 = zzos.zza(intent0) ? "gs" : "auto";
                        String s2 = uri0.getQueryParameter("referrer");
                        this.zza.zzl().zzb(new zzlc(this, bundle0 == null, uri0, s1, s2));
                        goto label_28;
                    }
                    goto label_30;
                }
                goto label_32;
            }
            catch(RuntimeException runtimeException0) {
            }
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", runtimeException0);
        }
        catch(Throwable throwable0) {
            this.zza.zzn().zza(activity0, bundle0);
            throw throwable0;
        }
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_28:
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_30:
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_32:
        this.zza.zzn().zza(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zza.zzn().zza(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity0) {
        this.zza.zzn().zzb(activity0);
        zznb zznb0 = this.zza.zzp();
        long v = zznb0.zzb().elapsedRealtime();
        zznb0.zzl().zzb(new zznd(zznb0, v));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity0) {
        zznb zznb0 = this.zza.zzp();
        long v = zznb0.zzb().elapsedRealtime();
        zznb0.zzl().zzb(new zzne(zznb0, v));
        this.zza.zzn().zzc(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zza.zzn().zzb(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    static void zza(zzkz zzkz0, boolean z, Uri uri0, String s, String s1) {
        Bundle bundle0;
        zzkz0.zza.zzt();
        try {
            zzos zzos0 = zzkz0.zza.zzq();
            boolean z1 = zzov.zza() && zzkz0.zza.zze().zza(zzbh.zzct);
            if(TextUtils.isEmpty(s1)) {
                bundle0 = null;
            }
            else if(!s1.contains("gclid") && (!z1 || !s1.contains("gbraid")) && !s1.contains("utm_campaign") && !s1.contains("utm_source") && !s1.contains("utm_medium") && !s1.contains("utm_id") && !s1.contains("dclid") && !s1.contains("srsltid") && !s1.contains("sfmc_id")) {
                zzos0.zzj().zzc().zza("Activity created with data \'referrer\' without required params");
                bundle0 = null;
            }
            else {
                bundle0 = zzos0.zza(Uri.parse(("https://google.com/search?" + s1)), z1);
                if(bundle0 != null) {
                    bundle0.putString("_cis", "referrer");
                }
            }
            if(z) {
                Bundle bundle1 = zzkz0.zza.zzq().zza(uri0, zzov.zza() && zzkz0.zza.zze().zza(zzbh.zzct));
                if(bundle1 != null) {
                    bundle1.putString("_cis", "intent");
                    if(!bundle1.containsKey("gclid") && bundle0 != null && bundle0.containsKey("gclid")) {
                        bundle1.putString("_cer", String.format("gclid=%s", bundle0.getString("gclid")));
                    }
                    zzkz0.zza.zzc(s, "_cmp", bundle1);
                    zzkz0.zza.zza.zza(s, bundle1);
                }
            }
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            zzkz0.zza.zzj().zzc().zza("Activity created with referrer", s1);
            if(!zzkz0.zza.zze().zza(zzbh.zzbq)) {
                if(s1.contains("gclid") && (s1.contains("utm_campaign") || s1.contains("utm_source") || s1.contains("utm_medium") || s1.contains("utm_term") || s1.contains("utm_content"))) {
                    if(!TextUtils.isEmpty(s1)) {
                        zzkz0.zza.zza("auto", "_ldl", s1, true);
                    }
                    return;
                }
                zzkz0.zza.zzj().zzc().zza("Activity created with data \'referrer\' without required params");
                return;
            }
            if(bundle0 == null) {
                zzkz0.zza.zzj().zzc().zza("Referrer does not contain valid parameters", s1);
            }
            else {
                zzkz0.zza.zzc(s, "_cmp", bundle0);
                zzkz0.zza.zza.zza(s, bundle0);
            }
            zzkz0.zza.zza("auto", "_ldl", null, true);
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        zzkz0.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", runtimeException0);
    }
}

