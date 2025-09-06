package com.dcinside.app.gallery.status;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class p implements ActivityResultCallback {
    public final MyGalleryStatusActivity a;

    public p(MyGalleryStatusActivity myGalleryStatusActivity0) {
        this.a = myGalleryStatusActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        MyGalleryStatusActivity.N1(this.a, ((ActivityResult)object0));
    }
}

