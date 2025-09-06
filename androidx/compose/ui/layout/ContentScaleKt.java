package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

public final class ContentScaleKt {
    private static final float e(long v, long v1) {
        return Size.m(v1) / Size.m(v);
    }

    private static final float f(long v, long v1) {
        return Math.max(ContentScaleKt.h(v, v1), ContentScaleKt.e(v, v1));
    }

    private static final float g(long v, long v1) {
        return Math.min(ContentScaleKt.h(v, v1), ContentScaleKt.e(v, v1));
    }

    private static final float h(long v, long v1) {
        return Size.t(v1) / Size.t(v);
    }
}

