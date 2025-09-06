package androidx.media3.exoplayer.dash;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import java.util.List;

@UnstableApi
public interface DashChunkSource extends ChunkSource {
    public interface Factory {
        @a
        Factory a(androidx.media3.extractor.text.SubtitleParser.Factory arg1);

        @a
        Factory b(boolean arg1);

        Format c(Format arg1);

        DashChunkSource d(LoaderErrorThrower arg1, DashManifest arg2, BaseUrlExclusionList arg3, int arg4, int[] arg5, ExoTrackSelection arg6, int arg7, long arg8, boolean arg9, List arg10, @Nullable PlayerTrackEmsgHandler arg11, @Nullable TransferListener arg12, PlayerId arg13, @Nullable CmcdConfiguration arg14);
    }

    void f(ExoTrackSelection arg1);

    void h(DashManifest arg1, int arg2);
}

