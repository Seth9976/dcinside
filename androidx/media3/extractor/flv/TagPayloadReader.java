package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.TrackOutput;

abstract class TagPayloadReader {
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String s) {
            super(s, null, false, 1);
        }
    }

    protected final TrackOutput a;

    protected TagPayloadReader(TrackOutput trackOutput0) {
        this.a = trackOutput0;
    }

    // 去混淆评级： 低(20)
    public final boolean a(ParsableByteArray parsableByteArray0, long v) throws ParserException {
        return this.b(parsableByteArray0) && this.c(parsableByteArray0, v);
    }

    protected abstract boolean b(ParsableByteArray arg1) throws ParserException;

    protected abstract boolean c(ParsableByteArray arg1, long arg2) throws ParserException;

    public abstract void d();
}

