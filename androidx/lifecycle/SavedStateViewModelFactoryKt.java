package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RestrictTo({Scope.a})
public final class SavedStateViewModelFactoryKt {
    @l
    private static final List a;
    @l
    private static final List b;

    static {
        SavedStateViewModelFactoryKt.a = u.O(new Class[]{Application.class, SavedStateHandle.class});
        SavedStateViewModelFactoryKt.b = u.k(SavedStateHandle.class);
    }

    @m
    public static final Constructor c(@l Class class0, @l List list0) {
        L.p(class0, "modelClass");
        L.p(list0, "signature");
        Constructor[] arr_constructor = class0.getConstructors();
        L.o(arr_constructor, "modelClass.constructors");
        for(int v = 0; v < arr_constructor.length; ++v) {
            Constructor constructor0 = arr_constructor[v];
            Class[] arr_class = constructor0.getParameterTypes();
            L.o(arr_class, "constructor.parameterTypes");
            List list1 = kotlin.collections.l.Ky(arr_class);
            if(L.g(list0, list1)) {
                L.n(constructor0, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor0;
            }
            if(list0.size() == list1.size() && list1.containsAll(list0)) {
                throw new UnsupportedOperationException("Class " + class0.getSimpleName() + " must have parameters in the proper order: " + list0);
            }
        }
        return null;
    }

    public static final ViewModel d(@l Class class0, @l Constructor constructor0, @l Object[] arr_object) {
        L.p(class0, "modelClass");
        L.p(constructor0, "constructor");
        L.p(arr_object, "params");
        try {
            return (ViewModel)constructor0.newInstance(Arrays.copyOf(arr_object, arr_object.length));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Failed to access " + class0, illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("A " + class0 + " cannot be instantiated.", instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("An exception happened in constructor of " + class0, invocationTargetException0.getCause());
        }
    }
}

