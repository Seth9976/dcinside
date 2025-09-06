package androidx.media3.exoplayer;

import O1.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink.Builder;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder.Factory;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@UnstableApi
public class DefaultRenderersFactory implements RenderersFactory {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ExtensionRendererMode {
    }

    private final Context a;
    private final DefaultMediaCodecAdapterFactory b;
    private int c;
    private long d;
    private boolean e;
    private MediaCodecSelector f;
    private boolean g;
    private boolean h;
    public static final long i = 5000L;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 50;
    private static final String n = "DefaultRenderersFactory";

    public DefaultRenderersFactory(Context context0) {
        this.a = context0;
        this.b = new DefaultMediaCodecAdapterFactory(context0);
        this.c = 0;
        this.d = 5000L;
        this.f = MediaCodecSelector.a;
    }

    @Override  // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] a(Handler handler0, VideoRendererEventListener videoRendererEventListener0, AudioRendererEventListener audioRendererEventListener0, TextOutput textOutput0, MetadataOutput metadataOutput0) {
        ArrayList arrayList0 = new ArrayList();
        this.i(this.a, this.c, this.f, this.e, handler0, videoRendererEventListener0, this.d, arrayList0);
        AudioSink audioSink0 = this.c(this.a, this.g, this.h);
        if(audioSink0 != null) {
            this.b(this.a, this.c, this.f, this.e, audioSink0, handler0, audioRendererEventListener0, arrayList0);
        }
        Looper looper0 = handler0.getLooper();
        this.h(this.a, textOutput0, looper0, this.c, arrayList0);
        Looper looper1 = handler0.getLooper();
        this.f(this.a, metadataOutput0, looper1, this.c, arrayList0);
        this.d(this.a, this.c, arrayList0);
        this.e(arrayList0);
        return (Renderer[])arrayList0.toArray(new Renderer[0]);
    }

    protected void b(Context context0, int v, MediaCodecSelector mediaCodecSelector0, boolean z, AudioSink audioSink0, Handler handler0, AudioRendererEventListener audioRendererEventListener0, ArrayList arrayList0) {
        int v4;
        int v3;
        int v2;
        int v1;
        Class class0 = AudioSink.class;
        Class class1 = AudioRendererEventListener.class;
        Class class2 = Handler.class;
        arrayList0.add(new MediaCodecAudioRenderer(context0, this.m(), mediaCodecSelector0, z, handler0, audioRendererEventListener0, audioSink0));
        if(v == 0) {
            return;
        }
        try {
            v1 = v == 2 ? arrayList0.size() - 1 : arrayList0.size();
            Renderer renderer0 = (Renderer)Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context0);
            v2 = v1 + 1;
            try {
                arrayList0.add(v1, renderer0);
                Log.h("DefaultRenderersFactory", "Loaded MidiRenderer.");
            }
            catch(ClassNotFoundException unused_ex) {
                v1 = v2;
                v2 = v1;
            }
        }
        catch(ClassNotFoundException unused_ex) {
            v2 = v1;
        }
        catch(Exception exception0) {
            throw new RuntimeException("Error instantiating MIDI extension", exception0);
        }
        try {
            Renderer renderer1 = (Renderer)Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(class2, class1, class0).newInstance(handler0, audioRendererEventListener0, audioSink0);
            v3 = v2 + 1;
            try {
                arrayList0.add(v2, renderer1);
                Log.h("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            }
            catch(ClassNotFoundException unused_ex) {
                v2 = v3;
                v3 = v2;
            }
        }
        catch(ClassNotFoundException unused_ex) {
            v3 = v2;
        }
        catch(Exception exception1) {
            throw new RuntimeException("Error instantiating Opus extension", exception1);
        }
        try {
            Renderer renderer2 = (Renderer)Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(class2, class1, class0).newInstance(handler0, audioRendererEventListener0, audioSink0);
            v4 = v3 + 1;
            try {
                arrayList0.add(v3, renderer2);
                Log.h("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            }
            catch(ClassNotFoundException unused_ex) {
                v3 = v4;
                v4 = v3;
            }
        }
        catch(ClassNotFoundException unused_ex) {
            v4 = v3;
        }
        catch(Exception exception2) {
            throw new RuntimeException("Error instantiating FLAC extension", exception2);
        }
        try {
            arrayList0.add(v4, ((Renderer)Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(class2, class1, class0).newInstance(handler0, audioRendererEventListener0, audioSink0)));
            Log.h("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(Exception exception3) {
            throw new RuntimeException("Error instantiating FFmpeg extension", exception3);
        }
    }

    @Nullable
    protected AudioSink c(Context context0, boolean z, boolean z1) {
        return new Builder(context0).p(z).o(z1).i();
    }

    protected void d(Context context0, int v, ArrayList arrayList0) {
        arrayList0.add(new CameraMotionRenderer());
    }

    protected void e(ArrayList arrayList0) {
        arrayList0.add(new ImageRenderer(Factory.a, null));
    }

    protected void f(Context context0, MetadataOutput metadataOutput0, Looper looper0, int v, ArrayList arrayList0) {
        arrayList0.add(new MetadataRenderer(metadataOutput0, looper0));
    }

    protected void g(Context context0, Handler handler0, int v, ArrayList arrayList0) {
    }

    protected void h(Context context0, TextOutput textOutput0, Looper looper0, int v, ArrayList arrayList0) {
        arrayList0.add(new TextRenderer(textOutput0, looper0));
    }

    protected void i(Context context0, int v, MediaCodecSelector mediaCodecSelector0, boolean z, Handler handler0, VideoRendererEventListener videoRendererEventListener0, long v1, ArrayList arrayList0) {
        int v4;
        int v3;
        int v2;
        Class class0 = VideoRendererEventListener.class;
        Class class1 = Handler.class;
        arrayList0.add(new MediaCodecVideoRenderer(context0, this.m(), mediaCodecSelector0, v1, z, handler0, videoRendererEventListener0, 50));
        if(v == 0) {
            return;
        }
        try {
            v2 = v == 2 ? arrayList0.size() - 1 : arrayList0.size();
            Renderer renderer0 = (Renderer)Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, class1, class0, Integer.TYPE).newInstance(v1, handler0, videoRendererEventListener0, 50);
            v3 = v2 + 1;
            try {
                arrayList0.add(v2, renderer0);
                Log.h("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            }
            catch(ClassNotFoundException unused_ex) {
                v2 = v3;
                v3 = v2;
            }
        }
        catch(ClassNotFoundException unused_ex) {
            v3 = v2;
        }
        catch(Exception exception0) {
            throw new RuntimeException("Error instantiating VP9 extension", exception0);
        }
        try {
            Renderer renderer1 = (Renderer)Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, class1, class0, Integer.TYPE).newInstance(v1, handler0, videoRendererEventListener0, 50);
            v4 = v3 + 1;
            try {
                arrayList0.add(v3, renderer1);
                Log.h("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            }
            catch(ClassNotFoundException unused_ex) {
                v3 = v4;
                v4 = v3;
            }
        }
        catch(ClassNotFoundException unused_ex) {
            v4 = v3;
        }
        catch(Exception exception1) {
            throw new RuntimeException("Error instantiating AV1 extension", exception1);
        }
        try {
            arrayList0.add(v4, ((Renderer)Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, class1, class0, Integer.TYPE).newInstance(v1, handler0, videoRendererEventListener0, 50)));
            Log.h("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(Exception exception2) {
            throw new RuntimeException("Error instantiating FFmpeg extension", exception2);
        }
    }

    @a
    public final DefaultRenderersFactory j(boolean z) {
        this.b.b(z);
        return this;
    }

    @a
    public final DefaultRenderersFactory k() {
        this.b.c();
        return this;
    }

    @a
    public final DefaultRenderersFactory l() {
        this.b.d();
        return this;
    }

    protected androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory m() {
        return this.b;
    }

    @a
    public final DefaultRenderersFactory n(long v) {
        this.d = v;
        return this;
    }

    @a
    public final DefaultRenderersFactory o(boolean z) {
        this.g = z;
        return this;
    }

    @a
    public final DefaultRenderersFactory p(boolean z) {
        this.h = z;
        return this;
    }

    @a
    public final DefaultRenderersFactory q(boolean z) {
        this.e = z;
        return this;
    }

    @a
    public final DefaultRenderersFactory r(int v) {
        this.c = v;
        return this;
    }

    @a
    public final DefaultRenderersFactory s(MediaCodecSelector mediaCodecSelector0) {
        this.f = mediaCodecSelector0;
        return this;
    }
}

