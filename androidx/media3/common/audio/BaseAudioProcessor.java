package androidx.media3.common.audio;

import androidx.annotation.CallSuper;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
public abstract class BaseAudioProcessor implements AudioProcessor {
    protected AudioFormat b;
    protected AudioFormat c;
    private AudioFormat d;
    private AudioFormat e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public BaseAudioProcessor() {
        this.f = AudioProcessor.a;
        this.g = AudioProcessor.a;
        this.d = AudioFormat.e;
        this.e = AudioFormat.e;
        this.b = AudioFormat.e;
        this.c = AudioFormat.e;
    }

    protected final boolean a() {
        return this.g.hasRemaining();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    @CallSuper
    public boolean b() {
        return this.h && this.g == AudioProcessor.a;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        this.h = true;
        this.j();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    @CallSuper
    public ByteBuffer e() {
        ByteBuffer byteBuffer0 = this.g;
        this.g = AudioProcessor.a;
        return byteBuffer0;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final AudioFormat f(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        this.d = audioProcessor$AudioFormat0;
        this.e = this.h(audioProcessor$AudioFormat0);
        return this.isActive() ? this.e : AudioFormat.e;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.i();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public long g(long v) {
        return v;
    }

    protected AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        return AudioFormat.e;
    }

    protected void i() {
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    @CallSuper
    public boolean isActive() {
        return this.e != AudioFormat.e;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected final ByteBuffer l(int v) {
        if(this.f.capacity() < v) {
            this.f = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
        }
        else {
            this.f.clear();
        }
        this.g = this.f;
        return this.f;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.flush();
        this.f = AudioProcessor.a;
        this.d = AudioFormat.e;
        this.e = AudioFormat.e;
        this.b = AudioFormat.e;
        this.c = AudioFormat.e;
        this.k();
    }
}

