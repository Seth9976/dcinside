package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

@UnstableApi
public interface AudioRendererEventListener {
    public static final class EventDispatcher {
        @Nullable
        private final Handler a;
        @Nullable
        private final AudioRendererEventListener b;

        public EventDispatcher(@Nullable Handler handler0, @Nullable AudioRendererEventListener audioRendererEventListener0) {
            this.a = audioRendererEventListener0 == null ? null : ((Handler)Assertions.g(handler0));
            this.b = audioRendererEventListener0;
        }

        // 检测为 Lambda 实现
        private void A(String s) [...]

        // 检测为 Lambda 实现
        private void B(DecoderCounters decoderCounters0) [...]

        // 检测为 Lambda 实现
        private void C(DecoderCounters decoderCounters0) [...]

        // 检测为 Lambda 实现
        private void D(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) [...]

        // 检测为 Lambda 实现
        private void E(long v) [...]

        // 检测为 Lambda 实现
        private void F(boolean z) [...]

        // 检测为 Lambda 实现
        private void G(int v, long v1, long v2) [...]

        public void H(long v) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> ((AudioRendererEventListener)Util.o(this.b)).s(v));
            }
        }

        public void I(boolean z) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.d(z));
            }
        }

        public void J(int v, long v1, long v2) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.B(v, v1, v2));
            }
        }

        public void m(Exception exception0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.n(exception0));
            }
        }

        public void n(Exception exception0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.e(exception0));
            }
        }

        public void o(AudioTrackConfig audioSink$AudioTrackConfig0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.b(audioSink$AudioTrackConfig0));
            }
        }

        public void p(AudioTrackConfig audioSink$AudioTrackConfig0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> ((AudioRendererEventListener)Util.o(this.b)).c(audioSink$AudioTrackConfig0));
            }
        }

        public void q(String s, long v, long v1) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.h(s, v, v1));
            }
        }

        public void r(String s) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.g(s));
            }
        }

        public void s(DecoderCounters decoderCounters0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.l(decoderCounters0));
            }
        }

        public void t(DecoderCounters decoderCounters0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.i(decoderCounters0));
            }
        }

        public void u(Format format0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                handler0.post(() -> this.b.k(format0, decoderReuseEvaluation0));
            }
        }

        // 检测为 Lambda 实现
        private void v(Exception exception0) [...]

        // 检测为 Lambda 实现
        private void w(Exception exception0) [...]

        // 检测为 Lambda 实现
        private void x(AudioTrackConfig audioSink$AudioTrackConfig0) [...]

        // 检测为 Lambda 实现
        private void y(AudioTrackConfig audioSink$AudioTrackConfig0) [...]

        // 检测为 Lambda 实现
        private void z(String s, long v, long v1) [...]
    }

    void B(int arg1, long arg2, long arg3);

    void b(AudioTrackConfig arg1);

    void c(AudioTrackConfig arg1);

    void d(boolean arg1);

    void e(Exception arg1);

    void g(String arg1);

    void h(String arg1, long arg2, long arg3);

    void i(DecoderCounters arg1);

    void k(Format arg1, @Nullable DecoderReuseEvaluation arg2);

    void l(DecoderCounters arg1);

    void n(Exception arg1);

    void s(long arg1);
}

