package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbtv {
    private static zzbyu zza;
    private final Context zzb;
    private final AdFormat zzc;
    @Nullable
    private final zzei zzd;
    @Nullable
    private final String zze;

    public zzbtv(Context context0, AdFormat adFormat0, @Nullable zzei zzei0, @Nullable String s) {
        this.zzb = context0;
        this.zzc = adFormat0;
        this.zzd = zzei0;
        this.zze = s;
    }

    @Nullable
    public static zzbyu zza(Context context0) {
        synchronized(zzbtv.class) {
            if(zzbtv.zza == null) {
                zzbtv.zza = zzbc.zza().zzt(context0, new zzbpa());
            }
            return zzbtv.zza;
        }
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        zzm zzm0;
        long v = System.currentTimeMillis();
        zzbyu zzbyu0 = zzbtv.zza(this.zzb);
        if(zzbyu0 == null) {
            queryInfoGenerationCallback0.onFailure("Internal Error, query info generator is null.");
            return;
        }
        zzei zzei0 = this.zzd;
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzb);
        if(zzei0 == null) {
            zzn zzn0 = new zzn();
            zzn0.zzg(v);
            zzm0 = zzn0.zza();
        }
        else {
            zzei0.zzq(v);
            zzm0 = zzr.zza.zza(this.zzb, this.zzd);
        }
        zzbyy zzbyy0 = new zzbyy(this.zze, this.zzc.name(), null, zzm0, 0, null);
        try {
            zzbyu0.zzf(iObjectWrapper0, zzbyy0, new zzbtu(this, queryInfoGenerationCallback0));
        }
        catch(RemoteException unused_ex) {
            queryInfoGenerationCallback0.onFailure("Internal Error.");
        }
    }
}

