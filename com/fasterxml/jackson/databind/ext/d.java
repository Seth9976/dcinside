package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

public class d extends M {
    protected final TransformerFactory d;

    public d() {
        super(Node.class);
        try {
            TransformerFactory transformerFactory0 = TransformerFactory.newInstance();
            this.d = transformerFactory0;
            transformerFactory0.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            d.Q(transformerFactory0, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
            d.Q(transformerFactory0, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Could not instantiate `TransformerFactory`: " + exception0.getMessage(), exception0);
        }
    }

    public void P(Node node0, k k0, I i0) throws IOException {
        try {
            Transformer transformer0 = this.d.newTransformer();
            transformer0.setOutputProperty("omit-xml-declaration", "yes");
            transformer0.setOutputProperty("indent", "no");
            StreamResult streamResult0 = new StreamResult(new StringWriter());
            transformer0.transform(new DOMSource(node0), streamResult0);
            k0.d(streamResult0.getWriter().toString());
        }
        catch(TransformerConfigurationException transformerConfigurationException0) {
            throw new IllegalStateException("Could not create XML Transformer for writing DOM `Node` value: " + transformerConfigurationException0.getMessage(), transformerConfigurationException0);
        }
        catch(TransformerException transformerException0) {
            i0.M0(transformerException0, "DOM `Node` value serialization failed: %s", new Object[]{transformerException0.getMessage()});
        }
    }

    private static void Q(TransformerFactory transformerFactory0, String s, Object object0) {
        try {
            transformerFactory0.setAttribute(s, object0);
        }
        catch(Exception unused_ex) {
            System.err.println("[DOMSerializer] Failed to set TransformerFactory attribute: " + s);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        if(g0 != null) {
            g0.p(m0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.P(((Node)object0), k0, i0);
    }
}

