package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import h4.d;
import h4.m;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

@UnstableApi
public class ImageRenderer extends BaseRenderer {
    static final class OutputStreamInfo {
        public final long a;
        public final long b;
        public static final OutputStreamInfo c;

        static {
            OutputStreamInfo.c = new OutputStreamInfo(0x8000000000000001L, 0x8000000000000001L);
        }

        public OutputStreamInfo(long v, long v1) {
            this.a = v;
            this.b = v1;
        }
    }

    static class TileInfo {
        private final int a;
        private final long b;
        private Bitmap c;

        public TileInfo(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public long a() {
            return this.b;
        }

        public Bitmap b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.c != null;
        }

        public void e(Bitmap bitmap0) {
            this.c = bitmap0;
        }
    }

    private int A;
    private Format B;
    private ImageDecoder C;
    private DecoderInputBuffer D;
    private ImageOutput E;
    private Bitmap F;
    private boolean G;
    private TileInfo H;
    private TileInfo I;
    private int J;
    private static final String K = "ImageRenderer";
    private static final int L = 0;
    private static final int M = 2;
    private static final int N = 3;
    private static final long O = 30000L;
    private final Factory r;
    private final DecoderInputBuffer s;
    private final ArrayDeque t;
    private boolean u;
    private boolean v;
    private OutputStreamInfo w;
    private long x;
    private long y;
    private int z;

