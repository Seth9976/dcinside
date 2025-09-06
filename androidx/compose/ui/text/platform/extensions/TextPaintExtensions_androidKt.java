package androidx.compose.ui.text.platform.extensions;

import A3.q;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion.Linearity;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TextPaintExtensions_androidKt {
    @m
    public static final SpanStyle a(@l AndroidTextPaint androidTextPaint0, @l SpanStyle spanStyle0, @l q q0, @l Density density0, boolean z) {
        L.p(androidTextPaint0, "<this>");
        L.p(spanStyle0, "style");
        L.p(q0, "resolveTypeface");
        L.p(density0, "density");
        long v = TextUnit.m(spanStyle0.t());
        if(TextUnitType.g(v, 0x100000000L)) {
            androidTextPaint0.setTextSize(density0.g1(spanStyle0.t()));
        }
        else if(TextUnitType.g(v, 0x200000000L)) {
            androidTextPaint0.setTextSize(androidTextPaint0.getTextSize() * TextUnit.n(spanStyle0.t()));
        }
        if(TextPaintExtensions_androidKt.e(spanStyle0)) {
            FontStyle fontStyle0 = spanStyle0.u();
            FontSynthesis fontSynthesis0 = spanStyle0.v();
            androidTextPaint0.setTypeface(((Typeface)q0.T0(spanStyle0.r(), (spanStyle0.w() == null ? FontWeight.b.m() : spanStyle0.w()), FontStyle.c((fontStyle0 == null ? 0 : fontStyle0.j())), FontSynthesis.e((fontSynthesis0 == null ? 1 : fontSynthesis0.m())))));
        }
        if(spanStyle0.y() != null && !L.g(spanStyle0.y(), LocaleList.c.a())) {
            if(Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.a.b(androidTextPaint0, spanStyle0.y());
            }
            else {
                androidTextPaint0.setTextLocale(LocaleExtensions_androidKt.a((spanStyle0.y().isEmpty() ? Locale.b.a() : spanStyle0.y().c(0))));
            }
        }
        if(spanStyle0.s() != null && !L.g(spanStyle0.s(), "")) {
            androidTextPaint0.setFontFeatureSettings(spanStyle0.s());
        }
        if(spanStyle0.D() != null && !L.g(spanStyle0.D(), TextGeometricTransform.c.a())) {
            androidTextPaint0.setTextScaleX(androidTextPaint0.getTextScaleX() * spanStyle0.D().d());
            androidTextPaint0.setTextSkewX(androidTextPaint0.getTextSkewX() + spanStyle0.D().e());
        }
        androidTextPaint0.h(spanStyle0.o());
        androidTextPaint0.f(spanStyle0.m(), 0x7FC000007FC00000L, spanStyle0.i());
        androidTextPaint0.j(spanStyle0.A());
        androidTextPaint0.l(spanStyle0.B());
        androidTextPaint0.i(spanStyle0.p());
        if(TextUnitType.g(TextUnit.m(spanStyle0.x()), 0x100000000L) && TextUnit.n(spanStyle0.x()) != 0.0f) {
            float f = androidTextPaint0.getTextSize() * androidTextPaint0.getTextScaleX();
            float f1 = density0.g1(spanStyle0.x());
            if(f != 0.0f) {
                androidTextPaint0.setLetterSpacing(f1 / f);
                return TextPaintExtensions_androidKt.d(spanStyle0.x(), z, spanStyle0.k(), spanStyle0.l());
            }
        }
        else if(TextUnitType.g(TextUnit.m(spanStyle0.x()), 0x200000000L)) {
            androidTextPaint0.setLetterSpacing(TextUnit.n(spanStyle0.x()));
        }
        return TextPaintExtensions_androidKt.d(spanStyle0.x(), z, spanStyle0.k(), spanStyle0.l());
    }

    public static SpanStyle b(AndroidTextPaint androidTextPaint0, SpanStyle spanStyle0, q q0, Density density0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        return TextPaintExtensions_androidKt.a(androidTextPaint0, spanStyle0, q0, density0, z);
    }

    public static final float c(float f) {
        return f == 0.0f ? 1.401298E-45f : f;
    }

    // 去混淆评级： 低(23)
    private static final SpanStyle d(long v, boolean z, long v1, BaselineShift baselineShift0) {
        boolean z1 = false;
        boolean z2 = z && TextUnitType.g(TextUnit.m(v), 0x100000000L) && TextUnit.n(v) != 0.0f;
        boolean z3 = !Color.y(v1, 16L) && !Color.y(v1, 0L);
        if(baselineShift0 != null && !BaselineShift.g(baselineShift0.k(), 0.0f)) {
            z1 = true;
        }
        if(z2 || z3 || z1) {
            long v2 = z2 ? v : 0x7FC00000L;
            if(!z3) {
                v1 = 16L;
            }
            return z1 ? new SpanStyle(0L, 0L, null, null, null, null, null, v2, baselineShift0, null, null, v1, null, null, 0x367F, null) : new SpanStyle(0L, 0L, null, null, null, null, null, v2, null, null, null, v1, null, null, 0x367F, null);
        }
        return null;
    }

    public static final boolean e(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "<this>");
        return spanStyle0.r() != null || spanStyle0.u() != null || spanStyle0.w() != null;
    }

    public static final void f(@l AndroidTextPaint androidTextPaint0, @m TextMotion textMotion0) {
        L.p(androidTextPaint0, "<this>");
        if(textMotion0 == null) {
            textMotion0 = TextMotion.c.b();
        }
        androidTextPaint0.setFlags((textMotion0.f() ? androidTextPaint0.getFlags() | 0x80 : androidTextPaint0.getFlags() & 0xFFFFFF7F));
        int v = textMotion0.e();
        if(Linearity.g(v, 1)) {
            androidTextPaint0.setFlags(androidTextPaint0.getFlags() | 0x40);
            androidTextPaint0.setHinting(0);
            return;
        }
        if(Linearity.g(v, 2)) {
            androidTextPaint0.getFlags();
            androidTextPaint0.setHinting(1);
            return;
        }
        if(Linearity.g(v, 3)) {
            androidTextPaint0.getFlags();
            androidTextPaint0.setHinting(0);
            return;
        }
        androidTextPaint0.getFlags();
    }
}

