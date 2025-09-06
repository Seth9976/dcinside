package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;

public final class BundleCompat {
    @RequiresApi(33)
    static class Api33Impl {
        static Object a(Bundle bundle0, String s, Class class0) {
            return bundle0.getParcelable(s, class0);
        }

        static Object[] b(Bundle bundle0, String s, Class class0) {
            return bundle0.getParcelableArray(s, class0);
        }

        static ArrayList c(Bundle bundle0, String s, Class class0) {
            return bundle0.getParcelableArrayList(s, class0);
        }

        static Serializable d(Bundle bundle0, String s, Class class0) {
            return bundle0.getSerializable(s, class0);
        }

        static SparseArray e(Bundle bundle0, String s, Class class0) {
            return bundle0.getSparseParcelableArray(s, class0);
        }
    }

    @ReplaceWith(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(Bundle bundle0, String s) {
        return bundle0.getBinder(s);
    }

    public static Object b(Bundle bundle0, String s, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.a(bundle0, s, class0);
        }
        Parcelable parcelable0 = bundle0.getParcelable(s);
        return !class0.isInstance(parcelable0) ? null : parcelable0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] c(Bundle bundle0, String s, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getParcelableArray(s) : ((Parcelable[])Api33Impl.b(bundle0, s, class0));
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static ArrayList d(Bundle bundle0, String s, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getParcelableArrayList(s) : Api33Impl.c(bundle0, s, class0);
    }

    public static Serializable e(Bundle bundle0, String s, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.d(bundle0, s, class0);
        }
        Serializable serializable0 = bundle0.getSerializable(s);
        return class0.isInstance(serializable0) ? serializable0 : null;
    }

    public static SparseArray f(Bundle bundle0, String s, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getSparseParcelableArray(s) : Api33Impl.e(bundle0, s, class0);
    }

    @ReplaceWith(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void g(Bundle bundle0, String s, IBinder iBinder0) {
        bundle0.putBinder(s, iBinder0);
    }
}

