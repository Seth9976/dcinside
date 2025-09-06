package javax.xml.bind;

import java.util.Map;

public interface JAXBContextFactory {
    JAXBContext createContext(String arg1, ClassLoader arg2, Map arg3) throws JAXBException;

    JAXBContext createContext(Class[] arg1, Map arg2) throws JAXBException;
}

