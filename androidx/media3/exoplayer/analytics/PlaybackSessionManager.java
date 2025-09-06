package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;

@UnstableApi
public interface PlaybackSessionManager {
    public interface Listener {
        void E(EventTime arg1, String arg2, boolean arg3);

        void a(EventTime arg1, String arg2, String arg3);

        void x0(EventTime arg1, String arg2);

        void z0(EventTime arg1, String arg2);
    }

    void a(EventTime arg1);

    void b(Listener arg1);

    void c(EventTime arg1, int arg2);

    @Nullable
    String d();

    String e(Timeline arg1, MediaPeriodId arg2);

    boolean f(EventTime arg1, String arg2);

    void g(EventTime arg1);

    void h(EventTime arg1);
}

