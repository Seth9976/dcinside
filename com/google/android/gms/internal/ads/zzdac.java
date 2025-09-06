package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import o3.h;

public final class zzdac implements AppEventListener, zza, zzr, OnAdMetadataChangedListener, zzcvt, zzcwj, zzcwn, zzcxs, zzcye, zzdds {
    private final zzczz zza;
    @h
    private zzekn zzb;
    @h
    private zzekr zzc;
    @h
    private zzexm zzd;
    @h
    private zzfar zze;

    public zzdac() {
        this.zza = new zzczz(this, null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzdac.zzn(this.zzb, new zzcys());
        zzdac.zzn(this.zzc, new zzcyt());
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdac.zzn(this.zze, new zzcyy());
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        zzdac.zzn(this.zzb, new zzcze(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzdac.zzn(this.zzb, new zzczx());
        zzdac.zzn(this.zze, new zzczy());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzdac.zzn(this.zzb, new zzczq());
        zzdac.zzn(this.zze, new zzczr());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzdac.zzn(this.zzb, new zzcyz());
        zzdac.zzn(this.zze, new zzcza());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzdac.zzn(this.zzd, new zzczl());
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzdac.zzn(this.zzb, new zzczn());
        zzdac.zzn(this.zzc, new zzczs());
        zzdac.zzn(this.zze, new zzczt());
        zzdac.zzn(this.zzd, new zzczu());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzdac.zzn(this.zzd, new zzcyx());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzdac.zzn(this.zzd, new zzczk());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzdac.zzn(this.zzd, new zzczg());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
        zzdac.zzn(this.zzb, new zzczb(zzbvw0, s, s1));
        zzdac.zzn(this.zze, new zzczd(zzbvw0, s, s1));
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzdac.zzn(this.zzd, new zzczm());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        zzdac.zzn(this.zzd, new zzczo(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzdac.zzn(this.zzb, new zzcyr());
        zzdac.zzn(this.zze, new zzczc());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzdac.zzn(this.zzb, new zzcyu());
        zzdac.zzn(this.zze, new zzcyv());
    }

    @Override  // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        zzdac.zzn(this.zzd, new zzczp());
    }

    @Override  // com.google.android.gms.internal.ads.zzcye
    public final void zzh(zzu zzu0) {
        zzdac.zzn(this.zzb, new zzczh(zzu0));
        zzdac.zzn(this.zze, new zzczi(zzu0));
        zzdac.zzn(this.zzd, new zzczj(zzu0));
    }

    public final zzczz zzi() {
        return this.zza;
    }

    private static void zzn(Object object0, zzdaa zzdaa0) {
        if(object0 != null) {
            zzdaa0.zza(object0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        zzdac.zzn(this.zze, new zzczv(zze0));
        zzdac.zzn(this.zzb, new zzczw(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzdac.zzn(this.zzb, new zzcyw());
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzdac.zzn(this.zzb, new zzczf());
    }
}

