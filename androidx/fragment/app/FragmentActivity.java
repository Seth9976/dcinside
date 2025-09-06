package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    class HostCallbacks extends FragmentHostCallback implements OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnConfigurationChangedProvider, OnTrimMemoryProvider, MenuHost, FragmentOnAttachListener, ViewModelStoreOwner, SavedStateRegistryOwner {
        final FragmentActivity f;

        @Override  // androidx.fragment.app.FragmentOnAttachListener
        public void a(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        @Override  // androidx.core.view.MenuHost
        public void addMenuProvider(@NonNull MenuProvider menuProvider0) {
            FragmentActivity.this.addMenuProvider(menuProvider0);
        }

        @Override  // androidx.core.view.MenuHost
        public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0) {
            FragmentActivity.this.addMenuProvider(menuProvider0, lifecycleOwner0);
        }

        @Override  // androidx.core.view.MenuHost
        public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0, @NonNull State lifecycle$State0) {
            FragmentActivity.this.addMenuProvider(menuProvider0, lifecycleOwner0, lifecycle$State0);
        }

        @Override  // androidx.core.content.OnConfigurationChangedProvider
        public void addOnConfigurationChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer0);
        }

        @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
        public void addOnMultiWindowModeChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer0);
        }

        @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void addOnPictureInPictureModeChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer0);
        }

        @Override  // androidx.core.content.OnTrimMemoryProvider
        public void addOnTrimMemoryListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer0);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        @Nullable
        public View c(int v) {
            return FragmentActivity.this.findViewById(v);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean d() {
            Window window0 = FragmentActivity.this.getWindow();
            return window0 != null && window0.peekDecorView() != null;
        }

        @Override  // androidx.activity.result.ActivityResultRegistryOwner
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override  // androidx.lifecycle.LifecycleOwner
        @NonNull
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override  // androidx.activity.OnBackPressedDispatcherOwner
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override  // androidx.savedstate.SavedStateRegistryOwner
        @NonNull
        public SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override  // androidx.lifecycle.ViewModelStoreOwner
        @NonNull
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void h(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
            FragmentActivity.this.dump(s, fileDescriptor0, printWriter0, arr_s);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public Object i() {
            return this.t();
        }

        @Override  // androidx.core.view.MenuHost
        public void invalidateMenu() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        @NonNull
        public LayoutInflater j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public int k() {
            Window window0 = FragmentActivity.this.getWindow();
            return window0 == null ? 0 : window0.getAttributes().windowAnimations;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean l() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean n(@NonNull Fragment fragment0) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public boolean o(@NonNull String s) {
            return ActivityCompat.s(FragmentActivity.this, s);
        }

        @Override  // androidx.core.view.MenuHost
        public void removeMenuProvider(@NonNull MenuProvider menuProvider0) {
            FragmentActivity.this.removeMenuProvider(menuProvider0);
        }

        @Override  // androidx.core.content.OnConfigurationChangedProvider
        public void removeOnConfigurationChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer0);
        }

        @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
        public void removeOnMultiWindowModeChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer0);
        }

        @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void removeOnPictureInPictureModeChangedListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer0);
        }

        @Override  // androidx.core.content.OnTrimMemoryProvider
        public void removeOnTrimMemoryListener(@NonNull Consumer consumer0) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer0);
        }

        @Override  // androidx.fragment.app.FragmentHostCallback
        public void s() {
            this.invalidateMenu();
        }

        public FragmentActivity t() {
            return FragmentActivity.this;
        }
    }

    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = FragmentController.b(new HostCallbacks(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        this.B0();
    }

    @ContentView
    public FragmentActivity(@LayoutRes int v) {
        super(v);
        this.mFragments = FragmentController.b(new HostCallbacks(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        this.B0();
    }

    private void B0() {
        this.getSavedStateRegistry().j("android:support:lifecycle", () -> {
            this.markFragmentsCreated();
            this.mFragmentLifecycleRegistry.l(Event.ON_STOP);
            return new Bundle();
        });
        this.addOnConfigurationChangedListener((Configuration configuration0) -> this.mFragments.F());
        this.addOnNewIntentListener((Intent intent0) -> this.mFragments.F());
        this.addOnContextAvailableListener((Context context0) -> this.mFragments.a(null));
    }

    // 检测为 Lambda 实现
    private Bundle C0() [...]

    // 检测为 Lambda 实现
    private void D0(Configuration configuration0) [...]

    // 检测为 Lambda 实现
    private void E0(Intent intent0) [...]

    // 检测为 Lambda 实现
    private void F0(Context context0) [...]

    private static boolean G0(FragmentManager fragmentManager0, State lifecycle$State0) {
        boolean z = false;
        for(Object object0: fragmentManager0.I0()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                if(fragment0.getHost() != null) {
                    z |= FragmentActivity.G0(fragment0.getChildFragmentManager(), lifecycle$State0);
                }
                if(fragment0.mViewLifecycleOwner != null && fragment0.mViewLifecycleOwner.getLifecycle().b().b(State.d)) {
                    fragment0.mViewLifecycleOwner.f(lifecycle$State0);
                    z = true;
                }
                if(fragment0.mLifecycleRegistry.b().b(State.d)) {
                    fragment0.mLifecycleRegistry.s(lifecycle$State0);
                    z = true;
                }
            }
        }
        return z;
    }

    @Nullable
    final View dispatchFragmentsOnCreateView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.mFragments.G(view0, s, context0, attributeSet0);
    }

    @Override  // android.app.Activity
    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        if(!this.shouldDumpInternalState(arr_s)) {
            return;
        }
        printWriter0.print(s);
        printWriter0.print("Local FragmentActivity ");
        printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter0.println(" State:");
        printWriter0.print(s + "  ");
        printWriter0.print("mCreated=");
        printWriter0.print(this.mCreated);
        printWriter0.print(" mResumed=");
        printWriter0.print(this.mResumed);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.mStopped);
        if(this.getApplication() != null) {
            LoaderManager.d(this).b(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
        this.mFragments.D().e0(s, fileDescriptor0, printWriter0, arr_s);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.d(this);
    }

    void markFragmentsCreated() {
        while(FragmentActivity.G0(this.getSupportFragmentManager(), State.c)) {
        }
    }

    @Override  // androidx.activity.ComponentActivity
    @CallSuper
    protected void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        this.mFragments.F();
        super.onActivityResult(v, v1, intent0);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment0) {
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.mFragmentLifecycleRegistry.l(Event.ON_CREATE);
        this.mFragments.f();
    }

    @Override  // android.app.Activity
    @Nullable
    public View onCreateView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        View view1 = this.dispatchFragmentsOnCreateView(view0, s, context0, attributeSet0);
        return view1 == null ? super.onCreateView(view0, s, context0, attributeSet0) : view1;
    }

    @Override  // android.app.Activity
    @Nullable
    public View onCreateView(@NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        View view0 = this.dispatchFragmentsOnCreateView(null, s, context0, attributeSet0);
        return view0 == null ? super.onCreateView(s, context0, attributeSet0) : view0;
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.l(Event.ON_DESTROY);
    }

    @Override  // androidx.activity.ComponentActivity
    public boolean onMenuItemSelected(int v, @NonNull MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 6 ? this.mFragments.e(menuItem0) : false;
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.l(Event.ON_PAUSE);
    }

    @Override  // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }

    @Override  // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    @CallSuper
    public void onRequestPermissionsResult(int v, @NonNull String[] arr_s, @NonNull int[] arr_v) {
        this.mFragments.F();
        super.onRequestPermissionsResult(v, arr_s, arr_v);
    }

    @Override  // android.app.Activity
    protected void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.l(Event.ON_RESUME);
        this.mFragments.r();
    }

    @Override  // android.app.Activity
    protected void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if(!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.l(Event.ON_START);
        this.mFragments.s();
    }

    @Override  // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.F();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.l(Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        ActivityCompat.o(this, sharedElementCallback0);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        ActivityCompat.p(this, sharedElementCallback0);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) Intent intent0, int v) {
        this.startActivityFromFragment(fragment0, intent0, v, null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) Intent intent0, int v, @Nullable Bundle bundle0) {
        if(v == -1) {
            ActivityCompat.t(this, intent0, -1, bundle0);
            return;
        }
        fragment0.startActivityForResult(intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        if(v == -1) {
            ActivityCompat.u(this, intentSender0, -1, intent0, v1, v2, v3, bundle0);
            return;
        }
        fragment0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.d(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.j(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.v(this);
    }

    @Override  // androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int v) {
    }
}

