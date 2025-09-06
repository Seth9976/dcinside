package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.k;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class FragmentManagerViewModel extends ViewModel {
    private final HashMap a;
    private final HashMap b;
    private final HashMap c;
    private final boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private static final String h = "FragmentManager";
    private static final Factory i;

    static {
        FragmentManagerViewModel.i = new Factory() {
            @Override  // androidx.lifecycle.ViewModelProvider$Factory
            public ViewModel a(Class class0, CreationExtras creationExtras0) {
                return k.b(this, class0, creationExtras0);
            }

            @Override  // androidx.lifecycle.ViewModelProvider$Factory
            @NonNull
            public ViewModel b(@NonNull Class class0) {
                return new FragmentManagerViewModel(true);
            }
        };
    }

    FragmentManagerViewModel(boolean z) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = false;
        this.f = false;
        this.g = false;
        this.d = z;
    }

    void c(@NonNull Fragment fragment0) {
        if(this.g) {
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if(this.a.containsKey(fragment0.mWho)) {
            return;
        }
        this.a.put(fragment0.mWho, fragment0);
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment0);
        }
    }

    void d(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment0);
        }
        this.f(fragment0.mWho);
    }

    void e(@NonNull String s) {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + s);
        }
        this.f(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return FragmentManagerViewModel.class == class0 && (this.a.equals(((FragmentManagerViewModel)object0).a) && this.b.equals(((FragmentManagerViewModel)object0).b) && this.c.equals(((FragmentManagerViewModel)object0).c));
        }
        return false;
    }

    private void f(@NonNull String s) {
        FragmentManagerViewModel fragmentManagerViewModel0 = (FragmentManagerViewModel)this.b.get(s);
        if(fragmentManagerViewModel0 != null) {
            fragmentManagerViewModel0.onCleared();
            this.b.remove(s);
        }
        ViewModelStore viewModelStore0 = (ViewModelStore)this.c.get(s);
        if(viewModelStore0 != null) {
            viewModelStore0.a();
            this.c.remove(s);
        }
    }

    @Nullable
    Fragment g(String s) {
        return (Fragment)this.a.get(s);
    }

    @NonNull
    FragmentManagerViewModel h(@NonNull Fragment fragment0) {
        FragmentManagerViewModel fragmentManagerViewModel0 = (FragmentManagerViewModel)this.b.get(fragment0.mWho);
        if(fragmentManagerViewModel0 == null) {
            fragmentManagerViewModel0 = new FragmentManagerViewModel(this.d);
            this.b.put(fragment0.mWho, fragmentManagerViewModel0);
        }
        return fragmentManagerViewModel0;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @NonNull
    static FragmentManagerViewModel i(ViewModelStore viewModelStore0) {
        return (FragmentManagerViewModel)new ViewModelProvider(viewModelStore0, FragmentManagerViewModel.i).a(FragmentManagerViewModel.class);
    }

    @NonNull
    Collection j() {
        return new ArrayList(this.a.values());
    }

    @Nullable
    @Deprecated
    FragmentManagerNonConfig k() {
        if(this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty()) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            FragmentManagerNonConfig fragmentManagerNonConfig0 = ((FragmentManagerViewModel)map$Entry0.getValue()).k();
            if(fragmentManagerNonConfig0 != null) {
                hashMap0.put(((String)map$Entry0.getKey()), fragmentManagerNonConfig0);
            }
        }
        this.f = true;
        return !this.a.isEmpty() || !hashMap0.isEmpty() || !this.c.isEmpty() ? new FragmentManagerNonConfig(new ArrayList(this.a.values()), hashMap0, new HashMap(this.c)) : null;
    }

    @NonNull
    ViewModelStore l(@NonNull Fragment fragment0) {
        ViewModelStore viewModelStore0 = (ViewModelStore)this.c.get(fragment0.mWho);
        if(viewModelStore0 == null) {
            viewModelStore0 = new ViewModelStore();
            this.c.put(fragment0.mWho, viewModelStore0);
        }
        return viewModelStore0;
    }

    boolean m() {
        return this.e;
    }

    void n(@NonNull Fragment fragment0) {
        if(this.g) {
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if(this.a.remove(fragment0.mWho) != null && FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment0);
        }
    }

    @Deprecated
    void o(@Nullable FragmentManagerNonConfig fragmentManagerNonConfig0) {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        if(fragmentManagerNonConfig0 != null) {
            Collection collection0 = fragmentManagerNonConfig0.b();
            if(collection0 != null) {
                for(Object object0: collection0) {
                    Fragment fragment0 = (Fragment)object0;
                    if(fragment0 != null) {
                        this.a.put(fragment0.mWho, fragment0);
                    }
                }
            }
            Map map0 = fragmentManagerNonConfig0.a();
            if(map0 != null) {
                for(Object object1: map0.entrySet()) {
                    FragmentManagerViewModel fragmentManagerViewModel0 = new FragmentManagerViewModel(this.d);
                    fragmentManagerViewModel0.o(((FragmentManagerNonConfig)((Map.Entry)object1).getValue()));
                    String s = (String)((Map.Entry)object1).getKey();
                    this.b.put(s, fragmentManagerViewModel0);
                }
            }
            Map map1 = fragmentManagerNonConfig0.c();
            if(map1 != null) {
                this.c.putAll(map1);
            }
        }
        this.f = false;
    }

    @Override  // androidx.lifecycle.ViewModel
    protected void onCleared() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.e = true;
    }

    void p(boolean z) {
        this.g = z;
    }

    boolean q(@NonNull Fragment fragment0) {
        if(!this.a.containsKey(fragment0.mWho)) {
            return true;
        }
        return this.d ? this.e : !this.f;
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.a.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.b.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.c.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

