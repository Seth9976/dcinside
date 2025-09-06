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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n*L\n442#1:857\n442#1:858\n*E\n"})
public final class SpanStyle {
    @l
    private final TextForegroundStyle a;
    private final long b;
    @m
    private final FontWeight c;
    @m
    private final FontStyle d;
    @m
    private final FontSynthesis e;
    @m
    private final FontFamily f;
    @m
    private final String g;
    private final long h;
    @m
    private final BaselineShift i;
    @m
    private final TextGeometricTransform j;
    @m
    private final LocaleList k;
    private final long l;
    @m
    private final TextDecoration m;
    @m
    private final Shadow n;
    @m
    private final PlatformSpanStyle o;
    @m
    private final DrawStyle p;
    public static final int q;

    static {
    }

    private SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0) {
        this(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, null, null, 0x8000, null);
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, w w0) {
        this(((v4 & 1) == 0 ? v : 16L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 16L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), null);
    }

    private SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0) {
        this(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null);
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, int v4, w w0) {
        this(((v4 & 1) == 0 ? v : 16L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 16L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), ((v4 & 0x4000) == 0 ? platformSpanStyle0 : null), null);
    }

    private SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0) {
        this(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v4, w w0) {
        this(((v4 & 1) == 0 ? v : 16L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 16L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), ((v4 & 0x4000) == 0 ? platformSpanStyle0 : null), ((v4 & 0x8000) == 0 ? drawStyle0 : null), null);
    }

    @ExperimentalTextApi
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0);
    }

    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0);
    }

    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0);
    }

    private SpanStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0) {
        this(TextForegroundStyle.a.a(brush0, f), v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    // 去混淆评级： 低(30)
    public SpanStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, w w0) {
        this(brush0, ((v3 & 2) == 0 ? f : NaNf), ((v3 & 4) == 0 ? v : 0x7FC00000L), ((v3 & 8) == 0 ? fontWeight0 : null), ((v3 & 16) == 0 ? fontStyle0 : null), ((v3 & 0x20) == 0 ? fontSynthesis0 : null), ((v3 & 0x40) == 0 ? fontFamily0 : null), ((v3 & 0x80) == 0 ? s : null), ((v3 & 0x100) == 0 ? v1 : 0x7FC00000L), ((v3 & 0x200) == 0 ? baselineShift0 : null), ((v3 & 0x400) == 0 ? textGeometricTransform0 : null), ((v3 & 0x800) == 0 ? localeList0 : null), ((v3 & 0x1000) == 0 ? v2 : 16L), ((v3 & 0x2000) == 0 ? textDecoration0 : null), ((v3 & 0x4000) == 0 ? shadow0 : null), ((0x8000 & v3) == 0 ? platformSpanStyle0 : null), ((v3 & 0x10000) == 0 ? drawStyle0 : null), null);
    }

    @ExperimentalTextApi
    public SpanStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, w w0) {
        this(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle0, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0) {
        this.a = textForegroundStyle0;
        this.b = v;
        this.c = fontWeight0;
        this.d = fontStyle0;
        this.e = fontSynthesis0;
        this.f = fontFamily0;
        this.g = s;
        this.h = v1;
        this.i = baselineShift0;
        this.j = textGeometricTransform0;
        this.k = localeList0;
        this.l = v2;
        this.m = textDecoration0;
        this.n = shadow0;
        this.o = platformSpanStyle0;
        this.p = drawStyle0;
    }

    // 去混淆评级： 低(30)
    public SpanStyle(TextForegroundStyle textForegroundStyle0, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, w w0) {
        this(textForegroundStyle0, ((v3 & 2) == 0 ? v : 0x7FC00000L), ((v3 & 4) == 0 ? fontWeight0 : null), ((v3 & 8) == 0 ? fontStyle0 : null), ((v3 & 16) == 0 ? fontSynthesis0 : null), ((v3 & 0x20) == 0 ? fontFamily0 : null), ((v3 & 0x40) == 0 ? s : null), ((v3 & 0x80) == 0 ? v1 : 0x7FC00000L), ((v3 & 0x100) == 0 ? baselineShift0 : null), ((v3 & 0x200) == 0 ? textGeometricTransform0 : null), ((v3 & 0x400) == 0 ? localeList0 : null), ((v3 & 0x800) == 0 ? v2 : 16L), ((v3 & 0x1000) == 0 ? textDecoration0 : null), ((v3 & 0x2000) == 0 ? shadow0 : null), ((v3 & 0x4000) == 0 ? platformSpanStyle0 : null), ((v3 & 0x8000) == 0 ? drawStyle0 : null), null);
    }

    public SpanStyle(TextForegroundStyle textForegroundStyle0, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, w w0) {
        this(textForegroundStyle0, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0);
    }

    @m
    public final Shadow A() {
        return this.n;
    }

    @m
    public final TextDecoration B() {
        return this.m;
    }

    @l
    public final TextForegroundStyle C() {
        return this.a;
    }

    @m
    public final TextGeometricTransform D() {
        return this.j;
    }

    public final boolean E(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "other");
        if(this == spanStyle0) {
            return true;
        }
        if(!TextUnit.j(this.b, spanStyle0.b)) {
            return false;
        }
        if(!L.g(this.c, spanStyle0.c)) {
            return false;
        }
        if(!L.g(this.d, spanStyle0.d)) {
            return false;
        }
        if(!L.g(this.e, spanStyle0.e)) {
            return false;
        }
        if(!L.g(this.f, spanStyle0.f)) {
            return false;
        }
        if(!L.g(this.g, spanStyle0.g)) {
            return false;
        }
        if(!TextUnit.j(this.h, spanStyle0.h)) {
            return false;
        }
        if(!L.g(this.i, spanStyle0.i)) {
            return false;
        }
        if(!L.g(this.j, spanStyle0.j)) {
            return false;
        }
        if(!L.g(this.k, spanStyle0.k)) {
            return false;
        }
        return Color.y(this.l, spanStyle0.l) ? L.g(this.o, spanStyle0.o) : false;
    }

    private final boolean F(SpanStyle spanStyle0) {
        if(!L.g(this.a, spanStyle0.a)) {
            return false;
        }
        if(!L.g(this.m, spanStyle0.m)) {
            return false;
        }
        return L.g(this.n, spanStyle0.n) ? L.g(this.p, spanStyle0.p) : false;
    }

    public final int G() {
        int v = TextUnit.o(this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : FontStyle.h(this.d.j());
        int v4 = this.e == null ? 0 : FontSynthesis.i(this.e.m());
        int v5 = this.f == null ? 0 : this.f.hashCode();
        int v6 = this.g == null ? 0 : this.g.hashCode();
        int v7 = TextUnit.o(this.h);
        int v8 = this.i == null ? 0 : BaselineShift.i(this.i.k());
        int v9 = this.j == null ? 0 : this.j.hashCode();
        int v10 = this.k == null ? 0 : this.k.hashCode();
        int v11 = Color.K(this.l);
        PlatformSpanStyle platformSpanStyle0 = this.o;
        if(platformSpanStyle0 != null) {
            v1 = platformSpanStyle0.hashCode();
        }
        return ((((((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v1;
    }

    // 去混淆评级： 中等(170)
    @Stable
    @l
    public final SpanStyle H(@m SpanStyle spanStyle0) {
        return spanStyle0 == null ? this : new SpanStyle(this.a.b(spanStyle0.a), (TextUnitKt.s(spanStyle0.b) ? this.b : spanStyle0.b), (spanStyle0.c == null ? this.c : spanStyle0.c), (spanStyle0.d == null ? this.d : spanStyle0.d), (spanStyle0.e == null ? this.e : spanStyle0.e), (spanStyle0.f == null ? this.f : spanStyle0.f), (spanStyle0.g == null ? this.g : spanStyle0.g), (TextUnitKt.s(spanStyle0.h) ? this.h : spanStyle0.h), (spanStyle0.i == null ? this.i : spanStyle0.i), (spanStyle0.j == null ? this.j : spanStyle0.j), (spanStyle0.k == null ? this.k : spanStyle0.k), (spanStyle0.l == 16L ? this.l : spanStyle0.l), (spanStyle0.m == null ? this.m : spanStyle0.m), (spanStyle0.n == null ? this.n : spanStyle0.n), this.J(spanStyle0.o), (spanStyle0.p == null ? this.p : spanStyle0.p), null);
    }

    public static SpanStyle I(SpanStyle spanStyle0, SpanStyle spanStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            spanStyle1 = null;
        }
        return spanStyle0.H(spanStyle1);
    }

    private final PlatformSpanStyle J(PlatformSpanStyle platformSpanStyle0) {
        return this.o == null ? platformSpanStyle0 : this.o;
    }

    @Stable
    @l
    public final SpanStyle K(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "other");
        return this.H(spanStyle0);
    }

    // 去混淆评级： 低(20)
    @l
    public final SpanStyle a(long v, long v1, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v2, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v3, @m TextDecoration textDecoration0, @m Shadow shadow0, @m PlatformSpanStyle platformSpanStyle0) {
        return Color.y(v, this.o()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null) : new SpanStyle(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null);
    }

    public static SpanStyle b(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.o();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v4 & 0x2000) == 0 ? shadow0 : spanStyle0.n;
        return (v4 & 0x4000) == 0 ? spanStyle0.a(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle0) : spanStyle0.a(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, spanStyle0.o);
    }

    // 去混淆评级： 低(20)
    @ExperimentalTextApi
    @l
    public final SpanStyle c(long v, long v1, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v2, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v3, @m TextDecoration textDecoration0, @m Shadow shadow0, @m PlatformSpanStyle platformSpanStyle0, @m DrawStyle drawStyle0) {
        return Color.y(v, this.o()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null) : new SpanStyle(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    public static SpanStyle d(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.o();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v4 & 0x2000) == 0 ? shadow0 : spanStyle0.n;
        PlatformSpanStyle platformSpanStyle1 = (v4 & 0x4000) == 0 ? platformSpanStyle0 : spanStyle0.o;
        return (v4 & 0x8000) == 0 ? spanStyle0.c(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle1, drawStyle0) : spanStyle0.c(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle1, spanStyle0.p);
    }

    // 去混淆评级： 低(20)
    @l
    public final SpanStyle e(long v, long v1, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v2, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v3, @m TextDecoration textDecoration0, @m Shadow shadow0) {
        return Color.y(v, this.o()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.o, this.p, null) : new SpanStyle(TextForegroundStyle.a.b(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.o, this.p, null);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SpanStyle ? this.E(((SpanStyle)object0)) && this.F(((SpanStyle)object0)) : false;
    }

    public static SpanStyle f(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.o();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        return (v4 & 0x2000) == 0 ? spanStyle0.e(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow0) : spanStyle0.e(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, spanStyle0.n);
    }

    @ExperimentalTextApi
    @l
    public final SpanStyle g(@m Brush brush0, float f, long v, @m FontWeight fontWeight0, @m FontStyle fontStyle0, @m FontSynthesis fontSynthesis0, @m FontFamily fontFamily0, @m String s, long v1, @m BaselineShift baselineShift0, @m TextGeometricTransform textGeometricTransform0, @m LocaleList localeList0, long v2, @m TextDecoration textDecoration0, @m Shadow shadow0, @m PlatformSpanStyle platformSpanStyle0, @m DrawStyle drawStyle0) {
        return new SpanStyle(TextForegroundStyle.a.a(brush0, f), v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    public static SpanStyle h(SpanStyle spanStyle0, Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, Object object0) {
        float f1 = (v3 & 2) == 0 ? f : spanStyle0.i();
        long v4 = (v3 & 4) == 0 ? v : spanStyle0.b;
        FontWeight fontWeight1 = (v3 & 8) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v3 & 16) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v3 & 0x20) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v3 & 0x40) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v3 & 0x80) == 0 ? s : spanStyle0.g;
        long v5 = (v3 & 0x100) == 0 ? v1 : spanStyle0.h;
        BaselineShift baselineShift1 = (v3 & 0x200) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v3 & 0x400) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v3 & 0x800) == 0 ? localeList0 : spanStyle0.k;
        long v6 = (v3 & 0x1000) == 0 ? v2 : spanStyle0.l;
        TextDecoration textDecoration1 = (v3 & 0x2000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v3 & 0x4000) == 0 ? shadow0 : spanStyle0.n;
        if((v3 & 0x8000) != 0) {
            return (v3 & 0x10000) == 0 ? spanStyle0.g(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, spanStyle0.o, drawStyle0) : spanStyle0.g(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, spanStyle0.o, spanStyle0.p);
        }
        return (v3 & 0x10000) == 0 ? spanStyle0.g(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, platformSpanStyle0, drawStyle0) : spanStyle0.g(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, platformSpanStyle0, spanStyle0.p);
    }

    @Override
    public int hashCode() {
        int v = Color.K(this.o());
        Brush brush0 = this.m();
        int v1 = 0;
        int v2 = brush0 == null ? 0 : brush0.hashCode();
        int v3 = Float.floatToIntBits(this.i());
        int v4 = TextUnit.o(this.b);
        int v5 = this.c == null ? 0 : this.c.hashCode();
        int v6 = this.d == null ? 0 : FontStyle.h(this.d.j());
        int v7 = this.e == null ? 0 : FontSynthesis.i(this.e.m());
        int v8 = this.f == null ? 0 : this.f.hashCode();
        int v9 = this.g == null ? 0 : this.g.hashCode();
        int v10 = TextUnit.o(this.h);
        int v11 = this.i == null ? 0 : BaselineShift.i(this.i.k());
        int v12 = this.j == null ? 0 : this.j.hashCode();
        int v13 = this.k == null ? 0 : this.k.hashCode();
        int v14 = Color.K(this.l);
        int v15 = this.m == null ? 0 : this.m.hashCode();
        int v16 = this.n == null ? 0 : this.n.hashCode();
        int v17 = this.o == null ? 0 : this.o.hashCode();
        DrawStyle drawStyle0 = this.p;
        if(drawStyle0 != null) {
            v1 = drawStyle0.hashCode();
        }
        return ((((((((((((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v1;
    }

    @ExperimentalTextApi
    public final float i() {
        return this.a.i();
    }

    @ExperimentalTextApi
    public static void j() {
    }

    public final long k() {
        return this.l;
    }

    @m
    public final BaselineShift l() {
        return this.i;
    }

    @ExperimentalTextApi
    @m
    public final Brush m() {
        return this.a.d();
    }

    @ExperimentalTextApi
    public static void n() {
    }

    public final long o() {
        return this.a.a();
    }

    @ExperimentalTextApi
    @m
    public final DrawStyle p() {
        return this.p;
    }

    @ExperimentalTextApi
    public static void q() {
    }

    @m
    public final FontFamily r() {
        return this.f;
    }

    @m
    public final String s() {
        return this.g;
    }

    public final long t() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "SpanStyle(color=" + Color.L(this.o()) + ", brush=" + this.m() + ", alpha=" + this.i() + ", fontSize=" + TextUnit.u(this.b) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + TextUnit.u(this.h) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + Color.L(this.l) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    @m
    public final FontStyle u() {
        return this.d;
    }

    @m
    public final FontSynthesis v() {
        return this.e;
    }

    @m
    public final FontWeight w() {
        return this.c;
    }

    public final long x() {
        return this.h;
    }

    @m
    public final LocaleList y() {
        return this.k;
    }

    @m
    public final PlatformSpanStyle z() {
        return this.o;
    }
}

