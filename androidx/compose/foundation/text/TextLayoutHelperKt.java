package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextLayoutHelperKt {
    public static final boolean a(@l TextLayoutResult textLayoutResult0, @l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l List list0, int v, boolean z, int v1, @l Density density0, @l LayoutDirection layoutDirection0, @l Resolver fontFamily$Resolver0, long v2) {
        L.p(textLayoutResult0, "$this$canReuse");
        L.p(annotatedString0, "text");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        TextLayoutInput textLayoutInput0 = textLayoutResult0.l();
        if(textLayoutResult0.w().i().c()) {
            return false;
        }
        if(!L.g(textLayoutInput0.n(), annotatedString0) || !textLayoutInput0.m().R(textStyle0) || !L.g(textLayoutInput0.i(), list0) || textLayoutInput0.g() != v || textLayoutInput0.l() != z || !TextOverflow.g(textLayoutInput0.h(), v1) || !L.g(textLayoutInput0.d(), density0) || textLayoutInput0.f() != layoutDirection0 || !L.g(textLayoutInput0.e(), fontFamily$Resolver0) || Constraints.r(v2) != Constraints.r(textLayoutInput0.c())) {
            return false;
        }
        return z || TextOverflow.g(v1, 2) ? Constraints.p(v2) == Constraints.p(textLayoutInput0.c()) && Constraints.o(v2) == Constraints.o(textLayoutInput0.c()) : true;
    }
}

