package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererConfiguration;

@UnstableApi
public final class TrackSelectorResult {
    public final int a;
    public final RendererConfiguration[] b;
    public final ExoTrackSelection[] c;
    public final Tracks d;
    @Nullable
    public final Object e;

    public TrackSelectorResult(RendererConfiguration[] arr_rendererConfiguration, ExoTrackSelection[] arr_exoTrackSelection, Tracks tracks0, @Nullable Object object0) {
        Assertions.a(arr_rendererConfiguration.length == arr_exoTrackSelection.length);
        this.b = arr_rendererConfiguration;
        this.c = (ExoTrackSelection[])arr_exoTrackSelection.clone();
        this.d = tracks0;
        this.e = object0;
        this.a = arr_rendererConfiguration.length;
    }

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] arr_rendererConfiguration, ExoTrackSelection[] arr_exoTrackSelection, @Nullable Object object0) {
        this(arr_rendererConfiguration, arr_exoTrackSelection, Tracks.b, object0);
    }

    public boolean a(@Nullable TrackSelectorResult trackSelectorResult0) {
        if(trackSelectorResult0 != null && trackSelectorResult0.c.length == this.c.length) {
            for(int v = 0; v < this.c.length; ++v) {
                if(!this.b(trackSelectorResult0, v)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(30)
    public boolean b(@Nullable TrackSelectorResult trackSelectorResult0, int v) {
        return trackSelectorResult0 == null ? false : Util.g(this.b[v], trackSelectorResult0.b[v]) && Util.g(this.c[v], trackSelectorResult0.c[v]);
    }

    public boolean c(int v) {
        return this.b[v] != null;
    }
}

