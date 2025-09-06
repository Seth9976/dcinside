package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzei;
import java.util.List;
import java.util.Set;

public class AdRequest {
    public static class Builder extends AbstractAdRequestBuilder {
        @NonNull
        public AdRequest build() {
            return new AdRequest(this);
        }

        @Override  // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final AbstractAdRequestBuilder self() {
            return this;
        }

        @NonNull
        public Builder self() [...] // Inlined contents
    }

    @NonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 0x200;
    protected final zzei zza;

    protected AdRequest(@NonNull AbstractAdRequestBuilder abstractAdRequestBuilder0) {
        this.zza = new zzei(abstractAdRequestBuilder0.zza, null);
    }

    @Nullable
    public String getAdString() {
        return this.zza.zzj();
    }

    @NonNull
    public String getContentUrl() {
        return this.zza.zzk();
    }

    @Nullable
    @Deprecated
    public Bundle getCustomEventExtrasBundle(@NonNull Class class0) {
        return this.zza.zzd(class0);
    }

    @NonNull
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @NonNull
    public Set getKeywords() {
        return this.zza.zzp();
    }

    @NonNull
    public List getNeighboringContentUrls() {
        return this.zza.zzn();
    }

    @Nullable
    public Bundle getNetworkExtrasBundle(@NonNull Class class0) {
        return this.zza.zzf(class0);
    }

    @NonNull
    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(@NonNull Context context0) {
        return this.zza.zzs(context0);
    }

    public final zzei zza() {
        return this.zza;
    }
}

