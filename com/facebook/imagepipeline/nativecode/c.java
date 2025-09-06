package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.transcoder.d;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @l
    @n
    public static final d a(int v, boolean z, boolean z1) {
        try {
            NativeJpegTranscoderFactory nativeJpegTranscoderFactory0 = new NativeJpegTranscoderFactory(v, z, z1);
            L.n(nativeJpegTranscoderFactory0, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return nativeJpegTranscoderFactory0;
        }
        catch(SecurityException securityException0) {
            throw new RuntimeException("Dependency \':native-imagetranscoder\' is needed to use the default native image transcoder.", securityException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new RuntimeException("Dependency \':native-imagetranscoder\' is needed to use the default native image transcoder.", illegalArgumentException0);
        }
    }
}

