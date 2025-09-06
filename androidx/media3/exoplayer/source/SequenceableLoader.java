package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;

@UnstableApi
public interface SequenceableLoader {
    public interface Callback {
        void l(SequenceableLoader arg1);
    }

    boolean a();

    long d();

    void e(long arg1);

    boolean f(LoadingInfo arg1);

    long g();
}

