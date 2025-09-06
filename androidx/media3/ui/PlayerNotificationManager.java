package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.app.Notification.MediaStyle;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession.Token;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.Style;
import androidx.core.app.NotificationManagerCompat;
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
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UnstableApi
public class PlayerNotificationManager {
    public final class BitmapCallback {
        private final int a;
        final PlayerNotificationManager b;

        private BitmapCallback(int v) {
            this.a = v;
        }

        BitmapCallback(int v, androidx.media3.ui.PlayerNotificationManager.1 playerNotificationManager$10) {
            this(v);
        }

        public void a(Bitmap bitmap0) {
            if(bitmap0 != null) {
                PlayerNotificationManager.this.s(bitmap0, this.a);
            }
        }
    }

    public static class Builder {
        protected final Context a;
        protected final int b;
        protected final String c;
        @Nullable
        protected NotificationListener d;
        @Nullable
        protected CustomActionReceiver e;
        protected MediaDescriptionAdapter f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected int k;
        protected int l;
        protected int m;
        protected int n;
        protected int o;
        protected int p;
        protected int q;
        @Nullable
        protected String r;

        public Builder(Context context0, @IntRange(from = 1L) int v, String s) {
            Assertions.a(v > 0);
            this.a = context0;
            this.b = v;
            this.c = s;
            this.i = 2;
            this.f = new DefaultMediaDescriptionAdapter(null);
            this.j = drawable.exo_notification_small_icon;
            this.l = drawable.exo_notification_play;
            this.m = drawable.exo_notification_pause;
            this.n = drawable.exo_notification_stop;
            this.k = drawable.exo_notification_rewind;
            this.o = drawable.exo_notification_fastforward;
            this.p = drawable.exo_notification_previous;
            this.q = drawable.exo_notification_next;
        }

        @Deprecated
        public Builder(Context context0, int v, String s, MediaDescriptionAdapter playerNotificationManager$MediaDescriptionAdapter0) {
            this(context0, v, s);
            this.f = playerNotificationManager$MediaDescriptionAdapter0;
        }

        public PlayerNotificationManager a() {
            int v = this.g;
            if(v != 0) {
                NotificationUtil.a(this.a, this.c, v, this.h, this.i);
            }
            return new PlayerNotificationManager(this.a, this.c, this.b, this.f, this.d, this.e, this.j, this.l, this.m, this.n, this.k, this.o, this.p, this.q, this.r);
        }

        public Builder b(int v) {
            this.h = v;
            return this;
        }

        public Builder c(int v) {
            this.i = v;
            return this;
        }

        public Builder d(int v) {
            this.g = v;
            return this;
        }

        public Builder e(CustomActionReceiver playerNotificationManager$CustomActionReceiver0) {
            this.e = playerNotificationManager$CustomActionReceiver0;
            return this;
        }

        public Builder f(int v) {
            this.o = v;
            return this;
        }

        public Builder g(String s) {
            this.r = s;
            return this;
        }

        public Builder h(MediaDescriptionAdapter playerNotificationManager$MediaDescriptionAdapter0) {
            this.f = playerNotificationManager$MediaDescriptionAdapter0;
            return this;
        }

        public Builder i(int v) {
            this.q = v;
            return this;
        }

        public Builder j(NotificationListener playerNotificationManager$NotificationListener0) {
            this.d = playerNotificationManager$NotificationListener0;
            return this;
        }

        public Builder k(int v) {
            this.m = v;
            return this;
        }

        public Builder l(int v) {
            this.l = v;
            return this;
        }

        public Builder m(int v) {
            this.p = v;
            return this;
        }

        public Builder n(int v) {
            this.k = v;
            return this;
        }

        public Builder o(int v) {
            this.j = v;
            return this;
        }

        public Builder p(int v) {
            this.n = v;
            return this;
        }
    }

    public interface CustomActionReceiver {
        Map a(Context arg1, int arg2);

        void b(Player arg1, String arg2, Intent arg3);

        List c(Player arg1);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        Bitmap a(Player arg1, BitmapCallback arg2);

        @Nullable
        CharSequence b(Player arg1);

