package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

@Deprecated
public final class NativeAdOptions {
    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        private boolean zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        private VideoOptions zze;
        private int zzf;
        private boolean zzg;

        public Builder() {
            this.zza = false;
            this.zzb = -1;
            this.zzc = 0;
            this.zzd = false;
            this.zzf = 1;
            this.zzg = false;
        }

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int v) {
            this.zzf = v;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageOrientation(int v) {
            this.zzb = v;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int v) {
            this.zzc = v;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzg = z;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.zzd = z;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.zza = z;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions0) {
            this.zze = videoOptions0;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final int zze;
    private final VideoOptions zzf;
    private final boolean zzg;

    NativeAdOptions(Builder nativeAdOptions$Builder0, zzd zzd0) {
        this.zza = nativeAdOptions$Builder0.zza;
        this.zzb = nativeAdOptions$Builder0.zzb;
        this.zzc = nativeAdOptions$Builder0.zzc;
        this.zzd = nativeAdOptions$Builder0.zzd;
        this.zze = nativeAdOptions$Builder0.zzf;
        this.zzf = nativeAdOptions$Builder0.zze;
        this.zzg = nativeAdOptions$Builder0.zzg;
    }

    public int getAdChoicesPlacement() {
        return this.zze;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.zzb;
    }

    public int getMediaAspectRatio() {
        return this.zzc;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zzf;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzd;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzg;
    }
}

