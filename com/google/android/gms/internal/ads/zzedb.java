package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class zzedb {
    private final List zza;
    private final Map zzb;
    private final String zzc;
    @Nullable
    private zzfbr zzd;
    @Nullable
    private zzfbo zze;
    @Nullable
    private zzw zzf;

    public zzedb(String s) {
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzb = DesugarCollections.synchronizedMap(new HashMap());
        this.zza = DesugarCollections.synchronizedList(new ArrayList());
        this.zzc = s;
    }

    @Nullable
    public final zzw zza() {
        return this.zzf;
    }

    public final zzcvm zzb() {
        return new zzcvm(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbo zzfbo0) {
        this.zzk(zzfbo0, this.zza.size());
    }

    public final void zze(zzfbo zzfbo0) {
        String s = zzedb.zzj(zzfbo0);
        Object object0 = this.zzb.get(s);
        int v = this.zza.indexOf(object0);
        if(v < 0 || v >= this.zzb.size()) {
            v = this.zza.indexOf(this.zzf);
        }
        if(v >= 0 && v < this.zzb.size()) {
            this.zzf = (zzw)this.zza.get(v);
            while(true) {
                ++v;
                if(v >= this.zza.size()) {
                    break;
                }
                zzw zzw0 = (zzw)this.zza.get(v);
                zzw0.zzb = 0L;
                zzw0.zzc = null;
            }
        }
    }

    public final void zzf(zzfbo zzfbo0, long v, @Nullable zze zze0) {
        this.zzl(zzfbo0, v, zze0, false);
    }

    public final void zzg(zzfbo zzfbo0, long v, @Nullable zze zze0) {
        this.zzl(zzfbo0, v, null, true);
    }

    public final void zzh(String s, List list0) {
        synchronized(this) {
            if(this.zzb.containsKey(s)) {
                zzw zzw0 = (zzw)this.zzb.get(s);
                int v1 = this.zza.indexOf(zzw0);
                try {
                    this.zza.remove(v1);
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    zzv.zzp().zzw(indexOutOfBoundsException0, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(s);
                for(Object object0: list0) {
                    this.zzk(((zzfbo)object0), v1);
                    ++v1;
                }
            }
        }
    }

    public final void zzi(zzfbr zzfbr0) {
        this.zzd = zzfbr0;
    }

    // 去混淆评级： 低(20)
    private static String zzj(zzfbo zzfbo0) {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue() ? zzfbo0.zzap : zzfbo0.zzw;
    }

    private final void zzk(zzfbo zzfbo0, int v) {
        synchronized(this) {
            String s = zzedb.zzj(zzfbo0);
            if(this.zzb.containsKey(s)) {
                return;
            }
            Bundle bundle0 = new Bundle();
            Iterator iterator0 = zzfbo0.zzv.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                try {
                    bundle0.putString(s1, zzfbo0.zzv.getString(s1));
                }
                catch(JSONException unused_ex) {
                }
            }
            zzw zzw0 = new zzw(zzfbo0.zzE, 0L, null, bundle0, zzfbo0.zzF, zzfbo0.zzG, zzfbo0.zzH, zzfbo0.zzI);
            try {
                this.zza.add(v, zzw0);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                zzv.zzp().zzw(indexOutOfBoundsException0, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(s, zzw0);
        }
    }

    private final void zzl(zzfbo zzfbo0, long v, @Nullable zze zze0, boolean z) {
        String s = zzedb.zzj(zzfbo0);
        if(this.zzb.containsKey(s)) {
            if(this.zze == null) {
                this.zze = zzfbo0;
            }
            zzw zzw0 = (zzw)this.zzb.get(s);
            zzw0.zzb = v;
            zzw0.zzc = zze0;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgD)).booleanValue() && z) {
                this.zzf = zzw0;
            }
        }
    }
}

