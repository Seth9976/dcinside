package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface RendererCapabilitiesList {
    public interface Factory {
        RendererCapabilitiesList a();
    }

    RendererCapabilities[] a();

    void release();

    int size();
}

