package javax.xml.bind;

import javax.xml.validation.Schema;

public abstract class Binder {
    public abstract ValidationEventHandler getEventHandler() throws JAXBException;

    public abstract Object getJAXBNode(Object arg1);

    public abstract Object getProperty(String arg1) throws PropertyException;

    public abstract Schema getSchema();

    public abstract Object getXMLNode(Object arg1);

    public abstract void marshal(Object arg1, Object arg2) throws JAXBException;

    public abstract void setEventHandler(ValidationEventHandler arg1) throws JAXBException;

    public abstract void setProperty(String arg1, Object arg2) throws PropertyException;

    public abstract void setSchema(Schema arg1);

    public abstract Object unmarshal(Object arg1) throws JAXBException;

    public abstract JAXBElement unmarshal(Object arg1, Class arg2) throws JAXBException;

    public abstract Object updateJAXB(Object arg1) throws JAXBException;

    public abstract Object updateXML(Object arg1) throws JAXBException;

    public abstract Object updateXML(Object arg1, Object arg2) throws JAXBException;
}

