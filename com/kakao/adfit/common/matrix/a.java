package com.kakao.adfit.common.matrix;

import com.kakao.adfit.common.matrix.exception.InvalidDsnException;
import java.net.URI;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;

public final class a {
    public static final class com.kakao.adfit.common.matrix.a.a {
        private com.kakao.adfit.common.matrix.a.a() {
        }

        public com.kakao.adfit.common.matrix.a.a(w w0) {
        }

        public final a a(String s) {
            L.p(s, "dsn");
            try {
                URI uRI0 = new URI(s);
                String s1 = uRI0.getUserInfo();
                if(s1 != null) {
                    String s2 = s1.length() <= 0 ? null : s1;
                    if(s2 != null) {
                        List list0 = v.V4(s2, new String[]{":"}, false, 0, 6, null);
                        Object object0 = list0.get(0);
                        if(((String)object0).length() <= 0) {
                            object0 = null;
                        }
                        if(((String)object0) == null) {
                            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
                        }
                        Object object1 = u.W2(list0, 1);
                        String s3 = uRI0.getPath();
                        L.o(s3, "uriPath");
                        if(v.N1(s3, "/", false, 2, null)) {
                            L.o(s3, "uriPath");
                            s3 = s3.substring(0, s3.length() - 1);
                            L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        L.o(s3, "uriPath");
                        int v = v.H3(s3, "/", 0, false, 6, null);
                        L.o(s3, "uriPath");
                        String s4 = s3.substring(0, v + 1);
                        L.o(s4, "this as java.lang.String…ing(startIndex, endIndex)");
                        String s5 = v.N1(s4, "/", false, 2, null) ? s4 : s4 + '/';
                        L.o(s3, "uriPath");
                        String s6 = s3.substring(v + 1);
                        L.o(s6, "this as java.lang.String).substring(startIndex)");
                        String s7 = s6.length() <= 0 ? null : s6;
                        if(s7 == null) {
                            throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                        }
                        return new a(new URI(uRI0.getScheme(), null, uRI0.getHost(), uRI0.getPort(), s5 + "api/" + s7, null, null), s7, ((String)object0), ((String)object1), s5);
                    }
                }
                throw new IllegalArgumentException("Invalid DSN: No key provided.");
            }
            catch(Exception exception0) {
            }
            throw new InvalidDsnException(exception0);
        }
    }

    private final URI a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    public static final com.kakao.adfit.common.matrix.a.a f;

    static {
        a.f = new com.kakao.adfit.common.matrix.a.a(null);
    }

    public a(URI uRI0, String s, String s1, String s2, String s3) {
        L.p(uRI0, "uri");
        L.p(s, "projectId");
        L.p(s1, "publicKey");
        super();
        this.a = uRI0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final URI c() {
        return this.a;
    }
}

