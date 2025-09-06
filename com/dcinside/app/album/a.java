package com.dcinside.app.album;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class a implements ActivityResultCallback {
    public final AlbumActivity a;

    public a(AlbumActivity albumActivity0) {
        this.a = albumActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        AlbumActivity.O1(this.a, ((ActivityResult)object0));
    }
}

