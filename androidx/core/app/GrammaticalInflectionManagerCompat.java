package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.AnyThread;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class GrammaticalInflectionManagerCompat {
    @RequiresApi(34)
    static class Api34Impl {
        static int a(Context context0) {
            return Api34Impl.b(context0).getApplicationGrammaticalGender();
        }

        private static GrammaticalInflectionManager b(Context context0) {
            return (GrammaticalInflectionManager)context0.getSystemService(GrammaticalInflectionManager.class);
        }

        static void c(Context context0, int v) {
            Api34Impl.b(context0).setRequestedApplicationGrammaticalGender(v);
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    @AnyThread
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static int a(Context context0) {
        return Build.VERSION.SDK_INT < 34 ? 0 : Api34Impl.a(context0);
    }

    @AnyThread
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static void b(Context context0, int v) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.c(context0, v);
        }
    }
}

