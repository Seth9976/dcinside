package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.a;
import android.support.customtabs.trusted.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class TrustedWebActivityServiceConnection {
    static class ActiveNotificationsArgs {
        public final Parcelable[] a;

        ActiveNotificationsArgs(Parcelable[] arr_parcelable) {
            this.a = arr_parcelable;
        }

        public static ActiveNotificationsArgs a(Bundle bundle0) {
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
            return new ActiveNotificationsArgs(bundle0.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.a);
            return bundle0;
        }
    }

    static class CancelNotificationArgs {
        public final String a;
        public final int b;

        CancelNotificationArgs(String s, int v) {
            this.a = s;
            this.b = v;
        }

        public static CancelNotificationArgs a(Bundle bundle0) {
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.PLATFORM_ID");
            return new CancelNotificationArgs(bundle0.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle0.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.a);
            bundle0.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.b);
            return bundle0;
        }
    }

    static class NotificationsEnabledArgs {
        public final String a;

        NotificationsEnabledArgs(String s) {
            this.a = s;
        }

        public static NotificationsEnabledArgs a(Bundle bundle0) {
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotificationsEnabledArgs(bundle0.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.a);
            return bundle0;
        }
    }

    static class NotifyNotificationArgs {
        public final String a;
        public final int b;
        public final Notification c;
        public final String d;

        NotifyNotificationArgs(String s, int v, Notification notification0, String s1) {
            this.a = s;
            this.b = v;
            this.c = notification0;
            this.d = s1;
        }

        public static NotifyNotificationArgs a(Bundle bundle0) {
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotifyNotificationArgs(bundle0.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle0.getInt("android.support.customtabs.trusted.PLATFORM_ID"), ((Notification)bundle0.getParcelable("android.support.customtabs.trusted.NOTIFICATION")), bundle0.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.a);
            bundle0.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.b);
            bundle0.putParcelable("android.support.customtabs.trusted.NOTIFICATION", this.c);
            bundle0.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.d);
            return bundle0;
        }
    }

    static class ResultArgs {
        public final boolean a;

        ResultArgs(boolean z) {
            this.a = z;
        }

        public static ResultArgs a(Bundle bundle0) {
            TrustedWebActivityServiceConnection.c(bundle0, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            return new ResultArgs(bundle0.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.a);
            return bundle0;
        }
    }

    private final b a;
    private final ComponentName b;
    private static final String c = "android.support.customtabs.trusted.PLATFORM_TAG";
    private static final String d = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final String e = "android.support.customtabs.trusted.NOTIFICATION";
    private static final String f = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final String g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final String h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    TrustedWebActivityServiceConnection(@NonNull b b0, @NonNull ComponentName componentName0) {
        this.a = b0;
        this.b = componentName0;
    }

    public boolean a(@NonNull String s) throws RemoteException {
        Bundle bundle0 = new NotificationsEnabledArgs(s).b();
        return ResultArgs.a(this.a.Y0(bundle0)).a;
    }

    public void b(@NonNull String s, int v) throws RemoteException {
        Bundle bundle0 = new CancelNotificationArgs(s, v).b();
        this.a.Z0(bundle0);
    }

    static void c(Bundle bundle0, String s) {
        if(!bundle0.containsKey(s)) {
            throw new IllegalArgumentException("Bundle must contain " + s);
        }
    }

    @NonNull
    @RequiresApi(23)
    @RestrictTo({Scope.a})
    public Parcelable[] d() throws RemoteException {
        return ActiveNotificationsArgs.a(this.a.I0()).a;
    }

    @NonNull
    public ComponentName e() {
        return this.b;
    }

    @Nullable
    public Bitmap f() throws RemoteException {
        return (Bitmap)this.a.t0().getParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP");
    }

    public int g() throws RemoteException {
        return this.a.X0();
    }

    public boolean h(@NonNull String s, int v, @NonNull Notification notification0, @NonNull String s1) throws RemoteException {
        Bundle bundle0 = new NotifyNotificationArgs(s, v, notification0, s1).b();
        return ResultArgs.a(this.a.G(bundle0)).a;
    }

    @Nullable
    public Bundle i(@NonNull String s, @NonNull Bundle bundle0, @Nullable TrustedWebActivityCallback trustedWebActivityCallback0) throws RemoteException {
        a a0 = TrustedWebActivityServiceConnection.j(trustedWebActivityCallback0);
        if(a0 == null) {
            return this.a.q0(s, bundle0, null);
        }
        IBinder iBinder0 = a0.asBinder();
        return this.a.q0(s, bundle0, iBinder0);
    }

    @Nullable
    private static a j(@Nullable TrustedWebActivityCallback trustedWebActivityCallback0) {
        return trustedWebActivityCallback0 == null ? null : new android.support.customtabs.trusted.a.b() {
            @Override  // android.support.customtabs.trusted.a
            public void c1(String s, Bundle bundle0) throws RemoteException {
                trustedWebActivityCallback0.a(s, bundle0);
            }
        };
    }
}

