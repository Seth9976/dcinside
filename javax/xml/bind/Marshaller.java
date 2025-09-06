package javax.xml.bind;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentMarshaller;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.validation.Schema;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

public interface Marshaller {
    public static abstract class Listener {
        public void afterMarshal(Object object0) {
        }

        public void beforeMarshal(Object object0) {
        }
    }

    public static final String JAXB_ENCODING = "jaxb.encoding";
    public static final String JAXB_FORMATTED_OUTPUT = "jaxb.formatted.output";
    public static final String JAXB_FRAGMENT = "jaxb.fragment";
    public static final String JAXB_NO_NAMESPACE_SCHEMA_LOCATION = "jaxb.noNamespaceSchemaLocation";
    public static final String JAXB_SCHEMA_LOCATION = "jaxb.schemaLocation";

    XmlAdapter getAdapter(Class arg1);

    AttachmentMarshaller getAttachmentMarshaller();

    ValidationEventHandler getEventHandler() throws JAXBException;

    Listener getListener();

    Node getNode(Object arg1) throws JAXBException;

    Object getProperty(String arg1) throws PropertyException;

    Schema getSchema();

    void marshal(Object arg1, File arg2) throws JAXBException;

    void marshal(Object arg1, OutputStream arg2) throws JAXBException;

    void marshal(Object arg1, Writer arg2) throws JAXBException;

    void marshal(Object arg1, XMLEventWriter arg2) throws JAXBException;

    void marshal(Object arg1, XMLStreamWriter arg2) throws JAXBException;

    void marshal(Object arg1, Result arg2) throws JAXBException;

    void marshal(Object arg1, Node arg2) throws JAXBException;

    void marshal(Object arg1, ContentHandler arg2) throws JAXBException;

    void setAdapter(Class arg1, XmlAdapter arg2);

    void setAdapter(XmlAdapter arg1);

    void setAttachmentMarshaller(AttachmentMarshaller arg1);

    void setEventHandler(ValidationEventHandler arg1) throws JAXBException;

    void setListener(Listener arg1);

    void setProperty(String arg1, Object arg2) throws PropertyException;

    void setSchema(Schema arg1);
}

