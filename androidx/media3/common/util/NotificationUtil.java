package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.browser.trusted.h;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressLint({"InlinedApi"})
@UnstableApi
public final class NotificationUtil {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Importance {
    }

    public static final int a = -1000;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;

    public static void a(Context context0, String s, @StringRes int v, @StringRes int v1, int v2) {
        if(Util.a >= 26) {
            NotificationManager notificationManager0 = (NotificationManager)Assertions.g(((NotificationManager)context0.getSystemService("notification")));
            NotificationChannel notificationChannel0 = h.a(s, context0.getString(v), v2);
            if(v1 != 0) {
                notificationChannel0.setDescription(context0.getString(v1));
            }
            notificationManager0.createNotificationChannel(notificationChannel0);
        }
    }

    public static void b(Context context0, int v, @Nullable Notification notification0) {
        NotificationManager notificationManager0 = (NotificationManager)Assertions.g(((NotificationManager)context0.getSystemService("notification")));
        if(notification0 != null) {
            notificationManager0.notify(v, notification0);
            return;
        }
        notificationManager0.cancel(v);
    }
}

