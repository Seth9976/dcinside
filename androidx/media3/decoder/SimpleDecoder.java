package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayDeque;

@UnstableApi
public abstract class SimpleDecoder implements Decoder {
    private final Thread a;
    private final Object b;
    private final ArrayDeque c;
    private final ArrayDeque d;
    private final DecoderInputBuffer[] e;
    private final DecoderOutputBuffer[] f;
    private int g;
    private int h;
    @Nullable
    private DecoderInputBuffer i;
    @Nullable
    private DecoderException j;
    private boolean k;
    private boolean l;
    private int m;
    private long n;

    protected SimpleDecoder(DecoderInputBuffer[] arr_decoderInputBuffer, DecoderOutputBuffer[] arr_decoderOutputBuffer) {
        this.b = new Object();
        this.n = 0x8000000000000001L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = arr_decoderInputBuffer;
        this.g = arr_decoderInputBuffer.length;
        for(int v1 = 0; v1 < this.g; ++v1) {
            this.e[v1] = this.i();
        }
        this.f = arr_decoderOutputBuffer;
        this.h = arr_decoderOutputBuffer.length;
        for(int v = 0; v < this.h; ++v) {
            this.f[v] = this.j();
        }
        androidx.media3.decoder.SimpleDecoder.1 simpleDecoder$10 = new Thread("ExoPlayer:SimpleDecoder") {
            final SimpleDecoder a;

            @Override
            public void run() {
                SimpleDecoder.this.v();
            }
        };
        this.a = simpleDecoder$10;
        simpleDecoder$10.start();
    }

    @Override  // androidx.media3.decoder.Decoder
    @Nullable
    public Object a() throws DecoderException {
        return this.o();
    }

    @Override  // androidx.media3.decoder.Decoder
    public void b(Object object0) throws DecoderException {
        this.e(((DecoderInputBuffer)object0));
    }

    @Override  // androidx.media3.decoder.Decoder
    public final void c(long v) {
        synchronized(this.b) {
            Assertions.i(this.g == this.e.length || this.k);
            this.n = v;
        }
    }

    @Override  // androidx.media3.decoder.Decoder
    @Nullable
    public Object d() throws DecoderException {
        return this.n();
    }

    public final void e(DecoderInputBuffer decoderInputBuffer0) throws DecoderException {
        synchronized(this.b) {
            this.r();
            Assertions.a(decoderInputBuffer0 == this.i);
            this.c.addLast(decoderInputBuffer0);
            this.q();
            this.i = null;
        }
    }

    @Override  // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized(this.b) {
            this.k = true;
            this.m = 0;
            DecoderInputBuffer decoderInputBuffer0 = this.i;
            if(decoderInputBuffer0 != null) {
                this.s(decoderInputBuffer0);
                this.i = null;
            }
            while(!this.c.isEmpty()) {
                this.s(((DecoderInputBuffer)this.c.removeFirst()));
            }
            while(!this.d.isEmpty()) {
                ((DecoderOutputBuffer)this.d.removeFirst()).p();
            }
        }
    }

    private boolean h() {
        return !this.c.isEmpty() && this.h > 0;
    }

    protected abstract DecoderInputBuffer i();

    protected abstract DecoderOutputBuffer j();

    protected abstract DecoderException k(Throwable arg1);

    @Nullable
    protected abstract DecoderException l(DecoderInputBuffer arg1, DecoderOutputBuffer arg2, boolean arg3);

    private boolean m() throws InterruptedException {
        boolean z;
        DecoderOutputBuffer decoderOutputBuffer0;
        DecoderInputBuffer decoderInputBuffer0;
        DecoderException decoderException0;
        synchronized(this.b) {
            while(!this.l && !this.h()) {
                this.b.wait();
            }
            if(this.l) {
                return false;
            }
            decoderInputBuffer0 = (DecoderInputBuffer)this.c.removeFirst();
            int v1 = this.h - 1;
            this.h = v1;
            decoderOutputBuffer0 = this.f[v1];
            z = this.k;
            this.k = false;
        }
        if(decoderInputBuffer0.j()) {
            decoderOutputBuffer0.e(4);
        }
        else {
            decoderOutputBuffer0.b = decoderInputBuffer0.f;
            if(decoderInputBuffer0.k()) {
                decoderOutputBuffer0.e(0x8000000);
            }
            if(!this.p(decoderInputBuffer0.f)) {
                decoderOutputBuffer0.d = true;
            }
            try {
                decoderException0 = this.l(decoderInputBuffer0, decoderOutputBuffer0, z);
            }
            catch(RuntimeException runtimeException0) {
                decoderException0 = this.k(runtimeException0);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                decoderException0 = this.k(outOfMemoryError0);
            }
            if(decoderException0 != null) {
                synchronized(this.b) {
                    this.j = decoderException0;
                }
                return false;
            }
        }
        synchronized(this.b) {
            if(this.k) {
                decoderOutputBuffer0.p();
            }
            else if(decoderOutputBuffer0.d) {
                ++this.m;
                decoderOutputBuffer0.p();
            }
            else {
                decoderOutputBuffer0.c = this.m;
                this.m = 0;
                this.d.addLast(decoderOutputBuffer0);
            }
            this.s(decoderInputBuffer0);
            return true;
        }
    }

    @Nullable
    public final DecoderInputBuffer n() throws DecoderException {
        DecoderInputBuffer decoderInputBuffer0;
        synchronized(this.b) {
            this.r();
            Assertions.i(this.i == null);
            int v1 = this.g;
            if(v1 == 0) {
                decoderInputBuffer0 = null;
            }
            else {
                this.g = v1 - 1;
                decoderInputBuffer0 = this.e[v1 - 1];
            }
            this.i = decoderInputBuffer0;
            return decoderInputBuffer0;
        }
    }

    @Nullable
    public final DecoderOutputBuffer o() throws DecoderException {
        synchronized(this.b) {
            this.r();
            if(this.d.isEmpty()) {
                return null;
            }
        }
        return (DecoderOutputBuffer)this.d.removeFirst();
    }

    protected final boolean p(long v) {
        synchronized(this.b) {
        }
        return this.n == 0x8000000000000001L || v >= this.n;
    }

    private void q() {
        if(this.h()) {
            this.b.notify();
        }
    }

    private void r() throws DecoderException {
        DecoderException decoderException0 = this.j;
        if(decoderException0 != null) {
            throw decoderException0;
        }
    }

    @Override  // androidx.media3.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized(this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void s(DecoderInputBuffer decoderInputBuffer0) {
        decoderInputBuffer0.f();
        int v = this.g;
        this.g = v + 1;
        this.e[v] = decoderInputBuffer0;
    }

    @CallSuper
    protected void t(DecoderOutputBuffer decoderOutputBuffer0) {
        synchronized(this.b) {
            this.u(decoderOutputBuffer0);
            this.q();
        }
    }

    private void u(DecoderOutputBuffer decoderOutputBuffer0) {
        decoderOutputBuffer0.f();
        int v = this.h;
        this.h = v + 1;
        this.f[v] = decoderOutputBuffer0;
    }

    private void v() {
        while(true) {
            try {
                if(!this.m()) {
                    break;
                }
            }
            catch(InterruptedException interruptedException0) {
                throw new IllegalStateException(interruptedException0);
            }
        }
    }

    protected final void w(int v) {
        Assertions.i(this.g == this.e.length);
        DecoderInputBuffer[] arr_decoderInputBuffer = this.e;
        for(int v1 = 0; v1 < arr_decoderInputBuffer.length; ++v1) {
            arr_decoderInputBuffer[v1].r(v);
        }
    }
}

