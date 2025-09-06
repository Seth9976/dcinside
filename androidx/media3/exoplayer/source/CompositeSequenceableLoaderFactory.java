package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
public interface CompositeSequenceableLoaderFactory {
    @Deprecated
    SequenceableLoader a(SequenceableLoader[] arg1);

    SequenceableLoader b(List arg1, List arg2);

    SequenceableLoader empty();
}

