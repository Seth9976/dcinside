package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.jsoup.b.b;
import org.jsoup.internal.n;

final class h {
    URL a;
    StringBuilder b;
    private static final String c = "<>\"{}|\\^[]`";
    static final boolean d;

    static {
    }

    h(URL uRL0) {
        this.a = uRL0;
        if(uRL0.getQuery() != null) {
            StringBuilder stringBuilder0 = n.d();
            stringBuilder0.append(this.a.getQuery());
            this.b = stringBuilder0;
        }
    }

    void a(b b$b0) throws UnsupportedEncodingException {
        StringBuilder stringBuilder0 = this.b;
        if(stringBuilder0 == null) {
            this.b = n.d();
        }
        else {
            stringBuilder0.append('&');
        }
        StringBuilder stringBuilder1 = this.b;
        stringBuilder1.append(URLEncoder.encode(b$b0.key(), "UTF-8"));
        stringBuilder1.append('=');
        stringBuilder1.append(URLEncoder.encode(b$b0.value(), "UTF-8"));
    }

    private static void b(String s, boolean z, StringBuilder stringBuilder0) throws UnsupportedEncodingException {
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.codePointAt(v);
            if(v1 == 0x20) {
                Character character0 = z ? Character.valueOf('+') : "%20";
                stringBuilder0.append(character0);
            }
            else if(v1 == 37) {
                if(v >= s.length() - 2 || !h.e(s.charAt(v + 1)) || !h.e(s.charAt(v + 2))) {
                    stringBuilder0.append("%25");
                }
                else {
                    stringBuilder0.append('%');
                    stringBuilder0.append(s.charAt(v + 1));
                    stringBuilder0.append(s.charAt(v + 2));
                    v += 2;
                }
            }
            else if(v1 > 0x7F || "<>\"{}|\\^[]`".indexOf(v1) != -1) {
                stringBuilder0.append(URLEncoder.encode(new String(Character.toChars(v1)), "UTF-8"));
                if(Character.charCount(v1) == 2) {
                    ++v;
                }
            }
            else {
                stringBuilder0.append(((char)v1));
            }
        }
    }

    URL c() {
        try {
            URI uRI0 = new URI(this.a.getProtocol(), this.a.getUserInfo(), IDN.toASCII(h.d(this.a.getHost())), this.a.getPort(), null, null, null);
            StringBuilder stringBuilder0 = n.d();
            stringBuilder0.append(uRI0.toASCIIString());
            h.b(this.a.getPath(), false, stringBuilder0);
            if(this.b != null) {
                stringBuilder0.append('?');
                h.b(n.v(this.b), true, stringBuilder0);
            }
            if(this.a.getRef() != null) {
                stringBuilder0.append('#');
                h.b(this.a.getRef(), false, stringBuilder0);
            }
            URL uRL0 = new URL(n.v(stringBuilder0));
            this.a = uRL0;
            return uRL0;
        }
        catch(MalformedURLException | URISyntaxException | UnsupportedEncodingException unused_ex) {
            return this.a;
        }
    }

    private static String d(String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    // 去混淆评级： 低(30)
    private static boolean e(char c) {
        return c >= 0x30 && c <= 57 || c >= 65 && c <= 70 || c >= 97 && c <= 102;
    }
}

