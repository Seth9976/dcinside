package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import o3.j;

@Deprecated
@j
public final class zzbda {
    private final List zza;
    private final Map zzb;
    private final Object zzc;

    public zzbda(boolean z, String s, String s1) {
        this.zza = new LinkedList();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.zzb = linkedHashMap0;
        this.zzc = new Object();
        linkedHashMap0.put("action", "make_wv");
        linkedHashMap0.put("ad_format", s1);
    }

    public final zzbcz zza() {
        String s1;
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
        StringBuilder stringBuilder0 = new StringBuilder();
        HashMap hashMap0 = new HashMap();
        synchronized(this.zzc) {
            for(Object object1: this.zza) {
                long v1 = ((zzbcx)object1).zza();
                String s = ((zzbcx)object1).zzc();
                zzbcx zzbcx0 = ((zzbcx)object1).zzb();
                if(zzbcx0 != null && v1 > 0L) {
                    stringBuilder0.append(s);
                    stringBuilder0.append('.');
                    stringBuilder0.append(v1 - zzbcx0.zza());
                    stringBuilder0.append(',');
                    if(!z) {
                    }
                    else if(hashMap0.containsKey(zzbcx0.zza())) {
                        StringBuilder stringBuilder1 = (StringBuilder)hashMap0.get(zzbcx0.zza());
                        stringBuilder1.append('+');
                        stringBuilder1.append(s);
                    }
                    else {
                        hashMap0.put(zzbcx0.zza(), new StringBuilder(s));
                    }
                }
            }
            this.zza.clear();
            s1 = null;
            if(!TextUtils.isEmpty(null)) {
                stringBuilder0.append(null);
            }
            else if(stringBuilder0.length() > 0) {
                stringBuilder0.setLength(stringBuilder0.length() - 1);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if(z) {
                for(Object object2: hashMap0.entrySet()) {
                    stringBuilder2.append(((CharSequence)((Map.Entry)object2).getValue()));
                    stringBuilder2.append('.');
                    long v2 = (long)(((Long)((Map.Entry)object2).getKey()));
                    stringBuilder2.append(zzv.zzC().currentTimeMillis() + (v2 - zzv.zzC().elapsedRealtime()));
                    stringBuilder2.append(',');
                }
                if(stringBuilder2.length() > 0) {
                    stringBuilder2.setLength(stringBuilder2.length() - 1);
                }
                s1 = stringBuilder2.toString();
            }
        }
        return new zzbcz(stringBuilder0.toString(), s1);
    }

    @VisibleForTesting
    public final Map zzb() {
        synchronized(this.zzc) {
        }
        return this.zzb;
    }

    public final void zzc(@Nullable zzbda zzbda0) {
        synchronized(this.zzc) {
        }
    }

    public final void zzd(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            zzbcq zzbcq0 = zzv.zzp().zzg();
            if(zzbcq0 != null) {
                synchronized(this.zzc) {
                    String s2 = zzbcq0.zza(s).zza(((String)this.zzb.get(s)), s1);
                    this.zzb.put(s, s2);
                }
            }
        }
    }

    public final boolean zze(zzbcx zzbcx0, long v, String[] arr_s) {
        synchronized(this.zzc) {
            zzbcx zzbcx1 = new zzbcx(v, arr_s[0], zzbcx0);
            this.zza.add(zzbcx1);
            return true;
        }
    }

    public static final zzbcx zzf() {
        return new zzbcx(zzv.zzC().elapsedRealtime(), null, null);
    }
}

