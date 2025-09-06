package androidx.core.app;

import android.app.Notification.Builder;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface NotificationBuilderWithBuilderAccessor {
    Notification.Builder a();
}

