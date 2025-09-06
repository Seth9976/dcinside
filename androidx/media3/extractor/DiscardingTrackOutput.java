package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;

@UnstableApi
public final class DiscardingTrackOutput implements TrackOutput {
    private final byte[] d;

    public DiscardingTrackOutput() {
        this.d = new byte[0x1000];
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void a(ParsableByteArray parsableByteArray0, int v, int v1) {
        parsableByteArray0.Z(v);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void b(ParsableByteArray parsableByteArray0, int v) {
        g.b(this, parsableByteArray0, v);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
        int v2 = dataReader0.read(this.d, 0, Math.min(this.d.length, v));
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2;
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void d(Format format0) {
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int e(DataReader dataReader0, int v, boolean z) {
        return g.a(this, dataReader0, v, z);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
    }
}