    public ImageRenderer(Factory imageDecoder$Factory0, ImageOutput imageOutput0) {
        super(4);
        this.r = imageDecoder$Factory0;
        this.E = ImageRenderer.j0(imageOutput0);
        this.s = DecoderInputBuffer.u();
        this.w = OutputStreamInfo.c;
        this.t = new ArrayDeque();
        this.y = 0x8000000000000001L;
        this.x = 0x8000000000000001L;
        this.z = 0;
        this.A = 1;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.B = null;
        this.w = OutputStreamInfo.c;
        this.t.clear();
        this.q0();
        this.E.a();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void S(boolean z, boolean z1) throws ExoPlaybackException {
        this.A = z1;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) throws ExoPlaybackException {
        this.m0(1);
        this.v = false;
        this.u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        ImageDecoder imageDecoder0 = this.C;
        if(imageDecoder0 != null) {
            imageDecoder0.flush();
        }
        this.t.clear();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void V() {
        this.q0();
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void X() {
        this.q0();
        this.m0(1);
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int a(Format format0) {
        return this.r.a(format0);
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) throws ExoPlaybackException {
        super.a0(arr_format, v, v1, mediaSource$MediaPeriodId0);
        if(this.w.b != 0x8000000000000001L && (!this.t.isEmpty() || this.y != 0x8000000000000001L && (this.x == 0x8000000000000001L || this.x < this.y))) {
            OutputStreamInfo imageRenderer$OutputStreamInfo0 = new OutputStreamInfo(this.y, v1);
            this.t.add(imageRenderer$OutputStreamInfo0);
            return;
        }
        this.w = new OutputStreamInfo(0x8000000000000001L, v1);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.v;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) throws ExoPlaybackException {
        if(this.v) {
            return;
        }
        if(this.B == null) {
            FormatHolder formatHolder0 = this.K();
            this.s.f();
            int v2 = this.c0(formatHolder0, this.s, 2);
            if(v2 == -5) {
                this.B = (Format)Assertions.k(formatHolder0.b);
                this.k0();
                goto label_15;
            }
            if(v2 == -4) {
                Assertions.i(this.s.j());
                this.u = true;
                this.v = true;
            }
            return;
        }
        try {
        label_15:
            TraceUtil.a("drainAndFeedDecoder");
            while(true) {
                if(!this.h0(v, v1)) {
                    while(true) {
                        if(!this.i0(v)) {
                            TraceUtil.b();
                            return;
                        }
                    }
                }
            }
        }
        catch(ImageDecoderException imageDecoderException0) {
            throw this.G(imageDecoderException0, null, 4003);
        }
    }

    // 去混淆评级： 低(20)
    private boolean f0(Format format0) {
        int v = this.r.a(format0);
        return v == 0x84 || v == 0x83;
    }

    private Bitmap g0(int v) {
        Assertions.k(this.F);
        int v1 = this.F.getWidth() / ((Format)Assertions.k(this.B)).I;
        int v2 = this.F.getHeight() / ((Format)Assertions.k(this.B)).J;
        int v3 = this.B.I;
        return Bitmap.createBitmap(this.F, v % v3 * v1, v / v3 * v2, v1, v2);
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "ImageRenderer";
    }

    private boolean h0(long v, long v1) throws ImageDecoderException, ExoPlaybackException {
        if(this.F != null && this.H == null) {
            return false;
        }
        if(this.A == 0 && this.getState() != 2) {
            return false;
        }
        if(this.F == null) {
            Assertions.k(this.C);
            ImageOutputBuffer imageOutputBuffer0 = this.C.a();
            if(imageOutputBuffer0 == null) {
                return false;
            }
            if(((ImageOutputBuffer)Assertions.k(imageOutputBuffer0)).j()) {
                if(this.z == 3) {
                    this.q0();
                    Assertions.k(this.B);
                    this.k0();
                    return false;
                }
                ((ImageOutputBuffer)Assertions.k(imageOutputBuffer0)).p();
                if(this.t.isEmpty()) {
                    this.v = true;
                }
                return false;
            }
            Assertions.l(imageOutputBuffer0.e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.F = imageOutputBuffer0.e;
            ((ImageOutputBuffer)Assertions.k(imageOutputBuffer0)).p();
        }
        if(this.G && this.F != null && this.H != null) {
            Assertions.k(this.B);
            int v2 = this.B.I;
            boolean z = (v2 != 1 || this.B.J != 1) && v2 != -1 && this.B.J != -1;
            if(!this.H.d()) {
                this.H.e((z ? this.g0(this.H.c()) : ((Bitmap)Assertions.k(this.F))));
            }
            if(!this.p0(v, v1, ((Bitmap)Assertions.k(this.H.b())), this.H.a())) {
                return false;
            }
            this.o0(((TileInfo)Assertions.k(this.H)).a());
            this.A = 3;
            if(!z || ((TileInfo)Assertions.k(this.H)).c() == ((Format)Assertions.k(this.B)).J * ((Format)Assertions.k(this.B)).I - 1) {
                this.F = null;
            }
            this.H = this.I;
            this.I = null;
            return true;
        }
        return false;
    }

    private boolean i0(long v) throws ImageDecoderException {
        if(this.G && this.H != null) {
            return false;
        }
        FormatHolder formatHolder0 = this.K();
        ImageDecoder imageDecoder0 = this.C;
        if(imageDecoder0 != null && this.z != 3 && !this.u) {
            if(this.D == null) {
                DecoderInputBuffer decoderInputBuffer0 = (DecoderInputBuffer)imageDecoder0.d();
                this.D = decoderInputBuffer0;
                if(decoderInputBuffer0 == null) {
                    return false;
                }
            }
            if(this.z == 2) {
                Assertions.k(this.D);
                this.D.n(4);
                ((ImageDecoder)Assertions.k(this.C)).e(this.D);
                this.D = null;
                this.z = 3;
                return false;
            }
            switch(this.c0(formatHolder0, this.D, 0)) {
                case -5: {
                    this.B = (Format)Assertions.k(formatHolder0.b);
                    this.z = 2;
                    return true;
                }
                case -4: {
                    this.D.s();
                    boolean z = ((ByteBuffer)Assertions.k(this.D.d)).remaining() > 0 || ((DecoderInputBuffer)Assertions.k(this.D)).j();
                    if(z) {
                        ((ImageDecoder)Assertions.k(this.C)).e(((DecoderInputBuffer)Assertions.k(this.D)));
                        this.J = 0;
                    }
                    this.n0(v, ((DecoderInputBuffer)Assertions.k(this.D)));
                    if(((DecoderInputBuffer)Assertions.k(this.D)).j()) {
                        this.u = true;
                        this.D = null;
                        return false;
                    }
                    this.y = Math.max(this.y, ((DecoderInputBuffer)Assertions.k(this.D)).f);
                    if(z) {
                        this.D = null;
                        return !this.G;
                    }
                    ((DecoderInputBuffer)Assertions.k(this.D)).f();
                    return !this.G;
                }
                case -3: {
                    return false;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.A == 3 || this.A == 0 && this.G;
    }

    private static ImageOutput j0(ImageOutput imageOutput0) {
        return imageOutput0 == null ? ImageOutput.a : imageOutput0;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    public void k(int v, Object object0) throws ExoPlaybackException {
        if(v != 15) {
            super.k(v, object0);
            return;
        }
        this.r0((object0 instanceof ImageOutput ? ((ImageOutput)object0) : null));
    }

    @d({"decoder"})
    @m({"inputFormat"})
    private void k0() throws ExoPlaybackException {
        if(!this.f0(this.B)) {
            throw this.G(new ImageDecoderException("Provided decoder factory can\'t create decoder for format."), this.B, 4005);
        }
        ImageDecoder imageDecoder0 = this.C;
        if(imageDecoder0 != null) {
            imageDecoder0.release();
        }
        this.C = this.r.b();
    }

    private boolean l0(TileInfo imageRenderer$TileInfo0) {
        return ((Format)Assertions.k(this.B)).I == -1 || this.B.J == -1 || imageRenderer$TileInfo0.c() == ((Format)Assertions.k(this.B)).J * this.B.I - 1;
    }

    private void m0(int v) {
        this.A = Math.min(this.A, v);
    }

    private void n0(long v, DecoderInputBuffer decoderInputBuffer0) {
        boolean z = true;
        if(decoderInputBuffer0.j()) {
            this.G = true;
            return;
        }
        TileInfo imageRenderer$TileInfo0 = new TileInfo(this.J, decoderInputBuffer0.f);
        this.I = imageRenderer$TileInfo0;
        ++this.J;
        if(!this.G) {
            long v1 = imageRenderer$TileInfo0.a();
            boolean z1 = v1 - 30000L <= v && v <= v1 + 30000L;
            boolean z2 = this.H != null && this.H.a() <= v && v < v1;
            if(!z1 && !z2 && !this.l0(((TileInfo)Assertions.k(this.I)))) {
                z = false;
            }
            this.G = z;
            if(z2 && !z1) {
                return;
            }
        }
        this.H = this.I;
        this.I = null;
    }

    private void o0(long v) {
        this.x = v;
        while(!this.t.isEmpty() && v >= ((OutputStreamInfo)this.t.peek()).a) {
            this.w = (OutputStreamInfo)this.t.removeFirst();
        }
    }

    protected boolean p0(long v, long v1, Bitmap bitmap0, long v2) throws ExoPlaybackException {
        if(!this.s0() && v2 - v >= 30000L) {
            return false;
        }
        this.E.onImageAvailable(v2 - this.w.b, bitmap0);
        return true;
    }

    private void q0() {
        this.D = null;
        this.z = 0;
        this.y = 0x8000000000000001L;
        ImageDecoder imageDecoder0 = this.C;
        if(imageDecoder0 != null) {
            imageDecoder0.release();
            this.C = null;
        }
    }

    private void r0(ImageOutput imageOutput0) {
        this.E = ImageRenderer.j0(imageOutput0);
    }

    private boolean s0() {
        boolean z = this.getState() == 2;
        int v = this.A;
        switch(v) {
            case 0: {
                return z;
            }
            case 1: {
                return true;
            }
            default: {
                if(v != 3) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
    }
}

