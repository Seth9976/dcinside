package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

final class zzeu extends zzdk {
    private zzeu() {
        throw null;
    }

    zzeu(zzew zzew0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(@Nullable zze zze0) {
        OnAdInspectorClosedListener onAdInspectorClosedListener0 = zzex.zzf().zzj;
        if(onAdInspectorClosedListener0 != null) {
            onAdInspectorClosedListener0.onAdInspectorClosed((zze0 == null ? null : new AdInspectorError(zze0.zza, zze0.zzb, zze0.zzc)));
        }
    }
}

