package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzv {
    private final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private final zzdsb zzh;
    private Map zzi;

    public zzv(zzdsb zzdsb0) {
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
        this.zzh = zzdsb0;
        this.zza = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzgK)));
        this.zzb = (long)(((Long)zzbe.zzc().zza(zzbcl.zzgL)));
        this.zzc = ((Boolean)zzbe.zzc().zza(zzbcl.zzgP)).booleanValue();
        this.zzd = ((Boolean)zzbe.zzc().zza(zzbcl.zzgO)).booleanValue();
        this.zze = DesugarCollections.synchronizedMap(new zzt(this));
    }

    @Nullable
    public final String zzb(String s, zzdrq zzdrq0) {
        synchronized(this) {
            zzu zzu0 = (zzu)this.zze.get(s);
            zzdrq0.zzb().put("request_id", s);
            if(zzu0 != null) {
                zzdrq0.zzb().put("mhit", "true");
                return zzu0.zzb;
            }
            zzdrq0.zzb().put("mhit", "false");
            return null;
        }
    }

    public final void zzd(String s, String s1, zzdrq zzdrq0) {
        synchronized(this) {
            zzu zzu0 = new zzu(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), s1, new HashSet());
            this.zze.put(s, zzu0);
            this.zzk();
            this.zzi(zzdrq0);
        }
    }

    // 检测为 Lambda 实现
    final void zze(zzdrq zzdrq0, ArrayDeque arrayDeque0, ArrayDeque arrayDeque1) [...]

    public final void zzf(String s) {
        synchronized(this) {
            this.zze.remove(s);
        }
    }

    public final boolean zzg(String s, String s1, int v) {
        synchronized(this) {
            zzu zzu0 = (zzu)this.zze.get(s);
            if(zzu0 != null) {
                zzu0.zzc.add(s1);
                return zzu0.zzc.size() < v;
            }
            return false;
        }
    }

    public final boolean zzh(String s, String s1) {
        synchronized(this) {
            zzu zzu0 = (zzu)this.zze.get(s);
            return zzu0 != null && zzu0.zzc.contains(s1);
        }
    }

    private final void zzi(zzdrq zzdrq0) {
        synchronized(this) {
            if(!this.zzc) {
                return;
            }
            ArrayDeque arrayDeque0 = this.zzg.clone();
            this.zzg.clear();
            ArrayDeque arrayDeque1 = this.zzf.clone();
            this.zzf.clear();
            zzs zzs0 = () -> {
                this.zzj(zzdrq0, arrayDeque0, "to");
                this.zzj(zzdrq0, arrayDeque1, "of");
            };
            zzbzw.zza.execute(zzs0);
        }
    }

    private final void zzj(zzdrq zzdrq0, ArrayDeque arrayDeque0, String s) {
        Pair pair1;
        while(!arrayDeque0.isEmpty()) {
            Pair pair0 = (Pair)arrayDeque0.poll();
            ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap(zzdrq0.zzb());
            this.zzi = concurrentHashMap0;
            concurrentHashMap0.put("action", "ev");
            this.zzi.put("e_r", s);
            this.zzi.put("e_id", ((String)pair0.first));
            if(this.zzd) {
                String s1 = (String)pair0.second;
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    String s2 = jSONObject0.getString("request_agent");
                    pair1 = new Pair(zzaa.zzb(jSONObject0.getJSONObject("extras").getString("query_info_type")), s2);
                }
                catch(JSONException unused_ex) {
                    pair1 = new Pair("", "");
                }
                zzv.zzl(this.zzi, "e_type", ((String)pair1.first));
                zzv.zzl(this.zzi, "e_agent", ((String)pair1.second));
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final void zzk() {
        synchronized(this) {
            long v1 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            Set set0 = this.zze.entrySet();
            try {
                Iterator iterator0 = set0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(v1 - ((long)((zzu)((Map.Entry)object0).getValue()).zza) <= this.zzb) {
                        break;
                    }
                    Pair pair0 = new Pair(((String)((Map.Entry)object0).getKey()), ((zzu)((Map.Entry)object0).getValue()).zzb);
                    this.zzg.add(pair0);
                    iterator0.remove();
                }
            }
            catch(ConcurrentModificationException concurrentModificationException0) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(concurrentModificationException0, "QueryJsonMap.removeExpiredEntries");
            }
        }
    }

    private static final void zzl(Map map0, String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            map0.put(s, s1);
        }
    }
}

