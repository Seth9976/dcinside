package org.ccil.cowan.tagsoup.jaxp;

import java.io.IOException;
import java.util.Locale;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

public class b implements Parser {
    static final class a implements AttributeList {
        Attributes a;

        public void a(Attributes attributes0) {
            this.a = attributes0;
        }

        @Override  // org.xml.sax.AttributeList
        public int getLength() {
            return this.a.getLength();
        }

        @Override  // org.xml.sax.AttributeList
        public String getName(int v) {
            String s = this.a.getQName(v);
            return s == null ? this.a.getLocalName(v) : s;
        }

        @Override  // org.xml.sax.AttributeList
        public String getType(int v) {
            return this.a.getType(v);
        }

        @Override  // org.xml.sax.AttributeList
        public String getType(String s) {
            return this.a.getType(s);
        }

        @Override  // org.xml.sax.AttributeList
        public String getValue(int v) {
            return this.a.getValue(v);
        }

        @Override  // org.xml.sax.AttributeList
        public String getValue(String s) {
            return this.a.getValue(s);
        }
    }

    static final class org.ccil.cowan.tagsoup.jaxp.b.b implements ContentHandler {
        final DocumentHandler a;
        final a b;

        org.ccil.cowan.tagsoup.jaxp.b.b(DocumentHandler documentHandler0) {
            this.b = new a();
            this.a = documentHandler0;
        }

        @Override  // org.xml.sax.ContentHandler
        public void characters(char[] arr_c, int v, int v1) throws SAXException {
            this.a.characters(arr_c, v, v1);
        }

        @Override  // org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            this.a.endDocument();
        }

        @Override  // org.xml.sax.ContentHandler
        public void endElement(String s, String s1, String s2) throws SAXException {
            if(s2 != null) {
                s1 = s2;
            }
            this.a.endElement(s1);
        }

        @Override  // org.xml.sax.ContentHandler
        public void endPrefixMapping(String s) {
        }

        @Override  // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] arr_c, int v, int v1) throws SAXException {
            this.a.ignorableWhitespace(arr_c, v, v1);
        }

        @Override  // org.xml.sax.ContentHandler
        public void processingInstruction(String s, String s1) throws SAXException {
            this.a.processingInstruction(s, s1);
        }

        @Override  // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator0) {
            this.a.setDocumentLocator(locator0);
        }

        @Override  // org.xml.sax.ContentHandler
        public void skippedEntity(String s) {
        }

        @Override  // org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            this.a.startDocument();
        }

        @Override  // org.xml.sax.ContentHandler
        public void startElement(String s, String s1, String s2, Attributes attributes0) throws SAXException {
            if(s2 != null) {
                s1 = s2;
            }
            this.b.a(attributes0);
            this.a.startElement(s1, this.b);
        }

        @Override  // org.xml.sax.ContentHandler
        public void startPrefixMapping(String s, String s1) {
        }
    }

    final XMLReader a;

    public b(XMLReader xMLReader0) {
        this.a = xMLReader0;
    }

    @Override  // org.xml.sax.Parser
    public void parse(String s) throws SAXException {
        try {
            this.a.parse(s);
        }
        catch(IOException iOException0) {
            throw new SAXException(iOException0);
        }
    }

    @Override  // org.xml.sax.Parser
    public void parse(InputSource inputSource0) throws SAXException {
        try {
            this.a.parse(inputSource0);
        }
        catch(IOException iOException0) {
            throw new SAXException(iOException0);
        }
    }

    @Override  // org.xml.sax.Parser
    public void setDTDHandler(DTDHandler dTDHandler0) {
        this.a.setDTDHandler(dTDHandler0);
    }

    @Override  // org.xml.sax.Parser
    public void setDocumentHandler(DocumentHandler documentHandler0) {
        org.ccil.cowan.tagsoup.jaxp.b.b b$b0 = new org.ccil.cowan.tagsoup.jaxp.b.b(documentHandler0);
        this.a.setContentHandler(b$b0);
    }

    @Override  // org.xml.sax.Parser
    public void setEntityResolver(EntityResolver entityResolver0) {
        this.a.setEntityResolver(entityResolver0);
    }

    @Override  // org.xml.sax.Parser
    public void setErrorHandler(ErrorHandler errorHandler0) {
        this.a.setErrorHandler(errorHandler0);
    }

    @Override  // org.xml.sax.Parser
    public void setLocale(Locale locale0) throws SAXException {
        throw new SAXNotSupportedException("TagSoup does not implement setLocale() method");
    }
}

