package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput b;

    public ForwardingExtractorInput(ExtractorInput extractorInput0) {
        this.b = extractorInput0;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean d(int v, boolean z) throws IOException {
        return this.b.d(v, z);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean e(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        return this.b.e(arr_b, v, v1, z);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int g(int v) throws IOException {
        return this.b.g(v);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.b.getLength();
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.b.getPosition();
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void h(long v, Throwable throwable0) throws Throwable {
        this.b.h(v, throwable0);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int i(byte[] arr_b, int v, int v1) throws IOException {
        return this.b.i(arr_b, v, v1);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void k(byte[] arr_b, int v, int v1) throws IOException {
        this.b.k(arr_b, v, v1);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean n(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        return this.b.n(arr_b, v, v1, z);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void o() {
        this.b.o();
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long p() {
        return this.b.p();
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void q(int v) throws IOException {
        this.b.q(v);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void r(int v) throws IOException {
        this.b.r(v);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        return this.b.read(arr_b, v, v1);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] arr_b, int v, int v1) throws IOException {
        this.b.readFully(arr_b, v, v1);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean s(int v, boolean z) throws IOException {
        return this.b.s(v, z);
    }
}

