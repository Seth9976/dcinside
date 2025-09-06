package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzf {
    private final Context zza;
    @Nullable
    private final ApplicationInfo zzb;
    private final List zzc;
    private final VersionInfoParcel zzd;
    private final JSONObject zze;
    private final AtomicBoolean zzf;

    zzf(Context context0, zzbbu zzbbu0, List list0, VersionInfoParcel versionInfoParcel0) {
        this.zze = new JSONObject();
        this.zzf = new AtomicBoolean(false);
        this.zza = context0;
        this.zzb = context0.getApplicationInfo();
        this.zzc = list0;
        this.zzd = versionInfoParcel0;
    }

    public final JSONObject zza() {
        if(!this.zzf.get()) {
            this.zzb();
        }
        return this.zze;
    }

    public final void zzb() {
        PackageInfo packageInfo0;
        if(this.zzf.getAndSet(true)) {
            return;
        }
        else {
            try {
                packageInfo0 = null;
                if(this.zzb != null) {
                    packageInfo0 = Wrappers.packageManager(this.zza).getPackageInfo(this.zzb.packageName, 0);
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            try {
                if(packageInfo0 != null) {
                    this.zze.put("vc", packageInfo0.versionCode);
                    this.zze.put("vnm", packageInfo0.versionName);
                }
                ApplicationInfo applicationInfo0 = this.zzb;
                if(applicationInfo0 != null) {
                    this.zze.put("pn", applicationInfo0.packageName);
                }
                JSONObject jSONObject0 = this.zze;
                List list0 = this.zzc;
                ArrayList arrayList0 = new ArrayList();
                String[] arr_s = ((String)zzbe.zzc().zza(zzbcl.zzjG)).split(",", -1);
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    if(list0.contains(s)) {
                        arrayList0.add(s);
                    }
                }
                jSONObject0.put("eid", arrayList0);
                this.zze.put("js", this.zzd.afmaVersion);
                Iterator iterator0 = this.zze.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    Object object1 = this.zze.get(s1);
                    if(object1 != null) {
                        String s2 = Base64.encodeToString(object1.toString().getBytes(), 2);
                        this.zze.put(s1, s2);
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
            }
        }
        zzv.zzp().zzw(jSONException0, "PawAppSignalGenerator.initialize");
    }
}

