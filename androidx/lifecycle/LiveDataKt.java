package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class LiveDataKt {
    @MainThread
    @k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @l
    public static final Observer a(@l LiveData liveData0, @l LifecycleOwner lifecycleOwner0, @l Function1 function10) {
        L.p(liveData0, "<this>");
        L.p(lifecycleOwner0, "owner");
        L.p(function10, "onChanged");
        Observer observer0 = new Observer() {
            @Override  // androidx.lifecycle.Observer
            public final void onChanged(Object object0) {
                function10.invoke(object0);
            }
        };
        liveData0.k(lifecycleOwner0, observer0);
        return observer0;
    }
}

