package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@Immutable
@ExperimentalTextApi
public final class TextMeasurer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final TextLayoutResult b(TextLayoutInput textLayoutInput0) {
            MultiParagraphIntrinsics multiParagraphIntrinsics0 = new MultiParagraphIntrinsics(textLayoutInput0.n(), TextStyleKt.d(textLayoutInput0.m(), textLayoutInput0.f()), textLayoutInput0.i(), textLayoutInput0.d(), textLayoutInput0.e());
            int v = Constraints.r(textLayoutInput0.c());
            int v1 = !textLayoutInput0.l() && !TextOverflow.g(textLayoutInput0.h(), 2) || !Constraints.j(textLayoutInput0.c()) ? 0x7FFFFFFF : Constraints.p(textLayoutInput0.c());
            int v2 = textLayoutInput0.l() || !TextOverflow.g(textLayoutInput0.h(), 2) ? textLayoutInput0.g() : 1;
            if(v != v1) {
                v1 = s.I(ParagraphKt.k(multiParagraphIntrinsics0.b()), v, v1);
            }
            MultiParagraph multiParagraph0 = new MultiParagraph(multiParagraphIntrinsics0, ConstraintsKt.b(0, v1, 0, Constraints.o(textLayoutInput0.c()), 5, null), v2, TextOverflow.g(textLayoutInput0.h(), 2), null);
            return new TextLayoutResult(textLayoutInput0, multiParagraph0, ConstraintsKt.d(textLayoutInput0.c(), IntSizeKt.a(((int)(((float)Math.ceil(multiParagraph0.E())))), ((int)(((float)Math.ceil(multiParagraph0.g())))))), null);
        }
    }

    @l
    private final Resolver a;
    @l
    private final Density b;
    @l
    private final LayoutDirection c;
    private final int d;
    @m
    private final TextLayoutCache e;
    @l
    public static final Companion f;
    public static final int g;

    static {
        TextMeasurer.f = new Companion(null);
    }

    public TextMeasurer(@l Resolver fontFamily$Resolver0, @l Density density0, @l LayoutDirection layoutDirection0, int v) {
        L.p(fontFamily$Resolver0, "fallbackFontFamilyResolver");
        L.p(density0, "fallbackDensity");
        L.p(layoutDirection0, "fallbackLayoutDirection");
        super();
        this.a = fontFamily$Resolver0;
        this.b = density0;
        this.c = layoutDirection0;
        this.d = v;
        this.e = v <= 0 ? null : new TextLayoutCache(v);
    }

    public TextMeasurer(Resolver fontFamily$Resolver0, Density density0, LayoutDirection layoutDirection0, int v, int v1, w w0) {
        if((v1 & 8) != 0) {
            v = 8;
        }
        this(fontFamily$Resolver0, density0, layoutDirection0, v);
    }

    @Stable
    @l
    public final TextLayoutResult a(@l String s, @l TextStyle textStyle0, int v, boolean z, int v1, long v2, @l LayoutDirection layoutDirection0, @l Density density0, @l Resolver fontFamily$Resolver0, boolean z1) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        return TextMeasurer.d(this, new AnnotatedString(s, null, null, 6, null), textStyle0, v, z, v1, null, v2, layoutDirection0, density0, fontFamily$Resolver0, z1, 0x20, null);
    }

    public static TextLayoutResult b(TextMeasurer textMeasurer0, String s, TextStyle textStyle0, int v, boolean z, int v1, long v2, LayoutDirection layoutDirection0, Density density0, Resolver fontFamily$Resolver0, boolean z1, int v3, Object object0) {
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : TextStyle.d.a();
        int v4 = (v3 & 4) == 0 ? v : 1;
        boolean z2 = (v3 & 8) == 0 ? z : true;
        int v5 = (v3 & 16) == 0 ? v1 : 0x7FFFFFFF;
        long v6 = (v3 & 0x20) == 0 ? v2 : ConstraintsKt.b(0, 0, 0, 0, 15, null);
        LayoutDirection layoutDirection1 = (v3 & 0x40) == 0 ? layoutDirection0 : textMeasurer0.c;
        Density density1 = (v3 & 0x80) == 0 ? density0 : textMeasurer0.b;
        Resolver fontFamily$Resolver1 = (v3 & 0x100) == 0 ? fontFamily$Resolver0 : textMeasurer0.a;
        return (v3 & 0x200) == 0 ? textMeasurer0.a(s, textStyle1, v4, z2, v5, v6, layoutDirection1, density1, fontFamily$Resolver1, z1) : textMeasurer0.a(s, textStyle1, v4, z2, v5, v6, layoutDirection1, density1, fontFamily$Resolver1, false);
    }

    @Stable
    @l
    public final TextLayoutResult c(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, int v, boolean z, int v1, @l List list0, long v2, @l LayoutDirection layoutDirection0, @l Density density0, @l Resolver fontFamily$Resolver0, boolean z1) {
        TextLayoutResult textLayoutResult0;
        L.p(annotatedString0, "text");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        TextLayoutInput textLayoutInput0 = new TextLayoutInput(annotatedString0, textStyle0, list0, v1, z, v, density0, layoutDirection0, fontFamily$Resolver0, v2, null);
        if(z1) {
            textLayoutResult0 = null;
        }
        else {
            TextLayoutCache textLayoutCache0 = this.e;
            textLayoutResult0 = textLayoutCache0 == null ? null : textLayoutCache0.a(textLayoutInput0);
        }
        if(textLayoutResult0 != null) {
            return textLayoutResult0.a(textLayoutInput0, ConstraintsKt.d(v2, IntSizeKt.a(ParagraphKt.k(textLayoutResult0.w().E()), ParagraphKt.k(textLayoutResult0.w().g()))));
        }
        TextLayoutResult textLayoutResult1 = TextMeasurer.f.b(textLayoutInput0);
        TextLayoutCache textLayoutCache1 = this.e;
        if(textLayoutCache1 != null) {
            textLayoutCache1.b(textLayoutInput0, textLayoutResult1);
        }
        return textLayoutResult1;
    }

    public static TextLayoutResult d(TextMeasurer textMeasurer0, AnnotatedString annotatedString0, TextStyle textStyle0, int v, boolean z, int v1, List list0, long v2, LayoutDirection layoutDirection0, Density density0, Resolver fontFamily$Resolver0, boolean z1, int v3, Object object0) {
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : TextStyle.d.a();
        int v4 = (v3 & 4) == 0 ? v : 1;
        boolean z2 = (v3 & 8) == 0 ? z : true;
        int v5 = (v3 & 16) == 0 ? v1 : 0x7FFFFFFF;
        List list1 = (v3 & 0x20) == 0 ? list0 : u.H();
        long v6 = (v3 & 0x40) == 0 ? v2 : ConstraintsKt.b(0, 0, 0, 0, 15, null);
        LayoutDirection layoutDirection1 = (v3 & 0x80) == 0 ? layoutDirection0 : textMeasurer0.c;
        Density density1 = (v3 & 0x100) == 0 ? density0 : textMeasurer0.b;
        Resolver fontFamily$Resolver1 = (v3 & 0x200) == 0 ? fontFamily$Resolver0 : textMeasurer0.a;
        return (v3 & 0x400) == 0 ? textMeasurer0.c(annotatedString0, textStyle1, v4, z2, v5, list1, v6, layoutDirection1, density1, fontFamily$Resolver1, z1) : textMeasurer0.c(annotatedString0, textStyle1, v4, z2, v5, list1, v6, layoutDirection1, density1, fontFamily$Resolver1, false);
    }
}

