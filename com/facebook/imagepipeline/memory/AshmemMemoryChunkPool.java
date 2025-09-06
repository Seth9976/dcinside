package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import com.facebook.common.internal.f;
import com.facebook.common.memory.e;
import k1.n.a;
import k1.n;
import p3.d;

@TargetApi(27)
@f
@n(a.a)
@d
public class AshmemMemoryChunkPool extends D {
    @f
    public AshmemMemoryChunkPool(e e0, O o0, P p0) {
        super(e0, o0, p0);
    }

    @Override  // com.facebook.imagepipeline.memory.D
    public C P(int v) {
        return this.U(v);
    }

    public com.facebook.imagepipeline.memory.f U(int v) {
        return new com.facebook.imagepipeline.memory.f(v);
    }

    @Override  // com.facebook.imagepipeline.memory.D
    public Object g(int v) {
        return this.U(v);
    }
}

