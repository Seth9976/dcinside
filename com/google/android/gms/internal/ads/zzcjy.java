package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONObject;

public final class zzcjy extends zzcy {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdpm zzc;
    private final zzecy zzd;
    private final zzejj zze;
    private final zzdua zzf;
    private final zzbyi zzg;
    private final zzdpr zzh;
    private final zzduv zzi;
    private final zzbfe zzj;
    private final zzfhk zzk;
    private final zzfdf zzl;
    private final zzctj zzm;
    private final zzdrw zzn;
    private boolean zzo;
    private final Long zzp;

    @VisibleForTesting
    zzcjy(Context context0, VersionInfoParcel versionInfoParcel0, zzdpm zzdpm0, zzecy zzecy0, zzejj zzejj0, zzdua zzdua0, zzbyi zzbyi0, zzdpr zzdpr0, zzduv zzduv0, zzbfe zzbfe0, zzfhk zzfhk0, zzfdf zzfdf0, zzctj zzctj0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = zzdpm0;
        this.zzd = zzecy0;
        this.zze = zzejj0;
        this.zzf = zzdua0;
        this.zzg = zzbyi0;
        this.zzh = zzdpr0;
        this.zzi = zzduv0;
        this.zzj = zzbfe0;
        this.zzk = zzfhk0;
        this.zzl = zzfdf0;
        this.zzm = zzctj0;
        this.zzn = zzdrw0;
        this.zzo = false;
        this.zzp = zzv.zzC().elapsedRealtime();
    }

    // 检测为 Lambda 实现
    @VisibleForTesting
    final void zzb() [...]

