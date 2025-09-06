package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzbc {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    zzbc(zzhy zzhy0, String s, String s1, String s2, long v, long v1, Bundle bundle0) {
        Preconditions.checkNotEmpty(s1);
        zzbe zzbe0;
        Preconditions.checkNotEmpty(s2);
        this.zza = s1;
        this.zzb = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzc = s;
        this.zzd = v;
        this.zze = v1;
        if(v1 != 0L && v1 > v) {
            zzhy0.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzgo.zza(s1));
        }
        if(bundle0 == null || bundle0.isEmpty()) {
            zzbe0 = new zzbe(new Bundle());
        }
        else {
            Bundle bundle1 = new Bundle(bundle0);
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(s3 == null) {
                    zzhy0.zzj().zzg().zza("Param name can\'t be null");
                    iterator0.remove();
                }
                else {
                    Object object1 = zzhy0.zzt().zzb(s3, bundle1.get(s3));
                    if(object1 == null) {
                        zzhy0.zzj().zzu().zza("Param value can\'t be null", zzhy0.zzk().zzb(s3));
                        iterator0.remove();
                    }
                    else {
                        zzhy0.zzt().zza(bundle1, s3, object1);
                    }
                }
            }
            zzbe0 = new zzbe(bundle1);
        }
        this.zzf = zzbe0;
    }

    private zzbc(zzhy zzhy0, String s, String s1, String s2, long v, long v1, zzbe zzbe0) {
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotEmpty(s2);
        Preconditions.checkNotNull(zzbe0);
        this.zza = s1;
        this.zzb = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzc = s;
        this.zzd = v;
        this.zze = v1;
        if(v1 != 0L && v1 > v) {
            zzhy0.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzgo.zza(s1), zzgo.zza(s2));
        }
        this.zzf = zzbe0;
    }

    @Override
    public final String toString() {
        return "Event{appId=\'" + this.zza + "\', name=\'" + this.zzb + "\', params=" + this.zzf + "}";
    }

    final zzbc zza(zzhy zzhy0, long v) {
        return new zzbc(zzhy0, this.zzc, this.zza, this.zzb, this.zzd, v, this.zzf);
    }
}

