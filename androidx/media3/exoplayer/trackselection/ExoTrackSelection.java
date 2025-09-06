package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

@UnstableApi
public interface ExoTrackSelection extends TrackSelection {
    public static final class Definition {
        public final TrackGroup a;
        public final int[] b;
        public final int c;
        private static final String d = "ETSDefinition";

        public Definition(TrackGroup trackGroup0, int[] arr_v) {
            this(trackGroup0, arr_v, 0);
        }

        public Definition(TrackGroup trackGroup0, int[] arr_v, int v) {
            if(arr_v.length == 0) {
                Log.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = trackGroup0;
            this.b = arr_v;
            this.c = v;
        }
    }

    public interface Factory {
        ExoTrackSelection[] a(Definition[] arg1, BandwidthMeter arg2, MediaPeriodId arg3, Timeline arg4);
    }

    long a();

    boolean b(int arg1, long arg2);

    void c();

    int d();

    boolean f(int arg1, long arg2);

    void g();

    boolean j(long arg1, Chunk arg2, List arg3);

    void k();

    int l(long arg1, List arg2);

    int m();

    Format n();

    void o();

    void r(long arg1, long arg2, long arg3, List arg4, MediaChunkIterator[] arg5);

    void s(float arg1);

    @Nullable
    Object t();

    void u(boolean arg1);

    int v();
}

