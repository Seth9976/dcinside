package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

@UnstableApi
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    @Nullable
    private Subtitle e;
    private long f;

    @Override  // androidx.media3.extractor.text.Subtitle
    public long a(int v) {
        return ((Subtitle)Assertions.g(this.e)).a(v) + this.f;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int b() {
        return ((Subtitle)Assertions.g(this.e)).b();
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int c(long v) {
        return ((Subtitle)Assertions.g(this.e)).c(v - this.f);
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public List d(long v) {
        return ((Subtitle)Assertions.g(this.e)).d(v - this.f);
    }

    @Override  // androidx.media3.decoder.DecoderOutputBuffer
    public void f() {
        super.f();
        this.e = null;
    }

    public void r(long v, Subtitle subtitle0, long v1) {
        this.b = v;
        this.e = subtitle0;
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            v = v1;
        }
        this.f = v;
    }
}

