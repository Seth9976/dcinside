package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class ParagraphStyleKt {
    private static final long a;

    static {
        ParagraphStyleKt.a = 0x7FC00000L;
    }

    @Stable
    @l
    public static final ParagraphStyle a(@l ParagraphStyle paragraphStyle0, @l ParagraphStyle paragraphStyle1, float f) {
        L.p(paragraphStyle0, "start");
        L.p(paragraphStyle1, "stop");
        return new ParagraphStyle(((TextAlign)SpanStyleKt.c(paragraphStyle0.p(), paragraphStyle1.p(), f)), ((TextDirection)SpanStyleKt.c(paragraphStyle0.r(), paragraphStyle1.r(), f)), SpanStyleKt.e(paragraphStyle0.m(), paragraphStyle1.m(), f), TextIndentKt.a((paragraphStyle0.s() == null ? TextIndent.c.a() : paragraphStyle0.s()), (paragraphStyle1.s() == null ? TextIndent.c.a() : paragraphStyle1.s()), f), ParagraphStyleKt.b(paragraphStyle0.o(), paragraphStyle1.o(), f), ((LineHeightStyle)SpanStyleKt.c(paragraphStyle0.n(), paragraphStyle1.n(), f)), ((LineBreak)SpanStyleKt.c(paragraphStyle0.k(), paragraphStyle1.k(), f)), ((Hyphens)SpanStyleKt.c(paragraphStyle0.i(), paragraphStyle1.i(), f)), ((TextMotion)SpanStyleKt.c(paragraphStyle0.t(), paragraphStyle1.t(), f)), null);
    }

    private static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle0, PlatformParagraphStyle platformParagraphStyle1, float f) {
        if(platformParagraphStyle0 == null && platformParagraphStyle1 == null) {
            return null;
        }
        if(platformParagraphStyle0 == null) {
            platformParagraphStyle0 = PlatformParagraphStyle.c.a();
        }
        if(platformParagraphStyle1 == null) {
            platformParagraphStyle1 = PlatformParagraphStyle.c.a();
        }
        return AndroidTextStyle_androidKt.b(platformParagraphStyle0, platformParagraphStyle1, f);
    }

    @l
    public static final ParagraphStyle c(@l ParagraphStyle paragraphStyle0, @l LayoutDirection layoutDirection0) {
        L.p(paragraphStyle0, "style");
        L.p(layoutDirection0, "direction");
        TextAlign textAlign0 = TextAlign.g(paragraphStyle0.q());
        TextDirection textDirection0 = TextDirection.f(TextStyleKt.e(layoutDirection0, paragraphStyle0.r()));
        TextIndent textIndent0 = paragraphStyle0.s() == null ? TextIndent.c.a() : paragraphStyle0.s();
        return new ParagraphStyle(textAlign0, textDirection0, (TextUnitKt.s(paragraphStyle0.m()) ? ParagraphStyleKt.a : paragraphStyle0.m()), textIndent0, paragraphStyle0.o(), paragraphStyle0.n(), LineBreak.d(paragraphStyle0.l()), Hyphens.c(paragraphStyle0.j()), (paragraphStyle0.t() == null ? TextMotion.c.b() : paragraphStyle0.t()), null);
    }
}

