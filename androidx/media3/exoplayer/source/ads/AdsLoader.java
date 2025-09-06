package androidx.media3.exoplayer.source.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem.AdsConfiguration;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;

public interface AdsLoader {
    @UnstableApi
    public interface EventListener {
        void a();

        void b(AdPlaybackState arg1);

        void c(AdLoadException arg1, DataSpec arg2);

        void onAdClicked();
    }

    public interface Provider {
        @Nullable
        AdsLoader a(AdsConfiguration arg1);
    }

    @UnstableApi
    void a(AdsMediaSource arg1, DataSpec arg2, Object arg3, AdViewProvider arg4, EventListener arg5);

    @UnstableApi
    void b(AdsMediaSource arg1, EventListener arg2);

    @UnstableApi
    void c(int[] arg1);

    @UnstableApi
    void d(AdsMediaSource arg1, int arg2, int arg3);

    void e(@Nullable Player arg1);

    @UnstableApi
    void f(AdsMediaSource arg1, int arg2, int arg3, IOException arg4);

    void release();
}

