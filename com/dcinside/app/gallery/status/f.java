package com.dcinside.app.gallery.status;

import rx.functions.b;

public final class f implements b {
    public final GalleryTransferActivity a;

    public f(GalleryTransferActivity galleryTransferActivity0) {
        this.a = galleryTransferActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        GalleryTransferActivity.T1(this.a, ((Throwable)object0));
    }
}

