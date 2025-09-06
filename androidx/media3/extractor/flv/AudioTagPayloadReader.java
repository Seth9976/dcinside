package androidx.media3.extractor.flv;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil.Config;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;

final class AudioTagPayloadReader extends TagPayloadReader {
    private boolean b;
    private boolean c;
    private int d;
    private static final int e = 2;
    private static final int f = 7;
    private static final int g = 8;
    private static final int h = 10;
    private static final int i = 0;
    private static final int j = 1;
    private static final int[] k;

    static {
        AudioTagPayloadReader.k = new int[]{5512, 11025, 22050, 44100};
    }

    public AudioTagPayloadReader(TrackOutput trackOutput0) {
        super(trackOutput0);
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(ParsableByteArray parsableByteArray0) throws UnsupportedFormatException {
        if(!this.b) {
            int v = parsableByteArray0.L();
            int v1 = v >> 4 & 15;
            this.d = v1;
            if(v1 == 2) {
                int v2 = AudioTagPayloadReader.k[v >> 2 & 3];
                Format format0 = new Builder().o0("audio/mpeg").N(1).p0(v2).K();
                this.a.d(format0);
                this.c = true;
            }
            else {
                switch(v1) {
                    case 7: 
                    case 8: {
                        Format format1 = new Builder().o0((v1 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw")).N(1).p0(8000).K();
                        this.a.d(format1);
                        this.c = true;
                        break;
                    }
                    case 10: {
                        break;
                    }
                    default: {
                        throw new UnsupportedFormatException("Audio format not supported: " + this.d);
                    }
                }
            }
            this.b = true;
            return true;
        }
        parsableByteArray0.Z(1);
        return true;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(ParsableByteArray parsableByteArray0, long v) throws ParserException {
        if(this.d == 2) {
            int v1 = parsableByteArray0.a();
            this.a.b(parsableByteArray0, v1);
            this.a.f(v, 1, v1, 0, null);
            return true;
        }
        int v2 = parsableByteArray0.L();
        if(v2 == 0 && !this.c) {
            int v3 = parsableByteArray0.a();
            byte[] arr_b = new byte[v3];
            parsableByteArray0.n(arr_b, 0, v3);
            Config aacUtil$Config0 = AacUtil.f(arr_b);
            Format format0 = new Builder().o0("audio/mp4a-latm").O(aacUtil$Config0.c).N(aacUtil$Config0.b).p0(aacUtil$Config0.a).b0(Collections.singletonList(arr_b)).K();
            this.a.d(format0);
            this.c = true;
            return false;
        }
        if(this.d == 10 && v2 != 1) {
            return false;
        }
        int v4 = parsableByteArray0.a();
        this.a.b(parsableByteArray0, v4);
        this.a.f(v, 1, v4, 0, null);
        return true;
    }

    @Override  // androidx.media3.extractor.flv.TagPayloadReader
    public void d() {
    }
}

