package javax.xml.bind;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Map;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

class ContextFinder {
    private static ExceptionHandler EXCEPTION_HANDLER = null;
    private static final String JAXB_CONTEXT_FACTORY_DEPRECATED = "javax.xml.bind.context.factory";
    private static final String PLATFORM_DEFAULT_FACTORY_CLASS = "com.sun.xml.internal.bind.v2.ContextFactory";
    private static final Logger logger;

    static {
        Logger logger0 = Logger.getLogger("javax.xml.bind");
        ContextFinder.logger = logger0;
        try {
            if(AccessController.doPrivileged(new GetPropertyAction("jaxb.debug")) != null) {
                logger0.setUseParentHandlers(false);
                Level level0 = Level.ALL;
                logger0.setLevel(level0);
                ConsoleHandler consoleHandler0 = new ConsoleHandler();
                consoleHandler0.setLevel(level0);
                logger0.addHandler(consoleHandler0);
            }
        }
        catch(Throwable unused_ex) {
        }
        ContextFinder.EXCEPTION_HANDLER = new ExceptionHandler() {
            @Override  // javax.xml.bind.ServiceLoaderUtil$ExceptionHandler
            public Exception createException(Throwable throwable0, String s) {
                return this.createException(throwable0, s);
            }

            public JAXBException createException(Throwable throwable0, String s) {
                return new JAXBException(s, throwable0);
            }
        };
    }

