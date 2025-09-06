package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.c})
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    @RequiresApi(20)
    static class Api20Impl {
        static Notification.Builder a(Notification.Builder notification$Builder0, Notification.Action notification$Action0) {
            return notification$Builder0.addAction(notification$Action0);
        }

        static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
            return notification$Action$Builder0.addExtras(bundle0);
        }

        static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
            return notification$Action$Builder0.addRemoteInput(remoteInput0);
        }

        static Notification.Action d(Notification.Action.Builder notification$Action$Builder0) {
            return notification$Action$Builder0.build();
        }

        static Notification.Action.Builder e(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
        }

        static String f(Notification notification0) {
            return notification0.getGroup();
        }

        static Notification.Builder g(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setGroup(s);
        }

        static Notification.Builder h(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setGroupSummary(z);
        }

        static Notification.Builder i(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setLocalOnly(z);
        }

        static Notification.Builder j(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setSortKey(s);
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        static Notification.Builder a(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.addPerson(s);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setCategory(s);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setColor(v);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, Notification notification0) {
            return notification$Builder0.setPublicVersion(notification0);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, Uri uri0, Object object0) {
            return notification$Builder0.setSound(uri0, ((AudioAttributes)object0));
        }

        static Notification.Builder f(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setVisibility(v);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static Notification.Action.Builder a(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
            return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, Icon icon0) {
            return notification$Builder0.setLargeIcon(icon0);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, Object object0) {
            return notification$Builder0.setSmallIcon(((Icon)object0));
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setAllowGeneratedReplies(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomBigContentView(remoteViews0);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomContentView(remoteViews0);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomHeadsUpContentView(remoteViews0);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence[] arr_charSequence) {
            return notification$Builder0.setRemoteInputHistory(arr_charSequence);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static Notification.Builder a(Context context0, String s) {
            return new Notification.Builder(context0, s);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setBadgeIconType(v);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setColorized(z);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setGroupAlertBehavior(v);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence charSequence0) {
            return notification$Builder0.setSettingsText(charSequence0);
        }

        static Notification.Builder f(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setShortcutId(s);
        }

        static Notification.Builder g(Notification.Builder notification$Builder0, long v) {
            return notification$Builder0.setTimeoutAfter(v);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static Notification.Builder a(Notification.Builder notification$Builder0, Person person0) {
            return notification$Builder0.addPerson(person0);
        }

        static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, int v) {
            return notification$Action$Builder0.setSemanticAction(v);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static Notification.Builder a(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setAllowSystemGeneratedContextualActions(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, Notification.BubbleMetadata notification$BubbleMetadata0) {
            return notification$Builder0.setBubbleMetadata(notification$BubbleMetadata0);
        }

        static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setContextual(z);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, Object object0) {
            return notification$Builder0.setLocusId(((LocusId)object0));
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setAuthenticationRequired(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setForegroundServiceBehavior(v);
        }
    }

    private final Context a;
    private final Notification.Builder b;
    private final Builder c;
    private RemoteViews d;
    private RemoteViews e;
    private final List f;
    private final Bundle g;
    private int h;
    private RemoteViews i;

    NotificationCompatBuilder(Builder notificationCompat$Builder0) {
        this.f = new ArrayList();
        this.g = new Bundle();
        this.c = notificationCompat$Builder0;
        Context context0 = notificationCompat$Builder0.a;
        this.a = context0;
        int v = Build.VERSION.SDK_INT;
        this.b = v >= 26 ? Api26Impl.a(context0, notificationCompat$Builder0.L) : new Notification.Builder(notificationCompat$Builder0.a);
        Notification notification0 = notificationCompat$Builder0.U;
        this.b.setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, notificationCompat$Builder0.i).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(notificationCompat$Builder0.e).setContentText(notificationCompat$Builder0.f).setContentInfo(notificationCompat$Builder0.k).setContentIntent(notificationCompat$Builder0.g).setDeleteIntent(notification0.deleteIntent).setFullScreenIntent(notificationCompat$Builder0.h, (notification0.flags & 0x80) != 0).setNumber(notificationCompat$Builder0.l).setProgress(notificationCompat$Builder0.u, notificationCompat$Builder0.v, notificationCompat$Builder0.w);
        if(v < 23) {
            Bitmap bitmap0 = notificationCompat$Builder0.j == null ? null : notificationCompat$Builder0.j.t();
            this.b.setLargeIcon(bitmap0);
        }
        else {
            Icon icon0 = notificationCompat$Builder0.j == null ? null : notificationCompat$Builder0.j.I(context0);
            Api23Impl.b(this.b, icon0);
        }
        this.b.setSubText(notificationCompat$Builder0.r).setUsesChronometer(notificationCompat$Builder0.o).setPriority(notificationCompat$Builder0.m);
        Style notificationCompat$Style0 = notificationCompat$Builder0.q;
        if(notificationCompat$Style0 instanceof CallStyle) {
            for(Object object0: ((CallStyle)notificationCompat$Style0).D()) {
                this.b(((Action)object0));
            }
        }
        else {
            for(Object object1: notificationCompat$Builder0.b) {
                this.b(((Action)object1));
            }
        }
        Bundle bundle0 = notificationCompat$Builder0.E;
        if(bundle0 != null) {
            this.g.putAll(bundle0);
        }
        int v1 = Build.VERSION.SDK_INT;
        this.d = notificationCompat$Builder0.I;
        this.e = notificationCompat$Builder0.J;
        this.b.setShowWhen(notificationCompat$Builder0.n);
        Api20Impl.i(this.b, notificationCompat$Builder0.A);
        Api20Impl.g(this.b, notificationCompat$Builder0.x);
        Api20Impl.j(this.b, notificationCompat$Builder0.z);
        Api20Impl.h(this.b, notificationCompat$Builder0.y);
        this.h = notificationCompat$Builder0.Q;
        Api21Impl.b(this.b, notificationCompat$Builder0.D);
        Api21Impl.c(this.b, notificationCompat$Builder0.F);
        Api21Impl.f(this.b, notificationCompat$Builder0.G);
        Api21Impl.d(this.b, notificationCompat$Builder0.H);
        Api21Impl.e(this.b, notification0.sound, notification0.audioAttributes);
        List list0 = v1 < 28 ? NotificationCompatBuilder.e(NotificationCompatBuilder.g(notificationCompat$Builder0.c), notificationCompat$Builder0.X) : notificationCompat$Builder0.X;
        if(list0 != null && !list0.isEmpty()) {
            for(Object object2: list0) {
                Api21Impl.a(this.b, ((String)object2));
            }
        }
        this.i = notificationCompat$Builder0.K;
        if(notificationCompat$Builder0.d.size() > 0) {
            Bundle bundle1 = notificationCompat$Builder0.t().getBundle("android.car.EXTENSIONS");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            Bundle bundle2 = new Bundle(bundle1);
            Bundle bundle3 = new Bundle();
            for(int v2 = 0; v2 < notificationCompat$Builder0.d.size(); ++v2) {
                bundle3.putBundle(Integer.toString(v2), NotificationCompatJellybean.j(((Action)notificationCompat$Builder0.d.get(v2))));
            }
            bundle1.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            notificationCompat$Builder0.t().putBundle("android.car.EXTENSIONS", bundle1);
            this.g.putBundle("android.car.EXTENSIONS", bundle2);
        }
        int v3 = Build.VERSION.SDK_INT;
        if(v3 >= 23) {
            Object object3 = notificationCompat$Builder0.W;
            if(object3 != null) {
                Api23Impl.c(this.b, object3);
            }
        }
        if(v3 >= 24) {
            this.b.setExtras(notificationCompat$Builder0.E);
            Api24Impl.e(this.b, notificationCompat$Builder0.t);
            RemoteViews remoteViews0 = notificationCompat$Builder0.I;
            if(remoteViews0 != null) {
                Api24Impl.c(this.b, remoteViews0);
            }
            RemoteViews remoteViews1 = notificationCompat$Builder0.J;
            if(remoteViews1 != null) {
                Api24Impl.b(this.b, remoteViews1);
            }
            RemoteViews remoteViews2 = notificationCompat$Builder0.K;
            if(remoteViews2 != null) {
                Api24Impl.d(this.b, remoteViews2);
            }
        }
        if(v3 >= 26) {
            Api26Impl.b(this.b, notificationCompat$Builder0.M);
            Api26Impl.e(this.b, notificationCompat$Builder0.s);
            Api26Impl.f(this.b, notificationCompat$Builder0.N);
            Api26Impl.g(this.b, notificationCompat$Builder0.P);
            Api26Impl.d(this.b, notificationCompat$Builder0.Q);
            if(notificationCompat$Builder0.C) {
                Api26Impl.c(this.b, notificationCompat$Builder0.B);
            }
            if(!TextUtils.isEmpty(notificationCompat$Builder0.L)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if(v3 >= 28) {
            for(Object object4: notificationCompat$Builder0.c) {
                Person person0 = ((androidx.core.app.Person)object4).k();
                Api28Impl.a(this.b, person0);
            }
        }
        int v4 = Build.VERSION.SDK_INT;
        if(v4 >= 29) {
            Api29Impl.a(this.b, notificationCompat$Builder0.S);
            Notification.BubbleMetadata notification$BubbleMetadata0 = BubbleMetadata.k(notificationCompat$Builder0.T);
            Api29Impl.b(this.b, notification$BubbleMetadata0);
            LocusIdCompat locusIdCompat0 = notificationCompat$Builder0.O;
            if(locusIdCompat0 != null) {
                Api29Impl.d(this.b, locusIdCompat0.c());
            }
        }
        if(v4 >= 0x1F) {
            int v5 = notificationCompat$Builder0.R;
            if(v5 != 0) {
                Api31Impl.b(this.b, v5);
            }
        }
        if(notificationCompat$Builder0.V) {
            this.h = this.c.y ? 2 : 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            int v6 = notification0.defaults & -4;
            notification0.defaults = v6;
            this.b.setDefaults(v6);
            if(v4 >= 26) {
                if(TextUtils.isEmpty(this.c.x)) {
                    Api20Impl.g(this.b, "silent");
                }
                Api26Impl.d(this.b, this.h);
            }
        }
    }

    @Override  // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder a() {
        return this.b;
    }

    private void b(Action notificationCompat$Action0) {
        int v = Build.VERSION.SDK_INT;
        IconCompat iconCompat0 = notificationCompat$Action0.f();
        Notification.Action.Builder notification$Action$Builder0 = v < 23 ? Api20Impl.e((iconCompat0 == null ? 0 : iconCompat0.u()), notificationCompat$Action0.j(), notificationCompat$Action0.a()) : Api23Impl.a((iconCompat0 == null ? null : iconCompat0.H()), notificationCompat$Action0.j(), notificationCompat$Action0.a());
        if(notificationCompat$Action0.g() != null) {
            RemoteInput[] arr_remoteInput = androidx.core.app.RemoteInput.d(notificationCompat$Action0.g());
            for(int v1 = 0; v1 < arr_remoteInput.length; ++v1) {
                Api20Impl.c(notification$Action$Builder0, arr_remoteInput[v1]);
            }
        }
        Bundle bundle0 = notificationCompat$Action0.d() == null ? new Bundle() : new Bundle(notificationCompat$Action0.d());
        bundle0.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.b());
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 24) {
            Api24Impl.a(notification$Action$Builder0, notificationCompat$Action0.b());
        }
        bundle0.putInt("android.support.action.semanticAction", notificationCompat$Action0.h());
        if(v2 >= 28) {
            Api28Impl.b(notification$Action$Builder0, notificationCompat$Action0.h());
        }
        if(v2 >= 29) {
            Api29Impl.c(notification$Action$Builder0, notificationCompat$Action0.l());
        }
        if(v2 >= 0x1F) {
            Api31Impl.a(notification$Action$Builder0, notificationCompat$Action0.k());
        }
        bundle0.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action0.i());
        Api20Impl.b(notification$Action$Builder0, bundle0);
        Notification.Action notification$Action0 = Api20Impl.d(notification$Action$Builder0);
        Api20Impl.a(this.b, notification$Action0);
    }

    public Notification c() {
        Style notificationCompat$Style0 = this.c.q;
        if(notificationCompat$Style0 != null) {
            notificationCompat$Style0.b(this);
        }
        RemoteViews remoteViews0 = notificationCompat$Style0 == null ? null : notificationCompat$Style0.w(this);
        Notification notification0 = this.d();
        if(remoteViews0 == null) {
            RemoteViews remoteViews1 = this.c.I;
            if(remoteViews1 != null) {
                notification0.contentView = remoteViews1;
            }
        }
        else {
            notification0.contentView = remoteViews0;
        }
        if(notificationCompat$Style0 != null) {
            RemoteViews remoteViews2 = notificationCompat$Style0.v(this);
            if(remoteViews2 != null) {
                notification0.bigContentView = remoteViews2;
            }
        }
        if(notificationCompat$Style0 != null) {
            RemoteViews remoteViews3 = this.c.q.x(this);
            if(remoteViews3 != null) {
                notification0.headsUpContentView = remoteViews3;
            }
        }
        if(notificationCompat$Style0 != null) {
            Bundle bundle0 = NotificationCompat.n(notification0);
            if(bundle0 != null) {
                notificationCompat$Style0.a(bundle0);
            }
        }
        return notification0;
    }

    protected Notification d() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            return this.b.build();
        }
        if(v >= 24) {
            Notification notification0 = this.b.build();
            if(this.h != 0) {
                if(Api20Impl.f(notification0) != null && (notification0.flags & 0x200) != 0 && this.h == 2) {
                    this.h(notification0);
                }
                if(Api20Impl.f(notification0) != null && (notification0.flags & 0x200) == 0 && this.h == 1) {
                    this.h(notification0);
                }
            }
            return notification0;
        }
        this.b.setExtras(this.g);
        Notification notification1 = this.b.build();
        RemoteViews remoteViews0 = this.d;
        if(remoteViews0 != null) {
            notification1.contentView = remoteViews0;
        }
        RemoteViews remoteViews1 = this.e;
        if(remoteViews1 != null) {
            notification1.bigContentView = remoteViews1;
        }
        RemoteViews remoteViews2 = this.i;
        if(remoteViews2 != null) {
            notification1.headsUpContentView = remoteViews2;
        }
        if(this.h != 0) {
            if(Api20Impl.f(notification1) != null && (notification1.flags & 0x200) != 0 && this.h == 2) {
                this.h(notification1);
            }
            if(Api20Impl.f(notification1) != null && (notification1.flags & 0x200) == 0 && this.h == 1) {
                this.h(notification1);
            }
        }
        return notification1;
    }

    private static List e(List list0, List list1) {
        if(list0 == null) {
            return list1;
        }
        if(list1 == null) {
            return list0;
        }
        ArraySet arraySet0 = new ArraySet(list0.size() + list1.size());
        arraySet0.addAll(list0);
        arraySet0.addAll(list1);
        return new ArrayList(arraySet0);
    }

    Context f() {
        return this.a;
    }

    private static List g(List list0) {
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            ((ArrayList)list1).add(((androidx.core.app.Person)object0).j());
        }
        return list1;
    }

    private void h(Notification notification0) {
        notification0.sound = null;
        notification0.vibrate = null;
        notification0.defaults &= -4;
    }
}

