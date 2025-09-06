package javax.xml.bind;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentUnmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public interface Unmarshaller {
    public static abstract class Listener {
        public void afterUnmarshal(Object object0, Object object1) {
        }

        public void beforeUnmarshal(Object object0, Object object1) {
        }
    }

    XmlAdapter getAdapter(Class arg1);

    AttachmentUnmarshaller getAttachmentUnmarshaller();

    ValidationEventHandler getEventHandler() throws JAXBException;

    Listener getListener();

    Object getProperty(String arg1) throws PropertyException;

    Schema getSchema();

    UnmarshallerHandler getUnmarshallerHandler();

    boolean isValidating() throws JAXBException;

    void setAdapter(Class arg1, XmlAdapter arg2);

    void setAdapter(XmlAdapter arg1);

    void setAttachmentUnmarshaller(AttachmentUnmarshaller arg1);

    void setEventHandler(ValidationEventHandler arg1) throws JAXBException;

    void setListener(Listener arg1);

    void setProperty(String arg1, Object arg2) throws PropertyException;

    void setSchema(Schema arg1);

    void setValidating(boolean arg1) throws JAXBException;

    Object unmarshal(File arg1) throws JAXBException;

    Object unmarshal(InputStream arg1) throws JAXBException;

    Object unmarshal(Reader arg1) throws JAXBException;

    Object unmarshal(URL arg1) throws JAXBException;

    Object unmarshal(XMLEventReader arg1) throws JAXBException;

    Object unmarshal(XMLStreamReader arg1) throws JAXBException;

    Object unmarshal(Source arg1) throws JAXBException;

    Object unmarshal(Node arg1) throws JAXBException;

    Object unmarshal(InputSource arg1) throws JAXBException;

    JAXBElement unmarshal(XMLEventReader arg1, Class arg2) throws JAXBException;

    JAXBElement unmarshal(XMLStreamReader arg1, Class arg2) throws JAXBException;

    JAXBElement unmarshal(Source arg1, Class arg2) throws JAXBException;

    JAXBElement unmarshal(Node arg1, Class arg2) throws JAXBException;
}

