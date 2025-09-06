package androidx.media3.exoplayer.video;

import O1.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor.Factory;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph.Listener;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.base.Q;
import com.google.common.base.S;
import com.google.common.collect.O2;
import h4.d;
import h4.e;
import j..util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@RestrictTo({Scope.b})
@UnstableApi
public final class CompositingVideoSinkProvider implements Listener, VideoSinkProvider {
    public static final class Builder {
        private final Context a;
        private final VideoFrameReleaseControl b;
        private Factory c;
        private androidx.media3.common.PreviewingVideoGraph.Factory d;
        private Clock e;
        private boolean f;

        public Builder(Context context0, VideoFrameReleaseControl videoFrameReleaseControl0) {
            this.a = context0.getApplicationContext();
            this.b = videoFrameReleaseControl0;
            this.e = Clock.a;
        }

        public CompositingVideoSinkProvider e() {
            Assertions.i(!this.f);
            if(this.d == null) {
                if(this.c == null) {
                    this.c = new ReflectiveDefaultVideoFrameProcessorFactory(null);
                }
                this.d = new ReflectivePreviewingSingleInputVideoGraphFactory(this.c);
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider0 = new CompositingVideoSinkProvider(this, null);
            this.f = true;
            return compositingVideoSinkProvider0;
        }

        @a
        public Builder f(Clock clock0) {
            this.e = clock0;
            return this;
        }

        @a
        public Builder g(androidx.media3.common.PreviewingVideoGraph.Factory previewingVideoGraph$Factory0) {
            this.d = previewingVideoGraph$Factory0;
            return this;
        }

        @a
        public Builder h(Factory videoFrameProcessor$Factory0) {
            this.c = videoFrameProcessor$Factory0;
            return this;
        }
    }

    final class FrameRendererImpl implements FrameRenderer {
        final CompositingVideoSinkProvider a;

        private FrameRendererImpl() {
        }

        FrameRendererImpl(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.1 compositingVideoSinkProvider$10) {
        }

        @Override  // androidx.media3.exoplayer.video.VideoFrameRenderControl$FrameRenderer
        public void a(VideoSize videoSize0) {
            Format format0 = new androidx.media3.common.Format.Builder().v0(videoSize0.a).Y(videoSize0.b).o0("video/raw").K();
            CompositingVideoSinkProvider.this.h = format0;
            for(Object object0: CompositingVideoSinkProvider.this.g) {
                ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener)object0).h(CompositingVideoSinkProvider.this, videoSize0);
            }
        }

