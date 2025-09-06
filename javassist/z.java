package javassist;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

final class z implements e {
    List a;
    String b;

    z(String s) throws E {
        JarFile jarFile0 = null;
        try {
            jarFile0 = new JarFile(s);
            this.a = new ArrayList();
            for(Object object0: Collections.list(jarFile0.entries())) {
                JarEntry jarEntry0 = (JarEntry)object0;
                if(jarEntry0.getName().endsWith(".class")) {
                    this.a.add(jarEntry0.getName());
                }
            }
            this.b = new File(s).getCanonicalFile().toURI().toURL().toString();
            goto label_21;
        }
        catch(IOException unused_ex) {
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
        if(jarFile0 != null) {
            try {
                jarFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw new E(s);
    label_18:
        if(jarFile0 != null) {
            try {
                jarFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_21:
            jarFile0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // javassist.e
    public URL a(String s) {
        String s1 = s.replace('.', '/') + ".class";
        if(this.a.contains(s1)) {
            try {
                return new URL(String.format("jar:%s!/%s", this.b, s1));
            }
            catch(MalformedURLException unused_ex) {
            }
        }
        return null;
    }

    @Override  // javassist.e
    public InputStream b(String s) throws E {
        URL uRL0 = this.a(s);
        if(uRL0 != null) {
            try {
                URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection());
                uRLConnection0.setUseCaches(false);
                return uRLConnection0.getInputStream();
            }
            catch(IOException unused_ex) {
                throw new E("broken jar file?: " + s);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.b == null ? "<null>" : this.b.toString();
    }
}

