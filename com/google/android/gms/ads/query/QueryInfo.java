package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbtv;

public class QueryInfo {
    private final zzfa zza;

    public QueryInfo(zzfa zzfa0) {
        this.zza = zzfa0;
    }

    public static void generate(@NonNull Context context0, @NonNull AdFormat adFormat0, @Nullable AdRequest adRequest0, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        QueryInfo.zza(context0, adFormat0, adRequest0, null, queryInfoGenerationCallback0);
    }

    public static void generate(@NonNull Context context0, @NonNull AdFormat adFormat0, @Nullable AdRequest adRequest0, @NonNull String s, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        QueryInfo.zza(context0, adFormat0, adRequest0, s, queryInfoGenerationCallback0);
    }

    @NonNull
    public String getQuery() {
        return this.zza.zzb();
    }

    @NonNull
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @NonNull
    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }

    private static void zza(Context context0, AdFormat adFormat0, @Nullable AdRequest adRequest0, @Nullable String s, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzj.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zza zza0 = new zza(context0, adFormat0, adRequest0, s, queryInfoGenerationCallback0);
            zzb.zzb.execute(zza0);
            return;
        }
        new zzbtv(context0, adFormat0, (adRequest0 == null ? null : adRequest0.zza()), s).zzb(queryInfoGenerationCallback0);
    }
}

