package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdov {
    private final zzcvr zza;
    private final zzddq zzb;
    private final zzcxa zzc;
    private final zzcxn zzd;
    private final zzcxz zze;
    private final zzdap zzf;
    private final Executor zzg;
    private final zzddm zzh;
    private final zzcnh zzi;
    private final zzb zzj;
    private final zzbxu zzk;
    private final zzava zzl;
    private final zzdag zzm;
    private final zzebk zzn;
    private final zzfja zzo;
    private final zzdrw zzp;
    private final zzcmk zzq;
    private final zzdpb zzr;

    public zzdov(zzcvr zzcvr0, zzcxa zzcxa0, zzcxn zzcxn0, zzcxz zzcxz0, zzdap zzdap0, Executor executor0, zzddm zzddm0, zzcnh zzcnh0, zzb zzb0, @Nullable zzbxu zzbxu0, zzava zzava0, zzdag zzdag0, zzebk zzebk0, zzfja zzfja0, zzdrw zzdrw0, zzddq zzddq0, zzcmk zzcmk0, zzdpb zzdpb0) {
        this.zza = zzcvr0;
        this.zzc = zzcxa0;
        this.zzd = zzcxn0;
        this.zze = zzcxz0;
        this.zzf = zzdap0;
        this.zzg = executor0;
        this.zzh = zzddm0;
        this.zzi = zzcnh0;
        this.zzj = zzb0;
        this.zzk = zzbxu0;
        this.zzl = zzava0;
        this.zzm = zzdag0;
        this.zzn = zzebk0;
        this.zzo = zzfja0;
        this.zzp = zzdrw0;
        this.zzb = zzddq0;
        this.zzq = zzcmk0;
        this.zzr = zzdpb0;
    }

    // 检测为 Lambda 实现
    final void zzc() [...]

    // 检测为 Lambda 实现
    final void zzd(String s, String s1) [...]

    // 检测为 Lambda 实现
    final void zze() [...]

    // 检测为 Lambda 实现
    final void zzf(View view0) [...]

    // 检测为 Lambda 实现
    final void zzg(zzcex zzcex0, zzcex zzcex1, Map map0) [...]

    final boolean zzh(View view0, MotionEvent motionEvent0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && motionEvent0 != null && motionEvent0.getAction() == 0) {
            this.zzr.zzb(motionEvent0);
        }
        this.zzj.zza();
        if(view0 != null) {
            view0.performClick();
        }
        return false;
    }

    public final void zzi(zzcex zzcex0, boolean z, zzbjs zzbjs0, Bundle bundle0) {
        zzbcc zzbcc0 = zzbcl.zzcm;
        if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
            bundle0.putLong("rendering-configure-webview-start", zzv.zzC().currentTimeMillis());
        }
        zzcgp zzcgp0 = zzcex0.zzN();
        zzdon zzdon0 = () -> this.zza.onAdClicked();
        zzdoo zzdoo0 = (String s, String s1) -> this.zzf.zzb(s, s1);
        zzdop zzdop0 = () -> this.zzc.zzb();
        zzdou zzdou0 = new zzdou(this);
        zzcgp0.zzV(zzdon0, this.zzd, this.zze, zzdoo0, zzdop0, z, zzbjs0, this.zzj, zzdou0, this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcex0.setOnTouchListener(new zzdoq(this));
        zzcex0.setOnClickListener((View view0) -> this.zzj.zza());
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcK)).booleanValue()) {
            zzauv zzauv0 = this.zzl.zzc();
            if(zzauv0 != null) {
                zzauv0.zzo(zzcex0.zzF());
            }
        }
        this.zzh.zzo(zzcex0, this.zzg);
        zzdos zzdos0 = new zzdos(zzcex0);
        this.zzh.zzo(zzdos0, this.zzg);
        View view0 = zzcex0.zzF();
        this.zzh.zza(view0);
        zzcex0.zzag("/trackActiveViewUnit", (zzcex zzcex1, Map map0) -> this.zzi.zzh(zzcex0));
        this.zzi.zzi(zzcex0);
        if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
            bundle0.putLong("rendering-configure-webview-end", zzv.zzC().currentTimeMillis());
        }
    }

    public static final t0 zzj(zzcex zzcex0, String s, String s1, Bundle bundle0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            bundle0.putLong("rendering-webview-load-html-start", zzv.zzC().currentTimeMillis());
        }
        t0 t00 = new zzcab();
        zzcex0.zzN().zzC(new zzdom(bundle0, ((zzcab)t00)));
        zzcex0.zzae(s, s1, null);
        return t00;
    }
}

