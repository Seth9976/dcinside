package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder.SupportParentable;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class AppCompatActivity extends FragmentActivity implements DelegateProvider, AppCompatCallback, SupportParentable {
    private AppCompatDelegate f;
    private Resources g;
    private static final String h = "androidx:appcompat";

    public AppCompatActivity() {
        this.J0();
    }

    @ContentView
    public AppCompatActivity(@LayoutRes int v) {
        super(v);
        this.J0();
    }

    @NonNull
    public AppCompatDelegate H0() {
        if(this.f == null) {
            this.f = AppCompatDelegate.n(this, this);
        }
        return this.f;
    }

    @Nullable
    public ActionBar I0() {
        return this.H0().C();
    }

    private void J0() {
        this.getSavedStateRegistry().j("androidx:appcompat", new SavedStateProvider() {
            final AppCompatActivity a;

            @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
            @NonNull
            public Bundle a() {
                Bundle bundle0 = new Bundle();
                AppCompatActivity.this.H0().Q(bundle0);
                return bundle0;
            }
        });
        this.addOnContextAvailableListener(new OnContextAvailableListener() {
            final AppCompatActivity a;

            @Override  // androidx.activity.contextaware.OnContextAvailableListener
            public void a(@NonNull Context context0) {
                AppCompatDelegate appCompatDelegate0 = AppCompatActivity.this.H0();
                appCompatDelegate0.E();
                appCompatDelegate0.M(AppCompatActivity.this.getSavedStateRegistry().b("androidx:appcompat"));
            }
        });
    }

    private void K0() {
        ViewTreeLifecycleOwner.b(this.getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(this.getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(this.getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(this.getWindow().getDecorView(), this);
    }

    public void L0(@NonNull TaskStackBuilder taskStackBuilder0) {
        taskStackBuilder0.c(this);
    }

    protected void M0(@NonNull LocaleListCompat localeListCompat0) {
    }

    protected void N0(int v) {
    }

    public void O0(@NonNull TaskStackBuilder taskStackBuilder0) {
    }

    @Deprecated
    public void P0() {
    }

    public boolean Q0() {
        Intent intent0 = this.g();
        if(intent0 != null) {
            if(this.a1(intent0)) {
                TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.h(this);
                this.L0(taskStackBuilder0);
                taskStackBuilder0.r();
                try {
                    ActivityCompat.c(this);
                }
                catch(IllegalStateException unused_ex) {
                    this.finish();
                }
                return true;
            }
            this.Y0(intent0);
            return true;
        }
        return false;
    }

    private boolean R0(KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT < 26 && !keyEvent0.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState()) && keyEvent0.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent0.getKeyCode())) {
            Window window0 = this.getWindow();
            return window0 != null && window0.getDecorView() != null && window0.getDecorView().dispatchKeyShortcutEvent(keyEvent0);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void S(@NonNull ActionMode actionMode0) {
    }

    public void S0(@Nullable Toolbar toolbar0) {
        this.H0().h0(toolbar0);
    }

    @Deprecated
    public void T0(int v) {
    }

    @Deprecated
    public void U0(boolean z) {
    }

    @Deprecated
    public void V0(boolean z) {
    }

    @Deprecated
    public void W0(boolean z) {
    }

    @Nullable
    public ActionMode X0(@NonNull Callback actionMode$Callback0) {
        return this.H0().k0(actionMode$Callback0);
    }

    public void Y0(@NonNull Intent intent0) {
        NavUtils.g(this, intent0);
    }

    public boolean Z0(int v) {
        return this.H0().V(v);
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$DelegateProvider
    @Nullable
    public Delegate a() {
        return this.H0().w();
    }

    public boolean a1(@NonNull Intent intent0) {
        return NavUtils.h(this, intent0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.K0();
        this.H0().f(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    protected void attachBaseContext(Context context0) {
        super.attachBaseContext(this.H0().m(context0));
    }

    @Override  // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBar0 = this.I0();
        if(this.getWindow().hasFeature(0) && (actionBar0 == null || !actionBar0.k())) {
            super.closeOptionsMenu();
        }
    }

    @Override  // androidx.core.app.ComponentActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        ActionBar actionBar0 = this.I0();
        return v != 82 || actionBar0 == null || !actionBar0.K(keyEvent0) ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    @Override  // android.app.Activity
    public View findViewById(@IdRes int v) {
        return this.H0().s(v);
    }

    @Override  // androidx.core.app.TaskStackBuilder$SupportParentable
    @Nullable
    public Intent g() {
        return NavUtils.a(this);
    }

    @Override  // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return this.H0().z();
    }

    @Override  // android.view.ContextThemeWrapper
    public Resources getResources() {
        return this.g == null ? super.getResources() : this.g;
    }

    @Override  // android.app.Activity
    public void invalidateOptionsMenu() {
        this.H0().F();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.H0().L(configuration0);
        if(this.g != null) {
            Configuration configuration1 = super.getResources().getConfiguration();
            DisplayMetrics displayMetrics0 = super.getResources().getDisplayMetrics();
            this.g.updateConfiguration(configuration1, displayMetrics0);
        }
    }

    @Override  // android.app.Activity
    public void onContentChanged() {
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onDestroy() {
        super.onDestroy();
        this.H0().N();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Activity
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.R0(keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public final boolean onMenuItemSelected(int v, @NonNull MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        ActionBar actionBar0 = this.I0();
        return menuItem0.getItemId() != 0x102002C || actionBar0 == null || (actionBar0.o() & 4) == 0 ? false : this.Q0();
    }

    @Override  // android.app.Activity
    public boolean onMenuOpened(int v, Menu menu0) {
        return super.onMenuOpened(v, menu0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onPanelClosed(int v, @NonNull Menu menu0) {
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    protected void onPostCreate(@Nullable Bundle bundle0) {
        super.onPostCreate(bundle0);
        this.H0().O(bundle0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPostResume() {
        super.onPostResume();
        this.H0().P();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onStart() {
        super.onStart();
        this.H0().R();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onStop() {
        super.onStop();
        this.H0().S();
    }

    @Override  // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        this.H0().j0(charSequence0);
    }

    @Override  // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBar0 = this.I0();
        if(this.getWindow().hasFeature(0) && (actionBar0 == null || !actionBar0.L())) {
            super.openOptionsMenu();
        }
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void r(@NonNull ActionMode actionMode0) {
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode s(@NonNull Callback actionMode$Callback0) {
        return null;
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(@LayoutRes int v) {
        this.K0();
        this.H0().Z(v);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0) {
        this.K0();
        this.H0().a0(view0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.K0();
        this.H0().b0(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    public void setTheme(@StyleRes int v) {
        super.setTheme(v);
        this.H0().i0(v);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        this.H0().F();
    }
}

