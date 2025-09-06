package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@RestrictTo({Scope.c})
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";

    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    protected Method C(Class class0) throws NoSuchMethodException {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    Typeface h(Context context0, Typeface typeface0, int v, boolean z) {
        return Typeface.create(typeface0, v, z);
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    protected Typeface q(Object object0) {
        try {
            Object object1 = Array.newInstance(this.m, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.s.invoke(null, object1, "sans-serif", -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }
}

