package androidx.security.crypto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public final class MasterKey {
    @RequiresApi(23)
    static class Api23Impl {
        @DoNotInline
        static int a(KeyGenParameterSpec keyGenParameterSpec0) {
            return keyGenParameterSpec0.getUserAuthenticationValidityDurationSeconds();
        }

        @DoNotInline
        static boolean b(KeyGenParameterSpec keyGenParameterSpec0) {
            return keyGenParameterSpec0.isUserAuthenticationRequired();
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        @DoNotInline
        static boolean a(KeyGenParameterSpec keyGenParameterSpec0) {
            return keyGenParameterSpec0.isStrongBoxBacked();
        }
    }

    public static final class Builder {
        @RequiresApi(23)
        static class androidx.security.crypto.MasterKey.Builder.Api23Impl {
            @RequiresApi(28)
            static class androidx.security.crypto.MasterKey.Builder.Api23Impl.Api28Impl {
                @DoNotInline
                static void a(KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0) {
                    keyGenParameterSpec$Builder0.setIsStrongBoxBacked(true);
                }
            }

            @RequiresApi(30)
            static class Api30Impl {
                @DoNotInline
                static void a(KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0, int v, int v1) {
                    keyGenParameterSpec$Builder0.setUserAuthenticationParameters(v, v1);
                }
            }

            static MasterKey a(Builder masterKey$Builder0) throws GeneralSecurityException, IOException {
                KeyScheme masterKey$KeyScheme0 = masterKey$Builder0.c;
                if(masterKey$KeyScheme0 == null && masterKey$Builder0.b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if(masterKey$KeyScheme0 == KeyScheme.a) {
                    KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder(masterKey$Builder0.a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(0x100);
                    if(masterKey$Builder0.d) {
                        keyGenParameterSpec$Builder0.setUserAuthenticationRequired(true);
                        if(Build.VERSION.SDK_INT >= 30) {
                            Api30Impl.a(keyGenParameterSpec$Builder0, masterKey$Builder0.e, 3);
                        }
                        else {
                            keyGenParameterSpec$Builder0.setUserAuthenticationValidityDurationSeconds(masterKey$Builder0.e);
                        }
                    }
                    if(Build.VERSION.SDK_INT >= 28 && masterKey$Builder0.f && masterKey$Builder0.g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        androidx.security.crypto.MasterKey.Builder.Api23Impl.Api28Impl.a(keyGenParameterSpec$Builder0);
                    }
                    masterKey$Builder0.b = keyGenParameterSpec$Builder0.build();
                }
                KeyGenParameterSpec keyGenParameterSpec0 = masterKey$Builder0.b;
                if(keyGenParameterSpec0 == null) {
                    throw new NullPointerException("KeyGenParameterSpec was null after build() check");
                }
                return new MasterKey(MasterKeys.c(keyGenParameterSpec0), masterKey$Builder0.b);
            }

            @DoNotInline
            static String b(KeyGenParameterSpec keyGenParameterSpec0) {
                return keyGenParameterSpec0.getKeystoreAlias();
            }
        }

        @NonNull
        final String a;
        @Nullable
        KeyGenParameterSpec b;
        @Nullable
        KeyScheme c;
        boolean d;
        int e;
        boolean f;
        final Context g;

        public Builder(@NonNull Context context0) {
            this(context0, "_androidx_security_master_key_");
        }

        public Builder(@NonNull Context context0, @NonNull String s) {
            this.g = context0.getApplicationContext();
            this.a = s;
        }

        @NonNull
        public MasterKey a() throws GeneralSecurityException, IOException {
            return Build.VERSION.SDK_INT < 23 ? new MasterKey(this.a, null) : androidx.security.crypto.MasterKey.Builder.Api23Impl.a(this);
        }

        @NonNull
        @RequiresApi(23)
        public Builder b(@NonNull KeyGenParameterSpec keyGenParameterSpec0) {
            if(this.c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            String s = androidx.security.crypto.MasterKey.Builder.Api23Impl.b(keyGenParameterSpec0);
            if(!this.a.equals(s)) {
                throw new IllegalArgumentException("KeyGenParamSpec\'s key alias does not match provided alias (" + this.a + " vs " + androidx.security.crypto.MasterKey.Builder.Api23Impl.b(keyGenParameterSpec0));
            }
            this.b = keyGenParameterSpec0;
            return this;
        }

        @NonNull
        public Builder c(@NonNull KeyScheme masterKey$KeyScheme0) {
            if(androidx.security.crypto.MasterKey.1.a[masterKey$KeyScheme0.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + masterKey$KeyScheme0);
            }
            if(Build.VERSION.SDK_INT >= 23 && this.b != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            this.c = masterKey$KeyScheme0;
            return this;
        }

        @NonNull
        public Builder d(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        public Builder e(boolean z) {
            return this.f(z, 300);
        }

        @NonNull
        public Builder f(boolean z, @IntRange(from = 1L) int v) {
            this.d = z;
            this.e = v;
            return this;
        }
    }

    public static enum KeyScheme {
        AES256_GCM;

        private static KeyScheme[] a() [...] // Inlined contents
    }

    @NonNull
    private final String a;
    @Nullable
    private final KeyGenParameterSpec b;
    static final String c = "android-keystore://";
    public static final String d = "_androidx_security_master_key_";
    public static final int e = 0x100;
    private static final int f = 300;

    MasterKey(@NonNull String s, @Nullable Object object0) {
        this.a = s;
        if(Build.VERSION.SDK_INT >= 23) {
            this.b = (KeyGenParameterSpec)object0;
            return;
        }
        this.b = null;
    }

    @SuppressLint({"MethodNameUnits"})
    public static int a() [...] // Inlined contents

    @NonNull
    String b() {
        return this.a;
    }

    @SuppressLint({"MethodNameUnits"})
    public int c() {
        if(Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        return this.b == null ? 0 : Api23Impl.a(this.b);
    }

    public boolean d() {
        if(Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
            keyStore0.load(null);
            return keyStore0.containsAlias(this.a);
        }
        catch(KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException unused_ex) {
            return false;
        }
    }

    public boolean e() {
        if(Build.VERSION.SDK_INT >= 28) {
            return this.b == null ? false : Api28Impl.a(this.b);
        }
        return false;
    }

    public boolean f() {
        return Build.VERSION.SDK_INT >= 23 ? this.b != null && Api23Impl.b(this.b) : false;
    }

    @Override
    @NonNull
    public String toString() {
        return "MasterKey{keyAlias=" + this.a + ", isKeyStoreBacked=" + this.d() + "}";
    }
}

