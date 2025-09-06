package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.r0;
import y4.l;

@s0({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    @l
    public static final OkHostnameVerifier INSTANCE;

    static {
        OkHostnameVerifier.INSTANCE = new OkHostnameVerifier();
    }

    @l
    public final List allSubjectAltNames(@l X509Certificate x509Certificate0) {
        L.p(x509Certificate0, "certificate");
        return u.D4(this.getSubjectAltNames(x509Certificate0, 7), this.getSubjectAltNames(x509Certificate0, 2));
    }

    private final String asciiToLowercase(String s) {
        if(this.isAscii(s)) {
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            s = s.toLowerCase(locale0);
            L.o(s, "this as java.lang.String).toLowerCase(locale)");
        }
        return s;
    }

    private final List getSubjectAltNames(X509Certificate x509Certificate0, int v) {
        try {
            Collection collection0 = x509Certificate0.getSubjectAlternativeNames();
            if(collection0 == null) {
                return u.H();
            }
            List list0 = new ArrayList();
            for(Object object0: collection0) {
                List list1 = (List)object0;
                if(list1 != null && list1.size() >= 2 && L.g(list1.get(0), v)) {
                    Object object1 = list1.get(1);
                    if(object1 != null) {
                        list0.add(((String)object1));
                    }
                }
            }
            return list0;
        }
        catch(CertificateParsingException unused_ex) {
            return u.H();
        }
    }

    private final boolean isAscii(String s) {
        return s.length() == ((int)r0.l(s, 0, 0, 3, null));
    }

    public final boolean verify(@l String s, @l X509Certificate x509Certificate0) {
        L.p(s, "host");
        L.p(x509Certificate0, "certificate");
        return Util.canParseAsIpAddress(s) ? this.verifyIpAddress(s, x509Certificate0) : this.verifyHostname(s, x509Certificate0);
    }

    @Override  // javax.net.ssl.HostnameVerifier
    public boolean verify(@l String s, @l SSLSession sSLSession0) {
        L.p(s, "host");
        L.p(sSLSession0, "session");
        if(this.isAscii(s)) {
            try {
                Certificate certificate0 = sSLSession0.getPeerCertificates()[0];
                L.n(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return this.verify(s, ((X509Certificate)certificate0));
            }
            catch(SSLException unused_ex) {
            }
        }
        return false;
    }

    private final boolean verifyHostname(String s, String s1) {
        if(s != null && s.length() != 0 && !v.v2(s, ".", false, 2, null) && !v.N1(s, "..", false, 2, null) && s1 != null && s1.length() != 0 && !v.v2(s1, ".", false, 2, null) && !v.N1(s1, "..", false, 2, null)) {
            if(!v.N1(s, ".", false, 2, null)) {
                s = s + '.';
            }
            if(!v.N1(s1, ".", false, 2, null)) {
                s1 = s1 + '.';
            }
            String s2 = this.asciiToLowercase(s1);
            if(!v.W2(s2, "*", false, 2, null)) {
                return L.g(s, s2);
            }
            if(!v.v2(s2, "*.", false, 2, null) || v.r3(s2, '*', 1, false, 4, null) != -1 || s.length() < s2.length()) {
                return false;
            }
            if(L.g("*.", s2)) {
                return false;
            }
            String s3 = s2.substring(1);
            L.o(s3, "this as java.lang.String).substring(startIndex)");
            if(!v.N1(s, s3, false, 2, null)) {
                return false;
            }
            int v = s.length() - s3.length();
            return v <= 0 || v.G3(s, '.', v - 1, false, 4, null) == -1;
        }
        return false;
    }

    private final boolean verifyHostname(String s, X509Certificate x509Certificate0) {
        String s1 = this.asciiToLowercase(s);
        Iterable iterable0 = this.getSubjectAltNames(x509Certificate0, 2);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(OkHostnameVerifier.INSTANCE.verifyHostname(s1, ((String)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String s, X509Certificate x509Certificate0) {
        String s1 = HostnamesKt.toCanonicalHost(s);
        Iterable iterable0 = this.getSubjectAltNames(x509Certificate0, 7);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(L.g(s1, HostnamesKt.toCanonicalHost(((String)object0)))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

