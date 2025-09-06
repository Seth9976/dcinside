package androidx.media3.common;

import O1.a;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class AdOverlayInfo {
    public static final class Builder {
        private final View a;
        private final int b;
        @Nullable
        private String c;

        public Builder(View view0, int v) {
            this.a = view0;
            this.b = v;
        }

        public AdOverlayInfo a() {
            return new AdOverlayInfo(this.a, this.b, this.c);
        }

        @a
        public Builder b(@Nullable String s) {
            this.c = s;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface Purpose {
    }

    public final View a;
    public final int b;
    @Nullable
    public final String c;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;

    @UnstableApi
    @Deprecated
    public AdOverlayInfo(View view0, int v) {
        this(view0, v, null);
    }

    @UnstableApi
    @Deprecated
    public AdOverlayInfo(View view0, int v, @Nullable String s) {
        this.a = view0;
        this.b = v;
        this.c = s;
    }
}

