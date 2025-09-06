package javax.xml.bind;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import org.w3c.dom.Node;

public abstract class JAXBContext {
    public static final String JAXB_CONTEXT_FACTORY = "javax.xml.bind.JAXBContextFactory";

    public Binder createBinder() {
        return this.createBinder(Node.class);
    }

    public Binder createBinder(Class class0) {
        throw new UnsupportedOperationException();
    }

    public JAXBIntrospector createJAXBIntrospector() {
        throw new UnsupportedOperationException();
    }

    public abstract Marshaller createMarshaller() throws JAXBException;

    public abstract Unmarshaller createUnmarshaller() throws JAXBException;

    @Deprecated
    public abstract Validator createValidator() throws JAXBException;

    public void generateSchema(SchemaOutputResolver schemaOutputResolver0) throws IOException {
        throw new UnsupportedOperationException();
    }

    private static ClassLoader getContextClassLoader() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : ((ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }

            @Override
            public Object run() {
                return this.run();
            }
        }));
    }

    public static JAXBContext newInstance(String s) throws JAXBException {
        return JAXBContext.newInstance(s, JAXBContext.getContextClassLoader());
    }

    public static JAXBContext newInstance(String s, ClassLoader classLoader0) throws JAXBException {
        return JAXBContext.newInstance(s, classLoader0, Collections.emptyMap());
    }

    public static JAXBContext newInstance(String s, ClassLoader classLoader0, Map map0) throws JAXBException {
        return ContextFinder.find("javax.xml.bind.JAXBContextFactory", s, classLoader0, map0);
    }

    public static JAXBContext newInstance(Class[] arr_class) throws JAXBException {
        return JAXBContext.newInstance(arr_class, Collections.emptyMap());
    }

    public static JAXBContext newInstance(Class[] arr_class, Map map0) throws JAXBException {
        if(arr_class == null) {
            throw new IllegalArgumentException();
        }
        for(int v = arr_class.length - 1; v >= 0; --v) {
            if(arr_class[v] == null) {
                throw new IllegalArgumentException();
            }
        }
        return ContextFinder.find(arr_class, map0);
    }
}

