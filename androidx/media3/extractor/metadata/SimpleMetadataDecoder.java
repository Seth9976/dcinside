package androidx.media3.extractor.metadata;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override  // androidx.media3.extractor.metadata.MetadataDecoder
    @Nullable
    public final Metadata a(MetadataInputBuffer metadataInputBuffer0) {
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(metadataInputBuffer0.d);
        Assertions.a(byteBuffer0.position() == 0 && byteBuffer0.hasArray() && byteBuffer0.arrayOffset() == 0);
        return this.b(metadataInputBuffer0, byteBuffer0);
    }

    @Nullable
    protected abstract Metadata b(MetadataInputBuffer arg1, ByteBuffer arg2);
}

