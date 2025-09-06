package androidx.browser.trusted;

import android.app.Notification.Builder;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(26)
@RestrictTo({Scope.a})
class NotificationApiHelperForO {
    @Nullable
    static Notification a(Context context0, NotificationManager notificationManager0, Notification notification0, String s, String s1) {
        notificationManager0.createNotificationChannel(h.a(s, s1, 3));
        if(notificationManager0.getNotificationChannel(s).getImportance() == 0) {
            return null;
        }
        Notification.Builder notification$Builder0 = Notification.Builder.recoverBuilder(context0, notification0);
        notification$Builder0.setChannelId(s);
        return notification$Builder0.build();
    }

    static boolean b(NotificationManager notificationManager0, String s) {
        NotificationChannel notificationChannel0 = notificationManager0.getNotificationChannel(s);
        return notificationChannel0 == null || notificationChannel0.getImportance() != 0;
    }
}

