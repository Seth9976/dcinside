package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString.Builder;
import kotlin.jvm.internal.L;
import y4.l;

public final class InlineTextContentKt {
    @l
    public static final String a = "androidx.compose.foundation.text.inlineContent";
    @l
    private static final String b = "\uFFFD";

    public static final void a(@l Builder annotatedString$Builder0, @l String s, @l String s1) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(s, "id");
        L.p(s1, "alternateText");
        if(s1.length() <= 0) {
            throw new IllegalArgumentException("alternateText can\'t be an empty string.");
        }
        annotatedString$Builder0.p("androidx.compose.foundation.text.inlineContent", s);
        annotatedString$Builder0.l(s1);
        annotatedString$Builder0.n();
    }

    public static void b(Builder annotatedString$Builder0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "\uFFFD";
        }
        InlineTextContentKt.a(annotatedString$Builder0, s, s1);
    }
}

