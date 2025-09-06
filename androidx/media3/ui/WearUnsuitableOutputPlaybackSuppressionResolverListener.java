package androidx.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
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
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.List;
import java.util.concurrent.TimeUnit;

@UnstableApi
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Listener {
    private final Context a;
    private final long b;
    private final Clock c;
    private long d;
    private static final String e = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private static final String f = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final String g = "EXTRA_CLOSE_ON_CONNECT";
    private static final String h = "EXTRA_CONNECTION_ONLY";
    private static final String i = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final int j = 1;
    public static final long k;

    static {
        WearUnsuitableOutputPlaybackSuppressionResolverListener.k = TimeUnit.MINUTES.toMillis(5L);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context0) {
        this(context0, WearUnsuitableOutputPlaybackSuppressionResolverListener.k);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context0, @IntRange(from = 0L) long v) {
        this(context0, v, Clock.a);
    }

    @VisibleForTesting
    WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context0, @IntRange(from = 0L) long v, Clock clock0) {
        Assertions.a(v >= 0L);
        this.a = context0.getApplicationContext();
        this.b = v;
        this.c = clock0;
        this.d = 0x8000000000000001L;
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

    private static void G(Context context0) {
        Intent intent0 = new Intent("com.android.settings.panel.action.MEDIA_OUTPUT").addFlags(0x10000000).putExtra("com.android.settings.panel.extra.PACKAGE_NAME", "com.dcinside.app.android");
        ComponentName componentName0 = WearUnsuitableOutputPlaybackSuppressionResolverListener.u(context0, intent0);
        if(componentName0 != null) {
            intent0.setComponent(componentName0);
            context0.startActivity(intent0);
            return;
        }
        Intent intent1 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(0x10008000).putExtra("EXTRA_CLOSE_ON_CONNECT", true).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
        ComponentName componentName1 = WearUnsuitableOutputPlaybackSuppressionResolverListener.u(context0, intent1);
        if(componentName1 != null) {
            intent1.setComponent(componentName1);
            context0.startActivity(intent1);
        }
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
        if(!Util.o1(this.a)) {
            return;
        }
        if((player$Events0.a(6) || player$Events0.a(5)) && player0.D0() && player0.N1() == 3) {
            player0.pause();
            this.d = this.c.elapsedRealtime();
            if(player$Events0.a(5)) {
                WearUnsuitableOutputPlaybackSuppressionResolverListener.G(this.a);
            }
        }
        else if(player$Events0.a(6) && player0.N1() == 0 && this.d != 0x8000000000000001L && this.c.elapsedRealtime() - this.d < this.b) {
            this.d = 0x8000000000000001L;
            player0.c();
        }
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
    }

    @Override  // androidx.media3.common.Player$Listener
    public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
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

    @Nullable
    private static ComponentName u(Context context0, Intent intent0) {
        for(Object object0: context0.getPackageManager().queryIntentActivities(intent0, 0)) {
            ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
            if(activityInfo0 != null && (activityInfo0.applicationInfo != null && (activityInfo0.applicationInfo.flags & 0x81) != 0)) {
                return new ComponentName(activityInfo0.packageName, activityInfo0.name);
            }
            if(false) {
                break;
            }
        }
        return null;
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

