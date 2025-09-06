package androidx.media3.extractor.flv;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.TrackOutput;

final class VideoTagPayloadReader extends TagPayloadReader {
    private final ParsableByteArray b;
    private final ParsableByteArray c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;
    private static final int h = 7;
    private static final int i = 1;
    private static final int j = 5;
    private static final int k = 0;
    private static final int l = 1;

    public VideoTagPayloadReader(TrackOutput trackOutput0) {
        super(trackOutput0);
        this.b = new ParsableByteArray(NalUnitUtil.j);
        this.c = new ParsableByteArray(4);
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(ParsableByteArray parsableByteArray0) throws UnsupportedFormatException {
        int v = parsableByteArray0.L();
        int v1 = v >> 4 & 15;
        if((v & 15) != 7) {
            throw new UnsupportedFormatException("Video format not supported: " + (v & 15));
        }
        this.g = v1;
        return v1 != 5;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(ParsableByteArray parsableByteArray0, long v) throws ParserException {
        int v1 = parsableByteArray0.L();
        long v2 = v + ((long)parsableByteArray0.t()) * 1000L;
        if(v1 == 0 && !this.e) {
            ParsableByteArray parsableByteArray1 = new ParsableByteArray(new byte[parsableByteArray0.a()]);
            parsableByteArray0.n(parsableByteArray1.e(), 0, parsableByteArray0.a());
            AvcConfig avcConfig0 = AvcConfig.b(parsableByteArray1);
            this.d = avcConfig0.b;
            Format format0 = new Builder().o0("video/avc").O(avcConfig0.l).v0(avcConfig0.c).Y(avcConfig0.d).k0(avcConfig0.k).b0(avcConfig0.a).K();
            this.a.d(format0);
            this.e = true;
            return false;
        }
        if(v1 == 1 && this.e) {
            int v3 = this.g == 1 ? 1 : 0;
            if(!this.f && v3 == 0) {
                return false;
            }
            byte[] arr_b = this.c.e();
            arr_b[0] = 0;
            arr_b[1] = 0;
            arr_b[2] = 0;
            int v4 = 4 - this.d;
            int v5;
            for(v5 = 0; parsableByteArray0.a() > 0; v5 = v5 + 4 + v6) {
                parsableByteArray0.n(this.c.e(), v4, this.d);
                this.c.Y(0);
                int v6 = this.c.P();
                this.b.Y(0);
                this.a.b(this.b, 4);
                this.a.b(parsableByteArray0, v6);
            }
            this.a.f(v2, v3, v5, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    public void d() {
        this.f = false;
    }
}

