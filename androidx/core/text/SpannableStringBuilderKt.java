package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class SpannableStringBuilderKt {
    @l
    public static final SpannableStringBuilder a(@l SpannableStringBuilder spannableStringBuilder0, @ColorInt int v, @l Function1 function10) {
        BackgroundColorSpan backgroundColorSpan0 = new BackgroundColorSpan(v);
        int v1 = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(backgroundColorSpan0, v1, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder b(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        StyleSpan styleSpan0 = new StyleSpan(1);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(styleSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannedString c(@l Function1 function10) {
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        function10.invoke(spannableStringBuilder0);
        return new SpannedString(spannableStringBuilder0);
    }

    @l
    public static final SpannableStringBuilder d(@l SpannableStringBuilder spannableStringBuilder0, @ColorInt int v, @l Function1 function10) {
        ForegroundColorSpan foregroundColorSpan0 = new ForegroundColorSpan(v);
        int v1 = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(foregroundColorSpan0, v1, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder e(@l SpannableStringBuilder spannableStringBuilder0, @l Object object0, @l Function1 function10) {
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(object0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder f(@l SpannableStringBuilder spannableStringBuilder0, @l Object[] arr_object, @l Function1 function10) {
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            spannableStringBuilder0.setSpan(arr_object[v1], v, spannableStringBuilder0.length(), 17);
        }
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder g(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        StyleSpan styleSpan0 = new StyleSpan(2);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(styleSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder h(@l SpannableStringBuilder spannableStringBuilder0, float f, @l Function1 function10) {
        RelativeSizeSpan relativeSizeSpan0 = new RelativeSizeSpan(f);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(relativeSizeSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder i(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        StrikethroughSpan strikethroughSpan0 = new StrikethroughSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(strikethroughSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder j(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        SubscriptSpan subscriptSpan0 = new SubscriptSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(subscriptSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder k(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        SuperscriptSpan superscriptSpan0 = new SuperscriptSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(superscriptSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @l
    public static final SpannableStringBuilder l(@l SpannableStringBuilder spannableStringBuilder0, @l Function1 function10) {
        UnderlineSpan underlineSpan0 = new UnderlineSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(underlineSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }
}