        @Nullable
        CharSequence c(Player arg1);

        CharSequence d(Player arg1);

        @Nullable
        PendingIntent e(Player arg1);
    }

    @RequiresApi(21)
    static final class MediaStyle extends Style {
        private final int[] e;
        @Nullable
        private final MediaSession.Token f;

        public MediaStyle(@Nullable MediaSession.Token mediaSession$Token0, int[] arr_v) {
            this.f = mediaSession$Token0;
            this.e = arr_v;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.MediaStyle notification$MediaStyle0 = new Notification.MediaStyle();
            notification$MediaStyle0.setShowActionsInCompactView(this.e);
            MediaSession.Token mediaSession$Token0 = this.f;
            if(mediaSession$Token0 != null) {
                notification$MediaStyle0.setMediaSession(mediaSession$Token0);
            }
            notificationBuilderWithBuilderAccessor0.a().setStyle(notification$MediaStyle0);
        }
    }

    class NotificationBroadcastReceiver extends BroadcastReceiver {
        final PlayerNotificationManager a;

        private NotificationBroadcastReceiver() {
        }

        NotificationBroadcastReceiver(androidx.media3.ui.PlayerNotificationManager.1 playerNotificationManager$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            Player player0 = PlayerNotificationManager.this.r;
            if(player0 != null && PlayerNotificationManager.this.s && intent0.getIntExtra("INSTANCE_ID", PlayerNotificationManager.this.o) == PlayerNotificationManager.this.o) {
                String s = intent0.getAction();
                if("androidx.media3.ui.notification.play".equals(s)) {
                    Util.R0(player0);
                    return;
                }
                if("androidx.media3.ui.notification.pause".equals(s)) {
                    Util.Q0(player0);
                    return;
                }
                if("androidx.media3.ui.notification.prev".equals(s)) {
                    if(player0.v0(7)) {
                        player0.B1();
                    }
                }
                else if("androidx.media3.ui.notification.rewind".equals(s)) {
                    if(player0.v0(11)) {
                        player0.v2();
                    }
                }
                else if("androidx.media3.ui.notification.ffwd".equals(s)) {
                    if(player0.v0(12)) {
                        player0.f1();
                    }
                }
                else if("androidx.media3.ui.notification.next".equals(s)) {
                    if(player0.v0(9)) {
                        player0.R1();
                    }
                }
                else if("androidx.media3.ui.notification.stop".equals(s)) {
                    if(player0.v0(3)) {
                        player0.stop();
                    }
                    if(player0.v0(20)) {
                        player0.l1();
                    }
                }
                else {
                    if("androidx.media3.ui.notification.dismiss".equals(s)) {
                        PlayerNotificationManager.this.R(true);
                        return;
                    }
                    if(s != null && PlayerNotificationManager.this.f != null && PlayerNotificationManager.this.m.containsKey(s)) {
                        PlayerNotificationManager.this.f.b(player0, s, intent0);
                    }
                }
            }
        }
    }

    public interface NotificationListener {
        void a(int arg1, Notification arg2, boolean arg3);

        void b(int arg1, boolean arg2);
    }

    class PlayerListener implements Listener {
        final PlayerNotificationManager a;

        private PlayerListener() {
        }

