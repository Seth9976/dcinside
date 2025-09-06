package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView.ScaleType;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdia extends zzcqz {
    public static final int zzc;
    private final Executor zzd;
    private final zzdif zze;
    private final zzdin zzf;
    private final zzdjf zzg;
    private final zzdik zzh;
    private final zzdiq zzi;
    private final zzhel zzj;
    private final zzhel zzk;
    private final zzhel zzl;
    private final zzhel zzm;
    private final zzhel zzn;
    @Nullable
    private zzdkd zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbye zzs;
    private final zzava zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdic zzw;
    private final zzekq zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzfxn.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdia(zzcqy zzcqy0, Executor executor0, zzdif zzdif0, zzdin zzdin0, zzdjf zzdjf0, zzdik zzdik0, zzdiq zzdiq0, zzhel zzhel0, zzhel zzhel1, zzhel zzhel2, zzhel zzhel3, zzhel zzhel4, zzbye zzbye0, zzava zzava0, VersionInfoParcel versionInfoParcel0, Context context0, zzdic zzdic0, zzekq zzekq0, zzaym zzaym0) {
        super(zzcqy0);
        this.zzd = executor0;
        this.zze = zzdif0;
        this.zzf = zzdin0;
        this.zzg = zzdjf0;
        this.zzh = zzdik0;
        this.zzi = zzdiq0;
        this.zzj = zzhel0;
        this.zzk = zzhel1;
        this.zzl = zzhel2;
        this.zzm = zzhel3;
        this.zzn = zzhel4;
        this.zzs = zzbye0;
        this.zzt = zzava0;
        this.zzu = versionInfoParcel0;
        this.zzv = context0;
        this.zzw = zzdic0;
        this.zzx = zzekq0;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    // 检测为 Lambda 实现
    final void zzA(zzdkd zzdkd0) [...]

    public final void zzB(View view0, Map map0, Map map1, boolean z) {
        synchronized(this) {
            if(!this.zzq) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbS)).booleanValue() && this.zzb.zzak) {
                    for(Object object0: this.zzy.keySet()) {
                        if(((Boolean)this.zzy.get(((String)object0))).booleanValue()) {
                            continue;
                        }
                        return;
                    }
                }
                if(z) {
                    this.zzac(view0, map0, map1);
                    return;
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzdX)).booleanValue() && map0 != null) {
                    for(Object object1: map0.entrySet()) {
                        View view1 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                        if(view1 == null || !zzdia.zzY(view1)) {
                            continue;
                        }
                        this.zzac(view0, map0, map1);
                        return;
                    }
                }
            }
        }
    }

    public final void zzC(@Nullable zzdh zzdh0) {
        synchronized(this) {
            this.zzf.zzk(zzdh0);
        }
    }

    public final void zzD(View view0, View view1, Map map0, Map map1, boolean z) {
        synchronized(this) {
            this.zzg.zzc(this.zzo);
            ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
            this.zzf.zzl(view0, view1, map0, map1, z, imageView$ScaleType0);
            if(this.zzr) {
                zzdif zzdif0 = this.zze;
                if(zzdif0.zzs() != null) {
                    zzcex zzcex0 = zzdif0.zzs();
                    if(zzcex0 != null) {
                        zzcex0.zzd("onSdkAdUserInteractionClick", new ArrayMap());
                    }
                }
            }
        }
    }

    public final void zzE(@Nullable View view0, int v) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
                return;
            }
            zzdkd zzdkd0 = this.zzo;
            if(zzdkd0 == null) {
                zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            zzdhu zzdhu0 = () -> {
                zzdkd zzdkd0 = this.zzo;
                if(zzdkd0 == null) {
                    zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    return;
                }
                View view1 = zzdkd0.zzf();
                Map map0 = this.zzo.zzl();
                Map map1 = this.zzo.zzm();
                ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
                this.zzf.zzp(view0, view1, map0, map1, zzdkd0 instanceof zzdiz, imageView$ScaleType0, v);
            };
            this.zzd.execute(zzdhu0);
        }
    }

    public final void zzF(String s) {
        synchronized(this) {
            this.zzf.zzm(s);
        }
    }

    public final void zzG(Bundle bundle0) {
        synchronized(this) {
            this.zzf.zzn(bundle0);
        }
    }

    public final void zzH() {
        synchronized(this) {
            zzdkd zzdkd0 = this.zzo;
            if(zzdkd0 == null) {
                zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                return;
            }
            zzdhw zzdhw0 = () -> {
                zzdkd zzdkd0 = this.zzo;
                if(zzdkd0 == null) {
                    zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    return;
                }
                View view0 = zzdkd0.zzf();
                Map map0 = this.zzo.zzl();
                Map map1 = this.zzo.zzm();
                ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
                this.zzf.zzp(null, view0, map0, map1, zzdkd0 instanceof zzdiz, imageView$ScaleType0, 0);
            };
            this.zzd.execute(zzdhw0);
        }
    }

    public final void zzI(Bundle bundle0) {
        zzcex zzcex0 = this.zze.zzs();
        if(zzcex0 == null) {
            zzo.zzg("Video webview is null");
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: bundle0.keySet()) {
                jSONObject0.put(((String)object0), bundle0.get(((String)object0)));
            }
            zzdht zzdht0 = new zzdht(zzcex0, jSONObject0);
            this.zzd.execute(zzdht0);
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzo.zzh("Error reading event signals", jSONException0);
    }

    public final void zzJ() {
        synchronized(this) {
            if(this.zzq) {
                return;
            }
            this.zzf.zzs();
        }
    }

    public final void zzK(View view0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
            zzdif zzdif0 = this.zze;
            if(zzdif0.zzc() != 3) {
                zzcab zzcab0 = zzdif0.zzp();
                if(zzcab0 == null) {
                    return;
                }
                zzgch.zzr(zzcab0, new zzdhz(this, view0), this.zzd);
                return;
            }
        }
        this.zzad(view0, this.zze.zzu());
    }

    public final void zzL(View view0, MotionEvent motionEvent0, View view1) {
        synchronized(this) {
            this.zzf.zzt(view0, motionEvent0, view1);
        }
    }

    public final void zzM(Bundle bundle0) {
        synchronized(this) {
            this.zzf.zzu(bundle0);
        }
    }

    public final void zzN(View view0) {
        synchronized(this) {
            this.zzf.zzv(view0);
        }
    }

    public final void zzO() {
        synchronized(this) {
            this.zzf.zzw();
        }
    }

    public final void zzP(zzdd zzdd0) {
        synchronized(this) {
            this.zzf.zzx(zzdd0);
        }
    }

    public final void zzQ(zzdr zzdr0) {
        synchronized(this) {
            this.zzx.zza(zzdr0);
        }
    }

    public final void zzR(zzbhq zzbhq0) {
        synchronized(this) {
            this.zzf.zzy(zzbhq0);
        }
    }

    public final void zzS(zzdkd zzdkd0) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbQ)).booleanValue()) {
                zzdhp zzdhp0 = () -> this.zzae(zzdkd0);
                zzs.zza.post(zzdhp0);
                return;
            }
            this.zzae(zzdkd0);
        }
    }

    public final void zzT(zzdkd zzdkd0) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbQ)).booleanValue()) {
                zzdhq zzdhq0 = () -> this.zzaf(zzdkd0);
                zzs.zza.post(zzdhq0);
                return;
            }
            this.zzaf(zzdkd0);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final boolean zzV() {
        synchronized(this) {
            return this.zzf.zzB();
        }
    }

    public final boolean zzW() {
        synchronized(this) {
            return this.zzf.zzC();
        }
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public static boolean zzY(View view0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkw)).booleanValue()) {
            long v = zzs.zzx(view0);
            return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), new Point()) && v >= ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzkx))))));
        }
        return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), new Point());
    }

    public final boolean zzZ(Bundle bundle0) {
        synchronized(this) {
            if(this.zzq) {
                return true;
            }
            boolean z = this.zzf.zzD(bundle0);
            this.zzq = z;
            return z;
        }
    }

    public final int zza() {
        synchronized(this) {
            return this.zzf.zza();
        }
    }

    @Nullable
    private final ImageView.ScaleType zzaa() {
        synchronized(this) {
            zzdkd zzdkd0 = this.zzo;
            if(zzdkd0 == null) {
                zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            IObjectWrapper iObjectWrapper0 = zzdkd0.zzj();
            return iObjectWrapper0 != null ? ((ImageView.ScaleType)ObjectWrapper.unwrap(iObjectWrapper0)) : zzdjf.zza;
        }
    }

    private final void zzab(String s, boolean z) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
            t0 t00 = this.zze.zzw();
            if(t00 == null) {
                return;
            }
            zzgch.zzr(t00, new zzdhy(this, "Google", true), this.zzd);
            return;
        }
        this.zzf("Google", true);
    }

    private final void zzac(View view0, Map map0, Map map1) {
        synchronized(this) {
            this.zzg.zzd(this.zzo);
            ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
            this.zzf.zzr(view0, map0, map1, imageView$ScaleType0);
            this.zzq = true;
        }
    }

    private final void zzad(View view0, @Nullable zzecr zzecr0) {
        zzcex zzcex0 = this.zze.zzr();
        if(this.zzh.zzd() && zzecr0 != null && zzcex0 != null && view0 != null) {
            zzv.zzB().zzj(zzecr0.zza(), view0);
        }
    }

    private final void zzae(zzdkd zzdkd0) {
        synchronized(this) {
            if(!this.zzp) {
                this.zzo = zzdkd0;
                this.zzg.zze(zzdkd0);
                View view0 = zzdkd0.zzf();
                Map map0 = zzdkd0.zzm();
                Map map1 = zzdkd0.zzn();
                this.zzf.zzz(view0, map0, map1, zzdkd0, zzdkd0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzcK)).booleanValue()) {
                    zzauv zzauv0 = this.zzt.zzc();
                    if(zzauv0 != null) {
                        zzauv0.zzo(zzdkd0.zzf());
                    }
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbS)).booleanValue()) {
                    zzfbo zzfbo0 = this.zzb;
                    if(zzfbo0.zzak) {
                        Iterator iterator0 = zzfbo0.zzaj.keys();
                        if(iterator0 != null) {
                            while(iterator0.hasNext()) {
                                Object object0 = iterator0.next();
                                String s = (String)object0;
                                WeakReference weakReference0 = this.zzo == null ? null : ((WeakReference)this.zzo.zzl().get(s));
                                this.zzy.put(s, Boolean.FALSE);
                                if(weakReference0 != null) {
                                    View view1 = (View)weakReference0.get();
                                    if(view1 != null) {
                                        zzayl zzayl0 = new zzayl(this.zzv, view1);
                                        this.zzz.add(zzayl0);
                                        zzayl0.zzc(new zzdhx(this, s));
                                    }
                                }
                            }
                        }
                    }
                }
                if(zzdkd0.zzi() != null) {
                    zzdkd0.zzi().zzc(this.zzs);
                }
            }
        }
    }

    private final void zzaf(zzdkd zzdkd0) {
        View view0 = zzdkd0.zzf();
        Map map0 = zzdkd0.zzl();
        this.zzf.zzA(view0, map0);
        if(zzdkd0.zzh() != null) {
            zzdkd0.zzh().setClickable(false);
            zzdkd0.zzh().removeAllViews();
        }
        if(zzdkd0.zzi() != null) {
            zzdkd0.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqz
    public final void zzb() {
        synchronized(this) {
            this.zzp = true;
            zzdhv zzdhv0 = () -> {
                this.zzf.zzj();
                this.zze.zzI();
            };
            this.zzd.execute(zzdhv0);
            super.zzb();
        }
    }

    public final zzdic zzc() {
        return this.zzw;
    }

    @Nullable
    public final zzecr zzf(String s, boolean z) {
        zzeco zzeco0;
        zzecn zzecn0;
        String s2;
        String s1;
        if(this.zzh.zzd() && !TextUtils.isEmpty(s)) {
            int v = 0;
            zzcex zzcex0 = this.zze.zzr();
            zzcex zzcex1 = this.zze.zzs();
            if(zzcex0 == null && zzcex1 == null) {
                zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z1 = zzcex1 != null;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfj)).booleanValue()) {
                this.zzh.zza();
                int v1 = this.zzh.zza().zzc();
                switch(v1 - 1) {
                    case 0: {
                        if(zzcex1 != null) {
                            z1 = true;
                            break;
                        }
                        zzo.zzj("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    case 1: {
                        if(zzcex0 != null) {
                            v = 1;
                            z1 = false;
                            break;
                        }
                        zzo.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    default: {
                        switch(v1) {
                            case 1: {
                                s1 = "VIDEO";
                                break;
                            }
                            case 2: {
                                s1 = "DISPLAY";
                                break;
                            }
                            default: {
                                s1 = "UNKNOWN";
                            }
                        }
                        zzo.zzj(("Unknown omid media type: " + s1 + ". Not initializing Omid."));
                        return null;
                    }
                }
            }
            else {
                v = zzcex0 == null ? 0 : 1;
            }
            if(v == 0) {
                s2 = "javascript";
                zzcex0 = zzcex1;
            }
            else {
                s2 = null;
            }
            if(zzcex0 != null) {
                if(!zzv.zzB().zzl(this.zzv)) {
                    zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                String s3 = this.zzu.buddyApkVersion + "." + this.zzu.clientJarVersion;
                if(z1) {
                    zzecn0 = zzecn.zzc;
                    zzeco0 = zzeco.zzb;
                }
                else {
                    zzeco0 = this.zze.zzc() == 3 ? zzeco.zzd : zzeco.zzc;
                    zzecn0 = zzecn.zzb;
                }
                zzecr zzecr0 = zzv.zzB().zzb(s3, zzcex0.zzG(), "", "javascript", s2, s, zzeco0, zzecn0, this.zzb.zzal);
                if(zzecr0 == null) {
                    zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.zze.zzW(zzecr0);
                zzcex0.zzat(zzecr0);
                if(z1) {
                    zzfkp zzfkp0 = zzecr0.zza();
                    if(zzcex1 != null) {
                        zzv.zzB().zzj(zzfkp0, zzcex1.zzF());
                    }
                    this.zzr = true;
                }
                if(z) {
                    zzv.zzB().zzk(zzecr0.zza());
                    zzcex0.zzd("onSdkLoaded", new ArrayMap());
                }
                return zzecr0;
            }
            zzo.zzj("Webview is null in InternalNativeAd");
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final String zzg() {
        return "";
    }

    public final JSONObject zzi(View view0, Map map0, Map map1) {
        synchronized(this) {
            ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
            return this.zzf.zze(view0, map0, map1, imageView$ScaleType0);
        }
    }

    public final JSONObject zzj(View view0, Map map0, Map map1) {
        synchronized(this) {
            ImageView.ScaleType imageView$ScaleType0 = this.zzaa();
            return this.zzf.zzf(view0, map0, map1, imageView$ScaleType0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcqz
    @AnyThread
    public final void zzk() {
        zzdhr zzdhr0 = () -> {
            try {
                zzdif zzdif0 = this.zze;
                switch(zzdif0.zzc()) {
                    case 1: {
                        zzbgx zzbgx0 = this.zzi.zzb();
                        if(zzbgx0 != null) {
                            this.zzab("Google", true);
                            zzbgx0.zze(((zzbgn)this.zzj.zzb()));
                        }
                        break;
                    }
                    case 2: {
                        zzbgu zzbgu0 = this.zzi.zza();
                        if(zzbgu0 != null) {
                            this.zzab("Google", true);
                            zzbgu0.zze(((zzbgl)this.zzk.zzb()));
                            return;
                        }
                        break;
                    }
                    case 3: {
                        String s = zzdif0.zzA();
                        zzbhd zzbhd0 = this.zzi.zzd(s);
                        if(zzbhd0 != null) {
                            if(this.zze.zzs() != null) {
                                this.zzf("Google", true);
                            }
                            zzbhd0.zze(((zzbgq)this.zzn.zzb()));
                            return;
                        }
                        break;
                    }
                    case 6: {
                        zzbhk zzbhk0 = this.zzi.zzf();
                        if(zzbhk0 != null) {
                            this.zzab("Google", true);
                            zzbhk0.zze(((zzbht)this.zzl.zzb()));
                            return;
                        }
                        break;
                    }
                    case 7: {
                        zzbmi zzbmi0 = this.zzi.zzg();
                        if(zzbmi0 != null) {
                            zzbmi0.zzg(((zzbmc)this.zzm.zzb()));
                            return;
                        }
                        break;
                    }
                    default: {
                        zzo.zzg("Wrong native template id!");
                        return;
                    }
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzo.zzh("RemoteException when notifyAdLoad is called", remoteException0);
        };
        this.zzd.execute(zzdhr0);
        if(this.zze.zzc() != 7) {
            Objects.requireNonNull(this.zzf);
            zzdhs zzdhs0 = new zzdhs(this.zzf);
            this.zzd.execute(zzdhs0);
        }
        super.zzk();
    }

    // 检测为 Lambda 实现
    public static void zzl(zzdia zzdia0) [...]

    public final void zzu(View view0) {
        zzecr zzecr0 = this.zze.zzu();
        if(this.zzh.zzd() && zzecr0 != null && view0 != null) {
            zzv.zzB().zzg(zzecr0.zza(), view0);
        }
    }

    public final void zzv() {
        synchronized(this) {
            this.zzf.zzi();
        }
    }

    // 检测为 Lambda 实现
    final void zzw() [...]

    // 检测为 Lambda 实现
    final void zzx(View view0, boolean z, int v) [...]

    // 检测为 Lambda 实现
    final void zzy(boolean z) [...]

    // 检测为 Lambda 实现
    final void zzz(zzdkd zzdkd0) [...]
}

