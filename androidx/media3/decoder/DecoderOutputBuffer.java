package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public abstract class DecoderOutputBuffer extends Buffer {
    public interface Owner {
        void a(DecoderOutputBuffer arg1);
    }

    public long b;
    public int c;
    public boolean d;

    @Override  // androidx.media3.decoder.Buffer
    @CallSuper
    public void f() {
        super.f();
        this.b = 0L;
        this.c = 0;
        this.d = false;
    }

    public abstract void p();
}

