package androidx.media3.extractor.wav;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.f;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import java.util.Map;

public final class a implements ExtractorsFactory {
    @Override  // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory a(Factory subtitleParser$Factory0) {
        return this;
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory b(boolean z) {
        return this;
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] c(Uri uri0, Map map0) {
        return f.a(this, uri0, map0);
    }

    @Override  // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] d() {
        return WavExtractor.i();
    }
}

