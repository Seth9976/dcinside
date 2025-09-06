package androidx.compose.ui.text;

import androidx.compose.ui.text.caches.LruCache;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class TextLayoutCache {
    @l
    private final LruCache a;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public TextLayoutCache(int v) {
        this.a = new LruCache(v);
    }

    public TextLayoutCache(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    @m
    public final TextLayoutResult a(@l TextLayoutInput textLayoutInput0) {
        L.p(textLayoutInput0, "key");
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.a.g(cacheTextLayoutInput0);
        if(textLayoutResult0 == null) {
            return null;
        }
        return textLayoutResult0.w().i().c() ? null : textLayoutResult0;
    }

    @m
    public final TextLayoutResult b(@l TextLayoutInput textLayoutInput0, @l TextLayoutResult textLayoutResult0) {
        L.p(textLayoutInput0, "key");
        L.p(textLayoutResult0, "value");
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        return (TextLayoutResult)this.a.k(cacheTextLayoutInput0, textLayoutResult0);
    }

    @m
    public final TextLayoutResult c(@l TextLayoutInput textLayoutInput0) {
        L.p(textLayoutInput0, "key");
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        return (TextLayoutResult)this.a.m(cacheTextLayoutInput0);
    }
}

