package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class ExoTimeoutException extends RuntimeException {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface TimeoutOperation {
    }

    public final int a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;

    public ExoTimeoutException(int v) {
        super(ExoTimeoutException.a(v));
        this.a = v;
    }

    private static String a(int v) {
        switch(v) {
            case 1: {
                return "Player release timed out.";
            }
            case 2: {
                return "Setting foreground mode timed out.";
            }
            case 3: {
                return "Detaching surface timed out.";
            }
            default: {
                return "Undefined timeout.";
            }
        }
    }
}

