package com.facebook.fresco.animation.factory;

import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.decoder.c;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.image.r;

public final class a implements c {
    public final AnimatedFactoryV2Impl a;

    public a(AnimatedFactoryV2Impl animatedFactoryV2Impl0) {
        this.a = animatedFactoryV2Impl0;
    }

    @Override  // com.facebook.imagepipeline.decoder.c
    public final e a(l l0, int v, r r0, d d0) {
        return this.a.q(l0, v, r0, d0);
    }
}

