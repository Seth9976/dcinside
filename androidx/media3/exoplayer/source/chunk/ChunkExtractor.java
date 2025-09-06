package androidx.media3.exoplayer.source.chunk;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.List;

@UnstableApi
public interface ChunkExtractor {
    public interface Factory {
        @a
        Factory a(androidx.media3.extractor.text.SubtitleParser.Factory arg1);

        @a
        Factory b(boolean arg1);

        Format c(Format arg1);

        @Nullable
        ChunkExtractor d(int arg1, Format arg2, boolean arg3, List arg4, @Nullable TrackOutput arg5, PlayerId arg6);
    }

    public interface TrackOutputProvider {
        TrackOutput b(int arg1, int arg2);
    }

    boolean a(ExtractorInput arg1) throws IOException;

    void c(@Nullable TrackOutputProvider arg1, long arg2, long arg3);

    @Nullable
    ChunkIndex d();

    @Nullable
    Format[] e();

    void release();
}

