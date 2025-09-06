package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.ParsingLoadable.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@UnstableApi
public final class FilteringManifestParser implements Parser {
    private final Parser a;
    @Nullable
    private final List b;

    public FilteringManifestParser(Parser parsingLoadable$Parser0, @Nullable List list0) {
        this.a = parsingLoadable$Parser0;
        this.b = list0;
    }

    @Override  // androidx.media3.exoplayer.upstream.ParsingLoadable$Parser
    public Object a(Uri uri0, InputStream inputStream0) throws IOException {
        return this.b(uri0, inputStream0);
    }

    public FilterableManifest b(Uri uri0, InputStream inputStream0) throws IOException {
        FilterableManifest filterableManifest0 = (FilterableManifest)this.a.a(uri0, inputStream0);
        return this.b == null || this.b.isEmpty() ? filterableManifest0 : ((FilterableManifest)filterableManifest0.a(this.b));
    }
}

