package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;
import java.io.IOException;

public final class g {
    public static int a(TrackOutput trackOutput0, DataReader dataReader0, int v, boolean z) throws IOException {
        return trackOutput0.c(dataReader0, v, z, 0);
    }

    public static void b(TrackOutput trackOutput0, ParsableByteArray parsableByteArray0, int v) {
        trackOutput0.a(parsableByteArray0, v, 0);
    }
}

