package androidx.compose.ui.text;

import A3.a;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"})
public final class SpanStyleKt {
    private static final long a;
    private static final long b;
    private static final long c;
    private static final long d;

    static {
        SpanStyleKt.a = 0x141600000L;
        SpanStyleKt.b = 0x100000000L;
        SpanStyleKt.c = 0L;
        SpanStyleKt.d = 0xFF00000000000000L;
    }

    public static final long a() [...] // 潜在的解密器

    @l
    public static final SpanStyle b(@l SpanStyle spanStyle0, @l SpanStyle spanStyle1, float f) {
        L.p(spanStyle0, "start");
        L.p(spanStyle1, "stop");
        TextForegroundStyle textForegroundStyle0 = TextDrawStyleKt.b(spanStyle0.C(), spanStyle1.C(), f);
        long v = SpanStyleKt.e(spanStyle0.t(), spanStyle1.t(), f);
        FontWeight fontWeight0 = FontWeightKt.a((spanStyle0.w() == null ? FontWeight.b.m() : spanStyle0.w()), (spanStyle1.w() == null ? FontWeight.b.m() : spanStyle1.w()), f);
        long v1 = SpanStyleKt.e(spanStyle0.x(), spanStyle1.x(), f);
        BaselineShift baselineShift0 = spanStyle0.l();
        BaselineShift baselineShift1 = spanStyle1.l();
        TextGeometricTransform textGeometricTransform0 = TextGeometricTransformKt.a((spanStyle0.D() == null ? TextGeometricTransform.c.a() : spanStyle0.D()), (spanStyle1.D() == null ? TextGeometricTransform.c.a() : spanStyle1.D()), f);
        long v2 = ColorKt.n(spanStyle0.k(), spanStyle1.k(), f);
        Shadow shadow0 = ShadowKt.a((spanStyle0.A() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle0.A()), (spanStyle1.A() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle1.A()), f);
        PlatformSpanStyle platformSpanStyle0 = SpanStyleKt.d(spanStyle0.z(), spanStyle1.z(), f);
        return new SpanStyle(textForegroundStyle0, v, fontWeight0, ((FontStyle)SpanStyleKt.c(spanStyle0.u(), spanStyle1.u(), f)), ((FontSynthesis)SpanStyleKt.c(spanStyle0.v(), spanStyle1.v(), f)), ((FontFamily)SpanStyleKt.c(spanStyle0.r(), spanStyle1.r(), f)), ((String)SpanStyleKt.c(spanStyle0.s(), spanStyle1.s(), f)), v1, BaselineShift.d(BaselineShiftKt.a((baselineShift0 == null ? 0.0f : baselineShift0.k()), (baselineShift1 == null ? 0.0f : baselineShift1.k()), f)), textGeometricTransform0, ((LocaleList)SpanStyleKt.c(spanStyle0.y(), spanStyle1.y(), f)), v2, ((TextDecoration)SpanStyleKt.c(spanStyle0.B(), spanStyle1.B(), f)), shadow0, platformSpanStyle0, ((DrawStyle)SpanStyleKt.c(spanStyle0.p(), spanStyle1.p(), f)), null);
    }

    public static final Object c(Object object0, Object object1, float f) {
        return ((double)f) < 0.5 ? object0 : object1;
    }

    private static final PlatformSpanStyle d(PlatformSpanStyle platformSpanStyle0, PlatformSpanStyle platformSpanStyle1, float f) {
        if(platformSpanStyle0 == null && platformSpanStyle1 == null) {
            return null;
        }
        if(platformSpanStyle0 == null) {
            platformSpanStyle0 = PlatformSpanStyle.a.a();
        }
        if(platformSpanStyle1 == null) {
            platformSpanStyle1 = PlatformSpanStyle.a.a();
        }
        return AndroidTextStyle_androidKt.c(platformSpanStyle0, platformSpanStyle1, f);
    }

    // 去混淆评级： 低(20)
    public static final long e(long v, long v1, float f) {
        return TextUnitKt.s(v) || TextUnitKt.s(v1) ? ((TextUnit)SpanStyleKt.c(TextUnit.c(v), TextUnit.c(v1), f)).w() : TextUnitKt.u(v, v1, f);
    }

    @l
    public static final SpanStyle f(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "style");
        TextForegroundStyle textForegroundStyle0 = spanStyle0.C().c(androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1.e);
        long v = TextUnitKt.s(spanStyle0.t()) ? SpanStyleKt.a : spanStyle0.t();
        FontWeight fontWeight0 = spanStyle0.w() == null ? FontWeight.b.m() : spanStyle0.w();
        FontStyle fontStyle0 = spanStyle0.u();
        FontStyle fontStyle1 = FontStyle.c((fontStyle0 == null ? 0 : fontStyle0.j()));
        FontSynthesis fontSynthesis0 = spanStyle0.v();
        FontSynthesis fontSynthesis1 = FontSynthesis.e((fontSynthesis0 == null ? 1 : fontSynthesis0.m()));
        FontFamily fontFamily0 = spanStyle0.r();
        if(fontFamily0 == null) {
            fontFamily0 = FontFamily.b.b();
        }
        String s = spanStyle0.s() == null ? "" : spanStyle0.s();
        long v1 = TextUnitKt.s(spanStyle0.x()) ? SpanStyleKt.b : spanStyle0.x();
        BaselineShift baselineShift0 = spanStyle0.l();
        BaselineShift baselineShift1 = BaselineShift.d((baselineShift0 == null ? 0.0f : baselineShift0.k()));
        TextGeometricTransform textGeometricTransform0 = spanStyle0.D() == null ? TextGeometricTransform.c.a() : spanStyle0.D();
        LocaleList localeList0 = spanStyle0.y() == null ? LocaleList.c.a() : spanStyle0.y();
        long v2 = spanStyle0.k() == 16L ? SpanStyleKt.c : spanStyle0.k();
        TextDecoration textDecoration0 = spanStyle0.B() == null ? TextDecoration.b.d() : spanStyle0.B();
        Shadow shadow0 = spanStyle0.A() == null ? Shadow.d.a() : spanStyle0.A();
        PlatformSpanStyle platformSpanStyle0 = spanStyle0.z();
        DrawStyle drawStyle0 = spanStyle0.p();
        if(drawStyle0 == null) {
            drawStyle0 = Fill.a;
        }
        return new SpanStyle(textForegroundStyle0, v, fontWeight0, fontStyle1, fontSynthesis1, fontFamily0, s, v1, baselineShift1, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);

        final class androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1 extends N implements a {
            public static final androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1 e;

            static {
                androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1.e = new androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1();
            }

            androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1() {
                super(0);
            }

            // 去混淆评级： 低(20)
            @l
            public final TextForegroundStyle b() {
                return TextForegroundStyle.a.b(0xFF00000000000000L);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

