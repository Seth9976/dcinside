package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.Map;

class ResourcesFlusher {
    private static final String a = "ResourcesFlusher";
    private static Field b;
    private static boolean c;
    private static Class d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static Field h;
    private static boolean i;

    static void a(@NonNull Resources resources0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            return;
        }
        if(v >= 24) {
            ResourcesFlusher.d(resources0);
            return;
        }
        if(v >= 23) {
            ResourcesFlusher.c(resources0);
            return;
        }
        ResourcesFlusher.b(resources0);
    }

    @RequiresApi(21)
    private static void b(@NonNull Resources resources0) {
        Map map0;
        if(!ResourcesFlusher.c) {
            try {
                Field field0 = Resources.class.getDeclaredField("mDrawableCache");
                ResourcesFlusher.b = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException0);
            }
            ResourcesFlusher.c = true;
        }
        Field field1 = ResourcesFlusher.b;
        if(field1 != null) {
            try {
                map0 = (Map)field1.get(resources0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException0);
                map0 = null;
            }
            if(map0 != null) {
                map0.clear();
            }
        }
    }

    @RequiresApi(23)
    private static void c(@NonNull Resources resources0) {
        Object object0;
        if(!ResourcesFlusher.c) {
            try {
                Field field0 = Resources.class.getDeclaredField("mDrawableCache");
                ResourcesFlusher.b = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException0);
            }
            ResourcesFlusher.c = true;
        }
        Field field1 = ResourcesFlusher.b;
        if(field1 == null) {
            object0 = null;
        }
        else {
            try {
                object0 = field1.get(resources0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException0);
                object0 = null;
            }
        }
        if(object0 == null) {
            return;
        }
        ResourcesFlusher.e(object0);
    }

    @RequiresApi(24)
    private static void d(@NonNull Resources resources0) {
        Object object1;
        Object object0;
        if(!ResourcesFlusher.i) {
            try {
                Field field0 = Resources.class.getDeclaredField("mResourcesImpl");
                ResourcesFlusher.h = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", noSuchFieldException0);
            }
            ResourcesFlusher.i = true;
        }
        Field field1 = ResourcesFlusher.h;
        if(field1 == null) {
            return;
        }
        try {
            object0 = null;
            object1 = field1.get(resources0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", illegalAccessException0);
            object1 = null;
        }
        if(object1 == null) {
            return;
        }
        if(!ResourcesFlusher.c) {
            try {
                Field field2 = object1.getClass().getDeclaredField("mDrawableCache");
                ResourcesFlusher.b = field2;
                field2.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException1) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", noSuchFieldException1);
            }
            ResourcesFlusher.c = true;
        }
        Field field3 = ResourcesFlusher.b;
        if(field3 != null) {
            try {
                object0 = field3.get(object1);
            }
            catch(IllegalAccessException illegalAccessException1) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", illegalAccessException1);
            }
        }
        if(object0 != null) {
            ResourcesFlusher.e(object0);
        }
    }

    private static void e(@NonNull Object object0) {
        LongSparseArray longSparseArray0;
        if(!ResourcesFlusher.e) {
            try {
                ResourcesFlusher.d = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", classNotFoundException0);
            }
            ResourcesFlusher.e = true;
        }
        Class class0 = ResourcesFlusher.d;
        if(class0 == null) {
            return;
        }
        if(!ResourcesFlusher.g) {
            try {
                Field field0 = class0.getDeclaredField("mUnthemedEntries");
                ResourcesFlusher.f = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", noSuchFieldException0);
            }
            ResourcesFlusher.g = true;
        }
        Field field1 = ResourcesFlusher.f;
        if(field1 == null) {
            return;
        }
        try {
            longSparseArray0 = (LongSparseArray)field1.get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", illegalAccessException0);
            longSparseArray0 = null;
        }
        if(longSparseArray0 != null) {
            longSparseArray0.clear();
        }
    }
}

