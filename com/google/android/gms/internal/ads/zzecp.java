package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

public final class zzecp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfbo zzc;
    @Nullable
    private final zzcex zzd;
    private final zzdrw zze;
    @Nullable
    private zzfla zzf;

    zzecp(Context context0, VersionInfoParcel versionInfoParcel0, zzfbo zzfbo0, @Nullable zzcex zzcex0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = zzfbo0;
        this.zzd = zzcex0;
        this.zze = zzdrw0;
    }

    public final void zza(View view0) {
        synchronized(this) {
            zzfla zzfla0 = this.zzf;
            if(zzfla0 != null) {
                zzv.zzB().zzh(zzfla0, view0);
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(this.zzf != null) {
                zzcex zzcex0 = this.zzd;
                if(zzcex0 != null) {
                    zzcex0.zzd("onSdkImpression", zzfxq.zzd());
                }
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            zzfla zzfla0 = this.zzf;
            if(zzfla0 != null) {
                zzcex zzcex0 = this.zzd;
                if(zzcex0 != null) {
                    for(Object object0: zzcex0.zzV()) {
                        zzv.zzB().zzh(zzfla0, ((View)object0));
                    }
                    this.zzd.zzd("onSdkLoaded", zzfxq.zzd());
                }
            }
        }
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.zzf != null;
    }

    public final boolean zze(boolean z) {
        synchronized(this) {
            if(this.zzc.zzT && ((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzd != null) {
                if(this.zzf != null) {
                    zzo.zzj("Omid javascript session service already started for ad.");
                    return false;
                }
                if(!zzv.zzB().zzl(this.zza)) {
                    zzo.zzj("Unable to initialize omid.");
                    return false;
                }
                if(this.zzc.zzV.zzb()) {
                    WebView webView0 = this.zzd.zzG();
                    zzfla zzfla0 = zzv.zzB().zze(this.zzb, webView0, true);
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzfg)).booleanValue()) {
                        zzdrv zzdrv0 = this.zze.zza();
                        zzdrv0.zzb("omid_js_session_success", (zzfla0 == null ? "0" : "1"));
                        zzdrv0.zzg();
                    }
                    if(zzfla0 == null) {
                        zzo.zzj("Unable to create javascript session service.");
                        return false;
                    }
                    zzo.zzi("Created omid javascript session service.");
                    this.zzf = zzfla0;
                    this.zzd.zzas(this);
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzf(zzcfo zzcfo0) {
        synchronized(this) {
            zzfla zzfla0 = this.zzf;
            if(zzfla0 != null && this.zzd != null) {
                zzv.zzB().zzm(zzfla0, zzcfo0);
                this.zzf = null;
                this.zzd.zzas(null);
            }
        }
    }
}

