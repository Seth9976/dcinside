package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextIndentKt {
    @l
    public static final TextIndent a(@l TextIndent textIndent0, @l TextIndent textIndent1, float f) {
        L.p(textIndent0, "start");
        L.p(textIndent1, "stop");
        return new TextIndent(SpanStyleKt.e(textIndent0.d(), textIndent1.d(), f), SpanStyleKt.e(textIndent0.e(), textIndent1.e(), f), null);
    }
}

