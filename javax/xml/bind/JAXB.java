package javax.xml.bind;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.beans.Introspector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public final class JAXB {
    static final class Cache {
        final JAXBContext context;
        final Class type;

        public Cache(Class class0) throws JAXBException {
            this.type = class0;
            this.context = JAXBContext.newInstance(new Class[]{class0});
        }
    }

    private static volatile WeakReference cache;

    private static void _marshal(Object object0, Object object1) {
        JAXBContext jAXBContext0;
        try {
            if(object0 instanceof JAXBElement) {
                jAXBContext0 = JAXB.getContext(((JAXBElement)object0).getDeclaredType());
            }
            else {
                Class class0 = object0.getClass();
                XmlRootElement xmlRootElement0 = (XmlRootElement)class0.getAnnotation(XmlRootElement.class);
                JAXBContext jAXBContext1 = JAXB.getContext(class0);
                if(xmlRootElement0 == null) {
                    object0 = new JAXBElement(new QName(JAXB.inferName(class0)), class0, object0);
                }
                jAXBContext0 = jAXBContext1;
            }
            Marshaller marshaller0 = jAXBContext0.createMarshaller();
            marshaller0.setProperty("jaxb.formatted.output", Boolean.TRUE);
            marshaller0.marshal(object0, JAXB.toResult(object1));
            return;
        }
        catch(JAXBException jAXBException0) {
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
        throw new DataBindingException(jAXBException0);
    }

    private static JAXBContext getContext(Class class0) throws JAXBException {
        WeakReference weakReference0 = JAXB.cache;
        if(weakReference0 != null) {
            Cache jAXB$Cache0 = (Cache)weakReference0.get();
            if(jAXB$Cache0 != null && jAXB$Cache0.type == class0) {
                return jAXB$Cache0.context;
            }
        }
        Cache jAXB$Cache1 = new Cache(class0);
        JAXB.cache = new WeakReference(jAXB$Cache1);
        return jAXB$Cache1.context;
    }

    private static String inferName(Class class0) {
        return Introspector.decapitalize(class0.getSimpleName());
    }

    public static void marshal(Object object0, File file0) {
        JAXB._marshal(object0, file0);
    }

    public static void marshal(Object object0, OutputStream outputStream0) {
        JAXB._marshal(object0, outputStream0);
    }

    public static void marshal(Object object0, Writer writer0) {
        JAXB._marshal(object0, writer0);
    }

    public static void marshal(Object object0, String s) {
        JAXB._marshal(object0, s);
    }

    public static void marshal(Object object0, URI uRI0) {
        JAXB._marshal(object0, uRI0);
    }

    public static void marshal(Object object0, URL uRL0) {
        JAXB._marshal(object0, uRL0);
    }

    public static void marshal(Object object0, Result result0) {
        JAXB._marshal(object0, result0);
    }

    private static Result toResult(Object object0) throws IOException {
        URI uRI0;
        if(object0 == null) {
            throw new IllegalArgumentException("no XML is given");
        }
        if(object0 instanceof String) {
            try {
                uRI0 = new URI(((String)object0));
            }
            catch(URISyntaxException unused_ex) {
                uRI0 = new File(((String)object0));
            }
            object0 = uRI0;
        }
        if(object0 instanceof File) {
            return new StreamResult(((File)object0));
        }
        if(object0 instanceof URI) {
            object0 = ((URI)object0).toURL();
        }
        if(object0 instanceof URL) {
            URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(((URL)object0).openConnection());
            uRLConnection0.setDoOutput(true);
            uRLConnection0.setDoInput(false);
            uRLConnection0.connect();
            return new StreamResult(uRLConnection0.getOutputStream());
        }
        if(object0 instanceof OutputStream) {
            return new StreamResult(((OutputStream)object0));
        }
        if(object0 instanceof Writer) {
            return new StreamResult(((Writer)object0));
        }
        if(!(object0 instanceof Result)) {
            throw new IllegalArgumentException("I don\'t understand how to handle " + object0.getClass());
        }
        return (Result)object0;
    }

    private static Source toSource(Object object0) throws IOException {
        URI uRI0;
        if(object0 == null) {
            throw new IllegalArgumentException("no XML is given");
        }
        if(object0 instanceof String) {
            try {
                uRI0 = new URI(((String)object0));
            }
            catch(URISyntaxException unused_ex) {
                uRI0 = new File(((String)object0));
            }
            object0 = uRI0;
        }
        if(object0 instanceof File) {
            return new StreamSource(((File)object0));
        }
        if(object0 instanceof URI) {
            object0 = ((URI)object0).toURL();
        }
        if(object0 instanceof URL) {
            return new StreamSource(((URL)object0).toExternalForm());
        }
        if(object0 instanceof InputStream) {
            return new StreamSource(((InputStream)object0));
        }
        if(object0 instanceof Reader) {
            return new StreamSource(((Reader)object0));
        }
        if(!(object0 instanceof Source)) {
            throw new IllegalArgumentException("I don\'t understand how to handle " + object0.getClass());
        }
        return (Source)object0;
    }

    public static Object unmarshal(File file0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(new StreamSource(file0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
    }

    public static Object unmarshal(InputStream inputStream0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(inputStream0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }

    public static Object unmarshal(Reader reader0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(reader0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }

    public static Object unmarshal(String s, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(s), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }

    public static Object unmarshal(URI uRI0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(uRI0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }

    public static Object unmarshal(URL uRL0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(uRL0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }

    public static Object unmarshal(Source source0, Class class0) {
        try {
            return JAXB.getContext(class0).createUnmarshaller().unmarshal(JAXB.toSource(source0), class0).getValue();
        }
        catch(JAXBException jAXBException0) {
            throw new DataBindingException(jAXBException0);
        }
        catch(IOException iOException0) {
            throw new DataBindingException(iOException0);
        }
    }
}

