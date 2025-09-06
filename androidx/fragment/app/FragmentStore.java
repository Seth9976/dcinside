package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class FragmentStore {
    private final ArrayList a;
    private final HashMap b;
    private final HashMap c;
    private FragmentManagerViewModel d;
    private static final String e = "FragmentManager";

    FragmentStore() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    @Nullable
    ArrayList A() {
        synchronized(this.a) {
            if(this.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList1 = new ArrayList(this.a.size());
            for(Object object0: this.a) {
                Fragment fragment0 = (Fragment)object0;
                arrayList1.add(fragment0.mWho);
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment0.mWho + "): " + fragment0);
                }
            }
            return arrayList1;
        }
    }

    void B(@NonNull FragmentManagerViewModel fragmentManagerViewModel0) {
        this.d = fragmentManagerViewModel0;
    }

    @Nullable
    FragmentState C(@NonNull String s, @Nullable FragmentState fragmentState0) {
        return fragmentState0 == null ? ((FragmentState)this.c.remove(s)) : ((FragmentState)this.c.put(s, fragmentState0));
    }

    void a(@NonNull Fragment fragment0) {
        if(this.a.contains(fragment0)) {
            throw new IllegalStateException("Fragment already added: " + fragment0);
        }
        synchronized(this.a) {
            this.a.add(fragment0);
        }
        fragment0.mAdded = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@NonNull String s) {
        return this.b.get(s) != null;
    }

    void d(int v) {
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                fragmentStateManager0.u(v);
            }
        }
    }

    void e(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        if(!this.b.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Active Fragments:");
            for(Object object0: this.b.values()) {
                FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
                printWriter0.print(s);
                if(fragmentStateManager0 == null) {
                    printWriter0.println("null");
                }
                else {
                    Fragment fragment0 = fragmentStateManager0.k();
                    printWriter0.println(fragment0);
                    fragment0.dump(s + "    ", fileDescriptor0, printWriter0, arr_s);
                }
            }
        }
        int v = this.a.size();
        if(v > 0) {
            printWriter0.print(s);
            printWriter0.println("Added Fragments:");
            for(int v1 = 0; v1 < v; ++v1) {
                Fragment fragment1 = (Fragment)this.a.get(v1);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.println("Fragment{43977421} (28910fc6-7fcb-48af-94d7-0f15bbcc7dd3)");
            }
        }
    }

    @Nullable
    Fragment f(@NonNull String s) {
        FragmentStateManager fragmentStateManager0 = (FragmentStateManager)this.b.get(s);
        return fragmentStateManager0 == null ? null : fragmentStateManager0.k();
    }

    @Nullable
    Fragment g(@IdRes int v) {
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            Fragment fragment0 = (Fragment)this.a.get(v1);
            if(fragment0 != null && fragment0.mFragmentId == v) {
                return fragment0;
            }
        }
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                Fragment fragment1 = fragmentStateManager0.k();
                if(fragment1.mFragmentId == v) {
                    return fragment1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Nullable
    Fragment h(@Nullable String s) {
        if(s != null) {
            for(int v = this.a.size() - 1; v >= 0; --v) {
                Fragment fragment0 = (Fragment)this.a.get(v);
                if(fragment0 != null && s.equals(fragment0.mTag)) {
                    return fragment0;
                }
            }
        }
        if(s != null) {
            for(Object object0: this.b.values()) {
                FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
                if(fragmentStateManager0 != null) {
                    Fragment fragment1 = fragmentStateManager0.k();
                    if(s.equals(fragment1.mTag)) {
                        return fragment1;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    Fragment i(@NonNull String s) {
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                Fragment fragment0 = fragmentStateManager0.k().findFragmentByWho(s);
                if(fragment0 != null) {
                    return fragment0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    int j(@NonNull Fragment fragment0) {
        View view1;
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 == null) {
            return -1;
        }
        int v = this.a.indexOf(fragment0);
        for(int v1 = v - 1; v1 >= 0; --v1) {
            Fragment fragment1 = (Fragment)this.a.get(v1);
            if(fragment1.mContainer == viewGroup0) {
                View view0 = fragment1.mView;
                if(view0 != null) {
                    return viewGroup0.indexOfChild(view0) + 1;
                }
            }
        }
    alab1:
        while(true) {
            do {
                ++v;
                if(v >= this.a.size()) {
                    break alab1;
                }
                Fragment fragment2 = (Fragment)this.a.get(v);
                if(fragment2.mContainer != viewGroup0) {
                    continue alab1;
                }
                view1 = fragment2.mView;
            }
            while(view1 == null);
            return viewGroup0.indexOfChild(view1);
        }
        return -1;
    }

    int k() {
        return this.b.size();
    }

    @NonNull
    List l() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                ((ArrayList)list0).add(fragmentStateManager0);
            }
        }
        return list0;
    }

    @NonNull
    List m() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 == null) {
                ((ArrayList)list0).add(null);
            }
            else {
                ((ArrayList)list0).add(fragmentStateManager0.k());
            }
        }
        return list0;
    }

    @NonNull
    ArrayList n() {
        return new ArrayList(this.c.values());
    }

    @Nullable
    FragmentStateManager o(@NonNull String s) {
        return (FragmentStateManager)this.b.get(s);
    }

    @NonNull
    List p() {
        if(this.a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = this.a;
        return new ArrayList(this.a);
    }

    FragmentManagerViewModel q() {
        return this.d;
    }

    @Nullable
    FragmentState r(@NonNull String s) {
        return (FragmentState)this.c.get(s);
    }

    void s(@NonNull FragmentStateManager fragmentStateManager0) {
        Fragment fragment0 = fragmentStateManager0.k();
        if(this.c(fragment0.mWho)) {
            return;
        }
        this.b.put(fragment0.mWho, fragmentStateManager0);
        if(fragment0.mRetainInstanceChangedWhileDetached) {
            if(fragment0.mRetainInstance) {
                this.d.c(fragment0);
            }
            else {
                this.d.n(fragment0);
            }
            fragment0.mRetainInstanceChangedWhileDetached = false;
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment0);
        }
    }

    void t(@NonNull FragmentStateManager fragmentStateManager0) {
        Fragment fragment0 = fragmentStateManager0.k();
        if(fragment0.mRetainInstance) {
            this.d.n(fragment0);
        }
        if(((FragmentStateManager)this.b.put(fragment0.mWho, null)) == null) {
            return;
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment0);
        }
    }

    void u() {
        for(Object object0: this.a) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)this.b.get(((Fragment)object0).mWho);
            if(fragmentStateManager0 != null) {
                fragmentStateManager0.m();
            }
        }
        for(Object object1: this.b.values()) {
            FragmentStateManager fragmentStateManager1 = (FragmentStateManager)object1;
            if(fragmentStateManager1 != null) {
                fragmentStateManager1.m();
                Fragment fragment0 = fragmentStateManager1.k();
                if(fragment0.mRemoving && !fragment0.isInBackStack()) {
                    if(fragment0.mBeingSaved && !this.c.containsKey(fragment0.mWho)) {
                        fragmentStateManager1.s();
                    }
                    this.t(fragmentStateManager1);
                }
            }
        }
    }

    void v(@NonNull Fragment fragment0) {
        synchronized(this.a) {
            this.a.remove(fragment0);
        }
        fragment0.mAdded = false;
    }

    void w() {
        this.b.clear();
    }

    void x(@Nullable List list0) {
        this.a.clear();
        if(list0 != null) {
            for(Object object0: list0) {
                String s = (String)object0;
                Fragment fragment0 = this.f(s);
                if(fragment0 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + s + ")");
                }
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + s + "): " + fragment0);
                }
                this.a(fragment0);
            }
        }
    }

    void y(@NonNull ArrayList arrayList0) {
        this.c.clear();
        for(Object object0: arrayList0) {
            this.c.put(((FragmentState)object0).b, ((FragmentState)object0));
        }
    }

    @NonNull
    ArrayList z() {
        ArrayList arrayList0 = new ArrayList(this.b.size());
        for(Object object0: this.b.values()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                Fragment fragment0 = fragmentStateManager0.k();
                fragmentStateManager0.s();
                arrayList0.add(fragment0.mWho);
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment0 + ": " + fragment0.mSavedFragmentState);
                }
            }
        }
        return arrayList0;
    }
}

