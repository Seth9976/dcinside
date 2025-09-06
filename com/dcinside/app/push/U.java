package com.dcinside.app.push;

import rx.functions.b;

public final class u implements b {
    public final GalleryPushSettingActivity a;

    public u(GalleryPushSettingActivity galleryPushSettingActivity0) {
        this.a = galleryPushSettingActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        GalleryPushSettingActivity.B2(this.a, ((Throwable)object0));
    }
}

