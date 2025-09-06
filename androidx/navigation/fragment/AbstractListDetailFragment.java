package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.R.styleable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class AbstractListDetailFragment extends Fragment {
    static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements PanelSlideListener {
        @l
        private final SlidingPaneLayout d;

        public InnerOnBackPressedCallback(@l SlidingPaneLayout slidingPaneLayout0) {
            L.p(slidingPaneLayout0, "slidingPaneLayout");
            super(true);
            this.d = slidingPaneLayout0;
            slidingPaneLayout0.a(this);
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void a(@l View view0) {
            L.p(view0, "panel");
            this.m(true);
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void b(@l View view0) {
            L.p(view0, "panel");
            this.m(false);
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void c(@l View view0, float f) {
            L.p(view0, "panel");
        }

        @Override  // androidx.activity.OnBackPressedCallback
        public void g() {
            this.d.d();
        }
    }

    @m
    private OnBackPressedCallback a;
    @m
    private NavHostFragment b;
    private int c;

    @l
    public final NavHostFragment j0() {
        NavHostFragment navHostFragment0 = this.b;
        if(navHostFragment0 == null) {
            throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
        }
        return navHostFragment0;
    }

    @l
    public final SlidingPaneLayout k0() {
        return (SlidingPaneLayout)this.requireView();
    }

    @l
    public NavHostFragment l0() {
        int v = this.c;
        return v == 0 ? new NavHostFragment() : Companion.c(NavHostFragment.f, v, null, 2, null);
    }

    @l
    public abstract View m0(@l LayoutInflater arg1, @m ViewGroup arg2, @m Bundle arg3);

    public void n0(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @l
    public final View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        NavHostFragment navHostFragment0;
        L.p(layoutInflater0, "inflater");
        if(bundle0 != null) {
            this.c = bundle0.getInt("android-support-nav:fragment:graphId");
        }
        View view0 = new SlidingPaneLayout(layoutInflater0.getContext());
        view0.setId(id.sliding_pane_layout);
        View view1 = this.m0(layoutInflater0, ((ViewGroup)view0), bundle0);
        if(!L.g(view1, view0) && !L.g(view1.getParent(), view0)) {
            ((ViewGroup)view0).addView(view1);
        }
        Context context0 = layoutInflater0.getContext();
        L.o(context0, "inflater.context");
        FragmentContainerView fragmentContainerView0 = new FragmentContainerView(context0);
        fragmentContainerView0.setId(id.sliding_pane_detail_container);
        LayoutParams slidingPaneLayout$LayoutParams0 = new LayoutParams(layoutInflater0.getContext().getResources().getDimensionPixelSize(dimen.sliding_pane_detail_pane_width), -1);
        slidingPaneLayout$LayoutParams0.a = 1.0f;
        ((ViewGroup)view0).addView(fragmentContainerView0, slidingPaneLayout$LayoutParams0);
        Fragment fragment0 = this.getChildFragmentManager().r0(id.sliding_pane_detail_container);
        boolean z = true;
        if(fragment0 == null) {
            navHostFragment0 = this.l0();
            FragmentManager fragmentManager0 = this.getChildFragmentManager();
            L.o(fragmentManager0, "childFragmentManager");
            FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
            L.o(fragmentTransaction0, "beginTransaction()");
            fragmentTransaction0.Q(true);
            fragmentTransaction0.f(0x7F0B0F1C, navHostFragment0);  // id:sliding_pane_detail_container
            fragmentTransaction0.q();
        }
        else {
            navHostFragment0 = (NavHostFragment)fragment0;
        }
        this.b = navHostFragment0;
        this.a = new InnerOnBackPressedCallback(((SlidingPaneLayout)view0));
        if(!ViewCompat.a1(view0) || view0.isLayoutRequested()) {
            view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(@l View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    L.q(view0, "view");
                    view0.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback0 = ((SlidingPaneLayout)view0).a;
                    L.m(onBackPressedCallback0);
                    onBackPressedCallback0.m(this.b.o() && this.b.isOpen());
                }
            });
        }
        else {
            OnBackPressedCallback onBackPressedCallback0 = this.a;
            L.m(onBackPressedCallback0);
            if(!((SlidingPaneLayout)view0).o() || !((SlidingPaneLayout)view0).isOpen()) {
                z = false;
            }
            onBackPressedCallback0.m(z);
        }
        OnBackPressedDispatcher onBackPressedDispatcher0 = this.requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        OnBackPressedCallback onBackPressedCallback1 = this.a;
        L.m(onBackPressedCallback1);
        onBackPressedDispatcher0.i(lifecycleOwner0, onBackPressedCallback1);
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(@l Context context0, @l AttributeSet attributeSet0, @m Bundle bundle0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super.onInflate(context0, attributeSet0, bundle0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.NavHost);
        L.o(typedArray0, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int v = typedArray0.getResourceId(styleable.NavHost_navGraph, 0);
        if(v != 0) {
            this.c = v;
        }
        typedArray0.recycle();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        int v = this.c;
        if(v != 0) {
            bundle0.putInt("android-support-nav:fragment:graphId", v);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public final void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        View view1 = this.k0().getChildAt(0);
        L.o(view1, "listPaneView");
        this.n0(view1, bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewStateRestored(@m Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        OnBackPressedCallback onBackPressedCallback0 = this.a;
        L.m(onBackPressedCallback0);
        onBackPressedCallback0.m(this.k0().o() && this.k0().isOpen());
    }
}

