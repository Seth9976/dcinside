package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

@UnstableApi
@Deprecated
public interface MediaSourceFactory extends Factory {
    @UnstableApi
    public static final MediaSourceFactory b;

    static {
        MediaSourceFactory.b = new MediaSourceFactory() {
            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
                return this;
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public Factory b(boolean z) {
                return this;
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public Factory c(@Nullable DrmSessionManagerProvider drmSessionManagerProvider0) {
                return this;
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public int[] d() {
                throw new UnsupportedOperationException();
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public Factory e(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
                return this;
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
                return this;
            }

            @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
            public MediaSource g(MediaItem mediaItem0) {
                throw new UnsupportedOperationException();
            }

            public MediaSourceFactory h(@Nullable DrmSessionManagerProvider drmSessionManagerProvider0) [...] // Inlined contents

            public MediaSourceFactory i(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy0) [...] // Inlined contents
        };
    }
}

