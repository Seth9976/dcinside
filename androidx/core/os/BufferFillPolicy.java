package androidx.core.os;

import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

@RequiresApi(api = 35)
public abstract class BufferFillPolicy {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    private final int a;
    @l
    public static final Companion b;
    @l
    @f
    public static final BufferFillPolicy c;
    @l
    @f
    public static final BufferFillPolicy d;

    static {
        BufferFillPolicy.b = new Companion(null);
        BufferFillPolicy.c = new Discard();
        BufferFillPolicy.d = new RingBuffer();
    }

    private BufferFillPolicy(int v) {
        this.a = v;
    }

    public BufferFillPolicy(int v, w w0) {
        this(v);
    }

    public final int a() {
        return this.a;
    }
}

