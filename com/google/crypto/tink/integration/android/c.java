package com.google.crypto.tink.integration.android;

import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.security.crypto.f;
import com.google.crypto.tink.A;
import com.google.crypto.tink.subtle.b0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

public final class c implements A {
    static class a {
    }

    public static final class b {
        String a;
        KeyStore b;

        @RequiresApi(23)
        public b() {
            this.a = null;
            this.b = null;
            try {
                KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore0;
                keyStore0.load(null);
            }
            catch(GeneralSecurityException | IOException generalSecurityException0) {
                throw new IllegalStateException(generalSecurityException0);
            }
        }

        public c a() {
            return new c(this, null);
        }

        @O1.a
        @RequiresApi(23)
        public b b(KeyStore keyStore0) {
            if(keyStore0 == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.b = keyStore0;
            return this;
        }

        @O1.a
        @RequiresApi(23)
        public b c(String s) {
            if(s == null || !s.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                throw new IllegalArgumentException("val must start with android-keystore://");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    @p3.a("this")
    private KeyStore b;
    private static final Object c = null;
    private static final String d = "c";
    private static final int e = 40;
    public static final String f = "android-keystore://";

    static {
        c.c = new Object();
    }

    @RequiresApi(23)
    public c() throws GeneralSecurityException {
        this(new b());
    }

    private c(b c$b0) {
        this.a = c$b0.a;
        this.b = c$b0.b;
    }

    c(b c$b0, a c$a0) {
        this(c$b0);
    }

    @RequiresApi(23)
    @Deprecated
    public c(String s) {
        this(new b().c(s));
    }

    @Override  // com.google.crypto.tink.A
    @RequiresApi(23)
    public boolean a(String s) {
        boolean z = true;
        synchronized(this) {
            if(this.a != null && this.a.equals(s)) {
                return true;
            }
            if(this.a != null || !s.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.google.crypto.tink.A
    @RequiresApi(23)
    public A b() throws GeneralSecurityException {
        return new c();
    }

    @Override  // com.google.crypto.tink.A
    public com.google.crypto.tink.b c(String s) throws GeneralSecurityException {
        synchronized(this) {
            if(this.a != null && !this.a.equals(s)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, s));
            }
            return c.n(new com.google.crypto.tink.integration.android.b(b0.d("android-keystore://", s), this.b));
        }
    }

    @Override  // com.google.crypto.tink.A
    @RequiresApi(23)
    public A d(String s) throws GeneralSecurityException {
        return new c();
    }

    // 去混淆评级： 低(20)
    static boolean e() [...] // 潜在的解密器

    public void f(String s) throws GeneralSecurityException {
        synchronized(this) {
            String s1 = b0.d("android-keystore://", s);
            this.b.deleteEntry(s1);
        }
    }

    @RequiresApi(23)
    static boolean g(String s) throws GeneralSecurityException {
        c c0 = new c();
        synchronized(c.c) {
            if(!c0.k(s)) {
                c.i(s);
                return true;
            }
            return false;
        }
    }

    @RequiresApi(23)
    public static void h(String s) throws GeneralSecurityException {
        c c0 = new c();
        synchronized(c.c) {
            if(!c0.k(s)) {
                c.i(s);
                return;
            }
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", s));
    }

    @RequiresApi(23)
    static void i(String s) throws GeneralSecurityException {
        String s1 = b0.d("android-keystore://", s);
        KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator0.init(f.a(s1, 3).setKeySize(0x100).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        keyGenerator0.generateKey();
    }

    @RequiresApi(23)
    public static com.google.crypto.tink.b j(String s) throws GeneralSecurityException, IOException {
        c c0 = new c();
        synchronized(c.c) {
            if(!c0.k(s)) {
                c.i(s);
            }
        }
        return c0.c(s);
    }

    boolean k(String s) throws GeneralSecurityException {
        synchronized(this) {
            String s1 = b0.d("android-keystore://", s);
            try {
                return this.b.containsAlias(s1);
            }
            catch(NullPointerException unused_ex) {
                Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                try {
                    c.m();
                    KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
                    this.b = keyStore0;
                    keyStore0.load(null);
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException(iOException0);
                }
                return this.b.containsAlias(s1);
            }
        }
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean l() [...] // 潜在的解密器

    private static void m() {
        try {
            Thread.sleep(((int)(Math.random() * 40.0)));
        }
        catch(InterruptedException unused_ex) {
        }
    }

    private static com.google.crypto.tink.b n(com.google.crypto.tink.b b0) throws GeneralSecurityException {
        byte[] arr_b = {(byte)0x86, -89, -1, 7, -54, -34, (byte)0x89, 39, 73, 5};
        byte[] arr_b1 = new byte[0];
        if(!Arrays.equals(arr_b, b0.b(b0.a(arr_b, arr_b1), arr_b1))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return b0;
    }
}

