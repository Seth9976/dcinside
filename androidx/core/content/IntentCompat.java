package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

public final class IntentCompat {
    @RequiresApi(33)
    static class Api33Impl {
        static Object[] a(Intent intent0, String s, Class class0) {
            return intent0.getParcelableArrayExtra(s, class0);
        }

        static ArrayList b(Intent intent0, String s, Class class0) {
            return intent0.getParcelableArrayListExtra(s, class0);
        }

        static Object c(Intent intent0, String s, Class class0) {
            return intent0.getParcelableExtra(s, class0);
        }

        static Serializable d(Intent intent0, String s, Class class0) {
            return intent0.getSerializableExtra(s, class0);
        }
    }

    @SuppressLint({"ActionValue"})
    public static final String a = "android.intent.action.CREATE_REMINDER";
    public static final String b = "android.intent.extra.HTML_TEXT";
    public static final String c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})
    public static final String d = "android.intent.extra.TIME";
    public static final String e = "android.intent.category.LEANBACK_LAUNCHER";

    public static Intent a(Context context0, String s) {
        if(!PackageManagerCompat.a(context0.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", s, null));
        }
        Intent intent0 = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", s, null));
        return v < 30 ? intent0.setPackage(((String)Preconditions.l(PackageManagerCompat.b(context0.getPackageManager())))) : intent0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] b(Intent intent0, String s, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? intent0.getParcelableArrayExtra(s) : ((Parcelable[])Api33Impl.a(intent0, s, class0));
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static ArrayList c(Intent intent0, String s, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? intent0.getParcelableArrayListExtra(s) : Api33Impl.b(intent0, s, class0);
    }

    public static Object d(Intent intent0, String s, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.c(intent0, s, class0);
        }
        Parcelable parcelable0 = intent0.getParcelableExtra(s);
        return !class0.isInstance(parcelable0) ? null : parcelable0;
    }

    public static Serializable e(Intent intent0, String s, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.d(intent0, s, class0);
        }
        Serializable serializable0 = intent0.getSerializableExtra(s);
        return class0.isInstance(serializable0) ? serializable0 : null;
    }

    public static Intent f(String s, String s1) {
        return Intent.makeMainSelectorActivity(s, s1);
    }
}

