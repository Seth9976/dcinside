package okhttp3.internal.platform;

import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
@SuppressSignatureCheck
public final class AndroidPlatform extends Platform {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final Platform buildIfSupported() {
            return this.isSupported() ? new AndroidPlatform() : null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {
        @l
        private final Method findByIssuerAndSignatureMethod;
        @l
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(@l X509TrustManager x509TrustManager0, @l Method method0) {
            L.p(x509TrustManager0, "trustManager");
            L.p(method0, "findByIssuerAndSignatureMethod");
            super();
            this.trustManager = x509TrustManager0;
            this.findByIssuerAndSignatureMethod = method0;
        }

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        @l
        public final CustomTrustRootIndex copy(@l X509TrustManager x509TrustManager0, @l Method method0) {
            L.p(x509TrustManager0, "trustManager");
            L.p(method0, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager0, method0);
        }

        public static CustomTrustRootIndex copy$default(CustomTrustRootIndex androidPlatform$CustomTrustRootIndex0, X509TrustManager x509TrustManager0, Method method0, int v, Object object0) {
            if((v & 1) != 0) {
                x509TrustManager0 = androidPlatform$CustomTrustRootIndex0.trustManager;
            }
            if((v & 2) != 0) {
                method0 = androidPlatform$CustomTrustRootIndex0.findByIssuerAndSignatureMethod;
            }
            return androidPlatform$CustomTrustRootIndex0.copy(x509TrustManager0, method0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CustomTrustRootIndex)) {
                return false;
            }
            return L.g(this.trustManager, ((CustomTrustRootIndex)object0).trustManager) ? L.g(this.findByIssuerAndSignatureMethod, ((CustomTrustRootIndex)object0).findByIssuerAndSignatureMethod) : false;
        }

        @Override  // okhttp3.internal.tls.TrustRootIndex
        @m
        public X509Certificate findByIssuerAndSignature(@l X509Certificate x509Certificate0) {
            X509Certificate x509Certificate1;
            L.p(x509Certificate0, "cert");
            try {
                Object object0 = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate0);
                L.n(object0, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                x509Certificate1 = null;
                return ((TrustAnchor)object0).getTrustedCert();
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError("unable to get issues and signature", illegalAccessException0);
            }
            catch(InvocationTargetException unused_ex) {
                return x509Certificate1;
            }
        }

        @Override
        public int hashCode() {
            return this.trustManager.hashCode() * 0x1F + this.findByIssuerAndSignatureMethod.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final CloseGuard closeGuard;
    private static final boolean isSupported;
    @l
    private final List socketAdapters;

    static {
        AndroidPlatform.Companion = new Companion(null);
        AndroidPlatform.isSupported = Platform.Companion.isAndroid() && Build.VERSION.SDK_INT < 30;
    }

    public AndroidPlatform() {
        Iterable iterable0 = u.Q(new SocketAdapter[]{okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory())});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((SocketAdapter)object0).isSupported()) {
                arrayList0.add(object0);
            }
        }
        this.socketAdapters = arrayList0;
        this.closeGuard = CloseGuard.Companion.get();
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public CertificateChainCleaner buildCertificateChainCleaner(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        CertificateChainCleaner certificateChainCleaner0 = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager0);
        return certificateChainCleaner0 == null ? super.buildCertificateChainCleaner(x509TrustManager0) : certificateChainCleaner0;
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public TrustRootIndex buildTrustRootIndex(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        try {
            Method method0 = x509TrustManager0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method0.setAccessible(true);
            L.o(method0, "method");
            return new CustomTrustRootIndex(x509TrustManager0, method0);
        }
        catch(NoSuchMethodException unused_ex) {
            return super.buildTrustRootIndex(x509TrustManager0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        Object object0 = null;
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        for(Object object1: this.socketAdapters) {
            if(((SocketAdapter)object1).matchesSocket(sSLSocket0)) {
                object0 = object1;
                break;
            }
        }
        if(((SocketAdapter)object0) != null) {
            ((SocketAdapter)object0).configureTlsExtensions(sSLSocket0, s, list0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void connectSocket(@l Socket socket0, @l InetSocketAddress inetSocketAddress0, int v) throws IOException {
        L.p(socket0, "socket");
        L.p(inetSocketAddress0, "address");
        try {
            socket0.connect(inetSocketAddress0, v);
            return;
        }
        catch(ClassCastException classCastException0) {
            if(Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException0);
            }
            throw classCastException0;
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        for(Object object0: this.socketAdapters) {
            if(((SocketAdapter)object0).matchesSocket(sSLSocket0)) {
                return ((SocketAdapter)object0) == null ? null : ((SocketAdapter)object0).getSelectedProtocol(sSLSocket0);
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public Object getStackTraceForCloseable(@l String s) {
        L.p(s, "closer");
        return this.closeGuard.createAndOpen(s);
    }

    @Override  // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@l String s) {
        L.p(s, "hostname");
        int v = Build.VERSION.SDK_INT;
        if(v >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
        }
        return v < 23 ? true : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override  // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@l String s, @m Object object0) {
        L.p(s, "message");
        if(!this.closeGuard.warnIfOpen(object0)) {
            Platform.log$default(this, s, 5, null, 4, null);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        for(Object object0: this.socketAdapters) {
            if(((SocketAdapter)object0).matchesSocketFactory(sSLSocketFactory0)) {
                return ((SocketAdapter)object0) == null ? null : ((SocketAdapter)object0).trustManager(sSLSocketFactory0);
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

