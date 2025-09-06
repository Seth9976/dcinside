package com.dcinside.rich.html;

import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import androidx.annotation.Nullable;
import com.dcinside.rich.spans.RichFontSizeSpan;
import com.dcinside.rich.spans.RichUnderlineSpan;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

class c implements ContentHandler {
    static class a {
        private final Layout.Alignment a;

        public a(Layout.Alignment layout$Alignment0) {
            this.a = layout$Alignment0;
        }
    }

    static class b {
        private b() {
        }

        b(d d0) {
        }
    }

    static class com.dcinside.rich.html.c.c {
        private com.dcinside.rich.html.c.c() {
        }

        com.dcinside.rich.html.c.c(d d0) {
        }
    }

    static class com.dcinside.rich.html.c.d {
        public String a;

        public com.dcinside.rich.html.c.d(String s) {
            this.a = s;
        }
    }

    static class e {
        private final int a;

        public e(int v) {
            this.a = v;
        }
    }

    static class f {
        private final int a;

        public f(int v) {
            this.a = v;
        }
    }

    static class g {
        private final int a;

        public g(int v) {
            this.a = v;
        }
    }

    static class h {
        private h() {
        }

        h(d d0) {
        }
    }

    static class i {
        private i() {
        }

        i(d d0) {
        }
    }

    static class j {
        private final int a;

        public j(int v) {
            this.a = v;
        }
    }

    static class k {
        private k() {
        }

        k(d d0) {
        }
    }

    static class l {
        private l() {
        }

        l(d d0) {
        }
    }

    static class m {
        private m() {
        }

        m(d d0) {
        }
    }

    private final String a;
    private final XMLReader b;
    private final SpannableStringBuilder c;
    private final com.dcinside.rich.html.a.a d;
    private final int e;
    private static Pattern f;
    private static Pattern g;
    private static Pattern h;
    private static Pattern i;
    private static final HashMap j;

    static {
        c.j = c.b();
    }

    public c(String s, com.dcinside.rich.html.a.a a$a0, org.ccil.cowan.tagsoup.l l0, int v) {
        this.a = s;
        this.c = new SpannableStringBuilder();
        this.d = a$a0;
        this.b = l0;
        this.e = v;
    }

    private static void A(Editable editable0, Attributes attributes0, int v) {
        editable0.length();
        if(v > 0) {
            c.a(editable0, v);
            c.z(editable0, new j(v));
        }
        String s = attributes0.getValue("", "style");
        if(s != null) {
            Matcher matcher0 = c.t().matcher(s);
            if(matcher0.find()) {
                String s1 = matcher0.group(1);
                if(s1 != null) {
                    if(s1.equalsIgnoreCase("left")) {
                        c.z(editable0, new a(Layout.Alignment.ALIGN_NORMAL));
                        return;
                    }
                    if(s1.equalsIgnoreCase("center")) {
                        c.z(editable0, new a(Layout.Alignment.ALIGN_CENTER));
                        return;
                    }
                    if(s1.equalsIgnoreCase("right")) {
                        c.z(editable0, new a(Layout.Alignment.ALIGN_OPPOSITE));
                    }
                }
            }
        }
    }

    private void B(Editable editable0, Attributes attributes0) {
        String s = attributes0.getValue("", "style");
        if(s != null) {
            Matcher matcher0 = c.k().matcher(s);
            if(matcher0.find()) {
                int v = c.l(matcher0.group(1));
                if(v != -1) {
                    c.z(editable0, new f(v | 0xFF000000));
                }
            }
            Matcher matcher1 = c.u().matcher(s);
            if(matcher1.find()) {
                String s1 = matcher1.group(1);
                if(s1 != null && s1.equalsIgnoreCase("line-through")) {
                    c.z(editable0, new l(null));
                }
            }
            Matcher matcher2 = c.j().matcher(s);
            if(matcher2.find()) {
                c.z(editable0, new e(c.i(matcher2.group(1))));
            }
        }
    }

