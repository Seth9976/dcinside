package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.UnstableApi;
import java.util.NoSuchElementException;

@UnstableApi
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private final long b;
    private final long c;
    private long d;

    public BaseMediaChunkIterator(long v, long v1) {
        this.b = v;
        this.c = v1;
        this.reset();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean b() {
        return this.d > this.c;
    }

    protected final void e() {
        if(this.d < this.b || this.d > this.c) {
            throw new NoSuchElementException();
        }
    }

    protected final long f() {
        return this.d;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean next() {
        ++this.d;
        return !this.b();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
    public void reset() {
        this.d = this.b - 1L;
    }
}

