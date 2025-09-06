package androidx.media3.exoplayer.text;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.common.collect.O2;
import h4.m;
import j..util.Objects;
import java.nio.ByteBuffer;
import w4.e;

@UnstableApi
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    @Nullable
    private SubtitleOutputBuffer A;
    private int B;
    @Nullable
    private final Handler C;
    private final TextOutput D;
    private final FormatHolder E;
    private boolean F;
    private boolean G;
    @Nullable
    private Format H;
    private long I;
    private long J;
    private long K;
    private boolean L;
    private static final String M = "TextRenderer";
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 1;
    private final CueDecoder r;
    private final DecoderInputBuffer s;
    private CuesResolver t;
    private final SubtitleDecoderFactory u;
    private boolean v;
    private int w;
    @Nullable
    private SubtitleDecoder x;
    @Nullable
    private SubtitleInputBuffer y;
    @Nullable
    private SubtitleOutputBuffer z;

    public TextRenderer(TextOutput textOutput0, @Nullable Looper looper0) {
        this(textOutput0, looper0, SubtitleDecoderFactory.a);
    }

    public TextRenderer(TextOutput textOutput0, @Nullable Looper looper0, SubtitleDecoderFactory subtitleDecoderFactory0) {
        super(3);
        this.D = (TextOutput)Assertions.g(textOutput0);
        this.C = looper0 == null ? null : Util.G(looper0, this);
        this.u = subtitleDecoderFactory0;
        this.r = new CueDecoder();
        this.s = new DecoderInputBuffer(1);
        this.E = new FormatHolder();
        this.K = 0x8000000000000001L;
        this.I = 0x8000000000000001L;
        this.J = 0x8000000000000001L;
        this.L = false;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.H = null;
        this.K = 0x8000000000000001L;
        this.g0();
        this.I = 0x8000000000000001L;
        this.J = 0x8000000000000001L;
        if(this.x != null) {
            this.r0();
        }
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) {
        this.J = v;
        CuesResolver cuesResolver0 = this.t;
        if(cuesResolver0 != null) {
            cuesResolver0.clear();
        }
        this.g0();
        this.F = false;
        this.G = false;
        this.K = 0x8000000000000001L;
        if(this.H != null && !TextRenderer.o0(this.H)) {
            if(this.w != 0) {
                this.u0();
                return;
            }
            this.q0();
            SubtitleDecoder subtitleDecoder0 = (SubtitleDecoder)Assertions.g(this.x);
            subtitleDecoder0.flush();
            subtitleDecoder0.c(this.M());
        }
    }

    // 去混淆评级： 低(43)
    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int a(Format format0) {
        if(!TextRenderer.o0(format0) && !this.u.a(format0)) {
            return MimeTypes.t(format0.n) ? 0x81 : 0x80;
        }
        return format0.K == 0 ? 0x84 : 130;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) {
        this.I = v1;
        this.H = arr_format[0];
        if(!TextRenderer.o0(arr_format[0])) {
            this.f0();
            if(this.x != null) {
                this.w = 1;
                return;
            }
            this.m0();
            return;
        }
        MergingCuesResolver mergingCuesResolver0 = this.H.H == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
        this.t = mergingCuesResolver0;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.G;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) {
        if(this.p() && (this.K != 0x8000000000000001L && v >= this.K)) {
            this.q0();
            this.G = true;
        }
        if(this.G) {
            return;
        }
        if(TextRenderer.o0(((Format)Assertions.g(this.H)))) {
            Assertions.g(this.t);
            this.s0(v);
            return;
        }
        this.f0();
        this.t0(v);
    }

    // 去混淆评级： 低(20)
    @m({"streamFormat"})
    private void f0() {
        Assertions.j(this.L || Objects.equals(this.H.n, "application/cea-608") || Objects.equals(this.H.n, "application/x-mp4-cea-608") || Objects.equals(this.H.n, "application/cea-708"), "Legacy decoding is disabled, can\'t handle " + this.H.n + " samples (expected " + "application/x-media3-cues" + ").");
    }

    private void g0() {
        this.w0(new CueGroup(O2.A(), this.k0(this.J)));
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "TextRenderer";
    }

    @Deprecated
    public void h0(boolean z) {
        this.L = z;
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        if(message0.what != 1) {
            throw new IllegalStateException();
        }
        this.n0(((CueGroup)message0.obj));
        return true;
    }

    @m({"subtitle"})
    @e
    private long i0(long v) {
        int v1 = this.z.c(v);
        if(v1 != 0 && this.z.b() != 0) {
            return v1 == -1 ? this.z.a(this.z.b() - 1) : this.z.a(v1 - 1);
        }
        return this.z.b;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    private long j0() {
        if(this.B == -1) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        Assertions.g(this.z);
        return this.B >= this.z.b() ? 0x7FFFFFFFFFFFFFFFL : this.z.a(this.B);
    }

    @e
    private long k0(long v) {
        boolean z = false;
        Assertions.i(v != 0x8000000000000001L);
        if(this.I != 0x8000000000000001L) {
            z = true;
        }
        Assertions.i(z);
        return v - this.I;
    }

    private void l0(SubtitleDecoderException subtitleDecoderException0) {
        Log.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, subtitleDecoderException0);
        this.g0();
        this.u0();
    }

    private void m0() {
        this.v = true;
        Format format0 = (Format)Assertions.g(this.H);
        SubtitleDecoder subtitleDecoder0 = this.u.b(format0);
        this.x = subtitleDecoder0;
        subtitleDecoder0.c(this.M());
    }

    private void n0(CueGroup cueGroup0) {
        this.D.r(cueGroup0.a);
        this.D.w(cueGroup0);
    }

    @e
    private static boolean o0(Format format0) {
        return Objects.equals(format0.n, "application/x-media3-cues");
    }

    @m({"this.cuesResolver"})
    private boolean p0(long v) {
        if(this.F) {
            return false;
        }
        if(this.c0(this.E, this.s, 0) != -4) {
            return false;
        }
        if(this.s.j()) {
            this.F = true;
            return false;
        }
        this.s.s();
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(this.s.d);
        long v1 = this.s.f;
        byte[] arr_b = byteBuffer0.array();
        int v2 = byteBuffer0.arrayOffset();
        CuesWithTiming cuesWithTiming0 = this.r.b(v1, arr_b, v2, byteBuffer0.limit());
        this.s.f();
        return this.t.d(cuesWithTiming0, v);
    }

    private void q0() {
        this.y = null;
        this.B = -1;
        SubtitleOutputBuffer subtitleOutputBuffer0 = this.z;
        if(subtitleOutputBuffer0 != null) {
            subtitleOutputBuffer0.p();
            this.z = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer1 = this.A;
        if(subtitleOutputBuffer1 != null) {
            subtitleOutputBuffer1.p();
            this.A = null;
        }
    }

    private void r0() {
        this.q0();
        ((SubtitleDecoder)Assertions.g(this.x)).release();
        this.x = null;
        this.w = 0;
    }

    @m({"this.cuesResolver"})
    private void s0(long v) {
        boolean z = this.p0(v);
        long v1 = this.t.b(this.J);
        int v2 = Long.compare(v1, 0x8000000000000000L);
        if(v2 == 0 && this.F && !z) {
            this.G = true;
        }
        if(v2 != 0 && v1 <= v) {
            z = true;
        }
        if(z) {
            O2 o20 = this.t.a(v);
            long v3 = this.t.e(v);
            this.w0(new CueGroup(o20, this.k0(v3)));
            this.t.c(v3);
        }
        this.J = v;
    }

    private void t0(long v) {
        this.J = v;
        if(this.A == null) {
            ((SubtitleDecoder)Assertions.g(this.x)).f(v);
            try {
                this.A = (SubtitleOutputBuffer)((SubtitleDecoder)Assertions.g(this.x)).a();
            }
            catch(SubtitleDecoderException subtitleDecoderException0) {
                this.l0(subtitleDecoderException0);
                return;
            }
        }
        if(this.getState() != 2) {
            return;
        }
        if(this.z == null) {
            z = false;
        }
        else {
            long v1 = this.j0();
            boolean z;
            for(z = false; v1 <= v; z = true) {
                ++this.B;
                v1 = this.j0();
            }
        }
        SubtitleOutputBuffer subtitleOutputBuffer0 = this.A;
        if(subtitleOutputBuffer0 != null) {
            if(!subtitleOutputBuffer0.j()) {
                if(subtitleOutputBuffer0.b <= v) {
                    SubtitleOutputBuffer subtitleOutputBuffer1 = this.z;
                    if(subtitleOutputBuffer1 != null) {
                        subtitleOutputBuffer1.p();
                    }
                    this.B = subtitleOutputBuffer0.c(v);
                    this.z = subtitleOutputBuffer0;
                    this.A = null;
                    z = true;
                }
            }
            else if(!z && this.j0() == 0x7FFFFFFFFFFFFFFFL) {
                if(this.w == 2) {
                    this.u0();
                }
                else {
                    this.q0();
                    this.G = true;
                }
            }
        }
        if(z) {
            Assertions.g(this.z);
            long v2 = this.k0(this.i0(v));
            this.w0(new CueGroup(this.z.d(v), v2));
        }
        if(this.w == 2) {
            return;
        }
        while(!this.F) {
            try {
                SubtitleInputBuffer subtitleInputBuffer0 = this.y;
                if(subtitleInputBuffer0 == null) {
                    subtitleInputBuffer0 = (SubtitleInputBuffer)((SubtitleDecoder)Assertions.g(this.x)).d();
                    if(subtitleInputBuffer0 == null) {
                        return;
                    }
                    this.y = subtitleInputBuffer0;
                }
                if(this.w == 1) {
                    subtitleInputBuffer0.n(4);
                    ((SubtitleDecoder)Assertions.g(this.x)).b(subtitleInputBuffer0);
                    this.y = null;
                    this.w = 2;
                    return;
                }
                int v3 = this.c0(this.E, subtitleInputBuffer0, 0);
                if(v3 == -4) {
                    if(subtitleInputBuffer0.j()) {
                        this.F = true;
                        this.v = false;
                    }
                    else {
                        Format format0 = this.E.b;
                        if(format0 == null) {
                            return;
                        }
                        subtitleInputBuffer0.m = format0.s;
                        subtitleInputBuffer0.s();
                        this.v &= !subtitleInputBuffer0.l();
                    }
                    if(this.v) {
                        continue;
                    }
                    ((SubtitleDecoder)Assertions.g(this.x)).b(subtitleInputBuffer0);
                    this.y = null;
                    continue;
                }
                if(v3 == -3) {
                    return;
                }
            }
            catch(SubtitleDecoderException subtitleDecoderException1) {
                this.l0(subtitleDecoderException1);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    private void u0() {
        this.r0();
        this.m0();
    }

    public void v0(long v) {
        Assertions.i(this.p());
        this.K = v;
    }

    private void w0(CueGroup cueGroup0) {
        Handler handler0 = this.C;
        if(handler0 != null) {
            handler0.obtainMessage(1, cueGroup0).sendToTarget();
            return;
        }
        this.n0(cueGroup0);
    }
}

