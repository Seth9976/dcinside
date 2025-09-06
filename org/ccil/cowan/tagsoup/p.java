package org.ccil.cowan.tagsoup;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.NamespaceSupport;
import org.xml.sax.helpers.XMLFilterImpl;

public class p extends XMLFilterImpl implements LexicalHandler {
    public static final String A = "method";
    public static final String B = "omit-xml-declaration";
    public static final String C = "standalone";
    public static final String D = "version";
    private String[] a;
    private final Attributes b;
    private Hashtable c;
    private Hashtable d;
    private Hashtable e;
    private int f;
    private Writer g;
    private NamespaceSupport h;
    private int i;
    private Properties j;
    private boolean k;
    private String l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    public static final String u = "cdata-section-elements";
    public static final String v = "doctype-public";
    public static final String w = "doctype-system";
    public static final String x = "encoding";
    public static final String y = "indent";
    public static final String z = "media-type";

    public p() {
        this.a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.b = new AttributesImpl();
        this.f = 0;
        this.i = 0;
        this.k = false;
        this.l = "";
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = false;
        this.r(null);
    }

    public p(Writer writer0) {
        this.a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.b = new AttributesImpl();
        this.f = 0;
        this.i = 0;
        this.k = false;
        this.l = "";
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = false;
        this.r(writer0);
    }

    public p(XMLReader xMLReader0) {
        super(xMLReader0);
        this.a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.b = new AttributesImpl();
        this.f = 0;
        this.i = 0;
        this.k = false;
        this.l = "";
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = false;
        this.r(null);
    }

