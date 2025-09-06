package com.dcinside.app.settings.image.list;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class b implements ActivityResultCallback {
    public final DefaultImageListActivity a;

    public b(DefaultImageListActivity defaultImageListActivity0) {
        this.a = defaultImageListActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        DefaultImageListActivity.R1(this.a, ((ActivityResult)object0));
    }
}

