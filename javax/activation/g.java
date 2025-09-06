package javax.activation;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;

public class g implements Transferable {
    private i a;
    private i b;
    private Object c;
    private String d;
    private c e;
    private DataFlavor[] f;
    private e g;
    private e h;
    private f i;
    private String j;
    private static final DataFlavor[] k;
    private static f l;

    static {
        g.k = new DataFlavor[0];
        g.l = null;
    }

    public g(Object object0, String s) {
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = g.k;
        this.g = null;
        this.h = null;
        this.j = null;
        this.c = object0;
        this.d = s;
        this.i = g.l;
    }

    public g(URL uRL0) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = g.k;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.a = new t(uRL0);
        this.i = g.l;
    }

    public g(i i0) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = g.k;
        this.g = null;
        this.h = null;
        this.j = null;
        this.a = i0;
        this.i = g.l;
    }

    public b[] c() {
        return this.a == null ? this.g().c(this.d()) : this.g().d(this.d(), this.a);
    }

    private String d() {
        synchronized(this) {
            if(this.j == null) {
                this.i();
                this.j = "application/*";
            }
            return this.j;
        }
    }

    public Object e(b b0) {
        try {
            ClassLoader classLoader0 = s.a();
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            return b0.c(this, classLoader0);
        }
        catch(IOException | ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public b f(String s) {
        return this.a == null ? this.g().e(this.d(), s) : this.g().f(this.d(), s, this.a);
    }

    private c g() {
        synchronized(this) {
            c c0 = this.e;
            return c0 != null ? c0 : c.g();
        }
    }

    public Object h() throws IOException {
        Object object0 = this.c;
        return object0 == null ? this.j().b(this.k()) : object0;
    }

    public String i() {
        return this.a == null ? this.d : this.a.x();
    }

    private e j() {
        synchronized(this) {
            f f0 = g.l;
            if(f0 != this.i) {
                this.i = f0;
                this.h = null;
                this.g = null;
                this.f = g.k;
            }
            e e0 = this.g;
            if(e0 != null) {
                return e0;
            }
            String s = this.d();
            if(this.h == null) {
                f f1 = g.l;
                if(f1 != null) {
                    this.h = f1.a(s);
                }
            }
            e e1 = this.h;
            if(e1 != null) {
                this.g = e1;
            }
            if(this.g == null) {
                this.g = this.a == null ? this.g().a(s) : this.g().b(s, this.a);
            }
            i i0 = this.a;
            this.g = i0 == null ? new r(this.g, this.c, this.d) : new j(this.g, i0);
            return this.g;
        }
    }

    public i k() {
        i i0 = this.a;
        if(i0 == null) {
            if(this.b == null) {
                this.b = new h(this);
            }
            return this.b;
        }
        return i0;
    }

    public InputStream l() throws IOException {
        class a implements Runnable {
            final e a;
            final PipedOutputStream b;
            final g c;

            a(e e0, PipedOutputStream pipedOutputStream0) {
                this.a = e0;
                this.b = pipedOutputStream0;
                super();
            }

            @Override
            public void run() {
                try {
                    this.a.c(g.this.c, g.this.d, this.b);
                }
                catch(IOException throwable0) {
                    try {
                        this.b.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    throw throwable0;
                }
                catch(Throwable unused_ex) {
                }
                try {
                    this.b.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }

        i i0 = this.a;
        if(i0 != null) {
            return i0.b();
        }
        e e0 = this.j();
        if(e0 == null) {
            throw new u("no DCH for MIME type " + this.d());
        }
        if(e0 instanceof r && ((r)e0).e() == null) {
            throw new u("no object DCH for MIME type " + this.d());
        }
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        new Thread(new a(this, e0, pipedOutputStream0), "DataHandler.getInputStream").start();
        return pipedInputStream0;
    }

    public String m() {
        return this.a == null ? null : this.a.getName();
    }

    public OutputStream n() throws IOException {
        return this.a == null ? null : this.a.a();
    }

    public b[] o() {
        return this.a == null ? this.g().i(this.d()) : this.g().j(this.d(), this.a);
    }

    public Object p(DataFlavor dataFlavor0) throws UnsupportedFlavorException, IOException {
        return this.j().d(dataFlavor0, this.a);
    }

    public DataFlavor[] q() {
        synchronized(this) {
            if(g.l != this.i) {
                this.f = g.k;
            }
            DataFlavor[] arr_dataFlavor = g.k;
            if(this.f == arr_dataFlavor) {
                this.f = this.j().a();
            }
            DataFlavor[] arr_dataFlavor1 = this.f;
            return arr_dataFlavor1 == arr_dataFlavor ? arr_dataFlavor1 : ((DataFlavor[])arr_dataFlavor1.clone());
        }
    }

    public boolean r(DataFlavor dataFlavor0) {
        DataFlavor[] arr_dataFlavor = this.q();
        for(int v = 0; v < arr_dataFlavor.length; ++v) {
            if(arr_dataFlavor[v].equals(dataFlavor0)) {
                return true;
            }
        }
        return false;
    }

    public void s(c c0) {
        synchronized(this) {
            if(c0 != this.e || c0 == null) {
                this.f = g.k;
                this.g = null;
                this.e = c0;
            }
        }
    }

    public static void t(f f0) {
        synchronized(g.class) {
            if(g.l == null) {
                SecurityManager securityManager0 = System.getSecurityManager();
                if(securityManager0 != null) {
                    try {
                        securityManager0.checkSetFactory();
                    }
                    catch(SecurityException securityException0) {
                        ClassLoader classLoader0 = f0.getClass().getClassLoader();
                        if(g.class.getClassLoader() != classLoader0) {
                            throw securityException0;
                        }
                    }
                }
                g.l = f0;
                return;
            }
        }
        throw new Error("DataContentHandlerFactory already defined");
    }

    public void u(OutputStream outputStream0) throws IOException {
        i i0 = this.a;
        if(i0 != null) {
            byte[] arr_b = new byte[0x2000];
            try(InputStream inputStream0 = i0.b()) {
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    outputStream0.write(arr_b, 0, v);
                }
            }
            return;
        }
        this.j().c(this.c, this.d, outputStream0);
    }
}

