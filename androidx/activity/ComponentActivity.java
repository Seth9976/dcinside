package androidx.activity;

import A3.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
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
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements FullyDrawnReporterOwner, OnBackPressedDispatcherOwner, ContextAware, ActivityResultCaller, ActivityResultRegistryOwner, OnMultiWindowModeChangedProvider, OnNewIntentProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, OnConfigurationChangedProvider, OnTrimMemoryProvider, MenuHost, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    @RequiresApi(33)
    static final class Api33Impl {
        @l
        public static final Api33Impl a;

        static {
            Api33Impl.a = new Api33Impl();
        }

        @DoNotInline
        @l
        public final OnBackInvokedDispatcher a(@l Activity activity0) {
            L.p(activity0, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = activity0.getOnBackInvokedDispatcher();
            L.o(onBackInvokedDispatcher0, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher0;
        }
    }

    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class NonConfigurationInstances {
        @m
        private Object a;
        @m
        private ViewModelStore b;

        @m
        public final Object a() {
            return this.a;
        }

        @m
        public final ViewModelStore b() {
            return this.b;
        }

        public final void c(@m Object object0) {
            this.a = object0;
        }

        public final void d(@m ViewModelStore viewModelStore0) {
            this.b = viewModelStore0;
        }
    }

    interface ReportFullyDrawnExecutor extends Executor {
        void N1();

        void h0(@l View arg1);
    }

    final class ReportFullyDrawnExecutorImpl implements ViewTreeObserver.OnDrawListener, ReportFullyDrawnExecutor, Runnable {
        private final long a;
        @m
        private Runnable b;
        private boolean c;
        final ComponentActivity d;

        public ReportFullyDrawnExecutorImpl() {
            this.a = SystemClock.uptimeMillis() + 10000L;
        }

        @Override  // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
        public void N1() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        // 检测为 Lambda 实现
        private static final void b(ReportFullyDrawnExecutorImpl componentActivity$ReportFullyDrawnExecutorImpl0) [...]

        @m
        public final Runnable c() {
            return this.b;
        }

        public final long d() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        @Override
        public void execute(@l Runnable runnable0) {
            L.p(runnable0, "runnable");
            this.b = runnable0;
            View view0 = ComponentActivity.this.getWindow().getDecorView();
            L.o(view0, "window.decorView");
            if(this.c) {
                if(L.g(Looper.myLooper(), Looper.getMainLooper())) {
                    view0.invalidate();
                    return;
                }
                view0.postInvalidate();
                return;
            }
            view0.postOnAnimation(() -> {
                L.p(this, "this$0");
                Runnable runnable0 = this.b;
                if(runnable0 != null) {
                    L.m(runnable0);
                    runnable0.run();
                    this.b = null;
                }
            });
        }

        public final void f(@m Runnable runnable0) {
            this.b = runnable0;
        }

        public final void g(boolean z) {
            this.c = z;
        }

        @Override  // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
        public void h0(@l View view0) {
            L.p(view0, "view");
            if(!this.c) {
                this.c = true;
                view0.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        @Override  // android.view.ViewTreeObserver$OnDrawListener
        public void onDraw() {
            Runnable runnable0 = this.b;
            if(runnable0 != null) {
                runnable0.run();
                this.b = null;
                if(ComponentActivity.this.getFullyDrawnReporter().e()) {
                    this.c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            }
            else if(SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @l
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    @l
    private static final Companion Companion;
    @m
    private ViewModelStore _viewModelStore;
    @l
    private final ActivityResultRegistry activityResultRegistry;
    @LayoutRes
    private int contentLayoutId;
    @l
    private final ContextAwareHelper contextAwareHelper;
    @l
    private final D defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    @l
    private final D fullyDrawnReporter$delegate;
    @l
    private final MenuHostHelper menuHostHelper;
    @l
    private final AtomicInteger nextLocalRequestCode;
    @l
    private final D onBackPressedDispatcher$delegate;
    @l
    private final CopyOnWriteArrayList onConfigurationChangedListeners;
    @l
    private final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    @l
    private final CopyOnWriteArrayList onNewIntentListeners;
    @l
    private final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    @l
    private final CopyOnWriteArrayList onTrimMemoryListeners;
    @l
    private final CopyOnWriteArrayList onUserLeaveHintListeners;
    @l
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    @l
    private final SavedStateRegistryController savedStateRegistryController;

    static {
        ComponentActivity.Companion = new Companion(null);
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(() -> {
            L.p(this, "this$0");
            this.invalidateMenu();
        });
        SavedStateRegistryController savedStateRegistryController0 = SavedStateRegistryController.d.a(this);
        this.savedStateRegistryController = savedStateRegistryController0;
        this.reportFullyDrawnExecutor = this.t0();
        this.fullyDrawnReporter$delegate = E.a(new a() {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final FullyDrawnReporter b() {
                return new FullyDrawnReporter(this.e.reportFullyDrawnExecutor, new a() {
                    final ComponentActivity e;

                    {
                        this.e = componentActivity0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.reportFullyDrawn();
                    }
                });
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ActivityResultRegistry() {
            @Override  // androidx.activity.result.ActivityResultRegistry
            public void i(int v, @l ActivityResultContract activityResultContract0, Object object0, @m ActivityOptionsCompat activityOptionsCompat0) {
                Bundle bundle2;
                L.p(activityResultContract0, "contract");
                ComponentActivity componentActivity0 = this.o;
                SynchronousResult activityResultContract$SynchronousResult0 = activityResultContract0.b(componentActivity0, object0);
                if(activityResultContract$SynchronousResult0 != null) {
                    new Handler(Looper.getMainLooper()).post(() -> {
                        L.p(this, "this$0");
                        this.f(v, activityResultContract$SynchronousResult0.a());
                    });
                    return;
                }
                Intent intent0 = activityResultContract0.a(componentActivity0, object0);
                if(intent0.getExtras() != null) {
                    Bundle bundle0 = intent0.getExtras();
                    L.m(bundle0);
                    if(bundle0.getClassLoader() == null) {
                        intent0.setExtrasClassLoader(componentActivity0.getClassLoader());
                    }
                }
                if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    Bundle bundle1 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    bundle2 = bundle1;
                }
                else {
                    bundle2 = activityOptionsCompat0 == null ? null : activityOptionsCompat0.p();
                }
                if(L.g("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intent0.getAction())) {
                    String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if(arr_s == null) {
                        arr_s = new String[0];
                    }
                    ActivityCompat.m(componentActivity0, arr_s, v);
                    return;
                }
                if(L.g("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intent0.getAction())) {
                    IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        L.m(intentSenderRequest0);
                        ActivityCompat.u(componentActivity0, intentSenderRequest0.e(), v, intentSenderRequest0.a(), intentSenderRequest0.c(), intentSenderRequest0.d(), 0, bundle2);
                    }
                    catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                        new Handler(Looper.getMainLooper()).post(() -> {
                            L.p(this, "this$0");
                            L.p(intentSender$SendIntentException0, "$e");
                            this.e(v, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", intentSender$SendIntentException0));
                        });
                    }
                    return;
                }
                ActivityCompat.t(componentActivity0, intent0, v, bundle2);
            }

            // 检测为 Lambda 实现
            private static final void s(androidx.activity.ComponentActivity.activityResultRegistry.1 componentActivity$activityResultRegistry$10, int v, SynchronousResult activityResultContract$SynchronousResult0) [...]

            // 检测为 Lambda 实现
            private static final void t(androidx.activity.ComponentActivity.activityResultRegistry.1 componentActivity$activityResultRegistry$10, int v, IntentSender.SendIntentException intentSender$SendIntentException0) [...]
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        if(this.getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        this.getLifecycle().a((LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_STOP) {
                Window window0 = this.getWindow();
                if(window0 != null) {
                    View view0 = window0.peekDecorView();
                    if(view0 != null) {
                        view0.cancelPendingInputEvents();
                    }
                }
            }
        });
        this.getLifecycle().a((LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_DESTROY) {
                this.contextAwareHelper.b();
                if(!this.isChangingConfigurations()) {
                    this.getViewModelStore().a();
                }
                this.reportFullyDrawnExecutor.N1();
            }
        });
        this.getLifecycle().a(new LifecycleEventObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                L.p(lifecycleOwner0, "source");
                L.p(lifecycle$Event0, "event");
                this.a.u0();
                this.a.getLifecycle().d(this);
            }
        });
        savedStateRegistryController0.c();
        SavedStateHandleSupport.c(this);
        if(Build.VERSION.SDK_INT <= 23) {
            this.getLifecycle().a(new ImmLeaksCleaner(this));
        }
        this.getSavedStateRegistry().j("android:support:activity-result", () -> {
            L.p(this, "this$0");
            Bundle bundle0 = new Bundle();
            this.activityResultRegistry.k(bundle0);
            return bundle0;
        });
        this.addOnContextAvailableListener((Context context0) -> {
            L.p(this, "this$0");
            L.p(context0, "it");
            Bundle bundle0 = this.getSavedStateRegistry().b("android:support:activity-result");
            if(bundle0 != null) {
                this.activityResultRegistry.j(bundle0);
            }
        });
        this.defaultViewModelProviderFactory$delegate = E.a(new a() {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final SavedStateViewModelFactory b() {
                Application application0 = this.e.getApplication();
                return this.e.getIntent() == null ? new SavedStateViewModelFactory(application0, this.e, null) : new SavedStateViewModelFactory(application0, this.e, this.e.getIntent().getExtras());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.onBackPressedDispatcher$delegate = E.a(new a() {
            final ComponentActivity e;

            {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final OnBackPressedDispatcher c() {
                OnBackPressedDispatcher onBackPressedDispatcher0 = new OnBackPressedDispatcher(() -> {
                    L.p(this.e, "this$0");
                    try {
                        this.e.super.onBackPressed();
                    }
                    catch(IllegalStateException illegalStateException0) {
                        if(!L.g(illegalStateException0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                            throw illegalStateException0;
                        }
                    }
                    catch(NullPointerException nullPointerException0) {
                        if(!L.g(nullPointerException0.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                            throw nullPointerException0;
                        }
                    }
                });
                ComponentActivity componentActivity0 = this.e;
                if(Build.VERSION.SDK_INT >= 33) {
                    if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(() -> {
                            L.p(componentActivity0, "this$0");
                            L.p(onBackPressedDispatcher0, "$dispatcher");
                            componentActivity0.r0(onBackPressedDispatcher0);
                        });
                        return onBackPressedDispatcher0;
                    }
                    componentActivity0.r0(onBackPressedDispatcher0);
                }
                return onBackPressedDispatcher0;
            }

            // 检测为 Lambda 实现
            private static final void d(ComponentActivity componentActivity0) [...]

            // 检测为 Lambda 实现
            private static final void e(ComponentActivity componentActivity0, OnBackPressedDispatcher onBackPressedDispatcher0) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.c();
            }
        });
    }

    @ContentView
    public ComponentActivity(@LayoutRes int v) {
        this.contentLayoutId = v;
    }

    @Override  // android.app.Activity
    public void addContentView(@m View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        L.o(view1, "window.decorView");
        this.reportFullyDrawnExecutor.h0(view1);
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // androidx.core.view.MenuHost
    public void addMenuProvider(@l MenuProvider menuProvider0) {
        L.p(menuProvider0, "provider");
        this.menuHostHelper.c(menuProvider0);
    }

    @Override  // androidx.core.view.MenuHost
    public void addMenuProvider(@l MenuProvider menuProvider0, @l LifecycleOwner lifecycleOwner0) {
        L.p(menuProvider0, "provider");
        L.p(lifecycleOwner0, "owner");
        this.menuHostHelper.d(menuProvider0, lifecycleOwner0);
    }

    @Override  // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@l MenuProvider menuProvider0, @l LifecycleOwner lifecycleOwner0, @l State lifecycle$State0) {
        L.p(menuProvider0, "provider");
        L.p(lifecycleOwner0, "owner");
        L.p(lifecycle$State0, "state");
        this.menuHostHelper.e(menuProvider0, lifecycleOwner0, lifecycle$State0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onConfigurationChangedListeners.add(consumer0);
    }

    @Override  // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@l OnContextAvailableListener onContextAvailableListener0) {
        L.p(onContextAvailableListener0, "listener");
        this.contextAwareHelper.a(onContextAvailableListener0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onMultiWindowModeChangedListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onNewIntentListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onPictureInPictureModeChangedListeners.add(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onTrimMemoryListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(@l Runnable runnable0) {
        L.p(runnable0, "listener");
        this.onUserLeaveHintListeners.add(runnable0);
    }

    @Override  // androidx.activity.result.ActivityResultRegistryOwner
    @l
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @l
    public CreationExtras getDefaultViewModelCreationExtras() {
        Bundle bundle0 = null;
        CreationExtras creationExtras0 = new MutableCreationExtras(null, 1, null);
        if(this.getApplication() != null) {
            Application application0 = this.getApplication();
            L.o(application0, "application");
            ((MutableCreationExtras)creationExtras0).c(AndroidViewModelFactory.i, application0);
        }
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.c, this);
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.d, this);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            bundle0 = intent0.getExtras();
        }
        if(bundle0 != null) {
            ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.e, bundle0);
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @l
    public Factory getDefaultViewModelProviderFactory() {
        return (Factory)this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override  // androidx.activity.FullyDrawnReporterOwner
    @l
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter)this.fullyDrawnReporter$delegate.getValue();
    }

    @k(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @m
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
        return componentActivity$NonConfigurationInstances0 == null ? null : componentActivity$NonConfigurationInstances0.a();
    }

    @Override  // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override  // androidx.activity.OnBackPressedDispatcherOwner
    @l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher)this.onBackPressedDispatcher$delegate.getValue();
    }

    public static void getOnBackPressedDispatcher$annotations() {
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @l
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @l
    public ViewModelStore getViewModelStore() {
        if(this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        }
        this.u0();
        ViewModelStore viewModelStore0 = this._viewModelStore;
        L.m(viewModelStore0);
        return viewModelStore0;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View view0 = this.getWindow().getDecorView();
        L.o(view0, "window.decorView");
        ViewTreeLifecycleOwner.b(view0, this);
        View view1 = this.getWindow().getDecorView();
        L.o(view1, "window.decorView");
        ViewTreeViewModelStoreOwner.b(view1, this);
        View view2 = this.getWindow().getDecorView();
        L.o(view2, "window.decorView");
        ViewTreeSavedStateRegistryOwner.b(view2, this);
        View view3 = this.getWindow().getDecorView();
        L.o(view3, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(view3, this);
        View view4 = this.getWindow().getDecorView();
        L.o(view4, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.b(view4, this);
    }

    @Override  // androidx.core.view.MenuHost
    public void invalidateMenu() {
        this.invalidateOptionsMenu();
    }

    // 检测为 Lambda 实现
    private static final void n0(ComponentActivity componentActivity0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    // 检测为 Lambda 实现
    private static final void o0(ComponentActivity componentActivity0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    @Override  // android.app.Activity
    @CallSuper
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        if(!this.activityResultRegistry.e(v, v1, intent0)) {
            super.onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @MainThread
    @k(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        this.getOnBackPressedDispatcher().p();
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        for(Object object0: this.onConfigurationChangedListeners) {
            ((Consumer)object0).accept(configuration0);
        }
    }

    @Override  // androidx.core.app.ComponentActivity
    protected void onCreate(@m Bundle bundle0) {
        this.savedStateRegistryController.d(bundle0);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle0);
        ReportFragment.b.d(this);
        int v = this.contentLayoutId;
        if(v != 0) {
            this.setContentView(v);
        }
    }

    @Override  // android.app.Activity
    public boolean onCreatePanelMenu(int v, @l Menu menu0) {
        L.p(menu0, "menu");
        if(v == 0) {
            super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            this.menuHostHelper.h(menu0, menuInflater0);
        }
        return true;
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, @l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 0 ? this.menuHostHelper.j(menuItem0) : false;
    }

    @Override  // android.app.Activity
    @CallSuper
    @k(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if(this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        for(Object object0: this.onMultiWindowModeChangedListeners) {
            ((Consumer)object0).accept(new MultiWindowModeChangedInfo(z));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @RequiresApi(api = 26)
    public void onMultiWindowModeChanged(boolean z, @l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration0);
        }
        finally {
            this.dispatchingOnMultiWindowModeChanged = false;
        }
        for(Object object0: this.onMultiWindowModeChangedListeners) {
            ((Consumer)object0).accept(new MultiWindowModeChangedInfo(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        for(Object object0: this.onNewIntentListeners) {
            ((Consumer)object0).accept(intent0);
        }
    }

    @Override  // android.app.Activity
    public void onPanelClosed(int v, @l Menu menu0) {
        L.p(menu0, "menu");
        this.menuHostHelper.i(menu0);
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    @CallSuper
    @k(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if(this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        for(Object object0: this.onPictureInPictureModeChangedListeners) {
            ((Consumer)object0).accept(new PictureInPictureModeChangedInfo(z));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @RequiresApi(api = 26)
    public void onPictureInPictureModeChanged(boolean z, @l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration0);
        }
        finally {
            this.dispatchingOnPictureInPictureModeChanged = false;
        }
        for(Object object0: this.onPictureInPictureModeChangedListeners) {
            ((Consumer)object0).accept(new PictureInPictureModeChangedInfo(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    public boolean onPreparePanel(int v, @m View view0, @l Menu menu0) {
        L.p(menu0, "menu");
        if(v == 0) {
            super.onPreparePanel(0, view0, menu0);
            this.menuHostHelper.k(menu0);
        }
        return true;
    }

    @Override  // android.app.Activity
    @CallSuper
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int v, @l String[] arr_s, @l int[] arr_v) {
        L.p(arr_s, "permissions");
        L.p(arr_v, "grantResults");
        Intent intent0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arr_v);
        if(!this.activityResultRegistry.e(v, -1, intent0) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
        }
    }

    @k(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @m
    public Object onRetainCustomNonConfigurationInstance() [...] // Inlined contents

    @Override  // android.app.Activity
    @m
    public final Object onRetainNonConfigurationInstance() {
        ViewModelStore viewModelStore0 = this._viewModelStore;
        if(viewModelStore0 == null) {
            NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
            if(componentActivity$NonConfigurationInstances0 != null) {
                viewModelStore0 = componentActivity$NonConfigurationInstances0.b();
            }
        }
        if(viewModelStore0 == null) {
            return null;
        }
        NonConfigurationInstances componentActivity$NonConfigurationInstances1 = new NonConfigurationInstances();
        componentActivity$NonConfigurationInstances1.c(null);
        componentActivity$NonConfigurationInstances1.d(viewModelStore0);
        return componentActivity$NonConfigurationInstances1;
    }

    @Override  // androidx.core.app.ComponentActivity
    @CallSuper
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        if(this.getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle0 = this.getLifecycle();
            L.n(lifecycle0, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry)lifecycle0).s(State.c);
        }
        super.onSaveInstanceState(bundle0);
        this.savedStateRegistryController.e(bundle0);
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onTrimMemory(int v) {
        super.onTrimMemory(v);
        for(Object object0: this.onTrimMemoryListeners) {
            ((Consumer)object0).accept(v);
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        for(Object object0: this.onUserLeaveHintListeners) {
            ((Runnable)object0).run();
        }
    }

    // 检测为 Lambda 实现
    private static final Bundle p0(ComponentActivity componentActivity0) [...]

    @Override  // androidx.activity.contextaware.ContextAware
    @m
    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    // 检测为 Lambda 实现
    private static final void q0(ComponentActivity componentActivity0, Context context0) [...]

    @RequiresApi(33)
    private final void r0(OnBackPressedDispatcher onBackPressedDispatcher0) {
        this.getLifecycle().a((LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(onBackPressedDispatcher0, "$dispatcher");
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_CREATE) {
                onBackPressedDispatcher0.s(Api33Impl.a.a(this));
            }
        });
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @l
    public final ActivityResultLauncher registerForActivityResult(@l ActivityResultContract activityResultContract0, @l ActivityResultCallback activityResultCallback0) {
        L.p(activityResultContract0, "contract");
        L.p(activityResultCallback0, "callback");
        return this.registerForActivityResult(activityResultContract0, this.activityResultRegistry, activityResultCallback0);
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @l
    public final ActivityResultLauncher registerForActivityResult(@l ActivityResultContract activityResultContract0, @l ActivityResultRegistry activityResultRegistry0, @l ActivityResultCallback activityResultCallback0) {
        L.p(activityResultContract0, "contract");
        L.p(activityResultRegistry0, "registry");
        L.p(activityResultCallback0, "callback");
        return activityResultRegistry0.m("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, activityResultContract0, activityResultCallback0);
    }

    @Override  // androidx.core.view.MenuHost
    public void removeMenuProvider(@l MenuProvider menuProvider0) {
        L.p(menuProvider0, "provider");
        this.menuHostHelper.l(menuProvider0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onConfigurationChangedListeners.remove(consumer0);
    }

    @Override  // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@l OnContextAvailableListener onContextAvailableListener0) {
        L.p(onContextAvailableListener0, "listener");
        this.contextAwareHelper.e(onContextAvailableListener0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onMultiWindowModeChangedListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onNewIntentListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onPictureInPictureModeChangedListeners.remove(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@l Consumer consumer0) {
        L.p(consumer0, "listener");
        this.onTrimMemoryListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(@l Runnable runnable0) {
        L.p(runnable0, "listener");
        this.onUserLeaveHintListeners.remove(runnable0);
    }

    @Override  // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if(Trace.i()) {
                Trace.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.getFullyDrawnReporter().d();
        }
        finally {
            Trace.f();
        }
    }

    // 检测为 Lambda 实现
    private static final void s0(OnBackPressedDispatcher onBackPressedDispatcher0, ComponentActivity componentActivity0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    @Override  // android.app.Activity
    public void setContentView(@LayoutRes int v) {
        this.initializeViewTreeOwners();
        View view0 = this.getWindow().getDecorView();
        L.o(view0, "window.decorView");
        this.reportFullyDrawnExecutor.h0(view0);
        super.setContentView(v);
    }

    @Override  // android.app.Activity
    public void setContentView(@m View view0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        L.o(view1, "window.decorView");
        this.reportFullyDrawnExecutor.h0(view1);
        super.setContentView(view0);
    }

    @Override  // android.app.Activity
    public void setContentView(@m View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        L.o(view1, "window.decorView");
        this.reportFullyDrawnExecutor.h0(view1);
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@l Intent intent0, int v) {
        L.p(intent0, "intent");
        super.startActivityForResult(intent0, v);
    }

    @Override  // android.app.Activity
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@l Intent intent0, int v, @m Bundle bundle0) {
        L.p(intent0, "intent");
        super.startActivityForResult(intent0, v, bundle0);
    }

    @Override  // android.app.Activity
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@l IntentSender intentSender0, int v, @m Intent intent0, int v1, int v2, int v3) throws IntentSender.SendIntentException {
        L.p(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // android.app.Activity
    @k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@l IntentSender intentSender0, int v, @m Intent intent0, int v1, int v2, int v3, @m Bundle bundle0) throws IntentSender.SendIntentException {
        L.p(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    private final ReportFullyDrawnExecutor t0() {
        return new ReportFullyDrawnExecutorImpl(this);
    }

    private final void u0() {
        if(this._viewModelStore == null) {
            NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
            if(componentActivity$NonConfigurationInstances0 != null) {
                this._viewModelStore = componentActivity$NonConfigurationInstances0.b();
            }
            if(this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    private static void v0() {
    }

    // 检测为 Lambda 实现
    private static final void w0(ComponentActivity componentActivity0) [...]
}

