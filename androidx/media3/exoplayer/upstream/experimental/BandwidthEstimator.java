package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener;

@UnstableApi
public interface BandwidthEstimator {
    public static final long a = 0x8000000000000000L;

    void a(EventListener arg1);

    long b();

    void c(Handler arg1, EventListener arg2);

    void d(DataSource arg1);

    void e(DataSource arg1);

    void f(DataSource arg1, int arg2);

    void g(long arg1);

    void h(DataSource arg1);
}

