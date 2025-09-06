package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

public final class ContentScale.Companion.Inside.1 implements ContentScale {
    @Override  // androidx.compose.ui.layout.ContentScale
    public long a(long v, long v1) {
        if(Size.t(v) <= Size.t(v1) && Size.m(v) <= Size.m(v1)) {
            return 0x3F8000003F800000L;
        }
        float f = ContentScaleKt.g(v, v1);
        return ScaleFactorKt.a(f, f);
    }
}

