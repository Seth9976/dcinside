package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresOptIn.Level;
import androidx.annotation.RequiresOptIn;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class FragmentStateAdapter extends Adapter implements StatefulAdapter {
    static abstract class DataSetChangeObserver extends AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        DataSetChangeObserver(androidx.viewpager2.adapter.FragmentStateAdapter.1 fragmentStateAdapter$10) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public abstract void f();

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void g(int v, int v1) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void h(int v, int v1, @Nullable Object object0) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void i(int v, int v1) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void k(int v, int v1, int v2) {
            this.f();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public final void l(int v, int v1) {
            this.f();
        }
    }

    @RequiresOptIn(level = Level.a)
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    static class FragmentEventDispatcher {
        private List a;

        FragmentEventDispatcher() {
            this.a = new CopyOnWriteArrayList();
        }

        public List a(Fragment fragment0, State lifecycle$State0) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                list0.add(((FragmentTransactionCallback)object0).a(fragment0, lifecycle$State0));
            }
            return list0;
        }

        public void b(List list0) {
            for(Object object0: list0) {
                ((OnPostEventListener)object0).a();
            }
        }

        public List c(Fragment fragment0) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                list0.add(((FragmentTransactionCallback)object0).b(fragment0));
            }
            return list0;
        }

        public List d(Fragment fragment0) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                list0.add(((FragmentTransactionCallback)object0).c(fragment0));
            }
            return list0;
        }

        @OptIn(markerClass = {ExperimentalFragmentStateAdapterApi.class})
        public List e(Fragment fragment0) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                list0.add(((FragmentTransactionCallback)object0).d(fragment0));
            }
            return list0;
        }

        public void f(FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
            this.a.add(fragmentStateAdapter$FragmentTransactionCallback0);
        }

        public void g(FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
            this.a.remove(fragmentStateAdapter$FragmentTransactionCallback0);
        }
    }

    class FragmentMaxLifecycleEnforcer {
        private OnPageChangeCallback a;
        private AdapterDataObserver b;
        private LifecycleEventObserver c;
        private ViewPager2 d;
        private long e;
        final FragmentStateAdapter f;

        FragmentMaxLifecycleEnforcer() {
            this.e = -1L;
        }

        @NonNull
        private ViewPager2 a(@NonNull RecyclerView recyclerView0) {
            ViewParent viewParent0 = recyclerView0.getParent();
            if(!(viewParent0 instanceof ViewPager2)) {
                throw new IllegalStateException("Expected ViewPager2 instance. Got: " + viewParent0);
            }
            return (ViewPager2)viewParent0;
        }

        void b(@NonNull RecyclerView recyclerView0) {
            this.d = this.a(recyclerView0);
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$10 = new OnPageChangeCallback() {
                final FragmentMaxLifecycleEnforcer a;

                @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
                public void a(int v) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }

                @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
                public void c(int v) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.a = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$10;
            this.d.n(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$10);
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$20 = new DataSetChangeObserver() {
                final FragmentMaxLifecycleEnforcer a;

                {
                    FragmentMaxLifecycleEnforcer.this = fragmentStateAdapter$FragmentMaxLifecycleEnforcer0;
                    super(null);
                }

                @Override  // androidx.viewpager2.adapter.FragmentStateAdapter$DataSetChangeObserver
                public void f() {
                    FragmentMaxLifecycleEnforcer.this.d(true);
                }
            };
            this.b = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$20;
            FragmentStateAdapter.this.registerAdapterDataObserver(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$20);
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$30 = (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
                if(FragmentStateAdapter.this.Q()) {
                    return;
                }
                if(FragmentMaxLifecycleEnforcer.this.d.getScrollState() != 0) {
                    return;
                }
                if(!FragmentStateAdapter.this.c.l() && FragmentStateAdapter.this.getItemCount() != 0) {
                    int v = FragmentMaxLifecycleEnforcer.this.d.getCurrentItem();
                    if(v >= FragmentStateAdapter.this.getItemCount()) {
                        return;
                    }
                    if(((long)v) == FragmentMaxLifecycleEnforcer.this.e && !false) {
                        return;
                    }
                    Fragment fragment0 = (Fragment)FragmentStateAdapter.this.c.g(((long)v));
                    if(fragment0 != null && fragment0.isAdded()) {
                        FragmentMaxLifecycleEnforcer.this.e = (long)v;
                        FragmentTransaction fragmentTransaction0 = FragmentStateAdapter.this.b.u();
                        ArrayList arrayList0 = new ArrayList();
                        Fragment fragment1 = null;
                        for(int v1 = 0; v1 < FragmentStateAdapter.this.c.w(); ++v1) {
                            long v2 = FragmentStateAdapter.this.c.m(v1);
                            Fragment fragment2 = (Fragment)FragmentStateAdapter.this.c.x(v1);
                            if(fragment2.isAdded()) {
                                if(v2 == FragmentMaxLifecycleEnforcer.this.e) {
                                    fragment1 = fragment2;
                                }
                                else {
                                    fragmentTransaction0.O(fragment2, State.d);
                                    arrayList0.add(FragmentStateAdapter.this.g.a(fragment2, State.d));
                                }
                                fragment2.setMenuVisibility(v2 == FragmentMaxLifecycleEnforcer.this.e);
                            }
                        }
                        if(fragment1 != null) {
                            fragmentTransaction0.O(fragment1, State.e);
                            arrayList0.add(FragmentStateAdapter.this.g.a(fragment1, State.e));
                        }
                        if(!fragmentTransaction0.A()) {
                            fragmentTransaction0.s();
                            Collections.reverse(arrayList0);
                            for(Object object0: arrayList0) {
                                FragmentStateAdapter.this.g.b(((List)object0));
                            }
                        }
                    }
                }
            };
            this.c = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$30;
            FragmentStateAdapter.this.a.a(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$30);

            class androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3 implements LifecycleEventObserver {
                final FragmentMaxLifecycleEnforcer a;

                @Override  // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            }

        }

        void c(@NonNull RecyclerView recyclerView0) {
            this.a(recyclerView0).x(this.a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.b);
            FragmentStateAdapter.this.a.d(this.c);
            this.d = null;
        }

        // 检测为 Lambda 实现
        void d(boolean z) [...]
    }

    public static abstract class FragmentTransactionCallback {
        public interface OnPostEventListener {
            void a();
        }

        @NonNull
        private static final OnPostEventListener a;

        static {
            FragmentTransactionCallback.a = new OnPostEventListener() {
                @Override  // androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener
                public void a() {
                }
            };
        }

        @NonNull
        public OnPostEventListener a(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        public OnPostEventListener b(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        public OnPostEventListener c(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener d(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }
    }

    final Lifecycle a;
    final FragmentManager b;
    final LongSparseArray c;
    private final LongSparseArray d;
    private final LongSparseArray e;
    private FragmentMaxLifecycleEnforcer f;
    FragmentEventDispatcher g;
    boolean h;
    private boolean i;
    private static final String j = "f#";
    private static final String k = "s#";
    private static final long l = 10000L;

    public FragmentStateAdapter(@NonNull Fragment fragment0) {
        this(fragment0.getChildFragmentManager(), fragment0.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity0) {
        this(fragmentActivity0.getSupportFragmentManager(), fragmentActivity0.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager0, @NonNull Lifecycle lifecycle0) {
        this.c = new LongSparseArray();
        this.d = new LongSparseArray();
        this.e = new LongSparseArray();
        this.g = new FragmentEventDispatcher();
        this.h = false;
        this.i = false;
        this.b = fragmentManager0;
        this.a = lifecycle0;
        super.setHasStableIds(true);
    }

    void A() {
        if(this.i && !this.Q()) {
            ArraySet arraySet0 = new ArraySet();
            for(int v1 = 0; v1 < this.c.w(); ++v1) {
                long v2 = this.c.m(v1);
                if(!this.w(v2)) {
                    arraySet0.add(v2);
                    this.e.q(v2);
                }
            }
            if(!this.h) {
                this.i = false;
                for(int v = 0; v < this.c.w(); ++v) {
                    long v3 = this.c.m(v);
                    if(!this.B(v3)) {
                        arraySet0.add(v3);
                    }
                }
            }
            for(Object object0: arraySet0) {
                this.N(((long)(((Long)object0))));
            }
        }
    }

    private boolean B(long v) {
        if(this.e.d(v)) {
            return true;
        }
        Fragment fragment0 = (Fragment)this.c.g(v);
        if(fragment0 == null) {
            return false;
        }
        View view0 = fragment0.getView();
        return view0 == null ? false : view0.getParent() != null;
    }

    private static boolean C(@NonNull String s, @NonNull String s1) {
        return s.startsWith(s1) && s.length() > s1.length();
    }

    private Long D(int v) {
        Long long0 = null;
        for(int v1 = 0; v1 < this.e.w(); ++v1) {
            if(((int)(((Integer)this.e.x(v1)))) == v) {
                if(long0 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                long0 = this.e.m(v1);
                continue;
            }
        }
        return long0;
    }

    public final void E(@NonNull FragmentViewHolder fragmentViewHolder0, int v) {
        long v1 = fragmentViewHolder0.getItemId();
        int v2 = fragmentViewHolder0.f().getId();
        Long long0 = this.D(v2);
        if(long0 != null && ((long)long0) != v1) {
            this.N(((long)long0));
            this.e.q(((long)long0));
        }
        this.e.n(v1, v2);
        this.z(v);
        if(fragmentViewHolder0.f().isAttachedToWindow()) {
            this.K(fragmentViewHolder0);
        }
        this.A();
    }

    @NonNull
    public final FragmentViewHolder F(@NonNull ViewGroup viewGroup0, int v) {
        return FragmentViewHolder.e(viewGroup0);
    }

    public final boolean G(@NonNull FragmentViewHolder fragmentViewHolder0) {
        return true;
    }

    public final void H(@NonNull FragmentViewHolder fragmentViewHolder0) {
        this.K(fragmentViewHolder0);
        this.A();
    }

    public final void I(@NonNull FragmentViewHolder fragmentViewHolder0) {
        Long long0 = this.D(fragmentViewHolder0.f().getId());
        if(long0 != null) {
            this.N(((long)long0));
            this.e.q(((long)long0));
        }
    }

    private static long J(@NonNull String s, @NonNull String s1) {
        return Long.parseLong(s.substring(s1.length()));
    }

    void K(@NonNull FragmentViewHolder fragmentViewHolder0) {
        Fragment fragment0 = (Fragment)this.c.g(fragmentViewHolder0.getItemId());
        if(fragment0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout0 = fragmentViewHolder0.f();
        View view0 = fragment0.getView();
        if(!fragment0.isAdded() && view0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if(fragment0.isAdded() && view0 == null) {
            this.P(fragment0, frameLayout0);
            return;
        }
        if(fragment0.isAdded() && view0.getParent() != null) {
            if(view0.getParent() != frameLayout0) {
                this.v(view0, frameLayout0);
            }
            return;
        }
        if(fragment0.isAdded()) {
            this.v(view0, frameLayout0);
            return;
        }
        if(!this.Q()) {
            this.P(fragment0, frameLayout0);
            List list0 = this.g.c(fragment0);
            try {
                fragment0.setMenuVisibility(false);
                this.b.u().k(fragment0, "f" + fragmentViewHolder0.getItemId()).O(fragment0, State.d).s();
                this.f.d(false);
            }
            finally {
                this.g.b(list0);
            }
            return;
        }
        if(this.b.V0()) {
            return;
        }
        androidx.viewpager2.adapter.FragmentStateAdapter.1 fragmentStateAdapter$10 = new LifecycleEventObserver() {
            final FragmentStateAdapter b;

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
                if(FragmentStateAdapter.this.Q()) {
                    return;
                }
                lifecycleOwner0.getLifecycle().d(this);
                if(fragmentViewHolder0.f().isAttachedToWindow()) {
                    FragmentStateAdapter.this.K(fragmentViewHolder0);
                }
            }
        };
        this.a.a(fragmentStateAdapter$10);
    }

    public void L(@NonNull FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
        this.g.f(fragmentStateAdapter$FragmentTransactionCallback0);
    }

    private void N(long v) {
        Fragment fragment0 = (Fragment)this.c.g(v);
        if(fragment0 == null) {
            return;
        }
        if(fragment0.getView() != null) {
            ViewParent viewParent0 = fragment0.getView().getParent();
            if(viewParent0 != null) {
                ((FrameLayout)viewParent0).removeAllViews();
            }
        }
        if(!this.w(v)) {
            this.d.q(v);
        }
        if(!fragment0.isAdded()) {
            this.c.q(v);
            return;
        }
        if(this.Q()) {
            this.i = true;
            return;
        }
        if(fragment0.isAdded() && this.w(v)) {
            List list0 = this.g.e(fragment0);
            SavedState fragment$SavedState0 = this.b.T1(fragment0);
            this.g.b(list0);
            this.d.n(v, fragment$SavedState0);
        }
        List list1 = this.g.d(fragment0);
        try {
            this.b.u().B(fragment0).s();
            this.c.q(v);
        }
        finally {
            this.g.b(list1);
        }
    }

    private void O() {
        Handler handler0 = new Handler(Looper.getMainLooper());
        androidx.viewpager2.adapter.FragmentStateAdapter.3 fragmentStateAdapter$30 = new Runnable() {
            final FragmentStateAdapter a;

            @Override
            public void run() {
                FragmentStateAdapter.this.h = false;
                FragmentStateAdapter.this.A();
            }
        };
        androidx.viewpager2.adapter.FragmentStateAdapter.4 fragmentStateAdapter$40 = new LifecycleEventObserver() {
            final FragmentStateAdapter c;

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    handler0.removeCallbacks(fragmentStateAdapter$30);
                    lifecycleOwner0.getLifecycle().d(this);
                }
            }
        };
        this.a.a(fragmentStateAdapter$40);
        handler0.postDelayed(fragmentStateAdapter$30, 10000L);
    }

    private void P(Fragment fragment0, @NonNull FrameLayout frameLayout0) {
        androidx.viewpager2.adapter.FragmentStateAdapter.2 fragmentStateAdapter$20 = new FragmentLifecycleCallbacks() {
            final FragmentStateAdapter c;

            @Override  // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
            public void m(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull View view0, @Nullable Bundle bundle0) {
                if(fragment0 == fragment0) {
                    fragmentManager0.f2(this);
                    FragmentStateAdapter.this.v(view0, frameLayout0);
                }
            }
        };
        this.b.B1(fragmentStateAdapter$20, false);
    }

    boolean Q() {
        return this.b.d1();
    }

    public void R(@NonNull FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
        this.g.g(fragmentStateAdapter$FragmentTransactionCallback0);
    }

    @Override  // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable a() {
        Parcelable parcelable0 = new Bundle(this.c.w() + this.d.w());
        for(int v1 = 0; v1 < this.c.w(); ++v1) {
            long v2 = this.c.m(v1);
            Fragment fragment0 = (Fragment)this.c.g(v2);
            if(fragment0 != null && fragment0.isAdded()) {
                this.b.A1(((Bundle)parcelable0), "f#" + v2, fragment0);
            }
        }
        for(int v = 0; v < this.d.w(); ++v) {
            long v3 = this.d.m(v);
            if(this.w(v3)) {
                ((Bundle)parcelable0).putParcelable("s#" + v3, ((Parcelable)this.d.g(v3)));
            }
        }
        return parcelable0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) [...] // Inlined contents

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        Preconditions.a(this.f == null);
        FragmentMaxLifecycleEnforcer fragmentStateAdapter$FragmentMaxLifecycleEnforcer0 = new FragmentMaxLifecycleEnforcer(this);
        this.f = fragmentStateAdapter$FragmentMaxLifecycleEnforcer0;
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer0.b(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.E(((FragmentViewHolder)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.F(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        this.f.c(recyclerView0);
        this.f = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
        return this.G(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.H(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.I(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    @Override  // androidx.viewpager2.adapter.StatefulAdapter
    public final void s(@NonNull Parcelable parcelable0) {
        if(!this.d.l() || !this.c.l()) {
            throw new IllegalStateException("Expected the adapter to be \'fresh\' while restoring state.");
        }
        if(((Bundle)parcelable0).getClassLoader() == null) {
            ((Bundle)parcelable0).setClassLoader(this.getClass().getClassLoader());
        }
        for(Object object0: ((Bundle)parcelable0).keySet()) {
            String s = (String)object0;
            if(FragmentStateAdapter.C(s, "f#")) {
                long v = FragmentStateAdapter.J(s, "f#");
                Fragment fragment0 = this.b.E0(((Bundle)parcelable0), s);
                this.c.n(v, fragment0);
            }
            else {
                if(!FragmentStateAdapter.C(s, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + s);
                }
                long v1 = FragmentStateAdapter.J(s, "s#");
                SavedState fragment$SavedState0 = (SavedState)((Bundle)parcelable0).getParcelable(s);
                if(this.w(v1)) {
                    this.d.n(v1, fragment$SavedState0);
                }
            }
        }
        if(!this.c.l()) {
            this.i = true;
            this.h = true;
            this.A();
            this.O();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    void v(@NonNull View view0, @NonNull FrameLayout frameLayout0) {
        if(frameLayout0.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if(view0.getParent() == frameLayout0) {
            return;
        }
        if(frameLayout0.getChildCount() > 0) {
            frameLayout0.removeAllViews();
        }
        if(view0.getParent() != null) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        frameLayout0.addView(view0);
    }

    public boolean w(long v) {
        return v >= 0L && v < ((long)this.getItemCount());
    }

    @NonNull
    public abstract Fragment x(int arg1);

    @NonNull
    private static String y(@NonNull String s, long v) [...] // Inlined contents

    private void z(int v) {
        if(!this.c.d(((long)v))) {
            Fragment fragment0 = this.x(v);
            fragment0.setInitialSavedState(((SavedState)this.d.g(((long)v))));
            this.c.n(((long)v), fragment0);
        }
    }
}