    public p(XMLReader xMLReader0, Writer writer0) {
        super(xMLReader0);
        this.a = new String[]{"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
        this.b = new AttributesImpl();
        this.f = 0;
        this.i = 0;
        this.k = false;
        this.l = "";
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = false;
        this.r(writer0);
    }

    private void A(Attributes attributes0) throws SAXException {
        int v = attributes0.getLength();
        for(int v1 = 0; v1 < v; ++v1) {
            char[] arr_c = attributes0.getValue(v1).toCharArray();
            this.y(' ');
            this.D(attributes0.getURI(v1), attributes0.getLocalName(v1), attributes0.getQName(v1), false);
            if(this.m && this.a(attributes0.getLocalName(v1), attributes0.getQName(v1), attributes0.getValue(v1))) {
                break;
            }
            this.z("=\"");
            this.B(arr_c, 0, arr_c.length, true);
            this.y('\"');
        }
    }

    private void B(char[] arr_c, int v, int v1, boolean z) throws SAXException {
        for(int v2 = v; v2 < v + v1; ++v2) {
            int v3 = arr_c[v2];
            switch(v3) {
                case 34: {
                    if(z) {
                        this.z("&quot;");
                    }
                    else {
                        this.y('\"');
                    }
                    break;
                }
                case 38: {
                    this.z("&amp;");
                    break;
                }
                case 60: {
                    this.z("&lt;");
                    break;
                }
                case 62: {
                    this.z("&gt;");
                    break;
                }
                default: {
                    if(this.k || v3 <= 0x7F) {
                        this.y(((char)v3));
                    }
                    else {
                        this.z("&#");
                        this.z(Integer.toString(arr_c[v2]));
                        this.y(';');
                    }
                }
            }
        }
    }

    private void C() throws SAXException {
        Enumeration enumeration0 = this.h.getDeclaredPrefixes();
        while(enumeration0.hasMoreElements()) {
            String s = (String)enumeration0.nextElement();
            String s1 = this.h.getURI(s);
            if(s1 == null) {
                s1 = "";
            }
            char[] arr_c = s1.toCharArray();
            this.y(' ');
            if("".equals(s)) {
                this.z("xmlns=\"");
            }
            else {
                this.z("xmlns:");
                this.z(s);
                this.z("=\"");
            }
            this.B(arr_c, 0, arr_c.length, true);
            this.y('\"');
        }
    }

    private void D(String s, String s1, String s2, boolean z) throws SAXException {
        String s3 = this.f(s, s2, z);
        if(s3 != null && !"".equals(s3)) {
            this.z(s3);
            this.y(':');
        }
        if(s1 != null && !"".equals(s1)) {
            this.z(s1);
            return;
        }
        this.z(s2.substring(s2.indexOf(58) + 1, s2.length()));
    }

    private boolean a(String s, String s1, String s2) {
        if(s == null) {
            int v = s1.indexOf(58);
            if(v != -1) {
                s = s1.substring(v + 1, s1.length());
            }
        }
        if(!s.equals(s2)) {
            return false;
        }
        for(int v1 = 0; true; ++v1) {
            String[] arr_s = this.a;
            if(v1 >= arr_s.length) {
                break;
            }
            if(s.equals(arr_s[v1])) {
                return true;
            }
        }
        return false;
    }

    public void b(String s) throws SAXException {
        char[] arr_c = s.toCharArray();
        this.characters(arr_c, 0, arr_c.length);
    }

    public void c(String s, String s1) throws SAXException {
        this.e("", s, "", this.b, s1);
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void characters(char[] arr_c, int v, int v1) throws SAXException {
        if(this.t) {
            for(int v2 = v; v2 < v + v1; ++v2) {
                this.y(arr_c[v2]);
            }
        }
        else {
            this.B(arr_c, v, v1, false);
        }
        super.characters(arr_c, v, v1);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void comment(char[] arr_c, int v, int v1) throws SAXException {
        this.z("<!--");
        for(int v2 = v; true; ++v2) {
            int v3 = v + v1;
            if(v2 >= v3) {
                break;
            }
            this.y(arr_c[v2]);
            if(arr_c[v2] == 45 && v2 + 1 <= v3 && arr_c[v2 + 1] == 45) {
                this.y(' ');
            }
        }
        this.z("-->");
    }

    public void d(String s, String s1, String s2) throws SAXException {
        this.e(s, s1, "", this.b, s2);
    }

    public void e(String s, String s1, String s2, Attributes attributes0, String s3) throws SAXException {
        this.startElement(s, s1, s2, attributes0);
        this.b(s3);
        this.endElement(s, s1, s2);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void endDocument() throws SAXException {
        this.y('\n');
        super.endDocument();
        try {
            this.l();
        }
        catch(IOException iOException0) {
            throw new SAXException(iOException0);
        }
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void endElement(String s, String s1, String s2) throws SAXException {
        if(!this.m || !s.equals("http://www.w3.org/1999/xhtml") && !s.equals("") || !s2.equals("area") && !s2.equals("base") && !s2.equals("basefont") && !s2.equals("br") && !s2.equals("col") && !s2.equals("frame") && !s2.equals("hr") && !s2.equals("img") && !s2.equals("input") && !s2.equals("isindex") && !s2.equals("link") && !s2.equals("meta") && !s2.equals("param")) {
            this.z("</");
            this.D(s, s1, s2, true);
            this.y('>');
        }
        this.t = false;
        super.endElement(s, s1, s2);
        this.h.popContext();
        --this.f;
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endEntity(String s) throws SAXException {
    }

    private String f(String s, String s1, boolean z) {
        String s2 = "";
        String s3 = this.h.getURI("");
        String s4 = null;
        if("".equals(s)) {
            if(z && s3 != null) {
                this.h.declarePrefix("", "");
            }
            return null;
        }
        String s5 = !z || s3 == null || !s.equals(s3) ? this.h.getPrefix(s) : "";
        if(s5 != null) {
            return s5;
        }
        String s6 = (String)this.e.get(s);
        if(s6 != null && ((!z || s3 != null) && "".equals(s6) || this.h.getURI(s6) != null)) {
            s6 = null;
        }
        if(s6 == null) {
            s6 = (String)this.c.get(s);
            if(s6 == null || (z && s3 == null || !"".equals(s6)) && this.h.getURI(s6) == null) {
                s4 = s6;
            }
        }
        else {
            s4 = s6;
        }
        if(s4 != null || s1 == null || "".equals(s1)) {
            s2 = s4;
        }
        else {
            int v = s1.indexOf(58);
            if(v != -1) {
                s2 = s1.substring(0, v);
            }
            else if(!z || s3 != null) {
                s2 = s4;
            }
        }
        while(s2 == null || this.h.getURI(s2) != null) {
            int v1 = this.i + 1;
            this.i = v1;
            s2 = "__NS" + v1;
        }
        this.h.declarePrefix(s2, s);
        this.e.put(s, s2);
        return s2;
    }

    public void g(String s) throws SAXException {
        this.i("", s, "", this.b);
    }

    public void h(String s, String s1) throws SAXException {
        this.i(s, s1, "", this.b);
    }

    public void i(String s, String s1, String s2, Attributes attributes0) throws SAXException {
        this.h.pushContext();
        this.y('<');
        this.D(s, s1, s2, true);
        this.A(attributes0);
        if(this.f == 1) {
            this.o();
        }
        this.C();
        this.z("/>");
        super.startElement(s, s1, s2, attributes0);
        super.endElement(s, s1, s2);
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void ignorableWhitespace(char[] arr_c, int v, int v1) throws SAXException {
        this.B(arr_c, v, v1, false);
        super.ignorableWhitespace(arr_c, v, v1);
    }

    public void j(String s) throws SAXException {
        this.endElement("", s, "");
    }

    public void k(String s, String s1) throws SAXException {
        this.endElement(s, s1, "");
    }

    public void l() throws IOException {
        this.g.flush();
    }

    public void m(String s) {
        this.d.put(s, Boolean.TRUE);
    }

    public void n(String s, String s1) {
        this.v(s, s1);
        this.m(s);
    }

    private void o() {
        Enumeration enumeration0 = this.d.keys();
        while(enumeration0.hasMoreElements()) {
            this.f(((String)enumeration0.nextElement()), null, true);
        }
    }

    public String p(String s) {
        return this.j.getProperty(s);
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void processingInstruction(String s, String s1) throws SAXException {
        this.z("<?");
        this.z(s);
        this.y(' ');
        this.z(s1);
        this.z("?>");
        if(this.f < 1) {
            this.y('\n');
        }
        super.processingInstruction(s, s1);
    }

    public String q(String s) {
        return (String)this.c.get(s);
    }

    private void r(Writer writer0) {
        this.t(writer0);
        this.h = new NamespaceSupport();
        this.c = new Hashtable();
        this.d = new Hashtable();
        this.e = new Hashtable();
        this.j = new Properties();
    }

    public void s() {
        this.f = 0;
        this.i = 0;
        this.h.reset();
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startDTD(String s, String s1, String s2) throws SAXException {
        if(s == null) {
            return;
        }
        if(this.o) {
            return;
        }
        this.o = true;
        this.z("<!DOCTYPE ");
        this.z(s);
        if(s2 == null) {
            s2 = "";
        }
        String s3 = this.q;
        if(s3 != null) {
            s2 = s3;
        }
        int v = 34;
        int v1 = s2.indexOf(34) == -1 ? 34 : 39;
        String s4 = this.p;
        if(s4 != null) {
            s1 = s4;
        }
        if(s1 == null || "".equals(s1)) {
            this.z(" SYSTEM ");
        }
        else {
            if(s1.indexOf(34) != -1) {
                v = 39;
            }
            this.z(" PUBLIC ");
            this.y(((char)v));
            this.z(s1);
            this.y(((char)v));
            this.y(' ');
        }
        this.y(((char)v1));
        this.z(s2);
        this.y(((char)v1));
        this.z(">\n");
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void startDocument() throws SAXException {
        this.s();
        if(!"yes".equals(this.j.getProperty("omit-xml-declaration", "no"))) {
            this.z("<?xml");
            if(this.r == null) {
                this.z(" version=\"1.0\"");
            }
            else {
                this.z(" version=\"");
                this.z(this.r);
                this.z("\"");
            }
            if(this.l != null && this.l != "") {
                this.z(" encoding=\"");
                this.z(this.l);
                this.z("\"");
            }
            if(this.s == null) {
                this.z(" standalone=\"yes\"?>\n");
            }
            else {
                this.z(" standalone=\"");
                this.z(this.s);
                this.z("\"");
            }
        }
        super.startDocument();
    }

    @Override  // org.xml.sax.helpers.XMLFilterImpl
    public void startElement(String s, String s1, String s2, Attributes attributes0) throws SAXException {
        ++this.f;
        this.h.pushContext();
        if(this.n && !this.o) {
            this.startDTD((s1 == null ? s2 : s1), "", "");
        }
        this.y('<');
        this.D(s, s1, s2, true);
        this.A(attributes0);
        if(this.f == 1) {
            this.o();
        }
        this.C();
        this.y('>');
        if(this.m && (s2.equals("script") || s2.equals("style"))) {
            this.t = true;
        }
        super.startElement(s, s1, s2, attributes0);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startEntity(String s) throws SAXException {
    }

    public void t(Writer writer0) {
        if(writer0 == null) {
            this.g = new OutputStreamWriter(System.out);
            return;
        }
        this.g = writer0;
    }

    public void u(String s, String s1) {
        this.j.setProperty(s, s1);
        if(s.equals("encoding")) {
            this.l = s1;
            this.k = s1.substring(0, 3).equalsIgnoreCase("utf");
            return;
        }
        if(s.equals("method")) {
            this.m = s1.equals("html");
            return;
        }
        if(s.equals("doctype-public")) {
            this.p = s1;
            this.n = true;
            return;
        }
        if(s.equals("doctype-system")) {
            this.q = s1;
            this.n = true;
            return;
        }
        if(s.equals("version")) {
            this.r = s1;
            return;
        }
        if(s.equals("standalone")) {
            this.s = s1;
        }
    }

    public void v(String s, String s1) {
        this.c.put(s, s1);
    }

    public void w(String s) throws SAXException {
        this.startElement("", s, "", this.b);
    }

    public void x(String s, String s1) throws SAXException {
        this.startElement(s, s1, "", this.b);
    }

    private void y(char c) throws SAXException {
        try {
            this.g.write(((int)c));
        }
        catch(IOException iOException0) {
            throw new SAXException(iOException0);
        }
    }

    private void z(String s) throws SAXException {
        try {
            this.g.write(s);
        }
        catch(IOException iOException0) {
            throw new SAXException(iOException0);
        }
    }
}

