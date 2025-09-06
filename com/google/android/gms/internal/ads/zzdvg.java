package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdvg implements zzr, zzcgn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzduv zzc;
    private zzcex zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    @Nullable
    private zzdl zzh;
    private boolean zzi;

    zzdvg(Context context0, VersionInfoParcel versionInfoParcel0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zza(boolean z, int v, String s, String s1) {
        synchronized(this) {
            if(z) {
                zze.zza("Ad inspector loaded.");
                this.zze = true;
                this.zzk("");
                return;
            }
            zzo.zzj("Ad inspector failed to load.");
            try {
                zzv.zzp().zzw(new Exception("Failed to load UI. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1), "InspectorUi.onAdWebViewFinishedLoading 0");
                zzdl zzdl0 = this.zzh;
                if(zzdl0 != null) {
                    zzdl0.zze(zzfdk.zzd(17, null, null));
                }
            }
            catch(RemoteException remoteException0) {
                zzv.zzp().zzw(remoteException0, "InspectorUi.onAdWebViewFinishedLoading 1");
            }
            this.zzi = true;
            this.zzd.destroy();
        }
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
        synchronized(this) {
            this.zzf = true;
            this.zzk("");
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        synchronized(this) {
            this.zzd.destroy();
            if(!this.zzi) {
                zze.zza("Inspector closed.");
                zzdl zzdl0 = this.zzh;
                if(zzdl0 != null) {
                    try {
                        zzdl0.zze(null);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
            this.zzf = false;
            this.zze = false;
            this.zzg = 0L;
            this.zzi = false;
            this.zzh = null;
        }
    }

    @Nullable
    public final Activity zzg() {
        return this.zzd == null || this.zzd.zzaE() ? null : this.zzd.zzi();
    }

    public final void zzh(zzduv zzduv0) {
        this.zzc = zzduv0;
    }

    // 检测为 Lambda 实现
    final void zzi(String s) [...]

    public final void zzj(zzdl zzdl0, zzbkj zzbkj0, zzbkc zzbkc0, zzbjq zzbjq0) {
        zzcex zzcex0;
        synchronized(this) {
            if(!this.zzl(zzdl0)) {
                return;
            }
            try {
                zzcgr zzcgr0 = zzcgr.zza();
                zzbbj zzbbj0 = zzbbj.zza();
                zzcex0 = zzcfk.zza(this.zza, zzcgr0, "", false, false, null, null, this.zzb, null, null, null, zzbbj0, null, null, null, null);
                this.zzd = zzcex0;
            }
            catch(zzcfj zzcfj0) {
                zzo.zzk("Failed to obtain a web view for the ad inspector", zzcfj0);
                try {
                    zzv.zzp().zzw(zzcfj0, "InspectorUi.openInspector 0");
                    zzdl0.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException remoteException0) {
                    zzv.zzp().zzw(remoteException0, "InspectorUi.openInspector 1");
                }
                return;
            }
            zzcgp zzcgp0 = zzcex0.zzN();
            if(zzcgp0 == null) {
                zzo.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdl0.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException remoteException1) {
                    zzv.zzp().zzw(remoteException1, "InspectorUi.openInspector 3");
                }
                return;
            }
            this.zzh = zzdl0;
            zzcgp0.zzV(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkj0, null, new zzbki(this.zza), zzbkc0, zzbjq0, null);
            zzcgp0.zzC(this);
            this.zzd.loadUrl(((String)zzbe.zzc().zza(zzbcl.zziO)));
            AdOverlayInfoParcel adOverlayInfoParcel0 = new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb);
            zzn.zza(this.zza, adOverlayInfoParcel0, true, null);
            this.zzg = zzv.zzC().currentTimeMillis();
        }
    }

    public final void zzk(String s) {
        synchronized(this) {
            if(this.zze && this.zzf) {
                zzdvf zzdvf0 = () -> {
                    JSONObject jSONObject0 = this.zzc.zze();
                    if(!TextUtils.isEmpty(s)) {
                        try {
                            jSONObject0.put("redirectUrl", s);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    this.zzd.zzb("window.inspectorInfo", jSONObject0.toString());
                };
                zzbzw.zzf.execute(zzdvf0);
            }
        }
    }

    private final boolean zzl(zzdl zzdl0) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
                zzo.zzj("Ad inspector had an internal error.");
                try {
                    zzdl0.zze(zzfdk.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(this.zzc == null) {
                zzo.zzj("Ad inspector had an internal error.");
                try {
                    zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                    zzdl0.zze(zzfdk.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(!this.zze && !this.zzf && zzv.zzC().currentTimeMillis() >= this.zzg + ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziQ))))))) {
                return true;
            }
            zzo.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdl0.zze(zzfdk.zzd(19, null, null));
            }
            catch(RemoteException unused_ex) {
            }
            return false;
        }
    }
}

