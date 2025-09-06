package javax.xml.bind;

public interface Validator {
    ValidationEventHandler getEventHandler() throws JAXBException;

    Object getProperty(String arg1) throws PropertyException;

    void setEventHandler(ValidationEventHandler arg1) throws JAXBException;

    void setProperty(String arg1, Object arg2) throws PropertyException;

    boolean validate(Object arg1) throws JAXBException;

    boolean validateRoot(Object arg1) throws JAXBException;
}

