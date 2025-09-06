package com.google.android.gms.ads.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import java.util.List;

public interface NativeCustomFormatAd {
    public interface DisplayOpenMeasurement {
        void setView(@NonNull View arg1);

        boolean start();
    }

    public interface OnCustomClickListener {
        void onCustomClick(@NonNull NativeCustomFormatAd arg1, @NonNull String arg2);
    }

    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(@NonNull NativeCustomFormatAd arg1);
    }

    @NonNull
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    void destroy();

    @Nullable
    List getAvailableAssetNames();

    @Nullable
    String getCustomFormatId();

    @NonNull
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @Nullable
    Image getImage(@NonNull String arg1);

    @Nullable
    MediaContent getMediaContent();

    @Nullable
    CharSequence getText(@NonNull String arg1);

    void performClick(@NonNull String arg1);

    void recordImpression();
}

