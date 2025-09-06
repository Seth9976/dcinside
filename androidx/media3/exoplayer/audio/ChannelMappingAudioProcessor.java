package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Assertions;
import java.nio.ByteBuffer;

final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    @Nullable
    private int[] i;
    @Nullable
    private int[] j;

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        int[] arr_v = (int[])Assertions.g(this.j);
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        ByteBuffer byteBuffer1 = this.l((v1 - v) / this.b.d * this.c.d);
        while(v < v1) {
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                byteBuffer1.putShort(byteBuffer0.getShort(arr_v[v2] * 2 + v));
            }
            v += this.b.d;
        }
        byteBuffer0.position(v1);
        byteBuffer1.flip();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        int[] arr_v = this.i;
        if(arr_v == null) {
            return AudioFormat.e;
        }
        if(audioProcessor$AudioFormat0.c != 2) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        int v = audioProcessor$AudioFormat0.b == arr_v.length ? 0 : 1;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 >= audioProcessor$AudioFormat0.b) {
                throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
            }
            v |= (v2 == v1 ? 0 : 1);
        }
        return v == 0 ? AudioFormat.e : new AudioFormat(audioProcessor$AudioFormat0.a, arr_v.length, 2);
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void i() {
        this.j = this.i;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void k() {
        this.j = null;
        this.i = null;
    }

    public void m(@Nullable int[] arr_v) {
        this.i = arr_v;
    }
}

