package androidx.media3.exoplayer.audio;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class AudioOffloadSupport {
    public static final class Builder {
        private boolean a;
        private boolean b;
        private boolean c;

        public Builder() {
        }

        public Builder(AudioOffloadSupport audioOffloadSupport0) {
            this.a = audioOffloadSupport0.a;
            this.b = audioOffloadSupport0.b;
            this.c = audioOffloadSupport0.c;
        }

        public AudioOffloadSupport d() {
            if(!this.a && (this.b || this.c)) {
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            }
            return new AudioOffloadSupport(this, null);
        }

        @a
        public Builder e(boolean z) {
            this.a = z;
            return this;
        }

        @a
        public Builder f(boolean z) {
            this.b = z;
            return this;
        }

        @a
        public Builder g(boolean z) {
            this.c = z;
            return this;
        }
    }

    public final boolean a;
    public final boolean b;
    public final boolean c;
    public static final AudioOffloadSupport d;

    static {
        AudioOffloadSupport.d = new Builder().d();
    }

    private AudioOffloadSupport(Builder audioOffloadSupport$Builder0) {
        this.a = audioOffloadSupport$Builder0.a;
        this.b = audioOffloadSupport$Builder0.b;
        this.c = audioOffloadSupport$Builder0.c;
    }

    AudioOffloadSupport(Builder audioOffloadSupport$Builder0, androidx.media3.exoplayer.audio.AudioOffloadSupport.1 audioOffloadSupport$10) {
        this(audioOffloadSupport$Builder0);
    }

    public Builder a() {
        return new Builder(this);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return AudioOffloadSupport.class == class0 && (this.a == ((AudioOffloadSupport)object0).a && this.b == ((AudioOffloadSupport)object0).b && this.c == ((AudioOffloadSupport)object0).c);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a << 2) + (this.b << 1) + this.c;
    }

    class androidx.media3.exoplayer.audio.AudioOffloadSupport.1 {
    }

}

