package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

public final class zzdgd implements zzr, zzcwn, zzcxh {
    @Nullable
    @VisibleForTesting
    zzecr zza;
    private final Context zzb;
    @Nullable
    private final zzcex zzc;
    private final zzfbo zzd;
    private final VersionInfoParcel zze;
    private final zzbbq.zza.zza zzf;
    private final zzecp zzg;

    public zzdgd(Context context0, @Nullable zzcex zzcex0, zzfbo zzfbo0, VersionInfoParcel versionInfoParcel0, zzbbq.zza.zza zzbbq$zza$zza0, zzecp zzecp0) {
        this.zzb = context0;
        this.zzc = zzcex0;
        this.zzd = zzfbo0;
        this.zze = versionInfoParcel0;
        this.zzf = zzbbq$zza$zza0;
        this.zzg = zzecp0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfk)).booleanValue() && this.zzc != null && (this.zza != null || this.zzg())) {
            if(this.zza != null) {
                ArrayMap arrayMap0 = new ArrayMap();
                this.zzc.zzd("onSdkImpression", arrayMap0);
                return;
            }
            this.zzg.zzb();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        this.zza = null;
    }

    // 去混淆评级： 低(20)
    private final boolean zzg() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(this.zzg()) {
            this.zzg.zzb();
            return;
        }
        if(this.zza != null && this.zzc != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzfk)).booleanValue()) {
            ArrayMap arrayMap0 = new ArrayMap();
            this.zzc.zzd("onSdkImpression", arrayMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzeco zzeco0;
        zzecn zzecn0;
        if((((Boolean)zzbe.zzc().zza(zzbcl.zzfn)).booleanValue() || (this.zzf == zzbbq.zza.zza.zzh || this.zzf == zzbbq.zza.zza.zzd || this.zzf == zzbbq.zza.zza.zzk)) && (this.zzd.zzT && this.zzc != null && zzv.zzB().zzl(this.zzb))) {
            if(this.zzg()) {
                this.zzg.zzc();
                return;
            }
            String s = this.zze.buddyApkVersion + "." + this.zze.clientJarVersion;
            String s1 = this.zzd.zzV.zza();
            if(this.zzd.zzV.zzc() == 1) {
                zzecn0 = zzecn.zzc;
                zzeco0 = zzeco.zzb;
            }
            else {
                zzeco0 = this.zzd.zzY == 2 ? zzeco.zzd : zzeco.zza;
                zzecn0 = zzecn.zza;
            }
            this.zza = zzv.zzB().zza(s, this.zzc.zzG(), "", "javascript", s1, zzeco0, zzecn0, this.zzd.zzal);
            View view0 = this.zzc.zzF();
            zzecr zzecr0 = this.zza;
            if(zzecr0 != null) {
                zzfkp zzfkp0 = zzecr0.zza();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
                    zzv.zzB().zzj(zzfkp0, this.zzc.zzG());
                    for(Object object0: this.zzc.zzV()) {
                        zzv.zzB().zzg(zzfkp0, ((View)object0));
                    }
                }
                else {
                    zzv.zzB().zzj(zzfkp0, view0);
                }
                this.zzc.zzat(this.zza);
                zzv.zzB().zzk(zzfkp0);
                ArrayMap arrayMap0 = new ArrayMap();
                this.zzc.zzd("onSdkLoaded", arrayMap0);
            }
        }
    }
}

