package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MediaContent;

@Deprecated
public class MediaView extends FrameLayout {
    public MediaView(@NonNull Context context0) {
        super(context0);
    }

    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @TargetApi(21)
    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
    }

    public void setMediaContent(@NonNull MediaContent mediaContent0) {
    }
}

