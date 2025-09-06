package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification.CallStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.MessagingStyle;
import android.app.Notification.Style;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.color;
import androidx.core.R.dimen;
import androidx.core.R.id;
import androidx.core.R.integer;
import androidx.core.R.layout;
import androidx.core.R.string;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NotificationCompat {
    public static class Action {
        public static final class Builder {
            @RequiresApi(20)
            static class Api20Impl {
                static Bundle a(Notification.Action notification$Action0) {
                    return notification$Action0.getExtras();
                }

                static RemoteInput[] b(Notification.Action notification$Action0) {
                    return notification$Action0.getRemoteInputs();
                }
            }

            @RequiresApi(23)
            static class Api23Impl {
                static Icon a(Notification.Action notification$Action0) {
                    return notification$Action0.getIcon();
                }
            }

            @RequiresApi(24)
            static class Api24Impl {
                static boolean a(Notification.Action notification$Action0) {
                    return notification$Action0.getAllowGeneratedReplies();
                }
            }

            @RequiresApi(28)
            static class Api28Impl {
                static int a(Notification.Action notification$Action0) {
                    return notification$Action0.getSemanticAction();
                }
            }

            @RequiresApi(29)
            static class Api29Impl {
                static boolean a(Notification.Action notification$Action0) {
                    return notification$Action0.isContextual();
                }
            }

            @RequiresApi(0x1F)
            static class Api31Impl {
                static boolean a(Notification.Action notification$Action0) {
                    return notification$Action0.isAuthenticationRequired();
                }
            }

            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;

            public Builder(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
                this((v == 0 ? null : IconCompat.s(null, "", v)), charSequence0, pendingIntent0, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(Action notificationCompat$Action0) {
                this(notificationCompat$Action0.f(), notificationCompat$Action0.j, notificationCompat$Action0.k, new Bundle(notificationCompat$Action0.a), notificationCompat$Action0.g(), notificationCompat$Action0.b(), notificationCompat$Action0.h(), notificationCompat$Action0.f, notificationCompat$Action0.l(), notificationCompat$Action0.k());
            }

            public Builder(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0) {
                this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, true, 0, true, false, false);
            }

            private Builder(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, androidx.core.app.RemoteInput[] arr_remoteInput, boolean z, int v, boolean z1, boolean z2, boolean z3) {
                this.d = true;
                this.h = true;
                this.a = iconCompat0;
                this.b = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
                this.c = pendingIntent0;
                this.e = bundle0;
                this.f = arr_remoteInput == null ? null : new ArrayList(Arrays.asList(arr_remoteInput));
                this.d = z;
                this.g = v;
                this.h = z1;
                this.i = z2;
                this.j = z3;
            }

            public Builder a(Bundle bundle0) {
                if(bundle0 != null) {
                    this.e.putAll(bundle0);
                }
                return this;
            }

            public Builder b(androidx.core.app.RemoteInput remoteInput0) {
                if(this.f == null) {
                    this.f = new ArrayList();
                }
                if(remoteInput0 != null) {
                    this.f.add(remoteInput0);
                }
                return this;
            }

            public Action c() {
                this.d();
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = this.f;
                if(arrayList2 != null) {
                    for(Object object0: arrayList2) {
                        androidx.core.app.RemoteInput remoteInput0 = (androidx.core.app.RemoteInput)object0;
                        if(remoteInput0.r()) {
                            arrayList0.add(remoteInput0);
                        }
                        else {
                            arrayList1.add(remoteInput0);
                        }
                    }
                }
                androidx.core.app.RemoteInput[] arr_remoteInput = arrayList0.isEmpty() ? null : ((androidx.core.app.RemoteInput[])arrayList0.toArray(new androidx.core.app.RemoteInput[arrayList0.size()]));
                if(arrayList1.isEmpty()) {
                    return new Action(this.a, this.b, this.c, this.e, null, arr_remoteInput, this.d, this.g, this.h, this.i, this.j);
                }
                androidx.core.app.RemoteInput[] arr_remoteInput1 = (androidx.core.app.RemoteInput[])arrayList1.toArray(new androidx.core.app.RemoteInput[arrayList1.size()]);
                return new Action(this.a, this.b, this.c, this.e, arr_remoteInput1, arr_remoteInput, this.d, this.g, this.h, this.i, this.j);
            }

            private void d() {
                if(!this.i) {
                    return;
                }
                if(this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public Builder e(Extender notificationCompat$Action$Extender0) {
                notificationCompat$Action$Extender0.a(this);
                return this;
            }

            @RestrictTo({Scope.c})
            public static Builder f(Notification.Action notification$Action0) {
                Builder notificationCompat$Action$Builder0 = Build.VERSION.SDK_INT < 23 || Api23Impl.a(notification$Action0) == null ? new Builder(notification$Action0.icon, notification$Action0.title, notification$Action0.actionIntent) : new Builder(IconCompat.i(Api23Impl.a(notification$Action0)), notification$Action0.title, notification$Action0.actionIntent);
                RemoteInput[] arr_remoteInput = Api20Impl.b(notification$Action0);
                if(arr_remoteInput != null && arr_remoteInput.length != 0) {
                    for(int v = 0; v < arr_remoteInput.length; ++v) {
                        notificationCompat$Action$Builder0.b(androidx.core.app.RemoteInput.e(arr_remoteInput[v]));
                    }
                }
                int v1 = Build.VERSION.SDK_INT;
                if(v1 >= 24) {
                    notificationCompat$Action$Builder0.d = Api24Impl.a(notification$Action0);
                }
                if(v1 >= 28) {
                    notificationCompat$Action$Builder0.k(Api28Impl.a(notification$Action0));
                }
                if(v1 >= 29) {
                    notificationCompat$Action$Builder0.j(Api29Impl.a(notification$Action0));
                }
                if(v1 >= 0x1F) {
                    notificationCompat$Action$Builder0.i(Api31Impl.a(notification$Action0));
                }
                notificationCompat$Action$Builder0.a(Api20Impl.a(notification$Action0));
                return notificationCompat$Action$Builder0;
            }

            public Bundle g() {
                return this.e;
            }

            public Builder h(boolean z) {
                this.d = z;
                return this;
            }

            public Builder i(boolean z) {
                this.j = z;
                return this;
            }

            public Builder j(boolean z) {
                this.i = z;
                return this;
            }

            public Builder k(int v) {
                this.g = v;
                return this;
            }

            public Builder l(boolean z) {
                this.h = z;
                return this;
            }
        }

        public interface Extender {
            Builder a(Builder arg1);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            private int a;
            private CharSequence b;
            private CharSequence c;
            private CharSequence d;
            private static final String e = "android.wearable.EXTENSIONS";
            private static final String f = "flags";
            private static final String g = "inProgressLabel";
            private static final String h = "confirmLabel";
            private static final String i = "cancelLabel";
            private static final int j = 1;
            private static final int k = 2;
            private static final int l = 4;
            private static final int m = 1;

            public WearableExtender() {
                this.a = 1;
            }

            public WearableExtender(Action notificationCompat$Action0) {
                this.a = 1;
                Bundle bundle0 = notificationCompat$Action0.d().getBundle("android.wearable.EXTENSIONS");
                if(bundle0 != null) {
                    this.a = bundle0.getInt("flags", 1);
                    this.b = bundle0.getCharSequence("inProgressLabel");
                    this.c = bundle0.getCharSequence("confirmLabel");
                    this.d = bundle0.getCharSequence("cancelLabel");
                }
            }

            @Override  // androidx.core.app.NotificationCompat$Action$Extender
            public Builder a(Builder notificationCompat$Action$Builder0) {
                Bundle bundle0 = new Bundle();
                int v = this.a;
                if(v != 1) {
                    bundle0.putInt("flags", v);
                }
                CharSequence charSequence0 = this.b;
                if(charSequence0 != null) {
                    bundle0.putCharSequence("inProgressLabel", charSequence0);
                }
                CharSequence charSequence1 = this.c;
                if(charSequence1 != null) {
                    bundle0.putCharSequence("confirmLabel", charSequence1);
                }
                CharSequence charSequence2 = this.d;
                if(charSequence2 != null) {
                    bundle0.putCharSequence("cancelLabel", charSequence2);
                }
                notificationCompat$Action$Builder0.g().putBundle("android.wearable.EXTENSIONS", bundle0);
                return notificationCompat$Action$Builder0;
            }

            public WearableExtender b() {
                WearableExtender notificationCompat$Action$WearableExtender0 = new WearableExtender();
                notificationCompat$Action$WearableExtender0.a = this.a;
                notificationCompat$Action$WearableExtender0.b = this.b;
                notificationCompat$Action$WearableExtender0.c = this.c;
                notificationCompat$Action$WearableExtender0.d = this.d;
                return notificationCompat$Action$WearableExtender0;
            }

            @Deprecated
            public CharSequence c() {
                return this.d;
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                return this.b();
            }

            @Deprecated
            public CharSequence d() {
                return this.c;
            }

            public boolean e() {
                return (this.a & 4) != 0;
            }

            public boolean f() {
                return (this.a & 2) != 0;
            }

            @Deprecated
            public CharSequence g() {
                return this.b;
            }

            public boolean h() {
                return (this.a & 1) != 0;
            }

            public WearableExtender i(boolean z) {
                this.l(1, z);
                return this;
            }

            @Deprecated
            public WearableExtender j(CharSequence charSequence0) {
                this.d = charSequence0;
                return this;
            }

            @Deprecated
            public WearableExtender k(CharSequence charSequence0) {
                this.c = charSequence0;
                return this;
            }

            private void l(int v, boolean z) {
                if(z) {
                    this.a |= v;
                    return;
                }
                this.a &= ~v;
            }

            public WearableExtender m(boolean z) {
                this.l(4, z);
                return this;
            }

            public WearableExtender n(boolean z) {
                this.l(2, z);
                return this;
            }

            @Deprecated
            public WearableExtender o(CharSequence charSequence0) {
                this.b = charSequence0;
                return this;
            }
        }

        final Bundle a;
        private IconCompat b;
        private final androidx.core.app.RemoteInput[] c;
        private final androidx.core.app.RemoteInput[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;
        public static final int m = 0;
        public static final int n = 1;
        public static final int o = 2;
        public static final int p = 3;
        public static final int q = 4;
        public static final int r = 5;
        public static final int s = 6;
        public static final int t = 7;
        public static final int u = 8;
        public static final int v = 9;
        public static final int w = 10;
        static final String x = "android.support.action.showsUserInterface";
        static final String y = "android.support.action.semanticAction";

        public Action(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this((v == 0 ? null : IconCompat.s(null, "", v)), charSequence0, pendingIntent0);
        }

        Action(int v, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, androidx.core.app.RemoteInput[] arr_remoteInput, androidx.core.app.RemoteInput[] arr_remoteInput1, boolean z, int v1, boolean z1, boolean z2, boolean z3) {
            this((v == 0 ? null : IconCompat.s(null, "", v)), charSequence0, pendingIntent0, bundle0, arr_remoteInput, arr_remoteInput1, z, v1, z1, z2, z3);
        }

        public Action(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, null, true, 0, true, false, false);
        }

        Action(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, androidx.core.app.RemoteInput[] arr_remoteInput, androidx.core.app.RemoteInput[] arr_remoteInput1, boolean z, int v, boolean z1, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat0;
            if(iconCompat0 != null && iconCompat0.y() == 2) {
                this.i = iconCompat0.u();
            }
            this.j = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            this.k = pendingIntent0;
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            this.a = bundle0;
            this.c = arr_remoteInput;
            this.d = arr_remoteInput1;
            this.e = z;
            this.g = v;
            this.f = z1;
            this.h = z2;
            this.l = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public androidx.core.app.RemoteInput[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        public IconCompat f() {
            if(this.b == null) {
                int v = this.i;
                if(v != 0) {
                    this.b = IconCompat.s(null, "", v);
                }
            }
            return this.b;
        }

        public androidx.core.app.RemoteInput[] g() {
            return this.c;
        }

        public int h() {
            return this.g;
        }

        public boolean i() {
            return this.f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.l;
        }

        public boolean l() {
            return this.h;
        }
    }

    @RequiresApi(20)
    static class androidx.core.app.NotificationCompat.Api20Impl {
        static boolean a(RemoteInput remoteInput0) {
            return remoteInput0.getAllowFreeFormInput();
        }

        static CharSequence[] b(RemoteInput remoteInput0) {
            return remoteInput0.getChoices();
        }

        static Bundle c(Notification.Action notification$Action0) {
            return notification$Action0.getExtras();
        }

        static Bundle d(RemoteInput remoteInput0) {
            return remoteInput0.getExtras();
        }

        static String e(Notification notification0) {
            return notification0.getGroup();
        }

        static CharSequence f(RemoteInput remoteInput0) {
            return remoteInput0.getLabel();
        }

        static RemoteInput[] g(Notification.Action notification$Action0) {
            return notification$Action0.getRemoteInputs();
        }

        static String h(RemoteInput remoteInput0) {
            return remoteInput0.getResultKey();
        }

        static String i(Notification notification0) {
            return notification0.getSortKey();
        }
    }

    @RequiresApi(23)
    static class androidx.core.app.NotificationCompat.Api23Impl {
        static Icon a(Notification.Action notification$Action0) {
            return notification$Action0.getIcon();
        }
    }

    @RequiresApi(24)
    static class androidx.core.app.NotificationCompat.Api24Impl {
        static boolean a(Notification.Action notification$Action0) {
            return notification$Action0.getAllowGeneratedReplies();
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static int a(Notification notification0) {
            return notification0.getBadgeIconType();
        }

        static String b(Notification notification0) {
            return notification0.getChannelId();
        }

        static int c(Notification notification0) {
            return notification0.getGroupAlertBehavior();
        }

        static CharSequence d(Notification notification0) {
            return notification0.getSettingsText();
        }

        static String e(Notification notification0) {
            return notification0.getShortcutId();
        }

        static long f(Notification notification0) {
            return notification0.getTimeoutAfter();
        }
    }

    @RequiresApi(28)
    static class androidx.core.app.NotificationCompat.Api28Impl {
        static int a(Notification.Action notification$Action0) {
            return notification$Action0.getSemanticAction();
        }
    }

    @RequiresApi(29)
    static class androidx.core.app.NotificationCompat.Api29Impl {
        static boolean a(Notification notification0) {
            return notification0.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata b(Notification notification0) {
            return notification0.getBubbleMetadata();
        }

        static int c(RemoteInput remoteInput0) {
            return remoteInput0.getEditChoicesBeforeSending();
        }

        static LocusId d(Notification notification0) {
            return notification0.getLocusId();
        }

        static boolean e(Notification.Action notification$Action0) {
            return notification$Action0.isContextual();
        }
    }

    @RequiresApi(0x1F)
    static class androidx.core.app.NotificationCompat.Api31Impl {
        static boolean a(Notification.Action notification$Action0) {
            return notification$Action0.isAuthenticationRequired();
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        @RequiresApi(23)
        static class androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl {
            @RequiresApi(23)
            static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
                notification$BigPictureStyle0.bigLargeIcon(icon0);
            }
        }

        @RequiresApi(0x1F)
        static class androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl {
            @RequiresApi(0x1F)
            static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
                notification$BigPictureStyle0.bigPicture(icon0);
            }

            @RequiresApi(0x1F)
            static void b(Notification.BigPictureStyle notification$BigPictureStyle0, CharSequence charSequence0) {
                notification$BigPictureStyle0.setContentDescription(charSequence0);
            }

            @RequiresApi(0x1F)
            static void c(Notification.BigPictureStyle notification$BigPictureStyle0, boolean z) {
                notification$BigPictureStyle0.showBigPictureWhenCollapsed(z);
            }
        }

        private IconCompat e;
        private IconCompat f;
        private boolean g;
        private CharSequence h;
        private boolean i;
        private static final String j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        public BigPictureStyle() {
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.z(notificationCompat$Builder0);
        }

        private static IconCompat A(Parcelable parcelable0) {
            if(parcelable0 != null) {
                if(Build.VERSION.SDK_INT >= 23 && u.a(parcelable0)) {
                    return IconCompat.h(((Icon)parcelable0));
                }
                return parcelable0 instanceof Bitmap ? IconCompat.n(((Bitmap)parcelable0)) : null;
            }
            return null;
        }

        public BigPictureStyle B(Bitmap bitmap0) {
            this.f = bitmap0 == null ? null : IconCompat.n(bitmap0);
            this.g = true;
            return this;
        }

        @RequiresApi(23)
        public BigPictureStyle C(Icon icon0) {
            this.f = icon0 == null ? null : IconCompat.h(icon0);
            this.g = true;
            return this;
        }

        public BigPictureStyle D(Bitmap bitmap0) {
            this.e = bitmap0 == null ? null : IconCompat.n(bitmap0);
            return this;
        }

        @RequiresApi(0x1F)
        public BigPictureStyle E(Icon icon0) {
            this.e = IconCompat.h(icon0);
            return this;
        }

        @RestrictTo({Scope.c})
        public static IconCompat F(Bundle bundle0) {
            if(bundle0 == null) {
                return null;
            }
            Parcelable parcelable0 = bundle0.getParcelable("android.picture");
            return parcelable0 == null ? BigPictureStyle.A(bundle0.getParcelable("android.pictureIcon")) : BigPictureStyle.A(parcelable0);
        }

        public BigPictureStyle G(CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        @RequiresApi(0x1F)
        public BigPictureStyle H(CharSequence charSequence0) {
            this.h = charSequence0;
            return this;
        }

        public BigPictureStyle I(CharSequence charSequence0) {
            this.c = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            this.d = true;
            return this;
        }

        @RequiresApi(0x1F)
        public BigPictureStyle J(boolean z) {
            this.i = z;
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.BigPictureStyle notification$BigPictureStyle0 = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor0.a()).setBigContentTitle(this.b);
            IconCompat iconCompat0 = this.e;
            Context context0 = null;
            if(iconCompat0 != null) {
                if(Build.VERSION.SDK_INT >= 0x1F) {
                    Context context1 = notificationBuilderWithBuilderAccessor0 instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder)notificationBuilderWithBuilderAccessor0).f() : null;
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.a(notification$BigPictureStyle0, this.e.I(context1));
                }
                else if(iconCompat0.y() == 1) {
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture(this.e.t());
                }
            }
            if(this.g) {
                IconCompat iconCompat1 = this.f;
                if(iconCompat1 == null) {
                    notification$BigPictureStyle0.bigLargeIcon(null);
                }
                else if(Build.VERSION.SDK_INT >= 23) {
                    if(notificationBuilderWithBuilderAccessor0 instanceof NotificationCompatBuilder) {
                        context0 = ((NotificationCompatBuilder)notificationBuilderWithBuilderAccessor0).f();
                    }
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl.a(notification$BigPictureStyle0, this.f.I(context0));
                }
                else if(iconCompat1.y() == 1) {
                    notification$BigPictureStyle0.bigLargeIcon(this.f.t());
                }
                else {
                    notification$BigPictureStyle0.bigLargeIcon(null);
                }
            }
            if(this.d) {
                notification$BigPictureStyle0.setSummaryText(this.c);
            }
            if(Build.VERSION.SDK_INT >= 0x1F) {
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.c(notification$BigPictureStyle0, this.i);
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.b(notification$BigPictureStyle0, this.h);
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void g(Bundle bundle0) {
            super.g(bundle0);
            bundle0.remove("android.largeIcon.big");
            bundle0.remove("android.picture");
            bundle0.remove("android.pictureIcon");
            bundle0.remove("android.showBigPictureWhenCollapsed");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            super.y(bundle0);
            if(bundle0.containsKey("android.largeIcon.big")) {
                this.f = BigPictureStyle.A(bundle0.getParcelable("android.largeIcon.big"));
                this.g = true;
            }
            this.e = BigPictureStyle.F(bundle0);
            this.i = bundle0.getBoolean("android.showBigPictureWhenCollapsed");
        }
    }

    public static class BigTextStyle extends Style {
        private CharSequence e;
        private static final String f = "androidx.core.app.NotificationCompat$BigTextStyle";

        public BigTextStyle() {
        }

        public BigTextStyle(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.z(notificationCompat$Builder0);
        }

        public BigTextStyle A(CharSequence charSequence0) {
            this.e = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public BigTextStyle B(CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public BigTextStyle C(CharSequence charSequence0) {
            this.c = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            this.d = true;
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void a(Bundle bundle0) {
            super.a(bundle0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.BigTextStyle notification$BigTextStyle0 = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor0.a()).setBigContentTitle(this.b).bigText(this.e);
            if(this.d) {
                notification$BigTextStyle0.setSummaryText(this.c);
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void g(Bundle bundle0) {
            super.g(bundle0);
            bundle0.remove("android.bigText");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            super.y(bundle0);
            this.e = bundle0.getCharSequence("android.bigText");
        }
    }

    public static final class BubbleMetadata {
        @RequiresApi(29)
        static class androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl {
            @RequiresApi(29)
            static BubbleMetadata a(Notification.BubbleMetadata notification$BubbleMetadata0) {
                if(notification$BubbleMetadata0 == null) {
                    return null;
                }
                if(notification$BubbleMetadata0.getIntent() == null) {
                    return null;
                }
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder notificationCompat$BubbleMetadata$Builder0 = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(notification$BubbleMetadata0.getIntent(), IconCompat.h(notification$BubbleMetadata0.getIcon())).b(notification$BubbleMetadata0.getAutoExpandBubble()).c(notification$BubbleMetadata0.getDeleteIntent()).i(notification$BubbleMetadata0.isNotificationSuppressed());
                if(notification$BubbleMetadata0.getDesiredHeight() != 0) {
                    notificationCompat$BubbleMetadata$Builder0.d(notification$BubbleMetadata0.getDesiredHeight());
                }
                if(notification$BubbleMetadata0.getDesiredHeightResId() != 0) {
                    notificationCompat$BubbleMetadata$Builder0.e(notification$BubbleMetadata0.getDesiredHeightResId());
                }
                return notificationCompat$BubbleMetadata$Builder0.a();
            }

            @RequiresApi(29)
            static Notification.BubbleMetadata b(BubbleMetadata notificationCompat$BubbleMetadata0) {
                if(notificationCompat$BubbleMetadata0 == null) {
                    return null;
                }
                if(notificationCompat$BubbleMetadata0.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder notification$BubbleMetadata$Builder0 = new Notification.BubbleMetadata.Builder().setIcon(notificationCompat$BubbleMetadata0.f().H()).setIntent(notificationCompat$BubbleMetadata0.g()).setDeleteIntent(notificationCompat$BubbleMetadata0.c()).setAutoExpandBubble(notificationCompat$BubbleMetadata0.b()).setSuppressNotification(notificationCompat$BubbleMetadata0.i());
                if(notificationCompat$BubbleMetadata0.d() != 0) {
                    notification$BubbleMetadata$Builder0.setDesiredHeight(notificationCompat$BubbleMetadata0.d());
                }
                if(notificationCompat$BubbleMetadata0.e() != 0) {
                    notification$BubbleMetadata$Builder0.setDesiredHeightResId(notificationCompat$BubbleMetadata0.e());
                }
                return notification$BubbleMetadata$Builder0.build();
            }
        }

        @RequiresApi(30)
        static class Api30Impl {
            @RequiresApi(30)
            static BubbleMetadata a(Notification.BubbleMetadata notification$BubbleMetadata0) {
                if(notification$BubbleMetadata0 == null) {
                    return null;
                }
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder notificationCompat$BubbleMetadata$Builder0 = notification$BubbleMetadata0.getShortcutId() == null ? new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(notification$BubbleMetadata0.getIntent(), IconCompat.h(notification$BubbleMetadata0.getIcon())) : new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(notification$BubbleMetadata0.getShortcutId());
                notificationCompat$BubbleMetadata$Builder0.b(notification$BubbleMetadata0.getAutoExpandBubble()).c(notification$BubbleMetadata0.getDeleteIntent()).i(notification$BubbleMetadata0.isNotificationSuppressed());
                if(notification$BubbleMetadata0.getDesiredHeight() != 0) {
                    notificationCompat$BubbleMetadata$Builder0.d(notification$BubbleMetadata0.getDesiredHeight());
                }
                if(notification$BubbleMetadata0.getDesiredHeightResId() != 0) {
                    notificationCompat$BubbleMetadata$Builder0.e(notification$BubbleMetadata0.getDesiredHeightResId());
                }
                return notificationCompat$BubbleMetadata$Builder0.a();
            }

            @RequiresApi(30)
            static Notification.BubbleMetadata b(BubbleMetadata notificationCompat$BubbleMetadata0) {
                if(notificationCompat$BubbleMetadata0 == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder notification$BubbleMetadata$Builder0 = notificationCompat$BubbleMetadata0.h() == null ? new Notification.BubbleMetadata.Builder(notificationCompat$BubbleMetadata0.g(), notificationCompat$BubbleMetadata0.f().H()) : new Notification.BubbleMetadata.Builder(notificationCompat$BubbleMetadata0.h());
                notification$BubbleMetadata$Builder0.setDeleteIntent(notificationCompat$BubbleMetadata0.c()).setAutoExpandBubble(notificationCompat$BubbleMetadata0.b()).setSuppressNotification(notificationCompat$BubbleMetadata0.i());
                if(notificationCompat$BubbleMetadata0.d() != 0) {
                    notification$BubbleMetadata$Builder0.setDesiredHeight(notificationCompat$BubbleMetadata0.d());
                }
                if(notificationCompat$BubbleMetadata0.e() != 0) {
                    notification$BubbleMetadata$Builder0.setDesiredHeightResId(notificationCompat$BubbleMetadata0.e());
                }
                return notification$BubbleMetadata$Builder0.build();
            }
        }

        public static final class androidx.core.app.NotificationCompat.BubbleMetadata.Builder {
            private PendingIntent a;
            private IconCompat b;
            private int c;
            @DimenRes
            private int d;
            private int e;
            private PendingIntent f;
            private String g;

            @Deprecated
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder() {
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder(PendingIntent pendingIntent0, IconCompat iconCompat0) {
                if(pendingIntent0 == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if(iconCompat0 == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.a = pendingIntent0;
                this.b = iconCompat0;
            }

            @RequiresApi(30)
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder(String s) {
                if(TextUtils.isEmpty(s)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.g = s;
            }

            public BubbleMetadata a() {
                String s = this.g;
                if(s == null && this.a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if(s == null && this.b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                BubbleMetadata notificationCompat$BubbleMetadata0 = new BubbleMetadata(this.a, this.f, this.b, this.c, this.d, this.e, s, null);
                notificationCompat$BubbleMetadata0.j(this.e);
                return notificationCompat$BubbleMetadata0;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder b(boolean z) {
                this.f(1, z);
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder c(PendingIntent pendingIntent0) {
                this.f = pendingIntent0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder d(@Dimension(unit = 0) int v) {
                this.c = Math.max(v, 0);
                this.d = 0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder e(@DimenRes int v) {
                this.d = v;
                this.c = 0;
                return this;
            }

            private androidx.core.app.NotificationCompat.BubbleMetadata.Builder f(int v, boolean z) {
                if(z) {
                    this.e |= v;
                    return this;
                }
                this.e &= ~v;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder g(IconCompat iconCompat0) {
                if(this.g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if(iconCompat0 == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.b = iconCompat0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder h(PendingIntent pendingIntent0) {
                if(this.g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if(pendingIntent0 == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.a = pendingIntent0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder i(boolean z) {
                this.f(2, z);
                return this;
            }
        }

        private PendingIntent a;
        private PendingIntent b;
        private IconCompat c;
        private int d;
        @DimenRes
        private int e;
        private int f;
        private String g;
        private static final int h = 1;
        private static final int i = 2;

        private BubbleMetadata(PendingIntent pendingIntent0, PendingIntent pendingIntent1, IconCompat iconCompat0, int v, @DimenRes int v1, int v2, String s) {
            this.a = pendingIntent0;
            this.c = iconCompat0;
            this.d = v;
            this.e = v1;
            this.b = pendingIntent1;
            this.f = v2;
            this.g = s;
        }

        BubbleMetadata(PendingIntent pendingIntent0, PendingIntent pendingIntent1, IconCompat iconCompat0, int v, int v1, int v2, String s, androidx.core.app.NotificationCompat.1 notificationCompat$10) {
            this(pendingIntent0, pendingIntent1, iconCompat0, v, v1, v2, s);
        }

        public static BubbleMetadata a(Notification.BubbleMetadata notification$BubbleMetadata0) {
            if(notification$BubbleMetadata0 == null) {
                return null;
            }
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                return Api30Impl.a(notification$BubbleMetadata0);
            }
            return v == 29 ? androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.a(notification$BubbleMetadata0) : null;
        }

        public boolean b() {
            return (this.f & 1) != 0;
        }

        public PendingIntent c() {
            return this.b;
        }

        @Dimension(unit = 0)
        public int d() {
            return this.d;
        }

        @DimenRes
        public int e() {
            return this.e;
        }

        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.c;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.a;
        }

        public String h() {
            return this.g;
        }

        public boolean i() {
            return (this.f & 2) != 0;
        }

        @RestrictTo({Scope.c})
        public void j(int v) {
            this.f = v;
        }

        public static Notification.BubbleMetadata k(BubbleMetadata notificationCompat$BubbleMetadata0) {
            if(notificationCompat$BubbleMetadata0 == null) {
                return null;
            }
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                return Api30Impl.b(notificationCompat$BubbleMetadata0);
            }
            return v == 29 ? androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.b(notificationCompat$BubbleMetadata0) : null;
        }
    }

    public static class androidx.core.app.NotificationCompat.Builder {
        @RequiresApi(21)
        static class Api21Impl {
            static AudioAttributes a(AudioAttributes.Builder audioAttributes$Builder0) {
                return audioAttributes$Builder0.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setContentType(v);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setLegacyStreamType(v);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setUsage(v);
            }
        }

        @RequiresApi(23)
        static class androidx.core.app.NotificationCompat.Builder.Api23Impl {
            static Icon a(Notification notification0) {
                return notification0.getLargeIcon();
            }

            static Icon b(Notification notification0) {
                return notification0.getSmallIcon();
            }
        }

        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.Builder.Api24Impl {
            static RemoteViews a(Notification.Builder notification$Builder0) {
                return notification$Builder0.createHeadsUpContentView();
            }

            static RemoteViews b(Notification.Builder notification$Builder0) {
                return notification$Builder0.createContentView();
            }

            static RemoteViews c(Notification.Builder notification$Builder0) {
                return notification$Builder0.createHeadsUpContentView();
            }

            static Notification.Builder d(Context context0, Notification notification0) {
                return Notification.Builder.recoverBuilder(context0, notification0);
            }
        }

        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        LocusIdCompat O;
        long P;
        int Q;
        int R;
        boolean S;
        BubbleMetadata T;
        Notification U;
        boolean V;
        Object W;
        @Deprecated
        public ArrayList X;
        private static final int Y = 0x1400;
        @RestrictTo({Scope.c})
        public Context a;
        @RestrictTo({Scope.c})
        public ArrayList b;
        @RestrictTo({Scope.c})
        public ArrayList c;
        ArrayList d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        IconCompat j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        boolean p;
        Style q;
        CharSequence r;
        CharSequence s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;

        @Deprecated
        public androidx.core.app.NotificationCompat.Builder(Context context0) {
            this(context0, null);
        }

        public androidx.core.app.NotificationCompat.Builder(Context context0, Notification notification0) {
            this(context0, NotificationCompat.i(notification0));
            Bundle bundle0 = notification0.extras;
            Style notificationCompat$Style0 = Style.s(notification0);
            this.O(NotificationCompat.m(notification0)).N(NotificationCompat.l(notification0)).L(NotificationCompat.k(notification0)).A0(NotificationCompat.D(notification0)).o0(NotificationCompat.z(notification0)).z0(notificationCompat$Style0).Y(NotificationCompat.o(notification0)).a0(NotificationCompat.H(notification0)).f0(NotificationCompat.t(notification0)).H0(notification0.when).r0(NotificationCompat.B(notification0)).E0(NotificationCompat.F(notification0)).C(NotificationCompat.e(notification0)).j0(NotificationCompat.w(notification0)).i0(NotificationCompat.v(notification0)).e0(NotificationCompat.s(notification0)).b0(notification0.largeIcon).D(NotificationCompat.f(notification0)).F(NotificationCompat.h(notification0)).E(NotificationCompat.g(notification0)).h0(notification0.number).B0(notification0.tickerText).M(notification0.contentIntent).T(notification0.deleteIntent).X(notification0.fullScreenIntent, NotificationCompat.q(notification0)).y0(notification0.sound, notification0.audioStreamType).F0(notification0.vibrate).d0(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).S(notification0.defaults).k0(notification0.priority).I(NotificationCompat.j(notification0)).G0(NotificationCompat.G(notification0)).m0(NotificationCompat.y(notification0)).w0(NotificationCompat.C(notification0)).D0(NotificationCompat.E(notification0)).p0(NotificationCompat.A(notification0)).l0(bundle0.getInt("android.progressMax"), bundle0.getInt("android.progress"), bundle0.getBoolean("android.progressIndeterminate")).B(NotificationCompat.d(notification0)).u0(notification0.icon, notification0.iconLevel).c(androidx.core.app.NotificationCompat.Builder.u(notification0, notificationCompat$Style0));
            if(Build.VERSION.SDK_INT >= 23) {
                this.W = androidx.core.app.NotificationCompat.Builder.Api23Impl.b(notification0);
                Icon icon0 = androidx.core.app.NotificationCompat.Builder.Api23Impl.a(notification0);
                if(icon0 != null) {
                    this.j = IconCompat.h(icon0);
                }
            }
            Notification.Action[] arr_notification$Action = notification0.actions;
            if(arr_notification$Action != null && arr_notification$Action.length != 0) {
                for(int v1 = 0; v1 < arr_notification$Action.length; ++v1) {
                    this.b(Builder.f(arr_notification$Action[v1]).c());
                }
            }
            List list0 = NotificationCompat.r(notification0);
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    this.e(((Action)object0));
                }
            }
            String[] arr_s = notification0.extras.getStringArray("android.people");
            if(arr_s != null && arr_s.length != 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    this.g(arr_s[v]);
                }
            }
            if(Build.VERSION.SDK_INT >= 28) {
                ArrayList arrayList0 = notification0.extras.getParcelableArrayList("android.people.list");
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        this.f(Person.a(((android.app.Person)object1)));
                    }
                }
            }
            int v2 = Build.VERSION.SDK_INT;
            if(v2 >= 24 && bundle0.containsKey("android.chronometerCountDown")) {
                this.H(bundle0.getBoolean("android.chronometerCountDown"));
            }
            if(v2 >= 26 && bundle0.containsKey("android.colorized")) {
                this.J(bundle0.getBoolean("android.colorized"));
            }
        }

        public androidx.core.app.NotificationCompat.Builder(Context context0, String s) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification0 = new Notification();
            this.U = notification0;
            this.a = context0;
            this.L = s;
            notification0.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.m = 0;
            this.X = new ArrayList();
            this.S = true;
        }

        protected static CharSequence A(CharSequence charSequence0) {
            if(charSequence0 == null) {
                return null;
            }
            return charSequence0.length() <= 0x1400 ? charSequence0 : charSequence0.subSequence(0, 0x1400);
        }

        public androidx.core.app.NotificationCompat.Builder A0(CharSequence charSequence0) {
            this.r = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder B(boolean z) {
            this.S = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder B0(CharSequence charSequence0) {
            Notification notification0 = this.U;
            notification0.tickerText = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder C(boolean z) {
            this.V(16, z);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.Builder C0(CharSequence charSequence0, RemoteViews remoteViews0) {
            Notification notification0 = this.U;
            notification0.tickerText = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            this.i = remoteViews0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder D(int v) {
            this.M = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder D0(long v) {
            this.P = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder E(BubbleMetadata notificationCompat$BubbleMetadata0) {
            this.T = notificationCompat$BubbleMetadata0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder E0(boolean z) {
            this.o = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder F(String s) {
            this.D = s;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder F0(long[] arr_v) {
            this.U.vibrate = arr_v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder G(String s) {
            this.L = s;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder G0(int v) {
            this.G = v;
            return this;
        }

        @RequiresApi(24)
        public androidx.core.app.NotificationCompat.Builder H(boolean z) {
            this.p = z;
            this.t().putBoolean("android.chronometerCountDown", z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder H0(long v) {
            this.U.when = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder I(@ColorInt int v) {
            this.F = v;
            return this;
        }

        private boolean I0() {
            return this.q == null || !this.q.r();
        }

        public androidx.core.app.NotificationCompat.Builder J(boolean z) {
            this.B = z;
            this.C = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder K(RemoteViews remoteViews0) {
            this.U.contentView = remoteViews0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder L(CharSequence charSequence0) {
            this.k = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder M(PendingIntent pendingIntent0) {
            this.g = pendingIntent0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder N(CharSequence charSequence0) {
            this.f = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder O(CharSequence charSequence0) {
            this.e = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder P(RemoteViews remoteViews0) {
            this.J = remoteViews0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder Q(RemoteViews remoteViews0) {
            this.I = remoteViews0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder R(RemoteViews remoteViews0) {
            this.K = remoteViews0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder S(int v) {
            Notification notification0 = this.U;
            notification0.defaults = v;
            if((v & 4) != 0) {
                notification0.flags |= 1;
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder T(PendingIntent pendingIntent0) {
            this.U.deleteIntent = pendingIntent0;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder U(Bundle bundle0) {
            this.E = bundle0;
            return this;
        }

        private void V(int v, boolean z) {
            if(z) {
                this.U.flags |= v;
                return;
            }
            this.U.flags &= ~v;
        }

        public androidx.core.app.NotificationCompat.Builder W(int v) {
            this.R = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder X(PendingIntent pendingIntent0, boolean z) {
            this.h = pendingIntent0;
            this.V(0x80, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder Y(String s) {
            this.x = s;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder Z(int v) {
            this.Q = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder a(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this.b.add(new Action(v, charSequence0, pendingIntent0));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder a0(boolean z) {
            this.y = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder b(Action notificationCompat$Action0) {
            if(notificationCompat$Action0 != null) {
                this.b.add(notificationCompat$Action0);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder b0(Bitmap bitmap0) {
            this.j = bitmap0 == null ? null : IconCompat.n(NotificationCompat.I(this.a, bitmap0));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder c(Bundle bundle0) {
            if(bundle0 != null) {
                Bundle bundle1 = this.E;
                if(bundle1 == null) {
                    this.E = new Bundle(bundle0);
                    return this;
                }
                bundle1.putAll(bundle0);
            }
            return this;
        }

        @RequiresApi(23)
        public androidx.core.app.NotificationCompat.Builder c0(Icon icon0) {
            this.j = icon0 == null ? null : IconCompat.h(icon0);
            return this;
        }

        @RequiresApi(21)
        public androidx.core.app.NotificationCompat.Builder d(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this.d.add(new Action(v, charSequence0, pendingIntent0));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder d0(@ColorInt int v, int v1, int v2) {
            this.U.ledARGB = v;
            this.U.ledOnMS = v1;
            this.U.ledOffMS = v2;
            this.U.flags = (v1 == 0 || v2 == 0 ? 0 : 1) | this.U.flags & -2;
            return this;
        }

        @RequiresApi(21)
        public androidx.core.app.NotificationCompat.Builder e(Action notificationCompat$Action0) {
            if(notificationCompat$Action0 != null) {
                this.d.add(notificationCompat$Action0);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder e0(boolean z) {
            this.A = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder f(Person person0) {
            if(person0 != null) {
                this.c.add(person0);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder f0(LocusIdCompat locusIdCompat0) {
            this.O = locusIdCompat0;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.Builder g(String s) {
            if(s != null && !s.isEmpty()) {
                this.X.add(s);
            }
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.Builder g0() {
            this.V = true;
            return this;
        }

        public Notification h() {
            return new NotificationCompatBuilder(this).c();
        }

        public androidx.core.app.NotificationCompat.Builder h0(int v) {
            this.l = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder i() {
            this.b.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder i0(boolean z) {
            this.V(2, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder j() {
            this.d.clear();
            Bundle bundle0 = this.E.getBundle("android.car.EXTENSIONS");
            if(bundle0 != null) {
                Bundle bundle1 = new Bundle(bundle0);
                bundle1.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle1);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder j0(boolean z) {
            this.V(8, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder k() {
            this.c.clear();
            this.X.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder k0(int v) {
            this.m = v;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            if(this.J != null && this.I0()) {
                return this.J;
            }
            NotificationCompatBuilder notificationCompatBuilder0 = new NotificationCompatBuilder(this);
            Style notificationCompat$Style0 = this.q;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.v(notificationCompatBuilder0);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = notificationCompatBuilder0.c();
            return Build.VERSION.SDK_INT < 24 ? notification0.bigContentView : androidx.core.app.NotificationCompat.Builder.Api24Impl.a(androidx.core.app.NotificationCompat.Builder.Api24Impl.d(this.a, notification0));
        }

        public androidx.core.app.NotificationCompat.Builder l0(int v, int v1, boolean z) {
            this.u = v;
            this.v = v1;
            this.w = z;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            if(this.I != null && this.I0()) {
                return this.I;
            }
            NotificationCompatBuilder notificationCompatBuilder0 = new NotificationCompatBuilder(this);
            Style notificationCompat$Style0 = this.q;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.w(notificationCompatBuilder0);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = notificationCompatBuilder0.c();
            return Build.VERSION.SDK_INT < 24 ? notification0.contentView : androidx.core.app.NotificationCompat.Builder.Api24Impl.b(androidx.core.app.NotificationCompat.Builder.Api24Impl.d(this.a, notification0));
        }

        public androidx.core.app.NotificationCompat.Builder m0(Notification notification0) {
            this.H = notification0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            int v = Build.VERSION.SDK_INT;
            if(this.K != null && this.I0()) {
                return this.K;
            }
            NotificationCompatBuilder notificationCompatBuilder0 = new NotificationCompatBuilder(this);
            Style notificationCompat$Style0 = this.q;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.x(notificationCompatBuilder0);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = notificationCompatBuilder0.c();
            return v < 24 ? notification0.headsUpContentView : androidx.core.app.NotificationCompat.Builder.Api24Impl.c(androidx.core.app.NotificationCompat.Builder.Api24Impl.d(this.a, notification0));
        }

        public androidx.core.app.NotificationCompat.Builder n0(CharSequence[] arr_charSequence) {
            this.t = arr_charSequence;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder o(androidx.core.app.NotificationCompat.Extender notificationCompat$Extender0) {
            notificationCompat$Extender0.a(this);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder o0(CharSequence charSequence0) {
            this.s = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        @RestrictTo({Scope.c})
        public RemoteViews p() {
            return this.J;
        }

        public androidx.core.app.NotificationCompat.Builder p0(String s) {
            this.N = s;
            return this;
        }

        @RestrictTo({Scope.c})
        public BubbleMetadata q() {
            return this.T;
        }

        public androidx.core.app.NotificationCompat.Builder q0(ShortcutInfoCompat shortcutInfoCompat0) {
            if(shortcutInfoCompat0 == null) {
                return this;
            }
            this.N = shortcutInfoCompat0.k();
            if(this.O == null) {
                if(shortcutInfoCompat0.o() != null) {
                    this.O = shortcutInfoCompat0.o();
                }
                else if(shortcutInfoCompat0.k() != null) {
                    this.O = new LocusIdCompat(shortcutInfoCompat0.k());
                }
            }
            if(this.e == null) {
                this.O(shortcutInfoCompat0.w());
            }
            return this;
        }

        @ColorInt
        @RestrictTo({Scope.c})
        public int r() {
            return this.F;
        }

        public androidx.core.app.NotificationCompat.Builder r0(boolean z) {
            this.n = z;
            return this;
        }

        @RestrictTo({Scope.c})
        public RemoteViews s() {
            return this.I;
        }

        public androidx.core.app.NotificationCompat.Builder s0(boolean z) {
            this.V = z;
            return this;
        }

        public Bundle t() {
            if(this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public androidx.core.app.NotificationCompat.Builder t0(int v) {
            this.U.icon = v;
            return this;
        }

        private static Bundle u(Notification notification0, Style notificationCompat$Style0) {
            if(notification0.extras == null) {
                return null;
            }
            Bundle bundle0 = new Bundle(notification0.extras);
            bundle0.remove("android.title");
            bundle0.remove("android.text");
            bundle0.remove("android.infoText");
            bundle0.remove("android.subText");
            bundle0.remove("android.intent.extra.CHANNEL_ID");
            bundle0.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle0.remove("android.showWhen");
            bundle0.remove("android.progress");
            bundle0.remove("android.progressMax");
            bundle0.remove("android.progressIndeterminate");
            bundle0.remove("android.chronometerCountDown");
            bundle0.remove("android.colorized");
            bundle0.remove("android.people.list");
            bundle0.remove("android.people");
            bundle0.remove("android.support.sortKey");
            bundle0.remove("android.support.groupKey");
            bundle0.remove("android.support.isGroupSummary");
            bundle0.remove("android.support.localOnly");
            bundle0.remove("android.support.actionExtras");
            Bundle bundle1 = bundle0.getBundle("android.car.EXTENSIONS");
            if(bundle1 != null) {
                Bundle bundle2 = new Bundle(bundle1);
                bundle2.remove("invisible_actions");
                bundle0.putBundle("android.car.EXTENSIONS", bundle2);
            }
            if(notificationCompat$Style0 != null) {
                notificationCompat$Style0.g(bundle0);
            }
            return bundle0;
        }

        public androidx.core.app.NotificationCompat.Builder u0(int v, int v1) {
            this.U.icon = v;
            this.U.iconLevel = v1;
            return this;
        }

        @RestrictTo({Scope.c})
        public int v() {
            return this.R;
        }

        @RequiresApi(23)
        public androidx.core.app.NotificationCompat.Builder v0(IconCompat iconCompat0) {
            this.W = iconCompat0.I(this.a);
            return this;
        }

        @RestrictTo({Scope.c})
        public RemoteViews w() {
            return this.K;
        }

        public androidx.core.app.NotificationCompat.Builder w0(String s) {
            this.z = s;
            return this;
        }

        @Deprecated
        public Notification x() {
            return this.h();
        }

        public androidx.core.app.NotificationCompat.Builder x0(Uri uri0) {
            this.U.sound = uri0;
            this.U.audioStreamType = -1;
            AudioAttributes.Builder audioAttributes$Builder0 = Api21Impl.e(Api21Impl.c(Api21Impl.b(), 4), 5);
            Notification notification0 = this.U;
            notification0.audioAttributes = Api21Impl.a(audioAttributes$Builder0);
            return this;
        }

        @RestrictTo({Scope.c})
        public int y() {
            return this.m;
        }

        public androidx.core.app.NotificationCompat.Builder y0(Uri uri0, int v) {
            this.U.sound = uri0;
            this.U.audioStreamType = v;
            AudioAttributes.Builder audioAttributes$Builder0 = Api21Impl.d(Api21Impl.c(Api21Impl.b(), 4), v);
            Notification notification0 = this.U;
            notification0.audioAttributes = Api21Impl.a(audioAttributes$Builder0);
            return this;
        }

        // 去混淆评级： 低(20)
        @RestrictTo({Scope.c})
        public long z() {
            return this.n ? this.U.when : 0L;
        }

        public androidx.core.app.NotificationCompat.Builder z0(Style notificationCompat$Style0) {
            if(this.q != notificationCompat$Style0) {
                this.q = notificationCompat$Style0;
                if(notificationCompat$Style0 != null) {
                    notificationCompat$Style0.z(this);
                }
            }
            return this;
        }
    }

    public static class CallStyle extends Style {
        @RequiresApi(20)
        static class androidx.core.app.NotificationCompat.CallStyle.Api20Impl {
            static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
                return notification$Action$Builder0.addExtras(bundle0);
            }

            static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
                return notification$Action$Builder0.addRemoteInput(remoteInput0);
            }

            static Notification.Action c(Notification.Action.Builder notification$Action$Builder0) {
                return notification$Action$Builder0.build();
            }

            static Notification.Action.Builder d(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
                return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
            }
        }

        @RequiresApi(21)
        static class androidx.core.app.NotificationCompat.CallStyle.Api21Impl {
            static Notification.Builder a(Notification.Builder notification$Builder0, String s) {
                return notification$Builder0.addPerson(s);
            }

            static Notification.Builder b(Notification.Builder notification$Builder0, String s) {
                return notification$Builder0.setCategory(s);
            }
        }

        @RequiresApi(23)
        static class androidx.core.app.NotificationCompat.CallStyle.Api23Impl {
            static Parcelable a(Icon icon0) {
                return icon0;
            }

            static Notification.Action.Builder b(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
                return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
            }

            static void c(Notification.Builder notification$Builder0, Icon icon0) {
                notification$Builder0.setLargeIcon(icon0);
            }
        }

        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.CallStyle.Api24Impl {
            static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
                return notification$Action$Builder0.setAllowGeneratedReplies(z);
            }
        }

        @RequiresApi(28)
        static class androidx.core.app.NotificationCompat.CallStyle.Api28Impl {
            static Notification.Builder a(Notification.Builder notification$Builder0, android.app.Person person0) {
                return notification$Builder0.addPerson(person0);
            }

            static Parcelable b(android.app.Person person0) {
                return person0;
            }
        }

        @RequiresApi(0x1F)
        static class androidx.core.app.NotificationCompat.CallStyle.Api31Impl {
            static Notification.CallStyle a(android.app.Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
                return Notification.CallStyle.forIncomingCall(person0, pendingIntent0, pendingIntent1);
            }

            static Notification.CallStyle b(android.app.Person person0, PendingIntent pendingIntent0) {
                return Notification.CallStyle.forOngoingCall(person0, pendingIntent0);
            }

            static Notification.CallStyle c(android.app.Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
                return Notification.CallStyle.forScreeningCall(person0, pendingIntent0, pendingIntent1);
            }

            static Notification.CallStyle d(Notification.CallStyle notification$CallStyle0, @ColorInt int v) {
                return notification$CallStyle0.setAnswerButtonColorHint(v);
            }

            static Notification.Action.Builder e(Notification.Action.Builder notification$Action$Builder0, boolean z) {
                return notification$Action$Builder0.setAuthenticationRequired(z);
            }

            static Notification.CallStyle f(Notification.CallStyle notification$CallStyle0, @ColorInt int v) {
                return notification$CallStyle0.setDeclineButtonColorHint(v);
            }

            static Notification.CallStyle g(Notification.CallStyle notification$CallStyle0, boolean z) {
                return notification$CallStyle0.setIsVideo(z);
            }

            static Notification.CallStyle h(Notification.CallStyle notification$CallStyle0, Icon icon0) {
                return notification$CallStyle0.setVerificationIcon(icon0);
            }

            static Notification.CallStyle i(Notification.CallStyle notification$CallStyle0, CharSequence charSequence0) {
                return notification$CallStyle0.setVerificationText(charSequence0);
            }
        }

        @RestrictTo({Scope.c})
        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        private int e;
        private Person f;
        private PendingIntent g;
        private PendingIntent h;
        private PendingIntent i;
        private boolean j;
        private Integer k;
        private Integer l;
        private IconCompat m;
        private CharSequence n;
        private static final String o = "androidx.core.app.NotificationCompat$CallStyle";
        public static final int p = 0;
        public static final int q = 1;
        public static final int r = 2;
        public static final int s = 3;
        private static final String t = "key_action_priority";

        public CallStyle() {
        }

        private CallStyle(int v, Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1, PendingIntent pendingIntent2) {
            if(person0 == null || TextUtils.isEmpty(person0.f())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.e = v;
            this.f = person0;
            this.g = pendingIntent2;
            this.h = pendingIntent1;
            this.i = pendingIntent0;
        }

        public CallStyle(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.z(notificationCompat$Builder0);
        }

        public static CallStyle A(Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
            Objects.requireNonNull(pendingIntent0, "declineIntent is required");
            Objects.requireNonNull(pendingIntent1, "answerIntent is required");
            return new CallStyle(1, person0, null, pendingIntent0, pendingIntent1);
        }

        public static CallStyle B(Person person0, PendingIntent pendingIntent0) {
            Objects.requireNonNull(pendingIntent0, "hangUpIntent is required");
            return new CallStyle(2, person0, pendingIntent0, null, null);
        }

        public static CallStyle C(Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
            Objects.requireNonNull(pendingIntent0, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent1, "answerIntent is required");
            return new CallStyle(3, person0, pendingIntent0, null, pendingIntent1);
        }

        @RequiresApi(20)
        @RestrictTo({Scope.c})
        public ArrayList D() {
            Action notificationCompat$Action0 = this.I();
            Action notificationCompat$Action1 = this.H();
            ArrayList arrayList0 = new ArrayList(3);
            arrayList0.add(notificationCompat$Action0);
            ArrayList arrayList1 = this.a.b;
            int v = 2;
            if(arrayList1 != null) {
                for(Object object0: arrayList1) {
                    Action notificationCompat$Action2 = (Action)object0;
                    if(notificationCompat$Action2.l()) {
                        arrayList0.add(notificationCompat$Action2);
                    }
                    else if(!this.F(notificationCompat$Action2) && v > 1) {
                        arrayList0.add(notificationCompat$Action2);
                        --v;
                    }
                    if(notificationCompat$Action1 != null && v == 1) {
                        arrayList0.add(notificationCompat$Action1);
                        v = 0;
                    }
                }
            }
            if(notificationCompat$Action1 != null && v >= 1) {
                arrayList0.add(notificationCompat$Action1);
            }
            return arrayList0;
        }

        private String E() {
            switch(this.e) {
                case 1: {
                    return this.a.a.getResources().getString(string.call_notification_incoming_text);
                }
                case 2: {
                    return this.a.a.getResources().getString(string.call_notification_ongoing_text);
                }
                case 3: {
                    return this.a.a.getResources().getString(string.call_notification_screening_text);
                }
                default: {
                    return null;
                }
            }
        }

        private boolean F(Action notificationCompat$Action0) {
            return notificationCompat$Action0 != null && notificationCompat$Action0.d().getBoolean("key_action_priority");
        }

        @RequiresApi(20)
        private Action G(int v, int v1, Integer integer0, int v2, PendingIntent pendingIntent0) {
            if(integer0 == null) {
                integer0 = ContextCompat.getColor(this.a.a, v2);
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            spannableStringBuilder0.append(this.a.a.getResources().getString(v1));
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(((int)integer0)), 0, spannableStringBuilder0.length(), 18);
            Action notificationCompat$Action0 = new Builder(IconCompat.r(this.a.a, v), spannableStringBuilder0, pendingIntent0).c();
            notificationCompat$Action0.d().putBoolean("key_action_priority", true);
            return notificationCompat$Action0;
        }

        @RequiresApi(20)
        private Action H() {
            PendingIntent pendingIntent0 = this.g;
            if(pendingIntent0 == null) {
                return null;
            }
            int v = this.j ? 0x7F08023C : 0x7F08023A;  // drawable:ic_call_answer_video
            return this.j ? this.G(v, string.call_notification_answer_video_action, this.k, color.call_notification_answer_color, pendingIntent0) : this.G(v, string.call_notification_answer_action, this.k, color.call_notification_answer_color, pendingIntent0);
        }

        @RequiresApi(20)
        private Action I() {
            return this.h == null ? this.G(0x7F08023E, string.call_notification_hang_up_action, this.l, color.call_notification_decline_color, this.i) : this.G(0x7F08023E, string.call_notification_decline_action, this.l, color.call_notification_decline_color, this.h);  // drawable:ic_call_decline
        }

        public CallStyle J(@ColorInt int v) {
            this.k = v;
            return this;
        }

        public CallStyle K(@ColorInt int v) {
            this.l = v;
            return this;
        }

        public CallStyle L(boolean z) {
            this.j = z;
            return this;
        }

        public CallStyle M(Bitmap bitmap0) {
            this.m = IconCompat.n(bitmap0);
            return this;
        }

        @RequiresApi(23)
        public CallStyle N(Icon icon0) {
            this.m = icon0 == null ? null : IconCompat.h(icon0);
            return this;
        }

        public CallStyle O(CharSequence charSequence0) {
            this.n = charSequence0;
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void a(Bundle bundle0) {
            super.a(bundle0);
            bundle0.putInt("android.callType", this.e);
            bundle0.putBoolean("android.callIsVideo", this.j);
            Person person0 = this.f;
            if(person0 != null) {
                if(Build.VERSION.SDK_INT >= 28) {
                    bundle0.putParcelable("android.callPerson", androidx.core.app.NotificationCompat.CallStyle.Api28Impl.b(person0.k()));
                }
                else {
                    bundle0.putParcelable("android.callPersonCompat", person0.m());
                }
            }
            IconCompat iconCompat0 = this.m;
            if(iconCompat0 != null) {
                if(Build.VERSION.SDK_INT >= 23) {
                    bundle0.putParcelable("android.verificationIcon", androidx.core.app.NotificationCompat.CallStyle.Api23Impl.a(iconCompat0.I(this.a.a)));
                }
                else {
                    bundle0.putParcelable("android.verificationIconCompat", iconCompat0.G());
                }
            }
            bundle0.putCharSequence("android.verificationText", this.n);
            bundle0.putParcelable("android.answerIntent", this.g);
            bundle0.putParcelable("android.declineIntent", this.h);
            bundle0.putParcelable("android.hangUpIntent", this.i);
            Integer integer0 = this.k;
            if(integer0 != null) {
                bundle0.putInt("android.answerColor", ((int)integer0));
            }
            Integer integer1 = this.l;
            if(integer1 != null) {
                bundle0.putInt("android.declineColor", ((int)integer1));
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            int v = Build.VERSION.SDK_INT;
            Notification.CallStyle notification$CallStyle0 = null;
            if(v >= 0x1F) {
                switch(this.e) {
                    case 1: {
                        notification$CallStyle0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.a(this.f.k(), this.h, this.g);
                        break;
                    }
                    case 2: {
                        notification$CallStyle0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.b(this.f.k(), this.i);
                        break;
                    }
                    case 3: {
                        notification$CallStyle0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.c(this.f.k(), this.i, this.g);
                        break;
                    }
                    default: {
                        if(Log.isLoggable("NotifCompat", 3)) {
                            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + this.e);
                        }
                    }
                }
                if(notification$CallStyle0 != null) {
                    notification$CallStyle0.setBuilder(notificationBuilderWithBuilderAccessor0.a());
                    Integer integer0 = this.k;
                    if(integer0 != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.d(notification$CallStyle0, ((int)integer0));
                    }
                    Integer integer1 = this.l;
                    if(integer1 != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.f(notification$CallStyle0, ((int)integer1));
                    }
                    androidx.core.app.NotificationCompat.CallStyle.Api31Impl.i(notification$CallStyle0, this.n);
                    IconCompat iconCompat0 = this.m;
                    if(iconCompat0 != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.h(notification$CallStyle0, iconCompat0.I(this.a.a));
                    }
                    androidx.core.app.NotificationCompat.CallStyle.Api31Impl.g(notification$CallStyle0, this.j);
                }
            }
            else {
                Notification.Builder notification$Builder0 = notificationBuilderWithBuilderAccessor0.a();
                notification$Builder0.setContentTitle((this.f == null ? null : this.f.f()));
                Bundle bundle0 = this.a.E;
                if(bundle0 != null && bundle0.containsKey("android.text")) {
                    notification$CallStyle0 = this.a.E.getCharSequence("android.text");
                }
                if(notification$CallStyle0 == null) {
                    notification$CallStyle0 = this.E();
                }
                notification$Builder0.setContentText(((CharSequence)notification$CallStyle0));
                Person person0 = this.f;
                if(person0 != null) {
                    if(v >= 23 && person0.d() != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api23Impl.c(notification$Builder0, this.f.d().I(this.a.a));
                    }
                    if(v >= 28) {
                        androidx.core.app.NotificationCompat.CallStyle.Api28Impl.a(notification$Builder0, this.f.k());
                    }
                    else {
                        androidx.core.app.NotificationCompat.CallStyle.Api21Impl.a(notification$Builder0, this.f.g());
                    }
                }
                androidx.core.app.NotificationCompat.CallStyle.Api21Impl.b(notification$Builder0, "call");
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public boolean r() {
            return true;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            super.y(bundle0);
            this.e = bundle0.getInt("android.callType");
            this.j = bundle0.getBoolean("android.callIsVideo");
            int v = Build.VERSION.SDK_INT;
            if(v >= 28 && bundle0.containsKey("android.callPerson")) {
                this.f = Person.a(t.a(bundle0.getParcelable("android.callPerson")));
            }
            else if(bundle0.containsKey("android.callPersonCompat")) {
                this.f = Person.b(bundle0.getBundle("android.callPersonCompat"));
            }
            if(v >= 23 && bundle0.containsKey("android.verificationIcon")) {
                this.m = IconCompat.h(v.a(bundle0.getParcelable("android.verificationIcon")));
            }
            else if(bundle0.containsKey("android.verificationIconCompat")) {
                this.m = IconCompat.f(bundle0.getBundle("android.verificationIconCompat"));
            }
            this.n = bundle0.getCharSequence("android.verificationText");
            this.g = (PendingIntent)bundle0.getParcelable("android.answerIntent");
            this.h = (PendingIntent)bundle0.getParcelable("android.declineIntent");
            this.i = (PendingIntent)bundle0.getParcelable("android.hangUpIntent");
            Integer integer0 = null;
            this.k = bundle0.containsKey("android.answerColor") ? bundle0.getInt("android.answerColor") : null;
            if(bundle0.containsKey("android.declineColor")) {
                integer0 = bundle0.getInt("android.declineColor");
            }
            this.l = integer0;
        }
    }

    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        @RequiresApi(20)
        static class androidx.core.app.NotificationCompat.CarExtender.Api20Impl {
            static RemoteInput.Builder a(RemoteInput.Builder remoteInput$Builder0, Bundle bundle0) {
                return remoteInput$Builder0.addExtras(bundle0);
            }

            static RemoteInput b(RemoteInput.Builder remoteInput$Builder0) {
                return remoteInput$Builder0.build();
            }

            static Parcelable c(RemoteInput remoteInput0) {
                return remoteInput0;
            }

            static RemoteInput.Builder d(String s) {
                return new RemoteInput.Builder(s);
            }

            static boolean e(RemoteInput remoteInput0) {
                return remoteInput0.getAllowFreeFormInput();
            }

            static CharSequence[] f(RemoteInput remoteInput0) {
                return remoteInput0.getChoices();
            }

            static Bundle g(RemoteInput remoteInput0) {
                return remoteInput0.getExtras();
            }

            static CharSequence h(RemoteInput remoteInput0) {
                return remoteInput0.getLabel();
            }

            static String i(RemoteInput remoteInput0) {
                return remoteInput0.getResultKey();
            }

            static RemoteInput.Builder j(RemoteInput.Builder remoteInput$Builder0, boolean z) {
                return remoteInput$Builder0.setAllowFreeFormInput(z);
            }

            static RemoteInput.Builder k(RemoteInput.Builder remoteInput$Builder0, CharSequence[] arr_charSequence) {
                return remoteInput$Builder0.setChoices(arr_charSequence);
            }

            static RemoteInput.Builder l(RemoteInput.Builder remoteInput$Builder0, CharSequence charSequence0) {
                return remoteInput$Builder0.setLabel(charSequence0);
            }
        }

        @RequiresApi(29)
        static class androidx.core.app.NotificationCompat.CarExtender.Api29Impl {
            static int a(RemoteInput remoteInput0) {
                return remoteInput0.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        public static class UnreadConversation {
            public static class androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder {
                private final List a;
                private final String b;
                private androidx.core.app.RemoteInput c;
                private PendingIntent d;
                private PendingIntent e;
                private long f;

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder(String s) {
                    this.a = new ArrayList();
                    this.b = s;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder a(String s) {
                    if(s != null) {
                        this.a.add(s);
                    }
                    return this;
                }

                public UnreadConversation b() {
                    return new UnreadConversation(((String[])this.a.toArray(new String[this.a.size()])), this.c, this.e, this.d, new String[]{this.b}, this.f);
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder c(long v) {
                    this.f = v;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder d(PendingIntent pendingIntent0) {
                    this.d = pendingIntent0;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder e(PendingIntent pendingIntent0, androidx.core.app.RemoteInput remoteInput0) {
                    this.c = remoteInput0;
                    this.e = pendingIntent0;
                    return this;
                }
            }

            private final String[] a;
            private final androidx.core.app.RemoteInput b;
            private final PendingIntent c;
            private final PendingIntent d;
            private final String[] e;
            private final long f;

            UnreadConversation(String[] arr_s, androidx.core.app.RemoteInput remoteInput0, PendingIntent pendingIntent0, PendingIntent pendingIntent1, String[] arr_s1, long v) {
                this.a = arr_s;
                this.b = remoteInput0;
                this.d = pendingIntent1;
                this.c = pendingIntent0;
                this.e = arr_s1;
                this.f = v;
            }

            public long a() {
                return this.f;
            }

            public String[] b() {
                return this.a;
            }

            public String c() {
                return this.e.length <= 0 ? null : this.e[0];
            }

            public String[] d() {
                return this.e;
            }

            public PendingIntent e() {
                return this.d;
            }

            public androidx.core.app.RemoteInput f() {
                return this.b;
            }

            public PendingIntent g() {
                return this.c;
            }
        }

        private Bitmap a;
        private UnreadConversation b;
        private int c;
        @RestrictTo({Scope.c})
        static final String d = "android.car.EXTENSIONS";
        private static final String e = "large_icon";
        private static final String f = "car_conversation";
        private static final String g = "app_color";
        @RestrictTo({Scope.c})
        static final String h = "invisible_actions";
        private static final String i = "author";
        private static final String j = "text";
        private static final String k = "messages";
        private static final String l = "remote_input";
        private static final String m = "on_reply";
        private static final String n = "on_read";
        private static final String o = "participants";
        private static final String p = "timestamp";

        public CarExtender() {
            this.c = 0;
        }

        public CarExtender(Notification notification0) {
            this.c = 0;
            Bundle bundle0 = NotificationCompat.n(notification0) == null ? null : NotificationCompat.n(notification0).getBundle("android.car.EXTENSIONS");
            if(bundle0 != null) {
                this.a = (Bitmap)bundle0.getParcelable("large_icon");
                this.c = bundle0.getInt("app_color", 0);
                this.b = CarExtender.f(bundle0.getBundle("car_conversation"));
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        public androidx.core.app.NotificationCompat.Builder a(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            Bundle bundle0 = new Bundle();
            Bitmap bitmap0 = this.a;
            if(bitmap0 != null) {
                bundle0.putParcelable("large_icon", bitmap0);
            }
            int v = this.c;
            if(v != 0) {
                bundle0.putInt("app_color", v);
            }
            UnreadConversation notificationCompat$CarExtender$UnreadConversation0 = this.b;
            if(notificationCompat$CarExtender$UnreadConversation0 != null) {
                bundle0.putBundle("car_conversation", CarExtender.b(notificationCompat$CarExtender$UnreadConversation0));
            }
            notificationCompat$Builder0.t().putBundle("android.car.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        @RequiresApi(21)
        private static Bundle b(UnreadConversation notificationCompat$CarExtender$UnreadConversation0) {
            Bundle bundle0 = new Bundle();
            String s = notificationCompat$CarExtender$UnreadConversation0.d() == null || notificationCompat$CarExtender$UnreadConversation0.d().length <= 1 ? null : notificationCompat$CarExtender$UnreadConversation0.d()[0];
            String[] arr_s = notificationCompat$CarExtender$UnreadConversation0.b();
            Parcelable[] arr_parcelable = new Parcelable[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("text", notificationCompat$CarExtender$UnreadConversation0.b()[v]);
                bundle1.putString("author", s);
                arr_parcelable[v] = bundle1;
            }
            bundle0.putParcelableArray("messages", arr_parcelable);
            androidx.core.app.RemoteInput remoteInput0 = notificationCompat$CarExtender$UnreadConversation0.f();
            if(remoteInput0 != null) {
                RemoteInput.Builder remoteInput$Builder0 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.d(remoteInput0.o());
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.l(remoteInput$Builder0, remoteInput0.n());
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.k(remoteInput$Builder0, remoteInput0.h());
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.j(remoteInput$Builder0, remoteInput0.f());
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.a(remoteInput$Builder0, remoteInput0.m());
                bundle0.putParcelable("remote_input", androidx.core.app.NotificationCompat.CarExtender.Api20Impl.c(androidx.core.app.NotificationCompat.CarExtender.Api20Impl.b(remoteInput$Builder0)));
            }
            bundle0.putParcelable("on_reply", notificationCompat$CarExtender$UnreadConversation0.g());
            bundle0.putParcelable("on_read", notificationCompat$CarExtender$UnreadConversation0.e());
            bundle0.putStringArray("participants", notificationCompat$CarExtender$UnreadConversation0.d());
            bundle0.putLong("timestamp", notificationCompat$CarExtender$UnreadConversation0.a());
            return bundle0;
        }

        @ColorInt
        public int c() {
            return this.c;
        }

        public Bitmap d() {
            return this.a;
        }

        @Deprecated
        public UnreadConversation e() {
            return this.b;
        }

        @RequiresApi(21)
        private static UnreadConversation f(Bundle bundle0) {
            String[] arr_s1;
            UnreadConversation notificationCompat$CarExtender$UnreadConversation0 = null;
            if(bundle0 == null) {
                return null;
            }
            Parcelable[] arr_parcelable = bundle0.getParcelableArray("messages");
            if(arr_parcelable == null) {
                arr_s1 = null;
            }
            else {
                String[] arr_s = new String[arr_parcelable.length];
                int v = 0;
                while(v < arr_parcelable.length) {
                    Parcelable parcelable0 = arr_parcelable[v];
                    if(parcelable0 instanceof Bundle) {
                        String s = ((Bundle)parcelable0).getString("text");
                        arr_s[v] = s;
                        if(s == null) {
                            return null;
                        }
                        ++v;
                        continue;
                    }
                    return null;
                }
                arr_s1 = arr_s;
            }
            Parcelable parcelable1 = bundle0.getParcelable("on_read");
            Parcelable parcelable2 = bundle0.getParcelable("on_reply");
            RemoteInput remoteInput0 = (RemoteInput)bundle0.getParcelable("remote_input");
            String[] arr_s2 = bundle0.getStringArray("participants");
            if(arr_s2 != null && arr_s2.length == 1) {
                if(remoteInput0 != null) {
                    notificationCompat$CarExtender$UnreadConversation0 = new androidx.core.app.RemoteInput(androidx.core.app.NotificationCompat.CarExtender.Api20Impl.i(remoteInput0), androidx.core.app.NotificationCompat.CarExtender.Api20Impl.h(remoteInput0), androidx.core.app.NotificationCompat.CarExtender.Api20Impl.f(remoteInput0), androidx.core.app.NotificationCompat.CarExtender.Api20Impl.e(remoteInput0), (Build.VERSION.SDK_INT < 29 ? 0 : androidx.core.app.NotificationCompat.CarExtender.Api29Impl.a(remoteInput0)), androidx.core.app.NotificationCompat.CarExtender.Api20Impl.g(remoteInput0), null);
                }
                return new UnreadConversation(arr_s1, ((androidx.core.app.RemoteInput)notificationCompat$CarExtender$UnreadConversation0), ((PendingIntent)parcelable2), ((PendingIntent)parcelable1), arr_s2, bundle0.getLong("timestamp"));
            }
            return null;
        }

        public CarExtender g(@ColorInt int v) {
            this.c = v;
            return this;
        }

        public CarExtender h(Bitmap bitmap0) {
            this.a = bitmap0;
            return this;
        }

        @Deprecated
        public CarExtender i(UnreadConversation notificationCompat$CarExtender$UnreadConversation0) {
            this.b = notificationCompat$CarExtender$UnreadConversation0;
            return this;
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.DecoratedCustomViewStyle.Api24Impl {
            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private static final String e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        private static final int f = 3;

        private RemoteViews A(RemoteViews remoteViews0, boolean z) {
            int v = 0;
            RemoteViews remoteViews1 = this.c(true, layout.notification_template_custom_big, false);
            remoteViews1.removeAllViews(id.actions);
            List list0 = DecoratedCustomViewStyle.C(this.a.b);
            if(!z || list0 == null) {
                v = 8;
            }
            else {
                int v1 = Math.min(list0.size(), 3);
                if(v1 > 0) {
                    for(int v2 = 0; v2 < v1; ++v2) {
                        RemoteViews remoteViews2 = this.B(((Action)list0.get(v2)));
                        remoteViews1.addView(id.actions, remoteViews2);
                    }
                }
                else {
                    v = 8;
                }
            }
            remoteViews1.setViewVisibility(id.actions, v);
            remoteViews1.setViewVisibility(id.action_divider, v);
            this.e(remoteViews1, remoteViews0);
            return remoteViews1;
        }

        private RemoteViews B(Action notificationCompat$Action0) {
            boolean z = notificationCompat$Action0.k == null;
            RemoteViews remoteViews0 = new RemoteViews("com.dcinside.app.android", (z ? layout.notification_action_tombstone : layout.notification_action));
            IconCompat iconCompat0 = notificationCompat$Action0.f();
            if(iconCompat0 != null) {
                Bitmap bitmap0 = this.o(iconCompat0, color.notification_action_color_filter);
                remoteViews0.setImageViewBitmap(id.action_image, bitmap0);
            }
            remoteViews0.setTextViewText(id.action_text, notificationCompat$Action0.j);
            if(!z) {
                remoteViews0.setOnClickPendingIntent(id.action_container, notificationCompat$Action0.k);
            }
            remoteViews0.setContentDescription(id.action_container, notificationCompat$Action0.j);
            return remoteViews0;
        }

        private static List C(List list0) {
            if(list0 == null) {
                return null;
            }
            List list1 = new ArrayList();
            for(Object object0: list0) {
                Action notificationCompat$Action0 = (Action)object0;
                if(!notificationCompat$Action0.l()) {
                    list1.add(notificationCompat$Action0);
                }
            }
            return list1;
        }

        @RequiresApi(24)
        public static List D(Context context0, Notification notification0) {
            ApplicationInfo applicationInfo0;
            Context context1;
            if(!"android.app.Notification$DecoratedCustomViewStyle".equals(notification0.extras.getString("android.template"))) {
                return Collections.emptyList();
            }
            RemoteViews remoteViews0 = notification0.contentView;
            if(remoteViews0 == null && notification0.bigContentView == null && notification0.headsUpContentView == null) {
                return Collections.emptyList();
            }
            RemoteViews remoteViews1 = notification0.bigContentView;
            if(remoteViews1 != null) {
                remoteViews0 = remoteViews1;
            }
            else if(remoteViews0 == null) {
                remoteViews0 = notification0.headsUpContentView;
            }
            String s = remoteViews0.getPackage();
            try {
                context1 = context0.createPackageContext(s, 0);
                applicationInfo0 = context0.getPackageManager().getApplicationInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new RuntimeException(packageManager$NameNotFoundException0);
            }
            context1.setTheme(applicationInfo0.theme);
            View view0 = remoteViews0.apply(context1, null);
            List list0 = new ArrayList();
            DecoratedCustomViewStyle.E(view0, ((ArrayList)list0));
            return list0;
        }

        private static void E(View view0, ArrayList arrayList0) {
            if(!(view0 instanceof ViewGroup)) {
                return;
            }
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(view1 instanceof TextView) {
                    CharSequence charSequence0 = ((TextView)view1).getText();
                    if(charSequence0 != null && charSequence0.length() > 0) {
                        arrayList0.add(charSequence0);
                    }
                }
                if(view1 instanceof ViewGroup) {
                    DecoratedCustomViewStyle.E(view1, arrayList0);
                }
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                notificationBuilderWithBuilderAccessor0.a().setStyle(androidx.core.app.NotificationCompat.DecoratedCustomViewStyle.Api24Impl.a());
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public boolean r() {
            return true;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public RemoteViews v(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews0 = this.a.p();
            if(remoteViews0 == null) {
                remoteViews0 = this.a.s();
            }
            return remoteViews0 == null ? null : this.A(remoteViews0, true);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public RemoteViews w(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            return this.a.s() == null ? null : this.A(this.a.s(), false);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public RemoteViews x(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews0 = this.a.w();
            return remoteViews0 == null ? null : this.A((remoteViews0 == null ? this.a.s() : remoteViews0), true);
        }
    }

    public interface androidx.core.app.NotificationCompat.Extender {
        androidx.core.app.NotificationCompat.Builder a(androidx.core.app.NotificationCompat.Builder arg1);
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {
        private ArrayList e;
        private static final String f = "androidx.core.app.NotificationCompat$InboxStyle";

        public InboxStyle() {
            this.e = new ArrayList();
        }

        public InboxStyle(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.e = new ArrayList();
            this.z(notificationCompat$Builder0);
        }

        public InboxStyle A(CharSequence charSequence0) {
            if(charSequence0 != null) {
                this.e.add(androidx.core.app.NotificationCompat.Builder.A(charSequence0));
            }
            return this;
        }

        public InboxStyle B(CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            return this;
        }

        public InboxStyle C(CharSequence charSequence0) {
            this.c = androidx.core.app.NotificationCompat.Builder.A(charSequence0);
            this.d = true;
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.InboxStyle notification$InboxStyle0 = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor0.a()).setBigContentTitle(this.b);
            if(this.d) {
                notification$InboxStyle0.setSummaryText(this.c);
            }
            for(Object object0: this.e) {
                notification$InboxStyle0.addLine(((CharSequence)object0));
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void g(Bundle bundle0) {
            super.g(bundle0);
            bundle0.remove("android.textLines");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            super.y(bundle0);
            this.e.clear();
            if(bundle0.containsKey("android.textLines")) {
                Collections.addAll(this.e, bundle0.getCharSequenceArray("android.textLines"));
            }
        }
    }

    public static class MessagingStyle extends Style {
        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl {
            static Notification.MessagingStyle a(Notification.MessagingStyle notification$MessagingStyle0, Notification.MessagingStyle.Message notification$MessagingStyle$Message0) {
                return notification$MessagingStyle0.addMessage(notification$MessagingStyle$Message0);
            }

            static Notification.MessagingStyle b(CharSequence charSequence0) {
                return new Notification.MessagingStyle(charSequence0);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle notification$MessagingStyle0, CharSequence charSequence0) {
                return notification$MessagingStyle0.setConversationTitle(charSequence0);
            }
        }

        @RequiresApi(26)
        static class androidx.core.app.NotificationCompat.MessagingStyle.Api26Impl {
            static Notification.MessagingStyle a(Notification.MessagingStyle notification$MessagingStyle0, Notification.MessagingStyle.Message notification$MessagingStyle$Message0) {
                return notification$MessagingStyle0.addHistoricMessage(notification$MessagingStyle$Message0);
            }
        }

        @RequiresApi(28)
        static class androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl {
            static Notification.MessagingStyle a(android.app.Person person0) {
                return new Notification.MessagingStyle(person0);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle notification$MessagingStyle0, boolean z) {
                return notification$MessagingStyle0.setGroupConversation(z);
            }
        }

        public static final class Message {
            @RequiresApi(24)
            static class androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl {
                static Notification.MessagingStyle.Message a(CharSequence charSequence0, long v, CharSequence charSequence1) {
                    return new Notification.MessagingStyle.Message(charSequence0, v, charSequence1);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message notification$MessagingStyle$Message0, String s, Uri uri0) {
                    return notification$MessagingStyle$Message0.setData(s, uri0);
                }
            }

            @RequiresApi(28)
            static class androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl {
                static Parcelable a(android.app.Person person0) {
                    return person0;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence0, long v, android.app.Person person0) {
                    return new Notification.MessagingStyle.Message(charSequence0, v, person0);
                }
            }

            private final CharSequence a;
            private final long b;
            private final Person c;
            private Bundle d;
            private String e;
            private Uri f;
            static final String g = "text";
            static final String h = "time";
            static final String i = "sender";
            static final String j = "type";
            static final String k = "uri";
            static final String l = "extras";
            static final String m = "person";
            static final String n = "sender_person";

            public Message(CharSequence charSequence0, long v, Person person0) {
                this.d = new Bundle();
                this.a = charSequence0;
                this.b = v;
                this.c = person0;
            }

            @Deprecated
            public Message(CharSequence charSequence0, long v, CharSequence charSequence1) {
                this(charSequence0, v, new androidx.core.app.Person.Builder().f(charSequence1).a());
            }

            static Bundle[] a(List list0) {
                Bundle[] arr_bundle = new Bundle[list0.size()];
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    arr_bundle[v1] = ((Message)list0.get(v1)).m();
                }
                return arr_bundle;
            }

            public String b() {
                return this.e;
            }

            public Uri c() {
                return this.f;
            }

            public Bundle d() {
                return this.d;
            }

            static Message e(Bundle bundle0) {
                Person person0;
                try {
                    if(bundle0.containsKey("text") && bundle0.containsKey("time")) {
                        if(bundle0.containsKey("person")) {
                            person0 = Person.b(bundle0.getBundle("person"));
                        }
                        else if(bundle0.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            person0 = Person.a(t.a(bundle0.getParcelable("sender_person")));
                        }
                        else {
                            person0 = bundle0.containsKey("sender") ? new androidx.core.app.Person.Builder().f(bundle0.getCharSequence("sender")).a() : null;
                        }
                        Message notificationCompat$MessagingStyle$Message0 = new Message(bundle0.getCharSequence("text"), bundle0.getLong("time"), person0);
                        if(bundle0.containsKey("type") && bundle0.containsKey("uri")) {
                            notificationCompat$MessagingStyle$Message0.k(bundle0.getString("type"), ((Uri)bundle0.getParcelable("uri")));
                        }
                        if(bundle0.containsKey("extras")) {
                            notificationCompat$MessagingStyle$Message0.d().putAll(bundle0.getBundle("extras"));
                        }
                        return notificationCompat$MessagingStyle$Message0;
                    }
                }
                catch(ClassCastException unused_ex) {
                }
                return null;
            }

            static List f(Parcelable[] arr_parcelable) {
                List list0 = new ArrayList(arr_parcelable.length);
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    Parcelable parcelable0 = arr_parcelable[v];
                    if(parcelable0 instanceof Bundle) {
                        Message notificationCompat$MessagingStyle$Message0 = Message.e(((Bundle)parcelable0));
                        if(notificationCompat$MessagingStyle$Message0 != null) {
                            list0.add(notificationCompat$MessagingStyle$Message0);
                        }
                    }
                }
                return list0;
            }

            public Person g() {
                return this.c;
            }

            @Deprecated
            public CharSequence h() {
                return this.c == null ? null : this.c.f();
            }

            public CharSequence i() {
                return this.a;
            }

            public long j() {
                return this.b;
            }

            public Message k(String s, Uri uri0) {
                this.e = s;
                this.f = uri0;
                return this;
            }

            @RequiresApi(24)
            @RestrictTo({Scope.c})
            Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message notification$MessagingStyle$Message0;
                Person person0 = this.g();
                android.app.Person person1 = null;
                if(Build.VERSION.SDK_INT >= 28) {
                    CharSequence charSequence0 = this.i();
                    long v = this.j();
                    if(person0 != null) {
                        person1 = person0.k();
                    }
                    notification$MessagingStyle$Message0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.b(charSequence0, v, person1);
                }
                else {
                    CharSequence charSequence1 = this.i();
                    long v1 = this.j();
                    if(person0 != null) {
                        person1 = person0.f();
                    }
                    notification$MessagingStyle$Message0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.a(charSequence1, v1, ((CharSequence)person1));
                }
                if(this.b() != null) {
                    androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.b(notification$MessagingStyle$Message0, this.b(), this.c());
                }
                return notification$MessagingStyle$Message0;
            }

            private Bundle m() {
                Bundle bundle0 = new Bundle();
                CharSequence charSequence0 = this.a;
                if(charSequence0 != null) {
                    bundle0.putCharSequence("text", charSequence0);
                }
                bundle0.putLong("time", this.b);
                Person person0 = this.c;
                if(person0 != null) {
                    bundle0.putCharSequence("sender", person0.f());
                    if(Build.VERSION.SDK_INT >= 28) {
                        bundle0.putParcelable("sender_person", androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.a(this.c.k()));
                    }
                    else {
                        bundle0.putBundle("person", this.c.m());
                    }
                }
                String s = this.e;
                if(s != null) {
                    bundle0.putString("type", s);
                }
                Uri uri0 = this.f;
                if(uri0 != null) {
                    bundle0.putParcelable("uri", uri0);
                }
                Bundle bundle1 = this.d;
                if(bundle1 != null) {
                    bundle0.putBundle("extras", bundle1);
                }
                return bundle0;
            }
        }

        private final List e;
        private final List f;
        private Person g;
        private CharSequence h;
        private Boolean i;
        private static final String j = "androidx.core.app.NotificationCompat$MessagingStyle";
        public static final int k = 25;

        MessagingStyle() {
            this.e = new ArrayList();
            this.f = new ArrayList();
        }

        public MessagingStyle(Person person0) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            if(TextUtils.isEmpty(person0.f())) {
                throw new IllegalArgumentException("User\'s name must not be empty.");
            }
            this.g = person0;
        }

        @Deprecated
        public MessagingStyle(CharSequence charSequence0) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.g = new androidx.core.app.Person.Builder().f(charSequence0).a();
        }

        public MessagingStyle A(Message notificationCompat$MessagingStyle$Message0) {
            if(notificationCompat$MessagingStyle$Message0 != null) {
                this.f.add(notificationCompat$MessagingStyle$Message0);
                if(this.f.size() > 25) {
                    this.f.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle B(Message notificationCompat$MessagingStyle$Message0) {
            if(notificationCompat$MessagingStyle$Message0 != null) {
                this.e.add(notificationCompat$MessagingStyle$Message0);
                if(this.e.size() > 25) {
                    this.e.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle C(CharSequence charSequence0, long v, Person person0) {
            this.B(new Message(charSequence0, v, person0));
            return this;
        }

        @Deprecated
        public MessagingStyle D(CharSequence charSequence0, long v, CharSequence charSequence1) {
            Message notificationCompat$MessagingStyle$Message0 = new Message(charSequence0, v, new androidx.core.app.Person.Builder().f(charSequence1).a());
            this.e.add(notificationCompat$MessagingStyle$Message0);
            if(this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }

        public static MessagingStyle E(Notification notification0) {
            Style notificationCompat$Style0 = Style.s(notification0);
            return notificationCompat$Style0 instanceof MessagingStyle ? ((MessagingStyle)notificationCompat$Style0) : null;
        }

        private Message F() {
            for(int v = this.e.size() - 1; v >= 0; --v) {
                Message notificationCompat$MessagingStyle$Message0 = (Message)this.e.get(v);
                if(notificationCompat$MessagingStyle$Message0.g() != null && !TextUtils.isEmpty(notificationCompat$MessagingStyle$Message0.g().f())) {
                    return notificationCompat$MessagingStyle$Message0;
                }
            }
            return this.e.isEmpty() ? null : ((Message)this.e.get(this.e.size() - 1));
        }

        public CharSequence G() {
            return this.h;
        }

        public List H() {
            return this.f;
        }

        public List I() {
            return this.e;
        }

        public Person J() {
            return this.g;
        }

        @Deprecated
        public CharSequence K() {
            return this.g.f();
        }

        private boolean L() {
            for(int v = this.e.size() - 1; v >= 0; --v) {
                Message notificationCompat$MessagingStyle$Message0 = (Message)this.e.get(v);
                if(notificationCompat$MessagingStyle$Message0.g() != null && notificationCompat$MessagingStyle$Message0.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean M() {
            return this.i == null ? false : this.i.booleanValue();
        }

        private TextAppearanceSpan N(int v) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(v), null);
        }

        private CharSequence O(Message notificationCompat$MessagingStyle$Message0) {
            BidiFormatter bidiFormatter0 = BidiFormatter.c();
            CharSequence charSequence0 = new SpannableStringBuilder();
            CharSequence charSequence1 = "";
            CharSequence charSequence2 = notificationCompat$MessagingStyle$Message0.g() == null ? "" : notificationCompat$MessagingStyle$Message0.g().f();
            int v = 0xFF000000;
            if(TextUtils.isEmpty(charSequence2)) {
                charSequence2 = this.g.f();
                if(this.a.r() != 0) {
                    v = this.a.r();
                }
            }
            CharSequence charSequence3 = bidiFormatter0.m(charSequence2);
            ((SpannableStringBuilder)charSequence0).append(charSequence3);
            ((SpannableStringBuilder)charSequence0).setSpan(this.N(v), ((SpannableStringBuilder)charSequence0).length() - charSequence3.length(), ((SpannableStringBuilder)charSequence0).length(), 33);
            if(notificationCompat$MessagingStyle$Message0.i() != null) {
                charSequence1 = notificationCompat$MessagingStyle$Message0.i();
            }
            ((SpannableStringBuilder)charSequence0).append("  ").append(bidiFormatter0.m(charSequence1));
            return charSequence0;
        }

        public MessagingStyle P(CharSequence charSequence0) {
            this.h = charSequence0;
            return this;
        }

        public MessagingStyle Q(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        public void a(Bundle bundle0) {
            super.a(bundle0);
            bundle0.putCharSequence("android.selfDisplayName", this.g.f());
            bundle0.putBundle("android.messagingStyleUser", this.g.m());
            bundle0.putCharSequence("android.hiddenConversationTitle", this.h);
            if(this.h != null && this.i.booleanValue()) {
                bundle0.putCharSequence("android.conversationTitle", this.h);
            }
            if(!this.e.isEmpty()) {
                bundle0.putParcelableArray("android.messages", Message.a(this.e));
            }
            if(!this.f.isEmpty()) {
                bundle0.putParcelableArray("android.messages.historic", Message.a(this.f));
            }
            Boolean boolean0 = this.i;
            if(boolean0 != null) {
                bundle0.putBoolean("android.isGroupConversation", boolean0.booleanValue());
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            this.Q(this.M());
            int v = Build.VERSION.SDK_INT;
            if(v >= 24) {
                Notification.MessagingStyle notification$MessagingStyle0 = v < 28 ? androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.b(this.g.f()) : androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.a(this.g.k());
                for(Object object0: this.e) {
                    androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.a(notification$MessagingStyle0, ((Message)object0).l());
                }
                if(Build.VERSION.SDK_INT >= 26) {
                    for(Object object1: this.f) {
                        androidx.core.app.NotificationCompat.MessagingStyle.Api26Impl.a(notification$MessagingStyle0, ((Message)object1).l());
                    }
                }
                if(this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.c(notification$MessagingStyle0, this.h);
                }
                if(Build.VERSION.SDK_INT >= 28) {
                    androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.b(notification$MessagingStyle0, this.i.booleanValue());
                }
                notification$MessagingStyle0.setBuilder(notificationBuilderWithBuilderAccessor0.a());
                return;
            }
            Message notificationCompat$MessagingStyle$Message0 = this.F();
            if(this.h != null && this.i.booleanValue()) {
                notificationBuilderWithBuilderAccessor0.a().setContentTitle(this.h);
            }
            else if(notificationCompat$MessagingStyle$Message0 != null) {
                notificationBuilderWithBuilderAccessor0.a().setContentTitle("");
                if(notificationCompat$MessagingStyle$Message0.g() != null) {
                    notificationBuilderWithBuilderAccessor0.a().setContentTitle(notificationCompat$MessagingStyle$Message0.g().f());
                }
            }
            if(notificationCompat$MessagingStyle$Message0 != null) {
                notificationBuilderWithBuilderAccessor0.a().setContentText((this.h == null ? notificationCompat$MessagingStyle$Message0.i() : this.O(notificationCompat$MessagingStyle$Message0)));
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            boolean z = this.h != null || this.L();
            for(int v1 = this.e.size() - 1; v1 >= 0; --v1) {
                Message notificationCompat$MessagingStyle$Message1 = (Message)this.e.get(v1);
                CharSequence charSequence0 = z ? this.O(notificationCompat$MessagingStyle$Message1) : notificationCompat$MessagingStyle$Message1.i();
                if(v1 != this.e.size() - 1) {
                    spannableStringBuilder0.insert(0, "\n");
                }
                spannableStringBuilder0.insert(0, charSequence0);
            }
            new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor0.a()).setBigContentTitle(null).bigText(spannableStringBuilder0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void g(Bundle bundle0) {
            super.g(bundle0);
            bundle0.remove("android.messagingStyleUser");
            bundle0.remove("android.selfDisplayName");
            bundle0.remove("android.conversationTitle");
            bundle0.remove("android.hiddenConversationTitle");
            bundle0.remove("android.messages");
            bundle0.remove("android.messages.historic");
            bundle0.remove("android.isGroupConversation");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected String t() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            super.y(bundle0);
            this.e.clear();
            this.g = bundle0.containsKey("android.messagingStyleUser") ? Person.b(bundle0.getBundle("android.messagingStyleUser")) : new androidx.core.app.Person.Builder().f(bundle0.getString("android.selfDisplayName")).a();
            CharSequence charSequence0 = bundle0.getCharSequence("android.conversationTitle");
            this.h = charSequence0;
            if(charSequence0 == null) {
                this.h = bundle0.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] arr_parcelable = bundle0.getParcelableArray("android.messages");
            if(arr_parcelable != null) {
                List list0 = Message.f(arr_parcelable);
                this.e.addAll(list0);
            }
            Parcelable[] arr_parcelable1 = bundle0.getParcelableArray("android.messages.historic");
            if(arr_parcelable1 != null) {
                List list1 = Message.f(arr_parcelable1);
                this.f.addAll(list1);
            }
            if(bundle0.containsKey("android.isGroupConversation")) {
                this.i = Boolean.valueOf(bundle0.getBoolean("android.isGroupConversation"));
            }
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.Style.Api24Impl {
            static void a(RemoteViews remoteViews0, int v, boolean z) {
                remoteViews0.setChronometerCountDown(v, z);
            }
        }

        @RestrictTo({Scope.c})
        protected androidx.core.app.NotificationCompat.Builder a;
        CharSequence b;
        CharSequence c;
        boolean d;

        public Style() {
            this.d = false;
        }

        @RestrictTo({Scope.c})
        public void a(Bundle bundle0) {
            if(this.d) {
                bundle0.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence0 = this.b;
            if(charSequence0 != null) {
                bundle0.putCharSequence("android.title.big", charSequence0);
            }
            String s = this.t();
            if(s != null) {
                bundle0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", s);
            }
        }

        @RestrictTo({Scope.c})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
        }

        @RestrictTo({Scope.c})
        public RemoteViews c(boolean z, int v, boolean z1) {
            int v9;
            boolean z2;
            Resources resources0 = this.a.a.getResources();
            RemoteViews remoteViews0 = new RemoteViews("com.dcinside.app.android", v);
            int v1 = Build.VERSION.SDK_INT;
            androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = this.a;
            int v2 = 0;
            if(notificationCompat$Builder0.j != null) {
                remoteViews0.setViewVisibility(id.icon, 0);
                Bitmap bitmap0 = this.o(this.a.j, 0);
                remoteViews0.setImageViewBitmap(id.icon, bitmap0);
                if(z && this.a.U.icon != 0) {
                    int v3 = resources0.getDimensionPixelSize(dimen.notification_right_icon_size);
                    int v4 = resources0.getDimensionPixelSize(dimen.notification_small_icon_background_padding);
                    Bitmap bitmap1 = this.q(this.a.U.icon, v3, v3 - v4 * 2, this.a.r());
                    remoteViews0.setImageViewBitmap(id.right_icon, bitmap1);
                    remoteViews0.setViewVisibility(id.right_icon, 0);
                }
            }
            else if(z && notificationCompat$Builder0.U.icon != 0) {
                remoteViews0.setViewVisibility(id.icon, 0);
                int v5 = resources0.getDimensionPixelSize(dimen.notification_large_icon_width);
                int v6 = resources0.getDimensionPixelSize(dimen.notification_big_circle_margin);
                int v7 = resources0.getDimensionPixelSize(dimen.notification_small_icon_size_as_large);
                Bitmap bitmap2 = this.q(this.a.U.icon, v5 - v6, v7, this.a.r());
                remoteViews0.setImageViewBitmap(id.icon, bitmap2);
            }
            CharSequence charSequence0 = this.a.e;
            if(charSequence0 != null) {
                remoteViews0.setTextViewText(id.title, charSequence0);
            }
            CharSequence charSequence1 = this.a.f;
            int v8 = 1;
            if(charSequence1 == null) {
                z2 = false;
            }
            else {
                remoteViews0.setTextViewText(id.text, charSequence1);
                z2 = true;
            }
            androidx.core.app.NotificationCompat.Builder notificationCompat$Builder1 = this.a;
            CharSequence charSequence2 = notificationCompat$Builder1.k;
            if(charSequence2 != null) {
                remoteViews0.setTextViewText(id.info, charSequence2);
                remoteViews0.setViewVisibility(id.info, 0);
                z2 = true;
                v9 = 1;
            }
            else if(notificationCompat$Builder1.l > 0) {
                int v10 = resources0.getInteger(integer.status_bar_notification_info_maxnum);
                if(this.a.l > v10) {
                    String s = resources0.getString(string.status_bar_notification_info_overflow);
                    remoteViews0.setTextViewText(id.info, s);
                }
                else {
                    String s1 = NumberFormat.getIntegerInstance().format(((long)this.a.l));
                    remoteViews0.setTextViewText(id.info, s1);
                }
                remoteViews0.setViewVisibility(id.info, 0);
                z2 = true;
                v9 = 1;
            }
            else {
                remoteViews0.setViewVisibility(id.info, 8);
                v9 = 0;
            }
            CharSequence charSequence3 = this.a.r;
            if(charSequence3 != null) {
                remoteViews0.setTextViewText(id.text, charSequence3);
                CharSequence charSequence4 = this.a.f;
                if(charSequence4 == null) {
                    remoteViews0.setViewVisibility(id.text2, 8);
                }
                else {
                    remoteViews0.setTextViewText(id.text2, charSequence4);
                    remoteViews0.setViewVisibility(id.text2, 0);
                    if(z1) {
                        remoteViews0.setTextViewTextSize(0x7F0B0F76, 0, ((float)resources0.getDimensionPixelSize(dimen.notification_subtext_size)));  // id:text
                    }
                    remoteViews0.setViewPadding(id.line1, 0, 0, 0, 0);
                }
            }
            if(this.a.z() == 0L) {
                v8 = v9;
            }
            else if(this.a.o) {
                remoteViews0.setViewVisibility(id.chronometer, 0);
                remoteViews0.setLong(id.chronometer, "setBase", this.a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                remoteViews0.setBoolean(id.chronometer, "setStarted", true);
                if(this.a.p && v1 >= 24) {
                    androidx.core.app.NotificationCompat.Style.Api24Impl.a(remoteViews0, 0x7F0B02B7, true);  // id:chronometer
                }
            }
            else {
                remoteViews0.setViewVisibility(id.time, 0);
                long v11 = this.a.z();
                remoteViews0.setLong(id.time, "setTime", v11);
            }
            remoteViews0.setViewVisibility(0x7F0B0D86, (v8 == 0 ? 8 : 0));  // id:right_side
            if(!z2) {
                v2 = 8;
            }
            remoteViews0.setViewVisibility(0x7F0B06EE, v2);  // id:line3
            return remoteViews0;
        }

        public Notification d() {
            return this.a == null ? null : this.a.h();
        }

        @RestrictTo({Scope.c})
        public void e(RemoteViews remoteViews0, RemoteViews remoteViews1) {
            this.u(remoteViews0);
            remoteViews0.removeAllViews(id.notification_main_column);
            RemoteViews remoteViews2 = remoteViews1.clone();
            remoteViews0.addView(id.notification_main_column, remoteViews2);
            remoteViews0.setViewVisibility(id.notification_main_column, 0);
            int v = this.f();
            remoteViews0.setViewPadding(id.notification_main_column_container, 0, v, 0, 0);
        }

        private int f() {
            Resources resources0 = this.a.a.getResources();
            int v = resources0.getDimensionPixelSize(dimen.notification_top_pad);
            int v1 = resources0.getDimensionPixelSize(dimen.notification_top_pad_large_text);
            float f = (Style.h(resources0.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.3f;
            return Math.round((1.0f - f) * ((float)v) + f * ((float)v1));
        }

        @RestrictTo({Scope.c})
        protected void g(Bundle bundle0) {
            bundle0.remove("android.summaryText");
            bundle0.remove("android.title.big");
            bundle0.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        private static float h(float f, float f1, float f2) {
            if(f < f1) {
                return f1;
            }
            return f > f2 ? f2 : f;
        }

        static Style i(String s) {
            if(s != null) {
                switch(s) {
                    case "androidx.core.app.NotificationCompat$BigPictureStyle": {
                        return new BigPictureStyle();
                    }
                    case "androidx.core.app.NotificationCompat$BigTextStyle": {
                        return new BigTextStyle();
                    }
                    case "androidx.core.app.NotificationCompat$CallStyle": {
                        return new CallStyle();
                    }
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle": {
                        return new DecoratedCustomViewStyle();
                    }
                    case "androidx.core.app.NotificationCompat$InboxStyle": {
                        return new InboxStyle();
                    }
                    case "androidx.core.app.NotificationCompat$MessagingStyle": {
                        return new MessagingStyle();
                    }
                    default: {
                        return null;
                    }
                }
            }
            return null;
        }

        private static Style j(String s) {
            if(s == null) {
                return null;
            }
            if(s.equals("android.app.Notification$BigPictureStyle")) {
                return new BigPictureStyle();
            }
            if(s.equals("android.app.Notification$BigTextStyle")) {
                return new BigTextStyle();
            }
            if(s.equals("android.app.Notification$InboxStyle")) {
                return new InboxStyle();
            }
            if(Build.VERSION.SDK_INT >= 24) {
                if(s.equals("android.app.Notification$MessagingStyle")) {
                    return new MessagingStyle();
                }
                if(s.equals("android.app.Notification$DecoratedCustomViewStyle")) {
                    return new DecoratedCustomViewStyle();
                }
            }
            return null;
        }

        static Style k(Bundle bundle0) {
            Style notificationCompat$Style0 = Style.i(bundle0.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if(notificationCompat$Style0 != null) {
                return notificationCompat$Style0;
            }
            if(!bundle0.containsKey("android.selfDisplayName") && !bundle0.containsKey("android.messagingStyleUser")) {
                if(!bundle0.containsKey("android.picture") && !bundle0.containsKey("android.pictureIcon")) {
                    if(bundle0.containsKey("android.bigText")) {
                        return new BigTextStyle();
                    }
                    if(bundle0.containsKey("android.textLines")) {
                        return new InboxStyle();
                    }
                    return bundle0.containsKey("android.callType") ? new CallStyle() : Style.j(bundle0.getString("android.template"));
                }
                return new BigPictureStyle();
            }
            return new MessagingStyle();
        }

        static Style l(Bundle bundle0) {
            Style notificationCompat$Style0 = Style.k(bundle0);
            if(notificationCompat$Style0 == null) {
                return null;
            }
            try {
                notificationCompat$Style0.y(bundle0);
                return notificationCompat$Style0;
            }
            catch(ClassCastException unused_ex) {
                return null;
            }
        }

        @RestrictTo({Scope.c})
        public Bitmap m(int v, int v1) {
            return this.n(v, v1, 0);
        }

        private Bitmap n(int v, int v1, int v2) {
            return this.p(IconCompat.r(this.a.a, v), v1, v2);
        }

        Bitmap o(IconCompat iconCompat0, int v) {
            return this.p(iconCompat0, v, 0);
        }

        private Bitmap p(IconCompat iconCompat0, int v, int v1) {
            Drawable drawable0 = iconCompat0.B(this.a.a);
            int v2 = v1 == 0 ? drawable0.getIntrinsicWidth() : v1;
            if(v1 == 0) {
                v1 = drawable0.getIntrinsicHeight();
            }
            Bitmap bitmap0 = Bitmap.createBitmap(v2, v1, Bitmap.Config.ARGB_8888);
            drawable0.setBounds(0, 0, v2, v1);
            if(v != 0) {
                drawable0.mutate().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.SRC_IN));
            }
            drawable0.draw(new Canvas(bitmap0));
            return bitmap0;
        }

        private Bitmap q(int v, int v1, int v2, int v3) {
            if(v3 == 0) {
                v3 = 0;
            }
            Bitmap bitmap0 = this.n(0x7F080459, v3, v1);  // drawable:notification_icon_background
            Canvas canvas0 = new Canvas(bitmap0);
            Drawable drawable0 = this.a.a.getResources().getDrawable(v).mutate();
            drawable0.setFilterBitmap(true);
            int v4 = (v1 - v2) / 2;
            drawable0.setBounds(v4, v4, v2 + v4, v2 + v4);
            drawable0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawable0.draw(canvas0);
            return bitmap0;
        }

        @RestrictTo({Scope.c})
        public boolean r() {
            return false;
        }

        @RestrictTo({Scope.c})
        public static Style s(Notification notification0) {
            Bundle bundle0 = NotificationCompat.n(notification0);
            return bundle0 == null ? null : Style.l(bundle0);
        }

        @RestrictTo({Scope.c})
        protected String t() {
            return null;
        }

        private void u(RemoteViews remoteViews0) {
            remoteViews0.setViewVisibility(id.title, 8);
            remoteViews0.setViewVisibility(id.text2, 8);
            remoteViews0.setViewVisibility(id.text, 8);
        }

        @RestrictTo({Scope.c})
        public RemoteViews v(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.c})
        public RemoteViews w(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.c})
        public RemoteViews x(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.c})
        protected void y(Bundle bundle0) {
            if(bundle0.containsKey("android.summaryText")) {
                this.c = bundle0.getCharSequence("android.summaryText");
                this.d = true;
            }
            this.b = bundle0.getCharSequence("android.title.big");
        }

        public void z(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            if(this.a != notificationCompat$Builder0) {
                this.a = notificationCompat$Builder0;
                if(notificationCompat$Builder0 != null) {
                    notificationCompat$Builder0.z0(this);
                }
            }
        }
    }

    public static final class TvExtender implements androidx.core.app.NotificationCompat.Extender {
        private int a;
        private String b;
        private PendingIntent c;
        private PendingIntent d;
        private boolean e;
        private static final String f = "TvExtender";
        @RestrictTo({Scope.c})
        static final String g = "android.tv.EXTENSIONS";
        @RestrictTo({Scope.c})
        private static final String h = "flags";
        static final String i = "content_intent";
        static final String j = "delete_intent";
        static final String k = "channel_id";
        static final String l = "suppressShowOverApps";
        private static final int m = 1;

        public TvExtender() {
            this.a = 1;
        }

        public TvExtender(Notification notification0) {
            if(Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle0 = notification0.extras == null ? null : notification0.extras.getBundle("android.tv.EXTENSIONS");
            if(bundle0 != null) {
                this.a = bundle0.getInt("flags");
                this.b = bundle0.getString("channel_id");
                this.e = bundle0.getBoolean("suppressShowOverApps");
                this.c = (PendingIntent)bundle0.getParcelable("content_intent");
                this.d = (PendingIntent)bundle0.getParcelable("delete_intent");
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        public androidx.core.app.NotificationCompat.Builder a(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            if(Build.VERSION.SDK_INT < 26) {
                return notificationCompat$Builder0;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putInt("flags", this.a);
            bundle0.putString("channel_id", this.b);
            bundle0.putBoolean("suppressShowOverApps", this.e);
            PendingIntent pendingIntent0 = this.c;
            if(pendingIntent0 != null) {
                bundle0.putParcelable("content_intent", pendingIntent0);
            }
            PendingIntent pendingIntent1 = this.d;
            if(pendingIntent1 != null) {
                bundle0.putParcelable("delete_intent", pendingIntent1);
            }
            notificationCompat$Builder0.t().putBundle("android.tv.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        public String b() {
            return this.b;
        }

        public PendingIntent c() {
            return this.c;
        }

        public PendingIntent d() {
            return this.d;
        }

        public boolean e() {
            return (this.a & 1) != 0;
        }

        public boolean f() {
            return this.e;
        }

        public TvExtender g(String s) {
            this.b = s;
            return this;
        }

        public TvExtender h(PendingIntent pendingIntent0) {
            this.c = pendingIntent0;
            return this;
        }

        public TvExtender i(PendingIntent pendingIntent0) {
            this.d = pendingIntent0;
            return this;
        }

        public TvExtender j(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static final class androidx.core.app.NotificationCompat.WearableExtender implements androidx.core.app.NotificationCompat.Extender {
        @RequiresApi(20)
        static class androidx.core.app.NotificationCompat.WearableExtender.Api20Impl {
            static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
                return notification$Action$Builder0.addExtras(bundle0);
            }

            static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
                return notification$Action$Builder0.addRemoteInput(remoteInput0);
            }

            static Notification.Action c(Notification.Action.Builder notification$Action$Builder0) {
                return notification$Action$Builder0.build();
            }

            static Notification.Action.Builder d(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
                return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
            }

            public static Action e(ArrayList arrayList0, int v) {
                return NotificationCompat.b(((Notification.Action)arrayList0.get(v)));
            }
        }

        @RequiresApi(23)
        static class androidx.core.app.NotificationCompat.WearableExtender.Api23Impl {
            static Notification.Action.Builder a(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
                return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
            }
        }

        @RequiresApi(24)
        static class androidx.core.app.NotificationCompat.WearableExtender.Api24Impl {
            static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
                return notification$Action$Builder0.setAllowGeneratedReplies(z);
            }
        }

        @RequiresApi(0x1F)
        static class androidx.core.app.NotificationCompat.WearableExtender.Api31Impl {
            static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
                return notification$Action$Builder0.setAuthenticationRequired(z);
            }
        }

        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 0x20;
        private static final int S = 0x40;
        private static final int T = 1;
        private static final int U = 0x800005;
        private static final int V = 80;
        private ArrayList a;
        private int b;
        private PendingIntent c;
        private ArrayList d;
        private Bitmap e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private String m;
        private String n;
        public static final int o = -1;
        @Deprecated
        public static final int p = 0;
        @Deprecated
        public static final int q = 1;
        @Deprecated
        public static final int r = 2;
        @Deprecated
        public static final int s = 3;
        @Deprecated
        public static final int t = 4;
        @Deprecated
        public static final int u = 5;
        @Deprecated
        public static final int v = 0;
        @Deprecated
        public static final int w = -1;
        private static final String x = "android.wearable.EXTENSIONS";
        private static final String y = "actions";
        private static final String z = "flags";

        public androidx.core.app.NotificationCompat.WearableExtender() {
            this.a = new ArrayList();
            this.b = 1;
            this.d = new ArrayList();
            this.g = 0x800005;
            this.h = -1;
            this.i = 0;
            this.k = 80;
        }

        public androidx.core.app.NotificationCompat.WearableExtender(Notification notification0) {
            this.a = new ArrayList();
            this.b = 1;
            this.d = new ArrayList();
            this.g = 0x800005;
            this.h = -1;
            this.i = 0;
            this.k = 80;
            Bundle bundle0 = NotificationCompat.n(notification0);
            Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("android.wearable.EXTENSIONS");
            if(bundle1 != null) {
                ArrayList arrayList0 = bundle1.getParcelableArrayList("actions");
                if(arrayList0 != null) {
                    int v = arrayList0.size();
                    Action[] arr_notificationCompat$Action = new Action[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_notificationCompat$Action[v1] = androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.e(arrayList0, v1);
                    }
                    Collections.addAll(this.a, arr_notificationCompat$Action);
                }
                this.b = bundle1.getInt("flags", 1);
                this.c = (PendingIntent)bundle1.getParcelable("displayIntent");
                Notification[] arr_notification = NotificationCompat.u(bundle1, "pages");
                if(arr_notification != null) {
                    Collections.addAll(this.d, arr_notification);
                }
                this.e = (Bitmap)bundle1.getParcelable("background");
                this.f = bundle1.getInt("contentIcon");
                this.g = bundle1.getInt("contentIconGravity", 0x800005);
                this.h = bundle1.getInt("contentActionIndex", -1);
                this.i = bundle1.getInt("customSizePreset", 0);
                this.j = bundle1.getInt("customContentHeight");
                this.k = bundle1.getInt("gravity", 80);
                this.l = bundle1.getInt("hintScreenTimeout");
                this.m = bundle1.getString("dismissalId");
                this.n = bundle1.getString("bridgeTag");
            }
        }

        @Deprecated
        public boolean A() {
            return (this.b & 4) != 0;
        }

        @Deprecated
        public List B() {
            return this.d;
        }

        public boolean C() {
            return (this.b & 8) != 0;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender D(Bitmap bitmap0) {
            this.e = bitmap0;
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender E(String s) {
            this.n = s;
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender F(int v) {
            this.h = v;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender G(int v) {
            this.f = v;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender H(int v) {
            this.g = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender I(boolean z) {
            this.N(1, z);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender J(int v) {
            this.j = v;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender K(int v) {
            this.i = v;
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender L(String s) {
            this.m = s;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender M(PendingIntent pendingIntent0) {
            this.c = pendingIntent0;
            return this;
        }

        private void N(int v, boolean z) {
            if(z) {
                this.b |= v;
                return;
            }
            this.b &= ~v;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender O(int v) {
            this.k = v;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender P(boolean z) {
            this.N(0x20, z);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender Q(boolean z) {
            this.N(16, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender R(boolean z) {
            this.N(0x40, z);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender S(boolean z) {
            this.N(2, z);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender T(int v) {
            this.l = v;
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender U(boolean z) {
            this.N(4, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender V(boolean z) {
            this.N(8, z);
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        public androidx.core.app.NotificationCompat.Builder a(androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            Bundle bundle0 = new Bundle();
            if(!this.a.isEmpty()) {
                ArrayList arrayList0 = new ArrayList(this.a.size());
                for(Object object0: this.a) {
                    arrayList0.add(androidx.core.app.NotificationCompat.WearableExtender.i(((Action)object0)));
                }
                bundle0.putParcelableArrayList("actions", arrayList0);
            }
            int v = this.b;
            if(v != 1) {
                bundle0.putInt("flags", v);
            }
            PendingIntent pendingIntent0 = this.c;
            if(pendingIntent0 != null) {
                bundle0.putParcelable("displayIntent", pendingIntent0);
            }
            if(!this.d.isEmpty()) {
                bundle0.putParcelableArray("pages", ((Parcelable[])this.d.toArray(new Notification[this.d.size()])));
            }
            Bitmap bitmap0 = this.e;
            if(bitmap0 != null) {
                bundle0.putParcelable("background", bitmap0);
            }
            int v1 = this.f;
            if(v1 != 0) {
                bundle0.putInt("contentIcon", v1);
            }
            int v2 = this.g;
            if(v2 != 0x800005) {
                bundle0.putInt("contentIconGravity", v2);
            }
            int v3 = this.h;
            if(v3 != -1) {
                bundle0.putInt("contentActionIndex", v3);
            }
            int v4 = this.i;
            if(v4 != 0) {
                bundle0.putInt("customSizePreset", v4);
            }
            int v5 = this.j;
            if(v5 != 0) {
                bundle0.putInt("customContentHeight", v5);
            }
            int v6 = this.k;
            if(v6 != 80) {
                bundle0.putInt("gravity", v6);
            }
            int v7 = this.l;
            if(v7 != 0) {
                bundle0.putInt("hintScreenTimeout", v7);
            }
            String s = this.m;
            if(s != null) {
                bundle0.putString("dismissalId", s);
            }
            String s1 = this.n;
            if(s1 != null) {
                bundle0.putString("bridgeTag", s1);
            }
            notificationCompat$Builder0.t().putBundle("android.wearable.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        public androidx.core.app.NotificationCompat.WearableExtender b(Action notificationCompat$Action0) {
            this.a.add(notificationCompat$Action0);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender c(List list0) {
            this.a.addAll(list0);
            return this;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.h();
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender d(Notification notification0) {
            this.d.add(notification0);
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender e(List list0) {
            this.d.addAll(list0);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender f() {
            this.a.clear();
            return this;
        }

        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender g() {
            this.d.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender h() {
            androidx.core.app.NotificationCompat.WearableExtender notificationCompat$WearableExtender0 = new androidx.core.app.NotificationCompat.WearableExtender();
            notificationCompat$WearableExtender0.a = new ArrayList(this.a);
            notificationCompat$WearableExtender0.b = this.b;
            notificationCompat$WearableExtender0.c = this.c;
            notificationCompat$WearableExtender0.d = new ArrayList(this.d);
            notificationCompat$WearableExtender0.e = this.e;
            notificationCompat$WearableExtender0.f = this.f;
            notificationCompat$WearableExtender0.g = this.g;
            notificationCompat$WearableExtender0.h = this.h;
            notificationCompat$WearableExtender0.i = this.i;
            notificationCompat$WearableExtender0.j = this.j;
            notificationCompat$WearableExtender0.k = this.k;
            notificationCompat$WearableExtender0.l = this.l;
            notificationCompat$WearableExtender0.m = this.m;
            notificationCompat$WearableExtender0.n = this.n;
            return notificationCompat$WearableExtender0;
        }

        @RequiresApi(20)
        private static Notification.Action i(Action notificationCompat$Action0) {
            Notification.Action.Builder notification$Action$Builder0;
            int v = Build.VERSION.SDK_INT;
            if(v >= 23) {
                IconCompat iconCompat0 = notificationCompat$Action0.f();
                notification$Action$Builder0 = androidx.core.app.NotificationCompat.WearableExtender.Api23Impl.a((iconCompat0 == null ? null : iconCompat0.H()), notificationCompat$Action0.j(), notificationCompat$Action0.a());
            }
            else {
                IconCompat iconCompat1 = notificationCompat$Action0.f();
                notification$Action$Builder0 = androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.d((iconCompat1 == null || iconCompat1.y() != 2 ? 0 : iconCompat1.u()), notificationCompat$Action0.j(), notificationCompat$Action0.a());
            }
            Bundle bundle0 = notificationCompat$Action0.d() == null ? new Bundle() : new Bundle(notificationCompat$Action0.d());
            bundle0.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.b());
            if(v >= 24) {
                androidx.core.app.NotificationCompat.WearableExtender.Api24Impl.a(notification$Action$Builder0, notificationCompat$Action0.b());
            }
            if(v >= 0x1F) {
                androidx.core.app.NotificationCompat.WearableExtender.Api31Impl.a(notification$Action$Builder0, notificationCompat$Action0.k());
            }
            androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.a(notification$Action$Builder0, bundle0);
            androidx.core.app.RemoteInput[] arr_remoteInput = notificationCompat$Action0.g();
            if(arr_remoteInput != null) {
                RemoteInput[] arr_remoteInput1 = androidx.core.app.RemoteInput.d(arr_remoteInput);
                for(int v1 = 0; v1 < arr_remoteInput1.length; ++v1) {
                    androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.b(notification$Action$Builder0, arr_remoteInput1[v1]);
                }
            }
            return androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.c(notification$Action$Builder0);
        }

        public List j() {
            return this.a;
        }

        @Deprecated
        public Bitmap k() {
            return this.e;
        }

        public String l() {
            return this.n;
        }

        public int m() {
            return this.h;
        }

        @Deprecated
        public int n() {
            return this.f;
        }

        @Deprecated
        public int o() {
            return this.g;
        }

        public boolean p() {
            return (this.b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.j;
        }

        @Deprecated
        public int r() {
            return this.i;
        }

        public String s() {
            return this.m;
        }

        @Deprecated
        public PendingIntent t() {
            return this.c;
        }

        @Deprecated
        public int u() {
            return this.k;
        }

        @Deprecated
        public boolean v() {
            return (this.b & 0x20) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.b & 16) != 0;
        }

        public boolean x() {
            return (this.b & 0x40) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.l;
        }
    }

    public static final int A = 2;
    @RestrictTo({Scope.c})
    public static final int A0 = 3;
    @SuppressLint({"ActionValue"})
    public static final String B = "android.title";
    public static final int B0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String C = "android.title.big";
    public static final int C0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String D = "android.text";
    public static final int D0 = -1;
    @SuppressLint({"ActionValue"})
    public static final String E = "android.subText";
    public static final String E0 = "call";
    @SuppressLint({"ActionValue"})
    public static final String F = "android.remoteInputHistory";
    public static final String F0 = "navigation";
    @SuppressLint({"ActionValue"})
    public static final String G = "android.infoText";
    public static final String G0 = "msg";
    @SuppressLint({"ActionValue"})
    public static final String H = "android.summaryText";
    public static final String H0 = "email";
    @SuppressLint({"ActionValue"})
    public static final String I = "android.bigText";
    public static final String I0 = "event";
    @SuppressLint({"ActionValue"})
    public static final String J = "android.icon";
    public static final String J0 = "promo";
    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon";
    public static final String K0 = "alarm";
    @SuppressLint({"ActionValue"})
    public static final String L = "android.largeIcon.big";
    public static final String L0 = "progress";
    @SuppressLint({"ActionValue"})
    public static final String M = "android.progress";
    public static final String M0 = "social";
    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressMax";
    public static final String N0 = "err";
    @SuppressLint({"ActionValue"})
    public static final String O = "android.progressIndeterminate";
    public static final String O0 = "transport";
    @SuppressLint({"ActionValue"})
    public static final String P = "android.showChronometer";
    public static final String P0 = "sys";
    @SuppressLint({"ActionValue"})
    public static final String Q = "android.chronometerCountDown";
    public static final String Q0 = "service";
    @SuppressLint({"ActionValue"})
    public static final String R = "android.colorized";
    public static final String R0 = "reminder";
    @SuppressLint({"ActionValue"})
    public static final String S = "android.showWhen";
    public static final String S0 = "recommendation";
    @SuppressLint({"ActionValue"})
    public static final String T = "android.picture";
    public static final String T0 = "status";
    @SuppressLint({"ActionValue"})
    public static final String U = "android.pictureIcon";
    public static final String U0 = "workout";
    @SuppressLint({"ActionValue"})
    public static final String V = "android.pictureContentDescription";
    public static final String V0 = "location_sharing";
    @SuppressLint({"ActionValue"})
    public static final String W = "android.showBigPictureWhenCollapsed";
    public static final String W0 = "stopwatch";
    @SuppressLint({"ActionValue"})
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";
    @SuppressLint({"ActionValue"})
    public static final String Y = "android.template";
    public static final String Y0 = "voicemail";
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final int Z0 = 0;
    private static final String a = "NotifCompat";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String a0 = "android.people";
    public static final int a1 = 1;
    @SuppressLint({"ActionValue"})
    public static final String b = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})
    public static final String b0 = "android.people.list";
    public static final int b1 = 2;
    @SuppressLint({"ActionValue"})
    public static final String c = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})
    public static final String c0 = "android.backgroundImageUri";
    public static final int c1 = 0;
    @SuppressLint({"ActionValue"})
    public static final String d = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})
    public static final String d0 = "android.mediaSession";
    public static final int d1 = 1;
    @SuppressLint({"ActionValue"})
    public static final String e = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})
    public static final String e0 = "android.compactActions";
    public static final int e1 = 2;
    @SuppressLint({"ActionValue"})
    public static final String f = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})
    public static final String f0 = "android.selfDisplayName";
    public static final String f1 = "silent";
    public static final int g = -1;
    @SuppressLint({"ActionValue"})
    public static final String g0 = "android.messagingStyleUser";
    public static final int g1 = 0;
    public static final int h = 1;
    @SuppressLint({"ActionValue"})
    public static final String h0 = "android.conversationTitle";
    public static final int h1 = 1;
    public static final int i = 2;
    @SuppressLint({"ActionValue"})
    public static final String i0 = "android.messages";
    public static final int i1 = 2;
    public static final int j = 4;
    @SuppressLint({"ActionValue"})
    public static final String j0 = "android.messages.historic";
    public static final int k = -1;
    @SuppressLint({"ActionValue"})
    public static final String k0 = "android.isGroupConversation";
    public static final int l = 1;
    @SuppressLint({"ActionValue"})
    public static final String l0 = "android.callType";
    public static final int m = 2;
    @SuppressLint({"ActionValue"})
    public static final String m0 = "android.callIsVideo";
    public static final int n = 4;
    @SuppressLint({"ActionValue"})
    public static final String n0 = "android.callPerson";
    public static final int o = 8;
    @SuppressLint({"ActionValue"})
    public static final String o0 = "android.callPersonCompat";
    public static final int p = 16;
    @SuppressLint({"ActionValue"})
    public static final String p0 = "android.verificationIcon";
    public static final int q = 0x20;
    @SuppressLint({"ActionValue"})
    public static final String q0 = "android.verificationIconCompat";
    public static final int r = 0x40;
    @SuppressLint({"ActionValue"})
    public static final String r0 = "android.verificationText";
    @Deprecated
    public static final int s = 0x80;
    @SuppressLint({"ActionValue"})
    public static final String s0 = "android.answerIntent";
    public static final int t = 0x100;
    @SuppressLint({"ActionValue"})
    public static final String t0 = "android.declineIntent";
    public static final int u = 0x200;
    @SuppressLint({"ActionValue"})
    public static final String u0 = "android.hangUpIntent";
    public static final int v = 0x1000;
    @SuppressLint({"ActionValue"})
    public static final String v0 = "android.answerColor";
    public static final int w = 0;
    @SuppressLint({"ActionValue"})
    public static final String w0 = "android.declineColor";
    public static final int x = -1;
    @SuppressLint({"ActionValue"})
    public static final String x0 = "android.hiddenConversationTitle";
    public static final int y = -2;
    @SuppressLint({"ActionValue"})
    public static final String y0 = "android.audioContents";
    public static final int z = 1;
    @ColorInt
    public static final int z0;

    public static String A(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.e(notification0);
    }

    public static boolean B(Notification notification0) {
        return notification0.extras.getBoolean("android.showWhen");
    }

    public static String C(Notification notification0) {
        return androidx.core.app.NotificationCompat.Api20Impl.i(notification0);
    }

    public static CharSequence D(Notification notification0) {
        return notification0.extras.getCharSequence("android.subText");
    }

    public static long E(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? 0L : Api26Impl.f(notification0);
    }

    public static boolean F(Notification notification0) {
        return notification0.extras.getBoolean("android.showChronometer");
    }

    public static int G(Notification notification0) {
        return notification0.visibility;
    }

    public static boolean H(Notification notification0) {
        return (notification0.flags & 0x200) != 0;
    }

    public static Bitmap I(Context context0, Bitmap bitmap0) {
        if(bitmap0 != null && Build.VERSION.SDK_INT < 27) {
            Resources resources0 = context0.getResources();
            int v = resources0.getDimensionPixelSize(dimen.compat_notification_large_icon_max_width);
            int v1 = resources0.getDimensionPixelSize(dimen.compat_notification_large_icon_max_height);
            if(bitmap0.getWidth() <= v && bitmap0.getHeight() <= v1) {
                return bitmap0;
            }
            double f = Math.min(((double)v) / ((double)Math.max(1, bitmap0.getWidth())), ((double)v1) / ((double)Math.max(1, bitmap0.getHeight())));
            return Bitmap.createScaledBitmap(bitmap0, ((int)Math.ceil(((double)bitmap0.getWidth()) * f)), ((int)Math.ceil(((double)bitmap0.getHeight()) * f)), true);
        }
        return bitmap0;
    }

    public static Action a(Notification notification0, int v) {
        return NotificationCompat.b(notification0.actions[v]);
    }

    @RequiresApi(20)
    static Action b(Notification.Action notification$Action0) {
        boolean z;
        androidx.core.app.RemoteInput[] arr_remoteInput1;
        RemoteInput[] arr_remoteInput = androidx.core.app.NotificationCompat.Api20Impl.g(notification$Action0);
        if(arr_remoteInput == null) {
            arr_remoteInput1 = null;
        }
        else {
            androidx.core.app.RemoteInput[] arr_remoteInput2 = new androidx.core.app.RemoteInput[arr_remoteInput.length];
            for(int v = 0; v < arr_remoteInput.length; ++v) {
                RemoteInput remoteInput0 = arr_remoteInput[v];
                arr_remoteInput2[v] = new androidx.core.app.RemoteInput(androidx.core.app.NotificationCompat.Api20Impl.h(remoteInput0), androidx.core.app.NotificationCompat.Api20Impl.f(remoteInput0), androidx.core.app.NotificationCompat.Api20Impl.b(remoteInput0), androidx.core.app.NotificationCompat.Api20Impl.a(remoteInput0), (Build.VERSION.SDK_INT < 29 ? 0 : androidx.core.app.NotificationCompat.Api29Impl.c(remoteInput0)), androidx.core.app.NotificationCompat.Api20Impl.d(remoteInput0), null);
            }
            arr_remoteInput1 = arr_remoteInput2;
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 24) {
            z = androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0).getBoolean("android.support.allowGeneratedReplies");
        }
        else if(!androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0).getBoolean("android.support.allowGeneratedReplies") && !androidx.core.app.NotificationCompat.Api24Impl.a(notification$Action0)) {
            z = false;
        }
        else {
            z = true;
        }
        boolean z1 = androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0).getBoolean("android.support.action.showsUserInterface", true);
        int v2 = v1 < 28 ? androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0).getInt("android.support.action.semanticAction", 0) : androidx.core.app.NotificationCompat.Api28Impl.a(notification$Action0);
        boolean z2 = v1 < 29 ? false : androidx.core.app.NotificationCompat.Api29Impl.e(notification$Action0);
        boolean z3 = v1 < 0x1F ? false : androidx.core.app.NotificationCompat.Api31Impl.a(notification$Action0);
        if(v1 >= 23) {
            if(androidx.core.app.NotificationCompat.Api23Impl.a(notification$Action0) == null) {
                int v3 = notification$Action0.icon;
                if(v3 != 0) {
                    return new Action(v3, notification$Action0.title, notification$Action0.actionIntent, androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0), arr_remoteInput1, null, z, v2, z1, z2, z3);
                }
            }
            return androidx.core.app.NotificationCompat.Api23Impl.a(notification$Action0) == null ? new Action(null, notification$Action0.title, notification$Action0.actionIntent, androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0), arr_remoteInput1, null, z, v2, z1, z2, z3) : new Action(IconCompat.i(androidx.core.app.NotificationCompat.Api23Impl.a(notification$Action0)), notification$Action0.title, notification$Action0.actionIntent, androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0), arr_remoteInput1, null, z, v2, z1, z2, z3);
        }
        return new Action(notification$Action0.icon, notification$Action0.title, notification$Action0.actionIntent, androidx.core.app.NotificationCompat.Api20Impl.c(notification$Action0), arr_remoteInput1, null, z, v2, z1, z2, z3);
    }

    public static int c(Notification notification0) {
        return notification0.actions == null ? 0 : notification0.actions.length;
    }

    public static boolean d(Notification notification0) {
        return Build.VERSION.SDK_INT < 29 ? false : androidx.core.app.NotificationCompat.Api29Impl.a(notification0);
    }

    public static boolean e(Notification notification0) {
        return (notification0.flags & 16) != 0;
    }

    public static int f(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? 0 : Api26Impl.a(notification0);
    }

    public static BubbleMetadata g(Notification notification0) {
        return Build.VERSION.SDK_INT < 29 ? null : BubbleMetadata.a(androidx.core.app.NotificationCompat.Api29Impl.b(notification0));
    }

    public static String h(Notification notification0) {
        return notification0.category;
    }

    public static String i(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.b(notification0);
    }

    public static int j(Notification notification0) {
        return notification0.color;
    }

    public static CharSequence k(Notification notification0) {
        return notification0.extras.getCharSequence("android.infoText");
    }

    public static CharSequence l(Notification notification0) {
        return notification0.extras.getCharSequence("android.text");
    }

    public static CharSequence m(Notification notification0) {
        return notification0.extras.getCharSequence("android.title");
    }

    @ReplaceWith(expression = "notification.extras")
    @Deprecated
    public static Bundle n(Notification notification0) {
        return notification0.extras;
    }

    public static String o(Notification notification0) {
        return androidx.core.app.NotificationCompat.Api20Impl.e(notification0);
    }

    public static int p(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? 0 : Api26Impl.c(notification0);
    }

    @RestrictTo({Scope.c})
    static boolean q(Notification notification0) {
        return (notification0.flags & 0x80) != 0;
    }

    @RequiresApi(21)
    public static List r(Notification notification0) {
        List list0 = new ArrayList();
        Bundle bundle0 = notification0.extras.getBundle("android.car.EXTENSIONS");
        if(bundle0 == null) {
            return list0;
        }
        Bundle bundle1 = bundle0.getBundle("invisible_actions");
        if(bundle1 != null) {
            for(int v = 0; v < bundle1.size(); ++v) {
                ((ArrayList)list0).add(NotificationCompatJellybean.g(bundle1.getBundle(Integer.toString(v))));
            }
        }
        return list0;
    }

    public static boolean s(Notification notification0) {
        return (notification0.flags & 0x100) != 0;
    }

    public static LocusIdCompat t(Notification notification0) {
        if(Build.VERSION.SDK_INT >= 29) {
            LocusId locusId0 = androidx.core.app.NotificationCompat.Api29Impl.d(notification0);
            return locusId0 == null ? null : LocusIdCompat.d(locusId0);
        }
        return null;
    }

    static Notification[] u(Bundle bundle0, String s) {
        Parcelable[] arr_parcelable = bundle0.getParcelableArray(s);
        if(!(arr_parcelable instanceof Notification[]) && arr_parcelable != null) {
            Notification[] arr_notification = new Notification[arr_parcelable.length];
            for(int v = 0; v < arr_parcelable.length; ++v) {
                arr_notification[v] = (Notification)arr_parcelable[v];
            }
            bundle0.putParcelableArray(s, arr_notification);
            return arr_notification;
        }
        return (Notification[])arr_parcelable;
    }

    public static boolean v(Notification notification0) {
        return (notification0.flags & 2) != 0;
    }

    public static boolean w(Notification notification0) {
        return (notification0.flags & 8) != 0;
    }

    public static List x(Notification notification0) {
        List list0 = new ArrayList();
        if(Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList0 = notification0.extras.getParcelableArrayList("android.people.list");
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    ((ArrayList)list0).add(Person.a(((android.app.Person)object0)));
                }
                return list0;
            }
        }
        else {
            String[] arr_s = notification0.extras.getStringArray("android.people");
            if(arr_s != null && arr_s.length != 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    ((ArrayList)list0).add(new androidx.core.app.Person.Builder().g(s).a());
                }
            }
        }
        return list0;
    }

    public static Notification y(Notification notification0) {
        return notification0.publicVersion;
    }

    public static CharSequence z(Notification notification0) {
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.d(notification0);
    }

    class androidx.core.app.NotificationCompat.1 {
    }

}

