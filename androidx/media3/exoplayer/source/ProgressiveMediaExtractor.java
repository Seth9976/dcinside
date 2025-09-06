package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public interface ProgressiveMediaExtractor {
    public interface Factory {
        ProgressiveMediaExtractor a(PlayerId arg1);
    }

    void a(long arg1, long arg2);

    void b(DataReader arg1, Uri arg2, Map arg3, long arg4, long arg5, ExtractorOutput arg6) throws IOException;

    long c();

    void d();

    int e(PositionHolder arg1) throws IOException;

    void release();
}

