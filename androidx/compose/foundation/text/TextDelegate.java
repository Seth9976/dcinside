package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
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

@InternalFoundationTextApi
@Stable
public final class TextDelegate {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void a(@l Canvas canvas0, @l TextLayoutResult textLayoutResult0) {
            L.p(canvas0, "canvas");
            L.p(textLayoutResult0, "textLayoutResult");
            TextPainter.a.a(canvas0, textLayoutResult0);
        }
    }

    @l
    private final AnnotatedString a;
    @l
    private final TextStyle b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    @l
    private final Density g;
    @l
    private final Resolver h;
    @l
    private final List i;
    @m
    private MultiParagraphIntrinsics j;
    @m
    private LayoutDirection k;
    @l
    public static final Companion l;
    public static final int m;

    static {
        TextDelegate.l = new Companion(null);
    }

    private TextDelegate(AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, boolean z, int v2, Density density0, Resolver fontFamily$Resolver0, List list0) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = v2;
        this.g = density0;
        this.h = fontFamily$Resolver0;
        this.i = list0;
        if(v <= 0 || v1 <= 0 || v1 > v) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public TextDelegate(AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, boolean z, int v2, Density density0, Resolver fontFamily$Resolver0, List list0, int v3, w w0) {
        this(annotatedString0, textStyle0, ((v3 & 4) == 0 ? v : 0x7FFFFFFF), ((v3 & 8) == 0 ? v1 : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v2 : 1), density0, fontFamily$Resolver0, ((v3 & 0x100) == 0 ? list0 : u.H()), null);
    }

    public TextDelegate(AnnotatedString annotatedString0, TextStyle textStyle0, int v, int v1, boolean z, int v2, Density density0, Resolver fontFamily$Resolver0, List list0, w w0) {
        this(annotatedString0, textStyle0, v, v1, z, v2, density0, fontFamily$Resolver0, list0);
    }

    @l
    public final Density a() {
        return this.g;
    }

    @l
    public final Resolver b() {
        return this.h;
    }

    @m
    public final LayoutDirection c() {
        return this.k;
    }

    public final int d() {
        return TextDelegateKt.a(this.h().b());
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return TextDelegateKt.a(this.h().a());
    }

    public final int g() {
        return this.d;
    }

    private final MultiParagraphIntrinsics h() {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        return multiParagraphIntrinsics0;
    }

    public final int i() {
        return this.f;
    }

    @m
    public final MultiParagraphIntrinsics j() {
        return this.j;
    }

    @l
    public final List k() {
        return this.i;
    }

    public final boolean l() {
        return this.e;
    }

    @l
    public final TextStyle m() {
        return this.b;
    }

    @l
    public final AnnotatedString n() {
        return this.a;
    }

    @l
    public final TextLayoutResult o(long v, @l LayoutDirection layoutDirection0, @m TextLayoutResult textLayoutResult0) {
        L.p(layoutDirection0, "layoutDirection");
        if(textLayoutResult0 != null && TextLayoutHelperKt.a(textLayoutResult0, this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection0, this.h, v)) {
            return textLayoutResult0.a(new TextLayoutInput(textLayoutResult0.l().n(), this.b, textLayoutResult0.l().i(), textLayoutResult0.l().g(), textLayoutResult0.l().l(), textLayoutResult0.l().h(), textLayoutResult0.l().d(), textLayoutResult0.l().f(), textLayoutResult0.l().e(), v, null), ConstraintsKt.d(v, IntSizeKt.a(TextDelegateKt.a(textLayoutResult0.w().E()), TextDelegateKt.a(textLayoutResult0.w().g()))));
        }
        MultiParagraph multiParagraph0 = this.r(v, layoutDirection0);
        long v1 = ConstraintsKt.d(v, IntSizeKt.a(TextDelegateKt.a(multiParagraph0.E()), TextDelegateKt.a(multiParagraph0.g())));
        return new TextLayoutResult(new TextLayoutInput(this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection0, this.h, v, null), multiParagraph0, v1, null);
    }

    public static TextLayoutResult p(TextDelegate textDelegate0, long v, LayoutDirection layoutDirection0, TextLayoutResult textLayoutResult0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            textLayoutResult0 = null;
        }
        return textDelegate0.o(v, layoutDirection0, textLayoutResult0);
    }

    public final void q(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.j;
        if(multiParagraphIntrinsics0 == null || layoutDirection0 != this.k || multiParagraphIntrinsics0.c()) {
            this.k = layoutDirection0;
            TextStyle textStyle0 = TextStyleKt.d(this.b, layoutDirection0);
            multiParagraphIntrinsics0 = new MultiParagraphIntrinsics(this.a, textStyle0, this.i, this.g, this.h);
        }
        this.j = multiParagraphIntrinsics0;
    }

    private final MultiParagraph r(long v, LayoutDirection layoutDirection0) {
        this.q(layoutDirection0);
        int v1 = Constraints.r(v);
        int v2 = !this.e && !TextOverflow.g(this.f, 2) || !Constraints.j(v) ? 0x7FFFFFFF : Constraints.p(v);
        int v3 = this.e || !TextOverflow.g(this.f, 2) ? this.c : 1;
        if(v1 == v2) {
            return new MultiParagraph(this.h(), ConstraintsKt.b(0, v2, 0, Constraints.o(v), 5, null), v3, TextOverflow.g(this.f, 2), null);
        }
        v2 = s.I(this.d(), v1, v2);
        return new MultiParagraph(this.h(), ConstraintsKt.b(0, v2, 0, Constraints.o(v), 5, null), v3, TextOverflow.g(this.f, 2), null);
    }

    public final void s(@m LayoutDirection layoutDirection0) {
        this.k = layoutDirection0;
    }

    public final void t(@m MultiParagraphIntrinsics multiParagraphIntrinsics0) {
        this.j = multiParagraphIntrinsics0;
    }
}

