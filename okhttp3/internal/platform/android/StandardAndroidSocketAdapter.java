package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import y4.l;
import y4.m;

public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final SocketAdapter buildIfSupported(@l String s) {
            L.p(s, "packageName");
            try {
                Class class0 = Class.forName((s + ".OpenSSLSocketImpl"));
                L.n(class0, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class class1 = Class.forName((s + ".OpenSSLSocketFactoryImpl"));
                L.n(class1, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class class2 = Class.forName((s + ".SSLParametersImpl"));
                L.o(class2, "paramsClass");
                return new StandardAndroidSocketAdapter(class0, class1, class2);
            }
            catch(Exception exception0) {
                Platform.Companion.get().log("unable to load android socket classes", 5, exception0);
                return null;
            }
        }

        public static SocketAdapter buildIfSupported$default(Companion standardAndroidSocketAdapter$Companion0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = "com.android.org.conscrypt";
            }
            return standardAndroidSocketAdapter$Companion0.buildIfSupported(s);
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final Class paramClass;
    @l
    private final Class sslSocketFactoryClass;

    static {
        StandardAndroidSocketAdapter.Companion = new Companion(null);
    }

    public StandardAndroidSocketAdapter(@l Class class0, @l Class class1, @l Class class2) {
        L.p(class0, "sslSocketClass");
        L.p(class1, "sslSocketFactoryClass");
        L.p(class2, "paramClass");
        super(class0);
        this.sslSocketFactoryClass = class1;
        this.paramClass = class2;
    }

    @Override  // okhttp3.internal.platform.android.AndroidSocketAdapter
    public boolean matchesSocketFactory(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory0);
    }

    @Override  // okhttp3.internal.platform.android.AndroidSocketAdapter
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        Object object0 = Util.readFieldOrNull(sSLSocketFactory0, this.paramClass, "sslParameters");
        L.m(object0);
        X509TrustManager x509TrustManager0 = (X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager0 == null ? ((X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "trustManager")) : x509TrustManager0;
    }
}

