package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final NavControllerViewModel a(@l ViewModelStore viewModelStore0) {
            L.p(viewModelStore0, "viewModelStore");
            return (NavControllerViewModel)new ViewModelProvider(viewModelStore0, NavControllerViewModel.c, null, 4, null).a(NavControllerViewModel.class);
        }
    }

    @l
    private final Map a;
    @l
    public static final Companion b;
    @l
    private static final Factory c;

    static {
        NavControllerViewModel.b = new Companion(null);
        NavControllerViewModel.c = new NavControllerViewModel.Companion.FACTORY.1();
    }

    public NavControllerViewModel() {
        this.a = new LinkedHashMap();
    }

    @Override  // androidx.navigation.NavViewModelStoreProvider
    @l
    public ViewModelStore a(@l String s) {
        L.p(s, "backStackEntryId");
        ViewModelStore viewModelStore0 = (ViewModelStore)this.a.get(s);
        if(viewModelStore0 == null) {
            viewModelStore0 = new ViewModelStore();
            this.a.put(s, viewModelStore0);
        }
        return viewModelStore0;
    }

    public final void d(@l String s) {
        L.p(s, "backStackEntryId");
        ViewModelStore viewModelStore0 = (ViewModelStore)this.a.remove(s);
        if(viewModelStore0 != null) {
            viewModelStore0.a();
        }
    }

    @l
    @n
    public static final NavControllerViewModel e(@l ViewModelStore viewModelStore0) {
        return NavControllerViewModel.b.a(viewModelStore0);
    }

    @Override  // androidx.lifecycle.ViewModel
    protected void onCleared() {
        for(Object object0: this.a.values()) {
            ((ViewModelStore)object0).a();
        }
        this.a.clear();
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavControllerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} ViewModelStores (");
        Iterator iterator0 = this.a.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((String)object0));
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }
}

