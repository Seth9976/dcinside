package androidx.core.text.util;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LinkifyCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static void a(TextView textView0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
            Linkify.addLinks(textView0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
        }

        static boolean b(Spannable spannable0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
            return Linkify.addLinks(spannable0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
        }
    }

    static class LinkSpec {
        URLSpan a;
        String b;
        int c;
        int d;

    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    private static final String[] a;
    private static final Comparator b;

    static {
        LinkifyCompat.a = new String[0];
        LinkifyCompat.b = (LinkSpec linkifyCompat$LinkSpec0, LinkSpec linkifyCompat$LinkSpec1) -> {
            int v = linkifyCompat$LinkSpec0.c;
            int v1 = linkifyCompat$LinkSpec1.c;
            if(v < v1) {
                return -1;
            }
            return v <= v1 ? Integer.compare(linkifyCompat$LinkSpec1.d, linkifyCompat$LinkSpec0.d) : 1;
        };
    }

    private static void b(TextView textView0) {
        if(!(textView0.getMovementMethod() instanceof LinkMovementMethod) && textView0.getLinksClickable()) {
            textView0.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void c(TextView textView0, Pattern pattern0, String s) {
        Linkify.addLinks(textView0, pattern0, s);
    }

    public static void d(TextView textView0, Pattern pattern0, String s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        Linkify.addLinks(textView0, pattern0, s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 低(20)
    public static void e(TextView textView0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        Api24Impl.a(textView0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 低(40)
    public static boolean f(Spannable spannable0, int v) {
        return Linkify.addLinks(spannable0, v);
    }

    // 去混淆评级： 低(30)
    public static boolean g(Spannable spannable0, Pattern pattern0, String s) {
        return Linkify.addLinks(spannable0, pattern0, s);
    }

    // 去混淆评级： 低(30)
    public static boolean h(Spannable spannable0, Pattern pattern0, String s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        return Linkify.addLinks(spannable0, pattern0, s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 中等(60)
    public static boolean i(Spannable spannable0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        return Api24Impl.b(spannable0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 中等(60)
    public static boolean j(TextView textView0, int v) {
        return Linkify.addLinks(textView0, v);
    }

    private static void k(String s, int v, int v1, Spannable spannable0) {
        spannable0.setSpan(new URLSpan(s), v, v1, 33);
    }

    private static String l(String s) {
        return Build.VERSION.SDK_INT < 28 ? FindAddress.c(s) : WebView.findAddress(s);
    }

    private static void m(ArrayList arrayList0, Spannable spannable0, Pattern pattern0, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        Matcher matcher0 = pattern0.matcher(spannable0);
        while(matcher0.find()) {
            int v = matcher0.start();
            int v1 = matcher0.end();
            String s = matcher0.group(0);
            if((linkify$MatchFilter0 == null || linkify$MatchFilter0.acceptMatch(spannable0, v, v1)) && s != null) {
                LinkSpec linkifyCompat$LinkSpec0 = new LinkSpec();
                linkifyCompat$LinkSpec0.b = LinkifyCompat.p(s, arr_s, matcher0, linkify$TransformFilter0);
                linkifyCompat$LinkSpec0.c = v;
                linkifyCompat$LinkSpec0.d = v1;
                arrayList0.add(linkifyCompat$LinkSpec0);
            }
        }
    }

    private static void n(ArrayList arrayList0, Spannable spannable0) {
        String s2;
        String s = spannable0.toString();
        int v = 0;
        try {
            String s1;
            while((s1 = LinkifyCompat.l(s)) != null) {
                int v1 = s.indexOf(s1);
                if(v1 < 0) {
                    break;
                }
                LinkSpec linkifyCompat$LinkSpec0 = new LinkSpec();
                int v2 = s1.length() + v1;
                linkifyCompat$LinkSpec0.c = v1 + v;
                v += v2;
                linkifyCompat$LinkSpec0.d = v;
                s = s.substring(v2);
                try {
                    s2 = URLEncoder.encode(s1, "UTF-8");
                }
                catch(UnsupportedEncodingException unused_ex) {
                    continue;
                }
                linkifyCompat$LinkSpec0.b = "geo:0,0?q=" + s2;
                arrayList0.add(linkifyCompat$LinkSpec0);
            }
        }
        catch(UnsupportedOperationException unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    private static int o(LinkSpec linkifyCompat$LinkSpec0, LinkSpec linkifyCompat$LinkSpec1) [...]

    private static String p(String s, String[] arr_s, Matcher matcher0, Linkify.TransformFilter linkify$TransformFilter0) {
        boolean z;
        if(linkify$TransformFilter0 != null) {
            s = linkify$TransformFilter0.transformUrl(matcher0, s);
        }
        for(int v = 0; true; ++v) {
            z = false;
            if(v >= arr_s.length) {
                break;
            }
            z = true;
            String s1 = arr_s[v];
            if(s.regionMatches(true, 0, s1, 0, s1.length())) {
                if(s.regionMatches(false, 0, s1, 0, s1.length())) {
                    break;
                }
                return s1 + s.substring(s1.length());
            }
        }
        return z || arr_s.length <= 0 ? s : arr_s[0] + s;
    }

    private static void q(ArrayList arrayList0, Spannable spannable0) {
        int v7;
        int v = 0;
        URLSpan[] arr_uRLSpan = (URLSpan[])spannable0.getSpans(0, spannable0.length(), URLSpan.class);
        for(int v1 = 0; v1 < arr_uRLSpan.length; ++v1) {
            URLSpan uRLSpan0 = arr_uRLSpan[v1];
            LinkSpec linkifyCompat$LinkSpec0 = new LinkSpec();
            linkifyCompat$LinkSpec0.a = uRLSpan0;
            linkifyCompat$LinkSpec0.c = spannable0.getSpanStart(uRLSpan0);
            linkifyCompat$LinkSpec0.d = spannable0.getSpanEnd(uRLSpan0);
            arrayList0.add(linkifyCompat$LinkSpec0);
        }
        Collections.sort(arrayList0, LinkifyCompat.b);
        int v2 = arrayList0.size();
        while(v < v2 - 1) {
            LinkSpec linkifyCompat$LinkSpec1 = (LinkSpec)arrayList0.get(v);
            LinkSpec linkifyCompat$LinkSpec2 = (LinkSpec)arrayList0.get(v + 1);
            int v3 = linkifyCompat$LinkSpec1.c;
            int v4 = linkifyCompat$LinkSpec2.c;
            if(v3 <= v4) {
                int v5 = linkifyCompat$LinkSpec1.d;
                if(v5 > v4) {
                    int v6 = linkifyCompat$LinkSpec2.d;
                    if(v6 <= v5 || v5 - v3 > v6 - v4) {
                        v7 = v + 1;
                    }
                    else {
                        v7 = v5 - v3 >= v6 - v4 ? -1 : v;
                    }
                    if(v7 != -1) {
                        URLSpan uRLSpan1 = ((LinkSpec)arrayList0.get(v7)).a;
                        if(uRLSpan1 != null) {
                            spannable0.removeSpan(uRLSpan1);
                        }
                        arrayList0.remove(v7);
                        --v2;
                        continue;
                    }
                }
            }
            ++v;
        }
    }

    private static boolean r() [...] // 潜在的解密器
}

