package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzga;

public final class VideoOptions {
    public static final class Builder {
        private boolean zza;
        private boolean zzb;
        private boolean zzc;

        public Builder() {
            this.zza = true;
            this.zzb = false;
            this.zzc = false;
        }

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    VideoOptions(Builder videoOptions$Builder0, zzj zzj0) {
        this.zza = videoOptions$Builder0.zza;
        this.zzb = videoOptions$Builder0.zzb;
        this.zzc = videoOptions$Builder0.zzc;
    }

    public VideoOptions(zzga zzga0) {
        this.zza = zzga0.zza;
        this.zzb = zzga0.zzb;
        this.zzc = zzga0.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}

