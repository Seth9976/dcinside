package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextFieldValueKt {
    @l
    public static final AnnotatedString a(@l TextFieldValue textFieldValue0) {
        L.p(textFieldValue0, "<this>");
        return textFieldValue0.f().p(textFieldValue0.h());
    }

    @l
    public static final AnnotatedString b(@l TextFieldValue textFieldValue0, int v) {
        L.p(textFieldValue0, "<this>");
        return textFieldValue0.f().o(TextRange.k(textFieldValue0.h()), Math.min(TextRange.k(textFieldValue0.h()) + v, textFieldValue0.i().length()));
    }

    @l
    public static final AnnotatedString c(@l TextFieldValue textFieldValue0, int v) {
        L.p(textFieldValue0, "<this>");
        return textFieldValue0.f().o(Math.max(0, TextRange.l(textFieldValue0.h()) - v), TextRange.l(textFieldValue0.h()));
    }
}

