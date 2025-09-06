package javassist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

final class x implements e {
    String a;

    x(String s) {
        this.a = s;
    }

    @Override  // javassist.e
    public URL a(String s) {
        File file0 = new File(this.a + File.separatorChar + s.replace('.', File.separatorChar) + ".class");
        if(file0.exists()) {
            try {
                return file0.getCanonicalFile().toURI().toURL();
            }
            catch(MalformedURLException | IOException unused_ex) {
            }
        }
        return null;
    }

    @Override  // javassist.e
    public InputStream b(String s) {
        try {
            return new FileInputStream((this.a + File.separatorChar + s.replace('.', File.separatorChar) + ".class").toString());
        }
        catch(FileNotFoundException | SecurityException unused_ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.a;
    }
}

