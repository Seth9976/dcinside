package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public interface DataReader {
    int read(byte[] arg1, int arg2, int arg3) throws IOException;
}

