package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbyu;
import java.util.HashMap;

public final class zzba {
    private final zzk zza;
    private final zzi zzb;
    private final zzfe zzc;
    private final zzbhv zzd;
    private final zzbtb zze;
    private final zzbhw zzf;
    private zzbuj zzg;
    private final zzl zzh;

    public zzba(zzk zzk0, zzi zzi0, zzfe zzfe0, zzbhv zzbhv0, zzbxb zzbxb0, zzbtb zzbtb0, zzbhw zzbhw0, zzl zzl0) {
        this.zza = zzk0;
        this.zzb = zzi0;
        this.zzc = zzfe0;
        this.zzd = zzbhv0;
        this.zze = zzbtb0;
        this.zzf = zzbhw0;
        this.zzh = zzl0;
    }

    public final zzbu zzd(Context context0, String s, zzbpe zzbpe0) {
        return (zzbu)new zzar(this, context0, s, zzbpe0).zzd(context0, false);
    }

    public final zzby zze(Context context0, zzs zzs0, String s, zzbpe zzbpe0) {
        return (zzby)new zzan(this, context0, zzs0, s, zzbpe0).zzd(context0, false);
    }

    public final zzby zzf(Context context0, zzs zzs0, String s, zzbpe zzbpe0) {
        return (zzby)new zzap(this, context0, zzs0, s, zzbpe0).zzd(context0, false);
    }

    public final zzci zzg(Context context0, zzbpe zzbpe0) {
        return (zzci)new zzat(this, context0, zzbpe0).zzd(context0, false);
    }

    @Nullable
    public final zzdu zzh(Context context0, zzbpe zzbpe0) {
        return (zzdu)new zzaf(this, context0, zzbpe0).zzd(context0, false);
    }

    public final zzbga zzj(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        return (zzbga)new zzax(this, frameLayout0, frameLayout1, context0).zzd(context0, false);
    }

    public final zzbgg zzk(View view0, HashMap hashMap0, HashMap hashMap1) {
        return (zzbgg)new zzaz(this, view0, hashMap0, hashMap1).zzd(view0.getContext(), false);
    }

    public final zzbkr zzn(Context context0, zzbpe zzbpe0, OnH5AdsEventListener onH5AdsEventListener0) {
        return (zzbkr)new zzal(this, context0, zzbpe0, onH5AdsEventListener0).zzd(context0, false);
    }

    @Nullable
    public final zzbsx zzo(Context context0, zzbpe zzbpe0) {
        return (zzbsx)new zzaj(this, context0, zzbpe0).zzd(context0, false);
    }

    @Nullable
    public final zzbte zzq(Activity activity0) {
        zzad zzad0 = new zzad(this, activity0);
        Intent intent0 = activity0.getIntent();
        if(!intent0.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzo.zzg("useClientJar flag not found in activity intent extras.");
            return (zzbte)zzad0.zzd(activity0, false);
        }
        return (zzbte)zzad0.zzd(activity0, intent0.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false));
    }

    public final zzbwp zzs(Context context0, String s, zzbpe zzbpe0) {
        return (zzbwp)new zzab(this, context0, s, zzbpe0).zzd(context0, false);
    }

    @Nullable
    public final zzbyu zzt(Context context0, zzbpe zzbpe0) {
        return (zzbyu)new zzah(this, context0, zzbpe0).zzd(context0, false);
    }

    static void zzv(Context context0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("action", "no_ads_fallback");
        bundle0.putString("flow", s);
        zzbc.zzb().zzn(context0, zzbc.zzc().afmaVersion, "gmob-apps", bundle0, true);
    }
}

