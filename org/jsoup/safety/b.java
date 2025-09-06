package org.jsoup.safety;

import j..util.Map.-EL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.jsoup.helper.i;
import org.jsoup.internal.f;
import org.jsoup.internal.g;
import org.jsoup.nodes.o;

public class b {
    static class a extends e {
        a(String s) {
            super(s);
        }

        static a a(String s) {
            return new a(g.a(s));
        }
    }

    static class org.jsoup.safety.b.b extends e {
        org.jsoup.safety.b.b(String s) {
            super(s);
        }

        static org.jsoup.safety.b.b a(String s) {
            return new org.jsoup.safety.b.b(s);
        }
    }

    static class c extends e {
        c(String s) {
            super(s);
        }

        static c a(String s) {
            return new c(s);
        }
    }

    static class d extends e {
        d(String s) {
            super(s);
        }

        static d a(String s) {
            return new d(g.a(s));
        }
    }

    static abstract class e {
        private final String a;

        e(String s) {
            i.o(s);
            this.a = s;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            if(this.getClass() != object0.getClass()) {
                return false;
            }
            return this.a == null ? ((e)object0).a == null : this.a.equals(((e)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0x1F : this.a.hashCode() + 0x1F;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final Set a;
    private final Map b;
    private final Map c;
    private final Map d;
    private boolean e;
    private static final String f = ":all";

    public b() {
        this.a = new HashSet();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = false;
    }

    public b(b b0) {
        this.a.addAll(b0.a);
        for(Object object0: b0.b.entrySet()) {
            d b$d0 = (d)((Map.Entry)object0).getKey();
            HashSet hashSet0 = new HashSet(((Collection)((Map.Entry)object0).getValue()));
            this.b.put(b$d0, hashSet0);
        }
        for(Object object1: b0.c.entrySet()) {
            d b$d1 = (d)((Map.Entry)object1).getKey();
            HashMap hashMap0 = new HashMap(((Map)((Map.Entry)object1).getValue()));
            this.c.put(b$d1, hashMap0);
        }
        for(Object object2: b0.d.entrySet()) {
            HashMap hashMap1 = new HashMap();
            for(Object object3: ((Map)((Map.Entry)object2).getValue()).entrySet()) {
                hashMap1.put(((a)((Map.Entry)object3).getKey()), new HashSet(((Collection)((Map.Entry)object3).getValue())));
            }
            d b$d2 = (d)((Map.Entry)object2).getKey();
            this.d.put(b$d2, hashMap1);
        }
        this.e = b0.e;
    }

    public b a(String s, String[] arr_s) {
        i.l(s);
        i.o(arr_s);
        i.i(arr_s.length > 0, "No attribute names supplied.");
        this.d(new String[]{s});
        d b$d0 = d.a(s);
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            i.l(s1);
            hashSet0.add(a.a(s1));
        }
        ((Set)Map.-EL.computeIfAbsent(this.b, b$d0, f.l())).addAll(hashSet0);
        return this;
    }

    public b b(String s, String s1, String s2) {
        i.l(s);
        i.l(s1);
        i.l(s2);
        d b$d0 = d.a(s);
        this.a.add(b$d0);
        a b$a0 = a.a(s1);
        org.jsoup.safety.b.b b$b0 = org.jsoup.safety.b.b.a(s2);
        Function function0 = f.k();
        ((Map)Map.-EL.computeIfAbsent(this.c, b$d0, function0)).put(b$a0, b$b0);
        return this;
    }

    public b c(String s, String s1, String[] arr_s) {
        i.l(s);
        i.l(s1);
        i.o(arr_s);
        d b$d0 = d.a(s);
        a b$a0 = a.a(s1);
        Set set0 = (Set)Map.-EL.computeIfAbsent(((Map)Map.-EL.computeIfAbsent(this.d, b$d0, f.k())), b$a0, f.l());
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            i.l(s2);
            set0.add(c.a(s2));
        }
        return this;
    }

    public b d(String[] arr_s) {
        i.o(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            i.l(s);
            i.g(s.equalsIgnoreCase("noscript"), "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled");
            d b$d0 = d.a(s);
            this.a.add(b$d0);
        }
        return this;
    }

    public static b e() {
        return new b().d(new String[]{"a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul"}).a("a", new String[]{"href"}).a("blockquote", new String[]{"cite"}).a("q", new String[]{"cite"}).c("a", "href", new String[]{"ftp", "http", "https", "mailto"}).c("blockquote", "cite", new String[]{"http", "https"}).c("cite", "cite", new String[]{"http", "https"}).b("a", "rel", "nofollow");
    }

    public static b f() {
        return b.e().d(new String[]{"img"}).a("img", new String[]{"align", "alt", "height", "src", "title", "width"}).c("img", "src", new String[]{"http", "https"});
    }

    public org.jsoup.nodes.b g(String s) {
        org.jsoup.nodes.b b0 = new org.jsoup.nodes.b();
        d b$d0 = d.a(s);
        if(this.c.containsKey(b$d0)) {
            for(Object object0: ((Map)this.c.get(b$d0)).entrySet()) {
                b0.H(((a)((Map.Entry)object0).getKey()).toString(), ((org.jsoup.safety.b.b)((Map.Entry)object0).getValue()).toString());
            }
        }
        return b0;
    }

    public boolean h(String s, o o0, org.jsoup.nodes.a a0) {
        d b$d0 = d.a(s);
        a b$a0 = a.a(a0.c());
        Set set0 = (Set)this.b.get(b$d0);
        if(set0 != null && set0.contains(b$a0)) {
            if(this.d.containsKey(b$d0)) {
                Map map0 = (Map)this.d.get(b$d0);
                return !map0.containsKey(b$a0) || this.s(o0, a0, ((Set)map0.get(b$a0)));
            }
            return true;
        }
        if(((Map)this.c.get(b$d0)) != null) {
            org.jsoup.nodes.b b0 = this.g(s);
            String s1 = a0.c();
            return b0.z(s1) ? b0.t(s1).equals(a0.e()) : !s.equals(":all") && this.h(":all", o0, a0);
        }
        return !s.equals(":all") && this.h(":all", o0, a0);
    }

    public boolean i(String s) {
        d b$d0 = d.a(s);
        return this.a.contains(b$d0);
    }

    // 去混淆评级： 低(20)
    private boolean j(String s) {
        return s.startsWith("#") && !s.matches(".*\\s.*");
    }

    public static b k() {
        return new b();
    }

    public b l(boolean z) {
        this.e = z;
        return this;
    }

    public static b m() {
        return new b().d(new String[]{"a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul"}).a("a", new String[]{"href", "title"}).a("blockquote", new String[]{"cite"}).a("col", new String[]{"span", "width"}).a("colgroup", new String[]{"span", "width"}).a("img", new String[]{"align", "alt", "height", "src", "title", "width"}).a("ol", new String[]{"start", "type"}).a("q", new String[]{"cite"}).a("table", new String[]{"summary", "width"}).a("td", new String[]{"abbr", "axis", "colspan", "rowspan", "width"}).a("th", new String[]{"abbr", "axis", "colspan", "rowspan", "scope", "width"}).a("ul", new String[]{"type"}).c("a", "href", new String[]{"ftp", "http", "https", "mailto"}).c("blockquote", "cite", new String[]{"http", "https"}).c("cite", "cite", new String[]{"http", "https"}).c("img", "src", new String[]{"http", "https"}).c("q", "cite", new String[]{"http", "https"});
    }

    public b n(String s, String[] arr_s) {
        i.l(s);
        i.o(arr_s);
        i.i(arr_s.length > 0, "No attribute names supplied.");
        d b$d0 = d.a(s);
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            i.l(s1);
            hashSet0.add(a.a(s1));
        }
        if(this.a.contains(b$d0) && this.b.containsKey(b$d0)) {
            Set set0 = (Set)this.b.get(b$d0);
            set0.removeAll(hashSet0);
            if(set0.isEmpty()) {
                this.b.remove(b$d0);
            }
        }
        if(s.equals(":all")) {
            Iterator iterator0 = this.b.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Set set1 = (Set)((Map.Entry)object0).getValue();
                set1.removeAll(hashSet0);
                if(set1.isEmpty()) {
                    iterator0.remove();
                }
            }
        }
        return this;
    }

