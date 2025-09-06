package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.W0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class DrmUtil {
    @RequiresApi(21)
    static final class Api21 {
        @DoNotInline
        public static boolean a(@Nullable Throwable throwable0) {
            return throwable0 instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        public static int b(Throwable throwable0) {
            return Util.q0(Util.r0(((MediaDrm.MediaDrmStateException)throwable0).getDiagnosticInfo()));
        }
    }

    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static boolean a(@Nullable Throwable throwable0) {
            return W0.a(throwable0);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface ErrorSource {
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;

    public static int a(Throwable throwable0, int v) {
        int v1 = Util.a;
        if(v1 >= 21 && Api21.a(throwable0)) {
            return Api21.b(throwable0);
        }
        if(v1 >= 23 && Api23.a(throwable0)) {
            return 6006;
        }
        if(!(throwable0 instanceof NotProvisionedException) && !DrmUtil.b(throwable0)) {
            if(throwable0 instanceof DeniedByServerException) {
                return 6007;
            }
            if(throwable0 instanceof UnsupportedDrmException) {
                return 6001;
            }
            if(throwable0 instanceof MissingSchemeDataException) {
                return 6003;
            }
            if(throwable0 instanceof KeysExpiredException) {
                return 6008;
            }
            switch(v) {
                case 1: {
                    return 6006;
                }
                case 2: {
                    return 6004;
                }
                case 3: {
                    return 6002;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return 6002;
    }

    // 去混淆评级： 低(20)
    public static boolean b(@Nullable Throwable throwable0) {
        return Util.a == 34 && throwable0 instanceof NoSuchMethodError && throwable0.getMessage() != null && throwable0.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    // 去混淆评级： 低(20)
    public static boolean c(@Nullable Throwable throwable0) {
        return Util.a == 34 && throwable0 instanceof NoSuchMethodError && throwable0.getMessage() != null && throwable0.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}

