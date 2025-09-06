package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import y4.l;

final class VisualTransformation.Companion.None.1 implements VisualTransformation {
    public static final VisualTransformation.Companion.None.1 b;

    static {
        VisualTransformation.Companion.None.1.b = new VisualTransformation.Companion.None.1();
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    @l
    public final TransformedText a(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "text");
        return new TransformedText(annotatedString0, OffsetMapping.a.a());
    }
}

