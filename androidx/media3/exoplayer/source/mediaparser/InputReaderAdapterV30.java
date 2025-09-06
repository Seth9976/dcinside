package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser.SeekableInputReader;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@SuppressLint({"Override"})
@RequiresApi(30)
@UnstableApi
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    @Nullable
    private DataReader a;
    private long b;
    private long c;
    private long d;

    public long a() {
        long v = this.d;
        this.d = -1L;
        return v;
    }

    public void b(long v) {
        this.c = v;
    }

    public void c(DataReader dataReader0, long v) {
        this.a = dataReader0;
        this.b = v;
        this.d = -1L;
    }

    @Override  // android.media.MediaParser$InputReader
    public long getLength() {
        return this.b;
    }

    @Override  // android.media.MediaParser$InputReader
    public long getPosition() {
        return this.c;
    }

    @Override  // android.media.MediaParser$InputReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.a.read(arr_b, v, v1);
        this.c += (long)v2;
        return v2;
    }

    @Override  // android.media.MediaParser$SeekableInputReader
    public void seekToPosition(long v) {
        this.d = v;
    }
}