    private void C(Editable editable0, Attributes attributes0) {
        String s = attributes0.getValue("", "color");
        String s1 = attributes0.getValue("", "face");
        if(!TextUtils.isEmpty(s)) {
            int v = c.l(s);
            if(v != -1) {
                c.z(editable0, new f(v | 0xFF000000));
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            c.z(editable0, new com.dcinside.rich.html.c.d(s1));
        }
    }

    private static void a(Editable editable0, int v) {
        int v1 = editable0.length();
        if(v1 == 0) {
            return;
        }
        int v2 = v1 - 1;
        int v3 = 0;
        while(v2 >= 0 && editable0.charAt(v2) == 10) {
            ++v3;
            --v2;
        }
        while(v3 < v) {
            editable0.append('\n');
            ++v3;
        }
    }

    private static HashMap b() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("aqua", 0xFFFF);
        hashMap0.put("black", 0);
        hashMap0.put("blue", 0xFF);
        hashMap0.put("fuchsia", 0xFF00FF);
        hashMap0.put("green", 0x8000);
        hashMap0.put("grey", 0x808080);
        hashMap0.put("lime", 0xFF00);
        hashMap0.put("maroon", 0x800000);
        hashMap0.put("navy", 0x80);
        hashMap0.put("olive", 0x808000);
        hashMap0.put("purple", 0x800080);
        hashMap0.put("red", 0xFF0000);
        hashMap0.put("silver", 0xC0C0C0);
        hashMap0.put("teal", 0x8080);
        hashMap0.put("white", 0xFFFFFF);
        hashMap0.put("yellow", 0xFFFF00);
        return hashMap0;
    }

