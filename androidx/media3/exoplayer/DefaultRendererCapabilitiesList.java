package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.Arrays;

@UnstableApi
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    public static final class Factory implements androidx.media3.exoplayer.RendererCapabilitiesList.Factory {
        private final RenderersFactory a;

        public Factory(Context context0) {
            this.a = new DefaultRenderersFactory(context0);
        }

        public Factory(RenderersFactory renderersFactory0) {
            this.a = renderersFactory0;
        }

        @Override  // androidx.media3.exoplayer.RendererCapabilitiesList$Factory
        public RendererCapabilitiesList a() {
            return this.d();
        }

        public static void b(Metadata metadata0) {
        }

        public static void c(CueGroup cueGroup0) {
        }

        public DefaultRendererCapabilitiesList d() {
            Handler handler0 = Util.J();
            androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1 defaultRendererCapabilitiesList$Factory$10 = new VideoRendererEventListener() {
                final Factory a;

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void a(VideoSize videoSize0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void f(String s) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void j(DecoderCounters decoderCounters0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void m(int v, long v1) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void o(long v, int v1) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void p(String s, long v, long v1) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void t(Exception exception0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void v(Object object0, long v) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void y(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
                public void z(DecoderCounters decoderCounters0) {
                }
            };
            androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2 defaultRendererCapabilitiesList$Factory$20 = new AudioRendererEventListener() {
                final Factory a;

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void B(int v, long v1, long v2) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void d(boolean z) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void e(Exception exception0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void g(String s) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void h(String s, long v, long v1) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void i(DecoderCounters decoderCounters0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void k(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void l(DecoderCounters decoderCounters0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void n(Exception exception0) {
                }

                @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public void s(long v) {
                }
            };
            k k0 = new k();
            l l0 = new l();
            return new DefaultRendererCapabilitiesList(this.a.a(handler0, defaultRendererCapabilitiesList$Factory$10, defaultRendererCapabilitiesList$Factory$20, k0, l0), null);
        }

        private static void e(CueGroup cueGroup0) {
        }

        private static void f(Metadata metadata0) {
        }
    }

    private final Renderer[] a;

    private DefaultRendererCapabilitiesList(Renderer[] arr_renderer) {
        this.a = (Renderer[])Arrays.copyOf(arr_renderer, arr_renderer.length);
        for(int v = 0; v < arr_renderer.length; ++v) {
            this.a[v].v(v, PlayerId.d, Clock.a);
        }
    }

    DefaultRendererCapabilitiesList(Renderer[] arr_renderer, androidx.media3.exoplayer.DefaultRendererCapabilitiesList.1 defaultRendererCapabilitiesList$10) {
        this(arr_renderer);
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] a() {
        RendererCapabilities[] arr_rendererCapabilities = new RendererCapabilities[this.a.length];
        for(int v = 0; true; ++v) {
            Renderer[] arr_renderer = this.a;
            if(v >= arr_renderer.length) {
                break;
            }
            arr_rendererCapabilities[v] = arr_renderer[v].B();
        }
        return arr_rendererCapabilities;
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        Renderer[] arr_renderer = this.a;
        for(int v = 0; v < arr_renderer.length; ++v) {
            arr_renderer[v].release();
        }
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.a.length;
    }

    class androidx.media3.exoplayer.DefaultRendererCapabilitiesList.1 {
    }

}