    public b o(String s, String s1) {
        i.l(s);
        i.l(s1);
        d b$d0 = d.a(s);
        if(this.a.contains(b$d0) && this.c.containsKey(b$d0)) {
            a b$a0 = a.a(s1);
            Map map0 = (Map)this.c.get(b$d0);
            map0.remove(b$a0);
            if(map0.isEmpty()) {
                this.c.remove(b$d0);
            }
        }
        return this;
    }

    public b p(String s, String s1, String[] arr_s) {
        i.l(s);
        i.l(s1);
        i.o(arr_s);
        d b$d0 = d.a(s);
        a b$a0 = a.a(s1);
        i.i(this.d.containsKey(b$d0), "Cannot remove a protocol that is not set.");
        Map map0 = (Map)this.d.get(b$d0);
        i.i(map0.containsKey(b$a0), "Cannot remove a protocol that is not set.");
        Set set0 = (Set)map0.get(b$a0);
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            i.l(s2);
            set0.remove(c.a(s2));
        }
        if(set0.isEmpty()) {
            map0.remove(b$a0);
            if(map0.isEmpty()) {
                this.d.remove(b$d0);
            }
        }
        return this;
    }

    public b q(String[] arr_s) {
        i.o(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            i.l(s);
            d b$d0 = d.a(s);
            if(this.a.remove(b$d0)) {
                this.b.remove(b$d0);
                this.c.remove(b$d0);
                this.d.remove(b$d0);
            }
        }
        return this;
    }

    public static b r() {
        return new b().d(new String[]{"b", "em", "i", "strong", "u"});
    }

    private boolean s(o o0, org.jsoup.nodes.a a0, Set set0) {
        String s = o0.a(a0.c());
        if(s.length() == 0) {
            s = a0.e();
        }
        if(!this.e) {
            a0.p(s);
        }
        for(Object object0: set0) {
            String s1 = ((c)object0).toString();
            if(s1.equals("#")) {
                if(!this.j(s)) {
                    continue;
                }
                return true;
            }
            if(g.a(s).startsWith(s1 + ":")) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

