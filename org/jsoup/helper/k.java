package org.jsoup.helper;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.jsoup.internal.n;
import org.jsoup.nodes.d;
import org.jsoup.nodes.e;
import org.jsoup.nodes.f;
import org.jsoup.nodes.g;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.nodes.y;
import org.jsoup.parser.b;
import org.jsoup.select.j;
import org.jsoup.select.l;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class k {
    public static class a implements l {
        private final Document a;
        private boolean b;
        private final Stack c;
        private Node d;
        private org.jsoup.nodes.f.a.a e;
        private final o f;
        private static final String g = "xmlns";
        private static final String h = "xmlns:";

        public a(Document document0) {
            this.b = true;
            Stack stack0 = new Stack();
            this.c = stack0;
            this.e = org.jsoup.nodes.f.a.a.b;
            this.a = document0;
            stack0.push(new HashMap());
            this.d = document0;
            o o0 = (o)document0.getUserData("jsoupContextSource");
            this.f = o0;
            if(o0 != null) {
                f f0 = o0.W();
                if(f0 != null && f0.v3().c() instanceof b) {
                    ((HashMap)stack0.peek()).put("", "http://www.w3.org/1999/xhtml");
                }
            }
        }

        @Override  // org.jsoup.select.l
        public void a(t t0, int v) {
            if(t0 instanceof o && this.d.getParentNode() instanceof Element) {
                this.d = this.d.getParentNode();
            }
            this.c.pop();
        }

        @Override  // org.jsoup.select.l
        public void b(t t0, int v) {
            HashMap hashMap0 = new HashMap(((Map)this.c.peek()));
            this.c.push(hashMap0);
            if(t0 instanceof o) {
                o o0 = (o)t0;
                String s = this.g(o0);
                String s1 = this.b ? ((String)((HashMap)this.c.peek()).get(s)) : null;
                String s2 = o0.P2();
                try {
                    if(s1 == null && s2.contains(":")) {
                        s1 = "";
                    }
                    Element element0 = this.a.createElementNS(s1, s2);
                    this.f(o0, element0);
                    this.e(element0, o0);
                    if(o0 == this.f) {
                        this.a.setUserData("jsoupContextNode", element0, null);
                    }
                    this.d = element0;
                }
                catch(DOMException unused_ex) {
                    this.e(this.a.createTextNode("<" + s2 + ">"), o0);
                }
                return;
            }
            if(t0 instanceof y) {
                String s3 = ((y)t0).A0();
                this.e(this.a.createTextNode(s3), ((y)t0));
                return;
            }
            if(t0 instanceof d) {
                String s4 = ((d)t0).A0();
                this.e(this.a.createComment(s4), ((d)t0));
                return;
            }
            if(t0 instanceof e) {
                String s5 = ((e)t0).z0();
                this.e(this.a.createTextNode(s5), ((e)t0));
            }
        }

        private void e(Node node0, t t0) {
            node0.setUserData("jsoupSource", t0, null);
            this.d.appendChild(node0);
        }

        private void f(t t0, Element element0) {
            for(Object object0: t0.j()) {
                org.jsoup.nodes.a a0 = (org.jsoup.nodes.a)object0;
                String s = org.jsoup.nodes.a.d(a0.c(), this.e);
                if(s != null) {
                    element0.setAttribute(s, a0.e());
                }
            }
        }

        private String g(o o0) {
            Iterator iterator0 = o0.j().iterator();
            while(true) {
                String s = "";
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                org.jsoup.nodes.a a0 = (org.jsoup.nodes.a)object0;
                String s1 = a0.c();
                if(!s1.equals("xmlns")) {
                    if(!s1.startsWith("xmlns:")) {
                        continue;
                    }
                    s = s1.substring(6);
                }
                ((HashMap)this.c.peek()).put(s, a0.e());
            }
            int v = o0.P2().indexOf(58);
            return v <= 0 ? "" : o0.P2().substring(0, v);
        }
    }

    protected DocumentBuilderFactory a;
    private boolean b;
    public static final String c = "jsoupSource";
    private static final String d = "jsoupContextSource";
    private static final String e = "jsoupContextNode";
    public static final String f = "javax.xml.xpath.XPathFactory:jsoup";

    public k() {
        this.b = true;
        DocumentBuilderFactory documentBuilderFactory0 = DocumentBuilderFactory.newInstance();
        this.a = documentBuilderFactory0;
        documentBuilderFactory0.setNamespaceAware(true);
    }

    public static HashMap a() {
        return k.k("html");
    }

    public static HashMap b() {
        return k.k("xml");
    }

    public String c(Document document0) {
        return k.d(document0, null);
    }

    public static String d(Document document0, Map map0) {
        try {
            DOMSource dOMSource0 = new DOMSource(document0);
            StringWriter stringWriter0 = new StringWriter();
            StreamResult streamResult0 = new StreamResult(stringWriter0);
            Transformer transformer0 = TransformerFactory.newInstance().newTransformer();
            if(map0 != null) {
                transformer0.setOutputProperties(k.n(map0));
            }
            if(document0.getDoctype() != null) {
                DocumentType documentType0 = document0.getDoctype();
                if(!n.i(documentType0.getPublicId())) {
                    transformer0.setOutputProperty("doctype-public", documentType0.getPublicId());
                }
                if(!n.i(documentType0.getSystemId())) {
                    transformer0.setOutputProperty("doctype-system", documentType0.getSystemId());
                }
                else if(documentType0.getName().equalsIgnoreCase("html") && n.i(documentType0.getPublicId()) && n.i(documentType0.getSystemId())) {
                    transformer0.setOutputProperty("doctype-system", "about:legacy-compat");
                }
            }
            transformer0.transform(dOMSource0, streamResult0);
            return stringWriter0.toString();
        }
        catch(TransformerException transformerException0) {
        }
        throw new IllegalStateException(transformerException0);
    }

    public Node e(Document document0) {
        return (Node)document0.getUserData("jsoupContextNode");
    }

    public static Document f(f f0) {
        return new k().i(f0);
    }

    public void g(f f0, Document document0) {
        this.h(f0, document0);
    }

    public void h(o o0, Document document0) {
        a k$a0 = new a(document0);
        k$a0.b = this.b;
        f f0 = o0.W();
        if(f0 != null) {
            if(!n.i(f0.r3())) {
                document0.setDocumentURI(f0.r3());
            }
            k$a0.e = f0.s3().r();
        }
        if(o0 instanceof f) {
            o0 = o0.p1();
        }
        j.c(k$a0, o0);
    }

    public Document i(f f0) {
        return this.j(f0);
    }

    public Document j(o o0) {
        i.o(o0);
        try {
            DocumentBuilder documentBuilder0 = this.a.newDocumentBuilder();
            DOMImplementation dOMImplementation0 = documentBuilder0.getDOMImplementation();
            Document document0 = documentBuilder0.newDocument();
            f f0 = o0.W();
            g g0 = f0 == null ? null : f0.l3();
            if(g0 != null) {
                try {
                    document0.appendChild(dOMImplementation0.createDocumentType(g0.z0(), g0.A0(), g0.C0()));
                }
                catch(DOMException unused_ex) {
                }
            }
            document0.setXmlStandalone(true);
            document0.setUserData("jsoupContextSource", (o0 instanceof f ? o0.p1() : o0), null);
            if(f0 != null) {
                o0 = f0;
            }
            this.h(o0, document0);
            return document0;
        }
        catch(ParserConfigurationException parserConfigurationException0) {
            throw new IllegalStateException(parserConfigurationException0);
        }
    }

    private static HashMap k(String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("method", s);
        return hashMap0;
    }

    public k l(boolean z) {
        this.b = z;
        this.a.setNamespaceAware(z);
        return this;
    }

    public boolean m() {
        return this.b;
    }

    static Properties n(Map map0) {
        Properties properties0 = new Properties();
        properties0.putAll(map0);
        return properties0;
    }

    public NodeList o(String s, Document document0) {
        return this.p(s, document0);
    }

    public NodeList p(String s, Node node0) {
        i.n(s, "xpath");
        i.q(node0, "contextNode");
        try {
            NodeList nodeList0 = (NodeList)(System.getProperty("javax.xml.xpath.XPathFactory:jsoup") == null ? XPathFactory.newInstance() : XPathFactory.newInstance("jsoup")).newXPath().compile(s).evaluate(node0, XPathConstants.NODESET);
            i.o(nodeList0);
            return nodeList0;
        }
        catch(XPathExpressionException | XPathFactoryConfigurationException xPathExpressionException0) {
        }
        throw new org.jsoup.select.n.a(xPathExpressionException0, "Could not evaluate XPath query [%s]: %s", new Object[]{s, xPathExpressionException0.getMessage()});
    }

    public List q(NodeList nodeList0, Class class0) {
        i.o(nodeList0);
        i.o(class0);
        List list0 = new ArrayList(nodeList0.getLength());
        for(int v = 0; v < nodeList0.getLength(); ++v) {
            Object object0 = nodeList0.item(v).getUserData("jsoupSource");
            if(class0.isInstance(object0)) {
                list0.add(((t)class0.cast(object0)));
            }
        }
        return list0;
    }
}

