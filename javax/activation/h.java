package javax.activation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class h implements i {
    g a;

    public h(g g0) {
        this.a = g0;
    }

    @Override  // javax.activation.i
    public OutputStream a() throws IOException {
        return this.a.n();
    }

    @Override  // javax.activation.i
    public InputStream b() throws IOException {
        return this.a.l();
    }

    @Override  // javax.activation.i
    public String getName() {
        return this.a.m();
    }

    @Override  // javax.activation.i
    public String x() {
        return this.a.i();
    }
}

