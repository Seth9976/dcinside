package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import j..util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class WebvttCueParser {
    static class Element {
        private final StartTag a;
        private final int b;
        private static final Comparator c;

        static {
            Element.c = (Element webvttCueParser$Element0, Element webvttCueParser$Element1) -> Integer.compare(webvttCueParser$Element0.a.b, webvttCueParser$Element1.a.b);
        }

        private Element(StartTag webvttCueParser$StartTag0, int v) {
            this.a = webvttCueParser$StartTag0;
            this.b = v;
        }

        Element(StartTag webvttCueParser$StartTag0, int v, androidx.media3.extractor.text.webvtt.WebvttCueParser.1 webvttCueParser$10) {
            this(webvttCueParser$StartTag0, v);
        }

        // 检测为 Lambda 实现
        private static int e(Element webvttCueParser$Element0, Element webvttCueParser$Element1) [...]
    }

    static final class StartTag {
        public final String a;
        public final int b;
        public final String c;
        public final Set d;

        private StartTag(String s, int v, String s1, Set set0) {
            this.b = v;
            this.a = s;
            this.c = s1;
            this.d = set0;
        }

        public static StartTag a(String s, int v) {
            String s2;
            String s1 = s.trim();
            Assertions.a(!s1.isEmpty());
            int v2 = s1.indexOf(" ");
            if(v2 == -1) {
                s2 = "";
            }
            else {
                String s3 = s1.substring(v2).trim();
                s1 = s1.substring(0, v2);
                s2 = s3;
            }
            String[] arr_s = Util.m2(s1, "\\.");
            String s4 = arr_s[0];
            HashSet hashSet0 = new HashSet();
            for(int v1 = 1; v1 < arr_s.length; ++v1) {
                hashSet0.add(arr_s[v1]);
            }
            return new StartTag(s4, v, s2, hashSet0);
        }

        public static StartTag b() {
            return new StartTag("", 0, "", Collections.emptySet());
        }
    }

    static final class StyleMatch implements Comparable {
        public final int a;
        public final WebvttCssStyle b;

        public StyleMatch(int v, WebvttCssStyle webvttCssStyle0) {
            this.a = v;
            this.b = webvttCssStyle0;
        }

        public int a(StyleMatch webvttCueParser$StyleMatch0) {
            return Integer.compare(this.a, webvttCueParser$StyleMatch0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((StyleMatch)object0));
        }
    }

    static final class WebvttCueInfoBuilder {
        public long a;
        public long b;
        public CharSequence c;
        public int d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;

        public WebvttCueInfoBuilder() {
            this.a = 0L;
            this.b = 0L;
            this.d = 2;
            this.e = -3.402823E+38f;
            this.f = 1;
            this.g = 0;
            this.h = -3.402823E+38f;
            this.i = 0x80000000;
            this.j = 1.0f;
            this.k = 0x80000000;
        }

        public WebvttCueInfo a() {
            return new WebvttCueInfo(this.g().a(), this.a, this.b);
        }

        private static float b(float f, int v) {
            int v1 = Float.compare(f, -3.402823E+38f);
            if(v1 != 0 && v == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if(v1 != 0) {
                return f;
            }
            return v == 0 ? 1.0f : -3.402823E+38f;
        }

        @Nullable
        private static Layout.Alignment c(int v) {
            switch(v) {
                case 2: {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                case 1: 
                case 4: {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                case 3: 
                case 5: {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                default: {
                    Log.n("WebvttCueParser", "Unknown textAlignment: " + v);
                    return null;
                }
            }
        }

        private static float d(int v, float f) {
            switch(v) {
                case 0: {
                    return 1.0f - f;
                }
                case 1: {
                    return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
                }
                case 2: {
                    return f;
                }
                default: {
                    throw new IllegalStateException(String.valueOf(v));
                }
            }
        }

        private static float e(int v) {
            switch(v) {
                case 4: {
                    return 0.0f;
                }
                case 5: {
                    return 1.0f;
                }
                default: {
                    return 0.5f;
                }
            }
        }

        private static int f(int v) {
            switch(v) {
                case 1: 
                case 4: {
                    return 0;
                }
                case 3: 
                case 5: {
                    return 2;
                }
                default: {
                    return 1;
                }
            }
        }

        public Builder g() {
            float f = this.h == -3.402823E+38f ? WebvttCueInfoBuilder.e(this.d) : this.h;
            int v = this.i == 0x80000000 ? WebvttCueInfoBuilder.f(this.d) : this.i;
            Builder cue$Builder0 = new Builder().B(WebvttCueInfoBuilder.c(this.d)).t(WebvttCueInfoBuilder.b(this.e, this.f), this.f).u(this.g).w(f).x(v).z(Math.min(this.j, WebvttCueInfoBuilder.d(v, f))).D(this.k);
            CharSequence charSequence0 = this.c;
            if(charSequence0 != null) {
                cue$Builder0.A(charSequence0);
            }
            return cue$Builder0;
        }
    }

    private static final int A = 2;
    static final float B = 0.5f;
    private static final String C = "WebvttCueParser";
    private static final Map D = null;
    private static final Map E = null;
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    public static final Pattern f = null;
    private static final Pattern g = null;
    private static final char h = '<';
    private static final char i = '>';
    private static final char j = '/';
    private static final char k = '&';
    private static final char l = ';';
    private static final char m = ' ';
    private static final String n = "lt";
    private static final String o = "gt";
    private static final String p = "amp";
    private static final String q = "nbsp";
    private static final String r = "b";
    private static final String s = "c";
    private static final String t = "i";
    private static final String u = "lang";
    private static final String v = "ruby";
    private static final String w = "rt";
    private static final String x = "u";
    private static final String y = "v";
    private static final int z = 1;

    static {
        WebvttCueParser.f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        WebvttCueParser.g = Pattern.compile("(\\S+?):(\\S+)");
        HashMap hashMap0 = new HashMap();
        hashMap0.put("white", Color.rgb(0xFF, 0xFF, 0xFF));
        hashMap0.put("lime", Color.rgb(0, 0xFF, 0));
        hashMap0.put("cyan", Color.rgb(0, 0xFF, 0xFF));
        hashMap0.put("red", Color.rgb(0xFF, 0, 0));
        hashMap0.put("yellow", Color.rgb(0xFF, 0xFF, 0));
        hashMap0.put("magenta", Color.rgb(0xFF, 0, 0xFF));
        hashMap0.put("blue", Color.rgb(0, 0, 0xFF));
        hashMap0.put("black", 0xFF000000);
        WebvttCueParser.D = DesugarCollections.unmodifiableMap(hashMap0);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("bg_white", Color.rgb(0xFF, 0xFF, 0xFF));
        hashMap1.put("bg_lime", Color.rgb(0, 0xFF, 0));
        hashMap1.put("bg_cyan", Color.rgb(0, 0xFF, 0xFF));
        hashMap1.put("bg_red", Color.rgb(0xFF, 0, 0));
        hashMap1.put("bg_yellow", Color.rgb(0xFF, 0xFF, 0));
        hashMap1.put("bg_magenta", Color.rgb(0xFF, 0, 0xFF));
        hashMap1.put("bg_blue", Color.rgb(0, 0, 0xFF));
        hashMap1.put("bg_black", 0xFF000000);
        WebvttCueParser.E = DesugarCollections.unmodifiableMap(hashMap1);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder0, Set set0, int v, int v1) {
        for(Object object0: set0) {
            String s = (String)object0;
            Map map0 = WebvttCueParser.D;
            if(map0.containsKey(s)) {
                spannableStringBuilder0.setSpan(new ForegroundColorSpan(((int)(((Integer)map0.get(s))))), v, v1, 33);
            }
            else {
                Map map1 = WebvttCueParser.E;
                if(map1.containsKey(s)) {
                    spannableStringBuilder0.setSpan(new BackgroundColorSpan(((int)(((Integer)map1.get(s))))), v, v1, 33);
                }
            }
        }
    }

    private static void b(String s, SpannableStringBuilder spannableStringBuilder0) {
        s.hashCode();
        switch(s) {
            case "amp": {
                spannableStringBuilder0.append('&');
                return;
            }
            case "gt": {
                spannableStringBuilder0.append('>');
                return;
            }
            case "lt": {
                spannableStringBuilder0.append('<');
                return;
            }
            case "nbsp": {
                spannableStringBuilder0.append(' ');
                return;
            }
            default: {
                Log.n("WebvttCueParser", "ignoring unsupported entity: \'&" + s + ";\'");
            }
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder0, @Nullable String s, StartTag webvttCueParser$StartTag0, List list0, List list1) {
        int v = WebvttCueParser.i(list1, s, webvttCueParser$StartTag0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.addAll(list0);
        Collections.sort(arrayList0, Element.c);
        int v1 = webvttCueParser$StartTag0.b;
        int v3 = 0;
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            if("rt".equals(((Element)arrayList0.get(v2)).a.a)) {
                Element webvttCueParser$Element0 = (Element)arrayList0.get(v2);
                int v4 = WebvttCueParser.g(WebvttCueParser.i(list1, s, webvttCueParser$Element0.a), v, 1);
                int v5 = webvttCueParser$Element0.a.b - v3;
                int v6 = webvttCueParser$Element0.b - v3;
                CharSequence charSequence0 = spannableStringBuilder0.subSequence(v5, v6);
                spannableStringBuilder0.delete(v5, v6);
                spannableStringBuilder0.setSpan(new RubySpan(charSequence0.toString(), v4), v1, v5, 33);
                v3 += charSequence0.length();
                v1 = v5;
            }
        }
    }

    private static void d(@Nullable String s, StartTag webvttCueParser$StartTag0, List list0, SpannableStringBuilder spannableStringBuilder0, List list1) {
        int v1 = webvttCueParser$StartTag0.b;
        int v2 = spannableStringBuilder0.length();
        webvttCueParser$StartTag0.a.hashCode();
        switch(webvttCueParser$StartTag0.a) {
            case "": {
                break;
            }
            case "b": {
                spannableStringBuilder0.setSpan(new StyleSpan(1), v1, v2, 33);
                break;
            }
            case "c": {
                WebvttCueParser.a(spannableStringBuilder0, webvttCueParser$StartTag0.d, v1, v2);
                break;
            }
            case "i": {
                spannableStringBuilder0.setSpan(new StyleSpan(2), v1, v2, 33);
                break;
            }
            case "lang": {
                break;
            }
            case "ruby": {
                WebvttCueParser.c(spannableStringBuilder0, s, webvttCueParser$StartTag0, list0, list1);
                break;
            }
            case "u": {
                spannableStringBuilder0.setSpan(new UnderlineSpan(), v1, v2, 33);
                break;
            }
            case "v": {
                break;
            }
            default: {
                return;
            }
        }
        List list2 = WebvttCueParser.h(list1, s, webvttCueParser$StartTag0);
        for(int v = 0; v < list2.size(); ++v) {
            WebvttCueParser.e(spannableStringBuilder0, ((StyleMatch)list2.get(v)).b, v1, v2);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder0, WebvttCssStyle webvttCssStyle0, int v, int v1) {
        if(webvttCssStyle0 == null) {
            return;
        }
        if(webvttCssStyle0.i() != -1) {
            SpanUtil.b(spannableStringBuilder0, new StyleSpan(webvttCssStyle0.i()), v, v1, 33);
        }
        if(webvttCssStyle0.l()) {
            spannableStringBuilder0.setSpan(new StrikethroughSpan(), v, v1, 33);
        }
        if(webvttCssStyle0.m()) {
            spannableStringBuilder0.setSpan(new UnderlineSpan(), v, v1, 33);
        }
        if(webvttCssStyle0.k()) {
            SpanUtil.b(spannableStringBuilder0, new ForegroundColorSpan(webvttCssStyle0.c()), v, v1, 33);
        }
        if(webvttCssStyle0.j()) {
            SpanUtil.b(spannableStringBuilder0, new BackgroundColorSpan(webvttCssStyle0.a()), v, v1, 33);
        }
        if(webvttCssStyle0.d() != null) {
            SpanUtil.b(spannableStringBuilder0, new TypefaceSpan(webvttCssStyle0.d()), v, v1, 33);
        }
        switch(webvttCssStyle0.f()) {
            case 1: {
                SpanUtil.b(spannableStringBuilder0, new AbsoluteSizeSpan(((int)webvttCssStyle0.e()), true), v, v1, 33);
                break;
            }
            case 2: {
                SpanUtil.b(spannableStringBuilder0, new RelativeSizeSpan(webvttCssStyle0.e()), v, v1, 33);
                break;
            }
            case 3: {
                SpanUtil.b(spannableStringBuilder0, new RelativeSizeSpan(webvttCssStyle0.e() / 100.0f), v, v1, 33);
            }
        }
        if(webvttCssStyle0.b()) {
            spannableStringBuilder0.setSpan(new HorizontalTextInVerticalContextSpan(), v, v1, 33);
        }
    }

    private static int f(String s, int v) {
        int v1 = s.indexOf(62, v);
        return v1 == -1 ? s.length() : v1 + 1;
    }

    private static int g(int v, int v1, int v2) {
        if(v != -1) {
            return v;
        }
        if(v1 != -1) {
            return v1;
        }
        if(v2 == -1) {
            throw new IllegalArgumentException();
        }
        return v2;
    }

    private static List h(List list0, @Nullable String s, StartTag webvttCueParser$StartTag0) {
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            WebvttCssStyle webvttCssStyle0 = (WebvttCssStyle)list0.get(v);
            int v1 = webvttCssStyle0.h(s, webvttCueParser$StartTag0.a, webvttCueParser$StartTag0.d, webvttCueParser$StartTag0.c);
            if(v1 > 0) {
                list1.add(new StyleMatch(v1, webvttCssStyle0));
            }
        }
        Collections.sort(list1);
        return list1;
    }

    private static int i(List list0, @Nullable String s, StartTag webvttCueParser$StartTag0) {
        List list1 = WebvttCueParser.h(list0, s, webvttCueParser$StartTag0);
        for(int v = 0; v < list1.size(); ++v) {
            WebvttCssStyle webvttCssStyle0 = ((StyleMatch)list1.get(v)).b;
            if(webvttCssStyle0.g() != -1) {
                return webvttCssStyle0.g();
            }
        }
        return -1;
    }

    private static String j(String s) {
        String s1 = s.trim();
        Assertions.a(!s1.isEmpty());
        return Util.n2(s1, "[ \\.]")[0];
    }

    // 去混淆评级： 低(20)
    private static boolean k(String s) {
        s.hashCode();
        switch(s) {
            case "b": 
            case "c": 
            case "i": 
            case "lang": 
            case "rt": 
            case "ruby": 
            case "u": 
            case "v": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public static Cue l(CharSequence charSequence0) {
        WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0 = new WebvttCueInfoBuilder();
        webvttCueParser$WebvttCueInfoBuilder0.c = charSequence0;
        return webvttCueParser$WebvttCueInfoBuilder0.g().a();
    }

    @Nullable
    public static WebvttCueInfo m(ParsableByteArray parsableByteArray0, List list0) {
        String s = parsableByteArray0.u();
        if(s == null) {
            return null;
        }
        Pattern pattern0 = WebvttCueParser.f;
        Matcher matcher0 = pattern0.matcher(s);
        if(matcher0.matches()) {
            return WebvttCueParser.n(null, matcher0, parsableByteArray0, list0);
        }
        String s1 = parsableByteArray0.u();
        if(s1 == null) {
            return null;
        }
        Matcher matcher1 = pattern0.matcher(s1);
        return matcher1.matches() ? WebvttCueParser.n(s.trim(), matcher1, parsableByteArray0, list0) : null;
    }

    @Nullable
    private static WebvttCueInfo n(@Nullable String s, Matcher matcher0, ParsableByteArray parsableByteArray0, List list0) {
        WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0 = new WebvttCueInfoBuilder();
        try {
            webvttCueParser$WebvttCueInfoBuilder0.a = WebvttParserUtil.d(((String)Assertions.g(matcher0.group(1))));
            webvttCueParser$WebvttCueInfoBuilder0.b = WebvttParserUtil.d(((String)Assertions.g(matcher0.group(2))));
        }
        catch(NumberFormatException unused_ex) {
            Log.n("WebvttCueParser", "Skipping cue with bad header: " + matcher0.group());
            return null;
        }
        WebvttCueParser.p(((String)Assertions.g(matcher0.group(3))), webvttCueParser$WebvttCueInfoBuilder0);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(String s1 = parsableByteArray0.u(); !TextUtils.isEmpty(s1); s1 = parsableByteArray0.u()) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(s1.trim());
        }
        webvttCueParser$WebvttCueInfoBuilder0.c = WebvttCueParser.q(s, stringBuilder0.toString(), list0);
        return webvttCueParser$WebvttCueInfoBuilder0.a();
    }

    static Builder o(String s) {
        WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0 = new WebvttCueInfoBuilder();
        WebvttCueParser.p(s, webvttCueParser$WebvttCueInfoBuilder0);
        return webvttCueParser$WebvttCueInfoBuilder0.g();
    }

    private static void p(String s, WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0) {
        Matcher matcher0 = WebvttCueParser.g.matcher(s);
        while(matcher0.find()) {
            String s1 = (String)Assertions.g(matcher0.group(1));
            String s2 = (String)Assertions.g(matcher0.group(2));
            try {
                if(!"line".equals(s1)) {
                    if("align".equals(s1)) {
                        webvttCueParser$WebvttCueInfoBuilder0.d = WebvttCueParser.v(s2);
                    }
                    else if("position".equals(s1)) {
                        WebvttCueParser.u(s2, webvttCueParser$WebvttCueInfoBuilder0);
                    }
                    else if("size".equals(s1)) {
                        webvttCueParser$WebvttCueInfoBuilder0.j = WebvttParserUtil.c(s2);
                    }
                    else if("vertical".equals(s1)) {
                        webvttCueParser$WebvttCueInfoBuilder0.k = WebvttCueParser.w(s2);
                    }
                    else {
                        Log.n("WebvttCueParser", "Unknown cue setting " + s1 + ":" + s2);
                    }
                    continue;
                }
                WebvttCueParser.s(s2, webvttCueParser$WebvttCueInfoBuilder0);
            }
            catch(NumberFormatException unused_ex) {
                Log.n("WebvttCueParser", "Skipping bad cue setting: " + matcher0.group());
            }
        }
    }

    static SpannedString q(@Nullable String s, String s1, List list0) {
        int v5;
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        while(v < s1.length()) {
            int v1 = s1.charAt(v);
            switch(v1) {
                case 38: {
                    ++v;
                    int v2 = s1.indexOf(59, v);
                    int v3 = s1.indexOf(0x20, v);
                    if(v2 == -1) {
                        v2 = v3;
                    }
                    else if(v3 != -1) {
                        v2 = Math.min(v2, v3);
                    }
                    if(v2 == -1) {
                        spannableStringBuilder0.append('&');
                    }
                    else {
                        WebvttCueParser.b(s1.substring(v, v2), spannableStringBuilder0);
                        if(v2 == v3) {
                            spannableStringBuilder0.append(" ");
                        }
                        v = v2 + 1;
                    }
                    continue;
                }
                case 60: {
                    int v4 = 1;
                    v5 = v + 1;
                    if(v5 < s1.length()) {
                        boolean z = s1.charAt(v5) == 0x2F;
                        v5 = WebvttCueParser.f(s1, v5);
                        int v6 = v5 - 2;
                        boolean z1 = s1.charAt(v6) == 0x2F;
                        if(z) {
                            v4 = 2;
                        }
                        if(!z1) {
                            v6 = v5 - 1;
                        }
                        String s2 = s1.substring(v + v4, v6);
                        if(!s2.trim().isEmpty()) {
                            String s3 = WebvttCueParser.j(s2);
                            if(WebvttCueParser.k(s3)) {
                                if(z) {
                                    while(true) {
                                        if(arrayDeque0.isEmpty()) {
                                            break;
                                        }
                                        StartTag webvttCueParser$StartTag0 = (StartTag)arrayDeque0.pop();
                                        WebvttCueParser.d(s, webvttCueParser$StartTag0, arrayList0, spannableStringBuilder0, list0);
                                        if(arrayDeque0.isEmpty()) {
                                            arrayList0.clear();
                                        }
                                        else {
                                            arrayList0.add(new Element(webvttCueParser$StartTag0, spannableStringBuilder0.length(), null));
                                        }
                                        if(webvttCueParser$StartTag0.a.equals(s3)) {
                                            break;
                                        }
                                    }
                                }
                                else if(!z1) {
                                    arrayDeque0.push(StartTag.a(s2, spannableStringBuilder0.length()));
                                }
                            }
                        }
                    }
                    break;
                }
                default: {
                    spannableStringBuilder0.append(((char)v1));
                    ++v;
                    continue;
                }
            }
            v = v5;
        }
        while(!arrayDeque0.isEmpty()) {
            WebvttCueParser.d(s, ((StartTag)arrayDeque0.pop()), arrayList0, spannableStringBuilder0, list0);
        }
        WebvttCueParser.d(s, StartTag.b(), Collections.emptyList(), spannableStringBuilder0, list0);
        return SpannedString.valueOf(spannableStringBuilder0);
    }

    private static int r(String s) {
        s.hashCode();
        switch(s) {
            case "center": 
            case "middle": {
                return 1;
            }
            case "end": {
                return 2;
            }
            case "start": {
                return 0;
            }
            default: {
                Log.n("WebvttCueParser", "Invalid anchor value: " + s);
                return 0x80000000;
            }
        }
    }

    private static void s(String s, WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0) {
        int v = s.indexOf(44);
        if(v != -1) {
            webvttCueParser$WebvttCueInfoBuilder0.g = WebvttCueParser.r(s.substring(v + 1));
            s = s.substring(0, v);
        }
        if(s.endsWith("%")) {
            webvttCueParser$WebvttCueInfoBuilder0.e = WebvttParserUtil.c(s);
            webvttCueParser$WebvttCueInfoBuilder0.f = 0;
            return;
        }
        webvttCueParser$WebvttCueInfoBuilder0.e = (float)Integer.parseInt(s);
        webvttCueParser$WebvttCueInfoBuilder0.f = 1;
    }

    private static int t(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                return 1;
            }
            case "end": {
                return 2;
            }
            case "line-left": {
                return 0;
            }
            case "line-right": {
                return 2;
            }
            case "middle": {
                return 1;
            }
            case "start": {
                return 0;
            }
            default: {
                Log.n("WebvttCueParser", "Invalid anchor value: " + s);
                return 0x80000000;
            }
        }
    }

    private static void u(String s, WebvttCueInfoBuilder webvttCueParser$WebvttCueInfoBuilder0) {
        int v = s.indexOf(44);
        if(v != -1) {
            webvttCueParser$WebvttCueInfoBuilder0.i = WebvttCueParser.t(s.substring(v + 1));
            s = s.substring(0, v);
        }
        webvttCueParser$WebvttCueInfoBuilder0.h = WebvttParserUtil.c(s);
    }

    private static int v(String s) {
        s.hashCode();
        switch(s) {
            case "center": 
            case "middle": {
                return 2;
            }
            case "end": {
                return 3;
            }
            case "left": {
                return 4;
            }
            case "right": {
                return 5;
            }
            case "start": {
                return 1;
            }
            default: {
                Log.n("WebvttCueParser", "Invalid alignment value: " + s);
                return 2;
            }
        }
    }

    private static int w(String s) {
        s.hashCode();
        if(!s.equals("lr")) {
            if(!s.equals("rl")) {
                Log.n("WebvttCueParser", "Invalid \'vertical\' value: " + s);
                return 0x80000000;
            }
            return 1;
        }
        return 2;
    }

    class androidx.media3.extractor.text.webvtt.WebvttCueParser.1 {
    }

}

