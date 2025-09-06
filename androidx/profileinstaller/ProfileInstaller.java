package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.dash.offline.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

public class ProfileInstaller {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void a(int arg1, @Nullable Object arg2);

        void b(int arg1, @Nullable Object arg2);
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;
    static final String a = "dexopt/baseline.prof";
    private static final String b = "ProfileInstaller";
    private static final String c = "/data/misc/profiles/cur/0";
    private static final String d = "primary.prof";
    private static final String e = "dexopt/baseline.profm";
    private static final String f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final DiagnosticsCallback g = null;
    @NonNull
    static final DiagnosticsCallback h = null;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 7;
    public static final int u = 8;
    public static final int v = 9;
    public static final int w = 10;
    public static final int x = 11;
    public static final int y = 12;
    public static final int z = 13;

    static {
        ProfileInstaller.g = new DiagnosticsCallback() {
            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void a(int v, @Nullable Object object0) {
            }

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void b(int v, @Nullable Object object0) {
            }
        };
        ProfileInstaller.h = new DiagnosticsCallback() {
            static final String a = "ProfileInstaller";

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void a(int v, @Nullable Object object0) {
                String s;
                switch(v) {
                    case 1: {
                        s = "RESULT_INSTALL_SUCCESS";
                        break;
                    }
                    case 2: {
                        s = "RESULT_ALREADY_INSTALLED";
                        break;
                    }
                    case 3: {
                        s = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    }
                    case 4: {
                        s = "RESULT_NOT_WRITABLE";
                        break;
                    }
                    case 5: {
                        s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    }
                    case 6: {
                        s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    }
                    case 7: {
                        s = "RESULT_IO_EXCEPTION";
                        break;
                    }
                    case 8: {
                        s = "RESULT_PARSE_EXCEPTION";
                        break;
                    }
                    case 10: {
                        s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    }
                    case 11: {
                        s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                    }
                    default: {
                        s = "";
                    }
                }
                if(v != 6 && v != 7 && v != 8) {
                    Log.d("ProfileInstaller", s);
                    return;
                }
                Log.e("ProfileInstaller", s, ((Throwable)object0));
            }

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void b(int v, @Nullable Object object0) {
                String s;
                switch(v) {
                    case 1: {
                        s = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
                        break;
                    }
                    case 2: {
                        s = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                        break;
                    }
                    case 3: {
                        s = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                        break;
                    }
                    case 4: {
                        s = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        break;
                    }
                    case 5: {
                        s = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                        break;
                    }
                    default: {
                        s = "";
                    }
                }
                Log.d("ProfileInstaller", s);
            }
        };
    }

    @RestrictTo({Scope.a})
    static boolean c(@NonNull File file0) {
        return new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    @WorkerThread
    static void d(@NonNull Context context0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        ProfileInstaller.c(context0.getFilesDir());
        ProfileInstaller.j(executor0, profileInstaller$DiagnosticsCallback0, 11, null);
    }

    static void e(@NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, @Nullable Object object0) {
        executor0.execute(new d(profileInstaller$DiagnosticsCallback0, v, object0));
    }

    @RestrictTo({Scope.a})
    @WorkerThread
    static boolean f(PackageInfo packageInfo0, File file0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if(!file1.exists()) {
            return false;
        }
        try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file1))) {
            if(dataInputStream0.readLong() == packageInfo0.lastUpdateTime) {
                goto label_10;
            }
            return z;
        }
        catch(IOException unused_ex) {
            return false;
        }
    label_10:
        profileInstaller$DiagnosticsCallback0.a(2, null);
        return true;
    }

    @RestrictTo({Scope.a})
    static void i(@NonNull PackageInfo packageInfo0, @NonNull File file0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file1))) {
            dataOutputStream0.writeLong(packageInfo0.lastUpdateTime);
        }
        catch(IOException unused_ex) {
        }
    }

    static void j(@NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, @Nullable Object object0) {
        executor0.execute(new c(profileInstaller$DiagnosticsCallback0, v, object0));
    }

    private static boolean k(@NonNull AssetManager assetManager0, @NonNull String s, @NonNull PackageInfo packageInfo0, @NonNull File file0, @NonNull String s1, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        DeviceProfileWriter deviceProfileWriter0 = new DeviceProfileWriter(assetManager0, executor0, profileInstaller$DiagnosticsCallback0, s1, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", s), "primary.prof"));
        if(!deviceProfileWriter0.e()) {
            return false;
        }
        boolean z = deviceProfileWriter0.i().m().n();
        if(z) {
            ProfileInstaller.i(packageInfo0, file0);
        }
        return z;
    }

    @WorkerThread
    public static void l(@NonNull Context context0) {
        ProfileInstaller.m(context0, new a(), ProfileInstaller.g);
    }

    @WorkerThread
    public static void m(@NonNull Context context0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        ProfileInstaller.n(context0, executor0, profileInstaller$DiagnosticsCallback0, false);
    }

    @WorkerThread
    static void n(@NonNull Context context0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0, boolean z) {
        Context context1 = context0.getApplicationContext();
        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
        AssetManager assetManager0 = context1.getAssets();
        String s = new File(applicationInfo0.sourceDir).getName();
        PackageManager packageManager0 = context0.getPackageManager();
        boolean z1 = false;
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            profileInstaller$DiagnosticsCallback0.a(7, packageManager$NameNotFoundException0);
            ProfileVerifier.e(context0, false);
            return;
        }
        File file0 = context0.getFilesDir();
        if(!z && ProfileInstaller.f(packageInfo0, file0, profileInstaller$DiagnosticsCallback0)) {
            Log.d("ProfileInstaller", "Skipping profile installation for com.dcinside.app.android");
            ProfileVerifier.e(context0, false);
            return;
        }
        Log.d("ProfileInstaller", "Installing profile for com.dcinside.app.android");
        if(ProfileInstaller.k(assetManager0, "com.dcinside.app.android", packageInfo0, file0, s, executor0, profileInstaller$DiagnosticsCallback0) && z) {
            z1 = true;
        }
        ProfileVerifier.e(context0, z1);
    }

    @WorkerThread
    static void o(@NonNull Context context0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        PackageInfo packageInfo0;
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageInfo0 = packageManager0.getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ProfileInstaller.j(executor0, profileInstaller$DiagnosticsCallback0, 7, packageManager$NameNotFoundException0);
            return;
        }
        ProfileInstaller.i(packageInfo0, context0.getFilesDir());
        ProfileInstaller.j(executor0, profileInstaller$DiagnosticsCallback0, 10, null);
    }
}

