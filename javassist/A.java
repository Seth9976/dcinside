package javassist;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class a implements e {
    static class javassist.a.a {
    }

    class b extends URLConnection {
        final a a;

        protected b(URL uRL0) {
            super(uRL0);
        }

        @Override
        public void connect() throws IOException {
        }

        @Override
        public int getContentLength() {
            return a.this.b.length;
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(a.this.b);
        }
    }

    class c extends URLStreamHandler {
        final a a;

        private c() {
        }

        c(javassist.a.a a$a0) {
        }

        @Override
        protected URLConnection openConnection(URL uRL0) {
            return new b(a.this, uRL0);
        }
    }

    protected String a;
    protected byte[] b;

    public a(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override  // javassist.e
    public URL a(String s) {
        if(this.a.equals(s)) {
            String s1 = s.replace('.', '/') + ".class";
            try {
                return new URL(null, "file:/ByteArrayClassPath/" + s1, new c(this, null));
            }
            catch(MalformedURLException unused_ex) {
            }
        }
        return null;
    }

    @Override  // javassist.e
    public InputStream b(String s) {
        return this.a.equals(s) ? new ByteArrayInputStream(this.b) : null;
    }

    @Override
    public String toString() {
        return "byte[]:" + this.a;
    }
}

