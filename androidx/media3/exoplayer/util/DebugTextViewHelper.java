package androidx.media3.exoplayer.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Events;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import java.util.Locale;

public class DebugTextViewHelper {
    final class Updater implements Listener, Runnable {
        final DebugTextViewHelper a;

        private Updater() {
        }

        Updater(androidx.media3.exoplayer.util.DebugTextViewHelper.1 debugTextViewHelper$10) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void A(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void C(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void E(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void F(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void H(int v, boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void I(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void J(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void L(Commands player$Commands0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void N(Player player0, Events player$Events0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Q(Timeline timeline0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void R(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void S(Tracks tracks0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void T(DeviceInfo deviceInfo0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void V(boolean z, int v) {
            DebugTextViewHelper.this.k();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
            DebugTextViewHelper.this.k();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Z(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a(VideoSize videoSize0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void c0(int v) {
            DebugTextViewHelper.this.k();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void d(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void f0(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void g0(TrackSelectionParameters trackSelectionParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void h0() {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void i0(MediaItem mediaItem0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void l0(int v, int v1) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void o0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void p0(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q(PlaybackParameters playbackParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q0(float f) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r(List list0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r0(AudioAttributes audioAttributes0) {
        }

        @Override
        public void run() {
            DebugTextViewHelper.this.k();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void u0(boolean z, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void v0(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w(CueGroup cueGroup0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w0(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x(Metadata metadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x0(long v) {
        }
    }

    private final ExoPlayer a;
    private final TextView b;
    private final Updater c;
    private boolean d;
    private static final int e = 1000;

    public DebugTextViewHelper(ExoPlayer exoPlayer0, TextView textView0) {
        Assertions.a(exoPlayer0.P1() == Looper.getMainLooper());
        this.a = exoPlayer0;
        this.b = textView0;
        this.c = new Updater(this, null);
    }

    @UnstableApi
    protected String a() {
        Format format0 = this.a.e2();
        DecoderCounters decoderCounters0 = this.a.g1();
        return format0 == null || decoderCounters0 == null ? "" : "\n" + format0.n + "(id:" + format0.a + " hz:" + format0.C + " ch:" + format0.B + DebugTextViewHelper.d(decoderCounters0) + ")";
    }

    private static String b(@Nullable ColorInfo colorInfo0) {
        return colorInfo0 == null || !colorInfo0.k() ? "" : " colr:" + colorInfo0.p();
    }

    @UnstableApi
    protected String c() {
        return this.f() + this.h() + this.a();
    }

    private static String d(DecoderCounters decoderCounters0) {
        return decoderCounters0 == null ? "" : " sib:" + decoderCounters0.d + " sb:" + decoderCounters0.f + " rb:" + decoderCounters0.e + " db:" + decoderCounters0.g + " mcdb:" + decoderCounters0.i + " dk:" + decoderCounters0.j;
    }

    private static String e(float f) {
        return f == -1.0f || f == 1.0f ? "" : " par:" + String.format(Locale.US, "%.02f", f);
    }

    @UnstableApi
    protected String f() {
        int v = this.a.b();
        switch(v) {
            case 1: {
                return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.D0()), "idle", this.a.n2());
            }
            case 2: {
                return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.D0()), "buffering", this.a.n2());
            }
            case 3: {
                return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.D0()), "ready", this.a.n2());
            }
            default: {
                return v == 4 ? String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.D0()), "ended", this.a.n2()) : String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.D0()), "unknown", this.a.n2());
            }
        }
    }

    private static String g(long v, int v1) {
        return v1 == 0 ? "N/A" : String.valueOf(((long)(((double)v) / ((double)v1))));
    }

    @UnstableApi
    protected String h() {
        Format format0 = this.a.E1();
        VideoSize videoSize0 = this.a.O();
        DecoderCounters decoderCounters0 = this.a.U0();
        return format0 == null || decoderCounters0 == null ? "" : "\n" + format0.n + "(id:" + format0.a + " r:" + videoSize0.a + "x" + videoSize0.b + DebugTextViewHelper.b(format0.A) + DebugTextViewHelper.e(videoSize0.d) + DebugTextViewHelper.d(decoderCounters0) + " vfpo: " + DebugTextViewHelper.g(decoderCounters0.k, decoderCounters0.l) + ")";
    }

    public final void i() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.a.M1(this.c);
        this.k();
    }

    public final void j() {
        if(!this.d) {
            return;
        }
        this.d = false;
        this.a.J1(this.c);
        this.b.removeCallbacks(this.c);
    }

    @SuppressLint({"SetTextI18n"})
    @UnstableApi
    protected final void k() {
        String s = this.c();
        this.b.setText(s);
        this.b.removeCallbacks(this.c);
        this.b.postDelayed(this.c, 1000L);
    }

    class androidx.media3.exoplayer.util.DebugTextViewHelper.1 {
    }

}

