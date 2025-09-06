package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    private final SparseArray i;

    public ChannelMixingAudioProcessor() {
        this.i = new SparseArray();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        Object object0 = Assertions.k(((ChannelMixingMatrix)this.i.get(this.b.b)));
        int v = byteBuffer0.remaining() / this.b.d;
        ByteBuffer byteBuffer1 = this.l(this.c.d * v);
        AudioMixingUtil.f(byteBuffer0, this.b, byteBuffer1, this.c, ((ChannelMixingMatrix)object0), v, false, true);
        byteBuffer1.flip();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        if(audioProcessor$AudioFormat0.c != 2) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        ChannelMixingMatrix channelMixingMatrix0 = (ChannelMixingMatrix)this.i.get(audioProcessor$AudioFormat0.b);
        if(channelMixingMatrix0 == null) {
            throw new UnhandledAudioFormatException("No mixing matrix for input channel count", audioProcessor$AudioFormat0);
        }
        return channelMixingMatrix0.i() ? AudioFormat.e : new AudioFormat(audioProcessor$AudioFormat0.a, channelMixingMatrix0.f(), 2);
    }

    public void m(ChannelMixingMatrix channelMixingMatrix0) {
        this.i.put(channelMixingMatrix0.d(), channelMixingMatrix0);
    }
}

