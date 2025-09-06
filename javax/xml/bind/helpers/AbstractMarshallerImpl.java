package javax.xml.bind.helpers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller.Listener;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentMarshaller;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

public abstract class AbstractMarshallerImpl implements Marshaller {
    static String[] aliases;
    private String encoding;
    private ValidationEventHandler eventHandler;
    private boolean formattedOutput;
    private boolean fragment;
    private String noNSSchemaLocation;
    private String schemaLocation;

    static {
        AbstractMarshallerImpl.aliases = new String[]{"UTF-8", "UTF8", "UTF-16", "Unicode", "UTF-16BE", "UnicodeBigUnmarked", "UTF-16LE", "UnicodeLittleUnmarked", "US-ASCII", "ASCII", "TIS-620", "TIS620", "ISO-10646-UCS-2", "Unicode", "EBCDIC-CP-US", "cp037", "EBCDIC-CP-CA", "cp037", "EBCDIC-CP-NL", "cp037", "EBCDIC-CP-WT", "cp037", "EBCDIC-CP-DK", "cp277", "EBCDIC-CP-NO", "cp277", "EBCDIC-CP-FI", "cp278", "EBCDIC-CP-SE", "cp278", "EBCDIC-CP-IT", "cp280", "EBCDIC-CP-ES", "cp284", "EBCDIC-CP-GB", "cp285", "EBCDIC-CP-FR", "cp297", "EBCDIC-CP-AR1", "cp420", "EBCDIC-CP-HE", "cp424", "EBCDIC-CP-BE", "cp500", "EBCDIC-CP-CH", "cp500", "EBCDIC-CP-ROECE", "cp870", "EBCDIC-CP-YU", "cp870", "EBCDIC-CP-IS", "cp871", "EBCDIC-CP-AR2", "cp918"};
    }

    public AbstractMarshallerImpl() {
        this.eventHandler = new DefaultValidationEventHandler();
        this.encoding = "UTF-8";
        this.schemaLocation = null;
        this.noNSSchemaLocation = null;
        this.formattedOutput = false;
        this.fragment = false;
    }

    private void checkBoolean(String s, Object object0) throws PropertyException {
        if(!(object0 instanceof Boolean)) {
            throw new PropertyException(Messages.format("AbstractMarshallerImpl.MustBeBoolean", s));
        }
    }

    private void checkNotNull(Object object0, String s, Object object1, String s1) {
        if(object0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", s));
        }
        if(object1 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", s1));
        }
    }

    private void checkString(String s, Object object0) throws PropertyException {
        if(!(object0 instanceof String)) {
            throw new PropertyException(Messages.format("AbstractMarshallerImpl.MustBeString", s));
        }
    }

    @Override  // javax.xml.bind.Marshaller
    public XmlAdapter getAdapter(Class class0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Marshaller
    public AttachmentMarshaller getAttachmentMarshaller() {
        throw new UnsupportedOperationException();
    }

    protected String getEncoding() [...] // 潜在的解密器

    @Override  // javax.xml.bind.Marshaller
    public ValidationEventHandler getEventHandler() throws JAXBException {
        return this.eventHandler;
    }

    protected String getJavaEncoding(String s) throws UnsupportedEncodingException {
        try {
            "1".getBytes(s);
            return s;
        }
        catch(UnsupportedEncodingException unused_ex) {
            for(int v = 0; true; v += 2) {
                String[] arr_s = AbstractMarshallerImpl.aliases;
                if(v >= arr_s.length) {
                    break;
                }
                if(s.equals(arr_s[v])) {
                    "1".getBytes(AbstractMarshallerImpl.aliases[v + 1]);
                    return AbstractMarshallerImpl.aliases[v + 1];
                }
            }
            throw new UnsupportedEncodingException(s);
        }
    }

    @Override  // javax.xml.bind.Marshaller
    public Listener getListener() {
        throw new UnsupportedOperationException();
    }

    protected String getNoNSSchemaLocation() {
        return this.noNSSchemaLocation;
    }

    @Override  // javax.xml.bind.Marshaller
    public Node getNode(Object object0) throws JAXBException {
        this.checkNotNull(object0, "obj", Boolean.TRUE, "foo");
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Marshaller
    public Object getProperty(String s) throws PropertyException {
        if(s == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "name"));
        }
        if("jaxb.encoding".equals(s)) {
            return "UTF-8";
        }
        if("jaxb.formatted.output".equals(s)) {
            return this.isFormattedOutput();
        }
        if("jaxb.noNamespaceSchemaLocation".equals(s)) {
            return this.getNoNSSchemaLocation();
        }
        if("jaxb.schemaLocation".equals(s)) {
            return this.getSchemaLocation();
        }
        if(!"jaxb.fragment".equals(s)) {
            throw new PropertyException(s);
        }
        return this.isFragment();
    }

