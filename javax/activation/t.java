package javax.activation;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class t implements i {
    private URL a;
    private URLConnection b;

    public t(URL uRL0) {
        this.b = null;
        this.a = uRL0;
    }

    @Override  // javax.activation.i
    public OutputStream a() throws IOException {
        URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(this.a.openConnection());
        this.b = uRLConnection0;
        if(uRLConnection0 != null) {
            uRLConnection0.setDoOutput(true);
            return this.b.getOutputStream();
        }
        return null;
    }

    @Override  // javax.activation.i
    public InputStream b() throws IOException {
        return FirebasePerfUrlConnection.openStream(this.a);
    }

    public URL c() {
        return this.a;
    }

    @Override  // javax.activation.i
    public String getName() {
        return this.a.getFile();
    }

    @Override  // javax.activation.i
    public String x() {
        if(this.b == null) {
            try {
                this.b = (URLConnection)FirebasePerfUrlConnection.instrument(this.a.openConnection());
            }
            catch(IOException unused_ex) {
            }
        }
        String s = this.b == null ? null : this.b.getContentType();
        return s == null ? "application/octet-stream" : s;
    }
}

