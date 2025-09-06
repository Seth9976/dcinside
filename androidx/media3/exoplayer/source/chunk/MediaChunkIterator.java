package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

@UnstableApi
public interface MediaChunkIterator {
    public static final MediaChunkIterator a;

    static {
        MediaChunkIterator.a = new MediaChunkIterator() {
            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public long a() {
                throw new NoSuchElementException();
            }

            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public boolean b() {
                return true;
            }

            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public long c() {
                throw new NoSuchElementException();
            }

            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public DataSpec d() {
                throw new NoSuchElementException();
            }

            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public boolean next() {
                return false;
            }

            @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
            public void reset() {
            }
        };
    }

    long a();

    boolean b();

    long c();

    DataSpec d();

    boolean next();

    void reset();
}

