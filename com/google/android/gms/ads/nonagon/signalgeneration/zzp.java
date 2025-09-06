package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzdsb;

public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdsb zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze;
    @Nullable
    private final Boolean zzf;

    public zzp(zzo zzo0, boolean z, int v, @Nullable Boolean boolean0, zzdsb zzdsb0) {
        this.zza = zzo0;
        this.zzc = z;
        this.zzd = v;
        this.zzf = boolean0;
        this.zzb = zzdsb0;
        this.zze = zzv.zzC().currentTimeMillis();
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String s) {
        Pair[] arr_pair = {new Pair("sgf_reason", s), new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", "6"), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(this.zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", (this.zzc ? "1" : "0"))};
        zzaa.zzd(this.zzb, null, "sgpcf", arr_pair);
        zzq zzq0 = new zzq(null, s, zzp.zza(), this.zzd);
        this.zza.zzf(this.zzc, zzq0);
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo0) {
        Pair[] arr_pair = {new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", "6"), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(this.zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", (this.zzc ? "1" : "0"))};
        zzaa.zzd(this.zzb, null, "sgpcs", arr_pair);
        zzq zzq0 = new zzq(queryInfo0, "", zzp.zza(), this.zzd);
        this.zza.zzf(this.zzc, zzq0);
    }

    private static long zza() {
        return zzv.zzC().currentTimeMillis() + ((long)(((Long)zzbeq.zzf.zze())));
    }

    private final long zzb() {
        return zzv.zzC().currentTimeMillis() - this.zze;
    }
}

