package javax.xml.bind.helpers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller.Listener;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentUnmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public abstract class AbstractUnmarshallerImpl implements Unmarshaller {
    private ValidationEventHandler eventHandler;
    private XMLReader reader;
    protected boolean validating;

    public AbstractUnmarshallerImpl() {
        this.eventHandler = new DefaultValidationEventHandler();
        this.validating = false;
        this.reader = null;
    }

    protected UnmarshalException createUnmarshalException(SAXException sAXException0) {
        Exception exception0 = sAXException0.getException();
        if(exception0 instanceof UnmarshalException) {
            return (UnmarshalException)exception0;
        }
        if(exception0 instanceof RuntimeException) {
            throw (RuntimeException)exception0;
        }
        return exception0 == null ? new UnmarshalException(sAXException0) : new UnmarshalException(exception0);
    }

    @Override  // javax.xml.bind.Unmarshaller
    public XmlAdapter getAdapter(Class class0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public AttachmentUnmarshaller getAttachmentUnmarshaller() {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public ValidationEventHandler getEventHandler() throws JAXBException {
        return this.eventHandler;
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Listener getListener() {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Object getProperty(String s) throws PropertyException {
        if(s != null) {
            throw new PropertyException(s);
        }
        throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "name"));
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Schema getSchema() {
        throw new UnsupportedOperationException();
    }

    protected XMLReader getXMLReader() throws JAXBException {
        if(this.reader == null) {
            try {
                SAXParserFactory sAXParserFactory0 = SAXParserFactory.newInstance();
                sAXParserFactory0.setNamespaceAware(true);
                sAXParserFactory0.setValidating(false);
                this.reader = sAXParserFactory0.newSAXParser().getXMLReader();
                return this.reader;
            }
            catch(ParserConfigurationException parserConfigurationException0) {
                throw new JAXBException(parserConfigurationException0);
            }
            catch(SAXException sAXException0) {
                throw new JAXBException(sAXException0);
            }
        }
        return this.reader;
    }

    @Override  // javax.xml.bind.Unmarshaller
    public boolean isValidating() throws JAXBException {
        return this.validating;
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setAdapter(Class class0, XmlAdapter xmlAdapter0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setAdapter(XmlAdapter xmlAdapter0) {
        if(xmlAdapter0 == null) {
            throw new IllegalArgumentException();
        }
        this.setAdapter(xmlAdapter0.getClass(), xmlAdapter0);
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setAttachmentUnmarshaller(AttachmentUnmarshaller attachmentUnmarshaller0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setEventHandler(ValidationEventHandler validationEventHandler0) throws JAXBException {
        if(validationEventHandler0 == null) {
            this.eventHandler = new DefaultValidationEventHandler();
            return;
        }
        this.eventHandler = validationEventHandler0;
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setListener(Listener unmarshaller$Listener0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setProperty(String s, Object object0) throws PropertyException {
        if(s != null) {
            throw new PropertyException(s, object0);
        }
        throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "name"));
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setSchema(Schema schema0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public void setValidating(boolean z) throws JAXBException {
        this.validating = z;
    }

    private static InputSource streamSourceToInputSource(StreamSource streamSource0) {
        InputSource inputSource0 = new InputSource();
        inputSource0.setSystemId(streamSource0.getSystemId());
        inputSource0.setByteStream(streamSource0.getInputStream());
        inputSource0.setCharacterStream(streamSource0.getReader());
        return inputSource0;
    }

    private Object unmarshal(String s) throws JAXBException {
        return this.unmarshal(new InputSource(s));
    }

    private Object unmarshal(SAXSource sAXSource0) throws JAXBException {
        XMLReader xMLReader0 = sAXSource0.getXMLReader();
        if(xMLReader0 == null) {
            xMLReader0 = this.getXMLReader();
        }
        return this.unmarshal(xMLReader0, sAXSource0.getInputSource());
    }

    @Override  // javax.xml.bind.Unmarshaller
    public final Object unmarshal(File file0) throws JAXBException {
        if(file0 != null) {
            try {
                return this.unmarshal(new BufferedInputStream(new FileInputStream(file0)));
            }
            catch(FileNotFoundException fileNotFoundException0) {
                throw new IllegalArgumentException(fileNotFoundException0.getMessage());
            }
        }
        throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "file"));
    }

    @Override  // javax.xml.bind.Unmarshaller
    public final Object unmarshal(InputStream inputStream0) throws JAXBException {
        if(inputStream0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "is"));
        }
        return this.unmarshal(new InputSource(inputStream0));
    }

    @Override  // javax.xml.bind.Unmarshaller
    public final Object unmarshal(Reader reader0) throws JAXBException {
        if(reader0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "reader"));
        }
        return this.unmarshal(new InputSource(reader0));
    }

    @Override  // javax.xml.bind.Unmarshaller
    public final Object unmarshal(URL uRL0) throws JAXBException {
        if(uRL0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "url"));
        }
        return this.unmarshal(uRL0.toExternalForm());
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Object unmarshal(XMLEventReader xMLEventReader0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Object unmarshal(XMLStreamReader xMLStreamReader0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public Object unmarshal(Source source0) throws JAXBException {
        if(source0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "source"));
        }
        if(source0 instanceof SAXSource) {
            return this.unmarshal(((SAXSource)source0));
        }
        if(source0 instanceof StreamSource) {
            return this.unmarshal(AbstractUnmarshallerImpl.streamSourceToInputSource(((StreamSource)source0)));
        }
        if(!(source0 instanceof DOMSource)) {
            throw new IllegalArgumentException();
        }
        return this.unmarshal(((DOMSource)source0).getNode());
    }

    @Override  // javax.xml.bind.Unmarshaller
    public final Object unmarshal(InputSource inputSource0) throws JAXBException {
        if(inputSource0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "source"));
        }
        return this.unmarshal(this.getXMLReader(), inputSource0);
    }

    protected abstract Object unmarshal(XMLReader arg1, InputSource arg2) throws JAXBException;

    @Override  // javax.xml.bind.Unmarshaller
    public JAXBElement unmarshal(XMLEventReader xMLEventReader0, Class class0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public JAXBElement unmarshal(XMLStreamReader xMLStreamReader0, Class class0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public JAXBElement unmarshal(Source source0, Class class0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Unmarshaller
    public JAXBElement unmarshal(Node node0, Class class0) throws JAXBException {
        throw new UnsupportedOperationException();
    }
}

