package androidx.compose.ui.text.platform.extensions;

import A3.p;
import A3.q;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle.Trim;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,552:1\n1#2:553\n35#3,3:554\n38#3,2:561\n40#3:564\n33#4,4:557\n38#4:563\n69#4,6:565\n33#4,6:571\n646#5:577\n646#5:578\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n282#1:554,3\n282#1:561,2\n282#1:564\n282#1:557,4\n282#1:563\n350#1:565,6\n370#1:571,6\n434#1:577\n507#1:578\n*E\n"})
public final class SpannableExtensions_androidKt {
    private static final MetricAffectingSpan a(long v, Density density0) {
        long v1 = TextUnit.m(v);
        if(TextUnitType.g(v1, 0x100000000L)) {
            return new LetterSpacingSpanPx(density0.g1(v));
        }
        return TextUnitType.g(v1, 0x200000000L) ? new LetterSpacingSpanEm(TextUnit.n(v)) : null;
    }

    public static final void b(@m SpanStyle spanStyle0, @l List list0, @l p p0) {
        L.p(list0, "spanStyles");
        L.p(p0, "block");
        if(list0.size() <= 1) {
            if(!list0.isEmpty()) {
                p0.invoke(SpannableExtensions_androidKt.e(spanStyle0, ((SpanStyle)((Range)list0.get(0)).h())), ((Range)list0.get(0)).i(), ((Range)list0.get(0)).g());
            }
            return;
        }
        int v = list0.size();
        Integer[] arr_integer = new Integer[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            arr_integer[v1] = 0;
        }
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Range annotatedString$Range0 = (Range)list0.get(v3);
            arr_integer[v3] = annotatedString$Range0.i();
            arr_integer[v3 + v] = annotatedString$Range0.g();
        }
        kotlin.collections.l.U3(arr_integer);
        int v4 = ((Number)kotlin.collections.l.Rb(arr_integer)).intValue();
        for(int v5 = 0; v5 < v * 2; ++v5) {
            Integer integer0 = arr_integer[v5];
            int v6 = (int)integer0;
            if(v6 != v4) {
                int v7 = list0.size();
                SpanStyle spanStyle1 = spanStyle0;
                for(int v8 = 0; v8 < v7; ++v8) {
                    Range annotatedString$Range1 = (Range)list0.get(v8);
                    if(annotatedString$Range1.i() != annotatedString$Range1.g() && AnnotatedStringKt.t(v4, v6, annotatedString$Range1.i(), annotatedString$Range1.g())) {
                        spanStyle1 = SpannableExtensions_androidKt.e(spanStyle1, ((SpanStyle)annotatedString$Range1.h()));
                    }
                }
                if(spanStyle1 != null) {
                    p0.invoke(spanStyle1, v4, integer0);
                }
                v4 = v6;
            }
        }
    }

    // 去混淆评级： 中等(60)
    private static final boolean c(SpanStyle spanStyle0) {
        return TextUnitType.g(TextUnit.m(spanStyle0.x()), 0x100000000L) || TextUnitType.g(TextUnit.m(spanStyle0.x()), 0x200000000L);
    }

    private static final boolean d(TextStyle textStyle0) {
        return TextPaintExtensions_androidKt.e(textStyle0.b0()) || textStyle0.y() != null;
    }

    private static final SpanStyle e(SpanStyle spanStyle0, SpanStyle spanStyle1) {
        return spanStyle0 == null ? spanStyle1 : spanStyle0.H(spanStyle1);
    }

    private static final float f(long v, float f, Density density0) {
        long v1 = TextUnit.m(v);
        if(TextUnitType.g(v1, 0x100000000L)) {
            return density0.g1(v);
        }
        return TextUnitType.g(v1, 0x200000000L) ? TextUnit.n(v) * f : NaNf;
    }

    public static final void g(@l Spannable spannable0, long v, int v1, int v2) {
        L.p(spannable0, "$this$setBackground");
        if(v != 16L) {
            SpannableExtensions_androidKt.t(spannable0, new BackgroundColorSpan(ColorKt.r(v)), v1, v2);
        }
    }

    private static final void h(Spannable spannable0, BaselineShift baselineShift0, int v, int v1) {
        if(baselineShift0 != null) {
            SpannableExtensions_androidKt.t(spannable0, new BaselineShiftSpan(baselineShift0.k()), v, v1);
        }
    }

    private static final void i(Spannable spannable0, Brush brush0, float f, int v, int v1) {
        if(brush0 != null) {
            if(brush0 instanceof SolidColor) {
                SpannableExtensions_androidKt.j(spannable0, ((SolidColor)brush0).c(), v, v1);
                return;
            }
            if(brush0 instanceof ShaderBrush) {
                SpannableExtensions_androidKt.t(spannable0, new ShaderBrushSpan(((ShaderBrush)brush0), f), v, v1);
            }
        }
    }

    public static final void j(@l Spannable spannable0, long v, int v1, int v2) {
        L.p(spannable0, "$this$setColor");
        if(v != 16L) {
            SpannableExtensions_androidKt.t(spannable0, new ForegroundColorSpan(ColorKt.r(v)), v1, v2);
        }
    }

    private static final void k(Spannable spannable0, DrawStyle drawStyle0, int v, int v1) {
        if(drawStyle0 != null) {
            SpannableExtensions_androidKt.t(spannable0, new DrawStyleSpan(drawStyle0), v, v1);
        }
    }

    private static final void l(Spannable spannable0, TextStyle textStyle0, List list0, q q0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(TextPaintExtensions_androidKt.e(((SpanStyle)((Range)object0).h())) || ((SpanStyle)((Range)object0).h()).v() != null) {
                arrayList0.add(object0);
            }
        }
        SpannableExtensions_androidKt.b((SpannableExtensions_androidKt.d(textStyle0) ? new SpanStyle(0L, 0L, textStyle0.z(), textStyle0.x(), textStyle0.y(), textStyle0.u(), null, 0L, null, null, null, 0L, null, null, 0x3FC3, null) : null), arrayList0, new p(spannable0, q0) {
            final Spannable e;
            final q f;

            {
                this.e = spannable0;
                this.f = q0;
                super(3);
            }

            public final void a(@l SpanStyle spanStyle0, int v, int v1) {
                L.p(spanStyle0, "spanStyle");
                FontWeight fontWeight0 = spanStyle0.w() == null ? FontWeight.b.m() : spanStyle0.w();
                FontStyle fontStyle0 = spanStyle0.u();
                FontSynthesis fontSynthesis0 = spanStyle0.v();
                this.e.setSpan(new TypefaceSpan(((Typeface)this.f.T0(spanStyle0.r(), fontWeight0, FontStyle.c((fontStyle0 == null ? 0 : fontStyle0.j())), FontSynthesis.e((fontSynthesis0 == null ? 1 : fontSynthesis0.m()))))), v, v1, 33);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((SpanStyle)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                return S0.a;
            }
        });
    }

    private static final void m(Spannable spannable0, String s, int v, int v1) {
        if(s != null) {
            SpannableExtensions_androidKt.t(spannable0, new FontFeatureSpan(s), v, v1);
        }
    }

    public static final void n(@l Spannable spannable0, long v, @l Density density0, int v1, int v2) {
        L.p(spannable0, "$this$setFontSize");
        L.p(density0, "density");
        long v3 = TextUnit.m(v);
        if(TextUnitType.g(v3, 0x100000000L)) {
            SpannableExtensions_androidKt.t(spannable0, new AbsoluteSizeSpan(b.L0(density0.g1(v)), false), v1, v2);
            return;
        }
        if(TextUnitType.g(v3, 0x200000000L)) {
            SpannableExtensions_androidKt.t(spannable0, new RelativeSizeSpan(TextUnit.n(v)), v1, v2);
        }
    }

    private static final void o(Spannable spannable0, TextGeometricTransform textGeometricTransform0, int v, int v1) {
        if(textGeometricTransform0 != null) {
            SpannableExtensions_androidKt.t(spannable0, new ScaleXSpan(textGeometricTransform0.d()), v, v1);
            SpannableExtensions_androidKt.t(spannable0, new SkewXSpan(textGeometricTransform0.e()), v, v1);
        }
    }

    public static final void p(@l Spannable spannable0, long v, float f, @l Density density0, @l LineHeightStyle lineHeightStyle0) {
        L.p(spannable0, "$this$setLineHeight");
        L.p(density0, "density");
        L.p(lineHeightStyle0, "lineHeightStyle");
        float f1 = SpannableExtensions_androidKt.f(v, f, density0);
        if(!Float.isNaN(f1)) {
            SpannableExtensions_androidKt.t(spannable0, new LineHeightStyleSpan(f1, 0, (spannable0.length() != 0 && v.v7(spannable0) != 10 ? spannable0.length() : spannable0.length() + 1), Trim.j(lineHeightStyle0.c()), Trim.k(lineHeightStyle0.c()), lineHeightStyle0.b()), 0, spannable0.length());
        }
    }

    public static final void q(@l Spannable spannable0, long v, float f, @l Density density0) {
        L.p(spannable0, "$this$setLineHeight");
        L.p(density0, "density");
        float f1 = SpannableExtensions_androidKt.f(v, f, density0);
        if(!Float.isNaN(f1)) {
            SpannableExtensions_androidKt.t(spannable0, new LineHeightSpan(f1), 0, spannable0.length());
        }
    }

    public static final void r(@l Spannable spannable0, @m LocaleList localeList0, int v, int v1) {
        L.p(spannable0, "<this>");
        if(localeList0 != null) {
            LocaleSpan localeSpan0 = Build.VERSION.SDK_INT >= 24 ? LocaleListHelperMethods.a.a(localeList0) : new LocaleSpan(LocaleExtensions_androidKt.a((localeList0.isEmpty() ? Locale.b.a() : localeList0.c(0))));
            SpannableExtensions_androidKt.t(spannable0, localeSpan0, v, v1);
        }
    }

    private static final void s(Spannable spannable0, Shadow shadow0, int v, int v1) {
        if(shadow0 != null) {
            SpannableExtensions_androidKt.t(spannable0, new ShadowSpan(ColorKt.r(shadow0.f()), Offset.p(shadow0.h()), Offset.r(shadow0.h()), TextPaintExtensions_androidKt.c(shadow0.d())), v, v1);
        }
    }

    public static final void t(@l Spannable spannable0, @l Object object0, int v, int v1) {
        L.p(spannable0, "<this>");
        L.p(object0, "span");
        spannable0.setSpan(object0, v, v1, 33);
    }

    private static final void u(Spannable spannable0, Range annotatedString$Range0, Density density0) {
        int v = annotatedString$Range0.i();
        int v1 = annotatedString$Range0.g();
        SpanStyle spanStyle0 = (SpanStyle)annotatedString$Range0.h();
        SpannableExtensions_androidKt.h(spannable0, spanStyle0.l(), v, v1);
        SpannableExtensions_androidKt.j(spannable0, spanStyle0.o(), v, v1);
        SpannableExtensions_androidKt.i(spannable0, spanStyle0.m(), spanStyle0.i(), v, v1);
        SpannableExtensions_androidKt.w(spannable0, spanStyle0.B(), v, v1);
        SpannableExtensions_androidKt.n(spannable0, spanStyle0.t(), density0, v, v1);
        SpannableExtensions_androidKt.m(spannable0, spanStyle0.s(), v, v1);
        SpannableExtensions_androidKt.o(spannable0, spanStyle0.D(), v, v1);
        SpannableExtensions_androidKt.r(spannable0, spanStyle0.y(), v, v1);
        SpannableExtensions_androidKt.g(spannable0, spanStyle0.k(), v, v1);
        SpannableExtensions_androidKt.s(spannable0, spanStyle0.A(), v, v1);
        SpannableExtensions_androidKt.k(spannable0, spanStyle0.p(), v, v1);
    }

    public static final void v(@l Spannable spannable0, @l TextStyle textStyle0, @l List list0, @l Density density0, @l q q0) {
        L.p(spannable0, "<this>");
        L.p(textStyle0, "contextTextStyle");
        L.p(list0, "spanStyles");
        L.p(density0, "density");
        L.p(q0, "resolveTypeface");
        SpannableExtensions_androidKt.l(spannable0, textStyle0, list0, q0);
        int v = list0.size();
        boolean z = false;
        for(int v2 = 0; v2 < v; ++v2) {
            Range annotatedString$Range0 = (Range)list0.get(v2);
            int v3 = annotatedString$Range0.i();
            int v4 = annotatedString$Range0.g();
            if(v3 >= 0 && v3 < spannable0.length() && v4 > v3 && v4 <= spannable0.length()) {
                SpannableExtensions_androidKt.u(spannable0, annotatedString$Range0, density0);
                if(SpannableExtensions_androidKt.c(((SpanStyle)annotatedString$Range0.h()))) {
                    z = true;
                }
            }
        }
        if(z) {
            int v5 = list0.size();
            for(int v1 = 0; v1 < v5; ++v1) {
                Range annotatedString$Range1 = (Range)list0.get(v1);
                int v6 = annotatedString$Range1.i();
                int v7 = annotatedString$Range1.g();
                SpanStyle spanStyle0 = (SpanStyle)annotatedString$Range1.h();
                if(v6 >= 0 && v6 < spannable0.length() && v7 > v6 && v7 <= spannable0.length()) {
                    MetricAffectingSpan metricAffectingSpan0 = SpannableExtensions_androidKt.a(spanStyle0.x(), density0);
                    if(metricAffectingSpan0 != null) {
                        SpannableExtensions_androidKt.t(spannable0, metricAffectingSpan0, v6, v7);
                    }
                }
            }
        }
    }

    public static final void w(@l Spannable spannable0, @m TextDecoration textDecoration0, int v, int v1) {
        L.p(spannable0, "<this>");
        if(textDecoration0 != null) {
            SpannableExtensions_androidKt.t(spannable0, new TextDecorationSpan(textDecoration0.d(TextDecoration.b.f()), textDecoration0.d(TextDecoration.b.b())), v, v1);
        }
    }

    public static final void x(@l Spannable spannable0, @m TextIndent textIndent0, float f, @l Density density0) {
        float f2;
        L.p(spannable0, "<this>");
        L.p(density0, "density");
        if(textIndent0 != null && (!TextUnit.j(textIndent0.d(), 0x100000000L) || !TextUnit.j(textIndent0.e(), 0x100000000L)) && !TextUnitKt.s(textIndent0.d()) && !TextUnitKt.s(textIndent0.e())) {
            long v = TextUnit.m(textIndent0.d());
            float f1 = 0.0f;
            if(TextUnitType.g(v, 0x100000000L)) {
                f2 = density0.g1(textIndent0.d());
            }
            else {
                f2 = TextUnitType.g(v, 0x200000000L) ? TextUnit.n(textIndent0.d()) * f : 0.0f;
            }
            long v1 = TextUnit.m(textIndent0.e());
            if(TextUnitType.g(v1, 0x100000000L)) {
                f1 = density0.g1(textIndent0.e());
            }
            else if(TextUnitType.g(v1, 0x200000000L)) {
                f1 = TextUnit.n(textIndent0.e()) * f;
            }
            SpannableExtensions_androidKt.t(spannable0, new LeadingMarginSpan.Standard(((int)(((float)Math.ceil(f2)))), ((int)(((float)Math.ceil(f1))))), 0, spannable0.length());
        }
    }
}

