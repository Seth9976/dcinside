package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.L;
import y4.l;

public final class ValidatingOffsetMappingKt {
    @l
    private static final OffsetMapping a;

    static {
        ValidatingOffsetMappingKt.a = new ValidatingOffsetMapping(OffsetMapping.a.a(), 0, 0);
    }

    @l
    public static final TransformedText a(@l VisualTransformation visualTransformation0, @l AnnotatedString annotatedString0) {
        L.p(visualTransformation0, "<this>");
        L.p(annotatedString0, "text");
        TransformedText transformedText0 = visualTransformation0.a(annotatedString0);
        return new TransformedText(transformedText0.b(), new ValidatingOffsetMapping(transformedText0.a(), annotatedString0.length(), transformedText0.b().length()));
    }

    @l
    public static final OffsetMapping b() {
        return ValidatingOffsetMappingKt.a;
    }
}

