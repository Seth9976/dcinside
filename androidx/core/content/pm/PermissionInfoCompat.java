package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionInfoCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static int a(PermissionInfo permissionInfo0) {
            return permissionInfo0.getProtection();
        }

        static int b(PermissionInfo permissionInfo0) {
            return permissionInfo0.getProtectionFlags();
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @SuppressLint({"UniqueConstants"})
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(PermissionInfo permissionInfo0) {
        return Build.VERSION.SDK_INT < 28 ? permissionInfo0.protectionLevel & 15 : Api28Impl.a(permissionInfo0);
    }

    @SuppressLint({"WrongConstant"})
    public static int b(PermissionInfo permissionInfo0) {
        return Build.VERSION.SDK_INT < 28 ? permissionInfo0.protectionLevel & -16 : Api28Impl.b(permissionInfo0);
    }
}

