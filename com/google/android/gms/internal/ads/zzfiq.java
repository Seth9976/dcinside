package com.google.android.gms.internal.ads;

import android.net.Uri.Builder;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzfiq {
    private final zzx zza;
    private final zzu zzb;
    private final zzgct zzc;
    @Nullable
    private final zzfir zzd;

    public zzfiq(zzx zzx0, zzu zzu0, zzgct zzgct0, @Nullable zzfir zzfir0) {
        this.zza = zzx0;
        this.zzb = zzu0;
        this.zzc = zzgct0;
        this.zzd = zzfir0;
    }

    // 检测为 Lambda 实现
    final zzt zza(String s) throws Exception [...]

    // 检测为 Lambda 实现
    final zzt zzb(String s) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzc(int v, long v1, String s, zzt zzt0) throws Exception [...]

    public final t0 zzd(String s) {
        try {
            return this.zze(s, 0L, 1);
        }
        catch(RejectedExecutionException | NullPointerException unused_ex) {
            return zzgch.zzh(zzt.zzb);
        }
    }

    private final t0 zze(String s, long v, int v1) {
        String s2;
        zzx zzx0 = this.zza;
        if(v1 > zzx0.zzc()) {
            zzfir zzfir0 = this.zzd;
            if(zzfir0 != null && zzx0.zzd()) {
                zzfir0.zza(s, "", 2);
                return zzgch.zzh(zzt.zzd);
            }
            return zzgch.zzh(zzt.zzc);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziv)).booleanValue()) {
            Uri uri0 = Uri.parse(s);
            String s1 = uri0.getEncodedQuery();
            Uri.Builder uri$Builder0 = uri0.buildUpon().clearQuery();
            uri$Builder0.appendQueryParameter("pa", Integer.toString(v1));
            s2 = uri$Builder0.build() + "&" + s1;
        }
        else {
            s2 = s;
        }
        zzfip zzfip0 = (zzt zzt0) -> {
            if(zzt0 != zzt.zzc) {
                return zzgch.zzh(zzt0);
            }
            zzx zzx0 = this.zza;
            long v2 = (long)zzx0.zzb();
            if(v1 != 1) {
                v2 = (long)(zzx0.zza() * ((double)v));
            }
            return this.zze(s, v2, v1 + 1);
        };
        if(v == 0L) {
            zzfio zzfio0 = () -> this.zzb.zza(s2);
            return zzgch.zzn(this.zzc.zzb(zzfio0), zzfip0, this.zzc);
        }
        zzfin zzfin0 = () -> this.zzb.zza(s2);
        return zzgch.zzn(this.zzc.zzc(zzfin0, v, TimeUnit.MILLISECONDS), zzfip0, this.zzc);
    }
}

