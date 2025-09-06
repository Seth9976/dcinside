package javax.xml.bind;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

class ServiceLoaderUtil {
    static abstract class ExceptionHandler {
        public abstract Exception createException(Throwable arg1, String arg2);
    }

    private static final String OSGI_SERVICE_LOADER_CLASS_NAME = "org.glassfish.hk2.osgiresourcelocator.ServiceLoader";
    private static final String OSGI_SERVICE_LOADER_METHOD_NAME = "lookupProviderClasses";

    static void checkPackageAccess(String s) {
        SecurityManager securityManager0 = System.getSecurityManager();
        if(securityManager0 != null) {
            int v = s.lastIndexOf(46);
            if(v != -1) {
                securityManager0.checkPackageAccess(s.substring(0, v));
            }
        }
    }

    static ClassLoader contextClassLoader(ExceptionHandler serviceLoaderUtil$ExceptionHandler0) throws Exception {
        try {
            return Thread.currentThread().getContextClassLoader();
        }
        catch(Exception exception0) {
            throw serviceLoaderUtil$ExceptionHandler0.createException(exception0, exception0.toString());
        }
    }

    static Object firstByServiceLoader(Class class0, Logger logger0, ExceptionHandler serviceLoaderUtil$ExceptionHandler0) throws Exception {
        try {
            Iterator iterator0 = ServiceLoader.load(class0).iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                logger0.fine("ServiceProvider loading Facility used; returning object [" + object0.getClass().getName() + "]");
                return object0;
            }
            return null;
        }
        catch(Throwable throwable0) {
            throw serviceLoaderUtil$ExceptionHandler0.createException(throwable0, "Error while searching for service [" + class0.getName() + "]");
        }
    }

    static Object lookupUsingOSGiServiceLoader(String s, Logger logger0) {
        try {
            Class class0 = Class.forName(s);
            Iterator iterator0 = ((Iterable)Class.forName("org.glassfish.hk2.osgiresourcelocator.ServiceLoader").getMethod("lookupProviderClasses", Class.class).invoke(null, class0)).iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                logger0.fine("Found implementation using OSGi facility; returning object [" + object0.getClass().getName() + "].");
                return object0;
            }
        }
        catch(IllegalAccessException | InvocationTargetException | ClassNotFoundException | NoSuchMethodException illegalAccessException0) {
            logger0.log(Level.FINE, "Unable to find from OSGi: [" + s + "]", illegalAccessException0);
        }
        return null;
    }

    static Object newInstance(String s, String s1, ExceptionHandler serviceLoaderUtil$ExceptionHandler0) throws Exception {
        try {
            return ServiceLoaderUtil.safeLoadClass(s, s1, ServiceLoaderUtil.contextClassLoader(serviceLoaderUtil$ExceptionHandler0)).newInstance();
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw serviceLoaderUtil$ExceptionHandler0.createException(classNotFoundException0, "Provider " + s + " not found");
        }
        catch(Exception exception0) {
            throw serviceLoaderUtil$ExceptionHandler0.createException(exception0, "Provider " + s + " could not be instantiated: " + exception0);
        }
    }

    static Class nullSafeLoadClass(String s, ClassLoader classLoader0) throws ClassNotFoundException {
        return classLoader0 == null ? Class.forName(s) : classLoader0.loadClass(s);
    }

    static Class safeLoadClass(String s, String s1, ClassLoader classLoader0) throws ClassNotFoundException {
        try {
            ServiceLoaderUtil.checkPackageAccess(s);
            return ServiceLoaderUtil.nullSafeLoadClass(s, classLoader0);
        }
        catch(SecurityException securityException0) {
            if(s1 == null || !s1.equals(s)) {
                throw securityException0;
            }
            return Class.forName(s);
        }
    }
}

