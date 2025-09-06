package org.ccil.cowan.tagsoup.jaxp;

import java.util.Map.Entry;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import org.ccil.cowan.tagsoup.l;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

public class d extends SAXParser {
    final l a;

    protected d() {
        this.a = new l();
    }

    public boolean a(String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        return this.a.getFeature(s);
    }

    public static d b(Map map0) throws SAXException {
        d d0 = new d();
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                d0.c(((String)((Map.Entry)object0).getKey()), ((Boolean)((Map.Entry)object0).getValue()).booleanValue());
            }
        }
        return d0;
    }

    public void c(String s, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        this.a.setFeature(s, z);
    }

    @Override  // javax.xml.parsers.SAXParser
    public Parser getParser() throws SAXException {
        return new b(this.a);
    }

    @Override  // javax.xml.parsers.SAXParser
    public Object getProperty(String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        return this.a.getProperty(s);
    }

    @Override  // javax.xml.parsers.SAXParser
    public XMLReader getXMLReader() {
        return this.a;
    }

    @Override  // javax.xml.parsers.SAXParser
    public boolean isNamespaceAware() {
        try {
            return this.a.getFeature("http://xml.org/sax/features/namespaces");
        }
        catch(SAXException sAXException0) {
            throw new RuntimeException(sAXException0.getMessage());
        }
    }

    @Override  // javax.xml.parsers.SAXParser
    public boolean isValidating() {
        try {
            return this.a.getFeature("http://xml.org/sax/features/validation");
        }
        catch(SAXException sAXException0) {
            throw new RuntimeException(sAXException0.getMessage());
        }
    }

    @Override  // javax.xml.parsers.SAXParser
    public void setProperty(String s, Object object0) throws SAXNotRecognizedException, SAXNotSupportedException {
        this.a.setProperty(s, object0);
    }
}

