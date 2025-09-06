package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzdmt extends zzbgp {
    private final Context zza;
    private final zzdif zzb;
    private zzdjf zzc;
    private zzdia zzd;

    public zzdmt(Context context0, zzdif zzdif0, zzdjf zzdjf0, zzdia zzdia0) {
        this.zza = context0;
        this.zzb = zzdif0;
        this.zzc = zzdjf0;
        this.zzd = zzdia0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzeb zze() {
        return this.zzb.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        }
        catch(NullPointerException nullPointerException0) {
            zzv.zzp().zzw(nullPointerException0, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzg(String s) {
        return (zzbfw)this.zzb.zzh().get(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final String zzj(String s) {
        return (String)this.zzb.zzi().get(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final List zzk() {
        try {
            SimpleArrayMap simpleArrayMap0 = this.zzb.zzh();
            SimpleArrayMap simpleArrayMap1 = this.zzb.zzi();
            String[] arr_s = new String[simpleArrayMap0.size() + simpleArrayMap1.size()];
            int v2 = 0;
            for(int v1 = 0; v1 < simpleArrayMap0.size(); ++v1) {
                arr_s[v2] = (String)simpleArrayMap0.g(v1);
                ++v2;
            }
            for(int v = 0; v < simpleArrayMap1.size(); ++v) {
                arr_s[v2] = (String)simpleArrayMap1.g(v);
                ++v2;
            }
            return Arrays.asList(arr_s);
        }
        catch(NullPointerException nullPointerException0) {
        }
        zzv.zzp().zzw(nullPointerException0, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
        return new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        zzdia zzdia0 = this.zzd;
        if(zzdia0 != null) {
            zzdia0.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() {
        try {
            String s = this.zzb.zzC();
            if(Objects.equals(s, "Google")) {
                zzo.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if(TextUtils.isEmpty(s)) {
                zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdia zzdia0 = this.zzd;
            if(zzdia0 != null) {
                zzdia0.zzf(s, false);
            }
            return;
        }
        catch(NullPointerException nullPointerException0) {
        }
        zzv.zzp().zzw(nullPointerException0, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(String s) {
        zzdia zzdia0 = this.zzd;
        if(zzdia0 != null) {
            zzdia0.zzF(s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() {
        zzdia zzdia0 = this.zzd;
        if(zzdia0 != null) {
            zzdia0.zzJ();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(object0 instanceof View && this.zzb.zzu() != null) {
            zzdia zzdia0 = this.zzd;
            if(zzdia0 != null) {
                zzdia0.zzK(((View)object0));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() {
        if(this.zzd != null && !this.zzd.zzX()) {
            return false;
        }
        return this.zzb.zzr() == null ? false : this.zzb.zzs() == null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(object0 instanceof ViewGroup && (this.zzc != null && this.zzc.zzf(((ViewGroup)object0)))) {
            this.zzb.zzq().zzar(new zzdms(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(object0 instanceof ViewGroup && (this.zzc != null && this.zzc.zzg(((ViewGroup)object0)))) {
            this.zzb.zzs().zzar(new zzdms(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() {
        zzecr zzecr0 = this.zzb.zzu();
        if(zzecr0 != null) {
            zzv.zzB().zzk(zzecr0.zza());
            if(this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
            }
            return true;
        }
        zzo.zzj("Trying to start OMID session before creation.");
        return false;
    }
}

