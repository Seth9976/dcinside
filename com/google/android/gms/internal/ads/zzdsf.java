package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class zzdsf {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final zzu zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    protected zzdsf(Executor executor0, zzu zzu0, CsiUrlBuilder csiUrlBuilder0, Context context0) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor0;
        this.zzd = zzu0;
        this.zze = ((Boolean)zzbe.zzc().zza(zzbcl.zzcf)).booleanValue();
        this.zzf = csiUrlBuilder0;
        this.zzg = ((Boolean)zzbe.zzc().zza(zzbcl.zzci)).booleanValue();
        this.zzh = ((Boolean)zzbe.zzc().zza(zzbcl.zzgN)).booleanValue();
        this.zzb = context0;
    }

    private final void zza(Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            if(!this.zzi.getAndSet(true)) {
                String s = (String)zzbe.zzc().zza(zzbcl.zzks);
                zzdsd zzdsd0 = (SharedPreferences sharedPreferences0, String s1) -> {
                    Bundle bundle0 = zzad.zzb(this.zzb, s);
                    this.zzj.set(bundle0);
                };
                Bundle bundle0 = zzad.zza(this.zzb, s, zzdsd0);
                this.zzj.set(bundle0);
            }
            Bundle bundle1 = (Bundle)this.zzj.get();
            for(Object object0: bundle1.keySet()) {
                map0.put(((String)object0), String.valueOf(bundle1.get(((String)object0))));
            }
            return;
        }
        zzo.zze("Empty or null paramMap.");
    }

    protected final String zzb(Map map0) {
        return this.zzf.generateUrl(map0);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    // 检测为 Lambda 实现
    final void zzd(String s, SharedPreferences sharedPreferences0, String s1) [...]

    public final void zze(Map map0) {
        if(map0.isEmpty()) {
            zzo.zze("Empty paramMap.");
            return;
        }
        this.zza(map0);
        String s = this.zzf.generateUrl(map0);
        zze.zza(s);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzmX)).booleanValue() && !this.zze) {
            return;
        }
        zzdse zzdse0 = new zzdse(this, s);
        this.zzc.execute(zzdse0);
    }

    public final void zzf(Map map0) {
        this.zzh(map0, true);
    }

    public final void zzg(Map map0) {
        this.zzh(map0, false);
    }

    private final void zzh(Map map0, boolean z) {
        if(map0.isEmpty()) {
            zzo.zze("Empty paramMap.");
            return;
        }
        this.zza(map0);
        String s = this.zzf.generateUrl(map0);
        zze.zza(s);
        boolean z1 = Boolean.parseBoolean(((String)map0.get("scar")));
        if(this.zze && (!z || this.zzg) && (!z1 || this.zzh)) {
            zzdsc zzdsc0 = new zzdsc(this, s);
            this.zzc.execute(zzdsc0);
        }
    }
}

