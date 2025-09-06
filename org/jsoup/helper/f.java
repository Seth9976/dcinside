package org.jsoup.helper;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import j..util.Map.-EL;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.b.c;
import org.jsoup.b;
import org.jsoup.internal.g;
import org.jsoup.internal.n;
import org.jsoup.j;
import org.jsoup.k;
import org.jsoup.parser.s;

public class f implements b {
    static class a {
    }

    static abstract class org.jsoup.helper.f.b implements org.jsoup.b.a {
        URL a;
        c b;
        Map c;
        Map d;
        private static final URL e;

        static {
            try {
                org.jsoup.helper.f.b.e = new URL("http://undefined/");
            }
            catch(MalformedURLException malformedURLException0) {
                throw new IllegalStateException(malformedURLException0);
            }
        }

        private org.jsoup.helper.f.b() {
            this.a = org.jsoup.helper.f.b.e;
            this.b = c.b;
            this.c = new LinkedHashMap();
            this.d = new LinkedHashMap();
        }

        org.jsoup.helper.f.b(a f$a0) {
        }

        private org.jsoup.helper.f.b(org.jsoup.helper.f.b f$b0) {
            this.a = f$b0.a;
            this.b = f$b0.b;
            this.c = new LinkedHashMap();
            for(Object object0: f$b0.c.entrySet()) {
                this.c.put(((String)((Map.Entry)object0).getKey()), new ArrayList(((Collection)((Map.Entry)object0).getValue())));
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            this.d = linkedHashMap0;
            linkedHashMap0.putAll(f$b0.d);
        }

        org.jsoup.helper.f.b(org.jsoup.helper.f.b f$b0, a f$a0) {
            this(f$b0);
        }

        @Override  // org.jsoup.b$a
        public boolean F(String s, String s1) {
            i.l(s);
            i.l(s1);
            for(Object object0: this.y(s)) {
                if(s1.equalsIgnoreCase(((String)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        @Override  // org.jsoup.b$a
        public Map J() {
            return this.d;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a M(String s, String s1) {
            i.n(s, "name");
            if(s1 == null) {
                s1 = "";
            }
            List list0 = this.y(s);
            if(list0.isEmpty()) {
                list0 = new ArrayList();
                this.c.put(s, list0);
            }
            list0.add(s1);
            return this;
        }

        @Override  // org.jsoup.b$a
        public boolean N(String s) {
            i.n(s, "name");
            return this.d.containsKey(s);
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a O(String s) {
            i.n(s, "name");
            Map.Entry map$Entry0 = this.b0(s);
            if(map$Entry0 != null) {
                this.c.remove(map$Entry0.getKey());
            }
            return this;
        }

        @Override  // org.jsoup.b$a
        public boolean P(String s) {
            i.n(s, "name");
            return !this.a0(s).isEmpty();
        }

        @Override  // org.jsoup.b$a
        public c S() {
            return this.b;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a T(String s) {
            i.n(s, "name");
            this.d.remove(s);
            return this;
        }

        @Override  // org.jsoup.b$a
        public Map U() {
            return this.c;
        }

        @Override  // org.jsoup.b$a
        public Map W() {
            Map map0 = new LinkedHashMap(this.c.size());
            for(Object object0: this.c.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                List list0 = (List)((Map.Entry)object0).getValue();
                if(list0.size() > 0) {
                    ((AbstractMap)map0).put(s, ((String)list0.get(0)));
                }
            }
            return map0;
        }

        private List a0(String s) {
            i.o(s);
            for(Object object0: this.c.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(s.equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                    return (List)map$Entry0.getValue();
                }
                if(false) {
                    break;
                }
            }
            return Collections.emptyList();
        }

        private Map.Entry b0(String s) {
            String s1 = g.a(s);
            for(Object object0: this.c.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(g.a(((String)map$Entry0.getKey())).equals(s1)) {
                    return map$Entry0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a c(String s, String s1) {
            i.n(s, "name");
            i.q(s1, "value");
            this.d.put(s, s1);
            return this;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a i(URL uRL0) {
            i.q(uRL0, "url");
            this.a = new h(uRL0).c();
            return this;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a o(String s, String s1) {
            i.n(s, "name");
            this.O(s);
            this.M(s, s1);
            return this;
        }

        @Override  // org.jsoup.b$a
        public org.jsoup.b.a p(c b$c0) {
            i.q(b$c0, "method");
            this.b = b$c0;
            return this;
        }

        @Override  // org.jsoup.b$a
        public URL t() {
            URL uRL0 = this.a;
            if(uRL0 == org.jsoup.helper.f.b.e) {
                throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
            }
            return uRL0;
        }

        @Override  // org.jsoup.b$a
        public String u(String s) {
            i.n(s, "name");
            return (String)this.d.get(s);
        }

        @Override  // org.jsoup.b$a
        public String w(String s) {
            i.q(s, "name");
            List list0 = this.a0(s);
            return list0.size() <= 0 ? null : n.m(list0, ", ");
        }

        @Override  // org.jsoup.b$a
        public List y(String s) {
            i.n(s, "name");
            return this.a0(s);
        }
    }

    public static class org.jsoup.helper.f.c implements org.jsoup.b.b {
        private String a;
        private String b;
        private InputStream c;
        private String d;

        private org.jsoup.helper.f.c(String s, String s1) {
            i.n(s, "key");
            i.q(s1, "value");
            this.a = s;
            this.b = s1;
        }

        @Override  // org.jsoup.b$b
        public InputStream J() {
            return this.c;
        }

        public static org.jsoup.helper.f.c a(String s, String s1) {
            return new org.jsoup.helper.f.c(s, s1);
        }

        public static org.jsoup.helper.f.c b(String s, String s1, InputStream inputStream0) {
            return new org.jsoup.helper.f.c(s, s1).c(inputStream0);
        }

        public org.jsoup.helper.f.c c(InputStream inputStream0) {
            i.q(this.b, "inputStream");
            this.c = inputStream0;
            return this;
        }

        public org.jsoup.helper.f.c d(String s) {
            i.n(s, "key");
            this.a = s;
            return this;
        }

        public org.jsoup.helper.f.c e(String s) {
            i.q(s, "value");
            this.b = s;
            return this;
        }

        @Override  // org.jsoup.b$b
        public String key() {
            return this.a;
        }

        @Override  // org.jsoup.b$b
        public String m() {
            return this.d;
        }

        @Override  // org.jsoup.b$b
        public org.jsoup.b.b n(String s) {
            return this.e(s);
        }

        @Override  // org.jsoup.b$b
        public org.jsoup.b.b o(String s) {
            i.l(s);
            this.d = s;
            return this;
        }

        @Override  // org.jsoup.b$b
        public org.jsoup.b.b p(String s) {
            return this.d(s);
        }

        @Override  // org.jsoup.b$b
        public org.jsoup.b.b q(InputStream inputStream0) {
            return this.c(inputStream0);
        }

        @Override  // org.jsoup.b$b
        public boolean r() {
            return this.c != null;
        }

        @Override
        public String toString() {
            return this.a + "=" + this.b;
        }

        @Override  // org.jsoup.b$b
        public String value() {
            return this.b;
        }
    }

    public static class d extends org.jsoup.helper.f.b implements org.jsoup.b.d {
        private Proxy f;
        private int g;
        private int h;
        private boolean i;
        private final Collection j;
        private String k;
        private boolean l;
        private boolean m;
        private org.jsoup.parser.g n;
        private boolean o;
        private String p;
        private SSLSocketFactory q;
        private CookieManager r;
        private org.jsoup.helper.g s;
        private org.jsoup.h t;
        private volatile boolean u;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        }

        d() {
            super(null);
            this.k = null;
            this.l = false;
            this.m = false;
            this.o = false;
            this.p = "UTF-8";
            this.u = false;
            this.g = 30000;
            this.h = 0x200000;
            this.i = true;
            this.j = new ArrayList();
            this.b = c.b;
            this.M("Accept-Encoding", "gzip");
            this.M("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
            this.n = org.jsoup.parser.g.d();
            this.r = new CookieManager();
        }

        d(d f$d0) {
            super(f$d0, null);
            this.k = null;
            this.l = false;
            this.m = false;
            this.o = false;
            this.u = false;
            this.f = f$d0.f;
            this.p = f$d0.p;
            this.g = f$d0.g;
            this.h = f$d0.h;
            this.i = f$d0.i;
            this.j = new ArrayList();
            this.l = f$d0.l;
            this.m = f$d0.m;
            this.n = f$d0.n.h();
            this.o = f$d0.o;
            this.q = f$d0.q;
            this.r = f$d0.r;
            this.s = f$d0.s;
            this.t = f$d0.t;
            this.u = false;
        }

        @Override  // org.jsoup.b$d
        public String B() {
            return this.k;
        }

        @Override  // org.jsoup.b$d
        public int C() {
            return this.h;
        }

        @Override  // org.jsoup.b$d
        public boolean D() {
            return this.l;
        }

        @Override  // org.jsoup.b$d
        public String E() {
            return this.p;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean F(String s, String s1) {
            return super.F(s, s1);
        }

        @Override  // org.jsoup.b$d
        public SSLSocketFactory G() {
            return this.q;
        }

        @Override  // org.jsoup.b$d
        public Proxy H() {
            return this.f;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d I(org.jsoup.b.b b$b0) {
            return this.l0(b$b0);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map J() {
            return super.J();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a M(String s, String s1) {
            return super.M(s, s1);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean N(String s) {
            return super.N(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a O(String s) {
            return super.O(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean P(String s) {
            return super.P(s);
        }

        @Override  // org.jsoup.b$d
        public boolean R() {
            return this.m;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public c S() {
            return super.S();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a T(String s) {
            return super.T(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map U() {
            return super.U();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map W() {
            return super.W();
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.parser.g Z() {
            return this.n;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d a(boolean z) {
            this.i = z;
            return this;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d b(String s) {
            this.k = s;
            return this;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a c(String s, String s1) {
            return super.c(s, s1);
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d d(int v) {
            return this.p0(v);
        }

        @Override  // org.jsoup.b$d
        public void e(SSLSocketFactory sSLSocketFactory0) {
            this.q = sSLSocketFactory0;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d f(Proxy proxy0) {
            return this.o0(proxy0);
        }

        @Override  // org.jsoup.b$d
        public Collection g() {
            return this.j;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d h(org.jsoup.parser.g g0) {
            return this.m0(g0);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a i(URL uRL0) {
            return super.i(uRL0);
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d j(int v) {
            i.i(v >= 0, "maxSize must be 0 (unlimited) or larger");
            this.h = v;
            return this;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d k(boolean z) {
            this.l = z;
            return this;
        }

        CookieManager k0() {
            return this.r;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d l(org.jsoup.helper.g g0) {
            this.s = g0;
            return this;
        }

        public d l0(org.jsoup.b.b b$b0) {
            i.q(b$b0, "keyval");
            this.j.add(b$b0);
            return this;
        }

        public d m0(org.jsoup.parser.g g0) {
            this.n = g0;
            this.o = true;
            return this;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d n(String s) {
            i.q(s, "charset");
            if(!Charset.isSupported(s)) {
                throw new IllegalCharsetNameException(s);
            }
            this.p = s;
            return this;
        }

        public d n0(String s, int v) {
            this.f = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(s, v));
            return this;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a o(String s, String s1) {
            return super.o(s, s1);
        }

        public d o0(Proxy proxy0) {
            this.f = proxy0;
            return this;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a p(c b$c0) {
            return super.p(b$c0);
        }

        public d p0(int v) {
            i.i(v >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.g = v;
            return this;
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d q(String s, int v) {
            return this.n0(s, v);
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.b.d r(boolean z) {
            this.m = z;
            return this;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public URL t() {
            return super.t();
        }

        @Override  // org.jsoup.b$d
        public int timeout() {
            return this.g;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public String u(String s) {
            return super.u(s);
        }

        @Override  // org.jsoup.b$d
        public boolean v() {
            return this.i;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public String w(String s) {
            return super.w(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public List y(String s) {
            return super.y(s);
        }

        @Override  // org.jsoup.b$d
        public org.jsoup.helper.g z() {
            return this.s;
        }
    }

    public static class e extends org.jsoup.helper.f.b implements org.jsoup.b.e {
        private final int f;
        private final String g;
        private ByteBuffer h;
        private org.jsoup.internal.a i;
        private HttpURLConnection j;
        private String k;
        private final String l;
        private boolean m;
        private boolean n;
        private int o;
        private final d p;
        private static final int q = 20;
        private static final String r = "Location";
        private static final Pattern s;

        static {
            e.s = Pattern.compile("(\\w+)/\\w*\\+?xml.*");
        }

        e() {
            super(null);
            this.m = false;
            this.n = false;
            this.o = 0;
            this.f = 400;
            this.g = "Request not made";
            this.p = new d();
            this.l = null;
        }

        private e(HttpURLConnection httpURLConnection0, d f$d0, e f$e0) throws IOException {
            super(null);
            this.m = false;
            this.n = false;
            this.o = 0;
            this.j = httpURLConnection0;
            this.p = f$d0;
            this.b = c.valueOf(httpURLConnection0.getRequestMethod());
            this.a = httpURLConnection0.getURL();
            this.f = httpURLConnection0.getResponseCode();
            this.g = httpURLConnection0.getResponseMessage();
            this.l = httpURLConnection0.getContentType();
            LinkedHashMap linkedHashMap0 = e.e0(httpURLConnection0);
            this.l0(linkedHashMap0);
            org.jsoup.helper.c.d(f$d0, this.a, linkedHashMap0);
            if(f$e0 != null) {
                for(Object object0: f$e0.J().entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(!this.N(((String)map$Entry0.getKey()))) {
                        this.c(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
                    }
                }
                f$e0.m0();
                int v = f$e0.o + 1;
                this.o = v;
                if(v >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", f$e0.t()));
                }
            }
        }

        @Override  // org.jsoup.b$e
        public int A() {
            return this.f;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean F(String s, String s1) {
            return super.F(s, s1);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map J() {
            return super.J();
        }

        @Override  // org.jsoup.b$e
        public org.jsoup.parser.h K() throws IOException {
            InputStream inputStream0 = this.k0();
            String s = this.a.toExternalForm();
            org.jsoup.helper.e.b e$b0 = org.jsoup.helper.e.b(inputStream0, this.k, s, this.p.Z());
            org.jsoup.parser.h h0 = new org.jsoup.parser.h(this.p.Z());
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, e$b0.a));
            org.jsoup.helper.e.l(bufferedReader0, e$b0);
            h0.n(bufferedReader0, s);
            h0.i().h3(new f(this.p, this, null));
            this.k = e$b0.a.name();
            return h0;
        }

        @Override  // org.jsoup.b$e
        public org.jsoup.nodes.f L() throws IOException {
            org.jsoup.nodes.f f0 = org.jsoup.helper.e.o(this.k0(), this.k, this.a.toExternalForm(), this.p.Z());
            f0.h3(new f(this.p, this, null));
            this.k = f0.s3().a().name();
            this.m0();
            return f0;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a M(String s, String s1) {
            return super.M(s, s1);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean N(String s) {
            return super.N(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a O(String s) {
            return super.O(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public boolean P(String s) {
            return super.P(s);
        }

        @Override  // org.jsoup.b$e
        public String Q() {
            return this.k;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public c S() {
            return super.S();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a T(String s) {
            return super.T(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map U() {
            return super.U();
        }

        @Override  // org.jsoup.b$e
        public org.jsoup.b.e V() {
            this.j0();
            return this;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public Map W() {
            return super.W();
        }

        @Override  // org.jsoup.b$e
        public String X() {
            return this.g;
        }

        @Override  // org.jsoup.b$e
        public byte[] Y() {
            this.j0();
            i.o(this.h);
            return this.h.array();
        }

        @Override  // org.jsoup.b$e
        public String body() {
            this.j0();
            i.o(this.h);
            String s = (this.k == null ? org.jsoup.helper.e.b : Charset.forName(this.k)).decode(this.h).toString();
            this.h.rewind();
            return s;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a c(String s, String s1) {
            return super.c(s, s1);
        }

        public e c0(String s) {
            this.k = s;
            return this;
        }

        private static HttpURLConnection d0(d f$d0) throws IOException {
            Proxy proxy0 = f$d0.H();
            URLConnection uRLConnection0 = proxy0 == null ? ((URLConnection)FirebasePerfUrlConnection.instrument(f$d0.t().openConnection())) : ((URLConnection)FirebasePerfUrlConnection.instrument(f$d0.t().openConnection(proxy0)));
            ((HttpURLConnection)uRLConnection0).setRequestMethod(f$d0.S().name());
            ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
            ((HttpURLConnection)uRLConnection0).setConnectTimeout(f$d0.timeout());
            ((HttpURLConnection)uRLConnection0).setReadTimeout(f$d0.timeout() / 2);
            if(f$d0.G() != null && ((HttpURLConnection)uRLConnection0) instanceof HttpsURLConnection) {
                ((HttpsURLConnection)(((HttpURLConnection)uRLConnection0))).setSSLSocketFactory(f$d0.G());
            }
            if(f$d0.s != null) {
                org.jsoup.helper.a.d.b(f$d0.s, ((HttpURLConnection)uRLConnection0));
            }
            if(f$d0.S().b()) {
                ((HttpURLConnection)uRLConnection0).setDoOutput(true);
            }
            org.jsoup.helper.c.a(f$d0, ((HttpURLConnection)uRLConnection0));
            for(Object object0: f$d0.U().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                for(Object object1: ((List)map$Entry0.getValue())) {
                    ((HttpURLConnection)uRLConnection0).addRequestProperty(((String)map$Entry0.getKey()), ((String)object1));
                }
            }
            return (HttpURLConnection)uRLConnection0;
        }

        private static LinkedHashMap e0(HttpURLConnection httpURLConnection0) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            int v = 0;
            while(true) {
                String s = httpURLConnection0.getHeaderFieldKey(v);
                String s1 = httpURLConnection0.getHeaderField(v);
                if(s == null && s1 == null) {
                    break;
                }
                ++v;
                if(s != null && s1 != null) {
                    ((List)Map.-EL.computeIfAbsent(linkedHashMap0, s, org.jsoup.internal.f.j())).add(s1);
                }
            }
            return linkedHashMap0;
        }

        static e f0(d f$d0) throws IOException {
            return e.g0(f$d0, null);
        }

        static e g0(d f$d0, e f$e0) throws IOException {
            e f$e3;
            e f$e2;
            int v3;
            OutputStream outputStream0;
            String s1;
            synchronized(f$d0) {
                i.g(f$d0.u, "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.");
                f$d0.u = true;
            }
            i.q(f$d0, "req");
            URL uRL0 = f$d0.t();
            i.p(uRL0, "URL must be specified to connect");
            String s = uRL0.getProtocol();
            if(!s.equals("http") && !s.equals("https")) {
                throw new MalformedURLException("Only http & https protocols supported");
            }
            boolean z = f$d0.S().b();
            boolean z1 = f$d0.B() != null;
            if(!z) {
                i.g(z1, "Cannot set a request body for HTTP method " + f$d0.S());
            }
            e f$e1 = null;
            if(f$d0.g().size() <= 0 || z && !z1) {
                s1 = z ? e.o0(f$d0) : null;
            }
            else {
                e.n0(f$d0);
                s1 = null;
            }
            long v1 = System.nanoTime();
            HttpURLConnection httpURLConnection0 = e.d0(f$d0);
            try {
                try {
                    httpURLConnection0.connect();
                    if(httpURLConnection0.getDoOutput()) {
                        outputStream0 = httpURLConnection0.getOutputStream();
                        goto label_28;
                    }
                    v3 = httpURLConnection0.getResponseCode();
                    f$e2 = new e(httpURLConnection0, f$d0, f$e0);
                    goto label_43;
                }
                catch(IOException iOException0) {
                    goto label_84;
                }
                try {
                label_28:
                    e.p0(f$d0, outputStream0, s1);
                    v3 = httpURLConnection0.getResponseCode();
                    f$e2 = new e(httpURLConnection0, f$d0, f$e0);
                    goto label_43;
                }
                catch(IOException iOException1) {
                    try {
                        httpURLConnection0.disconnect();
                        throw iOException1;
                    }
                    catch(IOException iOException0) {
                    }
                }
                finally {
                    outputStream0.close();
                }
            }
            catch(Throwable throwable0) {
                goto label_88;
            }
            goto label_84;
            try {
            label_43:
                if(!f$e2.P("Location") || !f$d0.v()) {
                    if((v3 < 200 || v3 >= 400) && !f$d0.D()) {
                        throw new org.jsoup.e("HTTP error fetching URL", v3, f$d0.t().toString());
                    }
                    String s2 = f$e2.m();
                    if(s2 != null && !f$d0.R() && !s2.startsWith("text/") && !e.s.matcher(s2).matches()) {
                        throw new k("Unhandled content type. Must be text/*, */xml, or */*+xml", s2, f$d0.t().toString());
                    }
                    if(s2 != null && e.s.matcher(s2).matches() && !f$d0.o) {
                        f$d0.m0(org.jsoup.parser.g.w());
                    }
                    f$e2.k = org.jsoup.helper.e.e(f$e2.l);
                    if(httpURLConnection0.getContentLength() == 0 || f$d0.S() == c.g) {
                        f$e2.h = org.jsoup.helper.e.d();
                    }
                    else {
                        InputStream inputStream0 = httpURLConnection0.getErrorStream() == null ? httpURLConnection0.getInputStream() : httpURLConnection0.getErrorStream();
                        if(f$e2.F("Content-Encoding", "gzip")) {
                            inputStream0 = new GZIPInputStream(inputStream0);
                        }
                        else if(f$e2.F("Content-Encoding", "deflate")) {
                            inputStream0 = new InflaterInputStream(inputStream0, new Inflater(true));
                        }
                        f$e2.i = org.jsoup.internal.a.j(inputStream0, 0x8000, f$d0.C()).i(v1, ((long)f$d0.timeout()));
                        if(f$d0.t != null) {
                            f$e2.i.e(httpURLConnection0.getContentLength(), f$d0.t, f$e2);
                        }
                    }
                    goto label_64;
                }
                goto label_69;
            }
            catch(IOException iOException0) {
                goto label_83;
            }
            catch(Throwable throwable0) {
                goto label_88;
            }
        label_64:
            f$d0.u = false;
            if(f$d0.s != null) {
                org.jsoup.helper.a.d.remove();
            }
            f$e2.m = true;
            return f$e2;
            try {
                try {
                label_69:
                    if(v3 != 307) {
                        f$d0.p(c.b);
                        f$d0.g().clear();
                        f$d0.b(null);
                        f$d0.O("Content-Type");
                    }
                    String s3 = f$e2.w("Location");
                    i.o(s3);
                    if(s3.startsWith("http:/") && s3.charAt(6) != 0x2F) {
                        s3 = s3.substring(6);
                    }
                    f$d0.i(n.x(f$d0.t(), s3));
                    f$d0.u = false;
                    f$e3 = e.g0(f$d0, f$e2);
                    goto label_92;
                label_83:
                    f$e1 = f$e2;
                }
                catch(IOException iOException0) {
                    goto label_83;
                }
            label_84:
                if(f$e1 != null) {
                    f$e1.m0();
                }
                throw iOException0;
            }
            catch(Throwable throwable0) {
            label_88:
                f$d0.u = false;
                if(f$d0.s != null) {
                    org.jsoup.helper.a.d.remove();
                }
                throw throwable0;
            }
        label_92:
            f$d0.u = false;
            if(f$d0.s != null) {
                org.jsoup.helper.a.d.remove();
            }
            return f$e3;
        }

        private static String h0(String s) {
            if(s == null) {
                return null;
            }
            byte[] arr_b = s.getBytes(f.k);
            return e.i0(arr_b) ? new String(arr_b, org.jsoup.helper.e.b) : s;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a i(URL uRL0) {
            return super.i(uRL0);
        }

        private static boolean i0(byte[] arr_b) {
            int v2;
            int v = arr_b.length >= 3 && (arr_b[0] & 0xFF) == 0xEF && (arr_b[1] & 0xFF) == 0xBB && (arr_b[2] & 0xFF) == 0xBF ? 3 : 0;
            boolean z = false;
            while(v < arr_b.length) {
                int v1 = arr_b[v];
                if((v1 & 0x80) != 0) {
                    if((v1 & 0xE0) == 0xC0) {
                        v2 = v + 1;
                        goto label_13;
                    }
                    else if((v1 & 0xF0) == 0xE0) {
                        v2 = v + 2;
                        goto label_13;
                    }
                    else {
                        if((v1 & 0xF8) == 0xF0) {
                            v2 = v + 3;
                        label_13:
                            if(v2 >= arr_b.length) {
                                return false;
                            }
                            while(v < v2) {
                                ++v;
                                if((arr_b[v] & 0xC0) != 0x80) {
                                    return false;
                                }
                                if(false) {
                                    break;
                                }
                            }
                            z = true;
                            goto label_23;
                        }
                        return false;
                    }
                }
            label_23:
                ++v;
            }
            return z;
        }

        private void j0() {
            i.i(this.m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if(this.i != null && this.h == null) {
                i.g(this.n, "Request has already been read (with .parse())");
                try {
                    this.h = org.jsoup.helper.e.q(this.i, this.p.C());
                }
                catch(IOException iOException0) {
                    throw new j(iOException0);
                }
                finally {
                    this.n = true;
                    this.m0();
                }
            }
        }

        private InputStream k0() {
            i.i(this.m, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            InputStream inputStream0 = this.i;
            if(this.h != null) {
                inputStream0 = new ByteArrayInputStream(this.h.array());
                this.n = false;
            }
            i.g(this.n, "Input stream already read and parsed, cannot re-read.");
            i.o(inputStream0);
            this.n = true;
            return inputStream0;
        }

        void l0(Map map0) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(s != null) {
                    List list0 = (List)map$Entry0.getValue();
                    if(s.equalsIgnoreCase("Set-Cookie")) {
                        for(Object object1: list0) {
                            String s1 = (String)object1;
                            if(s1 != null) {
                                s s2 = new s(s1);
                                String s3 = s2.d("=").trim();
                                String s4 = s2.k(";").trim();
                                if(s3.length() > 0 && !this.d.containsKey(s3)) {
                                    this.c(s3, s4);
                                }
                            }
                        }
                    }
                    for(Object object2: list0) {
                        this.M(s, e.h0(((String)object2)));
                    }
                }
            }
        }

        @Override  // org.jsoup.b$e
        public String m() {
            return this.l;
        }

        private void m0() {
            org.jsoup.internal.a a0 = this.i;
            if(a0 != null) {
                try {
                    a0.close();
                }
                catch(IOException unused_ex) {
                }
                finally {
                    this.i = null;
                }
            }
            HttpURLConnection httpURLConnection0 = this.j;
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
                this.j = null;
            }
        }

        private static void n0(org.jsoup.b.d b$d0) throws IOException {
            h h0 = new h(b$d0.t());
            for(Object object0: b$d0.g()) {
                i.g(((org.jsoup.b.b)object0).r(), "InputStream data not supported in URL query string.");
                h0.a(((org.jsoup.b.b)object0));
            }
            b$d0.i(h0.c());
            b$d0.g().clear();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a o(String s, String s1) {
            return super.o(s, s1);
        }

        private static String o0(org.jsoup.b.d b$d0) {
            String s = b$d0.w("Content-Type");
            if(s == null) {
                if(f.S(b$d0)) {
                    b$d0.o("Content-Type", "multipart/form-data; boundary=CKw7DoIW5w5bOlkvPYCJ_cB2CuX5LLyN");
                    return "CKw7DoIW5w5bOlkvPYCJ_cB2CuX5LLyN";
                }
                b$d0.o("Content-Type", "application/x-www-form-urlencoded; charset=" + b$d0.E());
            }
            else if(s.contains("multipart/form-data") && !s.contains("boundary")) {
                b$d0.o("Content-Type", "multipart/form-data; boundary=CKw7DoIW5w5bOlkvPYCJ_cB2CuX5LLyN");
                return "CKw7DoIW5w5bOlkvPYCJ_cB2CuX5LLyN";
            }
            return null;
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public org.jsoup.b.a p(c b$c0) {
            return super.p(b$c0);
        }

        private static void p0(org.jsoup.b.d b$d0, OutputStream outputStream0, String s) throws IOException {
            Collection collection0 = b$d0.g();
            BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(outputStream0, Charset.forName(b$d0.E())));
            if(s == null) {
                String s2 = b$d0.B();
                if(s2 == null) {
                    boolean z = true;
                    for(Object object1: collection0) {
                        if(z) {
                            z = false;
                        }
                        else {
                            bufferedWriter0.append('&');
                        }
                        bufferedWriter0.write(URLEncoder.encode(((org.jsoup.b.b)object1).key(), b$d0.E()));
                        bufferedWriter0.write(61);
                        bufferedWriter0.write(URLEncoder.encode(((org.jsoup.b.b)object1).value(), b$d0.E()));
                    }
                }
                else {
                    bufferedWriter0.write(s2);
                }
            }
            else {
                for(Object object0: collection0) {
                    org.jsoup.b.b b$b0 = (org.jsoup.b.b)object0;
                    bufferedWriter0.write("--");
                    bufferedWriter0.write(s);
                    bufferedWriter0.write("\r\n");
                    bufferedWriter0.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter0.write(f.R(b$b0.key()));
                    bufferedWriter0.write("\"");
                    InputStream inputStream0 = b$b0.J();
                    if(inputStream0 == null) {
                        bufferedWriter0.write("\r\n\r\n");
                        bufferedWriter0.write(b$b0.value());
                    }
                    else {
                        bufferedWriter0.write("; filename=\"");
                        bufferedWriter0.write(f.R(b$b0.value()));
                        bufferedWriter0.write("\"\r\nContent-Type: ");
                        String s1 = b$b0.m();
                        if(s1 == null) {
                            s1 = "application/octet-stream";
                        }
                        bufferedWriter0.write(s1);
                        bufferedWriter0.write("\r\n\r\n");
                        bufferedWriter0.flush();
                        org.jsoup.helper.e.a(inputStream0, outputStream0);
                        outputStream0.flush();
                    }
                    bufferedWriter0.write("\r\n");
                }
                bufferedWriter0.write("--");
                bufferedWriter0.write(s);
                bufferedWriter0.write("--");
            }
            bufferedWriter0.close();
        }

        @Override  // org.jsoup.b$e
        public BufferedInputStream s() {
            i.i(this.m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if(this.h != null) {
                return new BufferedInputStream(new ByteArrayInputStream(this.h.array()), 0x8000);
            }
            i.g(this.n, "Request has already been read");
            i.o(this.i);
            this.n = true;
            return this.i.c();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public URL t() {
            return super.t();
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public String u(String s) {
            return super.u(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public String w(String s) {
            return super.w(s);
        }

        @Override  // org.jsoup.b$e
        public org.jsoup.b.e x(String s) {
            return this.c0(s);
        }

        @Override  // org.jsoup.helper.f$b, org.jsoup.b$a
        public List y(String s) {
            return super.y(s);
        }
    }

    private d a;
    private org.jsoup.b.e b;
    public static final String c = "Content-Encoding";
    public static final String d = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";
    private static final String e = "User-Agent";
    public static final String f = "Content-Type";
    public static final String g = "multipart/form-data";
    public static final String h = "application/x-www-form-urlencoded";
    private static final int i = 307;
    private static final String j = "application/octet-stream";
    private static final Charset k;

    static {
        f.k = Charset.forName("ISO-8859-1");
    }

    public f() {
        this.a = new d();
    }

    f(d f$d0) {
        this.a = new d(f$d0);
    }

    private f(d f$d0, e f$e0) {
        this.a = f$d0;
        this.b = f$e0;
    }

    f(d f$d0, e f$e0, a f$a0) {
        this(f$d0, f$e0);
    }

    @Override  // org.jsoup.b
    public b A(String s, String s1, InputStream inputStream0) {
        this.a.l0(org.jsoup.helper.f.c.b(s, s1, inputStream0));
        return this;
    }

    @Override  // org.jsoup.b
    public b B(String[] arr_s) {
        i.q(arr_s, "keyvals");
        i.i(arr_s.length % 2 == 0, "Must supply an even number of key value pairs");
        for(int v = 0; v < arr_s.length; v += 2) {
            String s = arr_s[v];
            String s1 = arr_s[v + 1];
            i.m(s, "Data key must not be empty");
            i.p(s1, "Data value must not be null");
            this.a.l0(org.jsoup.helper.f.c.a(s, s1));
        }
        return this;
    }

    @Override  // org.jsoup.b
    public b C(String s) {
        return org.jsoup.a.b(this, s);
    }

    @Override  // org.jsoup.b
    public b D(Map map0) {
        i.q(map0, "data");
        for(Object object0: map0.entrySet()) {
            this.a.l0(org.jsoup.helper.f.c.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
        }
        return this;
    }

    @Override  // org.jsoup.b
    public b E(Collection collection0) {
        i.q(collection0, "data");
        for(Object object0: collection0) {
            this.a.l0(((org.jsoup.b.b)object0));
        }
        return this;
    }

    @Override  // org.jsoup.b
    public b F() {
        return new f(this.a);
    }

    @Override  // org.jsoup.b
    public org.jsoup.nodes.f G() throws IOException {
        this.a.p(c.c);
        this.execute();
        i.o(this.b);
        return this.b.L();
    }

    @Override  // org.jsoup.b
    public b H(URL uRL0) {
        return org.jsoup.a.c(this, uRL0);
    }

    @Override  // org.jsoup.b
    public b I(String s) {
        i.q(s, "userAgent");
        this.a.o("User-Agent", s);
        return this;
    }

    @Override  // org.jsoup.b
    public b J(org.jsoup.b.d b$d0) {
        this.a = (d)b$d0;
        return this;
    }

    @Override  // org.jsoup.b
    public b K(org.jsoup.b.e b$e0) {
        this.b = b$e0;
        return this;
    }

    @Override  // org.jsoup.b
    public org.jsoup.b.b L(String s) {
        i.n(s, "key");
        for(Object object0: this.request().g()) {
            org.jsoup.b.b b$b0 = (org.jsoup.b.b)object0;
            if(b$b0.key().equals(s)) {
                return b$b0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static b P(String s) {
        b b0 = new f();
        b0.t(s);
        return b0;
    }

    public static b Q(URL uRL0) {
        b b0 = new f();
        b0.i(uRL0);
        return b0;
    }

    private static String R(String s) {
        return s.replace("\"", "%22");
    }

    private static boolean S(org.jsoup.b.d b$d0) {
        for(Object object0: b$d0.g()) {
            if(((org.jsoup.b.b)object0).r()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // org.jsoup.b
    public b a(boolean z) {
        this.a.a(z);
        return this;
    }

    @Override  // org.jsoup.b
    public b b(String s) {
        this.a.b(s);
        return this;
    }

    @Override  // org.jsoup.b
    public b c(String s, String s1) {
        this.a.c(s, s1);
        return this;
    }

    @Override  // org.jsoup.b
    public b d(int v) {
        this.a.p0(v);
        return this;
    }

    @Override  // org.jsoup.b
    public b e(SSLSocketFactory sSLSocketFactory0) {
        this.a.e(sSLSocketFactory0);
        return this;
    }

    @Override  // org.jsoup.b
    public org.jsoup.b.e execute() throws IOException {
        org.jsoup.b.e b$e0 = e.f0(this.a);
        this.b = b$e0;
        return b$e0;
    }

    @Override  // org.jsoup.b
    public b f(Proxy proxy0) {
        this.a.o0(proxy0);
        return this;
    }

    @Override  // org.jsoup.b
    public b g(Map map0) {
        i.q(map0, "headers");
        for(Object object0: map0.entrySet()) {
            this.a.o(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return this;
    }

    @Override  // org.jsoup.b
    public org.jsoup.nodes.f get() throws IOException {
        this.a.p(c.b);
        this.execute();
        i.o(this.b);
        return this.b.L();
    }

    @Override  // org.jsoup.b
    public b h(org.jsoup.parser.g g0) {
        this.a.m0(g0);
        return this;
    }

    @Override  // org.jsoup.b
    public b i(URL uRL0) {
        this.a.i(uRL0);
        return this;
    }

    @Override  // org.jsoup.b
    public b j(int v) {
        this.a.j(v);
        return this;
    }

    @Override  // org.jsoup.b
    public b k(boolean z) {
        this.a.k(z);
        return this;
    }

    @Override  // org.jsoup.b
    public b l(org.jsoup.helper.g g0) {
        this.a.l(g0);
        return this;
    }

    @Override  // org.jsoup.b
    public b m(String s, String s1, InputStream inputStream0, String s2) {
        this.a.l0(org.jsoup.helper.f.c.b(s, s1, inputStream0).o(s2));
        return this;
    }

    @Override  // org.jsoup.b
    public b n(String s) {
        this.a.n(s);
        return this;
    }

    @Override  // org.jsoup.b
    public b o(String s, String s1) {
        this.a.o(s, s1);
        return this;
    }

    @Override  // org.jsoup.b
    public b p(c b$c0) {
        this.a.p(b$c0);
        return this;
    }

    @Override  // org.jsoup.b
    public b q(String s, int v) {
        this.a.n0(s, v);
        return this;
    }

    @Override  // org.jsoup.b
    public b r(boolean z) {
        this.a.r(z);
        return this;
    }

    @Override  // org.jsoup.b
    public org.jsoup.b.d request() {
        return this.a;
    }

    @Override  // org.jsoup.b
    public b s(String s, String s1) {
        this.a.l0(org.jsoup.helper.f.c.a(s, s1));
        return this;
    }

    @Override  // org.jsoup.b
    public b t(String s) {
        i.n(s, "url");
        try {
            this.a.i(new URL(s));
            return this;
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException(String.format("The supplied URL, \'%s\', is malformed. Make sure it is an absolute URL, and starts with \'http://\' or \'https://\'. See https://jsoup.org/cookbook/extracting-data/working-with-urls", s), malformedURLException0);
        }
    }

    @Override  // org.jsoup.b
    public org.jsoup.b.e u() {
        org.jsoup.b.e b$e0 = this.b;
        if(b$e0 == null) {
            throw new IllegalArgumentException("You must execute the request before getting a response.");
        }
        return b$e0;
    }

    @Override  // org.jsoup.b
    public b v(CookieStore cookieStore0) {
        this.a.r = new CookieManager(cookieStore0, null);
        return this;
    }

    @Override  // org.jsoup.b
    public b w(org.jsoup.h h0) {
        this.a.t = h0;
        return this;
    }

    @Override  // org.jsoup.b
    public CookieStore x() {
        return this.a.r.getCookieStore();
    }

    @Override  // org.jsoup.b
    public b y(String s) {
        i.q(s, "referrer");
        this.a.o("Referer", s);
        return this;
    }

    @Override  // org.jsoup.b
    public b z(Map map0) {
        i.q(map0, "cookies");
        for(Object object0: map0.entrySet()) {
            this.a.c(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return this;
    }
}

