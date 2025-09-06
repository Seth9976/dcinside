package com.facebook.imagepipeline.nativecode;

import X0.b;
import com.facebook.common.internal.f;
import com.facebook.imagepipeline.transcoder.c;
import com.facebook.imagepipeline.transcoder.d;
import k1.n.a;
import k1.n;
import o3.h;

@f
@n(a.a)
public class NativeJpegTranscoderFactory implements d {
    private final int a;
    private final boolean b;
    private final boolean c;

    @f
    public NativeJpegTranscoderFactory(int v, boolean z, boolean z1) {
        this.a = v;
        this.b = z;
        this.c = z1;
    }

    @Override  // com.facebook.imagepipeline.transcoder.d
    @f
    @h
    public c createImageTranscoder(X0.c c0, boolean z) {
        return c0 != b.b ? null : new NativeJpegTranscoder(z, this.a, this.b, this.c);
    }
}

