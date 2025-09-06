package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import w4.e;

@UnstableApi
public interface Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ReadResult {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = -1;

    void a(long arg1, long arg2);

    @e
    Extractor c();

    List d();

    int e(ExtractorInput arg1, PositionHolder arg2) throws IOException;

    boolean g(ExtractorInput arg1) throws IOException;

    void h(ExtractorOutput arg1);

    void release();
}

