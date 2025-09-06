package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.OpusUtil;
import com.google.common.primitives.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

@UnstableApi
public final class OggOpusAudioPacketizer {
    private ByteBuffer a;
    private int b;
    private int c;
    private static final int d = 22;
    private static final int e = 2;
    private static final int f = 28;
    private static final int g;
    private static final byte[] h;
    private static final byte[] i;

    static {
        OggOpusAudioPacketizer.h = new byte[]{0x4F, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100, 1, 2, 56, 1, (byte)0x80, -69, 0, 0, 0, 0, 0};
        OggOpusAudioPacketizer.i = new byte[]{0x4F, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 0x4F, 0x70, 0x75, 0x73, 84, 97, 103, 0x73, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public OggOpusAudioPacketizer() {
        this.a = AudioProcessor.a;
        this.c = 0;
        this.b = 2;
    }

    public void a(DecoderInputBuffer decoderInputBuffer0, List list0) {
        byte[] arr_b;
        Assertions.g(decoderInputBuffer0.d);
        if(decoderInputBuffer0.d.limit() - decoderInputBuffer0.d.position() == 0) {
            return;
        }
        if(this.b == 2) {
            switch(list0.size()) {
                case 1: 
                case 3: {
                    arr_b = (byte[])list0.get(0);
                    break;
                }
                default: {
                    arr_b = null;
                }
            }
        }
        else {
            arr_b = null;
        }
        this.a = this.b(decoderInputBuffer0.d, arr_b);
        decoderInputBuffer0.f();
        decoderInputBuffer0.r(this.a.remaining());
        decoderInputBuffer0.d.put(this.a);
        decoderInputBuffer0.s();
    }

    private ByteBuffer b(ByteBuffer byteBuffer0, @Nullable byte[] arr_b) {
        int v6;
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
        int v3 = (v2 + 0xFF) / 0xFF;
        int v4 = v3 + 27 + v2;
        if(this.b == 2) {
            int v5 = arr_b == null ? OggOpusAudioPacketizer.h.length : arr_b.length + 28;
            v4 += OggOpusAudioPacketizer.i.length + v5;
            v6 = v5;
        }
        else {
            v6 = 0;
        }
        ByteBuffer byteBuffer1 = this.c(v4);
        if(this.b == 2) {
            if(arr_b == null) {
                byteBuffer1.put(OggOpusAudioPacketizer.h);
            }
            else {
                this.e(byteBuffer1, arr_b);
            }
            byteBuffer1.put(OggOpusAudioPacketizer.i);
        }
        int v7 = OpusUtil.j(byteBuffer0);
        int v8 = this.c + v7;
        this.c = v8;
        this.f(byteBuffer1, ((long)v8), this.b, v3, false);
        for(int v9 = 0; v9 < v3; ++v9) {
            if(v2 >= 0xFF) {
                byteBuffer1.put(-1);
                v2 -= 0xFF;
            }
            else {
                byteBuffer1.put(((byte)v2));
                v2 = 0;
            }
        }
        while(v < v1) {
            byteBuffer1.put(byteBuffer0.get(v));
            ++v;
        }
        byteBuffer0.position(byteBuffer0.limit());
        byteBuffer1.flip();
        if(this.b == 2) {
            int v10 = Util.E(byteBuffer1.array(), byteBuffer1.arrayOffset() + v6 + OggOpusAudioPacketizer.i.length, byteBuffer1.limit() - byteBuffer1.position(), 0);
            byteBuffer1.putInt(v6 + OggOpusAudioPacketizer.i.length + 22, v10);
        }
        else {
            byteBuffer1.putInt(22, Util.E(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.limit() - byteBuffer1.position(), 0));
        }
        ++this.b;
        return byteBuffer1;
    }

    private ByteBuffer c(int v) {
        if(this.a.capacity() < v) {
            this.a = ByteBuffer.allocate(v).order(ByteOrder.LITTLE_ENDIAN);
            return this.a;
        }
        this.a.clear();
        return this.a;
    }

    public void d() {
        this.a = AudioProcessor.a;
        this.c = 0;
        this.b = 2;
    }

    private void e(ByteBuffer byteBuffer0, byte[] arr_b) {
        this.f(byteBuffer0, 0L, 0, 1, true);
        byteBuffer0.put(u.a(arr_b.length));
        byteBuffer0.put(arr_b);
        byteBuffer0.putInt(22, Util.E(byteBuffer0.array(), byteBuffer0.arrayOffset(), arr_b.length + 28, 0));
        byteBuffer0.position(arr_b.length + 28);
    }

    private void f(ByteBuffer byteBuffer0, long v, int v1, int v2, boolean z) {
        byteBuffer0.put(0x4F);
        byteBuffer0.put(103);
        byteBuffer0.put(103);
        byteBuffer0.put(83);
        byteBuffer0.put(0);
        byteBuffer0.put(((byte)(z ? 2 : 0)));
        byteBuffer0.putLong(v);
        byteBuffer0.putInt(0);
        byteBuffer0.putInt(v1);
        byteBuffer0.putInt(0);
        byteBuffer0.put(u.a(v2));
    }
}

