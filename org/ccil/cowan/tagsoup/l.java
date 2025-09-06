package org.ccil.cowan.tagsoup;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public class l extends DefaultHandler implements m, XMLReader, LexicalHandler {
    private d A;
    private d B;
    private int C;
    private boolean D;
    private char[] E;
    private static boolean F = true;
    private static boolean G = false;
    private static boolean H = false;
    private static boolean I = true;
    private static boolean J = true;
    private static boolean K = false;
    private static boolean L = true;
    private static boolean M = false;
    private static boolean N = true;
    public static final String O = "http://xml.org/sax/features/namespaces";
    public static final String P = "http://xml.org/sax/features/namespace-prefixes";
    public static final String Q = "http://xml.org/sax/features/external-general-entities";
    public static final String R = "http://xml.org/sax/features/external-parameter-entities";
    public static final String S = "http://xml.org/sax/features/is-standalone";
    public static final String T = "http://xml.org/sax/features/lexical-handler/parameter-entities";
    public static final String U = "http://xml.org/sax/features/resolve-dtd-uris";
    public static final String V = "http://xml.org/sax/features/string-interning";
    public static final String W = "http://xml.org/sax/features/use-attributes2";
    public static final String X = "http://xml.org/sax/features/use-locator2";
    public static final String Y = "http://xml.org/sax/features/use-entity-resolver2";
    public static final String Z = "http://xml.org/sax/features/validation";
    private ContentHandler a;
    public static final String a0 = "http://xml.org/sax/features/unicode-normalization-checking";
    private LexicalHandler b;
    public static final String b0 = "http://xml.org/sax/features/xmlns-uris";
    private DTDHandler c;
    public static final String c0 = "http://xml.org/sax/features/xml-1.1";
    private ErrorHandler d;
    public static final String d0 = "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons";
    private EntityResolver e;
    public static final String e0 = "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty";
    private o f;
    public static final String f0 = "http://www.ccil.org/~cowan/tagsoup/features/root-bogons";
    private n g;
    public static final String g0 = "http://www.ccil.org/~cowan/tagsoup/features/default-attributes";
    private b h;
    public static final String h0 = "http://www.ccil.org/~cowan/tagsoup/features/translate-colons";
    private boolean i;
    public static final String i0 = "http://www.ccil.org/~cowan/tagsoup/features/restart-elements";
    private boolean j;
    public static final String j0 = "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace";
    private boolean k;
    public static final String k0 = "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements";
    private boolean l;
    public static final String l0 = "http://xml.org/sax/properties/lexical-handler";
    private boolean m;
    public static final String m0 = "http://www.ccil.org/~cowan/tagsoup/properties/scanner";
    private boolean n;
    public static final String n0 = "http://www.ccil.org/~cowan/tagsoup/properties/schema";
    private boolean o;
    public static final String o0 = "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector";
    private boolean p;
    private static char[] p0;
    private boolean q;
    private static String q0;
    private HashMap r;
    private d s;
    private String t;
    private boolean u;
    private String v;
    private String w;
    private String x;
    private String y;
    private d z;

    static {
        l.p0 = new char[]{'<', '/', '>'};
        l.q0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-\'()+,./:=?;!*#@$_%";
    }

    public l() {
        this.a = this;
        this.b = this;
        this.c = this;
        this.d = this;
        this.e = this;
        this.i = l.F;
        this.j = l.G;
        this.k = l.H;
        this.l = l.I;
        this.m = l.J;
        this.n = l.K;
        this.o = l.L;
        this.p = l.M;
        this.q = l.N;
        HashMap hashMap0 = new HashMap();
        this.r = hashMap0;
        hashMap0.put("http://xml.org/sax/features/namespaces", l.I(l.F));
        this.r.put("http://xml.org/sax/features/namespace-prefixes", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/external-general-entities", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/external-parameter-entities", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/is-standalone", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/lexical-handler/parameter-entities", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/resolve-dtd-uris", Boolean.TRUE);
        this.r.put("http://xml.org/sax/features/string-interning", Boolean.TRUE);
        this.r.put("http://xml.org/sax/features/use-attributes2", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/use-locator2", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/use-entity-resolver2", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/validation", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/xmlns-uris", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/xmlns-uris", Boolean.FALSE);
        this.r.put("http://xml.org/sax/features/xml-1.1", Boolean.FALSE);
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons", l.I(l.G));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", l.I(l.H));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/root-bogons", l.I(l.I));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/default-attributes", l.I(l.J));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/translate-colons", l.I(l.K));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/restart-elements", l.I(l.L));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace", l.I(l.M));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements", l.I(l.N));
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = 0;
        this.D = true;
        this.E = new char[2000];
    }

    private String A(String s) {
        int v = s.indexOf(58);
        return v == -1 ? "" : s.substring(0, v);
    }

    private void B(d d0) throws SAXException {
        String s = d0.j();
        String s1 = d0.g();
        String s2 = d0.k();
        String s3 = this.A(s);
        d0.d();
        if(!this.i) {
            s1 = "";
            s2 = "";
        }
        if(this.D && s1.equalsIgnoreCase(this.x)) {
            try {
                this.e.resolveEntity(this.v, this.w);
            }
            catch(IOException unused_ex) {
            }
        }
        if(this.u(s3, s2)) {
            this.a.startPrefixMapping(s3, s2);
        }
        a a0 = d0.b();
        int v = a0.getLength();
        for(int v1 = 0; v1 < v; ++v1) {
            String s4 = a0.getURI(v1);
            String s5 = this.A(a0.getQName(v1));
            if(this.u(s5, s4)) {
                this.a.startPrefixMapping(s5, s4);
            }
        }
        this.a.startElement(s2, s1, s, d0.b());
        d0.p(this.z);
        this.z = d0;
        this.D = false;
        if(this.q && (d0.e() & 2) != 0) {
            this.g.startCDATA();
        }
    }

    private void C(d d0) throws SAXException {
        while(true) {
            d d1;
            for(d1 = this.z; d1 != null && !d1.c(d0); d1 = d1.l()) {
            }
            if(d1 == null) {
                e e0 = d0.m();
                if(e0 != null) {
                    d d2 = new d(e0, this.m);
                    d2.p(d0);
                    d0 = d2;
                    continue;
                }
            }
            break;
        }
        if(d1 == null) {
            return;
        }
        while(this.z != d1 && this.z != null && this.z.l() != null && this.z.l().l() != null) {
            this.E();
        }
        while(d0 != null) {
            d d3 = d0.l();
            if(!d0.j().equals("<pcdata>")) {
                this.B(d0);
            }
            this.D(d3);
            d0 = d3;
        }
        this.s = null;
    }

    private void D(d d0) throws SAXException {
        while(this.A != null && this.z.c(this.A) && (d0 == null || this.A.c(d0))) {
            d d1 = this.A.l();
            this.B(this.A);
            this.A = d1;
        }
    }

    private void E() throws SAXException {
        d d0 = this.z;
        this.z();
        if(this.o && (d0.e() & 1) != 0) {
            d0.a();
            d0.p(this.A);
            this.A = d0;
        }
    }

    private void F() {
        if(this.f == null) {
            this.f = new h();
        }
        if(this.g == null) {
            this.g = new g();
        }
        if(this.h == null) {
            this.h = new k(this);
        }
        this.z = new d(this.f.d("<root>"), this.m);
        this.B = new d(this.f.d("<pcdata>"), this.m);
        this.s = null;
        this.t = null;
        this.y = null;
        this.A = null;
        this.C = 0;
        this.D = true;
        this.w = null;
        this.v = null;
        this.x = null;
    }

    private static String[] G(String s) throws IllegalArgumentException {
        String s1 = s.trim();
        if(s1.length() == 0) {
            return new String[0];
        }
        ArrayList arrayList0 = new ArrayList();
        int v = s1.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v5 = 0;
        for(int v4 = 0; v1 < v; v4 = v6) {
            int v6 = s1.charAt(v1);
            if(v3 == 0 && v6 == 39 && v4 != 92) {
                v5 ^= 1;
                if(v2 < 0) {
                    v2 = v1;
                }
            }
            else if(v5 == 0 && v6 == 34 && v4 != 92) {
                v3 ^= 1;
                if(v2 < 0) {
                    v2 = v1;
                }
            }
            else if(v5 == 0 && v3 == 0) {
                if(Character.isWhitespace(((char)v6))) {
                    if(v2 >= 0) {
                        arrayList0.add(s1.substring(v2, v1));
                    }
                    v2 = -1;
                }
                else if(v2 < 0 && v6 != 0x20) {
                    v2 = v1;
                }
            }
            ++v1;
        }
        arrayList0.add(s1.substring(v2, v1));
        return (String[])arrayList0.toArray(new String[0]);
    }

    private static String H(String s) {
        if(s == null) {
            return null;
        }
        int v = s.length();
        if(v == 0) {
            return s;
        }
        int v1 = s.charAt(0);
        return v1 != s.charAt(v - 1) || v1 != 34 && v1 != 39 ? s : s.substring(1, s.length() - 1);
    }

    // 去混淆评级： 低(20)
    private static Boolean I(boolean z) {
        return z;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void a(char[] arr_c, int v, int v1) throws SAXException {
        this.b.startCDATA();
        this.b(arr_c, v, v1);
        this.b.endCDATA();
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void b(char[] arr_c, int v, int v1) throws SAXException {
        if(v1 == 0) {
            return;
        }
        boolean z = true;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!Character.isWhitespace(arr_c[v + v2])) {
                z = false;
            }
        }
        if(!z || this.z.c(this.B)) {
            this.C(this.B);
            this.a.characters(arr_c, v, v1);
        }
        else if(this.p) {
            this.a.ignorableWhitespace(arr_c, v, v1);
        }
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void c(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s(arr_c, v, v1)) {
            return;
        }
        this.r(arr_c, v, v1);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void comment(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void d(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s == null) {
            return;
        }
        this.t = this.y(arr_c, v, v1).toLowerCase();
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void e(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s != null) {
            return;
        }
        this.y = this.y(arr_c, v, v1).replace(':', '_');
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endEntity(String s) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void f(char[] arr_c, int v, int v1) throws SAXException {
        this.C = this.x(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void g(char[] arr_c, int v, int v1) throws SAXException {
        d d0 = this.s;
        if(d0 != null) {
            String s = this.t;
            if(s != null) {
                d0.o(s, null, s);
                this.t = null;
            }
        }
    }

    @Override  // org.xml.sax.XMLReader
    public ContentHandler getContentHandler() {
        return this.a == this ? null : this.a;
    }

    @Override  // org.xml.sax.XMLReader
    public DTDHandler getDTDHandler() {
        return this.c == this ? null : this.c;
    }

    @Override  // org.xml.sax.XMLReader
    public EntityResolver getEntityResolver() {
        return this.e == this ? null : this.e;
    }

    @Override  // org.xml.sax.XMLReader
    public ErrorHandler getErrorHandler() {
        return this.d == this ? null : this.d;
    }

    @Override  // org.xml.sax.XMLReader
    public boolean getFeature(String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        Boolean boolean0 = (Boolean)this.r.get(s);
        if(boolean0 == null) {
            throw new SAXNotRecognizedException("Unknown feature " + s);
        }
        return boolean0.booleanValue();
    }

    @Override  // org.xml.sax.XMLReader
    public Object getProperty(String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        if(s.equals("http://xml.org/sax/properties/lexical-handler")) {
            LexicalHandler lexicalHandler0 = this.b;
            return lexicalHandler0 == this ? null : lexicalHandler0;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            return this.g;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            return this.f;
        }
        if(!s.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
            throw new SAXNotRecognizedException("Unknown property " + s);
        }
        return this.h;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void h(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s != null && this.t != null) {
            String s = this.t(new String(arr_c, v, v1));
            this.s.o(this.t, null, s);
            this.t = null;
        }
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void i(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s != null) {
            return;
        }
        String s = this.y(arr_c, v, v1);
        if(s == null) {
            return;
        }
        int v2 = -1;
        e e0 = this.f.d(s);
        if(e0 == null) {
            if(this.j) {
                return;
            }
            int v3 = this.k ? 0 : -1;
            if(!this.l) {
                v2 = 0x7FFFFFFF;
            }
            this.f.b(s, v3, v2, 0);
            if(!this.l) {
                this.f.h(s, this.f.i().h());
            }
            e0 = this.f.d(s);
        }
        this.s = new d(e0, this.m);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public int j() {
        return this.C;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void k(char[] arr_c, int v, int v1) throws SAXException {
        d d0 = this.s;
        if(d0 == null) {
            return;
        }
        this.C(d0);
        this.r(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void l(char[] arr_c, int v, int v1) throws SAXException {
        String s2;
        String s1;
        String[] arr_s = l.G(new String(arr_c, v, v1));
        String s = null;
        if(arr_s.length <= 0 || !"DOCTYPE".equalsIgnoreCase(arr_s[0])) {
            s2 = null;
            s1 = null;
        }
        else {
            if(this.u) {
                return;
            }
            this.u = true;
            if(arr_s.length > 1) {
                s1 = arr_s[1];
                if(arr_s.length > 3 && "SYSTEM".equals(arr_s[2])) {
                    s2 = arr_s[3];
                }
                else if(arr_s.length <= 3 || !"PUBLIC".equals(arr_s[2])) {
                    s2 = null;
                }
                else {
                    s = arr_s[3];
                    s2 = arr_s.length > 4 ? arr_s[4] : "";
                }
            }
            else {
                s2 = null;
                s1 = null;
            }
        }
        String s3 = l.H(s);
        String s4 = l.H(s2);
        if(s1 != null) {
            String s5 = this.q(s3);
            this.b.startDTD(s1, s5, s4);
            this.b.endDTD();
            this.x = s1;
            this.v = s5;
            n n0 = this.g;
            if(n0 instanceof Locator) {
                this.w = ((Locator)n0).getSystemId();
                try {
                    this.w = new URL(new URL(this.w), s4).toString();
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void m(char[] arr_c, int v, int v1) throws SAXException {
        if(this.D) {
            this.C(this.B);
        }
        while(this.z.l() != null) {
            this.z();
        }
        this.a.endDocument();
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void n(char[] arr_c, int v, int v1) throws SAXException {
        if(this.s != null || (this.y == null || "xml".equalsIgnoreCase(this.y))) {
            return;
        }
        if(v1 > 0 && arr_c[v1 - 1] == 0x3F) {
            --v1;
        }
        this.a.processingInstruction(this.y, new String(arr_c, v, v1));
        this.y = null;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void o(char[] arr_c, int v, int v1) throws SAXException {
        this.b.comment(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void p(char[] arr_c, int v, int v1) throws SAXException {
        d d0 = this.s;
        if(d0 == null) {
            return;
        }
        this.C(d0);
        if(this.z.i() == 0) {
            this.r(arr_c, v, v1);
        }
    }

    @Override  // org.xml.sax.XMLReader
    public void parse(String s) throws IOException, SAXException {
        this.parse(new InputSource(s));
    }

    @Override  // org.xml.sax.XMLReader
    public void parse(InputSource inputSource0) throws IOException, SAXException {
        this.F();
        Reader reader0 = this.w(inputSource0);
        this.a.startDocument();
        this.g.b(inputSource0.getPublicId(), inputSource0.getSystemId());
        n n0 = this.g;
        if(n0 instanceof Locator) {
            this.a.setDocumentLocator(((Locator)n0));
        }
        this.g.a(reader0, this);
    }

    private String q(String s) {
        if(s == null) {
            return null;
        }
        int v = s.length();
        StringBuffer stringBuffer0 = new StringBuffer(v);
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-\'()+,./:=?;!*#@$_%".indexOf(v2) != -1) {
                stringBuffer0.append(((char)v2));
                z = false;
            }
            else if(!z) {
                stringBuffer0.append(' ');
                z = true;
            }
        }
        return stringBuffer0.toString().trim();
    }

    public void r(char[] arr_c, int v, int v1) throws SAXException {
        String s1;
        this.s = null;
        if(v1 == 0) {
            s1 = this.z.j();
        }
        else {
            String s = this.y(arr_c, v, v1);
            e e0 = this.f.d(s);
            if(e0 == null) {
                return;
            }
            s1 = e0.h();
        }
        d d0 = this.z;
        boolean z = false;
        while(d0 != null && !d0.j().equals(s1)) {
            if((d0.e() & 4) != 0) {
                z = true;
            }
            d0 = d0.l();
        }
        if(d0 == null) {
            return;
        }
        if(d0.l() != null && d0.l().l() != null) {
            if(z) {
                d0.n();
            }
            else {
                while(this.z != d0) {
                    this.E();
                }
                this.z();
            }
            while(this.z.f()) {
                this.z();
            }
            this.D(null);
        }
    }

    public boolean s(char[] arr_c, int v, int v1) throws SAXException {
        String s = this.z.j();
        if(this.q && (this.z.e() & 2) != 0) {
            boolean z = v1 == s.length();
            if(z) {
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(Character.toLowerCase(arr_c[v + v2]) != Character.toLowerCase(s.charAt(v2))) {
                        z = false;
                        break;
                    }
                }
            }
            if(!z) {
                this.a.characters(l.p0, 0, 2);
                this.a.characters(arr_c, v, v1);
                this.a.characters(l.p0, 2, 1);
                this.g.startCDATA();
                return true;
            }
        }
        return false;
    }

    @Override  // org.xml.sax.XMLReader
    public void setContentHandler(ContentHandler contentHandler0) {
        if(contentHandler0 == null) {
            contentHandler0 = this;
        }
        this.a = contentHandler0;
    }

    @Override  // org.xml.sax.XMLReader
    public void setDTDHandler(DTDHandler dTDHandler0) {
        if(dTDHandler0 == null) {
            dTDHandler0 = this;
        }
        this.c = dTDHandler0;
    }

    @Override  // org.xml.sax.XMLReader
    public void setEntityResolver(EntityResolver entityResolver0) {
        if(entityResolver0 == null) {
            entityResolver0 = this;
        }
        this.e = entityResolver0;
    }

    @Override  // org.xml.sax.XMLReader
    public void setErrorHandler(ErrorHandler errorHandler0) {
        if(errorHandler0 == null) {
            errorHandler0 = this;
        }
        this.d = errorHandler0;
    }

    @Override  // org.xml.sax.XMLReader
    public void setFeature(String s, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        if(((Boolean)this.r.get(s)) == null) {
            throw new SAXNotRecognizedException("Unknown feature " + s);
        }
        if(z) {
            this.r.put(s, Boolean.TRUE);
        }
        else {
            this.r.put(s, Boolean.FALSE);
        }
        if(s.equals("http://xml.org/sax/features/namespaces")) {
            this.i = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons")) {
            this.j = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty")) {
            this.k = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/root-bogons")) {
            this.l = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/default-attributes")) {
            this.m = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/translate-colons")) {
            this.n = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/restart-elements")) {
            this.o = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace")) {
            this.p = z;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements")) {
            this.q = z;
        }
    }

    @Override  // org.xml.sax.XMLReader
    public void setProperty(String s, Object object0) throws SAXNotRecognizedException, SAXNotSupportedException {
        if(s.equals("http://xml.org/sax/properties/lexical-handler")) {
            if(object0 == null) {
                this.b = this;
                return;
            }
            if(!(object0 instanceof LexicalHandler)) {
                throw new SAXNotSupportedException("Your lexical handler is not a LexicalHandler");
            }
            this.b = (LexicalHandler)object0;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            if(!(object0 instanceof n)) {
                throw new SAXNotSupportedException("Your scanner is not a Scanner");
            }
            this.g = (n)object0;
            return;
        }
        if(s.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            if(!(object0 instanceof o)) {
                throw new SAXNotSupportedException("Your schema is not a Schema");
            }
            this.f = (o)object0;
            return;
        }
        if(!s.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
            throw new SAXNotRecognizedException("Unknown property " + s);
        }
        if(!(object0 instanceof b)) {
            throw new SAXNotSupportedException("Your auto-detector is not an AutoDetector");
        }
        this.h = (b)object0;
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startDTD(String s, String s1, String s2) throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startEntity(String s) throws SAXException {
    }

    private String t(String s) {
        int v = s.length();
        char[] arr_c = new char[v];
        int v2 = 0;
        int v3 = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            char c = s.charAt(v1);
            arr_c[v2] = c;
            if(c == 38 && v3 == -1) {
                ++v2;
                v3 = v2;
            }
            else if(v3 == -1 || Character.isLetter(c) || Character.isDigit(c) || c == 35) {
                ++v2;
            }
            else {
                if(c == 59) {
                    int v4 = this.x(arr_c, v3, v2 + 1 - v3 - 1);
                    if(v4 > 0xFFFF) {
                        arr_c[v3 - 1] = (char)((v4 - 0x10000 >> 10) + 0xD800);
                        arr_c[v3] = (char)((v4 - 0x10000 & 0x3FF) + 0xDC00);
                        ++v3;
                    }
                    else if(v4 == 0) {
                        v3 = v2 + 1;
                    }
                    else {
                        arr_c[v3 - 1] = (char)v4;
                    }
                    v2 = v3;
                }
                else {
                    ++v2;
                }
                v3 = -1;
            }
        }
        return new String(arr_c, 0, v2);
    }

    // 去混淆评级： 中等(50)
    private boolean u(String s, String s1) {
        return !s.equals("") && !s1.equals("") && !s1.equals("");
    }

    // 去混淆评级： 低(40)
    private InputStream v(String s, String s1) throws IOException, SAXException {
        return ((URLConnection)FirebasePerfUrlConnection.instrument(new URL(new URL("file", "", "//."), s1).openConnection())).getInputStream();
    }

    private Reader w(InputSource inputSource0) throws SAXException, IOException {
        Reader reader0 = inputSource0.getCharacterStream();
        InputStream inputStream0 = inputSource0.getByteStream();
        String s = inputSource0.getEncoding();
        String s1 = inputSource0.getPublicId();
        String s2 = inputSource0.getSystemId();
        if(reader0 == null) {
            if(inputStream0 == null) {
                inputStream0 = this.v(s1, s2);
            }
            if(s == null) {
                return this.h.a(inputStream0);
            }
            try {
                return new InputStreamReader(inputStream0, s);
            }
            catch(UnsupportedEncodingException unused_ex) {
                return new InputStreamReader(inputStream0);
            }
        }
        return reader0;
    }

    private int x(char[] arr_c, int v, int v1) {
        if(v1 < 1) {
            return 0;
        }
        if(arr_c[v] == 35) {
            if(v1 > 1) {
                switch(arr_c[v + 1]) {
                    case 88: 
                    case 120: {
                        try {
                            return Integer.parseInt(new String(arr_c, v + 2, v1 - 2), 16);
                        }
                        catch(NumberFormatException unused_ex) {
                            return 0;
                        }
                    }
                }
            }
            try {
                return Integer.parseInt(new String(arr_c, v + 1, v1 - 1), 10);
            }
            catch(NumberFormatException unused_ex) {
                return 0;
            }
        }
        return this.f.e(new String(arr_c, v, v1));
    }

    private String y(char[] arr_c, int v, int v1) {
        StringBuffer stringBuffer0 = new StringBuffer(v1 + 2);
        boolean z = true;
        boolean z1 = false;
        while(true) {
            int v2 = 0x5F;
            if(v1 <= 0) {
                break;
            }
            int v3 = arr_c[v];
            if(Character.isLetter(((char)v3)) || v3 == 0x5F) {
                stringBuffer0.append(((char)v3));
                z = false;
            }
            else if(!Character.isDigit(((char)v3))) {
                switch(v3) {
                    case 45: 
                    case 46: {
                        goto label_19;
                    }
                    case 58: {
                        if(!z1) {
                            if(z) {
                                stringBuffer0.append('_');
                            }
                            if(!this.n) {
                                v2 = 58;
                            }
                            stringBuffer0.append(((char)v2));
                            z = true;
                            z1 = true;
                        }
                    }
                }
            }
            else {
            label_19:
                if(z) {
                    stringBuffer0.append('_');
                }
                stringBuffer0.append(((char)v3));
                z = false;
            }
            ++v;
            --v1;
        }
        int v4 = stringBuffer0.length();
        if(v4 == 0 || stringBuffer0.charAt(v4 - 1) == 58) {
            stringBuffer0.append('_');
        }
        return stringBuffer0.toString().intern();
    }

    private void z() throws SAXException {
        d d0 = this.z;
        if(d0 == null) {
            return;
        }
        String s = d0.j();
        String s1 = this.z.g();
        String s2 = this.z.k();
        String s3 = this.A(s);
        if(!this.i) {
            s1 = "";
            s2 = "";
        }
        this.a.endElement(s2, s1, s);
        if(this.u(s3, s2)) {
            this.a.endPrefixMapping(s3);
        }
        a a0 = this.z.b();
        for(int v = a0.getLength() - 1; v >= 0; --v) {
            String s4 = a0.getURI(v);
            String s5 = this.A(a0.getQName(v));
            if(this.u(s5, s4)) {
                this.a.endPrefixMapping(s5);
            }
        }
        this.z = this.z.l();
    }
}

