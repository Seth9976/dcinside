package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

interface MediaCodecBufferEnqueuer {
    void a(Bundle arg1);

    void b(int arg1, int arg2, int arg3, long arg4, int arg5);

    void c();

    void d(int arg1, int arg2, CryptoInfo arg3, long arg4, int arg5);

    void e() throws InterruptedException;

    void flush();

    void shutdown();

    void start();
}