    @VisibleForTesting
    final void zzc(Runnable runnable0) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map map0 = zzv.zzp().zzi().zzg().zze();
        if(!map0.isEmpty()) {
            if(runnable0 != null) {
                try {
                    runnable0.run();
                }
                catch(Throwable throwable0) {
                    zzo.zzk("Could not initialize rewarded ads.", throwable0);
                    return;
                }
            }
            if(this.zzc.zzd()) {
                HashMap hashMap0 = new HashMap();
                for(Object object0: map0.values()) {
                    for(Object object1: ((zzboy)object0).zza) {
                        String s = ((zzbox)object1).zzb;
                        for(Object object2: ((zzbox)object1).zza) {
                            String s1 = (String)object2;
                            if(!hashMap0.containsKey(s1)) {
                                hashMap0.put(s1, new ArrayList());
                            }
                            if(s != null) {
                                ((List)hashMap0.get(s1)).add(s);
                            }
                        }
                    }
                    if(false) {
                        break;
                    }
                }
                JSONObject jSONObject0 = new JSONObject();
                for(Object object3: hashMap0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    String s2 = (String)map$Entry0.getKey();
                    try {
                        zzecz zzecz0 = this.zzd.zza(s2, jSONObject0);
                        if(zzecz0 == null) {
                            continue;
                        }
                        zzfdh zzfdh0 = (zzfdh)zzecz0.zzb;
                        if(zzfdh0.zzC() || !zzfdh0.zzB()) {
                            continue;
                        }
                        List list0 = (List)map$Entry0.getValue();
                        zzfdh0.zzj(this.zza, ((zzeet)zzecz0.zzc), list0);
                        zzo.zze(("Initialized rewarded video mediation adapter " + s2));
                    }
                    catch(zzfcq zzfcq0) {
                        zzo.zzk(("Failed to initialize rewarded video mediation adapter \"" + s2 + "\""), zzfcq0);
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() {
        synchronized(this) {
            return zzv.zzs().zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String s) {
        this.zze.zzg(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfrb.zza(this.zza).zzc(z);
            if(z) {
                return;
            }
            else {
                try {
                    if(!this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                        throw new IOException("Failed to remove query_info_shared_prefs");
                    }
                    return;
                }
                catch(IOException iOException1) {
                }
            }
            zzv.zzp().zzw(iOException1, "clearStorageOnGpidPubDisable_scar");
        }
        catch(IOException iOException0) {
            throw new RemoteException(iOException0.getMessage());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() {
        synchronized(this) {
            if(this.zzo) {
                zzo.zzj("Mobile ads is initialized already.");
                return;
            }
            zzbcl.zza(this.zza);
            zzv.zzp().zzu(this.zza, this.zzb);
            this.zzm.zzd();
            zzv.zzc().zzi(this.zza);
            this.zzo = true;
            this.zzf.zzr();
            this.zze.zze();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzed)).booleanValue()) {
                this.zzh.zzd();
            }
            this.zzi.zzg();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                zzcjt zzcjt0 = () -> if(zzv.zzp().zzi().zzM()) {
                    String s = zzv.zzp().zzi().zzi();
                    if(!zzv.zzt().zzj(this.zza, s, this.zzb.afmaVersion)) {
                        zzv.zzp().zzi().zzx(false);
                        zzv.zzp().zzi().zzw("");
                    }
                };
                zzbzw.zza.execute(zzcjt0);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkO)).booleanValue()) {
                zzcjw zzcjw0 = () -> {
                    zzbum zzbum0 = new zzbum();
                    this.zzj.zza(zzbum0);
                };
                zzbzw.zza.execute(zzcjw0);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
                zzcju zzcju0 = () -> zzfdn.zzb(this.zza, true);
                zzbzw.zza.execute(zzcju0);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzeG)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzeH)).booleanValue()) {
                zzcjv zzcjv0 = () -> zzv.zzf().zzb(this.zza, this.zzn);
                zzbzw.zza.execute(zzcjv0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String s, IObjectWrapper iObjectWrapper0) {
        zzcjx zzcjx0;
        String s1;
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzei)).booleanValue()) {
            try {
                s1 = zzs.zzq(this.zza);
            }
            catch(RuntimeException | RemoteException runtimeException0) {
                zzv.zzp().zzw(runtimeException0, "NonagonMobileAdsSettingManager_AppId");
                s1 = "";
            }
        }
        else {
            s1 = "";
        }
        int v = 1;
        String s2 = TextUtils.isEmpty(s1) ? s : s1;
        if(!TextUtils.isEmpty(s2)) {
            boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzeb)).booleanValue();
            boolean z1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzba)).booleanValue();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzba)).booleanValue()) {
                zzcjx0 = new zzcjx(this, ((Runnable)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            else {
                zzcjx0 = null;
                v = z | z1;
            }
            if(v != 0) {
                zzv.zza().zza(this.zza, this.zzb, s2, zzcjx0, this.zzk, this.zzn, this.zzp);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdl0) throws RemoteException {
        this.zzi.zzh(zzdl0, zzduu.zzb);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) {
        if(iObjectWrapper0 == null) {
            zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        if(context0 == null) {
            zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzau0 = new zzau(context0);
        zzau0.zzn(s);
        zzau0.zzo(this.zzb.afmaVersion);
        zzau0.zzr();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpe0) throws RemoteException {
        this.zzl.zzf(zzbpe0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) {
        synchronized(this) {
            zzv.zzs().zzc(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) {
        synchronized(this) {
            zzv.zzs().zzd(f);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String s) {
        synchronized(this) {
            zzbcl.zza(this.zza);
            if(!TextUtils.isEmpty(s) && ((Boolean)zzbe.zzc().zza(zzbcl.zzeb)).booleanValue()) {
                zzv.zza().zza(this.zza, this.zzb, s, null, this.zzk, null, null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzblu0) throws RemoteException {
        this.zzf.zzs(zzblu0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            zzv.zzp().zzz(s);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfv0) throws RemoteException {
        this.zzg.zzn(this.zza, zzfv0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() {
        synchronized(this) {
            return zzv.zzs().zze();
        }
    }

    // 检测为 Lambda 实现
    final void zzw() [...]

    // 检测为 Lambda 实现
    final void zzx() [...]
}

