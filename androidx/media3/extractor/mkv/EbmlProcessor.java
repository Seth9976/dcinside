package androidx.media3.extractor.mkv;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public interface EbmlProcessor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface androidx.media3.extractor.mkv.EbmlProcessor.ElementType {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;

    void a(int arg1) throws ParserException;

    void b(int arg1, double arg2) throws ParserException;

    void c(int arg1, int arg2, ExtractorInput arg3) throws IOException;

    void d(int arg1, long arg2) throws ParserException;

    void e(int arg1, String arg2) throws ParserException;

    void f(int arg1, long arg2, long arg3) throws ParserException;

    int g(int arg1);

    boolean h(int arg1);
}

