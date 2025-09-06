package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import o3.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzdki implements zzdin {
    @Nullable
    private final zzbpt zza;
    private final zzcwl zzb;
    private final zzcvr zzc;
    private final zzddq zzd;
    private final Context zze;
    private final zzfbo zzf;
    private final VersionInfoParcel zzg;
    private final zzfcj zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    @Nullable
    private final zzbpp zzl;
    @Nullable
    private final zzbpq zzm;

    public zzdki(@Nullable zzbpp zzbpp0, @Nullable zzbpq zzbpq0, @Nullable zzbpt zzbpt0, zzcwl zzcwl0, zzcvr zzcvr0, zzddq zzddq0, Context context0, zzfbo zzfbo0, VersionInfoParcel versionInfoParcel0, zzfcj zzfcj0) {
        this.zzi = false;
        this.zzj = false;
        this.zzk = true;
        this.zzl = zzbpp0;
        this.zzm = zzbpq0;
        this.zza = zzbpt0;
        this.zzb = zzcwl0;
        this.zzc = zzcvr0;
        this.zzd = zzddq0;
        this.zze = context0;
        this.zzf = zzfbo0;
        this.zzg = versionInfoParcel0;
        this.zzh = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzA(View view0, @Nullable Map map0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            zzbpt zzbpt0 = this.zza;
            if(zzbpt0 != null) {
                zzbpt0.zzz(iObjectWrapper0);
                return;
            }
            zzbpp zzbpp0 = this.zzl;
            if(zzbpp0 != null) {
                zzbpp0.zzw(iObjectWrapper0);
                return;
            }
            zzbpq zzbpq0 = this.zzm;
            if(zzbpq0 != null) {
                zzbpq0.zzu(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzk("Failed to call untrackView", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(Bundle bundle0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        return 0;
    }

    private final void zzb(View view0) {
        try {
            if(this.zza != null && !this.zza.zzA()) {
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(view0);
                this.zza.zzw(iObjectWrapper2);
                this.zzc.onAdClicked();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
            }
            else if(this.zzl != null && !this.zzl.zzx()) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
                this.zzl.zzs(iObjectWrapper0);
                this.zzc.onAdClicked();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
            }
            else if(this.zzm != null && !this.zzm.zzv()) {
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(view0);
                this.zzm.zzq(iObjectWrapper1);
                this.zzc.onAdClicked();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzk("Failed to call handleClick", remoteException0);
    }

    private static final HashMap zzc(Map map0) {
        HashMap hashMap0 = new HashMap();
        if(map0 != null) {
            synchronized(map0) {
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    View view0 = (View)((WeakReference)map$Entry0.getValue()).get();
                    if(view0 != null) {
                        hashMap0.put(((String)map$Entry0.getKey()), view0);
                    }
                }
            }
        }
        return hashMap0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zze(View view0, Map map0, Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zzf(View view0, Map map0, Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzk(@Nullable zzdh zzdh0) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzl(View view0, @Nullable View view1, @Nullable Map map0, @Nullable Map map1, boolean z, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        if(this.zzj && this.zzf.zzL) {
            return;
        }
        this.zzb(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzm(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzn(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzp(View view0, View view1, Map map0, Map map1, boolean z, @Nullable ImageView.ScaleType imageView$ScaleType0, int v) {
        if(!this.zzj) {
            zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
            return;
        }
        if(!this.zzf.zzL) {
            zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
            return;
        }
        this.zzb(view1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzr(@Nullable View view0, @Nullable Map map0, @Nullable Map map1, @Nullable ImageView.ScaleType imageView$ScaleType0) {
        try {
            if(!this.zzi) {
                this.zzi = zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if(this.zzk) {
                if(this.zza != null && !this.zza.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                if(this.zzl != null && !this.zzl.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                if(this.zzm != null && !this.zzm.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzk("Failed to call recordImpression", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzt(View view0, MotionEvent motionEvent0, @Nullable View view1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzu(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzv(View view0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzj = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzx(zzdd zzdd0) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzy(zzbhq zzbhq0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdin
    public final void zzz(View view0, @Nullable Map map0, @Nullable Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        IObjectWrapper iObjectWrapper1;
        zzbpp zzbpp0;
        zzbpt zzbpt0;
        Object object2;
        Class class0;
        JSONArray jSONArray0;
        boolean z;
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = ObjectWrapper.wrap(view0);
            JSONObject jSONObject0 = this.zzf.zzaj;
            z = true;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbF)).booleanValue() && jSONObject0.length() != 0) {
                Map map2 = map0 == null ? new HashMap() : map0;
                Map map3 = map1 == null ? new HashMap() : map1;
                HashMap hashMap0 = new HashMap();
                hashMap0.putAll(map2);
                hashMap0.putAll(map3);
                Iterator iterator0 = jSONObject0.keys();
                while(true) {
                label_16:
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    jSONArray0 = jSONObject0.optJSONArray(s);
                    if(jSONArray0 == null) {
                        continue;
                    }
                    WeakReference weakReference0 = (WeakReference)hashMap0.get(s);
                    if(weakReference0 == null) {
                        goto label_54;
                    }
                    Object object1 = weakReference0.get();
                    if(object1 == null) {
                        goto label_54;
                    }
                    class0 = object1.getClass();
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzbG)).booleanValue() && s.equals("3010")) {
                        object2 = null;
                        zzbpt0 = this.zza;
                        if(zzbpt0 == null) {
                            zzbpp0 = this.zzl;
                            if(zzbpp0 == null) {
                                goto label_32;
                            }
                            else {
                                iObjectWrapper1 = zzbpp0.zzk();
                                goto label_41;
                            }
                        }
                        iObjectWrapper1 = zzbpt0.zzn();
                        goto label_41;
                    }
                    goto label_45;
                }
            }
            goto label_55;
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to call trackView", remoteException0);
            return;
        }
    label_32:
        zzbpq zzbpq0 = this.zzm;
        if(zzbpq0 == null) {
            iObjectWrapper1 = null;
            goto label_41;
        }
        else {
            try {
                iObjectWrapper1 = zzbpq0.zzj();
                goto label_41;
            }
            catch(RemoteException unused_ex) {
                goto label_43;
            }
        }
        iObjectWrapper1 = zzbpp0.zzk();
    label_41:
        if(iObjectWrapper1 != null) {
            try {
                try {
                    object2 = ObjectWrapper.unwrap(iObjectWrapper1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            label_43:
                if(object2 == null) {
                    goto label_54;
                }
                class0 = object2.getClass();
                try {
                label_45:
                    ArrayList arrayList0 = new ArrayList();
                    zzbs.zzc(jSONArray0, arrayList0);
                    ClassLoader classLoader0 = this.zze.getClassLoader();
                    Iterator iterator1 = arrayList0.iterator();
                label_49:
                    if(!iterator1.hasNext()) {
                        goto label_54;
                    }
                    Object object3 = iterator1.next();
                    String s1 = (String)object3;
                    goto label_52;
                }
                catch(JSONException unused_ex) {
                    goto label_16;
                }
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to call trackView", remoteException0);
                return;
            }
        }
        goto label_43;
        try {
        label_52:
            if(!Class.forName(s1, false, classLoader0).isAssignableFrom(class0)) {
                goto label_49;
            }
            goto label_16;
        }
        catch(Throwable unused_ex) {
        }
        goto label_49;
        try {
        label_54:
            z = false;
        label_55:
            this.zzk = z;
            HashMap hashMap1 = zzdki.zzc(map0);
            HashMap hashMap2 = zzdki.zzc(map1);
            zzbpt zzbpt1 = this.zza;
            if(zzbpt1 != null) {
                zzbpt1.zzy(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                return;
            }
            zzbpp zzbpp1 = this.zzl;
            if(zzbpp1 != null) {
                zzbpp1.zzv(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                this.zzl.zzu(iObjectWrapper0);
                return;
            }
            zzbpq zzbpq1 = this.zzm;
            if(zzbpq1 != null) {
                zzbpq1.zzt(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                this.zzm.zzs(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzk("Failed to call trackView", remoteException0);
    }
}

