package androidx.media3.exoplayer.metadata;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import java.util.ArrayList;
import java.util.List;
import w4.e;

@UnstableApi
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    @Nullable
    private Metadata A;
    private long B;
    private static final String C = "MetadataRenderer";
    private static final int D = 1;
    private final MetadataDecoderFactory r;
    private final MetadataOutput s;
    @Nullable
    private final Handler t;
    private final MetadataInputBuffer u;
    private final boolean v;
    @Nullable
    private MetadataDecoder w;
    private boolean x;
    private boolean y;
    private long z;

    public MetadataRenderer(MetadataOutput metadataOutput0, @Nullable Looper looper0) {
        this(metadataOutput0, looper0, MetadataDecoderFactory.a);
    }

    public MetadataRenderer(MetadataOutput metadataOutput0, @Nullable Looper looper0, MetadataDecoderFactory metadataDecoderFactory0) {
        this(metadataOutput0, looper0, metadataDecoderFactory0, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput0, @Nullable Looper looper0, MetadataDecoderFactory metadataDecoderFactory0, boolean z) {
        super(5);
        this.s = (MetadataOutput)Assertions.g(metadataOutput0);
        this.t = looper0 == null ? null : Util.G(looper0, this);
        this.r = (MetadataDecoderFactory)Assertions.g(metadataDecoderFactory0);
        this.v = z;
        this.u = new MetadataInputBuffer();
        this.B = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void R() {
        this.A = null;
        this.w = null;
        this.B = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void U(long v, boolean z) {
        this.A = null;
        this.x = false;
        this.y = false;
    }

    // 去混淆评级： 低(26)
    @Override  // androidx.media3.exoplayer.RendererCapabilities
    public int a(Format format0) {
        if(this.r.a(format0)) {
            return format0.K == 0 ? 0x84 : 130;
        }
        return 0x80;
    }

    @Override  // androidx.media3.exoplayer.BaseRenderer
    protected void a0(Format[] arr_format, long v, long v1, MediaPeriodId mediaSource$MediaPeriodId0) {
        this.w = this.r.b(arr_format[0]);
        Metadata metadata0 = this.A;
        if(metadata0 != null) {
            this.A = metadata0.d(metadata0.b + this.B - v1);
        }
        this.B = v1;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.y;
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public void d(long v, long v1) {
        for(boolean z = true; z; z = this.j0(v)) {
            this.k0();
        }
    }

    private void f0(Metadata metadata0, List list0) {
        for(int v = 0; v < metadata0.f(); ++v) {
            Format format0 = metadata0.e(v).h1();
            if(format0 == null || !this.r.a(format0)) {
                list0.add(metadata0.e(v));
            }
            else {
                MetadataDecoder metadataDecoder0 = this.r.b(format0);
                byte[] arr_b = (byte[])Assertions.g(metadata0.e(v).E0());
                this.u.f();
                this.u.r(arr_b.length);
                this.u.d.put(arr_b);
                this.u.s();
                Metadata metadata1 = metadataDecoder0.a(this.u);
                if(metadata1 != null) {
                    this.f0(metadata1, list0);
                }
            }
        }
    }

    @e
    private long g0(long v) {
        boolean z = false;
        Assertions.i(v != 0x8000000000000001L);
        if(this.B != 0x8000000000000001L) {
            z = true;
        }
        Assertions.i(z);
        return v - this.B;
    }

    @Override  // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return "MetadataRenderer";
    }

    private void h0(Metadata metadata0) {
        Handler handler0 = this.t;
        if(handler0 != null) {
            handler0.obtainMessage(1, metadata0).sendToTarget();
            return;
        }
        this.i0(metadata0);
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        if(message0.what != 1) {
            throw new IllegalStateException();
        }
        this.i0(((Metadata)message0.obj));
        return true;
    }

    private void i0(Metadata metadata0) {
        this.s.x(metadata0);
    }

    @Override  // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    private boolean j0(long v) {
        boolean z;
        Metadata metadata0 = this.A;
        if(metadata0 == null) {
            z = false;
        }
        else if(!this.v) {
            long v1 = this.g0(v);
            if(metadata0.b > v1) {
                z = false;
                goto label_12;
            }
            goto label_7;
        }
        else {
        label_7:
            this.h0(this.A);
            this.A = null;
            z = true;
        }
    label_12:
        if(this.x && this.A == null) {
            this.y = true;
        }
        return z;
    }

    private void k0() {
        if(!this.x && this.A == null) {
            this.u.f();
            FormatHolder formatHolder0 = this.K();
            int v = this.c0(formatHolder0, this.u, 0);
            if(v == -4) {
                if(this.u.j()) {
                    this.x = true;
                    return;
                }
                if(this.u.f >= this.M()) {
                    this.u.m = this.z;
                    this.u.s();
                    Metadata metadata0 = this.w.a(this.u);
                    if(metadata0 != null) {
                        ArrayList arrayList0 = new ArrayList(metadata0.f());
                        this.f0(metadata0, arrayList0);
                        if(!arrayList0.isEmpty()) {
                            this.A = new Metadata(this.g0(this.u.f), arrayList0);
                        }
                    }
                }
            }
            else if(v == -5) {
                this.z = ((Format)Assertions.g(formatHolder0.b)).s;
            }
        }
    }
}

