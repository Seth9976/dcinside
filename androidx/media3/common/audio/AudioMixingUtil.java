package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
public final class AudioMixingUtil {
    private static final float a = -1.0f;
    private static final float b = 1.0f;

    public static boolean a(AudioFormat audioProcessor$AudioFormat0) {
        if(audioProcessor$AudioFormat0.a == -1) {
            return false;
        }
        return audioProcessor$AudioFormat0.b == -1 ? false : audioProcessor$AudioFormat0.c == 2 || audioProcessor$AudioFormat0.c == 4;
    }

    public static boolean b(AudioFormat audioProcessor$AudioFormat0, AudioFormat audioProcessor$AudioFormat1) {
        if(audioProcessor$AudioFormat0.a != audioProcessor$AudioFormat1.a) {
            return false;
        }
        return AudioMixingUtil.a(audioProcessor$AudioFormat0) ? AudioMixingUtil.a(audioProcessor$AudioFormat1) : false;
    }

    private static float c(float f) {
        return f < 0.0f ? Util.v(f * 32768.0f, -32768.0f, 32767.0f) : Util.v(f * 32767.0f, -32768.0f, 32767.0f);
    }

    private static float d(ByteBuffer byteBuffer0, boolean z, boolean z1) {
        if(z1) {
            return z ? ((float)byteBuffer0.getShort()) : AudioMixingUtil.c(byteBuffer0.getFloat());
        }
        return z ? AudioMixingUtil.e(byteBuffer0.getShort()) : byteBuffer0.getFloat();
    }

    private static float e(short v) {
        return v >= 0 ? ((float)v) / 32767.0f : ((float)v) / 32768.0f;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer0, AudioFormat audioProcessor$AudioFormat0, ByteBuffer byteBuffer1, AudioFormat audioProcessor$AudioFormat1, ChannelMixingMatrix channelMixingMatrix0, int v, boolean z, boolean z1) {
        boolean z2 = true;
        boolean z3 = audioProcessor$AudioFormat0.c == 2;
        if(audioProcessor$AudioFormat1.c != 2) {
            z2 = false;
        }
        int v1 = channelMixingMatrix0.d();
        int v2 = channelMixingMatrix0.f();
        float[] arr_f = new float[v1];
        float[] arr_f1 = new float[v2];
        for(int v3 = 0; v3 < v; ++v3) {
            if(z) {
                int v4 = byteBuffer1.position();
                for(int v5 = 0; v5 < v2; ++v5) {
                    arr_f1[v5] = AudioMixingUtil.d(byteBuffer1, z2, z2);
                }
                byteBuffer1.position(v4);
            }
            for(int v6 = 0; v6 < v1; ++v6) {
                arr_f[v6] = AudioMixingUtil.d(byteBuffer0, z3, z2);
            }
            for(int v7 = 0; v7 < v2; ++v7) {
                for(int v8 = 0; v8 < v1; ++v8) {
                    arr_f1[v7] += arr_f[v8] * channelMixingMatrix0.e(v8, v7);
                }
                if(z2) {
                    byteBuffer1.putShort(((short)(((int)Util.v(arr_f1[v7], -32768.0f, 32767.0f)))));
                }
                else {
                    byteBuffer1.putFloat((z1 ? Util.v(arr_f1[v7], -1.0f, 1.0f) : arr_f1[v7]));
                }
                arr_f1[v7] = 0.0f;
            }
        }
        return byteBuffer1;
    }
}

