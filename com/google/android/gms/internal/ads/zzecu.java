package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest.Builder;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.t0;

public final class zzecu {
    private final Context zza;

    zzecu(Context context0) {
        this.zza = context0;
    }

    public final t0 zza(boolean z) {
        try {
            GetTopicsRequest getTopicsRequest0 = new Builder().b("com.google.android.gms.ads").c(z).a();
            TopicsManagerFutures topicsManagerFutures0 = TopicsManagerFutures.a(this.zza);
            return topicsManagerFutures0 == null ? zzgch.zzg(new IllegalStateException()) : topicsManagerFutures0.b(getTopicsRequest0);
        }
        catch(Exception exception0) {
            return zzgch.zzg(exception0);
        }
    }
}