        PlayerListener(androidx.media3.ui.PlayerNotificationManager.1 playerNotificationManager$10) {
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
            if(player$Events0.b(new int[]{4, 5, 7, 0, 12, 11, 8, 9, 14})) {
                PlayerNotificationManager.this.r();
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

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Priority {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Visibility {
    }

    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    @DrawableRes
    private int K;
    private int L;
    private int M;
    private boolean N;
    @Nullable
    private String O;
    public static final String P = "androidx.media3.ui.notification.play";
    public static final String Q = "androidx.media3.ui.notification.pause";
    public static final String R = "androidx.media3.ui.notification.prev";
    public static final String S = "androidx.media3.ui.notification.next";
    public static final String T = "androidx.media3.ui.notification.ffwd";
    public static final String U = "androidx.media3.ui.notification.rewind";
    public static final String V = "androidx.media3.ui.notification.stop";
    public static final String W = "INSTANCE_ID";
    private static final String X = "androidx.media3.ui.notification.dismiss";
    private static final int Y = 1;
    private static final int Z = 2;
    private final Context a;
    private static int a0;
    private final String b;
    private final int c;
    private final MediaDescriptionAdapter d;
    @Nullable
    private final NotificationListener e;
    @Nullable
    private final CustomActionReceiver f;
    private final Handler g;
    private final NotificationManagerCompat h;
    private final IntentFilter i;
    private final Listener j;
    private final NotificationBroadcastReceiver k;
    private final Map l;
    private final Map m;
    private final PendingIntent n;
    private final int o;
    @Nullable
    private androidx.core.app.NotificationCompat.Builder p;
    @Nullable
    private List q;
    @Nullable
    private Player r;
    private boolean s;
    private int t;
    @Nullable
    private MediaSession.Token u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    protected PlayerNotificationManager(Context context0, String s, int v, MediaDescriptionAdapter playerNotificationManager$MediaDescriptionAdapter0, @Nullable NotificationListener playerNotificationManager$NotificationListener0, @Nullable CustomActionReceiver playerNotificationManager$CustomActionReceiver0, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, @Nullable String s1) {
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.b = s;
        this.c = v;
        this.d = playerNotificationManager$MediaDescriptionAdapter0;
        this.e = playerNotificationManager$NotificationListener0;
        this.f = playerNotificationManager$CustomActionReceiver0;
        this.K = v1;
        this.O = s1;
        int v9 = PlayerNotificationManager.a0;
        PlayerNotificationManager.a0 = v9 + 1;
        this.o = v9;
        this.g = Util.G(Looper.getMainLooper(), (Message message0) -> {
            switch(message0.what) {
                case 1: {
                    Player player0 = this.r;
                    if(player0 != null) {
                        this.Q(player0, null);
                        return true;
                    }
                    break;
                }
                case 2: {
                    Player player1 = this.r;
                    if(player1 != null && this.s && this.t == message0.arg1) {
                        this.Q(player1, ((Bitmap)message0.obj));
                        return true;
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        });
        this.h = NotificationManagerCompat.q(context1);
        this.j = new PlayerListener(this, null);
        this.k = new NotificationBroadcastReceiver(this, null);
        this.i = new IntentFilter();
        this.v = true;
        this.w = true;
        this.D = true;
        this.E = true;
        this.z = true;
        this.A = true;
        this.H = true;
        this.N = true;
        this.J = 0;
        this.I = 0;
        this.M = -1;
        this.G = 1;
        this.L = 1;
        Map map0 = PlayerNotificationManager.l(context1, v9, v2, v3, v4, v5, v6, v7, v8);
        this.l = map0;
        for(Object object0: map0.keySet()) {
            this.i.addAction(((String)object0));
        }
        Map map1 = playerNotificationManager$CustomActionReceiver0 == null ? Collections.emptyMap() : playerNotificationManager$CustomActionReceiver0.a(context1, this.o);
        this.m = map1;
        for(Object object1: map1.keySet()) {
            this.i.addAction(((String)object1));
        }
        this.n = PlayerNotificationManager.j("androidx.media3.ui.notification.dismiss", context1, this.o);
        this.i.addAction("androidx.media3.ui.notification.dismiss");
    }

    public final void A(@Nullable Player player0) {
        boolean z = true;
        Assertions.i(Looper.myLooper() == Looper.getMainLooper());
        if(player0 != null && player0.P1() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.a(z);
        Player player1 = this.r;
        if(player1 == player0) {
            return;
        }
        if(player1 != null) {
            player1.J1(this.j);
            if(player0 == null) {
                this.R(false);
            }
        }
        this.r = player0;
        if(player0 != null) {
            player0.M1(this.j);
            this.r();
        }
    }

    public final void B(int v) {
        if(this.M == v) {
            return;
        }
        if(v != -2 && (v != -1 && v != 0) && (v != 1 && v != 2)) {
            throw new IllegalArgumentException();
        }
        this.M = v;
        this.q();
    }

    public void C(boolean z) {
        if(this.E != z) {
            this.E = z;
            this.q();
        }
    }

    public final void D(@DrawableRes int v) {
        if(this.K != v) {
            this.K = v;
            this.q();
        }
    }

    public final void E(boolean z) {
        if(this.N != z) {
            this.N = z;
            this.q();
        }
    }

    public final void F(boolean z) {
        if(this.A != z) {
            this.A = z;
            this.q();
        }
    }

    public final void G(boolean z) {
        if(this.C != z) {
            this.C = z;
            if(z) {
                this.y = false;
            }
            this.q();
        }
    }

    public final void H(boolean z) {
        if(this.w != z) {
            this.w = z;
            this.q();
        }
    }

    public final void I(boolean z) {
        if(this.y != z) {
            this.y = z;
            if(z) {
                this.C = false;
            }
            this.q();
        }
    }

    public final void J(boolean z) {
        if(this.D != z) {
            this.D = z;
            this.q();
        }
    }

    public final void K(boolean z) {
        if(this.v != z) {
            this.v = z;
            this.q();
        }
    }

    public final void L(boolean z) {
        if(this.x != z) {
            this.x = z;
            if(z) {
                this.B = false;
            }
            this.q();
        }
    }

    public final void M(boolean z) {
        if(this.z != z) {
            this.z = z;
            this.q();
        }
    }

    public final void N(boolean z) {
        if(this.B != z) {
            this.B = z;
            if(z) {
                this.x = false;
            }
            this.q();
        }
    }

    public final void O(boolean z) {
        if(this.F == z) {
            return;
        }
        this.F = z;
        this.q();
    }

    public final void P(int v) {
        if(this.L == v) {
            return;
        }
        if(v != -1 && v != 0 && v != 1) {
            throw new IllegalStateException();
        }
        this.L = v;
        this.q();
    }

    @SuppressLint({"MissingPermission"})
    private void Q(Player player0, @Nullable Bitmap bitmap0) {
        boolean z = this.o(player0);
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = this.k(player0, this.p, z, bitmap0);
        this.p = notificationCompat$Builder0;
        boolean z1 = false;
        if(notificationCompat$Builder0 == null) {
            this.R(false);
            return;
        }
        Notification notification0 = notificationCompat$Builder0.h();
        this.h.F(this.c, notification0);
        if(!this.s) {
            Util.U1(this.a, this.k, this.i);
        }
        NotificationListener playerNotificationManager$NotificationListener0 = this.e;
        if(playerNotificationManager$NotificationListener0 != null) {
            int v = this.c;
            if(z || !this.s) {
                z1 = true;
            }
            playerNotificationManager$NotificationListener0.a(v, notification0, z1);
        }
        this.s = true;
    }

    private void R(boolean z) {
        if(this.s) {
            this.s = false;
            this.g.removeMessages(1);
            this.h.c(this.c);
            this.a.unregisterReceiver(this.k);
            NotificationListener playerNotificationManager$NotificationListener0 = this.e;
            if(playerNotificationManager$NotificationListener0 != null) {
                playerNotificationManager$NotificationListener0.b(this.c, z);
            }
        }
    }

    private static PendingIntent j(String s, Context context0, int v) {
        Intent intent0 = new Intent(s).setPackage("com.dcinside.app.android");
        intent0.putExtra("INSTANCE_ID", v);
        return Util.a < 23 ? PendingIntent.getBroadcast(context0, v, intent0, 0x8000000) : PendingIntent.getBroadcast(context0, v, intent0, 0xC000000);
    }

    @Nullable
    protected androidx.core.app.NotificationCompat.Builder k(Player player0, @Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0, boolean z, @Nullable Bitmap bitmap0) {
        if(player0.b() == 1 && player0.v0(17) && player0.O1().w()) {
            this.q = null;
            return null;
        }
        List list0 = this.n(player0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            Action notificationCompat$Action0 = this.l.containsKey(s) ? ((Action)this.l.get(s)) : ((Action)this.m.get(s));
            if(notificationCompat$Action0 != null) {
                arrayList0.add(notificationCompat$Action0);
            }
        }
        if(notificationCompat$Builder0 == null || !arrayList0.equals(this.q)) {
            notificationCompat$Builder0 = new androidx.core.app.NotificationCompat.Builder(this.a, this.b);
            this.q = arrayList0;
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                notificationCompat$Builder0.b(((Action)arrayList0.get(v1)));
            }
        }
        int[] arr_v = this.m(list0, player0);
        int v2 = Util.a;
        if(v2 >= 21) {
            notificationCompat$Builder0.z0(new MediaStyle(this.u, arr_v));
        }
        else {
            androidx.media.app.NotificationCompat.MediaStyle notificationCompat$MediaStyle0 = new androidx.media.app.NotificationCompat.MediaStyle();
            notificationCompat$MediaStyle0.J(arr_v);
            notificationCompat$MediaStyle0.G(this.n);
            notificationCompat$Builder0.z0(notificationCompat$MediaStyle0);
        }
        notificationCompat$Builder0.T(this.n);
        notificationCompat$Builder0.D(this.G).i0(z).I(this.J).J(this.H).t0(this.K).G0(this.L).k0(this.M).S(this.I);
        if(v2 < 21 || !this.N || !player0.v0(16) || !player0.isPlaying() || player0.W() || player0.L1() || player0.m().a != 1.0f) {
            notificationCompat$Builder0.r0(false).E0(false);
        }
        else {
            notificationCompat$Builder0.H0(System.currentTimeMillis() - player0.d2()).r0(true).E0(true);
        }
        notificationCompat$Builder0.O(this.d.d(player0));
        notificationCompat$Builder0.N(this.d.c(player0));
        notificationCompat$Builder0.A0(this.d.b(player0));
        if(bitmap0 == null) {
            int v3 = this.t + 1;
            this.t = v3;
            BitmapCallback playerNotificationManager$BitmapCallback0 = new BitmapCallback(this, v3, null);
            bitmap0 = this.d.a(player0, playerNotificationManager$BitmapCallback0);
        }
        PlayerNotificationManager.x(notificationCompat$Builder0, bitmap0);
        notificationCompat$Builder0.M(this.d.e(player0));
        String s1 = this.O;
        if(s1 != null) {
            notificationCompat$Builder0.Y(s1);
        }
        notificationCompat$Builder0.j0(true);
        return notificationCompat$Builder0;
    }

    private static Map l(Context context0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        Map map0 = new HashMap();
        map0.put("androidx.media3.ui.notification.play", new Action(v1, context0.getString(string.exo_controls_play_description), PlayerNotificationManager.j("androidx.media3.ui.notification.play", context0, v)));
        map0.put("androidx.media3.ui.notification.pause", new Action(v2, context0.getString(string.exo_controls_pause_description), PlayerNotificationManager.j("androidx.media3.ui.notification.pause", context0, v)));
        map0.put("androidx.media3.ui.notification.stop", new Action(v3, context0.getString(string.exo_controls_stop_description), PlayerNotificationManager.j("androidx.media3.ui.notification.stop", context0, v)));
        map0.put("androidx.media3.ui.notification.rewind", new Action(v4, context0.getString(string.exo_controls_rewind_description), PlayerNotificationManager.j("androidx.media3.ui.notification.rewind", context0, v)));
        map0.put("androidx.media3.ui.notification.ffwd", new Action(v5, context0.getString(string.exo_controls_fastforward_description), PlayerNotificationManager.j("androidx.media3.ui.notification.ffwd", context0, v)));
        map0.put("androidx.media3.ui.notification.prev", new Action(v6, context0.getString(string.exo_controls_previous_description), PlayerNotificationManager.j("androidx.media3.ui.notification.prev", context0, v)));
        map0.put("androidx.media3.ui.notification.next", new Action(v7, context0.getString(string.exo_controls_next_description), PlayerNotificationManager.j("androidx.media3.ui.notification.next", context0, v)));
        return map0;
    }

    protected int[] m(List list0, Player player0) {
        int v3;
        int v2;
        int v = list0.indexOf("androidx.media3.ui.notification.pause");
        int v1 = list0.indexOf("androidx.media3.ui.notification.play");
        if(this.x) {
            v2 = list0.indexOf("androidx.media3.ui.notification.prev");
        }
        else {
            v2 = this.B ? list0.indexOf("androidx.media3.ui.notification.rewind") : -1;
        }
        if(this.y) {
            v3 = list0.indexOf("androidx.media3.ui.notification.next");
        }
        else {
            v3 = this.C ? list0.indexOf("androidx.media3.ui.notification.ffwd") : -1;
        }
        int[] arr_v = new int[3];
        int v4 = 0;
        if(v2 != -1) {
            arr_v[0] = v2;
            v4 = 1;
        }
        boolean z = Util.j2(player0, this.E);
        if(v != -1 && !z) {
            arr_v[v4] = v;
            ++v4;
        }
        else if(v1 != -1 && z) {
            arr_v[v4] = v1;
            ++v4;
        }
        if(v3 != -1) {
            arr_v[v4] = v3;
            ++v4;
        }
        return Arrays.copyOf(arr_v, v4);
    }

    protected List n(Player player0) {
        boolean z = player0.v0(7);
        boolean z1 = player0.v0(11);
        boolean z2 = player0.v0(12);
        boolean z3 = player0.v0(9);
        List list0 = new ArrayList();
        if(this.v && z) {
            list0.add("androidx.media3.ui.notification.prev");
        }
        if(this.z && z1) {
            list0.add("androidx.media3.ui.notification.rewind");
        }
        if(this.D) {
            if(Util.j2(player0, this.E)) {
                list0.add("androidx.media3.ui.notification.play");
            }
            else {
                list0.add("androidx.media3.ui.notification.pause");
            }
        }
        if(this.A && z2) {
            list0.add("androidx.media3.ui.notification.ffwd");
        }
        if(this.w && z3) {
            list0.add("androidx.media3.ui.notification.next");
        }
        CustomActionReceiver playerNotificationManager$CustomActionReceiver0 = this.f;
        if(playerNotificationManager$CustomActionReceiver0 != null) {
            list0.addAll(playerNotificationManager$CustomActionReceiver0.c(player0));
        }
        if(this.F) {
            list0.add("androidx.media3.ui.notification.stop");
        }
        return list0;
    }

    protected boolean o(Player player0) {
        switch(player0.b()) {
            case 2: 
            case 3: {
                return player0.D0();
            }
            default: {
                return false;
            }
        }
    }

    // 检测为 Lambda 实现
    private boolean p(Message message0) [...]

    public final void q() {
        if(this.s) {
            this.r();
        }
    }

    private void r() {
        if(!this.g.hasMessages(1)) {
            this.g.sendEmptyMessage(1);
        }
    }

    private void s(Bitmap bitmap0, int v) {
        this.g.obtainMessage(2, v, -1, bitmap0).sendToTarget();
    }

    public final void t(int v) {
        if(this.G == v) {
            return;
        }
        if(v != 0 && v != 1 && v != 2) {
            throw new IllegalArgumentException();
        }
        this.G = v;
        this.q();
    }

    public final void u(int v) {
        if(this.J != v) {
            this.J = v;
            this.q();
        }
    }

    public final void v(boolean z) {
        if(this.H != z) {
            this.H = z;
            this.q();
        }
    }

    public final void w(int v) {
        if(this.I != v) {
            this.I = v;
            this.q();
        }
    }

    private static void x(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0, @Nullable Bitmap bitmap0) {
        notificationCompat$Builder0.b0(bitmap0);
    }

    @RequiresApi(21)
    public final void y(MediaSession.Token mediaSession$Token0) {
        if(!Util.g(this.u, mediaSession$Token0)) {
            this.u = mediaSession$Token0;
            this.q();
        }
    }

    @Deprecated
    public final void z(Token mediaSessionCompat$Token0) {
        if(Util.a >= 21) {
            this.y(((MediaSession.Token)mediaSessionCompat$Token0.g()));
        }
    }

    class androidx.media3.ui.PlayerNotificationManager.1 {
    }

}

