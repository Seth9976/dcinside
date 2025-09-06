package androidx.core.os;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;
import androidx.annotation.RequiresApi;

public class UserManagerCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static boolean a(Context context0) {
            return ((UserManager)context0.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? true : Api24Impl.a(context0);
    }
}

