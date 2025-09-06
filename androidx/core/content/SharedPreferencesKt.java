package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@l SharedPreferences sharedPreferences0, boolean z, @l Function1 function10) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        function10.invoke(sharedPreferences$Editor0);
        if(z) {
            sharedPreferences$Editor0.commit();
            return;
        }
        sharedPreferences$Editor0.apply();
    }

    public static void b(SharedPreferences sharedPreferences0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        function10.invoke(sharedPreferences$Editor0);
        if(z) {
            sharedPreferences$Editor0.commit();
            return;
        }
        sharedPreferences$Editor0.apply();
    }
}

