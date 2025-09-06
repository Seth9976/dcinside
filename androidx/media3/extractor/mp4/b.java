package androidx.media3.extractor.mp4;

import com.google.common.base.t;

public final class b implements t {
    public final FragmentedMp4Extractor a;

    public b(FragmentedMp4Extractor fragmentedMp4Extractor0) {
        this.a = fragmentedMp4Extractor0;
    }

    @Override  // com.google.common.base.t
    public final Object apply(Object object0) {
        return this.a.s(((Track)object0));
    }
}

