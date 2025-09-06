package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.t0;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import o3.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzbxp implements zzbxu {
    @VisibleForTesting
    boolean zza;
    public static final int zzb;
    private static final List zzc;
    private final zzhbn zzd;
    private final LinkedHashMap zze;
    private final List zzf;
    private final List zzg;
    private final Context zzh;
    private final zzbxr zzi;
    private final Object zzj;
    private HashSet zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzbxp.zzc = DesugarCollections.synchronizedList(new ArrayList());
    }

    public zzbxp(Context context0, VersionInfoParcel versionInfoParcel0, zzbxr zzbxr0, @Nullable String s, zzbxq zzbxq0) {
        this.zzf = new ArrayList();
        this.zzg = new ArrayList();
        this.zzj = new Object();
        this.zzk = new HashSet();
        this.zzl = false;
        this.zzm = false;
        Preconditions.checkNotNull(zzbxr0, "SafeBrowsing config is not present.");
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zzh = context0;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxr0;
        for(Object object0: zzbxr0.zze) {
            this.zzk.add(((String)object0).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie");
        zzhbn zzhbn0 = zzhdm.zzc();
        zzhbn0.zzn(9);
        zzhbn0.zzj(s);
        zzhbn0.zzh(s);
        zzhbo zzhbo0 = zzhbp.zzc();
        String s1 = this.zzi.zza;
        if(s1 != null) {
            zzhbo0.zza(s1);
        }
        zzhbn0.zzg(((zzhbp)zzhbo0.zzbn()));
        zzhdd zzhdd0 = zzhde.zzc();
        zzhdd0.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String s2 = versionInfoParcel0.afmaVersion;
        if(s2 != null) {
            zzhdd0.zza(s2);
        }
        long v = (long)GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if(v > 0L) {
            zzhdd0.zzb(v);
        }
        zzhbn0.zzf(((zzhde)zzhdd0.zzbn()));
        this.zzd = zzhbn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final zzbxr zza() {
        return this.zzi;
    }

    // 检测为 Lambda 实现
    final t0 zzb(Map map0) throws Exception [...]

    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final void zzd(String s, Map map0, int v) {
        synchronized(this.zzj) {
            if(v == 3) {
                this.zzm = true;
            }
            if(this.zze.containsKey(s)) {
                if(v == 3) {
                    ((zzhdb)this.zze.get(s)).zze(4);
                }
                return;
            }
            zzhdb zzhdb0 = zzhdc.zzd();
            int v2 = zzhda.zza(v);
            if(v2 != 0) {
                zzhdb0.zze(v2);
            }
            zzhdb0.zzb(this.zze.size());
            zzhdb0.zzd(s);
            zzhca zzhca0 = zzhcd.zzc();
            if(!this.zzk.isEmpty() && map0 != null) {
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    String s1 = map$Entry0.getKey() == null ? "" : ((String)map$Entry0.getKey());
                    String s2 = map$Entry0.getValue() == null ? "" : ((String)map$Entry0.getValue());
                    if(this.zzk.contains(s1.toLowerCase(Locale.ENGLISH))) {
                        zzhby zzhby0 = zzhbz.zzc();
                        zzhby0.zza(zzgwj.zzw(s1));
                        zzhby0.zzb(zzgwj.zzw(s2));
                        zzhca0.zza(((zzhbz)zzhby0.zzbn()));
                    }
                }
            }
            zzhdb0.zzc(((zzhcd)zzhca0.zzbn()));
            this.zze.put(s, zzhdb0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final void zze() {
        synchronized(this.zzj) {
            this.zze.keySet();
            t0 t00 = zzgch.zzn(zzgch.zzh(Collections.emptyMap()), (Map map0) -> {
                zzhdb zzhdb0;
                Object object5;
                int v2;
                Object object4;
                JSONArray jSONArray0;
                String s;
                try {
                    if(map0 == null) {
                        goto label_3;
                    }
                    Iterator iterator0 = map0.keySet().iterator();
                    while(true) {
                    label_2:
                        if(!iterator0.hasNext()) {
                        label_3:
                            if(this.zza) {
                                synchronized(this.zzj) {
                                    this.zzd.zzn(10);
                                }
                            }
                            if(this.zza && this.zzi.zzg || this.zzm && this.zzi.zzf || !this.zza && this.zzi.zzd) {
                                synchronized(this.zzj) {
                                    for(Object object1: this.zze.values()) {
                                        zzhdc zzhdc0 = (zzhdc)((zzhdb)object1).zzbn();
                                        this.zzd.zzc(zzhdc0);
                                    }
                                    this.zzd.zza(this.zzf);
                                    this.zzd.zzb(this.zzg);
                                    if(zzbxt.zzb()) {
                                        StringBuilder stringBuilder0 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                                        for(Object object2: this.zzd.zzm()) {
                                            stringBuilder0.append("    [");
                                            stringBuilder0.append(((zzhdc)object2).zzc());
                                            stringBuilder0.append("] ");
                                            stringBuilder0.append("");
                                        }
                                        zzbxt.zza(stringBuilder0.toString());
                                    }
                                    byte[] arr_b = ((zzhdm)this.zzd.zzbn()).zzaV();
                                    t0 t00 = new zzbo(this.zzh).zzb(1, this.zzi.zzb, null, arr_b);
                                    if(zzbxt.zzb()) {
                                        t00.addListener(new zzbxm(), zzbzw.zza);
                                    }
                                    return zzgch.zzm(t00, new zzbxn(), zzbzw.zzg);
                                }
                            }
                            return zzgch.zzh(null);
                        }
                        Object object3 = iterator0.next();
                        s = (String)object3;
                        jSONArray0 = new JSONObject(((String)map0.get(s))).optJSONArray("matches");
                        if(jSONArray0 != null) {
                            object4 = this.zzj;
                            __monitor_enter(object4);
                            v2 = FIN.finallyOpen$NT();
                            int v3 = jSONArray0.length();
                            object5 = this.zzj;
                            __monitor_enter(object5);
                            break;
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    goto label_78;
                }
                try {
                    zzhdb0 = (zzhdb)this.zze.get(s);
                    goto label_59;
                }
                catch(Throwable throwable0) {
                    try {
                        __monitor_exit(object5);
                        FIN.finallyExec$NT(v2);
                        throw throwable0;
                    label_59:
                        __monitor_exit(object5);
                        if(zzhdb0 == null) {
                            zzbxt.zza(("Cannot find the corresponding resource object for " + s));
                        }
                        else {
                            boolean z = false;
                            for(int v4 = 0; v4 < v3; ++v4) {
                                zzhdb0.zza(jSONArray0.getJSONObject(v4).getString("threat_type"));
                            }
                            boolean z1 = this.zza;
                            if(v3 > 0) {
                                z = true;
                            }
                            this.zza = z | z1;
                        }
                        FIN.finallyCodeBegin$NT(v2);
                        __monitor_exit(object4);
                        FIN.finallyCodeEnd$NT(v2);
                        goto label_2;
                    }
                    catch(JSONException jSONException0) {
                    }
                }
            label_78:
                if(((Boolean)zzbet.zza.zze()).booleanValue()) {
                    zzo.zzf("Failed to get SafeBrowsing metadata", jSONException0);
                }
                return zzgch.zzg(new Exception("Safebrowsing report transmission failed."));
            }, zzbzw.zzg);
            t0 t01 = zzgch.zzo(t00, 10L, TimeUnit.SECONDS, zzbzw.zzd);
            zzgch.zzr(t00, new zzbxo(this, t01), zzbzw.zzg);
            zzbxp.zzc.add(t01);
        }
    }

    // 检测为 Lambda 实现
    final void zzf(Bitmap bitmap0) [...]

    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(View view0) {
        Bitmap bitmap2;
        boolean z;
        Bitmap bitmap0 = null;
        if(this.zzi.zzc && !this.zzl) {
            if(view0 != null) {
                try {
                    z = view0.isDrawingCacheEnabled();
                    view0.setDrawingCacheEnabled(true);
                    Bitmap bitmap1 = view0.getDrawingCache();
                    bitmap2 = bitmap1 == null ? null : Bitmap.createBitmap(bitmap1);
                }
                catch(RuntimeException runtimeException0) {
                    bitmap2 = null;
                    goto label_17;
                }
                try {
                    view0.setDrawingCacheEnabled(z);
                    goto label_18;
                }
                catch(RuntimeException runtimeException0) {
                }
            label_17:
                zzo.zzh("Fail to capture the web view", runtimeException0);
            label_18:
                if(bitmap2 == null) {
                    try {
                        int v = view0.getWidth();
                        int v1 = view0.getHeight();
                        if(v == 0 || v1 == 0) {
                            zzo.zzj("Width or height of view is zero");
                        }
                        else {
                            Bitmap bitmap3 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas0 = new Canvas(bitmap3);
                            view0.layout(0, 0, v, v1);
                            view0.draw(canvas0);
                            bitmap0 = bitmap3;
                        }
                        goto label_34;
                    }
                    catch(RuntimeException runtimeException1) {
                    }
                    zzo.zzh("Fail to capture the webview", runtimeException1);
                }
                else {
                    bitmap0 = bitmap2;
                }
            }
        label_34:
            if(bitmap0 == null) {
                zzbxt.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            zzs.zzh(() -> {
                zzgwh zzgwh0 = zzgwj.zzt();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 0, zzgwh0);
                synchronized(this.zzj) {
                    zzhcv zzhcv0 = zzhcx.zzc();
                    zzhcv0.zza(zzgwh0.zzb());
                    zzhcv0.zzb("image/png");
                    zzhcv0.zzc(2);
                    zzhcx zzhcx0 = (zzhcx)zzhcv0.zzbn();
                    this.zzd.zzi(zzhcx0);
                }
            });
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final void zzh(String s) {
        synchronized(this.zzj) {
            if(s == null) {
                this.zzd.zzd();
            }
            else {
                this.zzd.zze(s);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzi() {
        return this.zzi.zzc && !this.zzl;
    }
}

