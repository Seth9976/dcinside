package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TextStyleKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    private static final PlatformTextStyle b(PlatformSpanStyle platformSpanStyle0, PlatformParagraphStyle platformParagraphStyle0) {
        return platformSpanStyle0 != null || platformParagraphStyle0 != null ? AndroidTextStyle_androidKt.a(platformSpanStyle0, platformParagraphStyle0) : null;
    }

    @l
    public static final TextStyle c(@l TextStyle textStyle0, @l TextStyle textStyle1, float f) {
        L.p(textStyle0, "start");
        L.p(textStyle1, "stop");
        return new TextStyle(SpanStyleKt.b(textStyle0.b0(), textStyle1.b0(), f), ParagraphStyleKt.a(textStyle0.a0(), textStyle1.a0(), f));
    }

    @l
    public static final TextStyle d(@l TextStyle textStyle0, @l LayoutDirection layoutDirection0) {
        L.p(textStyle0, "style");
        L.p(layoutDirection0, "direction");
        return new TextStyle(SpanStyleKt.f(textStyle0.J()), ParagraphStyleKt.c(textStyle0.G(), layoutDirection0), textStyle0.H());
    }

    public static final int e(@l LayoutDirection layoutDirection0, @m TextDirection textDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        if((textDirection0 == null ? false : TextDirection.i(textDirection0.l(), 3))) {
            switch(layoutDirection0) {
                case 1: {
                    return 4;
                }
                case 2: {
                    return 5;
                }
                default: {
                    throw new J();
                }
            }
        }
        if(textDirection0 == null) {
            switch(layoutDirection0) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                default: {
                    throw new J();
                }
            }
        }
        return textDirection0.l();
    }
}

