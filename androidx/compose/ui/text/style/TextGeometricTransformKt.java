package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextGeometricTransformKt {
    @l
    public static final TextGeometricTransform a(@l TextGeometricTransform textGeometricTransform0, @l TextGeometricTransform textGeometricTransform1, float f) {
        L.p(textGeometricTransform0, "start");
        L.p(textGeometricTransform1, "stop");
        return new TextGeometricTransform(MathHelpersKt.a(textGeometricTransform0.d(), textGeometricTransform1.d(), f), MathHelpersKt.a(textGeometricTransform0.e(), textGeometricTransform1.e(), f));
    }
}

