package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ForwardingExtractorInput;

final class StartOffsetExtractorInput extends ForwardingExtractorInput {
    private final long c;

    public StartOffsetExtractorInput(ExtractorInput extractorInput0, long v) {
        super(extractorInput0);
        Assertions.a(extractorInput0.getPosition() >= v);
        this.c = v;
    }

    @Override  // androidx.media3.extractor.ForwardingExtractorInput
    public long getLength() {
        return super.getLength() - this.c;
    }

    @Override  // androidx.media3.extractor.ForwardingExtractorInput
    public long getPosition() {
        return super.getPosition() - this.c;
    }

    @Override  // androidx.media3.extractor.ForwardingExtractorInput
    public void h(long v, Throwable throwable0) throws Throwable {
        super.h(v + this.c, throwable0);
    }

    @Override  // androidx.media3.extractor.ForwardingExtractorInput
    public long p() {
        return super.p() - this.c;
    }
}

