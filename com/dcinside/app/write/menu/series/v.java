package com.dcinside.app.write.menu.series;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class v implements ActivityResultCallback {
    public final SeriesManageActivity a;

    public v(SeriesManageActivity seriesManageActivity0) {
        this.a = seriesManageActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        SeriesManageActivity.x2(this.a, ((ActivityResult)object0));
    }
}

