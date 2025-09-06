package javax.activation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class k implements i {
    private File a;
    private l b;

    public k(File file0) {
        this.b = null;
        this.a = file0;
    }

    public k(String s) {
        this(new File(s));
    }

    @Override  // javax.activation.i
    public OutputStream a() throws IOException {
        return new FileOutputStream(this.a);
    }

    @Override  // javax.activation.i
    public InputStream b() throws IOException {
        return new FileInputStream(this.a);
    }

    public File c() {
        return this.a;
    }

    public void d(l l0) {
        this.b = l0;
    }

    @Override  // javax.activation.i
    public String getName() {
        return this.a.getName();
    }

    @Override  // javax.activation.i
    public String x() {
        return this.b == null ? l.c().a(this.a) : this.b.a(this.a);
    }
}

