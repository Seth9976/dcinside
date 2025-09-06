package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashSet;
import java.util.concurrent.Executor;

public final class zzewe implements zzher {
    public static zzetu zza(Context context0, zzbza zzbza0, zzbzb zzbzb0, Object object0, zzeux zzeux0, zzevr zzevr0, zzhel zzhel0, zzhel zzhel1, zzhel zzhel2, zzhel zzhel3, zzhel zzhel4, zzhel zzhel5, zzhel zzhel6, Executor executor0, zzfhh zzfhh0, zzdrw zzdrw0) {
        HashSet hashSet0 = new HashSet();
        hashSet0.add(((zzevk)object0));
        hashSet0.add(zzeux0);
        hashSet0.add(zzevr0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfH)).booleanValue()) {
            hashSet0.add(((zzetr)zzhel0.zzb()));
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfI)).booleanValue()) {
            hashSet0.add(((zzetr)zzhel1.zzb()));
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfK)).booleanValue()) {
            hashSet0.add(((zzetr)zzhel3.zzb()));
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfL)).booleanValue()) {
            hashSet0.add(((zzetr)zzhel4.zzb()));
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdd)).booleanValue()) {
            hashSet0.add(((zzetr)zzhel6.zzb()));
        }
        return new zzetu(context0, executor0, hashSet0, zzfhh0, zzdrw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        throw null;
    }
}