    private static String classNameFromPackageProperties(URL uRL0, String[] arr_s) throws JAXBException {
        ContextFinder.logger.log(Level.FINE, "Trying to locate {0}", uRL0.toString());
        Properties properties0 = ContextFinder.loadJAXBProperties(uRL0);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(properties0.containsKey(s)) {
                return properties0.getProperty(s);
            }
        }
        String s1 = uRL0.toExternalForm();
        throw new JAXBException(Messages.format("ContextFinder.MissingProperty", s1.substring(0, s1.indexOf("/jaxb.properties")), arr_s[0]));
    }

    private static String classNameFromSystemProperties() throws JAXBException {
        String s = ContextFinder.getSystemProperty("javax.xml.bind.JAXBContextFactory");
        if(s != null) {
            return s;
        }
        String s1 = ContextFinder.getDeprecatedSystemProperty("javax.xml.bind.context.factory");
        if(s1 != null) {
            return s1;
        }
        String s2 = ContextFinder.getDeprecatedSystemProperty("javax.xml.bind.JAXBContext");
        return s2 == null ? null : s2;
    }

    static JAXBContext find(String s, String s1, ClassLoader classLoader0, Map map0) throws JAXBException {
        if(s1 == null || s1.isEmpty()) {
            throw new JAXBException(Messages.format("ContextFinder.NoPackageInContextPath"));
        }
        String s2 = ContextFinder.jaxbProperties(s1, classLoader0, s);
        if(s2 != null) {
            return ContextFinder.newInstance(s1, null, s2, classLoader0, map0);
        }
        String s3 = ContextFinder.classNameFromSystemProperties();
        if(s3 != null) {
            return ContextFinder.newInstance(s1, null, s3, classLoader0, map0);
        }
        Logger logger0 = ContextFinder.logger;
        JAXBContextFactory jAXBContextFactory0 = (JAXBContextFactory)ServiceLoaderUtil.firstByServiceLoader(JAXBContextFactory.class, logger0, ContextFinder.EXCEPTION_HANDLER);
        if(jAXBContextFactory0 != null) {
            jAXBContextFactory0.getClass();
            return jAXBContextFactory0.createContext(s1, classLoader0, map0);
        }
        String s4 = ContextFinder.firstByServiceLoaderDeprecated(JAXBContext.class, classLoader0);
        if(s4 != null) {
            return ContextFinder.newInstance(s1, null, s4, classLoader0, map0);
        }
        Class class0 = (Class)ServiceLoaderUtil.lookupUsingOSGiServiceLoader("javax.xml.bind.JAXBContext", logger0);
        if(class0 != null) {
            return ContextFinder.newInstance(s1, null, class0, classLoader0, map0);
        }
        logger0.fine("Trying to create the platform default provider");
        return ContextFinder.newInstance(s1, null, "com.sun.xml.internal.bind.v2.ContextFactory", classLoader0, map0);
    }

    static JAXBContext find(Class[] arr_class, Map map0) throws JAXBException {
        ContextFinder.logger.fine("Searching jaxb.properties");
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            if(class0.getPackage() != null) {
                URL uRL0 = ContextFinder.getResourceUrl(class0, "jaxb.properties");
                if(uRL0 != null) {
                    return ContextFinder.newInstance(arr_class, map0, ContextFinder.classNameFromPackageProperties(uRL0, new String[]{"javax.xml.bind.JAXBContextFactory", "javax.xml.bind.context.factory"}));
                }
            }
        }
        String s = ContextFinder.classNameFromSystemProperties();
        if(s != null) {
            return ContextFinder.newInstance(arr_class, map0, s);
        }
        Logger logger0 = ContextFinder.logger;
        JAXBContextFactory jAXBContextFactory0 = (JAXBContextFactory)ServiceLoaderUtil.firstByServiceLoader(JAXBContextFactory.class, logger0, ContextFinder.EXCEPTION_HANDLER);
        if(jAXBContextFactory0 != null) {
            jAXBContextFactory0.getClass();
            return jAXBContextFactory0.createContext(arr_class, map0);
        }
        ClassLoader classLoader0 = ContextFinder.getContextClassLoader();
        String s1 = ContextFinder.firstByServiceLoaderDeprecated(JAXBContext.class, classLoader0);
        if(s1 != null) {
            return ContextFinder.newInstance(arr_class, map0, s1);
        }
        logger0.fine("Trying to create the platform default provider");
        Class class1 = (Class)ServiceLoaderUtil.lookupUsingOSGiServiceLoader("javax.xml.bind.JAXBContext", logger0);
        if(class1 != null) {
            return ContextFinder.newInstance(arr_class, map0, class1);
        }
        logger0.fine("Trying to create the platform default provider");
        return ContextFinder.newInstance(arr_class, map0, "com.sun.xml.internal.bind.v2.ContextFactory");
    }

    @Deprecated
    static String firstByServiceLoaderDeprecated(Class class0, ClassLoader classLoader0) throws JAXBException {
        String s1;
        BufferedReader bufferedReader1;
        Logger logger0 = ContextFinder.logger;
        logger0.fine("Searching META-INF/services");
        String s = "META-INF/services/" + class0.getName();
        BufferedReader bufferedReader0 = null;
        try {
            InputStream inputStream0 = classLoader0 == null ? ClassLoader.getSystemResourceAsStream(s) : classLoader0.getResourceAsStream(s);
            if(inputStream0 == null) {
                logger0.log(Level.FINE, "Unable to load:{0}", s);
                return null;
            }
            bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream0, "UTF-8"));
        }
        catch(IOException iOException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
        try {
            s1 = bufferedReader1.readLine();
            if(s1 != null) {
                s1 = s1.trim();
            }
            bufferedReader1.close();
            logger0.log(Level.FINE, "Configured factorty class:{0}", s1);
            goto label_31;
        }
        catch(IOException iOException0) {
            bufferedReader0 = bufferedReader1;
        }
        catch(Throwable throwable0) {
            bufferedReader0 = bufferedReader1;
            goto label_25;
        }
        try {
            while(true) {
                throw new JAXBException(iOException0);
                try {
                label_22:
                    break;
                label_24:
                }
                catch(IOException iOException0) {
                }
            }
        }
        catch(Throwable throwable0) {
        }
    label_25:
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(IOException iOException1) {
                ContextFinder.logger.log(Level.SEVERE, "Unable to close resource: " + s, iOException1);
            }
        }
        throw throwable0;
        try {
        label_31:
            bufferedReader1.close();
        }
        catch(IOException iOException2) {
            ContextFinder.logger.log(Level.SEVERE, "Unable to close resource: " + s, iOException2);
        }
        return s1;
    }

    private static ClassLoader getClassClassLoader(Class class0) {
        return System.getSecurityManager() == null ? class0.getClassLoader() : ((ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                return class0.getClassLoader();
            }
        }));
    }

    private static ClassLoader getContextClassLoader() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : ((ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                return Thread.currentThread().getContextClassLoader();
            }
        }));
    }

    private static String getDeprecatedSystemProperty(String s) {
        String s1 = ContextFinder.getSystemProperty(s);
        if(s1 != null) {
            ContextFinder.logger.log(Level.WARNING, "Using non-standard property: {0}. Property {1} should be used instead.", new Object[]{s, "javax.xml.bind.JAXBContextFactory"});
        }
        return s1;
    }

    private static URL getResourceUrl(Class class0, String s) {
        return class0.getResource(s);
    }

    private static URL getResourceUrl(ClassLoader classLoader0, String s) {
        return classLoader0 == null ? ClassLoader.getSystemResource(s) : classLoader0.getResource(s);
    }

    private static ClassLoader getSystemClassLoader() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : ((ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                return ClassLoader.getSystemClassLoader();
            }
        }));
    }

    private static String getSystemProperty(String s) {
        Logger logger0 = ContextFinder.logger;
        Level level0 = Level.FINE;
        logger0.log(level0, "Checking system property {0}", s);
        String s1 = (String)AccessController.doPrivileged(new GetPropertyAction(s));
        if(s1 != null) {
            logger0.log(level0, "  found {0}", s1);
            return s1;
        }
        logger0.log(level0, "  not found");
        return null;
    }

    private static JAXBException handleClassCastException(Class class0, Class class1) {
        URL uRL0 = ContextFinder.which(class1);
        return new JAXBException(Messages.format("JAXBContext.IllegalCast", ContextFinder.getClassClassLoader(class0).getResource("javax/xml/bind/JAXBContext.class"), uRL0));
    }

    private static Throwable handleInvocationTargetException(InvocationTargetException invocationTargetException0) throws JAXBException {
        Throwable throwable0 = invocationTargetException0.getTargetException();
        if(throwable0 != null) {
            if(throwable0 instanceof JAXBException) {
                throw (JAXBException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            return throwable0;
        }
        return invocationTargetException0;
    }

    private static Object instantiateProviderIfNecessary(Class class0) throws JAXBException {
        try {
            return JAXBContextFactory.class.isAssignableFrom(class0) ? AccessController.doPrivileged(new PrivilegedExceptionAction() {
                @Override
                public Object run() throws Exception {
                    return class0.newInstance();
                }
            }) : null;
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() != null) {
                privilegedActionException0 = privilegedActionException0.getCause();
            }
            throw new JAXBException(Messages.format("ContextFinder.CouldNotInstantiate", class0, privilegedActionException0), privilegedActionException0);
        }
    }

    private static String jaxbProperties(String s, ClassLoader classLoader0, String s1) throws JAXBException {
        String[] arr_s = s.split(":");
        for(int v = 0; v < arr_s.length; ++v) {
            URL uRL0 = ContextFinder.getResourceUrl(classLoader0, arr_s[v].replace('.', '/') + "/jaxb.properties");
            if(uRL0 != null) {
                return ContextFinder.classNameFromPackageProperties(uRL0, new String[]{s1, "javax.xml.bind.context.factory"});
            }
        }
        return null;
    }

    private static String jaxbProperties(Class[] arr_class, String s) throws JAXBException {
        for(int v = 0; v < arr_class.length; ++v) {
            URL uRL0 = ContextFinder.getResourceUrl(arr_class[v], "jaxb.properties");
            if(uRL0 != null) {
                return ContextFinder.classNameFromPackageProperties(uRL0, new String[]{s, "javax.xml.bind.context.factory"});
            }
        }
        return null;
    }

    private static Properties loadJAXBProperties(URL uRL0) throws JAXBException {
        try {
            ContextFinder.logger.log(Level.FINE, "loading props from {0}", uRL0);
            Properties properties0 = new Properties();
            InputStream inputStream0 = FirebasePerfUrlConnection.openStream(uRL0);
            properties0.load(inputStream0);
            inputStream0.close();
            return properties0;
        }
        catch(IOException iOException0) {
            ContextFinder.logger.log(Level.FINE, "Unable to load " + uRL0.toString(), iOException0);
            throw new JAXBException(iOException0.toString(), iOException0);
        }
    }

    static JAXBContext newInstance(String s, Class[] arr_class, Class class0, ClassLoader classLoader0, Map map0) throws JAXBException {
        Object object0;
        Class class2;
        Class class1;
        try {
            try {
                class1 = ClassLoader.class;
                class2 = String.class;
                object0 = null;
                object0 = class0.getMethod("createContext", class2, class1, Map.class).invoke(ContextFinder.instantiateProviderIfNecessary(class0), s, classLoader0, map0);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            if(object0 == null) {
                object0 = class0.getMethod("createContext", class2, class1).invoke(ContextFinder.instantiateProviderIfNecessary(class0), s, classLoader0);
            }
            if(!(object0 instanceof JAXBContext)) {
                throw ContextFinder.handleClassCastException(object0.getClass(), JAXBContext.class);
            }
            return (JAXBContext)object0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = ContextFinder.handleInvocationTargetException(invocationTargetException0);
            throw new JAXBException(Messages.format("ContextFinder.CouldNotInstantiate", class0, throwable0), throwable0);
        }
        catch(Exception exception0) {
            throw new JAXBException(Messages.format("ContextFinder.CouldNotInstantiate", class0, exception0), exception0);
        }
    }

    static JAXBContext newInstance(String s, Class[] arr_class, String s1, ClassLoader classLoader0, Map map0) throws JAXBException {
        try {
            return ContextFinder.newInstance(s, arr_class, ServiceLoaderUtil.safeLoadClass(s1, "com.sun.xml.internal.bind.v2.ContextFactory", classLoader0), classLoader0, map0);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new JAXBException(Messages.format("ContextFinder.DefaultProviderNotFound"), classNotFoundException0);
        }
        catch(RuntimeException | JAXBException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception exception0) {
            throw new JAXBException(Messages.format("ContextFinder.CouldNotInstantiate", s1, exception0), exception0);
        }
    }

    static JAXBContext newInstance(Class[] arr_class, Map map0, Class class0) throws JAXBException {
        try {
            Object object0 = class0.getMethod("createContext", Class[].class, Map.class).invoke(ContextFinder.instantiateProviderIfNecessary(class0), arr_class, map0);
            if(!(object0 instanceof JAXBContext)) {
                throw ContextFinder.handleClassCastException(object0.getClass(), JAXBContext.class);
            }
            return (JAXBContext)object0;
        }
        catch(NoSuchMethodException | IllegalAccessException noSuchMethodException0) {
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new JAXBException(ContextFinder.handleInvocationTargetException(invocationTargetException0));
        }
        throw new JAXBException(noSuchMethodException0);
    }

    static JAXBContext newInstance(Class[] arr_class, Map map0, String s) throws JAXBException {
        Class class0;
        try {
            class0 = ServiceLoaderUtil.safeLoadClass(s, "com.sun.xml.internal.bind.v2.ContextFactory", ContextFinder.getContextClassLoader());
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new JAXBException(Messages.format("ContextFinder.DefaultProviderNotFound"), classNotFoundException0);
        }
        Logger logger0 = ContextFinder.logger;
        Level level0 = Level.FINE;
        if(logger0.isLoggable(level0)) {
            logger0.log(level0, "loaded {0} from {1}", new Object[]{s, ContextFinder.which(class0)});
        }
        return ContextFinder.newInstance(arr_class, map0, class0);
    }

    static URL which(Class class0) {
        return ContextFinder.which(class0, ContextFinder.getClassClassLoader(class0));
    }

    static URL which(Class class0, ClassLoader classLoader0) {
        String s = class0.getName().replace('.', '/') + ".class";
        if(classLoader0 == null) {
            classLoader0 = ContextFinder.getSystemClassLoader();
        }
        return classLoader0.getResource(s);
    }
}

