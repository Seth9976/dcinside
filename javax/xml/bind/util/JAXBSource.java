package javax.xml.bind.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.XMLFilterImpl;

public class JAXBSource extends SAXSource {
    private final Object contentObject;
    private final Marshaller marshaller;
    private final XMLReader pseudoParser;

    public JAXBSource(JAXBContext jAXBContext0, Object object0) throws JAXBException {
        Marshaller marshaller0 = jAXBContext0 == null ? JAXBSource.assertionFailed(Messages.format("JAXBSource.NullContext")) : jAXBContext0.createMarshaller();
        if(object0 == null) {
            object0 = JAXBSource.assertionFailed(Messages.format("JAXBSource.NullContent"));
        }
        this(marshaller0, object0);
    }

    public JAXBSource(Marshaller marshaller0, Object object0) throws JAXBException {
        javax.xml.bind.util.JAXBSource.1 jAXBSource$10 = new XMLReader() {
            private DTDHandler dtdHandler;
            private EntityResolver entityResolver;
            private ErrorHandler errorHandler;
            private LexicalHandler lexicalHandler;
            private XMLFilter repeater;

            {
                this.repeater = new XMLFilterImpl();
            }

            @Override  // org.xml.sax.XMLReader
            public ContentHandler getContentHandler() {
                return this.repeater.getContentHandler();
            }

            @Override  // org.xml.sax.XMLReader
            public DTDHandler getDTDHandler() {
                return this.dtdHandler;
            }

            @Override  // org.xml.sax.XMLReader
            public EntityResolver getEntityResolver() {
                return this.entityResolver;
            }

            @Override  // org.xml.sax.XMLReader
            public ErrorHandler getErrorHandler() {
                return this.errorHandler;
            }

            @Override  // org.xml.sax.XMLReader
            public boolean getFeature(String s) throws SAXNotRecognizedException {
                if(s.equals("http://xml.org/sax/features/namespaces")) {
                    return true;
                }
                if(!s.equals("http://xml.org/sax/features/namespace-prefixes")) {
                    throw new SAXNotRecognizedException(s);
                }
                return false;
            }

            @Override  // org.xml.sax.XMLReader
            public Object getProperty(String s) throws SAXNotRecognizedException {
                if(!"http://xml.org/sax/properties/lexical-handler".equals(s)) {
                    throw new SAXNotRecognizedException(s);
                }
                return this.lexicalHandler;
            }

            public void parse() throws SAXException {
                try {
                    JAXBSource.this.marshaller.marshal(JAXBSource.this.contentObject, ((XMLFilterImpl)this.repeater));
                }
                catch(JAXBException jAXBException0) {
                    SAXParseException sAXParseException0 = new SAXParseException(jAXBException0.getMessage(), null, null, -1, -1, jAXBException0);
                    ErrorHandler errorHandler0 = this.errorHandler;
                    if(errorHandler0 != null) {
                        errorHandler0.fatalError(sAXParseException0);
                    }
                    throw sAXParseException0;
                }
            }

            @Override  // org.xml.sax.XMLReader
            public void parse(String s) throws SAXException {
                this.parse();
            }

            @Override  // org.xml.sax.XMLReader
            public void parse(InputSource inputSource0) throws SAXException {
                this.parse();
            }

            @Override  // org.xml.sax.XMLReader
            public void setContentHandler(ContentHandler contentHandler0) {
                this.repeater.setContentHandler(contentHandler0);
            }

            @Override  // org.xml.sax.XMLReader
            public void setDTDHandler(DTDHandler dTDHandler0) {
                this.dtdHandler = dTDHandler0;
            }

            @Override  // org.xml.sax.XMLReader
            public void setEntityResolver(EntityResolver entityResolver0) {
                this.entityResolver = entityResolver0;
            }

            @Override  // org.xml.sax.XMLReader
            public void setErrorHandler(ErrorHandler errorHandler0) {
                this.errorHandler = errorHandler0;
            }

            @Override  // org.xml.sax.XMLReader
            public void setFeature(String s, boolean z) throws SAXNotRecognizedException {
                if(s.equals("http://xml.org/sax/features/namespaces") && z) {
                    return;
                }
                if(!s.equals("http://xml.org/sax/features/namespace-prefixes") || z) {
                    throw new SAXNotRecognizedException(s);
                }
            }

            @Override  // org.xml.sax.XMLReader
            public void setProperty(String s, Object object0) throws SAXNotRecognizedException {
                if(!"http://xml.org/sax/properties/lexical-handler".equals(s)) {
                    throw new SAXNotRecognizedException(s);
                }
                this.lexicalHandler = (LexicalHandler)object0;
            }
        };
        this.pseudoParser = jAXBSource$10;
        if(marshaller0 == null) {
            throw new JAXBException(Messages.format("JAXBSource.NullMarshaller"));
        }
        if(object0 == null) {
            throw new JAXBException(Messages.format("JAXBSource.NullContent"));
        }
        this.marshaller = marshaller0;
        this.contentObject = object0;
        super.setXMLReader(jAXBSource$10);
        super.setInputSource(new InputSource());
    }

    private static Marshaller assertionFailed(String s) throws JAXBException {
        throw new JAXBException(s);
    }
}

