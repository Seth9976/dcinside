package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public interface LoadErrorHandlingPolicy {
    public static final class FallbackOptions {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public FallbackOptions(int v, int v1, int v2, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        public boolean a(int v) {
            return v == 1 ? this.a - this.b > 1 : this.c - this.d > 1;
        }
    }

    public static final class FallbackSelection {
        public final int a;
        public final long b;

        public FallbackSelection(int v, long v1) {
            Assertions.a(v1 >= 0L);
            this.a = v;
            this.b = v1;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface FallbackType {
    }

    public static final class LoadErrorInfo {
        public final LoadEventInfo a;
        public final MediaLoadData b;
        public final IOException c;
        public final int d;

        public LoadErrorInfo(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, int v) {
            this.a = loadEventInfo0;
            this.b = mediaLoadData0;
            this.c = iOException0;
            this.d = v;
        }
    }

    public static final int a = 1;
    public static final int b = 2;

    void a(long arg1);

    @Nullable
    FallbackSelection b(FallbackOptions arg1, LoadErrorInfo arg2);

    long c(LoadErrorInfo arg1);

    int d(int arg1);
}

