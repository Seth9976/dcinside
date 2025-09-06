package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener;
import java.util.List;

@UnstableApi
public interface AnalyticsCollector extends Listener, DrmSessionEventListener, MediaSourceEventListener, EventListener {
    void B(int arg1, long arg2, long arg3);

    void D(List arg1, @Nullable MediaPeriodId arg2);

    void O(AnalyticsListener arg1);

    void U(AnalyticsListener arg1);

    void X(Player arg1, Looper arg2);

    void b(AudioTrackConfig arg1);

    void c(AudioTrackConfig arg1);

    void d0();

    void e(Exception arg1);

    void f(String arg1);

    void g(String arg1);

    void h(String arg1, long arg2, long arg3);

    void i(DecoderCounters arg1);

    void j(DecoderCounters arg1);

    void k(Format arg1, @Nullable DecoderReuseEvaluation arg2);

    void l(DecoderCounters arg1);

    void m(int arg1, long arg2);

    void n(Exception arg1);

    void o(long arg1, int arg2);

    void p(String arg1, long arg2, long arg3);

    void release();

    void s(long arg1);

    void t(Exception arg1);

    void v(Object arg1, long arg2);

    void y(Format arg1, @Nullable DecoderReuseEvaluation arg2);

    void z(DecoderCounters arg1);
}

