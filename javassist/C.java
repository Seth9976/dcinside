package javassist;

import java.io.InputStream;
import java.net.URL;

public class c implements e {
    private Class a;

    c() {
        this(Object.class);
    }

    public c(Class class0) {
        this.a = class0;
    }

    @Override  // javassist.e
    public URL a(String s) {
        return this.a.getResource('/' + s.replace('.', '/') + ".class");
    }

    @Override  // javassist.e
    public InputStream b(String s) throws E {
        return this.a.getResourceAsStream('/' + s.replace('.', '/') + ".class");
    }

    @Override
    public String toString() {
        return this.a.getName() + ".class";
    }
}

