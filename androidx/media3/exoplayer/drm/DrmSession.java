package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;

@UnstableApi
public interface DrmSession {
    public static class DrmSessionException extends IOException {
        public final int a;

        public DrmSessionException(Throwable throwable0, int v) {
            super(throwable0);
            this.a = v;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface State {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    boolean a();

    @Nullable
    CryptoConfig b();

    @Nullable
    Map c();

    void d(@Nullable EventDispatcher arg1);

    UUID e();

    @Nullable
    byte[] f();

    void g(@Nullable EventDispatcher arg1);

    @Nullable
    DrmSessionException getError();

    int getState();

    boolean h(String arg1);
}

