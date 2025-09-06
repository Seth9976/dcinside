package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ActivityResultCaller, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    static class AnimationInfo {
        View a;
        boolean b;
        @AnimRes
        int c;
        @AnimRes
        int d;
        @AnimRes
        int e;
        @AnimRes
        int f;
        int g;
        ArrayList h;
        ArrayList i;
        Object j;
        Object k;
        Object l;
        Object m;
        Object n;
        Object o;
        Boolean p;
        Boolean q;
        SharedElementCallback r;
        SharedElementCallback s;
        float t;
        View u;
        boolean v;

        AnimationInfo() {
            this.j = null;
            this.k = Fragment.USE_DEFAULT_TRANSITION;
            this.l = null;
            this.m = Fragment.USE_DEFAULT_TRANSITION;
            this.n = null;
            this.o = Fragment.USE_DEFAULT_TRANSITION;
            this.r = null;
            this.s = null;
            this.t = 1.0f;
            this.u = null;
        }
    }

    @RequiresApi(19)
    static class Api19Impl {
        static void a(@NonNull View view0) {
            view0.cancelPendingInputEvents();
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String s, @Nullable Exception exception0) {
            super(s, exception0);
        }
    }

    static abstract class OnPreAttachedListener {
        private OnPreAttachedListener() {
        }

        OnPreAttachedListener(androidx.fragment.app.Fragment.1 fragment$10) {
        }

        abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        @NonNull
        public static final Parcelable.Creator CREATOR;
        final Bundle a;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0, null);
                }

                public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                    return new SavedState(parcel0, classLoader0);
                }

                public SavedState[] c(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$ClassLoaderCreator
                public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return this.b(parcel0, classLoader0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.c(v);
                }
            };
        }

        SavedState(Bundle bundle0) {
            this.a = bundle0;
        }

        SavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
            Bundle bundle0 = parcel0.readBundle();
            this.a = bundle0;
            if(classLoader0 != null && bundle0 != null) {
                bundle0.setClassLoader(classLoader0);
            }
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            parcel0.writeBundle(this.a);
        }
    }

    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @LayoutRes
    private int mContentLayoutId;
    Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    @Nullable
    @RestrictTo({Scope.a})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OnPreAttachedListener mSavedStateAttachListener;
    SavedStateRegistryController mSavedStateRegistryController;
    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @Nullable
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    MutableLiveData mViewLifecycleOwnerLiveData;
    @NonNull
    String mWho;

    static {
        Fragment.USE_DEFAULT_TRANSITION = new Object();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = "6862fd3f-3cc2-4149-b35d-3a0c0df453f7";
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = () -> {
            if(Fragment.this.mAnimationInfo != null && Fragment.this.b0().v) {
                if(Fragment.this.mHost == null) {
                    Fragment.this.b0().v = false;
                    return;
                }
                if(Looper.myLooper() != Fragment.this.mHost.g().getLooper()) {
                    Fragment.this.mHost.g().postAtFrontOfQueue(() -> {
                        AnimationInfo fragment$AnimationInfo0 = Fragment.this.mAnimationInfo;
                        if(fragment$AnimationInfo0 != null) {
                            fragment$AnimationInfo0.v = false;
                        }
                        if(Fragment.this.mView != null) {
                            ViewGroup viewGroup0 = Fragment.this.mContainer;
                            if(viewGroup0 != null) {
                                FragmentManager fragmentManager0 = Fragment.this.mFragmentManager;
                                if(fragmentManager0 != null) {
                                    SpecialEffectsController specialEffectsController0 = SpecialEffectsController.n(viewGroup0, fragmentManager0);
                                    specialEffectsController0.p();
                                    if(false) {
                                        Fragment.this.mHost.g().post(new Runnable() {
                                            final Fragment b;

                                            @Override
                                            public void run() {
                                                specialEffectsController0.g();
                                            }
                                        });
                                        return;
                                    }
                                    specialEffectsController0.g();
                                }
                            }
                        }
                    });
                    return;
                }
                Fragment.this.callStartTransitionListener(true);
            }

            class androidx.fragment.app.Fragment.3 implements Runnable {
                final Fragment a;

                @Override
                public void run() {
                    Fragment.this.callStartTransitionListener(false);
                }
            }

        };
        this.mMaxState = State.e;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new OnPreAttachedListener() {
            final Fragment a;

            {
                Fragment.this = fragment0;
                super(null);
            }

            @Override  // androidx.fragment.app.Fragment$OnPreAttachedListener
            void a() {
                Fragment.this.mSavedStateRegistryController.c();
                SavedStateHandleSupport.c(Fragment.this);
            }
        };
        this.e0();
    }

    @ContentView
    public Fragment(@LayoutRes int v) {
        this.mContentLayoutId = v;
    }

    private AnimationInfo b0() {
        if(this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    private int c0() {
        return this.mMaxState == State.b || this.mParentFragment == null ? this.mMaxState.ordinal() : Math.min(this.mMaxState.ordinal(), this.mParentFragment.c0());
    }

    // 检测为 Lambda 实现
    void callStartTransitionListener(boolean z) [...]

    @NonNull
    FragmentContainer createFragmentContainer() {
        return new FragmentContainer() {
            final Fragment a;

            @Override  // androidx.fragment.app.FragmentContainer
            @Nullable
            public View c(int v) {
                View view0 = Fragment.this.mView;
                if(view0 == null) {
                    throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
                }
                return view0.findViewById(v);
            }

            @Override  // androidx.fragment.app.FragmentContainer
            public boolean d() {
                return Fragment.this.mView != null;
            }
        };
    }

    @Nullable
    private Fragment d0(boolean z) {
        if(z) {
            FragmentStrictMode.m(this);
        }
        Fragment fragment0 = this.mTarget;
        if(fragment0 != null) {
            return fragment0;
        }
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            return this.mTargetWho == null ? null : fragmentManager0.o0(this.mTargetWho);
        }
        return null;
    }

    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.mFragmentId));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.mContainerId));
        printWriter0.print(" mTag=");
        printWriter0.println(this.mTag);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.mState);
        printWriter0.print(" mWho=");
        printWriter0.print(this.mWho);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.mBackStackNesting);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.mAdded);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.mRemoving);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.mFromLayout);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.mInLayout);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.mHidden);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.mDetached);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.mMenuVisible);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.mHasMenu);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.mRetainInstance);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.mUserVisibleHint);
        if(this.mFragmentManager != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.mFragmentManager);
        }
        if(this.mHost != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.mHost);
        }
        if(this.mParentFragment != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.mParentFragment);
        }
        if(this.mArguments != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.mArguments);
        }
        if(this.mSavedFragmentState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.mSavedFragmentState);
        }
        if(this.mSavedViewState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.mSavedViewState);
        }
        if(this.mSavedViewRegistryState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewRegistryState=");
            printWriter0.println(this.mSavedViewRegistryState);
        }
        Fragment fragment0 = this.d0(false);
        if(fragment0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(fragment0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.mTargetRequestCode);
        }
        printWriter0.print(s);
        printWriter0.print("mPopDirection=");
        printWriter0.println(this.getPopDirection());
        if(this.getEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getEnterAnim=");
            printWriter0.println(this.getEnterAnim());
        }
        if(this.getExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getExitAnim=");
            printWriter0.println(this.getExitAnim());
        }
        if(this.getPopEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopEnterAnim=");
            printWriter0.println(this.getPopEnterAnim());
        }
        if(this.getPopExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopExitAnim=");
            printWriter0.println(this.getPopExitAnim());
        }
        if(this.mContainer != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.mContainer);
        }
        if(this.mView != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.mView);
        }
        if(this.getAnimatingAway() != null) {
            printWriter0.print(s);
            printWriter0.print("mAnimatingAway=");
            printWriter0.println(this.getAnimatingAway());
        }
        if(this.getContext() != null) {
            LoaderManager.d(this).b(s, fileDescriptor0, printWriter0, arr_s);
        }
        printWriter0.print(s);
        printWriter0.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.e0(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    private void e0() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.a(this);
        this.mDefaultFactory = null;
        if(!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            this.g0(this.mSavedStateAttachListener);
        }
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        return super.equals(object0);
    }

    @NonNull
    private ActivityResultLauncher f0(@NonNull ActivityResultContract activityResultContract0, @NonNull Function function0, @NonNull ActivityResultCallback activityResultCallback0) {
        if(this.mState > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.g0(new OnPreAttachedListener(function0, atomicReference0, activityResultContract0, activityResultCallback0) {
            final Function a;
            final AtomicReference b;
            final ActivityResultContract c;
            final ActivityResultCallback d;
            final Fragment e;

            {
                Fragment.this = fragment0;
                this.a = function0;
                this.b = atomicReference0;
                this.c = activityResultContract0;
                this.d = activityResultCallback0;
                super(null);
            }

            @Override  // androidx.fragment.app.Fragment$OnPreAttachedListener
            void a() {
                ActivityResultLauncher activityResultLauncher0 = ((ActivityResultRegistry)this.a.apply(null)).m("fragment_68850054-5ba9-44d3-9e54-45162a61ce11_rq#0", Fragment.this, this.c, this.d);
                this.b.set(activityResultLauncher0);
            }
        });
        return new ActivityResultLauncher() {
            final Fragment c;

            @Override  // androidx.activity.result.ActivityResultLauncher
            @NonNull
            public ActivityResultContract a() {
                return activityResultContract0;
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void c(Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
                ActivityResultLauncher activityResultLauncher0 = (ActivityResultLauncher)atomicReference0.get();
                if(activityResultLauncher0 == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                activityResultLauncher0.c(object0, activityOptionsCompat0);
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void d() {
                ActivityResultLauncher activityResultLauncher0 = (ActivityResultLauncher)atomicReference0.getAndSet(null);
                if(activityResultLauncher0 != null) {
                    activityResultLauncher0.d();
                }
            }
        };
    }

    // 去混淆评级： 低(20)
    @Nullable
    Fragment findFragmentByWho(@NonNull String s) {
        return s.equals(this.mWho) ? this : this.mChildFragmentManager.t0(s);
    }

    private void g0(@NonNull OnPreAttachedListener fragment$OnPreAttachedListener0) {
        if(this.mState >= 0) {
            fragment$OnPreAttachedListener0.a();
            return;
        }
        this.mOnPreAttachedListeners.add(fragment$OnPreAttachedListener0);
    }

    @NonNull
    String generateActivityResultKey() [...] // 潜在的解密器

    @Nullable
    public final FragmentActivity getActivity() {
        return this.mHost == null ? null : ((FragmentActivity)this.mHost.e());
    }

    public boolean getAllowEnterTransitionOverlap() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 != null) {
            return fragment$AnimationInfo0.q == null ? true : fragment$AnimationInfo0.q.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 != null) {
            return fragment$AnimationInfo0.p == null ? true : fragment$AnimationInfo0.p.booleanValue();
        }
        return true;
    }

    View getAnimatingAway() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.a;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    @Nullable
    public Context getContext() {
        return this.mHost == null ? null : this.mHost.f();
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application0;
        for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                break;
            }
        }
        if(application0 == null && FragmentManager.W0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        CreationExtras creationExtras0 = new MutableCreationExtras();
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).c(AndroidViewModelFactory.i, application0);
        }
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.c, this);
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.d, this);
        if(this.getArguments() != null) {
            ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.e, this.getArguments());
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public Factory getDefaultViewModelProviderFactory() {
        Application application0;
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.mDefaultFactory == null) {
            for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Application) {
                    application0 = (Application)context0;
                    break;
                }
            }
            if(application0 == null && FragmentManager.W0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application0, this, this.getArguments());
        }
        return this.mDefaultFactory;
    }

    @AnimRes
    int getEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.c;
    }

    @Nullable
    public Object getEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.j;
    }

    SharedElementCallback getEnterTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.r;
    }

    @AnimRes
    int getExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.d;
    }

    @Nullable
    public Object getExitTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.l;
    }

    SharedElementCallback getExitTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.s;
    }

    View getFocusedView() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.u;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        return this.mLayoutInflater == null ? this.performGetLayoutInflater(null) : this.mLayoutInflater;
    }

    @NonNull
    @RestrictTo({Scope.c})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = fragmentHostCallback0.j();
        LayoutInflaterCompat.d(layoutInflater0, this.mChildFragmentManager.K0());
        return layoutInflater0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.d(this);
    }

    int getNextTransition() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.g;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 == null) {
            throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
        }
        return fragmentManager0;
    }

    boolean getPopDirection() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.b;
    }

    @AnimRes
    int getPopEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.e;
    }

    @AnimRes
    int getPopExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.f;
    }

    float getPostOnViewCreatedAlpha() {
        return this.mAnimationInfo == null ? 1.0f : this.mAnimationInfo.t;
    }

    @Nullable
    public Object getReenterTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.m == Fragment.USE_DEFAULT_TRANSITION ? this.getExitTransition() : fragment$AnimationInfo0.m;
    }

    @NonNull
    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.k(this);
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.k == Fragment.USE_DEFAULT_TRANSITION ? this.getEnterTransition() : fragment$AnimationInfo0.k;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.n;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 == null) {
            return null;
        }
        return fragment$AnimationInfo0.o == Fragment.USE_DEFAULT_TRANSITION ? this.getSharedElementEnterTransition() : fragment$AnimationInfo0.o;
    }

    @NonNull
    ArrayList getSharedElementSourceNames() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 != null) {
            ArrayList arrayList0 = fragment$AnimationInfo0.h;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    @NonNull
    ArrayList getSharedElementTargetNames() {
        AnimationInfo fragment$AnimationInfo0 = this.mAnimationInfo;
        if(fragment$AnimationInfo0 != null) {
            ArrayList arrayList0 = fragment$AnimationInfo0.i;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    @NonNull
    public final String getString(@StringRes int v) {
        return this.getResources().getString(v);
    }

    @NonNull
    public final String getString(@StringRes int v, @Nullable Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return this.d0(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.l(this);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @MainThread
    @NonNull
    public LifecycleOwner getViewLifecycleOwner() {
        LifecycleOwner lifecycleOwner0 = this.mViewLifecycleOwner;
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        return lifecycleOwner0;
    }

    @NonNull
    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.c0() == State.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.R0(this);
    }

    private void h0() {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if(this.mView != null) {
            this.restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.c})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        this.e0();
        this.mPreviousWho = this.mWho;
        this.mWho = "fe419c34-01e9-4286-87eb-1f52ed7d63e8";
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context0, @NonNull String s) {
        return Fragment.instantiate(context0, s, null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context0, @NonNull String s, @Nullable Bundle bundle0) {
        try {
            Fragment fragment0 = (Fragment)FragmentFactory.d(context0.getClassLoader(), s).getConstructor(null).newInstance(null);
            if(bundle0 != null) {
                bundle0.setClassLoader(fragment0.getClass().getClassLoader());
                fragment0.setArguments(bundle0);
                return fragment0;
            }
            return fragment0;
        }
        catch(java.lang.InstantiationException instantiationException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    // 去混淆评级： 低(30)
    public final boolean isHidden() {
        return this.mHidden || this.mFragmentManager != null && this.mFragmentManager.Z0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    // 去混淆评级： 低(30)
    @RestrictTo({Scope.c})
    public final boolean isMenuVisible() {
        return this.mMenuVisible && (this.mFragmentManager == null || this.mFragmentManager.a1(this.mParentFragment));
    }

    boolean isPostponed() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        return this.mFragmentManager == null ? false : this.mFragmentManager.d1();
    }

    // 去混淆评级： 低(20)
    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0);
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.n1();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + v + " resultCode: " + v1 + " data: " + intent0);
        }
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity0) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.e();
        if(activity0 != null) {
            this.mCalled = false;
            this.onAttach(activity0);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment0) {
    }

    @Override  // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem0) [...] // Inlined contents

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle0) {
        this.mCalled = true;
        this.restoreChildFragmentState(bundle0);
        if(!this.mChildFragmentManager.c1(1)) {
            this.mChildFragmentManager.J();
        }
    }

    @MainThread
    @Nullable
    public Animation onCreateAnimation(int v, boolean z, int v1) [...] // Inlined contents

    @MainThread
    @Nullable
    public Animator onCreateAnimator(int v, boolean z, int v1) [...] // Inlined contents

    @Override  // android.view.View$OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu0, @NonNull View view0, @Nullable ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
    }

    @MainThread
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        return this.mContentLayoutId == 0 ? null : layoutInflater0.inflate(this.mContentLayoutId, viewGroup0, false);
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity0, @NonNull AttributeSet attributeSet0, @Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context0, @NonNull AttributeSet attributeSet0, @Nullable Bundle bundle0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.e();
        if(activity0 != null) {
            this.mCalled = false;
            this.onInflate(activity0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem0) {
        return false;
    }

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu0) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu0) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int v, @NonNull String[] arr_s, @NonNull int[] arr_v) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle0) {
        this.mChildFragmentManager.n1();
        this.mState = 3;
        this.mCalled = false;
        this.onActivityCreated(bundle0);
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    void performAttach() {
        for(Object object0: this.mOnPreAttachedListeners) {
            ((OnPreAttachedListener)object0).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.s(this.mHost, this.createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        this.onAttach(this.mHost.f());
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
        }
        this.mFragmentManager.P(this);
        this.mChildFragmentManager.G();
    }

    void performConfigurationChanged(@NonNull Configuration configuration0) {
        this.onConfigurationChanged(configuration0);
    }

    boolean performContextItemSelected(@NonNull MenuItem menuItem0) {
        return this.mHidden ? false : this.mChildFragmentManager.I(menuItem0);
    }

    void performCreate(Bundle bundle0) {
        this.mChildFragmentManager.n1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new LifecycleEventObserver() {
            final Fragment a;

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
                if(lifecycle$Event0 == Event.ON_STOP) {
                    View view0 = Fragment.this.mView;
                    if(view0 != null) {
                        Api19Impl.a(view0);
                    }
                }
            }
        });
        this.mSavedStateRegistryController.d(bundle0);
        this.onCreate(bundle0);
        this.mIsCreated = true;
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                this.onCreateOptionsMenu(menu0, menuInflater0);
                z = true;
            }
            return z | this.mChildFragmentManager.K(menu0, menuInflater0);
        }
        return false;
    }

    void performCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        this.mChildFragmentManager.n1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, this.getViewModelStore());
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.mView = view0;
        if(view0 != null) {
            this.mViewLifecycleOwner.b();
            ViewTreeLifecycleOwner.b(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.b(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
            return;
        }
        if(this.mViewLifecycleOwner.c()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    void performDestroy() {
        this.mChildFragmentManager.L();
        this.mLifecycleRegistry.l(Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.M();
        if(this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().b(State.c)) {
            this.mViewLifecycleOwner.a(Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        LoaderManager.d(this).h();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
    }

    @NonNull
    LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle0) {
        LayoutInflater layoutInflater0 = this.onGetLayoutInflater(bundle0);
        this.mLayoutInflater = layoutInflater0;
        return layoutInflater0;
    }

    void performLowMemory() {
        this.onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z) {
    }

    boolean performOptionsItemSelected(@NonNull MenuItem menuItem0) {
        if(!this.mHidden) {
            return !this.mHasMenu || !this.mMenuVisible || !this.onOptionsItemSelected(menuItem0) ? this.mChildFragmentManager.R(menuItem0) : true;
        }
        return false;
    }

    void performOptionsMenuClosed(@NonNull Menu menu0) {
        if(!this.mHidden) {
            this.mChildFragmentManager.S(menu0);
        }
    }

    void performPause() {
        this.mChildFragmentManager.U();
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.l(Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        this.onPause();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
    }

    boolean performPrepareOptionsMenu(@NonNull Menu menu0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                this.onPrepareOptionsMenu(menu0);
                z = true;
            }
            return z | this.mChildFragmentManager.W(menu0);
        }
        return false;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean z = this.mFragmentManager.b1(this);
        if(this.mIsPrimaryNavigationFragment == null || this.mIsPrimaryNavigationFragment.booleanValue() != z) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(z);
            this.onPrimaryNavigationFragmentChanged(z);
            this.mChildFragmentManager.X();
        }
    }

    void performResume() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.j0(true);
        this.mState = 7;
        this.mCalled = false;
        this.onResume();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    void performSaveInstanceState(Bundle bundle0) {
        this.onSaveInstanceState(bundle0);
        this.mSavedStateRegistryController.e(bundle0);
        Bundle bundle1 = this.mChildFragmentManager.Q1();
        if(bundle1 != null) {
            bundle0.putParcelable("android:support:fragments", bundle1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.j0(true);
        this.mState = 5;
        this.mCalled = false;
        this.onStart();
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    void performStop() {
        this.mChildFragmentManager.b0();
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_STOP);
        }
        this.mLifecycleRegistry.l(Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        this.onStop();
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void performViewCreated() {
        this.onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.c0();
    }

    public void postponeEnterTransition() {
        this.b0().v = true;
    }

    public final void postponeEnterTransition(long v, @NonNull TimeUnit timeUnit0) {
        this.b0().v = true;
        FragmentManager fragmentManager0 = this.mFragmentManager;
        Handler handler0 = fragmentManager0 == null ? new Handler(Looper.getMainLooper()) : fragmentManager0.J0().g();
        handler0.removeCallbacks(this.mPostponedDurationRunnable);
        handler0.postDelayed(this.mPostponedDurationRunnable, timeUnit0.toMillis(v));
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @MainThread
    @NonNull
    public final ActivityResultLauncher registerForActivityResult(@NonNull ActivityResultContract activityResultContract0, @NonNull ActivityResultCallback activityResultCallback0) {
        return this.f0(activityResultContract0, new Function() {
            final Fragment a;

            public ActivityResultRegistry a(Void void0) {
                FragmentHostCallback fragmentHostCallback0 = Fragment.this.mHost;
                return fragmentHostCallback0 instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner)fragmentHostCallback0).getActivityResultRegistry() : Fragment.this.requireActivity().getActivityResultRegistry();
            }

            @Override  // androidx.arch.core.util.Function
            public Object apply(Object object0) {
                return this.a(((Void)object0));
            }
        }, activityResultCallback0);
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @MainThread
    @NonNull
    public final ActivityResultLauncher registerForActivityResult(@NonNull ActivityResultContract activityResultContract0, @NonNull ActivityResultRegistry activityResultRegistry0, @NonNull ActivityResultCallback activityResultCallback0) {
        return this.f0(activityResultContract0, new Function() {
            final Fragment b;

            public ActivityResultRegistry a(Void void0) {
                return activityResultRegistry0;
            }

            @Override  // androidx.arch.core.util.Function
            public Object apply(Object object0) {
                return this.a(((Void)object0));
            }
        }, activityResultCallback0);
    }

    public void registerForContextMenu(@NonNull View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] arr_s, int v) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.getParentFragmentManager().j1(this, arr_s, v);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
        }
        return fragmentActivity0;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        return bundle0;
    }

    @NonNull
    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a context.");
        }
        return context0;
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a host.");
        }
        return object0;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment fragment0 = this.getParentFragment();
        if(fragment0 == null) {
            throw this.getContext() == null ? new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host") : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return fragment0;
    }

    @NonNull
    public final View requireView() {
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
        return view0;
    }

    void restoreChildFragmentState(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            if(parcelable0 != null) {
                this.mChildFragmentManager.M1(parcelable0);
                this.mChildFragmentManager.J();
            }
        }
    }

    final void restoreViewState(Bundle bundle0) {
        SparseArray sparseArray0 = this.mSavedViewState;
        if(sparseArray0 != null) {
            this.mView.restoreHierarchyState(sparseArray0);
            this.mSavedViewState = null;
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle0);
        if(!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.b0().q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.b0().p = Boolean.valueOf(z);
    }

    void setAnimations(@AnimRes int v, @AnimRes int v1, @AnimRes int v2, @AnimRes int v3) {
        if(this.mAnimationInfo == null && v == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
            return;
        }
        this.b0().c = v;
        this.b0().d = v1;
        this.b0().e = v2;
        this.b0().f = v3;
    }

    public void setArguments(@Nullable Bundle bundle0) {
        if(this.mFragmentManager != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle0;
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        this.b0().r = sharedElementCallback0;
    }

    public void setEnterTransition(@Nullable Object object0) {
        this.b0().j = object0;
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        this.b0().s = sharedElementCallback0;
    }

    public void setExitTransition(@Nullable Object object0) {
        this.b0().l = object0;
    }

    void setFocusedView(View view0) {
        this.b0().u = view0;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if(this.mHasMenu != z) {
            this.mHasMenu = z;
            if(this.isAdded() && !this.isHidden()) {
                this.mHost.s();
            }
        }
    }

    public void setInitialSavedState(@Nullable SavedState fragment$SavedState0) {
        Bundle bundle0;
        if(this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if(fragment$SavedState0 == null) {
            bundle0 = null;
        }
        else {
            bundle0 = fragment$SavedState0.a;
            if(bundle0 == null) {
                bundle0 = null;
            }
        }
        this.mSavedFragmentState = bundle0;
    }

    public void setMenuVisibility(boolean z) {
        if(this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if(this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.s();
            }
        }
    }

    void setNextTransition(int v) {
        if(this.mAnimationInfo == null && v == 0) {
            return;
        }
        this.b0();
        this.mAnimationInfo.g = v;
    }

    void setPopDirection(boolean z) {
        if(this.mAnimationInfo == null) {
            return;
        }
        this.b0().b = z;
    }

    void setPostOnViewCreatedAlpha(float f) {
        this.b0().t = f;
    }

    public void setReenterTransition(@Nullable Object object0) {
        this.b0().m = object0;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.o(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            if(z) {
                fragmentManager0.q(this);
                return;
            }
            fragmentManager0.G1(this);
            return;
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(@Nullable Object object0) {
        this.b0().k = object0;
    }

    public void setSharedElementEnterTransition(@Nullable Object object0) {
        this.b0().n = object0;
    }

    void setSharedElementNames(@Nullable ArrayList arrayList0, @Nullable ArrayList arrayList1) {
        this.b0();
        this.mAnimationInfo.h = arrayList0;
        this.mAnimationInfo.i = arrayList1;
    }

    public void setSharedElementReturnTransition(@Nullable Object object0) {
        this.b0().o = object0;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment0, int v) {
        if(fragment0 != null) {
            FragmentStrictMode.p(this, fragment0, v);
        }
        FragmentManager fragmentManager0 = fragment0 == null ? null : fragment0.mFragmentManager;
        if(this.mFragmentManager != null && fragmentManager0 != null && this.mFragmentManager != fragmentManager0) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " must share the same FragmentManager to be set as a target fragment");
        }
        for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.d0(false)) {
            if(fragment1.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if(fragment0 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        }
        else if(this.mFragmentManager == null || fragment0.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment0;
        }
        else {
            this.mTargetWho = fragment0.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.q(this, z);
        if(!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            this.mFragmentManager.q1(this.mFragmentManager.D(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if(this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String s) {
        return this.mHost == null ? false : this.mHost.o(s);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0, @Nullable Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.q(this, intent0, -1, bundle0);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v, @Nullable Bundle bundle0) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.getParentFragmentManager().k1(this, intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + v + " IntentSender: " + intentSender0 + " fillInIntent: " + intent0 + " options: " + bundle0);
        }
        this.getParentFragmentManager().l1(this, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    // 检测为 Lambda 实现
    public void startPostponedEnterTransition() [...]

    @Override
    @NonNull
    public String toString() [...] // 潜在的解密器

    public void unregisterForContextMenu(@NonNull View view0) {
        view0.setOnCreateContextMenuListener(null);
    }

    class androidx.fragment.app.Fragment.1 implements Runnable {
        final Fragment a;

        @Override
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

}

