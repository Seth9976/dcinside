package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;

public final class w {
    public static AudioOffloadSupport a(AudioSink audioSink0, Format format0) {
        return AudioOffloadSupport.d;
    }

    public static void b(AudioSink audioSink0) {
    }

    public static void c(AudioSink audioSink0, Clock clock0) {
    }

    @RequiresApi(29)
    public static void d(AudioSink audioSink0, int v, int v1) {
    }

    @RequiresApi(29)
    public static void e(AudioSink audioSink0, int v) {
    }

    public static void f(AudioSink audioSink0, long v) {
    }

    public static void g(AudioSink audioSink0, @Nullable PlayerId playerId0) {
    }

    @RequiresApi(23)
    public static void h(AudioSink audioSink0, @Nullable AudioDeviceInfo audioDeviceInfo0) {
    }
}

