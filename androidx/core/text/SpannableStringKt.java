package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class SpannableStringKt {
    public static final void a(@l Spannable spannable0) {
        Object[] arr_object = spannable0.getSpans(0, spannable0.length(), Object.class);
        for(int v = 0; v < arr_object.length; ++v) {
            spannable0.removeSpan(arr_object[v]);
        }
    }

    public static final void b(@l Spannable spannable0, int v, int v1, @l Object object0) {
        spannable0.setSpan(object0, v, v1, 17);
    }

    public static final void c(@l Spannable spannable0, @l kotlin.ranges.l l0, @l Object object0) {
        spannable0.setSpan(object0, ((int)l0.q()), ((int)l0.p()), 17);
    }

    @l
    public static final Spannable d(@l CharSequence charSequence0) {
        return SpannableString.valueOf(charSequence0);
    }
}

