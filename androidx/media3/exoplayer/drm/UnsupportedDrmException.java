package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class UnsupportedDrmException extends Exception {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface Reason {
    }

    public final int a;
    public static final int b = 1;
    public static final int c = 2;

    public UnsupportedDrmException(int v) {
        this.a = v;
    }

    public UnsupportedDrmException(int v, Exception exception0) {
        super(exception0);
        this.a = v;
    }
}

