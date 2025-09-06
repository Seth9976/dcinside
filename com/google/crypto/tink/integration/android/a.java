package com.google.crypto.tink.integration.android;

import O1.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;
import com.google.crypto.tink.c;
import com.google.crypto.tink.f;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.subtle.C;
import com.google.crypto.tink.t;
import com.google.crypto.tink.w;
import com.google.crypto.tink.x;
import com.google.crypto.tink.z;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

public final class a {
    static class com.google.crypto.tink.integration.android.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            com.google.crypto.tink.integration.android.a.a.a = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.integration.android.a.a.a[F2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.integration.android.a.a.a[F2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.integration.android.a.a.a[F2.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b {
        private Context a;
        private String b;
        private String c;
        private String d;
        private com.google.crypto.tink.b e;
        private boolean f;
        private t g;
        @p3.a("this")
        private x h;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = true;
            this.g = null;
        }

        public a f() throws GeneralSecurityException, IOException {
            synchronized(this) {
                if(this.b != null) {
                    Object object0 = a.d;
                    synchronized(object0) {
                        byte[] arr_b = b.i(this.a, this.b, this.c);
                        if(arr_b == null) {
                            if(this.d != null) {
                                this.e = this.l();
                            }
                            this.h = this.h();
                        }
                        else if(this.d == null) {
                            this.h = this.j(arr_b);
                        }
                        else {
                            this.h = this.k(arr_b);
                        }
                        return new a(this, null);
                    }
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }

        @O1.a
        @Deprecated
        public b g() {
            this.d = null;
            this.f = false;
            return this;
        }

        private x h() throws GeneralSecurityException, IOException {
            if(this.g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            x x0 = x.r().a(this.g);
            x x1 = x0.q(x0.k().v().U0(0).H());
            e e0 = new e(this.a, this.b, this.c);
            if(this.e != null) {
                x1.k().P(e0, this.e);
                return x1;
            }
            f.f(x1.k(), e0);
            return x1;
        }

        @Nullable
        private static byte[] i(Context context0, String s, String s1) throws IOException {
            if(s != null) {
                Context context1 = context0.getApplicationContext();
                SharedPreferences sharedPreferences0 = s1 == null ? PreferenceManager.getDefaultSharedPreferences(context1) : context1.getSharedPreferences(s1, 0);
                try {
                    String s2 = sharedPreferences0.getString(s, null);
                    return s2 == null ? null : C.a(s2);
                }
                catch(ClassCastException | IllegalArgumentException unused_ex) {
                    throw new CharConversionException(String.format("can\'t read keyset; the pref value %s is not a valid hex string", s));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }

        private x j(byte[] arr_b) throws GeneralSecurityException, IOException {
            return x.s(f.d(c.b(arr_b)));
        }

        private x k(byte[] arr_b) throws GeneralSecurityException, IOException {
            try {
                this.e = new com.google.crypto.tink.integration.android.c().c(this.d);
            }
            catch(GeneralSecurityException | ProviderException generalSecurityException0) {
                try {
                    x x0 = this.j(arr_b);
                    Log.w("a", "cannot use Android Keystore, it\'ll be disabled", generalSecurityException0);
                    return x0;
                }
                catch(IOException unused_ex) {
                    throw generalSecurityException0;
                }
            }
            try {
                return x.s(w.G(c.b(arr_b), this.e));
            }
            catch(IOException | GeneralSecurityException iOException0) {
                try {
                    return this.j(arr_b);
                }
                catch(IOException unused_ex) {
                    throw iOException0;
                }
            }
        }

        @Nullable
        private com.google.crypto.tink.b l() throws GeneralSecurityException {
            com.google.crypto.tink.integration.android.c c0 = new com.google.crypto.tink.integration.android.c();
            try {
                boolean z = com.google.crypto.tink.integration.android.c.g(this.d);
            }
            catch(GeneralSecurityException | ProviderException generalSecurityException0) {
                Log.w("a", "cannot use Android Keystore, it\'ll be disabled", generalSecurityException0);
                return null;
            }
            try {
                return c0.c(this.d);
            }
            catch(GeneralSecurityException | ProviderException generalSecurityException1) {
                if(!z) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.d), generalSecurityException1);
                }
                Log.w("a", "cannot use Android Keystore, it\'ll be disabled", generalSecurityException1);
                return null;
            }
        }

        @O1.a
        public b m(t t0) {
            this.g = t0;
            return this;
        }

        @O1.a
        @Deprecated
        public b n(n2 n20) {
            this.g = t.a(n20.getTypeUrl(), n20.getValue().a0(), a.k(n20.y()));
            return this;
        }

        @O1.a
        public b o(String s) {
            if(!s.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if(!this.f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.d = s;
            return this;
        }

        @O1.a
        public b p(Context context0, String s, String s1) throws IOException {
            if(context0 == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if(s == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.a = context0;
            this.b = s;
            this.c = s1;
            return this;
        }
    }

    private final z a;
    private final com.google.crypto.tink.b b;
    @p3.a("this")
    private x c;
    private static final Object d = null;
    private static final String e = "a";

    static {
        a.d = new Object();
    }

    private a(b a$b0) {
        this.a = new e(a$b0.a, a$b0.b, a$b0.c);
        this.b = a$b0.e;
        this.c = a$b0.h;
    }

    a(b a$b0, com.google.crypto.tink.integration.android.a.a a$a0) {
        this(a$b0);
    }

    // 去混淆评级： 低(20)
    static boolean c() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String d() [...] // 潜在的解密器

    @O1.a
    @p3.a("this")
    public a e(t t0) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.a(t0);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    @Deprecated
    @p3.a("this")
    public a f(n2 n20) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.b(n20);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    public a g(int v) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.g(v);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    public a h(int v) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.h(v);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    public a i(int v) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.i(v);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    public a j(int v) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.j(v);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    private static com.google.crypto.tink.t.b k(F2 f20) {
        switch(f20) {
            case 1: {
                return com.google.crypto.tink.t.b.a;
            }
            case 2: {
                return com.google.crypto.tink.t.b.b;
            }
            case 3: {
                return com.google.crypto.tink.t.b.c;
            }
            case 4: {
                return com.google.crypto.tink.t.b.d;
            }
            default: {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
        }
    }

    public w l() throws GeneralSecurityException {
        synchronized(this) {
            return this.c.k();
        }
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean m() [...] // 潜在的解密器

    public boolean n() {
        synchronized(this) {
            return this.r();
        }
    }

    @O1.a
    @l(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public a o(int v) throws GeneralSecurityException {
        synchronized(this) {
            return this.q(v);
        }
    }

    @O1.a
    @Deprecated
    public a p(n2 n20) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.p(n20);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    @O1.a
    public a q(int v) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = this.c.q(v);
            this.c = x0;
            this.s(x0);
            return this;
        }
    }

    // 去混淆评级： 低(30)
    @ChecksSdkIntAtLeast(api = 23)
    private boolean r() {
        return this.b != null;
    }

    private void s(x x0) throws GeneralSecurityException {
        try {
            if(this.r()) {
                x0.k().P(this.a, this.b);
                return;
            }
            f.f(x0.k(), this.a);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new GeneralSecurityException(iOException0);
    }
}

