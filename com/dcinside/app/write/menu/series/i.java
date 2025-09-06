package com.dcinside.app.write.menu.series;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class i implements ActivityResultCallback {
    public final SeriesListActivity a;

    public i(SeriesListActivity seriesListActivity0) {
        this.a = seriesListActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        SeriesListActivity.e2(this.a, ((ActivityResult)object0));
    }
}

