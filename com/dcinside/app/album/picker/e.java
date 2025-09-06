package com.dcinside.app.album.picker;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class e implements ActivityResultCallback {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        PickerActivity.j2(this.a, ((ActivityResult)object0));
    }
}

