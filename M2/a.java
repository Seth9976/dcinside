package m2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import e2.c;

public class a {
    private final Context a;
    private final SharedPreferences b;
    private final c c;
    private boolean d;
    private static final String e = "com.google.firebase.common.prefs:";
    @VisibleForTesting
    public static final String f = "firebase_data_collection_default_enabled";

    public a(Context context0, String s, c c0) {
        Context context1 = a.a(context0);
        this.a = context1;
        this.b = context1.getSharedPreferences("com.google.firebase.common.prefs:" + s, 0);
        this.c = c0;
        this.d = this.c();
    }

    private static Context a(Context context0) {
        return Build.VERSION.SDK_INT >= 24 ? ContextCompat.createDeviceProtectedStorageContext(context0) : context0;
    }

    public boolean b() {
        synchronized(this) {
        }
        return this.d;
    }

    // 去混淆评级： 低(20)
    private boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : this.d();
    }

    private boolean d() {
        try {
            PackageManager packageManager0 = this.a.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0x80);
                return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_data_collection_default_enabled")) ? true : applicationInfo0.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return true;
    }

    public void e(Boolean boolean0) {
        synchronized(this) {
            if(boolean0 == null) {
                this.b.edit().remove("firebase_data_collection_default_enabled").apply();
                this.f(this.d());
            }
            else {
                boolean z = Boolean.TRUE.equals(boolean0);
                this.b.edit().putBoolean("firebase_data_collection_default_enabled", z).apply();
                this.f(z);
            }
        }
    }

    private void f(boolean z) {
        synchronized(this) {
            if(this.d != z) {
                this.d = z;
                com.google.firebase.c c0 = new com.google.firebase.c(z);
                e2.a a0 = new e2.a(com.google.firebase.c.class, c0);
                this.c.b(a0);
            }
        }
    }
}

