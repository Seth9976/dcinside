package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import java.nio.ByteBuffer;

@UnstableApi
public final class CameraMotionRenderer extends BaseRenderer {
    private final DecoderInputBuffer r;
    private final ParsableByteArray s;
    private long t;
    @Nullable
    private CameraMotionListener u;
    private long v;
    private static final String w = "CameraMotionRenderer";
    private static final int x = 100000;

    public CameraMotionRenderer() {
        super(6);
        this.r = new DecoderInputBuffer(1);
        this.s = new ParsableByteArray();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.g0();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) {
        this.v = 0x8000000000000000L;
        this.g0();
    }

    // 去混淆评级： 中等(60)
    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int a(Format format0) {
        return "application/x-camera-motion".equals(format0.n) ? 0x84 : 0x80;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) {
        this.t = v1;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.h();
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) {
        while(!this.h() && this.v < v + 100000L) {
            this.r.f();
            boolean z = false;
            if(this.c0(this.K(), this.r, 0) != -4 || this.r.j()) {
                break;
            }
            this.v = this.r.f;
            if(this.r.f < this.M()) {
                z = true;
            }
            if(this.u != null && !z) {
                this.r.s();
                float[] arr_f = this.f0(this.r.d);
                if(arr_f != null) {
                    this.u.a(this.v - this.t, arr_f);
                }
            }
        }
    }

    @Nullable
    private float[] f0(ByteBuffer byteBuffer0) {
        if(byteBuffer0.remaining() != 16) {
            return null;
        }
        byte[] arr_b = byteBuffer0.array();
        this.s.W(arr_b, byteBuffer0.limit());
        int v = byteBuffer0.arrayOffset();
        this.s.Y(v + 4);
        float[] arr_f = new float[3];
        for(int v1 = 0; v1 < 3; ++v1) {
            arr_f[v1] = Float.intBitsToFloat(this.s.w());
        }
        return arr_f;
    }

    private void g0() {
        CameraMotionListener cameraMotionListener0 = this.u;
        if(cameraMotionListener0 != null) {
            cameraMotionListener0.j();
        }
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void k(int v, @Nullable Object object0) throws ExoPlaybackException {
        if(v == 8) {
            this.u = (CameraMotionListener)object0;
            return;
        }
        super.k(v, object0);
    }
}

