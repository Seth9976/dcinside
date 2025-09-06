package com.google.android.gms.common.internal;

import O1.a;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;

@KeepForSdk
public class TelemetryLoggingOptions implements Optional {
    @KeepForSdk
    public static class Builder {
        @Nullable
        private String zaa;

        private Builder() {
        }

        Builder(zaac zaac0) {
        }

        @NonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setApi(@Nullable String s) {
            this.zaa = s;
            return this;
        }
    }

    @NonNull
    public static final TelemetryLoggingOptions zaa;
    @Nullable
    private final String zab;

    static {
        TelemetryLoggingOptions.zaa = TelemetryLoggingOptions.builder().build();
    }

    TelemetryLoggingOptions(String s, zaad zaad0) {
        this.zab = s;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof TelemetryLoggingOptions ? Objects.equal(this.zab, ((TelemetryLoggingOptions)object0).zab) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zab});
    }

    @NonNull
    public final Bundle zaa() {
        Bundle bundle0 = new Bundle();
        String s = this.zab;
        if(s != null) {
            bundle0.putString("api", s);
        }
        return bundle0;
    }
}

