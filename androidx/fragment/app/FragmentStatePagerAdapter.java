package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

@Deprecated
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    private final FragmentManager e;
    private final int f;
    private FragmentTransaction g;
    private ArrayList h;
    private ArrayList i;
    private Fragment j;
    private boolean k;
    private static final String l = "FragmentStatePagerAdapt";
    private static final boolean m = false;
    @Deprecated
    public static final int n = 0;
    public static final int o = 1;

    @Deprecated
    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager0) {
        this(fragmentManager0, 0);
    }

    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager0, int v) {
        this.g = null;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = null;
        this.e = fragmentManager0;
        this.f = v;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void b(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        if(this.g == null) {
            this.g = this.e.u();
        }
        while(this.h.size() <= v) {
            this.h.add(null);
        }
        this.h.set(v, (((Fragment)object0).isAdded() ? this.e.T1(((Fragment)object0)) : null));
        this.i.set(v, null);
        this.g.B(((Fragment)object0));
        if(((Fragment)object0).equals(this.j)) {
            this.j = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void d(@NonNull ViewGroup viewGroup0) {
        FragmentTransaction fragmentTransaction0 = this.g;
        if(fragmentTransaction0 != null) {
            if(!this.k) {
                try {
                    this.k = true;
                    fragmentTransaction0.t();
                    this.k = false;
                }
                catch(Throwable throwable0) {
                    this.k = false;
                    throw throwable0;
                }
            }
            this.g = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object j(@NonNull ViewGroup viewGroup0, int v) {
        if(this.i.size() > v) {
            Fragment fragment0 = (Fragment)this.i.get(v);
            if(fragment0 != null) {
                return fragment0;
            }
        }
        if(this.g == null) {
            this.g = this.e.u();
        }
        Fragment fragment1 = this.v(v);
        if(this.h.size() > v) {
            SavedState fragment$SavedState0 = (SavedState)this.h.get(v);
            if(fragment$SavedState0 != null) {
                fragment1.setInitialSavedState(fragment$SavedState0);
            }
        }
        while(this.i.size() <= v) {
            this.i.add(null);
        }
        fragment1.setMenuVisibility(false);
        if(this.f == 0) {
            fragment1.setUserVisibleHint(false);
        }
        this.i.set(v, fragment1);
        this.g.f(viewGroup0.getId(), fragment1);
        if(this.f == 1) {
            this.g.O(fragment1, State.d);
        }
        return fragment1;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean k(@NonNull View view0, @NonNull Object object0) {
        return ((Fragment)object0).getView() == view0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void n(@Nullable Parcelable parcelable0, @Nullable ClassLoader classLoader0) {
        if(parcelable0 != null) {
            ((Bundle)parcelable0).setClassLoader(classLoader0);
            Parcelable[] arr_parcelable = ((Bundle)parcelable0).getParcelableArray("states");
            this.h.clear();
            this.i.clear();
            if(arr_parcelable != null) {
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    this.h.add(((SavedState)arr_parcelable[v]));
                }
            }
            for(Object object0: ((Bundle)parcelable0).keySet()) {
                String s = (String)object0;
                if(s.startsWith("f")) {
                    int v1 = Integer.parseInt(s.substring(1));
                    Fragment fragment0 = this.e.E0(((Bundle)parcelable0), s);
                    if(fragment0 == null) {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + s);
                    }
                    else {
                        while(this.i.size() <= v1) {
                            this.i.add(null);
                        }
                        fragment0.setMenuVisibility(false);
                        this.i.set(v1, fragment0);
                    }
                }
            }
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable o() {
        Parcelable parcelable0;
        if(this.h.size() > 0) {
            parcelable0 = new Bundle();
            SavedState[] arr_fragment$SavedState = new SavedState[this.h.size()];
            this.h.toArray(arr_fragment$SavedState);
            ((Bundle)parcelable0).putParcelableArray("states", arr_fragment$SavedState);
        }
        else {
            parcelable0 = null;
        }
        for(int v = 0; v < this.i.size(); ++v) {
            Fragment fragment0 = (Fragment)this.i.get(v);
            if(fragment0 != null && fragment0.isAdded()) {
                if(parcelable0 == null) {
                    parcelable0 = new Bundle();
                }
                this.e.A1(((Bundle)parcelable0), "f" + v, fragment0);
            }
        }
        return parcelable0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void q(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        Fragment fragment0 = this.j;
        if(((Fragment)object0) != fragment0) {
            if(fragment0 != null) {
                fragment0.setMenuVisibility(false);
                if(this.f == 1) {
                    if(this.g == null) {
                        this.g = this.e.u();
                    }
                    this.g.O(this.j, State.d);
                }
                else {
                    this.j.setUserVisibleHint(false);
                }
            }
            ((Fragment)object0).setMenuVisibility(true);
            if(this.f == 1) {
                if(this.g == null) {
                    this.g = this.e.u();
                }
                this.g.O(((Fragment)object0), State.e);
            }
            else {
                ((Fragment)object0).setUserVisibleHint(true);
            }
            this.j = (Fragment)object0;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void t(@NonNull ViewGroup viewGroup0) {
        if(viewGroup0.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @NonNull
    public abstract Fragment v(int arg1);
}

