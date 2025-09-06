package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzcli implements zzgbo {
    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkn)).booleanValue()) {
            zzv.zzp().zzx(((Throwable)object0), "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
            return zzgch.zzh(new GetTopicsResponse(zzfxn.zzn()));
        }
        zzv.zzp().zzv(((Throwable)object0), "GetTopicsApiWithRecordObservationActionHandler");
        return zzgch.zzh(new GetTopicsResponse(zzfxn.zzn()));
    }
}

