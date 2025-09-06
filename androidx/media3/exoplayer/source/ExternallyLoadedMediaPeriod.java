package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.base.f;
import com.google.common.util.concurrent.C0;
import com.google.common.util.concurrent.e0;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.t0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class ExternallyLoadedMediaPeriod implements MediaPeriod {
    final class SampleStreamImpl implements SampleStream {
        private int a;
        final ExternallyLoadedMediaPeriod b;
        private static final int c = 0;
        private static final int d = 1;
        private static final int e = 2;

        public SampleStreamImpl() {
            this.a = 0;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            Throwable throwable0 = (Throwable)ExternallyLoadedMediaPeriod.this.f.get();
            if(throwable0 != null) {
                throw new IOException(throwable0);
            }
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ExternallyLoadedMediaPeriod.this.e.get();
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            int v1 = this.a;
            if(v1 == 2) {
                decoderInputBuffer0.e(4);
                return -4;
            }
            if((v & 2) == 0 && v1 != 0) {
                if(!ExternallyLoadedMediaPeriod.this.e.get()) {
                    return -3;
                }
                byte[] arr_b = ExternallyLoadedMediaPeriod.this.d;
                decoderInputBuffer0.e(1);
                decoderInputBuffer0.f = 0L;
                if((v & 4) == 0) {
                    decoderInputBuffer0.r(arr_b.length);
                    decoderInputBuffer0.d.put(ExternallyLoadedMediaPeriod.this.d, 0, arr_b.length);
                }
                if((v & 1) == 0) {
                    this.a = 2;
                }
                return -4;
            }
            formatHolder0.b = ExternallyLoadedMediaPeriod.this.c.c(0).c(0);
            this.a = 1;
            return -5;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            return 0;
        }
    }

    private final Uri a;
    private final ExternalLoader b;
    private final TrackGroupArray c;
    private final byte[] d;
    private final AtomicBoolean e;
    private final AtomicReference f;
    private t0 g;

    public ExternallyLoadedMediaPeriod(Uri uri0, String s, ExternalLoader externalLoader0) {
        this.a = uri0;
        Format format0 = new Builder().o0(s).K();
        this.b = externalLoader0;
        this.c = new TrackGroupArray(new TrackGroup[]{new TrackGroup(new Format[]{format0})});
        this.d = uri0.toString().getBytes(f.c);
        this.e = new AtomicBoolean();
        this.f = new AtomicReference();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return !this.e.get();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        return v;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        return this.e.get() ? 0x8000000000000000L : 0L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        return !this.e.get();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.e.get() ? 0x8000000000000000L : 0L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        return 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.c;
    }

    public void o() {
        t0 t00 = this.g;
        if(t00 != null) {
            t00.cancel(false);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        for(int v1 = 0; v1 < arr_exoTrackSelection.length; ++v1) {
            if(arr_sampleStream[v1] != null && (arr_exoTrackSelection[v1] == null || !arr_z[v1])) {
                arr_sampleStream[v1] = null;
            }
            if(arr_sampleStream[v1] == null && arr_exoTrackSelection[v1] != null) {
                arr_sampleStream[v1] = new SampleStreamImpl(this);
                arr_z1[v1] = true;
            }
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() {
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        mediaPeriod$Callback0.h(this);
        LoadRequest externalLoader$LoadRequest0 = new LoadRequest(this.a);
        t0 t00 = this.b.a(externalLoader$LoadRequest0);
        this.g = t00;
        h0.c(t00, new e0() {
            final ExternallyLoadedMediaPeriod a;

            @Override  // com.google.common.util.concurrent.e0
            public void onFailure(Throwable throwable0) {
                ExternallyLoadedMediaPeriod.this.f.set(throwable0);
            }

            @Override  // com.google.common.util.concurrent.e0
            public void onSuccess(@Nullable Object object0) {
                ExternallyLoadedMediaPeriod.this.e.set(true);
            }
        }, C0.c());
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
    }
}

