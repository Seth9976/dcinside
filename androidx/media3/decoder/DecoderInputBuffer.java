package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import h4.d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@UnstableApi
public class DecoderInputBuffer extends Buffer {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int a;
        public final int b;

        public InsufficientCapacityException(int v, int v1) {
            super("Buffer too small (" + v + " < " + v1 + ")");
            this.a = v;
            this.b = v1;
        }
    }

    @Nullable
    public Format b;
    public final CryptoInfo c;
    @Nullable
    public ByteBuffer d;
    public boolean e;
    public long f;
    @Nullable
    public ByteBuffer g;
    private final int h;
    private final int i;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;

    static {
        MediaLibraryInfo.a("media3.decoder");
    }

    public DecoderInputBuffer(int v) {
        this(v, 0);
    }

    public DecoderInputBuffer(int v, int v1) {
        this.c = new CryptoInfo();
        this.h = v;
        this.i = v1;
    }

    @Override  // androidx.media3.decoder.Buffer
    public void f() {
        super.f();
        ByteBuffer byteBuffer0 = this.d;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
        ByteBuffer byteBuffer1 = this.g;
        if(byteBuffer1 != null) {
            byteBuffer1.clear();
        }
        this.e = false;
    }

    private ByteBuffer p(int v) {
        int v1 = this.h;
        if(v1 == 1) {
            return ByteBuffer.allocate(v);
        }
        if(v1 != 2) {
            throw new InsufficientCapacityException((this.d == null ? 0 : this.d.capacity()), v);
        }
        return ByteBuffer.allocateDirect(v);
    }

    @d({"data"})
    public void r(int v) {
        int v1 = v + this.i;
        ByteBuffer byteBuffer0 = this.d;
        if(byteBuffer0 == null) {
            this.d = this.p(v1);
            return;
        }
        int v2 = byteBuffer0.position();
        int v3 = v1 + v2;
        if(byteBuffer0.capacity() >= v3) {
            this.d = byteBuffer0;
            return;
        }
        ByteBuffer byteBuffer1 = this.p(v3);
        byteBuffer1.order(byteBuffer0.order());
        if(v2 > 0) {
            byteBuffer0.flip();
            byteBuffer1.put(byteBuffer0);
        }
        this.d = byteBuffer1;
    }

    public final void s() {
        ByteBuffer byteBuffer0 = this.d;
        if(byteBuffer0 != null) {
            byteBuffer0.flip();
        }
        ByteBuffer byteBuffer1 = this.g;
        if(byteBuffer1 != null) {
            byteBuffer1.flip();
        }
    }

    public final boolean t() {
        return this.h(0x40000000);
    }

    public static DecoderInputBuffer u() {
        return new DecoderInputBuffer(0);
    }

    @d({"supplementalData"})
    public void v(int v) {
        if(this.g != null && this.g.capacity() >= v) {
            this.g.clear();
            return;
        }
        this.g = ByteBuffer.allocate(v);
    }
}

