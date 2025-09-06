package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbub;
import java.util.List;
import java.util.Map;

@KeepForSdk
@Deprecated
public final class ReportingInfo {
    @KeepForSdk
    @Deprecated
    public static final class Builder {
        private final zzbua zza;

        @KeepForSdk
        @Deprecated
        public Builder(@NonNull View view0) {
            zzbua zzbua0 = new zzbua();
            this.zza = zzbua0;
            zzbua0.zzb(view0);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder setAssetViews(@NonNull Map map0) {
            this.zza.zzc(map0);
            return this;
        }
    }

    private final zzbub zza;

    ReportingInfo(Builder reportingInfo$Builder0, zzb zzb0) {
        this.zza = new zzbub(reportingInfo$Builder0.zza);
    }

    @KeepForSdk
    @Deprecated
    public void recordClick(@NonNull List list0) {
        this.zza.zza(list0);
    }

    @KeepForSdk
    @Deprecated
    public void recordImpression(@NonNull List list0) {
        this.zza.zzb(list0);
    }

    @KeepForSdk
    @Deprecated
    public void reportTouchEvent(@NonNull MotionEvent motionEvent0) {
        this.zza.zzc(motionEvent0);
    }

    @KeepForSdk
    @Deprecated
    public void updateClickUrl(@NonNull Uri uri0, @NonNull UpdateClickUrlCallback updateClickUrlCallback0) {
        this.zza.zzd(uri0, updateClickUrlCallback0);
    }

    @KeepForSdk
    @Deprecated
    public void updateImpressionUrls(@NonNull List list0, @NonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        this.zza.zze(list0, updateImpressionUrlsCallback0);
    }
}

