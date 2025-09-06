package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

public final class FontWeightKt {
    @l
    public static final FontWeight a(@l FontWeight fontWeight0, @l FontWeight fontWeight1, float f) {
        L.p(fontWeight0, "start");
        L.p(fontWeight1, "stop");
        return new FontWeight(s.I(MathHelpersKt.b(fontWeight0.w(), fontWeight1.w(), f), 1, 1000));
    }
}

