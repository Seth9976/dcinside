package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
@Deprecated
public final class DummyTrackOutput implements TrackOutput {
    private final DiscardingTrackOutput d;

    public DummyTrackOutput() {
        this.d = new DiscardingTrackOutput();
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void a(ParsableByteArray parsableByteArray0, int v, int v1) {
        this.d.a(parsableByteArray0, v, v1);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void b(ParsableByteArray parsableByteArray0, int v) {
        this.d.b(parsableByteArray0, v);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
        return this.d.c(dataReader0, v, z, v1);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void d(Format format0) {
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int e(DataReader dataReader0, int v, boolean z) throws IOException {
        return this.d.e(dataReader0, v, z);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
    }
}

