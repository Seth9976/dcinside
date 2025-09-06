package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.base.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class WebvttCssParser {
    private final ParsableByteArray a;
    private final StringBuilder b;
    private static final String c = "WebvttCssParser";
    private static final String d = "{";
    private static final String e = "}";
    private static final String f = "color";
    private static final String g = "background-color";
    private static final String h = "font-family";
    private static final String i = "font-weight";
    private static final String j = "font-size";
    private static final String k = "ruby-position";
    private static final String l = "over";
    private static final String m = "under";
    private static final String n = "text-combine-upright";
    private static final String o = "all";
    private static final String p = "digits";
    private static final String q = "text-decoration";
    private static final String r = "bold";
    private static final String s = "underline";
    private static final String t = "font-style";
    private static final String u = "italic";
    private static final Pattern v;
    private static final Pattern w;

    static {
        WebvttCssParser.v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        WebvttCssParser.w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }

    public WebvttCssParser() {
        this.a = new ParsableByteArray();
        this.b = new StringBuilder();
    }

    private void a(WebvttCssStyle webvttCssStyle0, String s) {
        if("".equals(s)) {
            return;
        }
        int v = s.indexOf(91);
        if(v != -1) {
            Matcher matcher0 = WebvttCssParser.v.matcher(s.substring(v));
            if(matcher0.matches()) {
                webvttCssStyle0.A(((String)Assertions.g(matcher0.group(1))));
            }
            s = s.substring(0, v);
        }
        String[] arr_s = Util.m2(s, "\\.");
        String s1 = arr_s[0];
        int v1 = s1.indexOf(35);
        if(v1 == -1) {
            webvttCssStyle0.z(s1);
        }
        else {
            webvttCssStyle0.z(s1.substring(0, v1));
            webvttCssStyle0.y(s1.substring(v1 + 1));
        }
        if(arr_s.length > 1) {
            webvttCssStyle0.x(((String[])Util.M1(arr_s, 1, arr_s.length)));
        }
    }

    private static boolean b(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        byte[] arr_b = parsableByteArray0.e();
        if(v + 2 <= v1 && arr_b[v] == 0x2F) {
            int v2 = v + 2;
            if(arr_b[v + 1] == 42) {
                while(v2 + 1 < v1) {
                    if(((char)arr_b[v2]) == 42 && ((char)arr_b[v2 + 1]) == 0x2F) {
                        v2 += 2;
                        v1 = v2;
                    }
                    else {
                        ++v2;
                    }
                }
                parsableByteArray0.Z(v1 - parsableByteArray0.f());
                return true;
            }
        }
        return false;
    }

    private static boolean c(ParsableByteArray parsableByteArray0) {
        switch(WebvttCssParser.k(parsableByteArray0, parsableByteArray0.f())) {
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: {
                parsableByteArray0.Z(1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public List d(ParsableByteArray parsableByteArray0) {
        this.b.setLength(0);
        WebvttCssParser.m(parsableByteArray0);
        this.a.W(parsableByteArray0.e(), parsableByteArray0.f());
        this.a.Y(parsableByteArray0.f());
        List list0 = new ArrayList();
        while(true) {
            String s = WebvttCssParser.i(this.a, this.b);
            if(s == null || !"{".equals(WebvttCssParser.g(this.a, this.b))) {
                break;
            }
            WebvttCssStyle webvttCssStyle0 = new WebvttCssStyle();
            this.a(webvttCssStyle0, s);
            String s1 = null;
            for(int v = 0; v == 0; v = v2) {
                int v1 = this.a.f();
                String s2 = WebvttCssParser.g(this.a, this.b);
                int v2 = s2 == null || "}".equals(s2) ? 1 : 0;
                if(v2 == 0) {
                    this.a.Y(v1);
                    WebvttCssParser.j(this.a, webvttCssStyle0, this.b);
                }
                s1 = s2;
            }
            if("}".equals(s1)) {
                list0.add(webvttCssStyle0);
            }
        }
        return list0;
    }

    private static void e(String s, WebvttCssStyle webvttCssStyle0) {
        String s1 = c.g(s);
        Matcher matcher0 = WebvttCssParser.w.matcher(s1);
        if(!matcher0.matches()) {
            Log.n("WebvttCssParser", "Invalid font-size: \'" + s + "\'.");
            return;
        }
        String s2 = (String)Assertions.g(matcher0.group(2));
        s2.hashCode();
        switch(s2) {
            case "%": {
                webvttCssStyle0.t(3);
                break;
            }
            case "em": {
                webvttCssStyle0.t(2);
                break;
            }
            case "px": {
                webvttCssStyle0.t(1);
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        webvttCssStyle0.s(Float.parseFloat(((String)Assertions.g(matcher0.group(1)))));
    }

    private static String f(ParsableByteArray parsableByteArray0, StringBuilder stringBuilder0) {
        boolean z = false;
        stringBuilder0.setLength(0);
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1 && !z) {
            int v2 = (char)parsableByteArray0.e()[v];
            if((v2 < 65 || v2 > 90) && (v2 < 97 || v2 > 0x7A) && (v2 < 0x30 || v2 > 57) && (v2 != 35 && v2 != 45 && v2 != 46 && v2 != 0x5F)) {
                z = true;
            }
            else {
                ++v;
                stringBuilder0.append(((char)v2));
            }
        }
        parsableByteArray0.Z(v - parsableByteArray0.f());
        return stringBuilder0.toString();
    }

    @Nullable
    static String g(ParsableByteArray parsableByteArray0, StringBuilder stringBuilder0) {
        WebvttCssParser.n(parsableByteArray0);
        if(parsableByteArray0.a() == 0) {
            return null;
        }
        String s = WebvttCssParser.f(parsableByteArray0, stringBuilder0);
        return "".equals(s) ? "" + ((char)parsableByteArray0.L()) : s;
    }

    @Nullable
    private static String h(ParsableByteArray parsableByteArray0, StringBuilder stringBuilder0) {
        StringBuilder stringBuilder1 = new StringBuilder();
        boolean z = false;
        while(!z) {
            int v = parsableByteArray0.f();
            String s = WebvttCssParser.g(parsableByteArray0, stringBuilder0);
            if(s == null) {
                return null;
            }
            if(!"}".equals(s) && !";".equals(s)) {
                stringBuilder1.append(s);
            }
            else {
                parsableByteArray0.Y(v);
                z = true;
            }
        }
        return stringBuilder1.toString();
    }

    @Nullable
    private static String i(ParsableByteArray parsableByteArray0, StringBuilder stringBuilder0) {
        WebvttCssParser.n(parsableByteArray0);
        if(parsableByteArray0.a() < 5) {
            return null;
        }
        if(!"::cue".equals(parsableByteArray0.I(5))) {
            return null;
        }
        int v = parsableByteArray0.f();
        String s = WebvttCssParser.g(parsableByteArray0, stringBuilder0);
        if(s == null) {
            return null;
        }
        if("{".equals(s)) {
            parsableByteArray0.Y(v);
            return "";
        }
        String s1 = "(".equals(s) ? WebvttCssParser.l(parsableByteArray0) : null;
        return ")".equals(WebvttCssParser.g(parsableByteArray0, stringBuilder0)) ? s1 : null;
    }

    private static void j(ParsableByteArray parsableByteArray0, WebvttCssStyle webvttCssStyle0, StringBuilder stringBuilder0) {
        WebvttCssParser.n(parsableByteArray0);
        String s = WebvttCssParser.f(parsableByteArray0, stringBuilder0);
        if("".equals(s)) {
            return;
        }
        if(!":".equals(WebvttCssParser.g(parsableByteArray0, stringBuilder0))) {
            return;
        }
        WebvttCssParser.n(parsableByteArray0);
        String s1 = WebvttCssParser.h(parsableByteArray0, stringBuilder0);
        if(s1 != null && !"".equals(s1)) {
            int v = parsableByteArray0.f();
            String s2 = WebvttCssParser.g(parsableByteArray0, stringBuilder0);
            if(";".equals(s2)) {
            label_14:
                boolean z = true;
                if("color".equals(s)) {
                    webvttCssStyle0.q(ColorParser.b(s1));
                    return;
                }
                if("background-color".equals(s)) {
                    webvttCssStyle0.n(ColorParser.b(s1));
                    return;
                }
                if("ruby-position".equals(s)) {
                    if("over".equals(s1)) {
                        webvttCssStyle0.w(1);
                        return;
                    }
                    if("under".equals(s1)) {
                        webvttCssStyle0.w(2);
                    }
                }
                else {
                    if("text-combine-upright".equals(s)) {
                        if(!"all".equals(s1) && !s1.startsWith("digits")) {
                            z = false;
                        }
                        webvttCssStyle0.p(z);
                        return;
                    }
                    if(!"text-decoration".equals(s)) {
                        if("font-family".equals(s)) {
                            webvttCssStyle0.r(s1);
                            return;
                        }
                        if("font-weight".equals(s)) {
                            if("bold".equals(s1)) {
                                webvttCssStyle0.o(true);
                            }
                        }
                        else if("font-style".equals(s)) {
                            if("italic".equals(s1)) {
                                webvttCssStyle0.u(true);
                            }
                        }
                        else if("font-size".equals(s)) {
                            WebvttCssParser.e(s1, webvttCssStyle0);
                        }
                    }
                    else if("underline".equals(s1)) {
                        webvttCssStyle0.B(true);
                    }
                }
            }
            else if("}".equals(s2)) {
                parsableByteArray0.Y(v);
                goto label_14;
            }
        }
    }

    private static char k(ParsableByteArray parsableByteArray0, int v) {
        return (char)parsableByteArray0.e()[v];
    }

    private static String l(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        boolean z = false;
        while(v < v1 && !z) {
            z = ((char)parsableByteArray0.e()[v]) == 41;
            ++v;
        }
        return parsableByteArray0.I(v - 1 - parsableByteArray0.f()).trim();
    }

    static void m(ParsableByteArray parsableByteArray0) {
        while(!TextUtils.isEmpty(parsableByteArray0.u())) {
        }
    }

    static void n(ParsableByteArray parsableByteArray0) {
    alab1:
        while(true) {
            for(boolean z = true; true; z = false) {
                if(parsableByteArray0.a() <= 0 || !z) {
                    break alab1;
                }
                if(WebvttCssParser.c(parsableByteArray0) || WebvttCssParser.b(parsableByteArray0)) {
                    break;
                }
            }
        }
    }
}