    @Override  // javax.xml.bind.Marshaller
    public Schema getSchema() {
        throw new UnsupportedOperationException();
    }

    protected String getSchemaLocation() {
        return this.schemaLocation;
    }

    protected boolean isFormattedOutput() {
        return this.formattedOutput;
    }

    protected boolean isFragment() {
        return this.fragment;
    }

    @Override  // javax.xml.bind.Marshaller
    public void marshal(Object object0, File file0) throws JAXBException {
        this.checkNotNull(object0, "jaxbElement", file0, "output");
        try {
            BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
            try {
                this.marshal(object0, new StreamResult(bufferedOutputStream0));
            }
            finally {
                bufferedOutputStream0.close();
            }
            return;
        }
        catch(IOException iOException0) {
        }
        throw new JAXBException(iOException0);
    }

    @Override  // javax.xml.bind.Marshaller
    public final void marshal(Object object0, OutputStream outputStream0) throws JAXBException {
        this.checkNotNull(object0, "obj", outputStream0, "os");
        this.marshal(object0, new StreamResult(outputStream0));
    }

    @Override  // javax.xml.bind.Marshaller
    public final void marshal(Object object0, Writer writer0) throws JAXBException {
        this.checkNotNull(object0, "obj", writer0, "writer");
        this.marshal(object0, new StreamResult(writer0));
    }

    @Override  // javax.xml.bind.Marshaller
    public void marshal(Object object0, XMLEventWriter xMLEventWriter0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Marshaller
    public void marshal(Object object0, XMLStreamWriter xMLStreamWriter0) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Marshaller
    public final void marshal(Object object0, Node node0) throws JAXBException {
        this.checkNotNull(object0, "obj", node0, "node");
        this.marshal(object0, new DOMResult(node0));
    }

    @Override  // javax.xml.bind.Marshaller
    public final void marshal(Object object0, ContentHandler contentHandler0) throws JAXBException {
        this.checkNotNull(object0, "obj", contentHandler0, "handler");
        this.marshal(object0, new SAXResult(contentHandler0));
    }

    @Override  // javax.xml.bind.Marshaller
    public void setAdapter(Class class0, XmlAdapter xmlAdapter0) {
        throw new UnsupportedOperationException();
    }

    @Override  // javax.xml.bind.Marshaller
    public void setAdapter(XmlAdapter xmlAdapter0) {
        if(xmlAdapter0 == null) {
            throw new IllegalArgumentException();
        }
        this.setAdapter(xmlAdapter0.getClass(), xmlAdapter0);
    }

    @Override  // javax.xml.bind.Marshaller
    public void setAttachmentMarshaller(AttachmentMarshaller attachmentMarshaller0) {
        throw new UnsupportedOperationException();
    }

    protected void setEncoding(String s) {
        this.encoding = s;
    }

    @Override  // javax.xml.bind.Marshaller
    public void setEventHandler(ValidationEventHandler validationEventHandler0) throws JAXBException {
        if(validationEventHandler0 == null) {
            this.eventHandler = new DefaultValidationEventHandler();
            return;
        }
        this.eventHandler = validationEventHandler0;
    }

    protected void setFormattedOutput(boolean z) {
        this.formattedOutput = z;
    }

    protected void setFragment(boolean z) {
        this.fragment = z;
    }

    @Override  // javax.xml.bind.Marshaller
    public void setListener(Listener marshaller$Listener0) {
        throw new UnsupportedOperationException();
    }

    protected void setNoNSSchemaLocation(String s) {
        this.noNSSchemaLocation = s;
    }

    @Override  // javax.xml.bind.Marshaller
    public void setProperty(String s, Object object0) throws PropertyException {
        if(s == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "name"));
        }
        if("jaxb.encoding".equals(s)) {
            this.checkString(s, object0);
            this.setEncoding(((String)object0));
            return;
        }
        if("jaxb.formatted.output".equals(s)) {
            this.checkBoolean(s, object0);
            this.setFormattedOutput(((Boolean)object0).booleanValue());
            return;
        }
        if("jaxb.noNamespaceSchemaLocation".equals(s)) {
            this.checkString(s, object0);
            this.setNoNSSchemaLocation(((String)object0));
            return;
        }
        if("jaxb.schemaLocation".equals(s)) {
            this.checkString(s, object0);
            this.setSchemaLocation(((String)object0));
            return;
        }
        if(!"jaxb.fragment".equals(s)) {
            throw new PropertyException(s, object0);
        }
        this.checkBoolean(s, object0);
        this.setFragment(((Boolean)object0).booleanValue());
    }

    @Override  // javax.xml.bind.Marshaller
    public void setSchema(Schema schema0) {
        throw new UnsupportedOperationException();
    }

    protected void setSchemaLocation(String s) {
        this.schemaLocation = s;
    }
}

