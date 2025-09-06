package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class PAGMediaView extends FrameLayout {
    protected Integer PjT;

    public PAGMediaView(@NonNull Context context0) {
        super(context0);
    }

    public PAGMediaView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public PAGMediaView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @RequiresApi(api = 21)
    public PAGMediaView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    public void close() {
    }

    public void setMrcTrackerKey(Integer integer0) {
        this.PjT = integer0;
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener0) {
    }
}

