package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class ViewModelStore {
    @l
    private final Map a;

    public ViewModelStore() {
        this.a = new LinkedHashMap();
    }

    public final void a() {
        for(Object object0: this.a.values()) {
            ((ViewModel)object0).clear();
        }
        this.a.clear();
    }

    @RestrictTo({Scope.b})
    @m
    public final ViewModel b(@l String s) {
        L.p(s, "key");
        return (ViewModel)this.a.get(s);
    }

    @RestrictTo({Scope.b})
    @l
    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    @RestrictTo({Scope.b})
    public final void d(@l String s, @l ViewModel viewModel0) {
        L.p(s, "key");
        L.p(viewModel0, "viewModel");
        ViewModel viewModel1 = (ViewModel)this.a.put(s, viewModel0);
        if(viewModel1 != null) {
            viewModel1.onCleared();
        }
    }
}

