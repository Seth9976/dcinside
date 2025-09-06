package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

final class zzbtu extends zzbyq {
    final QueryInfoGenerationCallback zza;

    zzbtu(zzbtv zzbtv0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        this.zza = queryInfoGenerationCallback0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzb(String s) {
        this.zza.onFailure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzc(String s, String s1, Bundle bundle0) {
        QueryInfo queryInfo0 = new QueryInfo(new zzfa(s, bundle0, s1));
        this.zza.onSuccess(queryInfo0);
    }
}

