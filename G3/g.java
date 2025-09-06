package g3;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.realm.transformer.k;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final g a() {
            return new g("https://data.mongodb-api.com/app/realmsdkmetrics-zmhtm/endpoint/metric_webhook/metric?data=", "", null);
        }
    }

    @l
    private final String a;
    @l
    private final String b;
    @l
    public static final a c;

    static {
        g.c = new a(null);
    }

    private g(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public g(String s, String s1, w w0) {
        this(s, s1);
    }

    public final void a(@l g3.a a0) {
        L.p(a0, "analytics");
        try {
            URLConnection uRLConnection0 = (URLConnection)FirebasePerfUrlConnection.instrument(this.b(a0).openConnection());
            if(uRLConnection0 != null) {
                ((HttpURLConnection)uRLConnection0).setRequestMethod("GET");
                ((HttpURLConnection)uRLConnection0).connect();
                ((HttpURLConnection)uRLConnection0).getResponseCode();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private final URL b(g3.a a0) throws MalformedURLException, SocketException, NoSuchAlgorithmException, UnsupportedEncodingException {
        String s = k.a(a0.k());
        return new URL(this.a + s + this.b);
    }
}

