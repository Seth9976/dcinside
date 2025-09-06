package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class ChunkHolder {
    @Nullable
    public Chunk a;
    public boolean b;

    public void a() {
        this.a = null;
        this.b = false;
    }
}

