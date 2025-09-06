package com.facebook.imagepipeline.core;

import android.net.Uri;
import com.facebook.cache.common.e;
import com.facebook.common.internal.o;

public final class v implements o {
    public final Uri a;

    public v(Uri uri0) {
        this.a = uri0;
    }

    @Override  // com.facebook.common.internal.o
    public final boolean apply(Object object0) {
        return x.g0(this.a, ((e)object0));
    }
}

