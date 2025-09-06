package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

class BenchmarkOperation {
    @RequiresApi(api = 21)
    static class Api21ContextHelper {
        static File a(Context context0) {
            return context0.getCodeCacheDir();
        }
    }

    @RequiresApi(api = 24)
    static class Api24ContextHelper {
        static Context a(Context context0) {
            return context0.createDeviceProtectedStorageContext();
        }
    }

    static boolean a(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return false;
            }
            boolean z = true;
            for(int v = 0; v < arr_file.length; ++v) {
                z = BenchmarkOperation.a(arr_file[v]) && z;
            }
            return z;
        }
        file0.delete();
        return true;
    }

    static void b(@NonNull Context context0, @NonNull ResultDiagnostics profileInstallReceiver$ResultDiagnostics0) {
        File file0;
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            file0 = Api24ContextHelper.a(context0).getCacheDir();
        }
        else if(v >= 24) {
            file0 = Api21ContextHelper.a(Api24ContextHelper.a(context0));
        }
        else {
            file0 = v == 23 ? Api21ContextHelper.a(context0) : context0.getCacheDir();
        }
        if(BenchmarkOperation.a(file0)) {
            profileInstallReceiver$ResultDiagnostics0.a(14, null);
            return;
        }
        profileInstallReceiver$ResultDiagnostics0.a(15, null);
    }
}

