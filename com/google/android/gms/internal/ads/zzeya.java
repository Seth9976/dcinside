package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzeya implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzekn zzd;
    private final zzekr zze;
    private final ViewGroup zzf;
    @Nullable
    private zzbdg zzg;
    private final zzcyl zzh;
    private final zzfhk zzi;
    private final zzdar zzj;
    private final zzfch zzk;
    @Nullable
    private t0 zzl;
    private boolean zzm;
    @Nullable
    private zze zzn;
    @Nullable
    private zzelc zzo;

    public zzeya(Context context0, Executor executor0, zzs zzs0, zzcgx zzcgx0, zzekn zzekn0, zzekr zzekr0, zzfch zzfch0, zzdar zzdar0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzcgx0;
        this.zzd = zzekn0;
        this.zze = zzekr0;
        this.zzk = zzfch0;
        this.zzh = zzcgx0.zzf();
        this.zzi = zzcgx0.zzz();
        this.zzf = new FrameLayout(context0);
        this.zzj = zzdar0;
        zzfch0.zzs(zzs0);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        return this.zzl != null && !this.zzl.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(zzm zzm0, String s, @Nullable zzelb zzelb0, zzelc zzelc0) throws RemoteException {
        zzcpq zzcpq0;
        if(s == null) {
            zzo.zzg("Ad unit ID should not be null for banner ad.");
            zzexy zzexy0 = () -> {
                zze zze0 = zzfdk.zzd(6, null, null);
                this.zzd.zzdz(zze0);
            };
            this.zzb.execute(zzexy0);
            return false;
        }
        if(this.zza()) {
            if(this.zzk.zzS()) {
                return false;
            }
            this.zzm = true;
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm0.zzf) {
            this.zzc.zzl().zzo(true);
        }
        Bundle bundle0 = zzdrg.zza(new Pair[]{new Pair("api-call", zzm0.zzz), new Pair("dynamite-enter", zzv.zzC().currentTimeMillis())});
        this.zzk.zzt(s);
        this.zzk.zzH(zzm0);
        this.zzk.zzA(bundle0);
        zzfcj zzfcj0 = this.zzk.zzJ();
        int v = zzfhg.zzf(zzfcj0);
        zzfgw zzfgw0 = zzfgv.zzb(this.zza, v, 3, zzm0);
        zzfhh zzfhh0 = null;
        if(((Boolean)zzber.zzd.zze()).booleanValue() && this.zzk.zzh().zzk) {
            zzekn zzekn0 = this.zzd;
            if(zzekn0 != null) {
                zzekn0.zzdz(zzfdk.zzd(7, null, null));
            }
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue()) {
            zzcpp zzcpp0 = this.zzc.zze();
            zzcva zzcva0 = new zzcva();
            zzcva0.zzf(this.zza);
            zzcva0.zzk(zzfcj0);
            zzcpp0.zzi(zzcva0.zzl());
            zzdbk zzdbk0 = new zzdbk();
            zzdbk0.zzj(this.zzd, this.zzb);
            zzdbk0.zzk(this.zzd, this.zzb);
            zzcpp0.zzf(zzdbk0.zzn());
            zzcpp0.zze(new zzeiw(this.zzg));
            zzcpp0.zzd(new zzdgl(zzdiq.zza, null));
            zzcpp0.zzg(new zzcqr(this.zzh, this.zzj));
            zzcpp0.zzc(new zzcoj(this.zzf));
            zzcpq0 = zzcpp0.zzk();
        }
        else {
            zzcpp zzcpp1 = this.zzc.zze();
            zzcva zzcva1 = new zzcva();
            zzcva1.zzf(this.zza);
            zzcva1.zzk(zzfcj0);
            zzcpp1.zzi(zzcva1.zzl());
            zzdbk zzdbk1 = new zzdbk();
            zzdbk1.zzj(this.zzd, this.zzb);
            zzdbk1.zza(this.zzd, this.zzb);
            zzdbk1.zza(this.zze, this.zzb);
            zzdbk1.zzl(this.zzd, this.zzb);
            zzdbk1.zzd(this.zzd, this.zzb);
            zzdbk1.zze(this.zzd, this.zzb);
            zzdbk1.zzf(this.zzd, this.zzb);
            zzdbk1.zzb(this.zzd, this.zzb);
            zzdbk1.zzk(this.zzd, this.zzb);
            zzdbk1.zzi(this.zzd, this.zzb);
            zzcpp1.zzf(zzdbk1.zzn());
            zzcpp1.zze(new zzeiw(this.zzg));
            zzcpp1.zzd(new zzdgl(zzdiq.zza, null));
            zzcpp1.zzg(new zzcqr(this.zzh, this.zzj));
            zzcpp1.zzc(new zzcoj(this.zzf));
            zzcpq0 = zzcpp1.zzk();
        }
        if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
            zzfhh0 = zzcpq0.zzj();
            zzfhh0.zzi(3);
            zzfhh0.zzb(zzm0.zzp);
            zzfhh0.zzf(zzm0.zzm);
        }
        this.zzo = zzelc0;
        zzcsd zzcsd0 = zzcpq0.zzd();
        t0 t00 = zzcsd0.zzh(zzcsd0.zzi());
        this.zzl = t00;
        zzgch.zzr(t00, new zzexz(this, zzfhh0, zzfgw0, zzcpq0), this.zzb);
        return true;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfch zzf() {
        return this.zzk;
    }

    // 检测为 Lambda 实现
    final void zzj(zze zze0) [...]

    // 检测为 Lambda 实现
    final void zzk() [...]

    public final void zzl() {
        int v = this.zzj.zzc();
        this.zzh.zzd(v);
    }

    public final void zzm() {
        int v = this.zzj.zzd();
        this.zzh.zze(v);
    }

    public final void zzn(zzbi zzbi0) {
        this.zze.zza(zzbi0);
    }

    public final void zzo(zzcyf zzcyf0) {
        this.zzh.zzo(zzcyf0, this.zzb);
    }

    public final void zzp(zzbdg zzbdg0) {
        this.zzg = zzbdg0;
    }

    public final void zzq() {
        synchronized(this) {
            if(this.zzl != null && this.zzl.isDone()) {
                try {
                    zzcom zzcom0 = (zzcom)this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    if(zzcom0.zzd() != null) {
                        String s = "";
                        ViewParent viewParent0 = zzcom0.zzd().getParent();
                        if(viewParent0 instanceof ViewGroup) {
                            if(zzcom0.zzm() != null) {
                                s = zzcom0.zzm().zzg();
                            }
                            zzo.zzj(("Banner view provided from " + s + " already has a parent view. Removing its old parent."));
                            ((ViewGroup)viewParent0).removeView(zzcom0.zzd());
                        }
                    }
                    zzbcc zzbcc0 = zzbcl.zzhZ;
                    if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                        zzczz zzczz0 = zzcom0.zzo();
                        zzczz0.zza(this.zzd);
                        zzczz0.zzc(this.zze);
                    }
                    View view0 = zzcom0.zzd();
                    this.zzf.addView(view0);
                    zzelc zzelc0 = this.zzo;
                    if(zzelc0 != null) {
                        zzelc0.zzb(zzcom0);
                    }
                    if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                        Objects.requireNonNull(this.zzd);
                        zzexx zzexx0 = new zzexx(this.zzd);
                        this.zzb.execute(zzexx0);
                    }
                    if(zzcom0.zza() >= 0) {
                        this.zzm = false;
                        int v1 = zzcom0.zza();
                        this.zzh.zzd(v1);
                        int v2 = zzcom0.zzc();
                        this.zzh.zze(v2);
                    }
                    else {
                        this.zzm = true;
                        int v3 = zzcom0.zzc();
                        this.zzh.zzd(v3);
                    }
                    return;
                }
                catch(ExecutionException | InterruptedException executionException0) {
                }
                this.zzt();
                com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", executionException0);
                this.zzm = true;
                this.zzh.zza();
            }
            else if(this.zzl == null) {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
            else {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            }
        }
    }

    public final boolean zzs() {
        ViewParent viewParent0 = this.zzf.getParent();
        return viewParent0 instanceof View ? com.google.android.gms.ads.internal.util.zzs.zzW(((View)viewParent0), ((View)viewParent0).getContext()) : false;
    }

    private final void zzt() {
        this.zzl = null;
        zze zze0 = this.zzn;
        this.zzn = null;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue() && zze0 != null) {
            zzexw zzexw0 = () -> this.zzd.zzdz(zze0);
            this.zzb.execute(zzexw0);
        }
        zzelc zzelc0 = this.zzo;
        if(zzelc0 != null) {
            zzelc0.zza();
        }
    }
}

