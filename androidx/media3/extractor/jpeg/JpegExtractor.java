package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import androidx.media3.extractor.d;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@UnstableApi
public final class JpegExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    private final Extractor d;
    public static final int e = 1;
    private static final int f = 0xFFD8;
    private static final int g = 2;

    public JpegExtractor() {
        this(0);
    }

    public JpegExtractor(int v) {
        if((v & 1) != 0) {
            this.d = new SingleSampleExtractor(0xFFD8, 2, "image/jpeg");
            return;
        }
        this.d = new JpegMotionPhotoExtractor();
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.d.a(v, v1);
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        return this.d.e(extractorInput0, positionHolder0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return this.d.g(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.d.h(extractorOutput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
        this.d.release();
    }
}

