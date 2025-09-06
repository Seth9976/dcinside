package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.q;
import com.fasterxml.jackson.databind.h;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class c extends q {
    public static class a extends c {
        private static final long i = 1L;

        public a() {
            super(Document.class);
        }

        public Document C1(String s, h h0) throws IllegalArgumentException {
            return this.B1(s);
        }

        @Override  // com.fasterxml.jackson.databind.ext.c
        public Object r1(String s, h h0) {
            return this.C1(s, h0);
        }
    }

    public static class b extends c {
        private static final long i = 1L;

        public b() {
            super(Node.class);
        }

        public Node C1(String s, h h0) throws IllegalArgumentException {
            return this.B1(s);
        }

        @Override  // com.fasterxml.jackson.databind.ext.c
        public Object r1(String s, h h0) {
            return this.C1(s, h0);
        }
    }

    private static final long g = 1L;
    private static final DocumentBuilderFactory h;

    static {
        DocumentBuilderFactory documentBuilderFactory0 = DocumentBuilderFactory.newInstance();
        documentBuilderFactory0.setNamespaceAware(true);
        documentBuilderFactory0.setExpandEntityReferences(false);
        try {
            documentBuilderFactory0.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        }
        catch(ParserConfigurationException unused_ex) {
        }
        try {
            documentBuilderFactory0.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        }
        catch(Exception unused_ex) {
        }
        try {
            documentBuilderFactory0.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        }
        catch(Exception unused_ex) {
        }
        c.h = documentBuilderFactory0;
    }

    protected c(Class class0) {
        super(class0);
    }

    protected DocumentBuilder A1() throws ParserConfigurationException {
        return c.h.newDocumentBuilder();
    }

    protected final Document B1(String s) throws IllegalArgumentException {
        try {
            return this.A1().parse(new InputSource(new StringReader(s)));
        }
        catch(Exception exception0) {
            throw new IllegalArgumentException("Failed to parse JSON String as XML: " + exception0.getMessage(), exception0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.q
    public abstract Object r1(String arg1, h arg2);
}

