package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {
    private final FragmentManager e;
    private final int f;
    private FragmentTransaction g;
    private Fragment h;
    private boolean i;
    private static final String j = "FragmentPagerAdapter";
    private static final boolean k = false;
    @Deprecated
    public static final int l = 0;
    public static final int m = 1;

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager0) {
        this(fragmentManager0, 0);
    }

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager0, int v) {
        this.g = null;
        this.h = null;
        this.e = fragmentManager0;
        this.f = v;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void b(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        if(this.g == null) {
            this.g = this.e.u();
        }
        this.g.v(((Fragment)object0));
        if(((Fragment)object0).equals(this.h)) {
            this.h = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void d(@NonNull ViewGroup viewGroup0) {
        FragmentTransaction fragmentTransaction0 = this.g;
        if(fragmentTransaction0 != null) {
            if(!this.i) {
                try {
                    this.i = true;
                    fragmentTransaction0.t();
                    this.i = false;
                }
                catch(Throwable throwable0) {
                    this.i = false;
                    throw throwable0;
                }
            }
            this.g = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object j(@NonNull ViewGroup viewGroup0, int v) {
        if(this.g == null) {
            this.g = this.e.u();
        }
        String s = FragmentPagerAdapter.x(viewGroup0.getId(), ((long)v));
        Fragment fragment0 = this.e.s0(s);
        if(fragment0 == null) {
            fragment0 = this.v(v);
            this.g.g(viewGroup0.getId(), fragment0, FragmentPagerAdapter.x(viewGroup0.getId(), ((long)v)));
        }
        else {
            this.g.p(fragment0);
        }
        if(fragment0 != this.h) {
            fragment0.setMenuVisibility(false);
            if(this.f == 1) {
                this.g.O(fragment0, State.d);
                return fragment0;
            }
            fragment0.setUserVisibleHint(false);
        }
        return fragment0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean k(@NonNull View view0, @NonNull Object object0) {
        return ((Fragment)object0).getView() == view0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void n(@Nullable Parcelable parcelable0, @Nullable ClassLoader classLoader0) {
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable o() {
        return null;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void q(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        Fragment fragment0 = this.h;
        if(((Fragment)object0) != fragment0) {
            if(fragment0 != null) {
                fragment0.setMenuVisibility(false);
                if(this.f == 1) {
                    if(this.g == null) {
                        this.g = this.e.u();
                    }
                    this.g.O(this.h, State.d);
                }
                else {
                    this.h.setUserVisibleHint(false);
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
            this.h = (Fragment)object0;
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

    public long w(int v) [...] // Inlined contents

    private static String x(int v, long v1) {
        return "android:switcher:" + v + ":" + v1;
    }
}

