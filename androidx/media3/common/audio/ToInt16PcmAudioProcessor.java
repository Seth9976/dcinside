package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
        switch(this.b.c) {
            case 3: {
                v2 *= 2;
                break;
            }
            case 0x10000000: {
                break;
            }
            case 21: 
            case 0x50000000: {
                v2 = v2 / 3 * 2;
                break;
            }
            case 4: 
            case 22: 
            case 0x60000000: {
                v2 /= 2;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        ByteBuffer byteBuffer1 = this.l(v2);
    alab1:
        switch(this.b.c) {
            case 3: {
                while(true) {
                    if(v >= v1) {
                        break alab1;
                    }
                    byteBuffer1.put(0);
                    byteBuffer1.put(((byte)((byteBuffer0.get(v) & 0xFF) - 0x80)));
                    ++v;
                }
            }
            case 4: {
                while(v < v1) {
                    int v3 = (short)(((int)(Util.v(byteBuffer0.getFloat(v), -1.0f, 1.0f) * 32767.0f)));
                    byteBuffer1.put(((byte)(v3 & 0xFF)));
                    byteBuffer1.put(((byte)(v3 >> 8 & 0xFF)));
                    v += 4;
                }
                break;
            }
            case 21: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v + 2));
                    v += 3;
                }
                break;
            }
            case 22: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 2));
                    byteBuffer1.put(byteBuffer0.get(v + 3));
                    v += 4;
                }
                break;
            }
            case 0x10000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 2;
                }
                break;
            }
            case 0x50000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 3;
                }
                break;
            }
            case 0x60000000: {
                while(v < v1) {
                    byteBuffer1.put(byteBuffer0.get(v + 1));
                    byteBuffer1.put(byteBuffer0.get(v));
                    v += 4;
                }
                break;
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
        if(v != 2 && v != 3) {
            switch(v) {
                case 4: 
                case 21: 
                case 22: 
                case 0x10000000: 
                case 0x50000000: 
                case 0x60000000: {
                    break;
                }
                default: {
                    throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
                }
            }
        }
        return v == 2 ? AudioFormat.e : new AudioFormat(audioProcessor$AudioFormat0.a, audioProcessor$AudioFormat0.b, 2);
    }
}

