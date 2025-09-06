package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ParcelCompat {
    @RequiresApi(29)
    static class Api29Impl {
        static List a(Parcel parcel0, List list0, ClassLoader classLoader0) {
            return parcel0.readParcelableList(list0, classLoader0);
        }

        static void b(Parcel parcel0, boolean z) {
            parcel0.writeBoolean(z);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static Parcelable.Creator a(Parcel parcel0, ClassLoader classLoader0) {
            return parcel0.readParcelableCreator(classLoader0);
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static Object[] a(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return parcel0.readArray(classLoader0, class0);
        }

        static ArrayList b(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return parcel0.readArrayList(classLoader0, class0);
        }

        static HashMap c(Parcel parcel0, ClassLoader classLoader0, Class class0, Class class1) {
            return parcel0.readHashMap(classLoader0, class0, class1);
        }

        static void d(Parcel parcel0, List list0, ClassLoader classLoader0, Class class0) {
            parcel0.readList(list0, classLoader0, class0);
        }

        static void e(Parcel parcel0, Map map0, ClassLoader classLoader0, Class class0, Class class1) {
            parcel0.readMap(map0, classLoader0, class0, class1);
        }

        static Parcelable f(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return (Parcelable)parcel0.readParcelable(classLoader0, class0);
        }

        static Object[] g(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return parcel0.readParcelableArray(classLoader0, class0);
        }

        static Parcelable.Creator h(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return parcel0.readParcelableCreator(classLoader0, class0);
        }

        static List i(Parcel parcel0, List list0, ClassLoader classLoader0, Class class0) {
            return parcel0.readParcelableList(list0, classLoader0, class0);
        }

        static Serializable j(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return (Serializable)parcel0.readSerializable(classLoader0, class0);
        }

        static SparseArray k(Parcel parcel0, ClassLoader classLoader0, Class class0) {
            return parcel0.readSparseArray(classLoader0, class0);
        }
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Object[] a(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readArray(classLoader0) : Api33Impl.a(parcel0, classLoader0, class0);
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static ArrayList b(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readArrayList(classLoader0) : Api33Impl.b(parcel0, classLoader0, class0);
    }

    public static boolean c(Parcel parcel0) {
        return parcel0.readInt() != 0;
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static HashMap d(Parcel parcel0, ClassLoader classLoader0, Class class0, Class class1) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readHashMap(classLoader0) : Api33Impl.c(parcel0, classLoader0, class0, class1);
    }

    public static void e(Parcel parcel0, List list0, ClassLoader classLoader0, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api33Impl.d(parcel0, list0, classLoader0, class0);
            return;
        }
        parcel0.readList(list0, classLoader0);
    }

    public static void f(Parcel parcel0, Map map0, ClassLoader classLoader0, Class class0, Class class1) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api33Impl.e(parcel0, map0, classLoader0, class0, class1);
            return;
        }
        parcel0.readMap(map0, classLoader0);
    }

    public static Parcelable g(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.f(parcel0, classLoader0, class0);
        }
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 != null && !class0.isInstance(parcelable0)) {
            throw new BadParcelableException("Parcelable " + parcelable0.getClass() + " is not a subclass of required class " + class0.getName() + " provided in the parameter");
        }
        return parcelable0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    public static Object[] h(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.g(parcel0, classLoader0, class0);
        }
        Object[] arr_object = parcel0.readParcelableArray(classLoader0);
        if(class0.isAssignableFrom(Parcelable.class)) {
            return arr_object;
        }
        Object[] arr_object1 = (Object[])Array.newInstance(class0, arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                arr_object1[v] = class0.cast(arr_object[v]);
            }
            catch(ClassCastException unused_ex) {
                throw new BadParcelableException("Parcelable at index " + v + " is not a subclass of required class " + class0.getName() + " provided in the parameter");
            }
        }
        return arr_object1;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] i(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readParcelableArray(classLoader0) : ((Parcelable[])Api33Impl.g(parcel0, classLoader0, class0));
    }

    @RequiresApi(30)
    public static Parcelable.Creator j(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? Api30Impl.a(parcel0, classLoader0) : Api33Impl.h(parcel0, classLoader0, class0);
    }

    @RequiresApi(api = 29)
    public static List k(Parcel parcel0, List list0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? Api29Impl.a(parcel0, list0, classLoader0) : Api33Impl.i(parcel0, list0, classLoader0, class0);
    }

    public static Serializable l(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 33 ? parcel0.readSerializable() : Api33Impl.j(parcel0, classLoader0, class0);
    }

    public static SparseArray m(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readSparseArray(classLoader0) : Api33Impl.k(parcel0, classLoader0, class0);
    }

    public static void n(Parcel parcel0, boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(parcel0, z);
            return;
        }
        parcel0.writeInt(((int)z));
    }
}

