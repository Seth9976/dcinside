package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(23)
@RestrictTo({Scope.a})
public class NotificationApiHelperForM {
    @NonNull
    static Parcelable[] a(NotificationManager notificationManager0) {
        return notificationManager0.getActiveNotifications();
    }
}

