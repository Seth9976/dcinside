package com.facebook.imagepipeline.image;

import k1.n.a;
import k1.n;

@n(a.a)
public abstract class i extends com.facebook.imagepipeline.image.a {
    private static final String d = "CloseableImage";

    @Override
    protected void finalize() throws Throwable {
        if(this.isClosed()) {
            return;
        }
        x0.a.q0("CloseableImage", "finalize: %s %x still open.", new Object[]{this.getClass().getSimpleName(), System.identityHashCode(this)});
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }
}

