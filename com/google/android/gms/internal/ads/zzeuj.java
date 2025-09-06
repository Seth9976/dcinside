package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.t0;

public final class zzeuj implements zzgbo {
    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        if(((GetTopicsResponse)object0) == null) {
            return zzgch.zzh(new zzeun("", 1, null));
        }
        zzhbb zzhbb0 = zzhbc.zzc();
        for(Object object1: ((GetTopicsResponse)object0).a()) {
            zzhaz zzhaz0 = zzhba.zzc();
            zzhaz0.zzc(((Topic)object1).c());
            zzhaz0.zza(((Topic)object1).a());
            zzhaz0.zzb(((Topic)object1).b());
            zzhbb0.zza(((zzhba)zzhaz0.zzbn()));
        }
        return zzgch.zzh(new zzeun(Base64.encodeToString(((zzhbc)zzhbb0.zzbn()).zzaV(), 1), 1, null));
    }
}

