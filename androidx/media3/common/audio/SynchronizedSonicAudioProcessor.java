package androidx.media3.common.audio;

import java.nio.ByteBuffer;

class SynchronizedSonicAudioProcessor implements AudioProcessor {
    private final Object b;
    private final SonicAudioProcessor c;

    public SynchronizedSonicAudioProcessor(Object object0) {
        this.b = object0;
        this.c = new SonicAudioProcessor();
    }

    public final long a(long v) {
        synchronized(this.b) {
        }
        return this.c.a(v);
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final boolean b() {
        synchronized(this.b) {
        }
        return this.c.b();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer0) {
        synchronized(this.b) {
            this.c.c(byteBuffer0);
        }
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        synchronized(this.b) {
            this.c.d();
        }
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        synchronized(this.b) {
        }
        return this.c.e();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final AudioFormat f(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        synchronized(this.b) {
        }
        return this.c.f(audioProcessor$AudioFormat0);
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        synchronized(this.b) {
            this.c.flush();
        }
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public long g(long v) {
        return this.h(v);
    }

    public final long h(long v) {
        synchronized(this.b) {
        }
        return this.c.h(v);
    }

    public final long i() {
        synchronized(this.b) {
        }
        return this.c.i();
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        synchronized(this.b) {
        }
        return this.c.isActive();
    }

    public final void j(int v) {
        synchronized(this.b) {
            this.c.j(v);
        }
    }

    public final void k(float f) {
        synchronized(this.b) {
            this.c.k(f);
        }
    }

    public final void l(float f) {
        synchronized(this.b) {
            this.c.l(f);
        }
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        synchronized(this.b) {
            this.c.reset();
        }
    }
}

