package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public interface SampleStream {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ReadDataResult {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ReadFlags {
    }

    public static final int m1 = 1;
    public static final int n1 = 2;
    public static final int o1 = 4;

    void b() throws IOException;

    boolean isReady();

    int m(FormatHolder arg1, DecoderInputBuffer arg2, int arg3);

    int p(long arg1);
}