        @Override  // androidx.media3.exoplayer.video.VideoFrameRenderControl$FrameRenderer
        public void b(long v, long v1, long v2, boolean z) {
            if(z && CompositingVideoSinkProvider.this.l != null) {
                for(Object object0: CompositingVideoSinkProvider.this.g) {
                    ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener)object0).q(CompositingVideoSinkProvider.this);
                }
            }
            if(CompositingVideoSinkProvider.this.i != null) {
                Format format0 = CompositingVideoSinkProvider.this.h == null ? new androidx.media3.common.Format.Builder().K() : CompositingVideoSinkProvider.this.h;
                CompositingVideoSinkProvider.this.i.l(v1, CompositingVideoSinkProvider.this.f.nanoTime(), format0, null);
            }
            ((PreviewingVideoGraph)Assertions.k(CompositingVideoSinkProvider.this.k)).c(v);
        }

        @Override  // androidx.media3.exoplayer.video.VideoFrameRenderControl$FrameRenderer
        public void c() {
            for(Object object0: CompositingVideoSinkProvider.this.g) {
                ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener)object0).v(CompositingVideoSinkProvider.this);
            }
            ((PreviewingVideoGraph)Assertions.k(CompositingVideoSinkProvider.this.k)).c(-2L);
        }
    }

    public interface androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener {
        void h(CompositingVideoSinkProvider arg1, VideoSize arg2);

        void n(CompositingVideoSinkProvider arg1, VideoFrameProcessingException arg2);

        void q(CompositingVideoSinkProvider arg1);

        void v(CompositingVideoSinkProvider arg1);
    }

    static final class ReflectiveDefaultVideoFrameProcessorFactory implements Factory {
        private static final Q a;

        static {
            ReflectiveDefaultVideoFrameProcessorFactory.a = S.b(() -> try {
                Class class0 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (Factory)Assertions.g(class0.getMethod("build", null).invoke(class0.getConstructor(null).newInstance(null), null));
            }
            catch(Exception exception0) {
                throw new IllegalStateException(exception0);
            });
        }

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        ReflectiveDefaultVideoFrameProcessorFactory(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.1 compositingVideoSinkProvider$10) {
        }

        @Override  // androidx.media3.common.VideoFrameProcessor$Factory
        public VideoFrameProcessor a(Context context0, DebugViewProvider debugViewProvider0, ColorInfo colorInfo0, boolean z, Executor executor0, androidx.media3.common.VideoFrameProcessor.Listener videoFrameProcessor$Listener0) throws VideoFrameProcessingException {
            return ((Factory)ReflectiveDefaultVideoFrameProcessorFactory.a.get()).a(context0, debugViewProvider0, colorInfo0, z, executor0, videoFrameProcessor$Listener0);
        }

        // 检测为 Lambda 实现
        private static Factory c() [...]
    }

    static final class ReflectivePreviewingSingleInputVideoGraphFactory implements androidx.media3.common.PreviewingVideoGraph.Factory {
        private final Factory a;

        public ReflectivePreviewingSingleInputVideoGraphFactory(Factory videoFrameProcessor$Factory0) {
            this.a = videoFrameProcessor$Factory0;
        }

        @Override  // androidx.media3.common.PreviewingVideoGraph$Factory
        public PreviewingVideoGraph a(Context context0, ColorInfo colorInfo0, DebugViewProvider debugViewProvider0, Listener videoGraph$Listener0, Executor executor0, List list0, long v) throws VideoFrameProcessingException {
            try {
                return ((androidx.media3.common.PreviewingVideoGraph.Factory)Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(Factory.class).newInstance(this.a)).a(context0, colorInfo0, debugViewProvider0, videoGraph$Listener0, executor0, list0, v);
            }
            catch(Exception exception0) {
                throw VideoFrameProcessingException.a(exception0);
            }
        }
    }

    static final class ScaleAndRotateAccessor {
        private static Constructor a;
        private static Method b;
        private static Method c;

        public static Effect a(float f) {
            try {
                ScaleAndRotateAccessor.b();
                Object object0 = ScaleAndRotateAccessor.a.newInstance(null);
                ScaleAndRotateAccessor.b.invoke(object0, f);
                return (Effect)Assertions.g(ScaleAndRotateAccessor.c.invoke(object0, null));
            }
            catch(Exception exception0) {
                throw new IllegalStateException(exception0);
            }
        }

        @d({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod"})
        private static void b() throws NoSuchMethodException, ClassNotFoundException {
            if(ScaleAndRotateAccessor.a == null || ScaleAndRotateAccessor.b == null || ScaleAndRotateAccessor.c == null) {
                Class class0 = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                ScaleAndRotateAccessor.a = class0.getConstructor(null);
                ScaleAndRotateAccessor.b = class0.getMethod("setRotationDegrees", Float.TYPE);
                ScaleAndRotateAccessor.c = class0.getMethod("build", null);
            }
        }
    }

    final class VideoSinkImpl implements androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener, VideoSink {
        private final Context c;
        private final int d;
        private final ArrayList e;
        @Nullable
        private Effect f;
        private VideoFrameProcessor g;
        @Nullable
        private Format h;
        private int i;
        private long j;
        private long k;
        private boolean l;
        private long m;
        private long n;
        private boolean o;
        private long p;
        private androidx.media3.exoplayer.video.VideoSink.Listener q;
        private Executor r;
        final CompositingVideoSinkProvider s;

        public VideoSinkImpl(Context context0) {
            this.c = context0;
            this.d = Util.w0(context0);
            this.e = new ArrayList();
            this.m = 0x8000000000000001L;
            this.n = 0x8000000000000001L;
            this.q = androidx.media3.exoplayer.video.VideoSink.Listener.a;
            this.r = CompositingVideoSinkProvider.s;
        }

        // 检测为 Lambda 实现
        private void D(androidx.media3.exoplayer.video.VideoSink.Listener videoSink$Listener0, VideoFrameProcessingException videoFrameProcessingException0) [...]

        // 检测为 Lambda 实现
        private void E(androidx.media3.exoplayer.video.VideoSink.Listener videoSink$Listener0) [...]

        // 检测为 Lambda 实现
        private void F(androidx.media3.exoplayer.video.VideoSink.Listener videoSink$Listener0) [...]

        // 检测为 Lambda 实现
        private void G(androidx.media3.exoplayer.video.VideoSink.Listener videoSink$Listener0, VideoSize videoSize0) [...]

        private void H() {
            if(this.h == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            Effect effect0 = this.f;
            if(effect0 != null) {
                arrayList0.add(effect0);
            }
            arrayList0.addAll(this.e);
            Format format0 = (Format)Assertions.g(this.h);
            ((VideoFrameProcessor)Assertions.k(this.g)).h(this.i, arrayList0, new androidx.media3.common.FrameInfo.Builder(CompositingVideoSinkProvider.E(format0.A), format0.t, format0.u).e(format0.x).a());
            this.m = 0x8000000000000001L;
        }

        private boolean I() {
            long v = this.p;
            if(v == 0x8000000000000001L) {
                return true;
            }
            if(CompositingVideoSinkProvider.this.G(v)) {
                this.H();
                this.p = 0x8000000000000001L;
                return true;
            }
            return false;
        }

        private void J(long v) {
            if(this.l) {
                CompositingVideoSinkProvider.this.M(this.k, v, this.j);
                this.l = false;
            }
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void K(List list0) {
            if(this.e.equals(list0)) {
                return;
            }
            this.y(list0);
            this.H();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public Surface a() {
            Assertions.i(this.isInitialized());
            return ((VideoFrameProcessor)Assertions.k(this.g)).a();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.video.VideoSink
        public boolean b() {
            return this.isInitialized() && (this.m != 0x8000000000000001L && CompositingVideoSinkProvider.this.G(this.m));
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void c(Surface surface0, Size size0) {
            CompositingVideoSinkProvider.this.c(surface0, size0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void d(long v, long v1) throws VideoSinkException {
            try {
                CompositingVideoSinkProvider.this.O(v, v1);
            }
            catch(ExoPlaybackException exoPlaybackException0) {
                throw new VideoSinkException(exoPlaybackException0, (this.h == null ? new androidx.media3.common.Format.Builder().K() : this.h));
            }
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void e(VideoFrameMetadataListener videoFrameMetadataListener0) {
            CompositingVideoSinkProvider.this.Q(videoFrameMetadataListener0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void f() {
            CompositingVideoSinkProvider.this.c.a();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void g() {
            CompositingVideoSinkProvider.this.g();
        }

        @Override  // androidx.media3.exoplayer.video.CompositingVideoSinkProvider$Listener
        public void h(CompositingVideoSinkProvider compositingVideoSinkProvider0, VideoSize videoSize0) {
            this.r.execute(() -> this.q.d(this, videoSize0));
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public long i(long v, boolean z) {
            Assertions.i(this.isInitialized());
            Assertions.i(this.d != -1);
            long v1 = this.p;
            if(v1 != 0x8000000000000001L) {
                if(CompositingVideoSinkProvider.this.G(v1)) {
                    this.H();
                    this.p = 0x8000000000000001L;
                    goto label_9;
                }
                return 0x8000000000000001L;
            }
        label_9:
            if(((VideoFrameProcessor)Assertions.k(this.g)).j() >= this.d) {
                return 0x8000000000000001L;
            }
            if(!((VideoFrameProcessor)Assertions.k(this.g)).i()) {
                return 0x8000000000000001L;
            }
            long v2 = v - this.k;
            this.J(v2);
            this.n = v2;
            if(z) {
                this.m = v2;
            }
            return v * 1000L;
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        @e(expression = {"videoFrameProcessor"}, result = true)
        public boolean isInitialized() {
            return this.g != null;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return this.isInitialized() && CompositingVideoSinkProvider.this.J();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void j() {
            CompositingVideoSinkProvider.this.c.l();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void k(long v, long v1) {
            this.l |= this.j != v || this.k != v1;
            this.j = v;
            this.k = v1;
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void l(Format format0) throws VideoSinkException {
            Assertions.i(!this.isInitialized());
            this.g = CompositingVideoSinkProvider.this.H(format0);
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void m(boolean z) {
            CompositingVideoSinkProvider.this.c.h(z);
        }

        @Override  // androidx.media3.exoplayer.video.CompositingVideoSinkProvider$Listener
        public void n(CompositingVideoSinkProvider compositingVideoSinkProvider0, VideoFrameProcessingException videoFrameProcessingException0) {
            this.r.execute(() -> this.q.b(this, new VideoSinkException(videoFrameProcessingException0, ((Format)Assertions.k(this.h)))));
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public boolean o(Bitmap bitmap0, TimestampIterator timestampIterator0) {
            Assertions.i(this.isInitialized());
            boolean z = false;
            if(!this.I()) {
                return false;
            }
            if(!((VideoFrameProcessor)Assertions.k(this.g)).f(bitmap0, timestampIterator0)) {
                return false;
            }
            TimestampIterator timestampIterator1 = timestampIterator0.b();
            long v = timestampIterator1.next();
            long v1 = timestampIterator1.a() - this.k;
            if(v1 != 0x8000000000000001L) {
                z = true;
            }
            Assertions.i(z);
            this.J(v);
            this.n = v1;
            this.m = v1;
            return true;
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void p(@FloatRange(from = 0.0, fromInclusive = false) float f) {
            CompositingVideoSinkProvider.this.P(f);
        }

        @Override  // androidx.media3.exoplayer.video.CompositingVideoSinkProvider$Listener
        public void q(CompositingVideoSinkProvider compositingVideoSinkProvider0) {
            this.r.execute(() -> this.q.a(this));
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void r(androidx.media3.exoplayer.video.VideoSink.Listener videoSink$Listener0, Executor executor0) {
            this.q = videoSink$Listener0;
            this.r = executor0;
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            CompositingVideoSinkProvider.this.release();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void s(int v, Format format0) {
            Assertions.i(this.isInitialized());
            boolean z = true;
            if(v != 1 && v != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + v);
            }
            CompositingVideoSinkProvider.this.c.p(format0.v);
            if(v != 1 || Util.a >= 21) {
                this.f = null;
            }
            else {
                int v1 = format0.w;
                if(v1 == -1 || v1 == 0) {
                    this.f = null;
                }
                else if(this.f == null || (this.h == null || this.h.w != v1)) {
                    this.f = ScaleAndRotateAccessor.a(v1);
                }
            }
            this.i = v;
            this.h = format0;
            if(!this.o) {
                this.H();
                this.o = true;
                this.p = 0x8000000000000001L;
                return;
            }
            if(this.n == 0x8000000000000001L) {
                z = false;
            }
            Assertions.i(z);
            this.p = this.n;
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public boolean t() {
            return Util.g1(this.c);
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void u() {
            CompositingVideoSinkProvider.this.c.k();
        }

        @Override  // androidx.media3.exoplayer.video.CompositingVideoSinkProvider$Listener
        public void v(CompositingVideoSinkProvider compositingVideoSinkProvider0) {
            this.r.execute(() -> this.q.c(((VideoSink)Assertions.k(this))));
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void w() {
            CompositingVideoSinkProvider.this.c.g();
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void x(boolean z) {
            if(this.isInitialized()) {
                this.g.flush();
            }
            this.o = false;
            this.m = 0x8000000000000001L;
            this.n = 0x8000000000000001L;
            CompositingVideoSinkProvider.this.C();
            if(z) {
                CompositingVideoSinkProvider.this.c.m();
            }
        }

        @Override  // androidx.media3.exoplayer.video.VideoSink
        public void y(List list0) {
            this.e.clear();
            this.e.addAll(list0);
        }
    }

    private final Context a;
    private final VideoSinkImpl b;
    private final VideoFrameReleaseControl c;
    private final VideoFrameRenderControl d;
    private final androidx.media3.common.PreviewingVideoGraph.Factory e;
    private final Clock f;
    private final CopyOnWriteArraySet g;
    private Format h;
    private VideoFrameMetadataListener i;
    private HandlerWrapper j;
    private PreviewingVideoGraph k;
    @Nullable
    private Pair l;
    private int m;
    private int n;
    private long o;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final Executor s;

    static {
        CompositingVideoSinkProvider.s = new b();
    }

    private CompositingVideoSinkProvider(Builder compositingVideoSinkProvider$Builder0) {
        Context context0 = compositingVideoSinkProvider$Builder0.a;
        this.a = context0;
        VideoSinkImpl compositingVideoSinkProvider$VideoSinkImpl0 = new VideoSinkImpl(this, context0);
        this.b = compositingVideoSinkProvider$VideoSinkImpl0;
        Clock clock0 = compositingVideoSinkProvider$Builder0.e;
        this.f = clock0;
        VideoFrameReleaseControl videoFrameReleaseControl0 = compositingVideoSinkProvider$Builder0.b;
        this.c = videoFrameReleaseControl0;
        videoFrameReleaseControl0.o(clock0);
        this.d = new VideoFrameRenderControl(new FrameRendererImpl(this, null), videoFrameReleaseControl0);
        this.e = (androidx.media3.common.PreviewingVideoGraph.Factory)Assertions.k(compositingVideoSinkProvider$Builder0.d);
        this.g = new CopyOnWriteArraySet();
        this.n = 0;
        this.B(compositingVideoSinkProvider$VideoSinkImpl0);
    }

    CompositingVideoSinkProvider(Builder compositingVideoSinkProvider$Builder0, androidx.media3.exoplayer.video.CompositingVideoSinkProvider.1 compositingVideoSinkProvider$10) {
        this(compositingVideoSinkProvider$Builder0);
    }

    public void B(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener compositingVideoSinkProvider$Listener0) {
        this.g.add(compositingVideoSinkProvider$Listener0);
    }

    private void C() {
        if(!this.I()) {
            return;
        }
        ++this.m;
        this.d.b();
        ((HandlerWrapper)Assertions.k(this.j)).k(() -> {
            int v = this.m - 1;
            this.m = v;
            if(v > 0) {
                return;
            }
            if(v < 0) {
                throw new IllegalStateException(String.valueOf(this.m));
            }
            this.d.b();
        });
    }

    // 检测为 Lambda 实现
    private void D() [...]

    private static ColorInfo E(@Nullable ColorInfo colorInfo0) {
        return colorInfo0 == null || !colorInfo0.h() ? ColorInfo.h : colorInfo0;
    }

    @Nullable
    public Surface F() {
        return this.l == null ? null : ((Surface)this.l.first);
    }

    private boolean G(long v) {
        return this.m == 0 && this.d.d(v);
    }

    private VideoFrameProcessor H(Format format0) throws VideoSinkException {
        Assertions.i(this.n == 0);
        ColorInfo colorInfo0 = CompositingVideoSinkProvider.E(format0.A);
        if(colorInfo0.c == 7 && Util.a < 34) {
            colorInfo0 = colorInfo0.a().e(6).a();
        }
        Looper looper0 = (Looper)Assertions.k(Looper.myLooper());
        HandlerWrapper handlerWrapper0 = this.f.c(looper0, null);
        this.j = handlerWrapper0;
        try {
            Objects.requireNonNull(handlerWrapper0);
            androidx.media3.exoplayer.video.a a0 = new androidx.media3.exoplayer.video.a(handlerWrapper0);
            this.k = this.e.a(this.a, colorInfo0, DebugViewProvider.a, this, a0, O2.A(), 0L);
            Pair pair0 = this.l;
            if(pair0 != null) {
                Surface surface0 = (Surface)pair0.first;
                Size size0 = (Size)pair0.second;
                this.L(surface0, size0.b(), size0.a());
            }
            this.k.e(0);
        }
        catch(VideoFrameProcessingException videoFrameProcessingException0) {
            throw new VideoSinkException(videoFrameProcessingException0, format0);
        }
        this.n = 1;
        return this.k.a(0);
    }

    private boolean I() {
        return this.n == 1;
    }

    private boolean J() {
        return this.m == 0 && this.d.e();
    }

    private static void K(Runnable runnable0) {
    }

    private void L(@Nullable Surface surface0, int v, int v1) {
        if(this.k != null) {
            SurfaceInfo surfaceInfo0 = surface0 == null ? null : new SurfaceInfo(surface0, v, v1);
            this.k.b(surfaceInfo0);
            this.c.q(surface0);
        }
    }

    private void M(long v, long v1, long v2) {
        this.o = v;
        this.d.j(v1, v2);
    }

    public void N(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener compositingVideoSinkProvider$Listener0) {
        this.g.remove(compositingVideoSinkProvider$Listener0);
    }

    public void O(long v, long v1) throws ExoPlaybackException {
        if(this.m == 0) {
            this.d.k(v, v1);
        }
    }

    private void P(float f) {
        this.d.m(f);
    }

    private void Q(VideoFrameMetadataListener videoFrameMetadataListener0) {
        this.i = videoFrameMetadataListener0;
    }

    @Override  // androidx.media3.common.VideoGraph$Listener
    public void a(VideoFrameProcessingException videoFrameProcessingException0) {
        for(Object object0: this.g) {
            ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener)object0).n(this, videoFrameProcessingException0);
        }
    }

    @Override  // androidx.media3.common.VideoGraph$Listener
    public void b(long v) {
        if(this.m > 0) {
            return;
        }
        this.d.h(v - this.o);
    }

    @Override  // androidx.media3.exoplayer.video.VideoSinkProvider
    public void c(Surface surface0, Size size0) {
        if(this.l != null && ((Surface)this.l.first).equals(surface0) && ((Size)this.l.second).equals(size0)) {
            return;
        }
        this.l = Pair.create(surface0, size0);
        this.L(surface0, size0.b(), size0.a());
    }

    @Override  // androidx.media3.common.VideoGraph$Listener
    public void d(int v, int v1) {
        this.d.i(v, v1);
    }

    @Override  // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoFrameReleaseControl e() {
        return this.c;
    }

    @Override  // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink f() {
        return this.b;
    }

    @Override  // androidx.media3.exoplayer.video.VideoSinkProvider
    public void g() {
        this.L(null, Size.c.b(), Size.c.a());
        this.l = null;
    }

    @Override  // androidx.media3.common.VideoGraph$Listener
    public void h(long v) {
        throw new UnsupportedOperationException();
    }

    public static void j(Runnable runnable0) {
    }

    @Override  // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if(this.n == 2) {
            return;
        }
        HandlerWrapper handlerWrapper0 = this.j;
        if(handlerWrapper0 != null) {
            handlerWrapper0.f(null);
        }
        PreviewingVideoGraph previewingVideoGraph0 = this.k;
        if(previewingVideoGraph0 != null) {
            previewingVideoGraph0.release();
        }
        this.l = null;
        this.n = 2;
    }

    class androidx.media3.exoplayer.video.CompositingVideoSinkProvider.1 {
    }

}

