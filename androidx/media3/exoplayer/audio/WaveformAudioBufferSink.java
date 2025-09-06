package androidx.media3.exoplayer.audio;

import android.util.SparseArray;
import androidx.annotation.FloatRange;
import androidx.media3.common.audio.AudioMixingUtil;
import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.ChannelMixingMatrix;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.H;
import java.nio.ByteBuffer;

@UnstableApi
public class WaveformAudioBufferSink implements AudioBufferSink {
    public interface Listener {
        void a(int arg1, WaveformBar arg2);
    }

    public static class WaveformBar {
        private float a;
        private float b;
        private double c;
        private int d;

        public WaveformBar() {
            this.a = 1.0f;
            this.b = -1.0f;
        }

        public void a(@FloatRange(from = -1.0, to = 1.0) float f) {
            H.d(f >= -1.0f && f <= 1.0f);
            this.a = Math.min(this.a, f);
            this.b = Math.max(this.b, f);
            this.c += ((double)f) * ((double)f);
            ++this.d;
        }

        public double b() {
            return (double)this.b;
        }

        public double c() {
            return (double)this.a;
        }

        public double d() {
            return Math.sqrt(this.c / ((double)this.d));
        }

        public int e() {
            return this.d;
        }
    }

    private final int a;
    private final Listener b;
    private final SparseArray c;
    private final ByteBuffer d;
    private AudioFormat e;
    private AudioFormat f;
    private ChannelMixingMatrix g;
    private int h;

    public WaveformAudioBufferSink(int v, int v1, Listener waveformAudioBufferSink$Listener0) {
        this.a = v;
        this.b = waveformAudioBufferSink$Listener0;
        this.d = ByteBuffer.allocate(Util.C0(4, v1));
        this.c = new SparseArray(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            WaveformBar waveformAudioBufferSink$WaveformBar0 = new WaveformBar();
            this.c.append(v2, waveformAudioBufferSink$WaveformBar0);
        }
    }

    @Override  // androidx.media3.exoplayer.audio.TeeAudioProcessor$AudioBufferSink
    public void a(ByteBuffer byteBuffer0) {
        Assertions.k(this.e);
        Assertions.k(this.f);
        Assertions.k(this.g);
        while(byteBuffer0.hasRemaining()) {
            this.d.rewind();
            AudioMixingUtil.f(byteBuffer0, this.e, this.d, this.f, this.g, 1, false, true);
            this.d.rewind();
            for(int v = 0; v < this.c.size(); ++v) {
                WaveformBar waveformAudioBufferSink$WaveformBar0 = (WaveformBar)this.c.get(v);
                waveformAudioBufferSink$WaveformBar0.a(this.d.getFloat());
                if(waveformAudioBufferSink$WaveformBar0.e() >= this.h) {
                    this.b.a(v, waveformAudioBufferSink$WaveformBar0);
                    WaveformBar waveformAudioBufferSink$WaveformBar1 = new WaveformBar();
                    this.c.put(v, waveformAudioBufferSink$WaveformBar1);
                }
            }
        }
    }

    @Override  // androidx.media3.exoplayer.audio.TeeAudioProcessor$AudioBufferSink
    public void b(int v, int v1, int v2) {
        this.h = v / this.a;
        this.e = new AudioFormat(v, v1, v2);
        this.f = new AudioFormat(v, this.c.size(), 4);
        this.g = ChannelMixingMatrix.b(v1, this.c.size());
    }
}

