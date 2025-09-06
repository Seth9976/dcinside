package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

@UnstableApi
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override  // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata b(MetadataInputBuffer metadataInputBuffer0, ByteBuffer byteBuffer0) {
        return new Metadata(new Entry[]{this.c(new ParsableByteArray(byteBuffer0.array(), byteBuffer0.limit()))});
    }

    public EventMessage c(ParsableByteArray parsableByteArray0) {
        return new EventMessage(((String)Assertions.g(parsableByteArray0.F())), ((String)Assertions.g(parsableByteArray0.F())), parsableByteArray0.E(), parsableByteArray0.E(), Arrays.copyOfRange(parsableByteArray0.e(), parsableByteArray0.f(), parsableByteArray0.g()));
    }
}

