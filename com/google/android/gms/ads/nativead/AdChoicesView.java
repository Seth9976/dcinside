package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

public class AdChoicesView extends RelativeLayout {
    public AdChoicesView(@NonNull Context context0) {
        super(context0);
    }

    public AdChoicesView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public AdChoicesView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @TargetApi(21)
    public AdChoicesView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }
}