    public Spanned c() {
        this.b.setContentHandler(this);
        try {
            InputSource inputSource0 = new InputSource(new StringReader(this.a));
            this.b.parse(inputSource0);
        }
        catch(SAXException | IOException sAXException0) {
            throw new RuntimeException(sAXException0);
        }
        int v = this.c.length();
        Object[] arr_object = this.c.getSpans(0, v, ParagraphStyle.class);
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            int v2 = this.c.getSpanStart(object0);
            int v3 = this.c.getSpanEnd(object0);
            if(v3 - 2 >= 0 && this.c.charAt(v3 - 1) == 10 && this.c.charAt(v3 - 2) == 10) {
                --v3;
            }
            if(v3 == v2) {
                this.c.removeSpan(object0);
            }
            else {
                this.c.setSpan(object0, v2, v3, 51);
            }
        }
        return this.c;
    }

    @Override  // org.xml.sax.ContentHandler
    public void characters(char[] arr_c, int v, int v1) {
        int v6;
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_c[v2 + v];
            if(v3 == 10 || v3 == 0x20) {
                int v4 = stringBuilder0.length();
                if(v4 == 0) {
                    int v5 = this.c.length();
                    v6 = v5 == 0 ? 10 : this.c.charAt(v5 - 1);
                }
                else {
                    v6 = stringBuilder0.charAt(v4 - 1);
                }
                if(v6 != 0x20 && v6 != 10) {
                    stringBuilder0.append(' ');
                }
            }
            else {
                stringBuilder0.append(((char)v3));
            }
        }
        this.c.append(stringBuilder0);
    }

    public static int d(CharSequence charSequence0, int v) {
        int v3;
        int v2;
        if(charSequence0 == null) {
            return v;
        }
        String s = charSequence0.toString();
        int v1 = s.length();
        if(45 == s.charAt(0)) {
            v2 = -1;
            v3 = 1;
        }
        else {
            v2 = 1;
            v3 = 0;
        }
        if(0x30 == s.charAt(v3)) {
            if(v3 == v1 - 1) {
                return 0;
            }
            int v4 = s.charAt(v3 + 1);
            return 120 == v4 || 88 == v4 ? Integer.parseInt(s.substring(v3 + 2), 16) * v2 : Integer.parseInt(s.substring(v3 + 1), 8) * v2;
        }
        return 35 == s.charAt(v3) ? Integer.parseInt(s.substring(v3 + 1), 16) * v2 : Integer.parseInt(s.substring(v3), 10) * v2;
    }

    private static void e(Editable editable0, Class class0, Object object0) {
        editable0.length();
        Object object1 = c.m(editable0, class0);
        if(object1 != null) {
            c.y(editable0, object1, new Object[]{object0});
        }
    }

    @Override  // org.xml.sax.ContentHandler
    public void endDocument() {
    }

    @Override  // org.xml.sax.ContentHandler
    public void endElement(String s, String s1, String s2) {
        this.w(s1);
    }

    @Override  // org.xml.sax.ContentHandler
    public void endPrefixMapping(String s) {
    }

    private static void f(Editable editable0) {
        j c$j0 = (j)c.m(editable0, j.class);
        if(c$j0 != null) {
            c.a(editable0, c$j0.a);
            editable0.removeSpan(c$j0);
        }
        a c$a0 = (a)c.m(editable0, a.class);
        if(c$a0 != null) {
            c.y(editable0, c$a0, new Object[]{new AlignmentSpan.Standard(c$a0.a)});
        }
    }

    private static void g(Editable editable0) {
        l c$l0 = (l)c.m(editable0, l.class);
        if(c$l0 != null) {
            c.y(editable0, c$l0, new Object[]{new StrikethroughSpan()});
        }
        f c$f0 = (f)c.m(editable0, f.class);
        if(c$f0 != null) {
            c.y(editable0, c$f0, new Object[]{new ForegroundColorSpan(c$f0.a)});
        }
        e c$e0 = (e)c.m(editable0, e.class);
        if(c$e0 != null) {
            c.y(editable0, c$e0, new Object[]{new RichFontSizeSpan(c$e0.a)});
        }
    }

    private static void h(Editable editable0) {
        com.dcinside.rich.html.c.d c$d0 = (com.dcinside.rich.html.c.d)c.m(editable0, com.dcinside.rich.html.c.d.class);
        if(c$d0 != null) {
            c.y(editable0, c$d0, new Object[]{new TypefaceSpan(c$d0.a)});
        }
        f c$f0 = (f)c.m(editable0, f.class);
        if(c$f0 != null) {
            c.y(editable0, c$f0, new Object[]{new ForegroundColorSpan(c$f0.a)});
        }
    }

    private static int i(@Nullable String s) {
        int v = s == null ? -1 : s.indexOf("px");
        if(v >= 0) {
            try {
                return Integer.parseInt(s.substring(0, v));
            }
            catch(Exception unused_ex) {
                return 15;
            }
        }
        if(s != null && TextUtils.isDigitsOnly(s)) {
            try {
                return Integer.parseInt(s);
            }
            catch(Exception unused_ex) {
            }
        }
        return 15;
    }

    @Override  // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] arr_c, int v, int v1) {
    }

    private static Pattern j() {
        if(c.g == null) {
            c.g = Pattern.compile("(?:\\s+|\\A)font-size\\s*:\\s*(\\S*)\\b");
        }
        return c.g;
    }

    private static Pattern k() {
        if(c.h == null) {
            c.h = Pattern.compile("(?:\\s+|\\A)color\\s*:\\s*(\\S*)\\b");
        }
        return c.h;
    }

    private static int l(@Nullable String s) {
        if(s == null) {
            return -1;
        }
        Integer integer0 = (Integer)c.j.get(s.toLowerCase());
        if(integer0 != null) {
            return (int)integer0;
        }
        try {
            return c.d(s, -1);
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
    }

    private static Object m(Spanned spanned0, Class class0) {
        Object[] arr_object = spanned0.getSpans(0, spanned0.length(), class0);
        return arr_object.length == 0 ? null : arr_object[arr_object.length - 1];
    }

    private int n(int v) {
        return (v & this.e) == 0 ? 2 : 1;
    }

    private int o() {
        return this.n(0x20);
    }

    private int p() {
        return this.n(16);
    }

    @Override  // org.xml.sax.ContentHandler
    public void processingInstruction(String s, String s1) {
    }

    private int q() {
        return this.n(2);
    }

    private int r() {
        return this.n(8);
    }

    private int s() {
        return this.n(1);
    }

    @Override  // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator0) {
    }

    @Override  // org.xml.sax.ContentHandler
    public void skippedEntity(String s) {
    }

    @Override  // org.xml.sax.ContentHandler
    public void startDocument() {
    }

    @Override  // org.xml.sax.ContentHandler
    public void startElement(String s, String s1, String s2, Attributes attributes0) {
        this.x(s1, attributes0);
    }

    @Override  // org.xml.sax.ContentHandler
    public void startPrefixMapping(String s, String s1) {
    }

    private static Pattern t() {
        if(c.f == null) {
            c.f = Pattern.compile("(?:\\s+|\\A)text-align\\s*:\\s*(\\S*)\\b");
        }
        return c.f;
    }

    private static Pattern u() {
        if(c.i == null) {
            c.i = Pattern.compile("(?:\\s+|\\A)text-decoration\\s*:\\s*(\\S*)\\b");
        }
        return c.i;
    }

    private static void v(Editable editable0) {
        editable0.append('\n');
    }

    private void w(String s) {
        if(s.equalsIgnoreCase("br")) {
            c.v(this.c);
            return;
        }
        if(s.equalsIgnoreCase("p")) {
            c.g(this.c);
            c.f(this.c);
            return;
        }
        if(s.equalsIgnoreCase("div")) {
            c.f(this.c);
            return;
        }
        if(s.equalsIgnoreCase("span")) {
            c.g(this.c);
            return;
        }
        Class class0 = com.dcinside.rich.html.c.c.class;
        if(s.equalsIgnoreCase("strong")) {
            StyleSpan styleSpan0 = new StyleSpan(1);
            c.e(this.c, class0, styleSpan0);
            return;
        }
        if(s.equalsIgnoreCase("b")) {
            StyleSpan styleSpan1 = new StyleSpan(1);
            c.e(this.c, class0, styleSpan1);
            return;
        }
        Class class1 = h.class;
        if(s.equalsIgnoreCase("em")) {
            StyleSpan styleSpan2 = new StyleSpan(2);
            c.e(this.c, class1, styleSpan2);
            return;
        }
        if(s.equalsIgnoreCase("cite")) {
            StyleSpan styleSpan3 = new StyleSpan(2);
            c.e(this.c, class1, styleSpan3);
            return;
        }
        if(s.equalsIgnoreCase("dfn")) {
            StyleSpan styleSpan4 = new StyleSpan(2);
            c.e(this.c, class1, styleSpan4);
            return;
        }
        if(s.equalsIgnoreCase("i")) {
            StyleSpan styleSpan5 = new StyleSpan(2);
            c.e(this.c, class1, styleSpan5);
            return;
        }
        if(s.equalsIgnoreCase("big")) {
            RelativeSizeSpan relativeSizeSpan0 = new RelativeSizeSpan(1.25f);
            c.e(this.c, b.class, relativeSizeSpan0);
            return;
        }
        if(s.equalsIgnoreCase("small")) {
            RelativeSizeSpan relativeSizeSpan1 = new RelativeSizeSpan(0.8f);
            c.e(this.c, k.class, relativeSizeSpan1);
            return;
        }
        if(s.equalsIgnoreCase("font")) {
            c.h(this.c);
            return;
        }
        if(s.equalsIgnoreCase("tt")) {
            TypefaceSpan typefaceSpan0 = new TypefaceSpan("monospace");
            c.e(this.c, i.class, typefaceSpan0);
            return;
        }
        if(s.equalsIgnoreCase("u")) {
            RichUnderlineSpan richUnderlineSpan0 = new RichUnderlineSpan();
            c.e(this.c, m.class, richUnderlineSpan0);
            return;
        }
        Class class2 = l.class;
        if(s.equalsIgnoreCase("del")) {
            StrikethroughSpan strikethroughSpan0 = new StrikethroughSpan();
            c.e(this.c, class2, strikethroughSpan0);
            return;
        }
        if(s.equalsIgnoreCase("s")) {
            StrikethroughSpan strikethroughSpan1 = new StrikethroughSpan();
            c.e(this.c, class2, strikethroughSpan1);
            return;
        }
        if(s.equalsIgnoreCase("strike")) {
            StrikethroughSpan strikethroughSpan2 = new StrikethroughSpan();
            c.e(this.c, class2, strikethroughSpan2);
            return;
        }
        if(s.equalsIgnoreCase("")) {
            BackgroundColorSpan backgroundColorSpan0 = new BackgroundColorSpan(0);
            c.e(this.c, String.class, backgroundColorSpan0);
            return;
        }
        com.dcinside.rich.html.a.a a$a0 = this.d;
        if(a$a0 != null) {
            a$a0.a(false, s, this.c, this.b);
        }
    }

    private void x(String s, Attributes attributes0) {
        if(!s.equalsIgnoreCase("br")) {
            if(s.equalsIgnoreCase("p")) {
                int v = this.s();
                c.A(this.c, attributes0, v);
                this.B(this.c, attributes0);
                return;
            }
            if(s.equalsIgnoreCase("div")) {
                int v1 = this.p();
                c.A(this.c, attributes0, v1);
                return;
            }
            if(s.equalsIgnoreCase("span")) {
                this.B(this.c, attributes0);
                return;
            }
            if(s.equalsIgnoreCase("strong")) {
                com.dcinside.rich.html.c.c c$c0 = new com.dcinside.rich.html.c.c(null);
                c.z(this.c, c$c0);
                return;
            }
            if(s.equalsIgnoreCase("b")) {
                com.dcinside.rich.html.c.c c$c1 = new com.dcinside.rich.html.c.c(null);
                c.z(this.c, c$c1);
                return;
            }
            if(s.equalsIgnoreCase("em")) {
                h c$h0 = new h(null);
                c.z(this.c, c$h0);
                return;
            }
            if(s.equalsIgnoreCase("cite")) {
                h c$h1 = new h(null);
                c.z(this.c, c$h1);
                return;
            }
            if(s.equalsIgnoreCase("dfn")) {
                h c$h2 = new h(null);
                c.z(this.c, c$h2);
                return;
            }
            if(s.equalsIgnoreCase("i")) {
                h c$h3 = new h(null);
                c.z(this.c, c$h3);
                return;
            }
            if(s.equalsIgnoreCase("big")) {
                b c$b0 = new b(null);
                c.z(this.c, c$b0);
                return;
            }
            if(s.equalsIgnoreCase("small")) {
                k c$k0 = new k(null);
                c.z(this.c, c$k0);
                return;
            }
            if(s.equalsIgnoreCase("font")) {
                this.C(this.c, attributes0);
                return;
            }
            if(s.equalsIgnoreCase("tt")) {
                i c$i0 = new i(null);
                c.z(this.c, c$i0);
                return;
            }
            if(s.equalsIgnoreCase("u")) {
                m c$m0 = new m(null);
                c.z(this.c, c$m0);
                return;
            }
            if(s.equalsIgnoreCase("del")) {
                l c$l0 = new l(null);
                c.z(this.c, c$l0);
                return;
            }
            if(s.equalsIgnoreCase("s")) {
                l c$l1 = new l(null);
                c.z(this.c, c$l1);
                return;
            }
            if(s.equalsIgnoreCase("strike")) {
                l c$l2 = new l(null);
                c.z(this.c, c$l2);
                return;
            }
            if(s.equalsIgnoreCase("ignore")) {
                c.z(this.c, "ignore");
                return;
            }
            com.dcinside.rich.html.a.a a$a0 = this.d;
            if(a$a0 != null) {
                a$a0.a(true, s, this.c, this.b);
            }
        }
    }

    private static void y(Spannable spannable0, Object object0, Object[] arr_object) {
        int v = spannable0.getSpanStart(object0);
        spannable0.removeSpan(object0);
        int v1 = spannable0.length();
        if(v != v1) {
            for(int v2 = 0; v2 < arr_object.length; ++v2) {
                spannable0.setSpan(arr_object[v2], v, v1, 33);
            }
        }
    }

    private static void z(Editable editable0, Object object0) {
        int v = editable0.length();
        editable0.setSpan(object0, v, v, 17);
    }
}

