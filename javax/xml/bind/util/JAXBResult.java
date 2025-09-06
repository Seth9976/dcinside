package javax.xml.bind.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.transform.sax.SAXResult;

public class JAXBResult extends SAXResult {
    private final UnmarshallerHandler unmarshallerHandler;

    public JAXBResult(JAXBContext jAXBContext0) throws JAXBException {
        this((jAXBContext0 == null ? JAXBResult.assertionFailed() : jAXBContext0.createUnmarshaller()));
    }

    public JAXBResult(Unmarshaller unmarshaller0) throws JAXBException {
        if(unmarshaller0 == null) {
            throw new JAXBException(Messages.format("JAXBResult.NullUnmarshaller"));
        }
        UnmarshallerHandler unmarshallerHandler0 = unmarshaller0.getUnmarshallerHandler();
        this.unmarshallerHandler = unmarshallerHandler0;
        super.setHandler(unmarshallerHandler0);
    }

    private static Unmarshaller assertionFailed() throws JAXBException {
        throw new JAXBException(Messages.format("JAXBResult.NullContext"));
    }

    public Object getResult() throws JAXBException {
        return this.unmarshallerHandler.getResult();
    }
}

