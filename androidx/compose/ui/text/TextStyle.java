package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@Immutable
public final class TextStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextStyle a() {
            return TextStyle.f;
        }

        @Stable
        public static void b() {
        }
    }

    @l
    private final SpanStyle a;
    @l
    private final ParagraphStyle b;
    @m
    private final PlatformTextStyle c;
    @l
    public static final Companion d;
    public static final int e;
    @l
    private static final TextStyle f;

    static {
        TextStyle.d = new Companion(null);
        TextStyle.f = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 0x3FFFFF, null);
    }

    private TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        this(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null), platformTextStyle0);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v5, w w0) {
        this(((v5 & 1) == 0 ? v : 16L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 16L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? drawStyle0 : null), ((v5 & 0x8000) == 0 ? textAlign0 : null), ((v5 & 0x10000) == 0 ? textDirection0 : null), ((v5 & 0x20000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x40000) == 0 ? textIndent0 : null), ((v5 & 0x80000) == 0 ? platformTextStyle0 : null), ((v5 & 0x100000) == 0 ? lineHeightStyle0 : null), ((v5 & 0x200000) == 0 ? lineBreak0 : null), ((v5 & 0x400000) == 0 ? hyphens0 : null), ((v5 & 0x800000) == 0 ? textMotion0 : null), null);
    }

    @ExperimentalTextApi
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, drawStyle0, textAlign0, textDirection0, v4, textIndent0, platformTextStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0);
    }

    private TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0) {
        this(new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, null, null, null), new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, null, null, null, null, null, null), null);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, w w0) {
        this(((v5 & 1) == 0 ? v : 16L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 16L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), null);
    }

    private TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), null, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        this(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, null, null, null, null), platformTextStyle0);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v5, w w0) {
        this(((v5 & 1) == 0 ? v : 16L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 16L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), ((v5 & 0x40000) == 0 ? platformTextStyle0 : null), ((v5 & 0x80000) == 0 ? lineHeightStyle0 : null), null);
    }

    private TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        this(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, null), platformTextStyle0);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v5, w w0) {
        this(((v5 & 1) == 0 ? v : 16L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 16L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), ((v5 & 0x40000) == 0 ? platformTextStyle0 : null), ((v5 & 0x80000) == 0 ? lineHeightStyle0 : null), ((v5 & 0x100000) == 0 ? lineBreak0 : null), ((v5 & 0x200000) == 0 ? hyphens0 : null), null);
    }

    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, textAlign0, textDirection0, v4, textIndent0, platformTextStyle0, lineHeightStyle0, lineBreak0, hyphens0);
    }

    @k(level = kotlin.m.c, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, textAlign0, textDirection0, v4, textIndent0, platformTextStyle0, lineHeightStyle0);
    }

    @k(level = kotlin.m.c, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, textAlign0, textDirection0, v4, textIndent0);
    }

    private TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        this(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v3, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null), platformTextStyle0);
    }

    // 去混淆评级： 低(40)
    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v4, w w0) {
        this(brush0, ((v4 & 2) == 0 ? f : NaNf), ((v4 & 4) == 0 ? v : 0x7FC00000L), ((v4 & 8) == 0 ? fontWeight0 : null), ((v4 & 16) == 0 ? fontStyle0 : null), ((v4 & 0x20) == 0 ? fontSynthesis0 : null), ((v4 & 0x40) == 0 ? fontFamily0 : null), ((v4 & 0x80) == 0 ? s : null), ((v4 & 0x100) == 0 ? v1 : 0x7FC00000L), ((v4 & 0x200) == 0 ? baselineShift0 : null), ((v4 & 0x400) == 0 ? textGeometricTransform0 : null), ((v4 & 0x800) == 0 ? localeList0 : null), ((v4 & 0x1000) == 0 ? v2 : 16L), ((v4 & 0x2000) == 0 ? textDecoration0 : null), ((v4 & 0x4000) == 0 ? shadow0 : null), ((0x8000 & v4) == 0 ? drawStyle0 : null), ((0x10000 & v4) == 0 ? textAlign0 : null), ((0x20000 & v4) == 0 ? textDirection0 : null), ((0x40000 & v4) == 0 ? v3 : 0x7FC00000L), ((0x80000 & v4) == 0 ? textIndent0 : null), ((0x100000 & v4) == 0 ? platformTextStyle0 : null), ((0x200000 & v4) == 0 ? lineHeightStyle0 : null), ((0x400000 & v4) == 0 ? lineBreak0 : null), ((0x800000 & v4) == 0 ? hyphens0 : null), ((v4 & 0x1000000) == 0 ? textMotion0 : null), null);
    }

    @ExperimentalTextApi
    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, w w0) {
        this(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, drawStyle0, textAlign0, textDirection0, v3, textIndent0, platformTextStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0);
    }

    public TextStyle(@l SpanStyle spanStyle0, @l ParagraphStyle paragraphStyle0) {
        L.p(spanStyle0, "spanStyle");
        L.p(paragraphStyle0, "paragraphStyle");
        this(spanStyle0, paragraphStyle0, TextStyleKt.b(spanStyle0.z(), paragraphStyle0.o()));
    }

    public TextStyle(@l SpanStyle spanStyle0, @l ParagraphStyle paragraphStyle0, @m PlatformTextStyle platformTextStyle0) {
        L.p(spanStyle0, "spanStyle");
        L.p(paragraphStyle0, "paragraphStyle");
        super();
        this.a = spanStyle0;
        this.b = paragraphStyle0;
        this.c = platformTextStyle0;
    }

    public TextStyle(SpanStyle spanStyle0, ParagraphStyle paragraphStyle0, PlatformTextStyle platformTextStyle0, int v, w w0) {
        if((v & 4) != 0) {
            platformTextStyle0 = null;
        }
        this(spanStyle0, paragraphStyle0, platformTextStyle0);
    }

    @m
    public final Hyphens A() {
        return this.b.i();
    }

    public final long B() {
        return this.a.x();
    }

    @m
    public final LineBreak C() {
        return this.b.k();
    }

    public final long D() {
        return this.b.m();
    }

    @m
    public final LineHeightStyle E() {
        return this.b.n();
    }

    @m
    public final LocaleList F() {
        return this.a.y();
    }

    @l
    public final ParagraphStyle G() {
        return this.b;
    }

    @m
    public final PlatformTextStyle H() {
        return this.c;
    }

    @m
    public final Shadow I() {
        return this.a.A();
    }

    @l
    public final SpanStyle J() {
        return this.a;
    }

    @m
    public final TextAlign K() {
        return this.b.p();
    }

    @m
    public final TextDecoration L() {
        return this.a.B();
    }

    @m
    public final TextDirection M() {
        return this.b.r();
    }

    @m
    public final TextGeometricTransform N() {
        return this.a.D();
    }

    @m
    public final TextIndent O() {
        return this.b.s();
    }

    @ExperimentalTextApi
    @m
    public final TextMotion P() {
        return this.b.t();
    }

    @ExperimentalTextApi
    public static void Q() {
    }

    public final boolean R(@l TextStyle textStyle0) {
        L.p(textStyle0, "other");
        return this == textStyle0 || L.g(this.b, textStyle0.b) && this.a.E(textStyle0.a);
    }

    public final int S() {
        int v = this.a.G();
        int v1 = this.b.hashCode();
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @Stable
    @l
    public final TextStyle T(@l ParagraphStyle paragraphStyle0) {
        L.p(paragraphStyle0, "other");
        return new TextStyle(this.b0(), this.a0().v(paragraphStyle0));
    }

    @Stable
    @l
    public final TextStyle U(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "other");
        return new TextStyle(this.b0().H(spanStyle0), this.a0());
    }

    @Stable
    @l
    public final TextStyle V(@m TextStyle textStyle0) {
        return textStyle0 == null || L.g(textStyle0, TextStyle.f) ? this : new TextStyle(this.b0().H(textStyle0.b0()), this.a0().v(textStyle0.a0()));
    }

    public static TextStyle W(TextStyle textStyle0, TextStyle textStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            textStyle1 = null;
        }
        return textStyle0.V(textStyle1);
    }

    @Stable
    @l
    public final TextStyle X(@l ParagraphStyle paragraphStyle0) {
        L.p(paragraphStyle0, "other");
        return this.T(paragraphStyle0);
    }

    @Stable
    @l
    public final TextStyle Y(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "other");
        return this.U(spanStyle0);
    }

    @Stable
    @l
    public final TextStyle Z(@l TextStyle textStyle0) {
        L.p(textStyle0, "other");
        return this.V(textStyle0);
    }

    @Stable
    @l
    public final ParagraphStyle a0() {
        return this.b;
    }

    @l
    public final TextStyle b(long v, long v1, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v2, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v3, @m TextDecoration textDecoration0, @m Shadow shadow0, @m TextAlign textAlign0, @m TextDirection textDirection0, long v4, @m TextIndent textIndent0, @m PlatformTextStyle platformTextStyle0, @m LineHeightStyle lineHeightStyle0, @m LineBreak lineBreak0, @m Hyphens hyphens0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.y(v, this.a.o()) ? this.a.C() : TextForegroundStyle.a.b(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), this.s(), null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, this.P(), null), platformTextStyle0);
    }

    @Stable
    @l
    public final SpanStyle b0() {
        return this.a;
    }

    public static TextStyle c(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.o();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.t();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.w();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.u();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.v();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.r();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.s();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.x();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.l();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.D();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.y();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.k();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.B();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.A();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : textStyle0.b.p();
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : textStyle0.b.r();
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.m();
        TextIndent textIndent1 = (v5 & 0x20000) == 0 ? textIndent0 : textStyle0.b.s();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x40000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x80000) == 0 ? lineHeightStyle0 : textStyle0.b.n();
        LineBreak lineBreak1 = (v5 & 0x100000) == 0 ? lineBreak0 : textStyle0.b.k();
        return (v5 & 0x200000) == 0 ? textStyle0.b(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0) : textStyle0.b(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, textStyle0.b.i());
    }

    @k(level = kotlin.m.c, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final TextStyle d(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0) {
        SpanStyle spanStyle0 = new SpanStyle((Color.y(v, this.a.o()) ? this.a.C() : TextForegroundStyle.a.b(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.a.z(), this.a.p(), null);
        LineHeightStyle lineHeightStyle0 = this.E();
        LineBreak lineBreak0 = this.C();
        Hyphens hyphens0 = this.A();
        TextMotion textMotion0 = this.P();
        return new TextStyle(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, this.b.o(), lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null), this.c);
    }

    public static TextStyle e(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.o();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.t();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.w();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.u();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.v();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.r();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.s();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.x();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.l();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.D();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.y();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.k();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.B();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.A();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : textStyle0.b.p();
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : textStyle0.b.r();
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.m();
        return (v5 & 0x20000) == 0 ? textStyle0.d(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent0) : textStyle0.d(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textStyle0.b.s());
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextStyle)) {
            return false;
        }
        if(!L.g(this.a, ((TextStyle)object0).a)) {
            return false;
        }
        return L.g(this.b, ((TextStyle)object0).b) ? L.g(this.c, ((TextStyle)object0).c) : false;
    }

    @k(level = kotlin.m.c, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final TextStyle f(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.y(v, this.a.o()) ? this.a.C() : TextForegroundStyle.a.b(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), this.a.p(), null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, this.C(), this.A(), this.P(), null), platformTextStyle0);
    }

    public static TextStyle g(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.o();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.t();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.w();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.u();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.v();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.r();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.s();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.x();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.l();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.D();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.y();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.k();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.B();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.A();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : textStyle0.b.p();
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : textStyle0.b.r();
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.m();
        TextIndent textIndent1 = (v5 & 0x20000) == 0 ? textIndent0 : textStyle0.b.s();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x40000) == 0 ? platformTextStyle0 : textStyle0.c;
        return (v5 & 0x80000) == 0 ? textStyle0.f(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle0) : textStyle0.f(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, textStyle0.b.n());
    }

    @ExperimentalTextApi
    @l
    public final TextStyle h(@m Brush brush0, float f, long v, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v1, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v2, @m TextDecoration textDecoration0, @m Shadow shadow0, @m DrawStyle drawStyle0, @m TextAlign textAlign0, @m TextDirection textDirection0, long v3, @m TextIndent textIndent0, @m PlatformTextStyle platformTextStyle0, @m LineHeightStyle lineHeightStyle0, @m LineBreak lineBreak0, @m Hyphens hyphens0, @m TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v3, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null), platformTextStyle0);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    public static TextStyle i(TextStyle textStyle0, Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v4, Object object0) {
        float f1 = (v4 & 2) == 0 ? f : textStyle0.a.i();
        long v5 = (v4 & 4) == 0 ? v : textStyle0.a.t();
        FontWeight fontWeight1 = (v4 & 8) == 0 ? fontWeight0 : textStyle0.a.w();
        FontStyle fontStyle1 = (v4 & 16) == 0 ? fontStyle0 : textStyle0.a.u();
        FontSynthesis fontSynthesis1 = (v4 & 0x20) == 0 ? fontSynthesis0 : textStyle0.a.v();
        FontFamily fontFamily1 = (v4 & 0x40) == 0 ? fontFamily0 : textStyle0.a.r();
        String s1 = (v4 & 0x80) == 0 ? s : textStyle0.a.s();
        long v6 = (v4 & 0x100) == 0 ? v1 : textStyle0.a.x();
        BaselineShift baselineShift1 = (v4 & 0x200) == 0 ? baselineShift0 : textStyle0.a.l();
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x400) == 0 ? textGeometricTransform0 : textStyle0.a.D();
        LocaleList localeList1 = (v4 & 0x800) == 0 ? localeList0 : textStyle0.a.y();
        long v7 = (v4 & 0x1000) == 0 ? v2 : textStyle0.a.k();
        TextDecoration textDecoration1 = (v4 & 0x2000) == 0 ? textDecoration0 : textStyle0.a.B();
        Shadow shadow1 = (v4 & 0x4000) == 0 ? shadow0 : textStyle0.a.A();
        DrawStyle drawStyle1 = (v4 & 0x8000) == 0 ? drawStyle0 : textStyle0.a.p();
        TextAlign textAlign1 = (v4 & 0x10000) == 0 ? textAlign0 : textStyle0.b.p();
        TextDirection textDirection1 = (v4 & 0x20000) == 0 ? textDirection0 : textStyle0.b.r();
        long v8 = (v4 & 0x40000) == 0 ? v3 : textStyle0.b.m();
        TextIndent textIndent1 = (0x80000 & v4) == 0 ? textIndent0 : textStyle0.b.s();
        PlatformTextStyle platformTextStyle1 = (v4 & 0x100000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v4 & 0x200000) == 0 ? lineHeightStyle0 : textStyle0.b.n();
        LineBreak lineBreak1 = (v4 & 0x400000) == 0 ? lineBreak0 : textStyle0.b.k();
        if((v4 & 0x800000) != 0) {
            Hyphens hyphens1 = textStyle0.b.i();
            return (v4 & 0x1000000) == 0 ? textStyle0.h(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : textStyle0.h(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textStyle0.b.t());
        }
        return (v4 & 0x1000000) == 0 ? textStyle0.h(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0, textMotion0) : textStyle0.h(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0, textStyle0.b.t());
    }

    @ExperimentalTextApi
    @l
    public final TextStyle j(long v, long v1, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v2, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v3, @m TextDecoration textDecoration0, @m Shadow shadow0, @m DrawStyle drawStyle0, @m TextAlign textAlign0, @m TextDirection textDirection0, long v4, @m TextIndent textIndent0, @m PlatformTextStyle platformTextStyle0, @m LineHeightStyle lineHeightStyle0, @m LineBreak lineBreak0, @m Hyphens hyphens0, @m TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.y(v, this.a.o()) ? this.a.C() : TextForegroundStyle.a.b(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.b()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.a();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(textAlign0, textDirection0, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null), platformTextStyle0);
    }

    public static TextStyle k(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.o();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.t();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.w();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.u();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.v();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.r();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.s();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.x();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.l();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.D();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.y();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.k();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.B();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.A();
        DrawStyle drawStyle1 = (v5 & 0x4000) == 0 ? drawStyle0 : textStyle0.a.p();
        TextAlign textAlign1 = (v5 & 0x8000) == 0 ? textAlign0 : textStyle0.b.p();
        TextDirection textDirection1 = (v5 & 0x10000) == 0 ? textDirection0 : textStyle0.b.r();
        long v10 = (v5 & 0x20000) == 0 ? v4 : textStyle0.b.m();
        TextIndent textIndent1 = (v5 & 0x40000) == 0 ? textIndent0 : textStyle0.b.s();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x80000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x100000) == 0 ? lineHeightStyle0 : textStyle0.b.n();
        LineBreak lineBreak1 = (v5 & 0x200000) == 0 ? lineBreak0 : textStyle0.b.k();
        Hyphens hyphens1 = (v5 & 0x400000) == 0 ? hyphens0 : textStyle0.b.i();
        return (v5 & 0x800000) == 0 ? textStyle0.j(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : textStyle0.j(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textStyle0.b.t());
    }

    @ExperimentalTextApi
    public final float l() {
        return this.a.i();
    }

    @ExperimentalTextApi
    public static void m() {
    }

    public final long n() {
        return this.a.k();
    }

    @m
    public final BaselineShift o() {
        return this.a.l();
    }

    @ExperimentalTextApi
    @m
    public final Brush p() {
        return this.a.m();
    }

    @ExperimentalTextApi
    public static void q() {
    }

    public final long r() {
        return this.a.o();
    }

    @ExperimentalTextApi
    @m
    public final DrawStyle s() {
        return this.a.p();
    }

    @ExperimentalTextApi
    public static void t() {
    }

    @Override
    @l
    public String toString() {
        return "TextStyle(color=" + Color.L(this.r()) + ", brush=" + this.p() + ", alpha=" + this.l() + ", fontSize=" + TextUnit.u(this.w()) + ", fontWeight=" + this.z() + ", fontStyle=" + this.x() + ", fontSynthesis=" + this.y() + ", fontFamily=" + this.u() + ", fontFeatureSettings=" + this.v() + ", letterSpacing=" + TextUnit.u(this.B()) + ", baselineShift=" + this.o() + ", textGeometricTransform=" + this.N() + ", localeList=" + this.F() + ", background=" + Color.L(this.n()) + ", textDecoration=" + this.L() + ", shadow=" + this.I() + ", drawStyle=" + this.s() + ", textAlign=" + this.K() + ", textDirection=" + this.M() + ", lineHeight=" + TextUnit.u(this.D()) + ", textIndent=" + this.O() + ", platformStyle=" + this.c + ", lineHeightStyle=" + this.E() + ", lineBreak=" + this.C() + ", hyphens=" + this.A() + ", textMotion=" + this.P() + ')';
    }

    @m
    public final FontFamily u() {
        return this.a.r();
    }

    @m
    public final String v() {
        return this.a.s();
    }

    public final long w() {
        return this.a.t();
    }

    @m
    public final FontStyle x() {
        return this.a.u();
    }

    @m
    public final FontSynthesis y() {
        return this.a.v();
    }

    @m
    public final FontWeight z() {
        return this.a.w();
    }
}

