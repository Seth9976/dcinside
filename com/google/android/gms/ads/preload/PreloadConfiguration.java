package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

public class PreloadConfiguration {
    public static class Builder {
        private final String zza;
        private final AdFormat zzb;
        private AdRequest zzc;
        private int zzd;

        public Builder(@NonNull String s, @NonNull AdFormat adFormat0) {
            this.zzc = new com.google.android.gms.ads.AdRequest.Builder().build();
            this.zza = s;
            this.zzb = adFormat0;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest0) {
            this.zzc = adRequest0;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int v) {
            this.zzd = v;
            return this;
        }
    }

    private final String zza;
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    PreloadConfiguration(Builder preloadConfiguration$Builder0, zza zza0) {
        this.zza = preloadConfiguration$Builder0.zza;
        this.zzb = preloadConfiguration$Builder0.zzb;
        this.zzc = preloadConfiguration$Builder0.zzc;
        this.zzd = preloadConfiguration$Builder0.zzd;
    }

    @NonNull
    public AdFormat getAdFormat() {
        return this.zzb;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.zzc;
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}

