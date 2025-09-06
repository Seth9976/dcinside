package androidx.core.os;

import android.os.Environment;
import androidx.annotation.RequiresApi;
import java.io.File;

public final class EnvironmentCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static String a(File file0) {
            return Environment.getExternalStorageState(file0);
        }
    }

    @Deprecated
    public static final String a = "unknown";

    public static String a(File file0) {
        return Api21Impl.a(file0);
    }
}

