package com.dcinside.app.album;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class b implements ActivityResultCallback {
    public final AlbumActivity a;

    public b(AlbumActivity albumActivity0) {
        this.a = albumActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        AlbumActivity.P1(this.a, ((ActivityResult)object0));
    }
}

