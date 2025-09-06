package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;

@Deprecated
public abstract class NativeAd {
    @Deprecated
    public static abstract class AdChoicesInfo {
        @NonNull
        public abstract List getImages();

        @NonNull
        public abstract CharSequence getText();
    }

    @Deprecated
    public static abstract class Image {
        @NonNull
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @NonNull
        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    @NonNull
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    @Deprecated
    public abstract void performClick(@NonNull Bundle arg1);

    @Deprecated
    public abstract boolean recordImpression(@NonNull Bundle arg1);

    @Deprecated
    public abstract void reportTouchEvent(@NonNull Bundle arg1);
}

