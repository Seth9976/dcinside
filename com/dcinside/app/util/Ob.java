package com.dcinside.app.util;

import com.dcinside.app.response.GalleryInfo;
import rx.functions.p;

public final class ob implements p {
    public final GalleryInfo a;

    public ob(GalleryInfo galleryInfo0) {
        this.a = galleryInfo0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.uu(this.a, ((String)object0));
    }
}

