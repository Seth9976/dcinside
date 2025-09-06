package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
public class VideoDecoderOutputBuffer extends DecoderOutputBuffer {
    public int e;
    public int f;
    @Nullable
    public ByteBuffer g;
    public int h;
    public int i;
    @Nullable
    public Format j;
    @Nullable
    public ByteBuffer[] k;
    @Nullable
    public int[] l;
    public int m;
    @Nullable
    public ByteBuffer n;
    private final Owner o;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;

    public VideoDecoderOutputBuffer(Owner decoderOutputBuffer$Owner0) {
        this.o = decoderOutputBuffer$Owner0;
    }

    @Override  // androidx.media3.decoder.DecoderOutputBuffer
    public void p() {
        this.o.a(this);
    }

    public void r(long v, int v1, @Nullable ByteBuffer byteBuffer0) {
        this.b = v;
        this.f = v1;
        if(byteBuffer0 != null && byteBuffer0.hasRemaining()) {
            this.e(0x10000000);
            int v2 = byteBuffer0.limit();
            if(this.n == null || this.n.capacity() < v2) {
                this.n = ByteBuffer.allocate(v2);
            }
            else {
                this.n.clear();
            }
            this.n.put(byteBuffer0);
            this.n.flip();
            byteBuffer0.position(0);
            return;
        }
        this.n = null;
    }

    public void s(int v, int v1) {
        this.h = v;
        this.i = v1;
    }

    public boolean t(int v, int v1, int v2, int v3, int v4) {
        this.h = v;
        this.i = v1;
        this.m = v4;
        int v5 = (int)((((long)v1) + 1L) / 2L);
        if(VideoDecoderOutputBuffer.u(v2, v1) && VideoDecoderOutputBuffer.u(v3, v5)) {
            int v6 = v1 * v2;
            int v7 = v5 * v3;
            int v8 = v7 * 2 + v6;
            if(VideoDecoderOutputBuffer.u(v7, 2) && v8 >= v6) {
                if(this.g == null || this.g.capacity() < v8) {
                    this.g = ByteBuffer.allocateDirect(v8);
                }
                else {
                    this.g.position(0);
                    this.g.limit(v8);
                }
                if(this.k == null) {
                    this.k = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer0 = this.g;
                ByteBuffer[] arr_byteBuffer = this.k;
                ByteBuffer byteBuffer1 = byteBuffer0.slice();
                arr_byteBuffer[0] = byteBuffer1;
                byteBuffer1.limit(v6);
                byteBuffer0.position(v6);
                ByteBuffer byteBuffer2 = byteBuffer0.slice();
                arr_byteBuffer[1] = byteBuffer2;
                byteBuffer2.limit(v7);
                byteBuffer0.position(v6 + v7);
                ByteBuffer byteBuffer3 = byteBuffer0.slice();
                arr_byteBuffer[2] = byteBuffer3;
                byteBuffer3.limit(v7);
                if(this.l == null) {
                    this.l = new int[3];
                }
                int[] arr_v = this.l;
                arr_v[0] = v2;
                arr_v[1] = v3;
                arr_v[2] = v3;
                return true;
            }
        }
        return false;
    }

    private static boolean u(int v, int v1) {
        return v >= 0 && v1 >= 0 && (v1 <= 0 || v < 0x7FFFFFFF / v1);
    }
}

