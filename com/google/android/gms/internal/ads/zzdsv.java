package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.List;
import o3.j;

public final class zzdsv implements AppEventListener, zza, zzcvt, zzcvw, zzcwn, zzcwo, zzcxh, zzcyq, zzfgo {
    private final List zza;
    private final zzdsj zzb;
    private long zzc;

    public zzdsv(zzdsj zzdsj0, zzcgx zzcgx0) {
        this.zzb = zzdsj0;
        this.zza = Collections.singletonList(zzcgx0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzg(zza.class, "onAdClicked", new Object[0]);
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        this.zzg(AppEventListener.class, "onAppEvent", new Object[]{s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zzg(zzcvt.class, "onAdClosed", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        this.zzg(zzcvt.class, "onAdLeftApplication", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        this.zzg(zzcvt.class, "onAdOpened", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfgh0, String s) {
        this.zzg(zzfgg.class, "onTaskSucceeded", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfgh0, String s) {
        this.zzg(zzfgg.class, "onTaskCreated", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfgh0, String s, Throwable throwable0) {
        Object[] arr_object = {s, throwable0.getClass().getSimpleName()};
        this.zzg(zzfgg.class, "onTaskFailed", arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfgh0, String s) {
        this.zzg(zzfgg.class, "onTaskStarted", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(Context context0) {
        this.zzg(zzcwo.class, "onDestroy", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(Context context0) {
        this.zzg(zzcwo.class, "onPause", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(Context context0) {
        this.zzg(zzcwo.class, "onResume", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        this.zzc = zzv.zzC().elapsedRealtime();
        this.zzg(zzcyq.class, "onAdRequest", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    @j
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
        this.zzg(zzcvt.class, "onRewarded", new Object[]{zzbvw0, s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        this.zzg(zzcvw.class, "onAdFailedToLoad", new Object[]{zze0.zza, zze0.zzb, zze0.zzc});
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        this.zzg(zzcvt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        this.zzg(zzcvt.class, "onRewardedVideoStarted", new Object[0]);
    }

    private final void zzg(Class class0, String s, Object[] arr_object) {
        this.zzb.zza(this.zza, "Event-" + class0.getSimpleName(), s, arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        this.zzg(zzcwn.class, "onAdImpression", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        com.google.android.gms.ads.internal.util.zze.zza(("Ad Request Latency : " + (zzv.zzC().elapsedRealtime() - this.zzc)));
        this.zzg(zzcxh.class, "onAdLoaded", new Object[0]);
    }
}

