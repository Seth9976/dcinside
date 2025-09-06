package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public final class y {
    static class a {
    }

    static class b implements e {
        private final z a;

        private b(z z0) {
            this.a = z0;
        }

        b(z z0, a y$a0) {
            this(z0);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object a(String s, List list0) throws GeneralSecurityException {
            return this.b(s);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object b(String s) throws GeneralSecurityException {
            Exception exception0 = null;
            for(Object object0: y.c(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"})) {
                Provider provider0 = (Provider)object0;
                try {
                    return this.a.a(s, provider0);
                }
                catch(Exception exception1) {
                    if(exception0 != null) {
                        continue;
                    }
                    exception0 = exception1;
                }
            }
            return this.a.a(s, null);
        }
    }

    static class c implements e {
        private final z a;

        private c(z z0) {
            this.a = z0;
        }

        c(z z0, a y$a0) {
            this(z0);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object a(String s, List list0) throws GeneralSecurityException {
            for(Object object0: list0) {
                Provider provider0 = (Provider)object0;
                try {
                    return this.a.a(s, provider0);
                }
                catch(Exception unused_ex) {
                }
            }
            return this.b(s);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object b(String s) throws GeneralSecurityException {
            return this.a.a(s, null);
        }
    }

    static class d implements e {
        private final z a;

        private d(z z0) {
            this.a = z0;
        }

        d(z z0, a y$a0) {
            this(z0);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object a(String s, List list0) throws GeneralSecurityException {
            return this.b(s);
        }

        @Override  // com.google.crypto.tink.subtle.y$e
        public Object b(String s) throws GeneralSecurityException {
            Throwable throwable0 = null;
            for(Object object0: y.c(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"})) {
                Provider provider0 = (Provider)object0;
                try {
                    return this.a.a(s, provider0);
                }
                catch(Exception exception0) {
                    if(throwable0 != null) {
                        continue;
                    }
                    throwable0 = exception0;
                }
            }
            throw new GeneralSecurityException("No good Provider found.", throwable0);
        }
    }

    interface e {
        Object a(String arg1, List arg2) throws GeneralSecurityException;

        Object b(String arg1) throws GeneralSecurityException;
    }

    private final e a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final y g;
    public static final y h;

    static {
        y.b = new y(new com.google.crypto.tink.subtle.z.a());
        y.c = new y(new com.google.crypto.tink.subtle.z.e());
        y.d = new y(new g());
        y.e = new y(new f());
        y.f = new y(new com.google.crypto.tink.subtle.z.b());
        y.g = new y(new com.google.crypto.tink.subtle.z.d());
        y.h = new y(new com.google.crypto.tink.subtle.z.c());
    }

    public y(z z0) {
        if(com.google.crypto.tink.config.internal.c.e()) {
            this.a = new d(z0, null);
            return;
        }
        if(a0.d()) {
            this.a = new b(z0, null);
            return;
        }
        this.a = new c(z0, null);
    }

    public Object a(String s) throws GeneralSecurityException {
        return this.a.b(s);
    }

    Object b(String s, List list0) throws GeneralSecurityException {
        return this.a.a(s, list0);
    }

    public static List c(String[] arr_s) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            Provider provider0 = Security.getProvider(arr_s[v]);
            if(provider0 != null) {
                list0.add(provider0);
            }
        }
        return list0;
    }
}

