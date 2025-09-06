package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.f;
import com.facebook.common.memory.e;
import k1.n.a;
import k1.n;
import p3.d;

@f
@n(a.a)
@d
public class NativeMemoryChunkPool extends D {
    @f
    public NativeMemoryChunkPool(e e0, O o0, P p0) {
        super(e0, o0, p0);
    }

    @Override  // com.facebook.imagepipeline.memory.D
    protected C P(int v) {
        return this.U(v);
    }

    protected NativeMemoryChunk U(int v) {
        return new NativeMemoryChunk(v);
    }

    @Override  // com.facebook.imagepipeline.memory.D
    protected Object g(int v) {
        return this.U(v);
    }
}

