package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.b;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.UrlAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration.Companion;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n33#2,6:199\n33#2,6:205\n33#2,6:211\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n75#1:199,6\n82#1:205,6\n91#1:211,6\n*E\n"})
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void a(SpannableString spannableString0, SpanStyle spanStyle0, int v, int v1, Density density0, Resolver fontFamily$Resolver0) {
        SpannableExtensions_androidKt.j(spannableString0, spanStyle0.o(), v, v1);
        SpannableExtensions_androidKt.n(spannableString0, spanStyle0.t(), density0, v, v1);
        if(spanStyle0.w() != null || spanStyle0.u() != null) {
            FontStyle fontStyle0 = spanStyle0.u();
            spannableString0.setSpan(new StyleSpan(AndroidFontUtils_androidKt.c((spanStyle0.w() == null ? FontWeight.b.m() : spanStyle0.w()), (fontStyle0 == null ? 0 : fontStyle0.j()))), v, v1, 33);
        }
        if(spanStyle0.r() != null) {
            if(spanStyle0.r() instanceof GenericFontFamily) {
                spannableString0.setSpan(new TypefaceSpan(((GenericFontFamily)spanStyle0.r()).j()), v, v1, 33);
            }
            else if(Build.VERSION.SDK_INT >= 28) {
                FontSynthesis fontSynthesis0 = spanStyle0.v();
                Object object0 = b.a(fontFamily$Resolver0, spanStyle0.r(), null, 0, (fontSynthesis0 == null ? 1 : fontSynthesis0.m()), 6, null).getValue();
                L.n(object0, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString0.setSpan(Api28Impl.a.a(((Typeface)object0)), v, v1, 33);
            }
        }
        if(spanStyle0.B() != null) {
            Companion textDecoration$Companion0 = TextDecoration.b;
            if(spanStyle0.B().d(textDecoration$Companion0.f())) {
                spannableString0.setSpan(new UnderlineSpan(), v, v1, 33);
            }
            if(spanStyle0.B().d(textDecoration$Companion0.b())) {
                spannableString0.setSpan(new StrikethroughSpan(), v, v1, 33);
            }
        }
        if(spanStyle0.D() != null) {
            spannableString0.setSpan(new ScaleXSpan(spanStyle0.D().d()), v, v1, 33);
        }
        SpannableExtensions_androidKt.r(spannableString0, spanStyle0.y(), v, v1);
        SpannableExtensions_androidKt.g(spannableString0, spanStyle0.k(), v, v1);
    }

    @RestrictTo({Scope.b})
    @InternalTextApi
    @l
    public static final SpannableString b(@l AnnotatedString annotatedString0, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(annotatedString0, "<this>");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        return AndroidAccessibilitySpannableString_androidKt.c(annotatedString0, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0));
    }

    @RestrictTo({Scope.b})
    @InternalTextApi
    @l
    public static final SpannableString c(@l AnnotatedString annotatedString0, @l Density density0, @l Resolver fontFamily$Resolver0) {
        L.p(annotatedString0, "<this>");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        SpannableString spannableString0 = new SpannableString(annotatedString0.j());
        List list0 = annotatedString0.g();
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Range annotatedString$Range0 = (Range)list0.get(v2);
                AndroidAccessibilitySpannableString_androidKt.a(spannableString0, SpanStyle.f(((SpanStyle)annotatedString$Range0.a()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0x3FDF, null), annotatedString$Range0.b(), annotatedString$Range0.c(), density0, fontFamily$Resolver0);
            }
        }
        List list1 = annotatedString0.k(0, annotatedString0.length());
        int v3 = list1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            Range annotatedString$Range1 = (Range)list1.get(v4);
            spannableString0.setSpan(TtsAnnotationExtensions_androidKt.a(((TtsAnnotation)annotatedString$Range1.a())), annotatedString$Range1.b(), annotatedString$Range1.c(), 33);
        }
        List list2 = annotatedString0.l(0, annotatedString0.length());
        int v5 = list2.size();
        for(int v = 0; v < v5; ++v) {
            Range annotatedString$Range2 = (Range)list2.get(v);
            spannableString0.setSpan(UrlAnnotationExtensions_androidKt.a(((UrlAnnotation)annotatedString$Range2.a())), annotatedString$Range2.b(), annotatedString$Range2.c(), 33);
        }
        return spannableString0;
    }
}

