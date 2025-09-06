package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.util.List;

@UnstableApi
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override  // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    @Deprecated
    public SequenceableLoader a(SequenceableLoader[] arr_sequenceableLoader) {
        return new CompositeSequenceableLoader(arr_sequenceableLoader);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader b(List list0, List list1) {
        return new CompositeSequenceableLoader(list0, list1);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader empty() {
        return new CompositeSequenceableLoader(O2.A(), O2.A());
    }
}

