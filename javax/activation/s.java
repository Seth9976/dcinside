package javax.activation;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Enumeration;

class s {
    public static ClassLoader a() {
        static final class a implements PrivilegedAction {
            @Override
            public Object run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                }
                catch(SecurityException unused_ex) {
                    return null;
                }
            }
        }

        return (ClassLoader)AccessController.doPrivileged(new a());
    }

    public static InputStream b(Class class0, String s) throws IOException {
        static final class b implements PrivilegedExceptionAction {
            final Class a;
            final String b;

            b(Class class0, String s) {
                this.a = class0;
                this.b = s;
                super();
            }

            @Override
            public Object run() throws IOException {
                return this.a.getResourceAsStream(this.b);
            }
        }

        try {
            return (InputStream)AccessController.doPrivileged(new b(class0, s));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            throw (IOException)privilegedActionException0.getException();
        }
    }

    public static URL[] c(ClassLoader classLoader0, String s) {
        static final class c implements PrivilegedAction {
            final ClassLoader a;
            final String b;

            c(ClassLoader classLoader0, String s) {
                this.a = classLoader0;
                this.b = s;
                super();
            }

            @Override
            public Object run() {
                URL[] arr_uRL = null;
                try {
                    ArrayList arrayList0 = new ArrayList();
                    Enumeration enumeration0 = this.a.getResources(this.b);
                    while(enumeration0 != null && enumeration0.hasMoreElements()) {
                        URL uRL0 = (URL)enumeration0.nextElement();
                        if(uRL0 != null) {
                            arrayList0.add(uRL0);
                        }
                    }
                    if(arrayList0.size() > 0) {
                        arr_uRL = new URL[arrayList0.size()];
                        return (URL[])arrayList0.toArray(arr_uRL);
                    }
                }
                catch(IOException | SecurityException unused_ex) {
                }
                return arr_uRL;
            }
        }

        return (URL[])AccessController.doPrivileged(new c(classLoader0, s));
    }

    public static URL[] d(String s) {
        static final class d implements PrivilegedAction {
            final String a;

            d(String s) {
                this.a = s;
                super();
            }

            @Override
            public Object run() {
                URL[] arr_uRL = null;
                try {
                    ArrayList arrayList0 = new ArrayList();
                    Enumeration enumeration0 = ClassLoader.getSystemResources(this.a);
                    while(enumeration0 != null && enumeration0.hasMoreElements()) {
                        URL uRL0 = (URL)enumeration0.nextElement();
                        if(uRL0 != null) {
                            arrayList0.add(uRL0);
                        }
                    }
                    if(arrayList0.size() > 0) {
                        arr_uRL = new URL[arrayList0.size()];
                        return (URL[])arrayList0.toArray(arr_uRL);
                    }
                }
                catch(IOException | SecurityException unused_ex) {
                }
                return arr_uRL;
            }
        }

        return (URL[])AccessController.doPrivileged(new d(s));
    }

    public static InputStream e(URL uRL0) throws IOException {
        static final class e implements PrivilegedExceptionAction {
            final URL a;

            e(URL uRL0) {
                this.a = uRL0;
                super();
            }

            @Override
            public Object run() throws IOException {
                return FirebasePerfUrlConnection.openStream(this.a);
            }
        }

        try {
            return (InputStream)AccessController.doPrivileged(new e(uRL0));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            throw (IOException)privilegedActionException0.getException();
        }
    }
}

