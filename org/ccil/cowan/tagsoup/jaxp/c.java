package org.ccil.cowan.tagsoup.jaxp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public class c extends SAXParserFactory {
    private d a;
    private HashMap b;

    public c() {
        this.a = null;
        this.b = null;
    }

    private d a() {
        if(this.a == null) {
            this.a = new d();
        }
        return this.a;
    }

    @Override  // javax.xml.parsers.SAXParserFactory
    public boolean getFeature(String s) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        return this.a().a(s);
    }

    @Override  // javax.xml.parsers.SAXParserFactory
    public SAXParser newSAXParser() throws ParserConfigurationException {
        try {
            return d.b(this.b);
        }
        catch(SAXException sAXException0) {
            throw new ParserConfigurationException(sAXException0.getMessage());
        }
    }

    @Override  // javax.xml.parsers.SAXParserFactory
    public void setFeature(String s, boolean z) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        this.a().c(s, z);
        if(this.b == null) {
            this.b = new LinkedHashMap();
        }
        this.b.put(s, (z ? Boolean.TRUE : Boolean.FALSE));
    }
}

