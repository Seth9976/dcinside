package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

final class ToFloatPcmAudioProcessor extends BaseAudioProcessor {
    private static final int i = 0;
    private static final double j = 4.656613E-10;

    static {
        ToFloatPcmAudioProcessor.i = 0x7FC00000;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
    alab1:
        switch(this.b.c) {
            case 21: {
                byteBuffer1 = this.l(v2 / 3 * 4);
                while(v < v1) {
                    ToFloatPcmAudioProcessor.m((byteBuffer0.get(v) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v + 2) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 22: {
                byteBuffer1 = this.l(v2);
                while(v < v1) {
                    ToFloatPcmAudioProcessor.m(byteBuffer0.get(v) & 0xFF | (byteBuffer0.get(v + 1) & 0xFF) << 8 | (byteBuffer0.get(v + 2) & 0xFF) << 16 | (byteBuffer0.get(v + 3) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
                break;
            }
            case 0x50000000: {
                byteBuffer1 = this.l(v2 / 3 * 4);
                while(v < v1) {
                    ToFloatPcmAudioProcessor.m((byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 0x60000000: {
                byteBuffer1 = this.l(v2);
                while(true) {
                    if(v >= v1) {
                        break alab1;
                    }
                    ToFloatPcmAudioProcessor.m(byteBuffer0.get(v + 3) & 0xFF | (byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
            }
            default: {
                throw new IllegalStateException();
            }
        }
        byteBuffer0.position(byteBuffer0.limit());
        byteBuffer1.flip();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        int v = audioProcessor$AudioFormat0.c;
        if(!Util.e1(v)) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        return v == 4 ? AudioFormat.e : new AudioFormat(audioProcessor$AudioFormat0.a, audioProcessor$AudioFormat0.b, 4);
    }

    private static void m(int v, ByteBuffer byteBuffer0) {
        byteBuffer0.putInt((Float.floatToIntBits(((float)(((double)v) * 4.656613E-10))) == ToFloatPcmAudioProcessor.i ? 0 : Float.floatToIntBits(((float)(((double)v) * 4.656613E-10)))));
    }
}

