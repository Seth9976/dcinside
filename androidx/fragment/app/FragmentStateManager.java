package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.ViewModelStoreOwner;

class FragmentStateManager {
    private final FragmentLifecycleCallbacksDispatcher a;
    private final FragmentStore b;
    @NonNull
    private final Fragment c;
    private boolean d;
    private int e;
    private static final String f = "FragmentManager";
    private static final String g = "android:target_req_state";
    private static final String h = "android:target_state";
    private static final String i = "android:view_state";
    private static final String j = "android:view_registry_state";
    private static final String k = "android:user_visible_hint";

    FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher0, @NonNull FragmentStore fragmentStore0, @NonNull Fragment fragment0) {
        this.d = false;
        this.e = -1;
        this.a = fragmentLifecycleCallbacksDispatcher0;
        this.b = fragmentStore0;
        this.c = fragment0;
    }

    FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher0, @NonNull FragmentStore fragmentStore0, @NonNull Fragment fragment0, @NonNull FragmentState fragmentState0) {
        this.d = false;
        this.e = -1;
        this.a = fragmentLifecycleCallbacksDispatcher0;
        this.b = fragmentStore0;
        this.c = fragment0;
        fragment0.mSavedViewState = null;
        fragment0.mSavedViewRegistryState = null;
        fragment0.mBackStackNesting = 0;
        fragment0.mInLayout = false;
        fragment0.mAdded = false;
        fragment0.mTargetWho = fragment0.mTarget == null ? null : fragment0.mTarget.mWho;
        fragment0.mTarget = null;
        Bundle bundle0 = fragmentState0.m;
        if(bundle0 != null) {
            fragment0.mSavedFragmentState = bundle0;
            return;
        }
        fragment0.mSavedFragmentState = new Bundle();
    }

    FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher0, @NonNull FragmentStore fragmentStore0, @NonNull ClassLoader classLoader0, @NonNull FragmentFactory fragmentFactory0, @NonNull FragmentState fragmentState0) {
        this.d = false;
        this.e = -1;
        this.a = fragmentLifecycleCallbacksDispatcher0;
        this.b = fragmentStore0;
        Fragment fragment0 = fragmentState0.a(fragmentFactory0, classLoader0);
        this.c = fragment0;
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragment0);
        }
    }

    void a() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        this.c.performActivityCreated(this.c.mSavedFragmentState);
        this.a.a(this.c, this.c.mSavedFragmentState, false);
    }

    void b() {
        int v = this.b.j(this.c);
        this.c.mContainer.addView(this.c.mView, v);
    }

    void c() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment0 = this.c;
        Fragment fragment1 = fragment0.mTarget;
        FragmentStateManager fragmentStateManager0 = null;
        if(fragment1 == null) {
            String s = fragment0.mTargetWho;
            if(s != null) {
                fragmentStateManager0 = this.b.o(s);
                if(fragmentStateManager0 == null) {
                    throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTargetWho + " that does not belong to this FragmentManager!");
                }
            }
        }
        else {
            FragmentStateManager fragmentStateManager1 = this.b.o(fragment1.mWho);
            if(fragmentStateManager1 == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTarget + " that does not belong to this FragmentManager!");
            }
            this.c.mTargetWho = this.c.mTarget.mWho;
            this.c.mTarget = null;
            fragmentStateManager0 = fragmentStateManager1;
        }
        if(fragmentStateManager0 != null) {
            fragmentStateManager0.m();
        }
        this.c.mHost = this.c.mFragmentManager.J0();
        this.c.mParentFragment = this.c.mFragmentManager.M0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    int d() {
        Fragment fragment0 = this.c;
        if(fragment0.mFragmentManager == null) {
            return fragment0.mState;
        }
        int v = this.e;
        switch(fragment0.mMaxState) {
            case 1: {
                break;
            }
            case 2: {
                v = Math.min(v, 5);
                break;
            }
            case 3: {
                v = Math.min(v, 1);
                break;
            }
            case 4: {
                v = Math.min(v, 0);
                break;
            }
            default: {
                v = Math.min(v, -1);
            }
        }
        Fragment fragment1 = this.c;
        if(fragment1.mFromLayout) {
            if(fragment1.mInLayout) {
                v = Math.max(this.e, 2);
                View view0 = this.c.mView;
                if(view0 != null && view0.getParent() == null) {
                    v = Math.min(v, 2);
                }
            }
            else {
                v = this.e >= 4 ? Math.min(v, 1) : Math.min(v, fragment1.mState);
            }
        }
        if(!this.c.mAdded) {
            v = Math.min(v, 1);
        }
        ViewGroup viewGroup0 = this.c.mContainer;
        LifecycleImpact specialEffectsController$Operation$LifecycleImpact0 = viewGroup0 == null ? null : SpecialEffectsController.n(viewGroup0, this.c.getParentFragmentManager()).l(this);
        if(specialEffectsController$Operation$LifecycleImpact0 == LifecycleImpact.b) {
            v = Math.min(v, 6);
        }
        else if(specialEffectsController$Operation$LifecycleImpact0 == LifecycleImpact.c) {
            v = Math.max(v, 3);
        }
        else {
            Fragment fragment2 = this.c;
            if(fragment2.mRemoving) {
                v = fragment2.isInBackStack() ? Math.min(v, 1) : Math.min(v, -1);
            }
        }
        if(this.c.mDeferStart && this.c.mState < 5) {
            v = Math.min(v, 4);
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + v + " for " + this.c);
        }
        return v;
    }

    void e() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment0 = this.c;
        if(!fragment0.mIsCreated) {
            this.a.h(fragment0, fragment0.mSavedFragmentState, false);
            this.c.performCreate(this.c.mSavedFragmentState);
            this.a.c(this.c, this.c.mSavedFragmentState, false);
            return;
        }
        fragment0.restoreChildFragmentState(fragment0.mSavedFragmentState);
        this.c.mState = 1;
    }

    void f() {
        String s;
        if(this.c.mFromLayout) {
            return;
        }
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        LayoutInflater layoutInflater0 = this.c.performGetLayoutInflater(this.c.mSavedFragmentState);
        Fragment fragment0 = this.c;
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 == null) {
            switch(fragment0.mContainerId) {
                case -1: {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                label_11:
                    viewGroup0 = (ViewGroup)fragment0.mFragmentManager.D0().c(this.c.mContainerId);
                    if(viewGroup0 == null) {
                        Fragment fragment1 = this.c;
                        if(!fragment1.mRestored) {
                            try {
                                s = "unknown";
                                s = fragment1.getResources().getResourceName(this.c.mContainerId);
                            }
                            catch(Resources.NotFoundException unused_ex) {
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.mContainerId) + " (" + s + ") for fragment " + this.c);
                        }
                    }
                    else if(!(viewGroup0 instanceof FragmentContainerView)) {
                        FragmentStrictMode.r(this.c, viewGroup0);
                    }
                    break;
                }
                case 0: {
                    viewGroup0 = null;
                    break;
                }
                default: {
                    goto label_11;
                }
            }
        }
        this.c.mContainer = viewGroup0;
        this.c.performCreateView(layoutInflater0, viewGroup0, this.c.mSavedFragmentState);
        View view0 = this.c.mView;
        if(view0 != null) {
            view0.setSaveFromParentEnabled(false);
            this.c.mView.setTag(id.fragment_container_view_tag, this.c);
            if(viewGroup0 != null) {
                this.b();
            }
            Fragment fragment2 = this.c;
            if(fragment2.mHidden) {
                fragment2.mView.setVisibility(8);
            }
            if(ViewCompat.T0(this.c.mView)) {
                ViewCompat.D1(this.c.mView);
            }
            else {
                View view1 = this.c.mView;
                view1.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    final FragmentStateManager b;

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view0) {
                        view1.removeOnAttachStateChangeListener(this);
                        ViewCompat.D1(view1);
                    }

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view0) {
                    }
                });
            }
            this.c.performViewCreated();
            this.a.m(this.c, this.c.mView, this.c.mSavedFragmentState, false);
            int v = this.c.mView.getVisibility();
            float f = this.c.mView.getAlpha();
            this.c.setPostOnViewCreatedAlpha(f);
            Fragment fragment3 = this.c;
            if(fragment3.mContainer != null && v == 0) {
                View view2 = fragment3.mView.findFocus();
                if(view2 != null) {
                    this.c.setFocusedView(view2);
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + view2 + " for Fragment " + this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    void g() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        boolean z = true;
        boolean z1 = this.c.mRemoving && !this.c.isInBackStack();
        if(z1) {
            Fragment fragment0 = this.c;
            if(!fragment0.mBeingSaved) {
                this.b.C(fragment0.mWho, null);
            }
        }
        if(!z1 && !this.b.q().q(this.c)) {
            String s = this.c.mTargetWho;
            if(s != null) {
                Fragment fragment1 = this.b.f(s);
                if(fragment1 != null && fragment1.mRetainInstance) {
                    this.c.mTarget = fragment1;
                }
            }
            this.c.mState = 0;
            return;
        }
        FragmentHostCallback fragmentHostCallback0 = this.c.mHost;
        if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            z = this.b.q().m();
        }
        else if(fragmentHostCallback0.f() instanceof Activity) {
            z = true ^ ((Activity)fragmentHostCallback0.f()).isChangingConfigurations();
        }
        if(z1 && !this.c.mBeingSaved || z) {
            this.b.q().d(this.c);
        }
        this.c.performDestroy();
        this.a.d(this.c, false);
        for(Object object0: this.b.l()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            if(fragmentStateManager0 != null) {
                Fragment fragment2 = fragmentStateManager0.k();
                if(this.c.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = this.c;
                    fragment2.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String s1 = fragment3.mTargetWho;
        if(s1 != null) {
            fragment3.mTarget = this.b.f(s1);
        }
        this.b.t(this);
    }

    void h() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment0 = this.c;
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 != null) {
            View view0 = fragment0.mView;
            if(view0 != null) {
                viewGroup0.removeView(view0);
            }
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        this.c.mContainer = null;
        this.c.mView = null;
        this.c.mViewLifecycleOwner = null;
        this.c.mViewLifecycleOwnerLiveData.r(null);
        this.c.mInLayout = false;
    }

    void i() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.performDetach();
        this.a.e(this.c, false);
        this.c.mState = -1;
        this.c.mHost = null;
        this.c.mParentFragment = null;
        this.c.mFragmentManager = null;
        if(this.c.mRemoving && !this.c.isInBackStack() || this.b.q().q(this.c)) {
            if(FragmentManager.W0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.initState();
        }
    }

    void j() {
        if(this.c.mFromLayout && this.c.mInLayout && !this.c.mPerformedCreateView) {
            if(FragmentManager.W0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            LayoutInflater layoutInflater0 = this.c.performGetLayoutInflater(this.c.mSavedFragmentState);
            this.c.performCreateView(layoutInflater0, null, this.c.mSavedFragmentState);
            View view0 = this.c.mView;
            if(view0 != null) {
                view0.setSaveFromParentEnabled(false);
                this.c.mView.setTag(id.fragment_container_view_tag, this.c);
                Fragment fragment0 = this.c;
                if(fragment0.mHidden) {
                    fragment0.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                this.a.m(this.c, this.c.mView, this.c.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    @NonNull
    Fragment k() {
        return this.c;
    }

    private boolean l(@NonNull View view0) {
        if(view0 == this.c.mView) {
            return true;
        }
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    void m() {
        if(this.d) {
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + this.k());
            }
            return;
        }
        try {
            this.d = true;
            boolean z;
            for(z = false; true; z = true) {
                int v1 = this.d();
                Fragment fragment0 = this.c;
                int v2 = fragment0.mState;
                if(v1 == v2) {
                    break;
                }
                if(v1 > v2) {
                    switch(v2 + 1) {
                        case 0: {
                            this.c();
                            break;
                        }
                        case 1: {
                            this.e();
                            break;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            break;
                        }
                        case 3: {
                            this.a();
                            break;
                        }
                        case 4: {
                            if(fragment0.mView != null) {
                                ViewGroup viewGroup0 = fragment0.mContainer;
                                if(viewGroup0 != null) {
                                    SpecialEffectsController.n(viewGroup0, fragment0.getParentFragmentManager()).b(State.b(this.c.mView.getVisibility()), this);
                                }
                            }
                            this.c.mState = 4;
                            break;
                        }
                        case 5: {
                            this.v();
                            break;
                        }
                        case 6: {
                            fragment0.mState = 6;
                            break;
                        }
                        case 7: {
                            this.p();
                        }
                    }
                }
                else {
                    switch(v2 - 1) {
                        case -1: {
                            this.i();
                            break;
                        }
                        case 0: {
                            if(fragment0.mBeingSaved && this.b.r(fragment0.mWho) == null) {
                                this.s();
                            }
                            this.g();
                            break;
                        }
                        case 1: {
                            this.h();
                            this.c.mState = 1;
                            break;
                        }
                        case 2: {
                            fragment0.mInLayout = false;
                            fragment0.mState = 2;
                            break;
                        }
                        case 3: {
                            if(FragmentManager.W0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            Fragment fragment1 = this.c;
                            if(fragment1.mBeingSaved) {
                                this.s();
                            }
                            else if(fragment1.mView != null && fragment1.mSavedViewState == null) {
                                this.t();
                            }
                            Fragment fragment2 = this.c;
                            if(fragment2.mView != null) {
                                ViewGroup viewGroup1 = fragment2.mContainer;
                                if(viewGroup1 != null) {
                                    SpecialEffectsController.n(viewGroup1, fragment2.getParentFragmentManager()).d(this);
                                }
                            }
                            this.c.mState = 3;
                            break;
                        }
                        case 4: {
                            this.w();
                            break;
                        }
                        case 5: {
                            fragment0.mState = 5;
                            break;
                        }
                        case 6: {
                            this.n();
                        }
                    }
                }
            }
            if(!z && v2 == -1 && fragment0.mRemoving && !fragment0.isInBackStack() && !this.c.mBeingSaved) {
                if(FragmentManager.W0(3)) {
                    Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                }
                this.b.q().d(this.c);
                this.b.t(this);
                if(FragmentManager.W0(3)) {
                    Log.d("FragmentManager", "initState called for fragment: " + this.c);
                }
                this.c.initState();
            }
            Fragment fragment3 = this.c;
            if(fragment3.mHiddenChanged) {
                if(fragment3.mView != null) {
                    ViewGroup viewGroup2 = fragment3.mContainer;
                    if(viewGroup2 != null) {
                        SpecialEffectsController specialEffectsController0 = SpecialEffectsController.n(viewGroup2, fragment3.getParentFragmentManager());
                        if(this.c.mHidden) {
                            specialEffectsController0.c(this);
                        }
                        else {
                            specialEffectsController0.e(this);
                        }
                    }
                }
                Fragment fragment4 = this.c;
                FragmentManager fragmentManager0 = fragment4.mFragmentManager;
                if(fragmentManager0 != null) {
                    fragmentManager0.U0(fragment4);
                }
                this.c.mHiddenChanged = false;
                this.c.mChildFragmentManager.Q();
            }
        }
        finally {
            this.d = false;
        }
    }

    void n() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    void o(@NonNull ClassLoader classLoader0) {
        Bundle bundle0 = this.c.mSavedFragmentState;
        if(bundle0 == null) {
            return;
        }
        bundle0.setClassLoader(classLoader0);
        this.c.mSavedViewState = this.c.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        this.c.mSavedViewRegistryState = this.c.mSavedFragmentState.getBundle("android:view_registry_state");
        this.c.mTargetWho = this.c.mSavedFragmentState.getString("android:target_state");
        Fragment fragment0 = this.c;
        if(fragment0.mTargetWho != null) {
            fragment0.mTargetRequestCode = fragment0.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment1 = this.c;
        Boolean boolean0 = fragment1.mSavedUserVisibleHint;
        if(boolean0 == null) {
            fragment1.mUserVisibleHint = fragment1.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        else {
            fragment1.mUserVisibleHint = boolean0.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        }
        Fragment fragment2 = this.c;
        if(!fragment2.mUserVisibleHint) {
            fragment2.mDeferStart = true;
        }
    }

    void p() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View view0 = this.c.getFocusedView();
        if(view0 != null && this.l(view0)) {
            boolean z = view0.requestFocus();
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "requestFocus: Restoring focused view " + view0 + " " + (z ? "succeeded" : "failed") + " on Fragment " + this.c + " resulting in focused view " + this.c.mView.findFocus());
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        this.c.mSavedFragmentState = null;
        this.c.mSavedViewState = null;
        this.c.mSavedViewRegistryState = null;
    }

    private Bundle q() {
        Bundle bundle0 = new Bundle();
        this.c.performSaveInstanceState(bundle0);
        this.a.j(this.c, bundle0, false);
        if(bundle0.isEmpty()) {
            bundle0 = null;
        }
        if(this.c.mView != null) {
            this.t();
        }
        if(this.c.mSavedViewState != null) {
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
        }
        if(this.c.mSavedViewRegistryState != null) {
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        if(!this.c.mUserVisibleHint) {
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle0;
    }

    @Nullable
    SavedState r() {
        if(this.c.mState > -1) {
            Bundle bundle0 = this.q();
            return bundle0 == null ? null : new SavedState(bundle0);
        }
        return null;
    }

    void s() {
        FragmentState fragmentState0 = new FragmentState(this.c);
        Fragment fragment0 = this.c;
        if(fragment0.mState <= -1 || fragmentState0.m != null) {
            fragmentState0.m = fragment0.mSavedFragmentState;
        }
        else {
            Bundle bundle0 = this.q();
            fragmentState0.m = bundle0;
            if(this.c.mTargetWho != null) {
                if(bundle0 == null) {
                    fragmentState0.m = new Bundle();
                }
                fragmentState0.m.putString("android:target_state", this.c.mTargetWho);
                int v = this.c.mTargetRequestCode;
                if(v != 0) {
                    fragmentState0.m.putInt("android:target_req_state", v);
                }
            }
        }
        this.b.C(this.c.mWho, fragmentState0);
    }

    void t() {
        if(this.c.mView == null) {
            return;
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.mView);
        }
        SparseArray sparseArray0 = new SparseArray();
        this.c.mView.saveHierarchyState(sparseArray0);
        if(sparseArray0.size() > 0) {
            this.c.mSavedViewState = sparseArray0;
        }
        Bundle bundle0 = new Bundle();
        this.c.mViewLifecycleOwner.e(bundle0);
        if(!bundle0.isEmpty()) {
            this.c.mSavedViewRegistryState = bundle0;
        }
    }

    void u(int v) {
        this.e = v;
    }

    void v() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    void w() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }
}

