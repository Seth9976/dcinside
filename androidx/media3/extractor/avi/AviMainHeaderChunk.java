package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;

final class AviMainHeaderChunk implements AviChunk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private static final int e = 16;

    private AviMainHeaderChunk(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public boolean a() {
        return (this.b & 16) == 16;
    }

    public static AviMainHeaderChunk b(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.w();
        parsableByteArray0.Z(8);
        int v1 = parsableByteArray0.w();
        int v2 = parsableByteArray0.w();
        parsableByteArray0.Z(4);
        int v3 = parsableByteArray0.w();
        parsableByteArray0.Z(12);
        return new AviMainHeaderChunk(v, v1, v2, v3);
    }

    @Override  // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 1751742049;
    }
}

