package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

@UnstableApi
public interface VideoRendererEventListener {
    public static final class EventDispatcher {
        @Nullable
        private final Handler a;
        @Nullable
        private final VideoRendererEventListener b;

        public EventDispatcher(@Nullable Handler handler0, @Nullable VideoRendererEventListener videoRendererEventListener0) {
            this.a = videoRendererEventListener0 == null ? null : ((Handler)Assertions.g(handler0));
            this.b = videoRendererEventListener0;
        }

        public void A(Object object0) {
            if(this.a != null) {
                q q0 = () -> this.b.v(object0, SystemClock.elapsedRealtime());
                this.a.post(q0);
            }
        }

        public void B(long v, int v1) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.o(v, v1));
            }
        }

        public void C(Exception exception0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.t(exception0));
            }
        }

        public void D(VideoSize videoSize0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.a(videoSize0));
            }
        }

        public void k(String s, long v, long v1) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.p(s, v, v1));
            }
        }

        public void l(String s) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.f(s));
            }
        }

        public void m(DecoderCounters decoderCounters0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.z(decoderCounters0));
            }
        }

        public void n(int v, long v1) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.m(v, v1));
            }
        }

        public void o(DecoderCounters decoderCounters0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.j(decoderCounters0));
            }
        }

        public void p(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.y(format0, decoderReuseEvaluation0));
            }
        }

        // 检测为 Lambda 实现
        private void q(String s, long v, long v1) [...]

        // 检测为 Lambda 实现
        private void r(String s) [...]

        // 检测为 Lambda 实现
        private void s(DecoderCounters decoderCounters0) [...]

        // 检测为 Lambda 实现
        private void t(int v, long v1) [...]

        // 检测为 Lambda 实现
        private void u(DecoderCounters decoderCounters0) [...]

        // 检测为 Lambda 实现
        private void v(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) [...]

        // 检测为 Lambda 实现
        private void w(Object object0, long v) [...]

        // 检测为 Lambda 实现
        private void x(long v, int v1) [...]

        // 检测为 Lambda 实现
        private void y(Exception exception0) [...]

        // 检测为 Lambda 实现
        private void z(VideoSize videoSize0) [...]
    }

    void a(VideoSize arg1);

    void f(String arg1);

    void j(DecoderCounters arg1);

    void m(int arg1, long arg2);

    void o(long arg1, int arg2);

    void p(String arg1, long arg2, long arg3);

    void t(Exception arg1);

    void v(Object arg1, long arg2);

    void y(Format arg1, @Nullable DecoderReuseEvaluation arg2);

    void z(DecoderCounters arg1);
}

