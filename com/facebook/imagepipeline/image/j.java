package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.references.h;
import k1.n.a;
import k1.n;

@n(a.a)
class j extends b {
    private static final String j = "DefaultCloseableStaticBitmap";

    protected j(Bitmap bitmap0, h h0, r r0, int v, int v1) {
        super(bitmap0, h0, r0, v, v1);
    }

    protected j(com.facebook.common.references.a a0, r r0, int v, int v1) {
        super(a0, r0, v, v1);
    }

    @Override
    protected void finalize() throws Throwable {
        if(this.isClosed()) {
            return;
        }
        x0.a.q0("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", new Object[]{this.getClass().getSimpleName(), System.identityHashCode(this)});
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }
}

