package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

public final class zzcqm implements zzcwn, zzcxh {
    private final Context zza;
    @Nullable
    private final zzcex zzb;
    private final zzfbo zzc;
    private final VersionInfoParcel zzd;
    @Nullable
    private zzecr zze;
    private boolean zzf;
    private final zzecp zzg;

    public zzcqm(Context context0, @Nullable zzcex zzcex0, zzfbo zzfbo0, VersionInfoParcel versionInfoParcel0, zzecp zzecp0) {
        this.zza = context0;
        this.zzb = zzcex0;
        this.zzc = zzfbo0;
        this.zzd = versionInfoParcel0;
        this.zzg = zzecp0;
    }

    private final void zza() {
        zzeco zzeco0;
        zzecn zzecn0;
        synchronized(this) {
            if(this.zzc.zzT && this.zzb != null && zzv.zzB().zzl(this.zza)) {
                String s = this.zzd.buddyApkVersion + "." + this.zzd.clientJarVersion;
                String s1 = this.zzc.zzV.zza();
                if(this.zzc.zzV.zzc() == 1) {
                    zzecn0 = zzecn.zzc;
                    zzeco0 = zzeco.zzb;
                }
                else {
                    zzeco0 = this.zzc.zze == 1 ? zzeco.zzc : zzeco.zza;
                    zzecn0 = zzecn.zza;
                }
                this.zze = zzv.zzB().zza(s, this.zzb.zzG(), "", "javascript", s1, zzeco0, zzecn0, this.zzc.zzal);
                View view0 = this.zzb.zzF();
                zzecr zzecr0 = this.zze;
                if(zzecr0 != null) {
                    zzfkp zzfkp0 = zzecr0.zza();
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
                        zzv.zzB().zzj(zzfkp0, this.zzb.zzG());
                        for(Object object0: this.zzb.zzV()) {
                            zzv.zzB().zzg(zzfkp0, ((View)object0));
                        }
                    }
                    else {
                        zzv.zzB().zzj(zzfkp0, view0);
                    }
                    this.zzb.zzat(this.zze);
                    zzv.zzB().zzk(zzfkp0);
                    this.zzf = true;
                    ArrayMap arrayMap0 = new ArrayMap();
                    this.zzb.zzd("onSdkLoaded", arrayMap0);
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    private final boolean zzb() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        synchronized(this) {
            if(this.zzb()) {
                this.zzg.zzb();
                return;
            }
            if(!this.zzf) {
                this.zza();
            }
            if(this.zzc.zzT && this.zze != null) {
                zzcex zzcex0 = this.zzb;
                if(zzcex0 != null) {
                    zzcex0.zzd("onSdkImpression", new ArrayMap());
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        synchronized(this) {
            if(this.zzb()) {
                this.zzg.zzc();
                return;
            }
            if(this.zzf) {
                return;
            }
            this.zza();
        }
    }
}

