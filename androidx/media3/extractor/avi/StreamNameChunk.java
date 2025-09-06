package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;

final class StreamNameChunk implements AviChunk {
    public final String a;

    private StreamNameChunk(String s) {
        this.a = s;
    }

    public static StreamNameChunk a(ParsableByteArray parsableByteArray0) {
        return new StreamNameChunk(parsableByteArray0.I(parsableByteArray0.a()));
    }

    @Override  // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 0x6E727473;
    }
}

