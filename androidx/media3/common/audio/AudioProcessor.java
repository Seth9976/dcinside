package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.B;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
public interface AudioProcessor {
    public static final class AudioFormat {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public static final AudioFormat e;

        static {
            AudioFormat.e = new AudioFormat(-1, -1, -1);
        }

        public AudioFormat(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = Util.f1(v2) ? Util.C0(v2, v1) : -1;
        }

        public AudioFormat(Format format0) {
            this(format0.C, format0.B, format0.D);
        }

        @Override
        public boolean equals(@Nullable Object object0) [...] // 潜在的解密器

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.b, this.c});
        }

        @Override
        public String toString() {
            return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public final AudioFormat a;

        public UnhandledAudioFormatException(AudioFormat audioProcessor$AudioFormat0) {
            this("Unhandled input format:", audioProcessor$AudioFormat0);
        }

        public UnhandledAudioFormatException(String s, AudioFormat audioProcessor$AudioFormat0) {
            super(s + " " + audioProcessor$AudioFormat0);
            this.a = audioProcessor$AudioFormat0;
        }
    }

    public static final ByteBuffer a;

    static {
        AudioProcessor.a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    }

    boolean b();

    void c(ByteBuffer arg1);

    void d();

    ByteBuffer e();

    AudioFormat f(AudioFormat arg1) throws UnhandledAudioFormatException;

    void flush();

    long g(long arg1);

    boolean isActive();

    void reset();
}

