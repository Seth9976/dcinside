package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@RequiresApi(23)
@Deprecated
public final class MasterKeys {
    static final String a = "_androidx_security_master_key_";
    static final int b = 0x100;
    private static final String c = "AndroidKeyStore";
    @NonNull
    public static final KeyGenParameterSpec d;
    private static final Object e;

    static {
        MasterKeys.d = MasterKeys.a("_androidx_security_master_key_");
        MasterKeys.e = new Object();
    }

    @NonNull
    private static KeyGenParameterSpec a(@NonNull String s) {
        return f.a(s, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(0x100).build();
    }

    private static void b(@NonNull KeyGenParameterSpec keyGenParameterSpec0) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator0.init(keyGenParameterSpec0);
            keyGenerator0.generateKey();
        }
        catch(ProviderException providerException0) {
            throw new GeneralSecurityException(providerException0.getMessage(), providerException0);
        }
    }

    @NonNull
    public static String c(@NonNull KeyGenParameterSpec keyGenParameterSpec0) throws GeneralSecurityException, IOException {
        MasterKeys.e(keyGenParameterSpec0);
        synchronized(MasterKeys.e) {
            if(!MasterKeys.d(keyGenParameterSpec0.getKeystoreAlias())) {
                MasterKeys.b(keyGenParameterSpec0);
            }
        }
        return keyGenParameterSpec0.getKeystoreAlias();
    }

    private static boolean d(@NonNull String s) throws GeneralSecurityException, IOException {
        KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
        keyStore0.load(null);
        return keyStore0.containsAlias(s);
    }

    @VisibleForTesting
    static void e(KeyGenParameterSpec keyGenParameterSpec0) {
        if(keyGenParameterSpec0.getKeySize() != 0x100) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec0.getKeySize() + " bits");
        }
        if(!Arrays.equals(keyGenParameterSpec0.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec0.getBlockModes()));
        }
        if(keyGenParameterSpec0.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec0.getPurposes());
        }
        if(!Arrays.equals(keyGenParameterSpec0.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec0.getEncryptionPaddings()));
        }
        if(keyGenParameterSpec0.isUserAuthenticationRequired() && keyGenParameterSpec0.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }
}

