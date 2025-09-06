package javassist.tools.web;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;

public class c extends ClassLoader {
    private String a;
    private int b;

    public c(String s, int v) {
        this.a = s;
        this.b = v;
    }

    protected byte[] a(String s) throws Exception {
        byte[] arr_b;
        URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(new URL("http", this.a, this.b, "/" + s.replace('.', '/') + ".class").openConnection());
        uRLConnection0.connect();
        int v = uRLConnection0.getContentLength();
        InputStream inputStream0 = uRLConnection0.getInputStream();
        if(v <= 0) {
            arr_b = this.e(inputStream0);
        }
        else {
            byte[] arr_b1 = new byte[v];
            int v1 = 0;
            do {
                int v2 = inputStream0.read(arr_b1, v1, v - v1);
                if(v2 < 0) {
                    inputStream0.close();
                    throw new IOException("the stream was closed: " + s);
                }
                v1 += v2;
            }
            while(v1 < v);
            arr_b = arr_b1;
        }
        inputStream0.close();
        return arr_b;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public static void d(String[] arr_s) throws Throwable {
        if(arr_s.length >= 3) {
            c c0 = new c(arr_s[0], Integer.parseInt(arr_s[1]));
            String[] arr_s1 = new String[arr_s.length - 3];
            System.arraycopy(arr_s, 3, arr_s1, 0, arr_s.length - 3);
            c0.f(arr_s[2], arr_s1);
            return;
        }
        System.err.println("Usage: java javassist.tools.web.Viewer <host> <port> class [args ...]");
    }

    private byte[] e(InputStream inputStream0) throws IOException {
        byte[] arr_b = new byte[0x1000];
        int v = 0;
        int v1 = 0;
        do {
            v += v1;
            if(arr_b.length - v <= 0) {
                byte[] arr_b1 = new byte[arr_b.length * 2];
                System.arraycopy(arr_b, 0, arr_b1, 0, v);
                arr_b = arr_b1;
            }
            v1 = inputStream0.read(arr_b, v, arr_b.length - v);
        }
        while(v1 >= 0);
        byte[] arr_b2 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b2, 0, v);
        return arr_b2;
    }

    public void f(String s, String[] arr_s) throws Throwable {
        Class class0 = this.loadClass(s);
        try {
            class0.getDeclaredMethod("main", String[].class).invoke(null, arr_s);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getTargetException();
        }
    }

    @Override
    protected Class findClass(String s) throws ClassNotFoundException {
        Class class0 = s.startsWith("java.") || s.startsWith("javax.") || s.equals("javassist.tools.web.Viewer") ? this.findSystemClass(s) : null;
        if(class0 == null) {
            try {
                byte[] arr_b = this.a(s);
                return arr_b == null ? null : this.defineClass(s, arr_b, 0, arr_b.length);
            }
            catch(Exception unused_ex) {
            }
        }
        return class0;
    }

    @Override
    protected Class loadClass(String s, boolean z) throws ClassNotFoundException {
        synchronized(this) {
            Class class0 = this.findLoadedClass(s);
            if(class0 == null) {
                class0 = this.findClass(s);
            }
            if(class0 != null) {
                if(z) {
                    this.resolveClass(class0);
                }
                return class0;
            }
        }
        throw new ClassNotFoundException(s);
    }
}

