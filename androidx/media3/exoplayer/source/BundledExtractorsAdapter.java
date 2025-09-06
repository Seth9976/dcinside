package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.common.base.y;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private final ExtractorsFactory a;
    @Nullable
    private Extractor b;
    @Nullable
    private ExtractorInput c;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory0) {
        this.a = extractorsFactory0;
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void a(long v, long v1) {
        ((Extractor)Assertions.g(this.b)).a(v, v1);
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void b(DataReader dataReader0, Uri uri0, Map map0, long v, long v1, ExtractorOutput extractorOutput0) throws IOException {
        boolean z1;
        DefaultExtractorInput defaultExtractorInput0 = new DefaultExtractorInput(dataReader0, v, v1);
        this.c = defaultExtractorInput0;
        if(this.b != null) {
            return;
        }
        Extractor[] arr_extractor = this.a.c(uri0, map0);
        a o2$a0 = O2.o(arr_extractor.length);
        boolean z = false;
        if(arr_extractor.length == 1) {
            this.b = arr_extractor[0];
        }
        else {
            int v2 = 0;
            while(v2 < arr_extractor.length) {
                Extractor extractor0 = arr_extractor[v2];
                try {
                    if(extractor0.g(defaultExtractorInput0)) {
                        this.b = extractor0;
                        goto label_15;
                    }
                    goto label_18;
                }
                catch(EOFException unused_ex) {
                    z1 = this.b != null || defaultExtractorInput0.getPosition() == v;
                    goto label_32;
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
            label_15:
                Assertions.i(true);
                defaultExtractorInput0.o();
                break;
                try {
                label_18:
                    o2$a0.l(extractor0.d());
                }
                catch(EOFException unused_ex) {
                    z1 = this.b != null || defaultExtractorInput0.getPosition() == v;
                    goto label_32;
                }
                catch(Throwable throwable0) {
                label_26:
                    if(this.b != null || defaultExtractorInput0.getPosition() == v) {
                        z = true;
                    }
                    Assertions.i(z);
                    defaultExtractorInput0.o();
                    throw throwable0;
                }
                z1 = this.b != null || defaultExtractorInput0.getPosition() == v;
            label_32:
                Assertions.i(z1);
                defaultExtractorInput0.o();
                ++v2;
            }
            if(this.b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + y.p(", ").k(z3.D(O2.x(arr_extractor), (Extractor extractor0) -> extractor0.c().getClass().getSimpleName())) + ") could read the stream.", ((Uri)Assertions.g(uri0)), o2$a0.n());
            }
        }
        this.b.h(extractorOutput0);
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long c() {
        return this.c == null ? -1L : this.c.getPosition();
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void d() {
        Extractor extractor0 = this.b;
        if(extractor0 == null) {
            return;
        }
        Extractor extractor1 = extractor0.c();
        if(extractor1 instanceof Mp3Extractor) {
            ((Mp3Extractor)extractor1).l();
        }
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int e(PositionHolder positionHolder0) throws IOException {
        return ((Extractor)Assertions.g(this.b)).e(((ExtractorInput)Assertions.g(this.c)), positionHolder0);
    }

    // 检测为 Lambda 实现
    private static String g(Extractor extractor0) [...]

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor0 = this.b;
        if(extractor0 != null) {
            extractor0.release();
            this.b = null;
        }
        this.c = null;
    }
}

