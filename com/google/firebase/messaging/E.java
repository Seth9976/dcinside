package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.h;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {
    public static class a {
        public final Builder a;
        public final String b;
        public final int c;

        a(Builder notificationCompat$Builder0, String s, int v) {
            this.a = notificationCompat$Builder0;
            this.b = s;
            this.c = v;
        }
    }

    public static final String a = "com.google.firebase.messaging.default_notification_color";
    public static final String b = "com.google.firebase.messaging.default_notification_icon";
    public static final String c = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String d = "fcm_fallback_notification_channel";
    public static final String e = "fcm_fallback_notification_channel_label";
    private static final String f = "Misc";
    private static final String g = "com.google.android.c2dm.intent.RECEIVE";
    private static final int h;
    private static final AtomicInteger i;

    static {
        e.i = new AtomicInteger(((int)SystemClock.elapsedRealtime()));
    }

    @Nullable
    private static PendingIntent a(Context context0, S s0, String s1, PackageManager packageManager0) {
        Intent intent0 = e.f(s1, s0, packageManager0);
        if(intent0 == null) {
            return null;
        }
        intent0.addFlags(0x4000000);
        intent0.putExtras(s0.A());
        if(e.q(s0)) {
            intent0.putExtra("gcm.n.analytics_data", s0.z());
        }
        return PendingIntent.getActivity(context0, e.g(), intent0, 0x44000000);
    }

    @Nullable
    private static PendingIntent b(Context context0, Context context1, S s0) {
        return e.q(s0) ? e.c(context0, context1, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(s0.z())) : null;
    }

    // 去混淆评级： 低(20)
    private static PendingIntent c(Context context0, Context context1, Intent intent0) {
        return PendingIntent.getBroadcast(context0, e.g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage("com.dcinside.app.android").putExtra("wrapped_intent", intent0), 0x44000000);
    }

    public static a d(Context context0, Context context1, S s0, String s1, Bundle bundle0) {
        Resources resources0 = context1.getResources();
        PackageManager packageManager0 = context1.getPackageManager();
        Builder notificationCompat$Builder0 = new Builder(context1, s1);
        String s2 = s0.n(resources0, "com.dcinside.app.android", "gcm.n.title");
        if(!TextUtils.isEmpty(s2)) {
            notificationCompat$Builder0.O(s2);
        }
        String s3 = s0.n(resources0, "com.dcinside.app.android", "gcm.n.body");
        if(!TextUtils.isEmpty(s3)) {
            notificationCompat$Builder0.N(s3);
            notificationCompat$Builder0.z0(new BigTextStyle().A(s3));
        }
        notificationCompat$Builder0.t0(e.m(packageManager0, resources0, "com.dcinside.app.android", s0.p("gcm.n.icon"), bundle0));
        Uri uri0 = e.n("com.dcinside.app.android", s0, resources0);
        if(uri0 != null) {
            notificationCompat$Builder0.x0(uri0);
        }
        notificationCompat$Builder0.M(e.a(context0, s0, "com.dcinside.app.android", packageManager0));
        PendingIntent pendingIntent0 = e.b(context0, context1, s0);
        if(pendingIntent0 != null) {
            notificationCompat$Builder0.T(pendingIntent0);
        }
        Integer integer0 = e.h(context1, s0.p("gcm.n.color"), bundle0);
        if(integer0 != null) {
            notificationCompat$Builder0.I(((int)integer0));
        }
        notificationCompat$Builder0.C(!s0.a("gcm.n.sticky"));
        notificationCompat$Builder0.e0(s0.a("gcm.n.local_only"));
        String s4 = s0.p("gcm.n.ticker");
        if(s4 != null) {
            notificationCompat$Builder0.B0(s4);
        }
        Integer integer1 = s0.m();
        if(integer1 != null) {
            notificationCompat$Builder0.k0(((int)integer1));
        }
        Integer integer2 = s0.r();
        if(integer2 != null) {
            notificationCompat$Builder0.G0(((int)integer2));
        }
        Integer integer3 = s0.l();
        if(integer3 != null) {
            notificationCompat$Builder0.h0(((int)integer3));
        }
        Long long0 = s0.j("gcm.n.event_time");
        if(long0 != null) {
            notificationCompat$Builder0.r0(true);
            notificationCompat$Builder0.H0(((long)long0));
        }
        long[] arr_v = s0.q();
        if(arr_v != null) {
            notificationCompat$Builder0.F0(arr_v);
        }
        int[] arr_v1 = s0.e();
        if(arr_v1 != null) {
            notificationCompat$Builder0.d0(arr_v1[0], arr_v1[1], arr_v1[2]);
        }
        notificationCompat$Builder0.S(e.i(s0));
        return new a(notificationCompat$Builder0, e.o(s0), 0);
    }

    static a e(Context context0, S s0) {
        Bundle bundle0 = e.j(context0.getPackageManager(), "com.dcinside.app.android");
        return e.d(context0, context0, s0, e.k(context0, s0.k(), bundle0), bundle0);
    }

    private static Intent f(String s, S s1, PackageManager packageManager0) {
        String s2 = s1.p("gcm.n.click_action");
        if(!TextUtils.isEmpty(s2)) {
            Intent intent0 = new Intent(s2);
            intent0.setPackage(s);
            intent0.setFlags(0x10000000);
            return intent0;
        }
        Uri uri0 = s1.f();
        if(uri0 != null) {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setPackage(s);
            intent1.setData(uri0);
            return intent1;
        }
        Intent intent2 = packageManager0.getLaunchIntentForPackage(s);
        if(intent2 == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return intent2;
    }

    private static int g() {
        return e.i.incrementAndGet();
    }

    private static Integer h(Context context0, String s, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return Color.parseColor(s);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("FirebaseMessaging", "Color is invalid: " + s + ". Notification will use default color.");
            }
        }
        int v = bundle0.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if(v != 0) {
            try {
                return ContextCompat.getColor(context0, v);
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static int i(S s0) {
        int v = s0.a("gcm.n.default_sound");
        if(s0.a("gcm.n.default_vibrate_timings")) {
            v |= 2;
        }
        return s0.a("gcm.n.default_light_settings") ? v | 4 : v;
    }

    private static Bundle j(PackageManager packageManager0, String s) {
        ApplicationInfo applicationInfo0;
        try {
            applicationInfo0 = packageManager0.getApplicationInfo(s, 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            return Bundle.EMPTY;
        }
        if(applicationInfo0 != null) {
            return applicationInfo0.metaData == null ? Bundle.EMPTY : applicationInfo0.metaData;
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String k(Context context0, String s, Bundle bundle0) {
        String s2;
        if(Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService(NotificationManager.class);
        if(!TextUtils.isEmpty(s)) {
            if(notificationManager0.getNotificationChannel(s) != null) {
                return s;
            }
            Log.w("FirebaseMessaging", "Notification Channel requested (" + s + ") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        String s1 = bundle0.getString("com.google.firebase.messaging.default_notification_channel_id");
        if(TextUtils.isEmpty(s1)) {
            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        }
        else {
            if(notificationManager0.getNotificationChannel(s1) != null) {
                return s1;
            }
            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        if(notificationManager0.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            int v = context0.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", "com.dcinside.app.android");
            if(v == 0) {
                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                s2 = "Misc";
            }
            else {
                s2 = context0.getString(v);
            }
            notificationManager0.createNotificationChannel(h.a("fcm_fallback_notification_channel", s2, 3));
        }
        return "fcm_fallback_notification_channel";
    }

    private static int l(int v) [...] // 潜在的解密器

    private static int m(PackageManager packageManager0, Resources resources0, String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s1)) {
            int v = resources0.getIdentifier(s1, "drawable", s);
            if(v != 0 && e.p(resources0, v)) {
                return v;
            }
            int v1 = resources0.getIdentifier(s1, "mipmap", s);
            if(v1 != 0 && e.p(resources0, v1)) {
                return v1;
            }
            Log.w("FirebaseMessaging", "Icon resource " + s1 + " not found. Notification will use default icon.");
        }
        int v2 = bundle0.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if(v2 == 0 || !e.p(resources0, v2)) {
            try {
                v2 = packageManager0.getApplicationInfo(s, 0).icon;
                return v2 != 0 && e.p(resources0, v2) ? v2 : 0x1080093;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            }
        }
        return v2 != 0 && e.p(resources0, v2) ? v2 : 0x1080093;
    }

    private static Uri n(String s, S s1, Resources resources0) {
        String s2 = s1.o();
        if(TextUtils.isEmpty(s2)) {
            return null;
        }
        return "default".equals(s2) || resources0.getIdentifier(s2, "raw", s) == 0 ? RingtoneManager.getDefaultUri(2) : Uri.parse(("android.resource://" + s + "/raw/" + s2));
    }

    private static String o(S s0) {
        String s1 = s0.p("gcm.n.tag");
        return TextUtils.isEmpty(s1) ? "FCM-Notification:" + SystemClock.uptimeMillis() : s1;
    }

    @TargetApi(26)
    private static boolean p(Resources resources0, int v) {
        if(Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if(d.a(resources0.getDrawable(v, null))) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + v);
                return false;
            }
            return true;
        }
        catch(Resources.NotFoundException unused_ex) {
            Log.e("FirebaseMessaging", "Couldn\'t find resource " + v + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(@NonNull S s0) {
        return s0.a("google.c.a.e");
    }
}

