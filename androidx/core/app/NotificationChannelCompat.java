package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public class NotificationChannelCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static boolean a(NotificationChannel notificationChannel0) {
            return notificationChannel0.canBypassDnd();
        }

        static boolean b(NotificationChannel notificationChannel0) {
            return notificationChannel0.canShowBadge();
        }

        static NotificationChannel c(String s, CharSequence charSequence0, int v) {
            return new NotificationChannel(s, charSequence0, v);
        }

        static void d(NotificationChannel notificationChannel0, boolean z) {
            notificationChannel0.enableLights(z);
        }

        static void e(NotificationChannel notificationChannel0, boolean z) {
            notificationChannel0.enableVibration(z);
        }

        static AudioAttributes f(NotificationChannel notificationChannel0) {
            return notificationChannel0.getAudioAttributes();
        }

        static String g(NotificationChannel notificationChannel0) {
            return notificationChannel0.getDescription();
        }

        static String h(NotificationChannel notificationChannel0) {
            return notificationChannel0.getGroup();
        }

        static String i(NotificationChannel notificationChannel0) {
            return notificationChannel0.getId();
        }

        static int j(NotificationChannel notificationChannel0) {
            return notificationChannel0.getImportance();
        }

        static int k(NotificationChannel notificationChannel0) {
            return notificationChannel0.getLightColor();
        }

        static int l(NotificationChannel notificationChannel0) {
            return notificationChannel0.getLockscreenVisibility();
        }

        static CharSequence m(NotificationChannel notificationChannel0) {
            return notificationChannel0.getName();
        }

        static Uri n(NotificationChannel notificationChannel0) {
            return notificationChannel0.getSound();
        }

        static long[] o(NotificationChannel notificationChannel0) {
            return notificationChannel0.getVibrationPattern();
        }

        static void p(NotificationChannel notificationChannel0, String s) {
            notificationChannel0.setDescription(s);
        }

        static void q(NotificationChannel notificationChannel0, String s) {
            notificationChannel0.setGroup(s);
        }

        static void r(NotificationChannel notificationChannel0, int v) {
            notificationChannel0.setLightColor(v);
        }

        static void s(NotificationChannel notificationChannel0, boolean z) {
            notificationChannel0.setShowBadge(z);
        }

        static void t(NotificationChannel notificationChannel0, Uri uri0, AudioAttributes audioAttributes0) {
            notificationChannel0.setSound(uri0, audioAttributes0);
        }

        static void u(NotificationChannel notificationChannel0, long[] arr_v) {
            notificationChannel0.setVibrationPattern(arr_v);
        }

        static boolean v(NotificationChannel notificationChannel0) {
            return notificationChannel0.shouldShowLights();
        }

        static boolean w(NotificationChannel notificationChannel0) {
            return notificationChannel0.shouldVibrate();
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static boolean a(NotificationChannel notificationChannel0) {
            return notificationChannel0.canBubble();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static String a(NotificationChannel notificationChannel0) {
            return notificationChannel0.getConversationId();
        }

        static String b(NotificationChannel notificationChannel0) {
            return notificationChannel0.getParentChannelId();
        }

        static boolean c(NotificationChannel notificationChannel0) {
            return notificationChannel0.isImportantConversation();
        }

        static void d(NotificationChannel notificationChannel0, String s, String s1) {
            notificationChannel0.setConversationId(s, s1);
        }
    }

    public static class Builder {
        private final NotificationChannelCompat a;

        public Builder(String s, int v) {
            this.a = new NotificationChannelCompat(s, v);
        }

        public NotificationChannelCompat a() {
            return this.a;
        }

        public Builder b(String s, String s1) {
            if(Build.VERSION.SDK_INT >= 30) {
                this.a.m = s;
                this.a.n = s1;
            }
            return this;
        }

        public Builder c(String s) {
            this.a.d = s;
            return this;
        }

        public Builder d(String s) {
            this.a.e = s;
            return this;
        }

        public Builder e(int v) {
            this.a.c = v;
            return this;
        }

        public Builder f(int v) {
            this.a.j = v;
            return this;
        }

        public Builder g(boolean z) {
            this.a.i = z;
            return this;
        }

        public Builder h(CharSequence charSequence0) {
            this.a.b = charSequence0;
            return this;
        }

        public Builder i(boolean z) {
            this.a.f = z;
            return this;
        }

        public Builder j(Uri uri0, AudioAttributes audioAttributes0) {
            this.a.g = uri0;
            this.a.h = audioAttributes0;
            return this;
        }

        public Builder k(boolean z) {
            this.a.k = z;
            return this;
        }

        public Builder l(long[] arr_v) {
            this.a.k = arr_v != null && arr_v.length > 0;
            this.a.l = arr_v;
            return this;
        }
    }

    final String a;
    CharSequence b;
    int c;
    String d;
    String e;
    boolean f;
    Uri g;
    AudioAttributes h;
    boolean i;
    int j;
    boolean k;
    long[] l;
    String m;
    String n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    public static final String s = "miscellaneous";
    private static final boolean t = true;
    private static final int u;

    @RequiresApi(26)
    NotificationChannelCompat(NotificationChannel notificationChannel0) {
        this(Api26Impl.i(notificationChannel0), Api26Impl.j(notificationChannel0));
        this.b = Api26Impl.m(notificationChannel0);
        this.d = Api26Impl.g(notificationChannel0);
        this.e = Api26Impl.h(notificationChannel0);
        this.f = Api26Impl.b(notificationChannel0);
        this.g = Api26Impl.n(notificationChannel0);
        this.h = Api26Impl.f(notificationChannel0);
        this.i = Api26Impl.v(notificationChannel0);
        this.j = Api26Impl.k(notificationChannel0);
        this.k = Api26Impl.w(notificationChannel0);
        this.l = Api26Impl.o(notificationChannel0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            this.m = Api30Impl.b(notificationChannel0);
            this.n = Api30Impl.a(notificationChannel0);
        }
        this.o = Api26Impl.a(notificationChannel0);
        this.p = Api26Impl.l(notificationChannel0);
        if(v >= 29) {
            this.q = Api29Impl.a(notificationChannel0);
        }
        if(v >= 30) {
            this.r = Api30Impl.c(notificationChannel0);
        }
    }

    NotificationChannelCompat(String s, int v) {
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = (String)Preconditions.l(s);
        this.c = v;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.q;
    }

    public boolean b() {
        return this.o;
    }

    public boolean c() {
        return this.f;
    }

    public AudioAttributes d() {
        return this.h;
    }

    public String e() {
        return this.n;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.a;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.p;
    }

    public CharSequence l() {
        return this.b;
    }

    NotificationChannel m() {
        int v = Build.VERSION.SDK_INT;
        if(v < 26) {
            return null;
        }
        NotificationChannel notificationChannel0 = Api26Impl.c(this.a, this.b, this.c);
        Api26Impl.p(notificationChannel0, this.d);
        Api26Impl.q(notificationChannel0, this.e);
        Api26Impl.s(notificationChannel0, this.f);
        Api26Impl.t(notificationChannel0, this.g, this.h);
        Api26Impl.d(notificationChannel0, this.i);
        Api26Impl.r(notificationChannel0, this.j);
        Api26Impl.u(notificationChannel0, this.l);
        Api26Impl.e(notificationChannel0, this.k);
        if(v >= 30) {
            String s = this.m;
            if(s != null) {
                String s1 = this.n;
                if(s1 != null) {
                    Api30Impl.d(notificationChannel0, s, s1);
                }
            }
        }
        return notificationChannel0;
    }

    public String n() {
        return this.m;
    }

    public Uri o() {
        return this.g;
    }

    public long[] p() {
        return this.l;
    }

    public boolean q() {
        return this.r;
    }

    public boolean r() {
        return this.i;
    }

    public boolean s() {
        return this.k;
    }

    public Builder t() {
        return new Builder(this.a, this.c).h(this.b).c(this.d).d(this.e).i(this.f).j(this.g, this.h).g(this.i).f(this.j).k(this.k).l(this.l).b(this.m, this.n);
    }
}

