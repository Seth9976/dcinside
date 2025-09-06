package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

public class ServerSideVerificationOptions {
    public static final class Builder {
        private String zza;
        private String zzb;

        public Builder() {
            this.zza = "";
            this.zzb = "";
        }

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @NonNull
        public Builder setCustomData(@NonNull String s) {
            this.zzb = s;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String s) {
            this.zza = s;
            return this;
        }
    }

    private final String zza;
    private final String zzb;

    ServerSideVerificationOptions(Builder serverSideVerificationOptions$Builder0, zzd zzd0) {
        this.zza = serverSideVerificationOptions$Builder0.zza;
        this.zzb = serverSideVerificationOptions$Builder0.zzb;
    }

    @NonNull
    public String getCustomData() {
        return this.zzb;
    }

    @NonNull
    public String getUserId() {
        return this.zza;
    }
}

