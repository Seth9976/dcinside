package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzgn implements zzgk {
    private final AtomicBoolean zza;
    @GuardedBy("this")
    @Nullable
    private HashMap zzb;
    @GuardedBy("this")
    private final HashMap zzc;
    @GuardedBy("this")
    private final HashMap zzd;
    @GuardedBy("this")
    private final HashMap zze;
    @GuardedBy("this")
    private final HashMap zzf;
    @GuardedBy("this")
    @Nullable
    private Object zzg;
    @GuardedBy("this")
    private boolean zzh;
    @GuardedBy("this")
    private String[] zzi;
    private final zzgq zzj;

    public zzgn() {
        this.zza = new AtomicBoolean();
        this.zzb = null;
        this.zzc = new HashMap(16, 1.0f);
        this.zzd = new HashMap(16, 1.0f);
        this.zze = new HashMap(16, 1.0f);
        this.zzf = new HashMap(16, 1.0f);
        this.zzg = null;
        this.zzh = false;
        this.zzi = new String[0];
        this.zzj = new zzgo();
    }

    @Override  // com.google.android.gms.internal.measurement.zzgk
    @Nullable
    public final String zza(@Nullable ContentResolver contentResolver0, String s, @Nullable String s1) {
        String s4;
        HashMap hashMap0;
        String s2;
        if(contentResolver0 == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized(this) {
            int v = 0;
            s2 = null;
            if(this.zzb == null) {
                this.zza.set(false);
                this.zzb = new HashMap(16, 1.0f);
                this.zzg = new Object();
                zzgp zzgp0 = new zzgp(this, null);
                contentResolver0.registerContentObserver(zzgi.zza, true, zzgp0);
            }
            else if(this.zza.getAndSet(false)) {
                this.zzb.clear();
                this.zzc.clear();
                this.zzd.clear();
                this.zze.clear();
                this.zzf.clear();
                this.zzg = new Object();
                this.zzh = false;
            }
            Object object0 = this.zzg;
            if(!this.zzb.containsKey(s)) {
                String[] arr_s = this.zzi;
                while(true) {
                    if(v >= arr_s.length) {
                        goto label_50;
                    }
                    if(!s.startsWith(arr_s[v])) {
                        ++v;
                        continue;
                    }
                    if(!this.zzh) {
                        String[] arr_s1 = this.zzi;
                        try {
                            zzgm zzgm0 = new zzgm();
                            hashMap0 = (HashMap)this.zzj.zza(contentResolver0, arr_s1, zzgm0);
                        }
                        catch(zzgt unused_ex) {
                            goto label_42;
                        }
                        if(!hashMap0.isEmpty()) {
                            Set set0 = hashMap0.keySet();
                            set0.removeAll(this.zzc.keySet());
                            set0.removeAll(this.zzd.keySet());
                            set0.removeAll(this.zze.keySet());
                            set0.removeAll(this.zzf.keySet());
                        }
                        if(!hashMap0.isEmpty()) {
                            if(this.zzb.isEmpty()) {
                                this.zzb = hashMap0;
                            }
                            else {
                                this.zzb.putAll(hashMap0);
                            }
                        }
                        this.zzh = true;
                    label_42:
                        if(this.zzb.containsKey(s)) {
                            String s3 = (String)this.zzb.get(s);
                            if(s3 != null) {
                                s2 = s3;
                            }
                            return s2;
                        }
                    }
                    return null;
                }
            }
            goto label_64;
        }
        return s2;
    label_50:
        try {
            s4 = this.zzj.zza(contentResolver0, s);
        }
        catch(zzgt unused_ex) {
            return null;
        }
        if(s4 != null && s4.equals(null)) {
            s4 = null;
        }
        synchronized(this) {
            if(object0 == this.zzg) {
                this.zzb.put(s, s4);
            }
        }
        return s4 == null ? null : s4;
    label_64:
        String s5 = (String)this.zzb.get(s);
        if(s5 != null) {
            s2 = s5;
        }
        return s2;
    }
}

