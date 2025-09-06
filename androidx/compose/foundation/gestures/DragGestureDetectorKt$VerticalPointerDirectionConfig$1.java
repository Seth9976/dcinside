package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;

public final class DragGestureDetectorKt.VerticalPointerDirectionConfig.1 implements PointerDirectionConfig {
    @Override  // androidx.compose.foundation.gestures.PointerDirectionConfig
    public float a(long v) {
        return Offset.r(v);
    }

    @Override  // androidx.compose.foundation.gestures.PointerDirectionConfig
    public long b(float f, float f1) {
        return OffsetKt.a(f1, f);
    }

    @Override  // androidx.compose.foundation.gestures.PointerDirectionConfig
    public float c(long v) {
        return Offset.p(v);
    }
}

