package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {
    private final SubtitleParser p;

    public DelegatingSubtitleDecoder(String s, SubtitleParser subtitleParser0) {
        super(s);
        this.p = subtitleParser0;
    }

    @Override  // androidx.media3.extractor.text.SimpleSubtitleDecoder
    protected Subtitle B(byte[] arr_b, int v, boolean z) {
        if(z) {
            this.p.reset();
        }
        return this.p.d(arr_b, 0, v);
    }
}

