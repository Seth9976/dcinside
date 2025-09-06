package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
public final class TeeAudioProcessor extends BaseAudioProcessor {
    public interface AudioBufferSink {
        void a(ByteBuffer arg1);

        void b(int arg1, int arg2, int arg3);
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
        private final String a;
        private final byte[] b;
        private final ByteBuffer c;
        private int d;
        private int e;
        private int f;
        @Nullable
        private RandomAccessFile g;
        private int h;
        private int i;
        private static final String j = "WaveFileAudioBufferSink";
        private static final int k = 4;
        private static final int l = 40;
        private static final int m = 44;

        public WavFileAudioBufferSink(String s) {
            this.a = s;
            byte[] arr_b = new byte[0x400];
            this.b = arr_b;
            this.c = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
        }

        @Override  // androidx.media3.exoplayer.audio.TeeAudioProcessor$AudioBufferSink
        public void a(ByteBuffer byteBuffer0) {
            try {
                this.d();
                this.f(byteBuffer0);
            }
            catch(IOException iOException0) {
                Log.e("WaveFileAudioBufferSink", "Error writing data", iOException0);
            }
        }

        @Override  // androidx.media3.exoplayer.audio.TeeAudioProcessor$AudioBufferSink
        public void b(int v, int v1, int v2) {
            try {
                this.e();
            }
            catch(IOException iOException0) {
                Log.e("WaveFileAudioBufferSink", "Error resetting", iOException0);
            }
            this.d = v;
            this.e = v1;
            this.f = v2;
        }

        private String c() {
            int v = this.h;
            this.h = v + 1;
            return Util.S("%s-%04d.wav", new Object[]{this.a, v});
        }

        private void d() throws IOException {
            if(this.g != null) {
                return;
            }
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(this.c(), "rw");
            this.g(randomAccessFile0);
            this.g = randomAccessFile0;
            this.i = 44;
        }

        private void e() throws IOException {
            RandomAccessFile randomAccessFile0;
            try {
                randomAccessFile0 = this.g;
                if(randomAccessFile0 == null) {
                    return;
                }
                this.c.clear();
                this.c.putInt(this.i - 8);
                randomAccessFile0.seek(4L);
                randomAccessFile0.write(this.b, 0, 4);
                this.c.clear();
                this.c.putInt(this.i - 44);
                randomAccessFile0.seek(40L);
                randomAccessFile0.write(this.b, 0, 4);
            }
            catch(IOException iOException0) {
                Log.o("WaveFileAudioBufferSink", "Error updating file size", iOException0);
            }
            try {
                randomAccessFile0.close();
                this.g = null;
            }
            catch(Throwable throwable0) {
                this.g = null;
                throw throwable0;
            }
        }

        private void f(ByteBuffer byteBuffer0) throws IOException {
            RandomAccessFile randomAccessFile0 = (RandomAccessFile)Assertions.g(this.g);
            while(byteBuffer0.hasRemaining()) {
                int v = Math.min(byteBuffer0.remaining(), this.b.length);
                byteBuffer0.get(this.b, 0, v);
                randomAccessFile0.write(this.b, 0, v);
                this.i += v;
            }
        }

        private void g(RandomAccessFile randomAccessFile0) throws IOException {
            randomAccessFile0.writeInt(1380533830);
            randomAccessFile0.writeInt(-1);
            randomAccessFile0.writeInt(0x57415645);
            randomAccessFile0.writeInt(0x666D7420);
            this.c.clear();
            this.c.putInt(16);
            int v = (short)WavUtil.b(this.f);
            this.c.putShort(((short)v));
            this.c.putShort(((short)this.e));
            this.c.putInt(this.d);
            int v1 = Util.C0(this.f, this.e);
            this.c.putInt(this.d * v1);
            this.c.putShort(((short)v1));
            this.c.putShort(((short)(v1 * 8 / this.e)));
            randomAccessFile0.write(this.b, 0, this.c.position());
            randomAccessFile0.writeInt(1684108385);
            randomAccessFile0.writeInt(-1);
        }
    }

    private final AudioBufferSink i;

    public TeeAudioProcessor(AudioBufferSink teeAudioProcessor$AudioBufferSink0) {
        this.i = (AudioBufferSink)Assertions.g(teeAudioProcessor$AudioBufferSink0);
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        if(v == 0) {
            return;
        }
        ByteBuffer byteBuffer1 = Util.M(byteBuffer0);
        this.i.a(byteBuffer1);
        this.l(v).put(byteBuffer0).flip();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public AudioFormat h(AudioFormat audioProcessor$AudioFormat0) {
        return audioProcessor$AudioFormat0;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void i() {
        this.m();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void j() {
        this.m();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void k() {
        this.m();
    }

    private void m() {
        if(this.isActive()) {
            this.i.b(this.b.a, this.b.b, this.b.c);
        }
    }
}

