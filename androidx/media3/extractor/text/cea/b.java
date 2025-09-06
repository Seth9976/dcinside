package androidx.media3.extractor.text.cea;

import androidx.media3.decoder.DecoderOutputBuffer.Owner;
import androidx.media3.decoder.DecoderOutputBuffer;

public final class b implements Owner {
    public final CeaDecoder a;

    public b(CeaDecoder ceaDecoder0) {
        this.a = ceaDecoder0;
    }

    @Override  // androidx.media3.decoder.DecoderOutputBuffer$Owner
    public final void a(DecoderOutputBuffer decoderOutputBuffer0) {
        this.a.p(((CeaOutputBuffer)decoderOutputBuffer0));
    }
}

