package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionChecker {
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;

    public static int a(Context context0, String s) {
        return Binder.getCallingPid() == Process.myPid() ? PermissionChecker.c(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), "com.dcinside.app.android") : PermissionChecker.c(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), null);
    }

    public static int b(Context context0, String s, String s1) {
        return Binder.getCallingPid() == Process.myPid() ? -1 : PermissionChecker.c(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
    }

    public static int c(Context context0, String s, int v, int v1, String s1) {
        if(context0.checkPermission(s, v, v1) == -1) {
            return -1;
        }
        String s2 = AppOpsManagerCompat.f(s);
        if(s2 == null) {
            return 0;
        }
        if(s1 == null) {
            String[] arr_s = context0.getPackageManager().getPackagesForUid(v1);
            if(arr_s != null && arr_s.length > 0) {
                s1 = arr_s[0];
                return (Process.myUid() != v1 || !ObjectsCompat.a("com.dcinside.app.android", s1) ? AppOpsManagerCompat.e(context0, s2, s1) : AppOpsManagerCompat.a(context0, v1, s2, s1)) == 0 ? 0 : -2;
            }
            return -1;
        }
        return (Process.myUid() != v1 || !ObjectsCompat.a("com.dcinside.app.android", s1) ? AppOpsManagerCompat.e(context0, s2, s1) : AppOpsManagerCompat.a(context0, v1, s2, s1)) == 0 ? 0 : -2;
    }

    public static int d(Context context0, String s) {
        return PermissionChecker.c(context0, s, Process.myPid(), Process.myUid(), "com.dcinside.app.android");
    }
}

