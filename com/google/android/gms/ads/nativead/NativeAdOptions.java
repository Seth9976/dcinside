package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

public final class NativeAdOptions {
    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        private boolean zza;
        private int zzb;
        private boolean zzc;
        private VideoOptions zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private int zzh;
        private int zzi;

        public Builder() {
            this.zza = false;
            this.zzb = 0;
            this.zzc = false;
            this.zze = 1;
            this.zzf = false;
            this.zzg = false;
            this.zzh = 0;
            this.zzi = 1;
        }

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        @NonNull
        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int v, boolean z) {
            this.zzg = z;
            this.zzh = v;
            return this;
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int v) {
            this.zze = v;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int v) {
            this.zzb = v;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzf = z;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.zzc = z;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.zza = z;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions0) {
            this.zzd = videoOptions0;
            return this;
        }

        @NonNull
        public final Builder zzi(int v) {
            this.zzi = v;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public @interface SwipeGestureDirection {
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    NativeAdOptions(Builder nativeAdOptions$Builder0, zza zza0) {
        this.zza = nativeAdOptions$Builder0.zza;
        this.zzb = nativeAdOptions$Builder0.zzb;
        this.zzc = nativeAdOptions$Builder0.zzc;
        this.zzd = nativeAdOptions$Builder0.zze;
        this.zze = nativeAdOptions$Builder0.zzd;
        this.zzf = nativeAdOptions$Builder0.zzf;
        this.zzg = nativeAdOptions$Builder0.zzg;
        this.zzh = nativeAdOptions$Builder0.zzh;
        this.zzi = nativeAdOptions$Builder0.zzi;
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final boolean zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzi;
    }
}

