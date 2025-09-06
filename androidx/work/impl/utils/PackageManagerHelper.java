package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;

public class PackageManagerHelper {
    private static final String a;

    static {
        PackageManagerHelper.a = "WM-PackageManagerHelper";
    }

    private static int a(@NonNull Context context0, @NonNull String s) {
        return context0.getPackageManager().getComponentEnabledSetting(new ComponentName(context0, s));
    }

    private static boolean b(int v, boolean z) {
        switch(v) {
            case 0: {
                return z;
            }
            case 1: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean c(@NonNull Context context0, @NonNull Class class0) {
        return PackageManagerHelper.b(PackageManagerHelper.a(context0, class0.getName()), false);
    }

    public static boolean d(@NonNull Context context0, @NonNull String s) {
        return PackageManagerHelper.a(context0, s) == 1;
    }

    public static void e(@NonNull Context context0, @NonNull Class class0, boolean z) {
        String s = "disabled";
        try {
            if(z == PackageManagerHelper.b(PackageManagerHelper.a(context0, class0.getName()), false)) {
                Logger.e().a("WM-PackageManagerHelper", "Skipping component enablement for " + class0.getName());
                return;
            }
            context0.getPackageManager().setComponentEnabledSetting(new ComponentName(context0, class0.getName()), (z ? 1 : 2), 1);
            Logger.e().a("WM-PackageManagerHelper", class0.getName() + " " + (z ? "enabled" : "disabled"));
            return;
        }
        catch(Exception exception0) {
        }
        Logger logger0 = Logger.e();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.getName());
        stringBuilder0.append("could not be ");
        if(z) {
            s = "enabled";
        }
        stringBuilder0.append(s);
        logger0.b("WM-PackageManagerHelper", stringBuilder0.toString(), exception0);
    }
}

