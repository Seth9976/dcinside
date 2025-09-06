package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@RestrictTo({Scope.c})
@Deprecated
public class FingerprintManagerCompat {
    @RequiresApi(23)
    static class Api23Impl {
        @RequiresPermission("android.permission.USE_FINGERPRINT")
        static void a(Object object0, Object object1, CancellationSignal cancellationSignal0, int v, Object object2, Handler handler0) {
            ((FingerprintManager)object0).authenticate(((FingerprintManager.CryptoObject)object1), cancellationSignal0, v, ((FingerprintManager.AuthenticationCallback)object2), handler0);
        }

        static FingerprintManager.CryptoObject b(Object object0) {
            return ((FingerprintManager.AuthenticationResult)object0).getCryptoObject();
        }

        public static FingerprintManager c(Context context0) {
            int v = Build.VERSION.SDK_INT;
            if(v == 23) {
                return (FingerprintManager)context0.getSystemService(FingerprintManager.class);
            }
            return v <= 23 || !context0.getPackageManager().hasSystemFeature("android.hardware.fingerprint") ? null : ((FingerprintManager)context0.getSystemService(FingerprintManager.class));
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        static boolean d(Object object0) {
            return ((FingerprintManager)object0).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        static boolean e(Object object0) {
            return ((FingerprintManager)object0).isHardwareDetected();
        }

        public static CryptoObject f(Object object0) {
            if(((FingerprintManager.CryptoObject)object0) == null) {
                return null;
            }
            if(((FingerprintManager.CryptoObject)object0).getCipher() != null) {
                return new CryptoObject(((FingerprintManager.CryptoObject)object0).getCipher());
            }
            if(((FingerprintManager.CryptoObject)object0).getSignature() != null) {
                return new CryptoObject(((FingerprintManager.CryptoObject)object0).getSignature());
            }
            return ((FingerprintManager.CryptoObject)object0).getMac() == null ? null : new CryptoObject(((FingerprintManager.CryptoObject)object0).getMac());
        }

        public static FingerprintManager.CryptoObject g(CryptoObject fingerprintManagerCompat$CryptoObject0) {
            if(fingerprintManagerCompat$CryptoObject0 == null) {
                return null;
            }
            if(fingerprintManagerCompat$CryptoObject0.a() != null) {
                return new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.a());
            }
            if(fingerprintManagerCompat$CryptoObject0.c() != null) {
                return new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.c());
            }
            return fingerprintManagerCompat$CryptoObject0.b() == null ? null : new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.b());
        }
    }

    public static abstract class AuthenticationCallback {
        public void a(int v, CharSequence charSequence0) {
        }

        public void b() {
        }

        public void c(int v, CharSequence charSequence0) {
        }

        public void d(AuthenticationResult fingerprintManagerCompat$AuthenticationResult0) {
        }
    }

    public static final class AuthenticationResult {
        private final CryptoObject a;

        public AuthenticationResult(CryptoObject fingerprintManagerCompat$CryptoObject0) {
            this.a = fingerprintManagerCompat$CryptoObject0;
        }

        public CryptoObject a() {
            return this.a;
        }
    }

    public static class CryptoObject {
        private final Signature a;
        private final Cipher b;
        private final Mac c;

        public CryptoObject(Signature signature0) {
            this.a = signature0;
            this.b = null;
            this.c = null;
        }

        public CryptoObject(Cipher cipher0) {
            this.b = cipher0;
            this.a = null;
            this.c = null;
        }

        public CryptoObject(Mac mac0) {
            this.c = mac0;
            this.b = null;
            this.a = null;
        }

        public Cipher a() {
            return this.b;
        }

        public Mac b() {
            return this.c;
        }

        public Signature c() {
            return this.a;
        }
    }

    private final Context a;

    private FingerprintManagerCompat(Context context0) {
        this.a = context0;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void a(CryptoObject fingerprintManagerCompat$CryptoObject0, int v, CancellationSignal cancellationSignal0, AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0, Handler handler0) {
        if(Build.VERSION.SDK_INT >= 23) {
            FingerprintManager fingerprintManager0 = FingerprintManagerCompat.d(this.a);
            if(fingerprintManager0 != null) {
                Api23Impl.a(fingerprintManager0, FingerprintManagerCompat.i(fingerprintManagerCompat$CryptoObject0), cancellationSignal0, v, FingerprintManagerCompat.h(fingerprintManagerCompat$AuthenticationCallback0), handler0);
            }
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    @RestrictTo({Scope.c})
    @Deprecated
    public void b(CryptoObject fingerprintManagerCompat$CryptoObject0, int v, androidx.core.os.CancellationSignal cancellationSignal0, AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0, Handler handler0) {
        this.a(fingerprintManagerCompat$CryptoObject0, v, (cancellationSignal0 == null ? null : ((CancellationSignal)cancellationSignal0.b())), fingerprintManagerCompat$AuthenticationCallback0, handler0);
    }

    public static FingerprintManagerCompat c(Context context0) {
        return new FingerprintManagerCompat(context0);
    }

    @RequiresApi(23)
    private static FingerprintManager d(Context context0) {
        return Api23Impl.c(context0);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean e() {
        if(Build.VERSION.SDK_INT >= 23) {
            FingerprintManager fingerprintManager0 = FingerprintManagerCompat.d(this.a);
            return fingerprintManager0 != null && Api23Impl.d(fingerprintManager0);
        }
        return false;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean f() {
        if(Build.VERSION.SDK_INT >= 23) {
            FingerprintManager fingerprintManager0 = FingerprintManagerCompat.d(this.a);
            return fingerprintManager0 != null && Api23Impl.e(fingerprintManager0);
        }
        return false;
    }

    @RequiresApi(23)
    static CryptoObject g(FingerprintManager.CryptoObject fingerprintManager$CryptoObject0) {
        return Api23Impl.f(fingerprintManager$CryptoObject0);
    }

    @RequiresApi(23)
    private static FingerprintManager.AuthenticationCallback h(AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0) {
        return new FingerprintManager.AuthenticationCallback() {
            @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
            public void onAuthenticationError(int v, CharSequence charSequence0) {
            }

            @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
            public void onAuthenticationFailed() {
            }

            @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
            public void onAuthenticationHelp(int v, CharSequence charSequence0) {
            }

            @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult fingerprintManager$AuthenticationResult0) {
                new AuthenticationResult(FingerprintManagerCompat.g(Api23Impl.b(fingerprintManager$AuthenticationResult0)));
            }
        };
    }

    @RequiresApi(23)
    private static FingerprintManager.CryptoObject i(CryptoObject fingerprintManagerCompat$CryptoObject0) {
        return Api23Impl.g(fingerprintManagerCompat$CryptoObject0);
    }
}

