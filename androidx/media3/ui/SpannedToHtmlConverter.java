package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.Q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class SpannedToHtmlConverter {
    public static class HtmlAndCss {
        public final String a;
        public final Map b;

        private HtmlAndCss(String s, Map map0) {
            this.a = s;
            this.b = map0;
        }

        HtmlAndCss(String s, Map map0, androidx.media3.ui.SpannedToHtmlConverter.1 spannedToHtmlConverter$10) {
            this(s, map0);
        }
    }

    static final class SpanInfo {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        private static final Comparator e;
        private static final Comparator f;

        static {
            SpanInfo.e = (SpanInfo spannedToHtmlConverter$SpanInfo0, SpanInfo spannedToHtmlConverter$SpanInfo1) -> {
                int v = Integer.compare(spannedToHtmlConverter$SpanInfo1.b, spannedToHtmlConverter$SpanInfo0.b);
                if(v != 0) {
                    return v;
                }
                int v1 = spannedToHtmlConverter$SpanInfo0.c.compareTo(spannedToHtmlConverter$SpanInfo1.c);
                return v1 == 0 ? spannedToHtmlConverter$SpanInfo0.d.compareTo(spannedToHtmlConverter$SpanInfo1.d) : v1;
            };
            SpanInfo.f = (SpanInfo spannedToHtmlConverter$SpanInfo0, SpanInfo spannedToHtmlConverter$SpanInfo1) -> {
                int v = Integer.compare(spannedToHtmlConverter$SpanInfo1.a, spannedToHtmlConverter$SpanInfo0.a);
                if(v != 0) {
                    return v;
                }
                int v1 = spannedToHtmlConverter$SpanInfo1.c.compareTo(spannedToHtmlConverter$SpanInfo0.c);
                return v1 == 0 ? spannedToHtmlConverter$SpanInfo1.d.compareTo(spannedToHtmlConverter$SpanInfo0.d) : v1;
            };
        }

        private SpanInfo(int v, int v1, String s, String s1) {
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
        }

        SpanInfo(int v, int v1, String s, String s1, androidx.media3.ui.SpannedToHtmlConverter.1 spannedToHtmlConverter$10) {
            this(v, v1, s, s1);
        }

        // 检测为 Lambda 实现
        private static int e(SpanInfo spannedToHtmlConverter$SpanInfo0, SpanInfo spannedToHtmlConverter$SpanInfo1) [...]

        // 检测为 Lambda 实现
        private static int f(SpanInfo spannedToHtmlConverter$SpanInfo0, SpanInfo spannedToHtmlConverter$SpanInfo1) [...]
    }

    static final class Transition {
        private final List a;
        private final List b;

        public Transition() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    private static final Pattern a;

    static {
        SpannedToHtmlConverter.a = Pattern.compile("(&#13;)?&#10;");
    }

    public static HtmlAndCss a(@Nullable CharSequence charSequence0, float f) {
        int v = 0;
        if(charSequence0 == null) {
            return new HtmlAndCss("", Q2.u(), null);
        }
        if(!(charSequence0 instanceof Spanned)) {
            return new HtmlAndCss(SpannedToHtmlConverter.b(charSequence0), Q2.u(), null);
        }
        HashSet hashSet0 = new HashSet();
        BackgroundColorSpan[] arr_backgroundColorSpan = (BackgroundColorSpan[])((Spanned)charSequence0).getSpans(0, ((Spanned)charSequence0).length(), BackgroundColorSpan.class);
        for(int v1 = 0; v1 < arr_backgroundColorSpan.length; ++v1) {
            hashSet0.add(arr_backgroundColorSpan[v1].getBackgroundColor());
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: hashSet0) {
            int v2 = (int)(((Integer)object0));
            hashMap0.put("." + ("bg_" + v2) + ",." + ("bg_" + v2) + " *", Util.S("background-color:%s;", new Object[]{HtmlUtils.b(v2)}));
        }
        SparseArray sparseArray0 = SpannedToHtmlConverter.c(((Spanned)charSequence0), f);
        StringBuilder stringBuilder0 = new StringBuilder(((Spanned)charSequence0).length());
        int v3;
        for(v3 = 0; v < sparseArray0.size(); v3 = v4) {
            int v4 = sparseArray0.keyAt(v);
            stringBuilder0.append(SpannedToHtmlConverter.b(((Spanned)charSequence0).subSequence(v3, v4)));
            Transition spannedToHtmlConverter$Transition0 = (Transition)sparseArray0.get(v4);
            Collections.sort(spannedToHtmlConverter$Transition0.b, SpanInfo.f);
            for(Object object1: spannedToHtmlConverter$Transition0.b) {
                stringBuilder0.append(((SpanInfo)object1).d);
            }
            Collections.sort(spannedToHtmlConverter$Transition0.a, SpanInfo.e);
            for(Object object2: spannedToHtmlConverter$Transition0.a) {
                stringBuilder0.append(((SpanInfo)object2).c);
            }
            ++v;
        }
        stringBuilder0.append(SpannedToHtmlConverter.b(((Spanned)charSequence0).subSequence(v3, ((Spanned)charSequence0).length())));
        return new HtmlAndCss(stringBuilder0.toString(), hashMap0, null);
    }

    private static String b(CharSequence charSequence0) {
        String s = Html.escapeHtml(charSequence0);
        return SpannedToHtmlConverter.a.matcher(s).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned0, float f) {
        SparseArray sparseArray0 = new SparseArray();
        Object[] arr_object = spanned0.getSpans(0, spanned0.length(), Object.class);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            String s = SpannedToHtmlConverter.e(object0, f);
            String s1 = SpannedToHtmlConverter.d(object0);
            int v1 = spanned0.getSpanStart(object0);
            int v2 = spanned0.getSpanEnd(object0);
            if(s != null) {
                Assertions.g(s1);
                SpanInfo spannedToHtmlConverter$SpanInfo0 = new SpanInfo(v1, v2, s, s1, null);
                SpannedToHtmlConverter.f(sparseArray0, v1).a.add(spannedToHtmlConverter$SpanInfo0);
                SpannedToHtmlConverter.f(sparseArray0, v2).b.add(spannedToHtmlConverter$SpanInfo0);
            }
        }
        return sparseArray0;
    }

    @Nullable
    private static String d(Object object0) {
        if(!(object0 instanceof StrikethroughSpan) && !(object0 instanceof ForegroundColorSpan) && !(object0 instanceof BackgroundColorSpan) && !(object0 instanceof HorizontalTextInVerticalContextSpan) && !(object0 instanceof AbsoluteSizeSpan) && !(object0 instanceof RelativeSizeSpan) && !(object0 instanceof TextEmphasisSpan)) {
            if(object0 instanceof TypefaceSpan) {
                return ((TypefaceSpan)object0).getFamily() == null ? null : "</span>";
            }
            if(object0 instanceof StyleSpan) {
                switch(((StyleSpan)object0).getStyle()) {
                    case 1: {
                        return "</b>";
                    }
                    case 2: {
                        return "</i>";
                    }
                    case 3: {
                        return "</i></b>";
                    }
                    default: {
                        return null;
                    }
                }
            }
            if(object0 instanceof RubySpan) {
                return "<rt>" + SpannedToHtmlConverter.b(((RubySpan)object0).a) + "</rt></ruby>";
            }
            return object0 instanceof UnderlineSpan ? "</u>" : null;
        }
        return "</span>";
    }

    @Nullable
    private static String e(Object object0, float f) {
        if(object0 instanceof StrikethroughSpan) {
            return "<span style=\'text-decoration:line-through;\'>";
        }
        if(object0 instanceof ForegroundColorSpan) {
            return Util.S("<span style=\'color:%s;\'>", new Object[]{HtmlUtils.b(((ForegroundColorSpan)object0).getForegroundColor())});
        }
        if(object0 instanceof BackgroundColorSpan) {
            return Util.S("<span class=\'bg_%s\'>", new Object[]{((BackgroundColorSpan)object0).getBackgroundColor()});
        }
        if(object0 instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style=\'text-combine-upright:all;\'>";
        }
        if(object0 instanceof AbsoluteSizeSpan) {
            return ((AbsoluteSizeSpan)object0).getDip() ? Util.S("<span style=\'font-size:%.2fpx;\'>", new Object[]{((float)((AbsoluteSizeSpan)object0).getSize())}) : Util.S("<span style=\'font-size:%.2fpx;\'>", new Object[]{((float)(((float)((AbsoluteSizeSpan)object0).getSize()) / f))});
        }
        if(object0 instanceof RelativeSizeSpan) {
            return Util.S("<span style=\'font-size:%.2f%%;\'>", new Object[]{((float)(((RelativeSizeSpan)object0).getSizeChange() * 100.0f))});
        }
        if(object0 instanceof TypefaceSpan) {
            String s = ((TypefaceSpan)object0).getFamily();
            return s == null ? null : Util.S("<span style=\'font-family:\"%s\";\'>", new Object[]{s});
        }
        if(object0 instanceof StyleSpan) {
            int v = ((StyleSpan)object0).getStyle();
            switch(v) {
                case 1: {
                    return "<b>";
                }
                case 2: {
                    return "<i>";
                }
                default: {
                    return v == 3 ? "<b><i>" : null;
                }
            }
        }
        if(object0 instanceof RubySpan) {
            switch(((RubySpan)object0).b) {
                case -1: {
                    return "<ruby style=\'ruby-position:unset;\'>";
                }
                case 1: {
                    return "<ruby style=\'ruby-position:over;\'>";
                }
                case 2: {
                    return "<ruby style=\'ruby-position:under;\'>";
                }
                default: {
                    return null;
                }
            }
        }
        if(object0 instanceof UnderlineSpan) {
            return "<u>";
        }
        return object0 instanceof TextEmphasisSpan ? Util.S("<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>", new Object[]{SpannedToHtmlConverter.h(((TextEmphasisSpan)object0).a, ((TextEmphasisSpan)object0).b), SpannedToHtmlConverter.g(((TextEmphasisSpan)object0).c)}) : null;
    }

    private static Transition f(SparseArray sparseArray0, int v) {
        Transition spannedToHtmlConverter$Transition0 = (Transition)sparseArray0.get(v);
        if(spannedToHtmlConverter$Transition0 == null) {
            spannedToHtmlConverter$Transition0 = new Transition();
            sparseArray0.put(v, spannedToHtmlConverter$Transition0);
        }
        return spannedToHtmlConverter$Transition0;
    }

    private static String g(int v) {
        return v == 2 ? "under left" : "over right";
    }

    private static String h(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(v1) {
            case 1: {
                stringBuilder0.append("filled ");
                break;
            }
            case 2: {
                stringBuilder0.append("open ");
            }
        }
        switch(v) {
            case 0: {
                stringBuilder0.append("none");
                return stringBuilder0.toString();
            }
            case 1: {
                stringBuilder0.append("circle");
                return stringBuilder0.toString();
            }
            case 2: {
                stringBuilder0.append("dot");
                return stringBuilder0.toString();
            }
            default: {
                if(v != 3) {
                    stringBuilder0.append("unset");
                    return stringBuilder0.toString();
                }
                stringBuilder0.append("sesame");
                return stringBuilder0.toString();
            }
        }
    }

    class androidx.media3.ui.SpannedToHtmlConverter.1 {
    }

}

