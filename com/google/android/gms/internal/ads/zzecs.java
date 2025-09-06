package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.t0;
import j..util.Objects;

public final class zzecs {
    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzecs(Context context0) {
        this.zzb = context0;
    }

    public final t0 zza() {
        try {
            MeasurementManagerFutures measurementManagerFutures0 = MeasurementManagerFutures.b(this.zzb);
            this.zza = measurementManagerFutures0;
            return measurementManagerFutures0 == null ? zzgch.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFutures0.c();
        }
        catch(Exception exception0) {
            return zzgch.zzg(exception0);
        }
    }

    public final t0 zzb(Uri uri0, InputEvent inputEvent0) {
        try {
            MeasurementManagerFutures measurementManagerFutures0 = this.zza;
            Objects.requireNonNull(measurementManagerFutures0);
            return measurementManagerFutures0.d(uri0, inputEvent0);
        }
        catch(Exception exception0) {
            return zzgch.zzg(exception0);
        }
    }
}

