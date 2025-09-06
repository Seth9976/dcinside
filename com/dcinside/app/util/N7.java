package com.dcinside.app.util;

import com.dcinside.app.response.GalleryInfo;
import rx.functions.p;

public final class n7 implements p {
    public final GalleryInfo a;

    public n7(GalleryInfo galleryInfo0) {
        this.a = galleryInfo0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.sC(this.a, ((String)object0));
    }
}

