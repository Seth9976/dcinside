package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

@UnstableApi
public interface MediaPeriod extends SequenceableLoader {
    public interface Callback extends androidx.media3.exoplayer.source.SequenceableLoader.Callback {
        void h(MediaPeriod arg1);
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    boolean a();

    long c(long arg1, SeekParameters arg2);

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    long d();

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    void e(long arg1);

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    boolean f(LoadingInfo arg1);

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    long g();

    List i(List arg1);

    long j(long arg1);

    long k();

    TrackGroupArray n();

    long q(ExoTrackSelection[] arg1, boolean[] arg2, SampleStream[] arg3, boolean[] arg4, long arg5);

    void s() throws IOException;

    void t(Callback arg1, long arg2);

    void v(long arg1, boolean arg2);
}

