package androidx.media3.exoplayer.video;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;

final class VideoFrameRenderControl {
    interface FrameRenderer {
        void a(VideoSize arg1);

        void b(long arg1, long arg2, long arg3, boolean arg4);

        void c();
    }

    private final FrameRenderer a;
    private final VideoFrameReleaseControl b;
    private final FrameReleaseInfo c;
    private final TimedValueQueue d;
    private final TimedValueQueue e;
    private final LongArrayQueue f;
    @Nullable
    private VideoSize g;
    private VideoSize h;
    private long i;
    private long j;

    public VideoFrameRenderControl(FrameRenderer videoFrameRenderControl$FrameRenderer0, VideoFrameReleaseControl videoFrameReleaseControl0) {
        this.a = videoFrameRenderControl$FrameRenderer0;
        this.b = videoFrameReleaseControl0;
        this.c = new FrameReleaseInfo();
        this.d = new TimedValueQueue();
        this.e = new TimedValueQueue();
        this.f = new LongArrayQueue();
        this.h = VideoSize.i;
        this.j = 0x8000000000000001L;
    }

    private void a() {
        Assertions.k(this.f.g());
        this.a.c();
    }

    public void b() {
        this.f.c();
        this.j = 0x8000000000000001L;
        if(this.e.l() > 0) {
            Long long0 = (Long)VideoFrameRenderControl.c(this.e);
            long0.longValue();
            this.e.a(0L, long0);
        }
        if(this.g != null) {
            this.d.c();
        }
        else if(this.d.l() > 0) {
            this.g = (VideoSize)VideoFrameRenderControl.c(this.d);
        }
    }

    private static Object c(TimedValueQueue timedValueQueue0) {
        Assertions.a(timedValueQueue0.l() > 0);
        while(timedValueQueue0.l() > 1) {
            timedValueQueue0.i();
        }
        return Assertions.g(timedValueQueue0.i());
    }

    public boolean d(long v) {
        return this.j != 0x8000000000000001L && this.j >= v;
    }

    public boolean e() {
        return this.b.d(true);
    }

    private boolean f(long v) {
        Long long0 = (Long)this.e.j(v);
        if(long0 != null && ((long)long0) != this.i) {
            this.i = (long)long0;
            return true;
        }
        return false;
    }

    private boolean g(long v) {
        VideoSize videoSize0 = (VideoSize)this.d.j(v);
        if(videoSize0 == null) {
            return false;
        }
        if(!videoSize0.equals(VideoSize.i) && !videoSize0.equals(this.h)) {
            this.h = videoSize0;
            return true;
        }
        return false;
    }

    public void h(long v) {
        VideoSize videoSize0 = this.g;
        if(videoSize0 != null) {
            this.d.a(v, videoSize0);
            this.g = null;
        }
        this.f.a(v);
    }

    public void i(int v, int v1) {
        VideoSize videoSize0 = new VideoSize(v, v1);
        if(!Util.g(this.g, videoSize0)) {
            this.g = videoSize0;
        }
    }

    public void j(long v, long v1) {
        this.e.a(v, v1);
    }

    public void k(long v, long v1) throws ExoPlaybackException {
        while(!this.f.f()) {
            long v2 = this.f.e();
            if(this.f(v2)) {
                this.b.j();
            }
            int v3 = this.b.c(v2, v, v1, this.i, false, this.c);
            boolean z = true;
            if(v3 != 0 && v3 != 1) {
                switch(v3) {
                    case 2: 
                    case 3: 
                    case 4: {
                        this.j = v2;
                        this.a();
                        continue;
                    }
                    case 5: {
                        return;
                    }
                    default: {
                        throw new IllegalStateException(String.valueOf(v3));
                    }
                }
            }
            this.j = v2;
            if(v3 != 0) {
                z = false;
            }
            this.l(z);
        }
    }

    private void l(boolean z) {
        long v = (long)(((Long)Assertions.k(this.f.g())));
        if(this.g(v)) {
            this.a.a(this.h);
        }
        long v1 = this.i;
        boolean z1 = this.b.i();
        this.a.b((z ? -1L : this.c.g()), v, v1, z1);
    }

    public void m(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        Assertions.a(f > 0.0f);
        this.b.r(f);
    }
}

