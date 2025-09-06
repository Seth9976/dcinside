package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.function.Consumer;
import org.jsoup.helper.i;
import org.jsoup.internal.g;

public class q implements Cloneable {
    private String a;
    private final String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private static final Map k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private static final String[] q;
    private static final String[] r;
    private static final Map s;

    static {
        q.k = new HashMap();
        String[] arr_s = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        q.l = arr_s;
        String[] arr_s1 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"};
        q.m = arr_s1;
        String[] arr_s2 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        q.n = arr_s2;
        String[] arr_s3 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s", "button"};
        q.o = arr_s3;
        String[] arr_s4 = {"pre", "plaintext", "title", "textarea"};
        q.p = arr_s4;
        String[] arr_s5 = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        q.q = arr_s5;
        String[] arr_s6 = {"input", "keygen", "object", "select", "textarea"};
        q.r = arr_s6;
        HashMap hashMap0 = new HashMap();
        q.s = hashMap0;
        hashMap0.put("http://www.w3.org/1998/Math/MathML", new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        hashMap0.put("http://www.w3.org/2000/svg", new String[]{"svg", "text"});
        q.G(arr_s, (q q0) -> {
            q0.d = true;
            q0.e = true;
        });
        q.G(arr_s1, (q q0) -> {
            q0.d = false;
            q0.e = false;
        });
        q.G(arr_s2, (q q0) -> q0.f = true);
        q.G(arr_s3, (q q0) -> q0.e = false);
        q.G(arr_s4, (q q0) -> q0.h = true);
        q.G(arr_s5, (q q0) -> q0.i = true);
        q.G(arr_s6, (q q0) -> q0.j = true);
        for(Object object0: hashMap0.entrySet()) {
            q.G(((String[])((Map.Entry)object0).getValue()), (q q0) -> q0.c = (String)((Map.Entry)object0).getKey());
        }
    }

    private q(String s, String s1) {
        this.d = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.a = s;
        this.b = g.a(s);
        this.c = s1;
    }

    // 检测为 Lambda 实现
    private static void A(q q0) [...]

    // 检测为 Lambda 实现
    private static void B(Map.Entry map$Entry0, q q0) [...]

    public String C() {
        return this.c;
    }

    public String D() {
        return this.b;
    }

    public boolean E() {
        return this.h;
    }

    q F() {
        this.g = true;
        return this;
    }

    private static void G(String[] arr_s, Consumer consumer0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Map map0 = q.k;
            q q0 = (q)map0.get(s);
            if(q0 == null) {
                q0 = new q(s, "http://www.w3.org/1999/xhtml");
                map0.put(q0.a, q0);
            }
            consumer0.accept(q0);
        }
    }

    public static q H(String s) {
        return q.I(s, "http://www.w3.org/1999/xhtml", f.d);
    }

    public static q I(String s, String s1, f f0) {
        i.l(s);
        i.o(s1);
        Map map0 = q.k;
        q q0 = (q)map0.get(s);
        if(q0 != null && q0.c.equals(s1)) {
            return q0;
        }
        String s2 = f0.d(s);
        i.l(s2);
        String s3 = g.a(s2);
        q q1 = (q)map0.get(s3);
        if(q1 != null && q1.c.equals(s1)) {
            if(f0.f() && !s2.equals(s3)) {
                q1 = q1.j();
                q1.a = s2;
            }
            return q1;
        }
        q q2 = new q(s2, s1);
        q2.d = false;
        return q2;
    }

    public static q J(String s, f f0) {
        return q.I(s, "http://www.w3.org/1999/xhtml", f0);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.j();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(!this.a.equals(((q)object0).a)) {
            return false;
        }
        if(this.f != ((q)object0).f) {
            return false;
        }
        if(this.e != ((q)object0).e) {
            return false;
        }
        if(this.d != ((q)object0).d) {
            return false;
        }
        if(this.h != ((q)object0).h) {
            return false;
        }
        if(this.g != ((q)object0).g) {
            return false;
        }
        return this.i == ((q)object0).i ? this.j == ((q)object0).j : false;
    }

    @Override
    public int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + this.j;
    }

    protected q j() {
        try {
            return (q)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    public boolean k() {
        return this.e;
    }

    public String l() {
        return this.a;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.f;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.j;
    }

    public boolean q() {
        return !this.d;
    }

    public boolean r() {
        return q.k.containsKey(this.a);
    }

    public static boolean s(String s) {
        return q.k.containsKey(s);
    }

    // 去混淆评级： 低(20)
    public boolean t() {
        return this.f || this.g;
    }

    @Override
    public String toString() {
        return this.a;
    }

    // 检测为 Lambda 实现
    private static void u(q q0) [...]

    // 检测为 Lambda 实现
    private static void v(q q0) [...]

    // 检测为 Lambda 实现
    private static void w(q q0) [...]

    // 检测为 Lambda 实现
    private static void x(q q0) [...]

    // 检测为 Lambda 实现
    private static void y(q q0) [...]

    // 检测为 Lambda 实现
    private static void z(q q0) [...]
}

