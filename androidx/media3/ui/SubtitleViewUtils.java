package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.Assertions;
import com.google.common.base.I;

final class SubtitleViewUtils {
    // 检测为 Lambda 实现
    private static boolean c(Object object0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean d(Object object0) [...]

    public static void e(Builder cue$Builder0) {
        cue$Builder0.b();
        if(cue$Builder0.k() instanceof Spanned) {
            if(!(cue$Builder0.k() instanceof Spannable)) {
                cue$Builder0.A(SpannableString.valueOf(cue$Builder0.k()));
            }
            SubtitleViewUtils.g(((Spannable)Assertions.g(cue$Builder0.k())), (Object object0) -> !(object0 instanceof LanguageFeatureSpan));
        }
        SubtitleViewUtils.f(cue$Builder0);
    }

    public static void f(Builder cue$Builder0) {
        cue$Builder0.C(-3.402823E+38f, 0x80000000);
        if(cue$Builder0.k() instanceof Spanned) {
            if(!(cue$Builder0.k() instanceof Spannable)) {
                cue$Builder0.A(SpannableString.valueOf(cue$Builder0.k()));
            }
            SubtitleViewUtils.g(((Spannable)Assertions.g(cue$Builder0.k())), (Object object0) -> // 去混淆评级： 低(20)
            object0 instanceof AbsoluteSizeSpan || object0 instanceof RelativeSizeSpan);
        }
    }

    private static void g(Spannable spannable0, I i0) {
        Object[] arr_object = spannable0.getSpans(0, spannable0.length(), Object.class);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(i0.apply(object0)) {
                spannable0.removeSpan(object0);
            }
        }
    }

    public static float h(int v, float f, int v1, int v2) {
        if(f == -3.402823E+38f) {
            return -3.402823E+38f;
        }
        switch(v) {
            case 0: {
                return f * ((float)v2);
            }
            case 1: {
                return f * ((float)v1);
            }
            case 2: {
                return f;
            }
            default: {
                return -3.402823E+38f;
            }
        }
    }
}

