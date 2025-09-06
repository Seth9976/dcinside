package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.app.ActivityThread;
import android.content.Context;
import androidx.annotation.NonNull;
import pl.droidsonroids.relinker.e;

public class o {
    private static final String a = "pl_droidsonroids_gif";
    @SuppressLint({"StaticFieldLeak"})
    private static Context b;

    private static Context a() {
        if(o.b == null) {
            try {
                o.b = ActivityThread.currentApplication();
                return o.b;
            }
            catch(Exception exception0) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", exception0);
            }
        }
        return o.b;
    }

    public static void b(@NonNull Context context0) {
        o.b = context0.getApplicationContext();
    }

    static void c() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        }
        catch(UnsatisfiedLinkError unused_ex) {
            e.b(o.a(), "pl_droidsonroids_gif");
        }
    }
}

