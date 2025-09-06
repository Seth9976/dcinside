package androidx.media3.extractor.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Map;

final class TtmlRenderUtil {
    private static final String a = "TtmlRenderUtil";

    public static void a(Spannable spannable0, int v, int v1, TtmlStyle ttmlStyle0, @Nullable TtmlNode ttmlNode0, Map map0, int v2) {
        int v4;
        if(ttmlStyle0.l() != -1) {
            spannable0.setSpan(new StyleSpan(ttmlStyle0.l()), v, v1, 33);
        }
        if(ttmlStyle0.t()) {
            spannable0.setSpan(new StrikethroughSpan(), v, v1, 33);
        }
        if(ttmlStyle0.u()) {
            spannable0.setSpan(new UnderlineSpan(), v, v1, 33);
        }
        if(ttmlStyle0.q()) {
            SpanUtil.b(spannable0, new ForegroundColorSpan(ttmlStyle0.c()), v, v1, 33);
        }
        if(ttmlStyle0.p()) {
            SpanUtil.b(spannable0, new BackgroundColorSpan(ttmlStyle0.b()), v, v1, 33);
        }
        if(ttmlStyle0.d() != null) {
            SpanUtil.b(spannable0, new TypefaceSpan(ttmlStyle0.d()), v, v1, 33);
        }
        if(ttmlStyle0.o() != null) {
            TextEmphasis textEmphasis0 = (TextEmphasis)Assertions.g(ttmlStyle0.o());
            int v3 = textEmphasis0.a;
            if(v3 == -1) {
                v3 = v2 == 1 || v2 == 2 ? 3 : 1;
                v4 = 1;
            }
            else {
                v4 = textEmphasis0.b;
            }
            SpanUtil.b(spannable0, new TextEmphasisSpan(v3, v4, (textEmphasis0.c == -2 ? 1 : textEmphasis0.c)), v, v1, 33);
        }
        int v5 = ttmlStyle0.j();
        switch(v5) {
            case 2: {
                TtmlNode ttmlNode1 = TtmlRenderUtil.d(ttmlNode0, map0);
                if(ttmlNode1 != null) {
                    TtmlNode ttmlNode2 = TtmlRenderUtil.e(ttmlNode1, map0);
                    if(ttmlNode2 != null) {
                        if(ttmlNode2.g() != 1 || ttmlNode2.f(0).b == null) {
                            Log.h("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                        }
                        else {
                            String s = (String)Util.o(ttmlNode2.f(0).b);
                            TtmlStyle ttmlStyle1 = TtmlRenderUtil.f(ttmlNode2.f, ttmlNode2.l(), map0);
                            int v6 = ttmlStyle1 == null ? -1 : ttmlStyle1.i();
                            if(v6 == -1) {
                                TtmlStyle ttmlStyle2 = TtmlRenderUtil.f(ttmlNode1.f, ttmlNode1.l(), map0);
                                if(ttmlStyle2 != null) {
                                    v6 = ttmlStyle2.i();
                                }
                            }
                            spannable0.setSpan(new RubySpan(s, v6), v, v1, 33);
                        }
                    }
                }
                break;
            }
            case 3: {
                spannable0.setSpan(new DeleteTextSpan(), v, v1, 33);
                break;
            }
            default: {
                if(v5 == 4) {
                    spannable0.setSpan(new DeleteTextSpan(), v, v1, 33);
                }
            }
        }
        if(ttmlStyle0.n()) {
            SpanUtil.b(spannable0, new HorizontalTextInVerticalContextSpan(), v, v1, 33);
        }
        switch(ttmlStyle0.f()) {
            case 1: {
                SpanUtil.b(spannable0, new AbsoluteSizeSpan(((int)ttmlStyle0.e()), true), v, v1, 33);
                return;
            }
            case 2: {
                SpanUtil.b(spannable0, new RelativeSizeSpan(ttmlStyle0.e()), v, v1, 33);
                return;
            }
            case 3: {
                SpanUtil.a(spannable0, ttmlStyle0.e() / 100.0f, v, v1, 33);
            }
        }
    }

    static String b(String s) {
        return s.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder0) {
        int v;
        for(v = spannableStringBuilder0.length() - 1; v >= 0 && spannableStringBuilder0.charAt(v) == 0x20; --v) {
        }
        if(v >= 0 && spannableStringBuilder0.charAt(v) != 10) {
            spannableStringBuilder0.append('\n');
        }
    }

    @Nullable
    private static TtmlNode d(@Nullable TtmlNode ttmlNode0, Map map0) {
        while(ttmlNode0 != null) {
            TtmlStyle ttmlStyle0 = TtmlRenderUtil.f(ttmlNode0.f, ttmlNode0.l(), map0);
            if(ttmlStyle0 != null && ttmlStyle0.j() == 1) {
                return ttmlNode0;
            }
            ttmlNode0 = ttmlNode0.j;
        }
        return null;
    }

    @Nullable
    private static TtmlNode e(TtmlNode ttmlNode0, Map map0) {
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.push(ttmlNode0);
        while(!arrayDeque0.isEmpty()) {
            TtmlNode ttmlNode1 = (TtmlNode)arrayDeque0.pop();
            TtmlStyle ttmlStyle0 = TtmlRenderUtil.f(ttmlNode1.f, ttmlNode1.l(), map0);
            if(ttmlStyle0 != null && ttmlStyle0.j() == 3) {
                return ttmlNode1;
            }
            for(int v = ttmlNode1.g() - 1; v >= 0; --v) {
                arrayDeque0.push(ttmlNode1.f(v));
            }
        }
        return null;
    }

    @Nullable
    public static TtmlStyle f(@Nullable TtmlStyle ttmlStyle0, @Nullable String[] arr_s, Map map0) {
        int v = 0;
        if(ttmlStyle0 == null) {
            if(arr_s == null) {
                return null;
            }
            if(arr_s.length == 1) {
                return (TtmlStyle)map0.get(arr_s[0]);
            }
            if(arr_s.length > 1) {
                TtmlStyle ttmlStyle1 = new TtmlStyle();
                while(v < arr_s.length) {
                    ttmlStyle1.a(((TtmlStyle)map0.get(arr_s[v])));
                    ++v;
                }
                return ttmlStyle1;
            }
        }
        else {
            if(arr_s != null && arr_s.length == 1) {
                return ttmlStyle0.a(((TtmlStyle)map0.get(arr_s[0])));
            }
            if(arr_s != null && arr_s.length > 1) {
                while(v < arr_s.length) {
                    ttmlStyle0.a(((TtmlStyle)map0.get(arr_s[v])));
                    ++v;
                }
            }
        }
        return ttmlStyle0;
    }
}

