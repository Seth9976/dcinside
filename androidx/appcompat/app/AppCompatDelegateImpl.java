package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat.ThemeCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import j..util.Objects;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.a})
class AppCompatDelegateImpl extends AppCompatDelegate implements LayoutInflater.Factory2, Callback {
    class ActionBarDrawableToggleImpl implements Delegate {
        final AppCompatDelegateImpl a;

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Drawable a() {
            TintTypedArray tintTypedArray0 = TintTypedArray.F(this.d(), null, new int[]{attr.homeAsUpIndicator});
            Drawable drawable0 = tintTypedArray0.h(0);
            tintTypedArray0.I();
            return drawable0;
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void b(Drawable drawable0, int v) {
            ActionBar actionBar0 = AppCompatDelegateImpl.this.C();
            if(actionBar0 != null) {
                actionBar0.k0(drawable0);
                actionBar0.h0(v);
            }
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void c(int v) {
            ActionBar actionBar0 = AppCompatDelegateImpl.this.C();
            if(actionBar0 != null) {
                actionBar0.h0(v);
            }
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Context d() {
            return AppCompatDelegateImpl.this.I0();
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public boolean e() {
            ActionBar actionBar0 = AppCompatDelegateImpl.this.C();
            return actionBar0 != null && (actionBar0.o() & 4) != 0;
        }
    }

    interface ActionBarMenuCallback {
        boolean a(int arg1);

        @Nullable
        View onCreatePanelView(int arg1);
    }

    final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final AppCompatDelegateImpl a;

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
            AppCompatDelegateImpl.this.u0(menuBuilder0);
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public boolean d(@NonNull MenuBuilder menuBuilder0) {
            Window.Callback window$Callback0 = AppCompatDelegateImpl.this.R0();
            if(window$Callback0 != null) {
                window$Callback0.onMenuOpened(108, menuBuilder0);
            }
            return true;
        }
    }

    class ActionModeCallbackWrapperV9 implements androidx.appcompat.view.ActionMode.Callback {
        private androidx.appcompat.view.ActionMode.Callback a;
        final AppCompatDelegateImpl b;

        public ActionModeCallbackWrapperV9(androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
            this.a = actionMode$Callback0;
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean a(ActionMode actionMode0, Menu menu0) {
            return this.a.a(actionMode0, menu0);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean b(ActionMode actionMode0, MenuItem menuItem0) {
            return this.a.b(actionMode0, menuItem0);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean c(ActionMode actionMode0, Menu menu0) {
            ViewCompat.D1(AppCompatDelegateImpl.this.O);
            return this.a.c(actionMode0, menu0);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public void d(ActionMode actionMode0) {
            this.a.d(actionMode0);
            AppCompatDelegateImpl appCompatDelegateImpl0 = AppCompatDelegateImpl.this;
            if(appCompatDelegateImpl0.J != null) {
                appCompatDelegateImpl0.y.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.K);
            }
            AppCompatDelegateImpl appCompatDelegateImpl1 = AppCompatDelegateImpl.this;
            if(appCompatDelegateImpl1.I != null) {
                appCompatDelegateImpl1.D0();
                AppCompatDelegateImpl.this.L = ViewCompat.h(AppCompatDelegateImpl.this.I).b(0.0f);
                AppCompatDelegateImpl.this.L.u(new ViewPropertyAnimatorListenerAdapter() {
                    final ActionModeCallbackWrapperV9 a;

                    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
                    public void b(View view0) {
                        AppCompatDelegateImpl.this.I.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl0 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow0 = appCompatDelegateImpl0.J;
                        if(popupWindow0 != null) {
                            popupWindow0.dismiss();
                        }
                        else if(appCompatDelegateImpl0.I.getParent() instanceof View) {
                            ViewCompat.D1(((View)AppCompatDelegateImpl.this.I.getParent()));
                        }
                        AppCompatDelegateImpl.this.I.t();
                        AppCompatDelegateImpl.this.L.u(null);
                        AppCompatDelegateImpl.this.L = null;
                        ViewCompat.D1(AppCompatDelegateImpl.this.O);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback0 = appCompatDelegateImpl2.A;
            if(appCompatCallback0 != null) {
                appCompatCallback0.S(appCompatDelegateImpl2.H);
            }
            AppCompatDelegateImpl.this.H = null;
            ViewCompat.D1(AppCompatDelegateImpl.this.O);
            AppCompatDelegateImpl.this.x1();
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static boolean a(PowerManager powerManager0) {
            return powerManager0.isPowerSaveMode();
        }

        @DoNotInline
        static String b(Locale locale0) {
            return locale0.toLanguageTag();
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static void a(@NonNull Configuration configuration0, @NonNull Configuration configuration1, @NonNull Configuration configuration2) {
            LocaleList localeList0 = configuration0.getLocales();
            LocaleList localeList1 = configuration1.getLocales();
            if(!localeList0.equals(localeList1)) {
                configuration2.setLocales(localeList1);
                configuration2.locale = configuration1.locale;
            }
        }

        @DoNotInline
        static LocaleListCompat b(Configuration configuration0) {
            return LocaleListCompat.c(configuration0.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void c(LocaleListCompat localeListCompat0) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat0.m()));
        }

        @DoNotInline
        static void d(Configuration configuration0, LocaleListCompat localeListCompat0) {
            configuration0.setLocales(LocaleList.forLanguageTags(localeListCompat0.m()));
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static void a(@NonNull Configuration configuration0, @NonNull Configuration configuration1, @NonNull Configuration configuration2) {
            if((configuration0.colorMode & 3) != (configuration1.colorMode & 3)) {
                configuration2.colorMode |= configuration1.colorMode & 3;
            }
            if((configuration0.colorMode & 12) != (configuration1.colorMode & 12)) {
                configuration2.colorMode |= configuration1.colorMode & 12;
            }
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        @DoNotInline
        static OnBackInvokedDispatcher a(Activity activity0) {
            return activity0.getOnBackInvokedDispatcher();
        }

        @DoNotInline
        static OnBackInvokedCallback b(Object object0, AppCompatDelegateImpl appCompatDelegateImpl0) {
            Objects.requireNonNull(appCompatDelegateImpl0);
            OnBackInvokedCallback onBackInvokedCallback0 = new q(appCompatDelegateImpl0);
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, onBackInvokedCallback0);
            return onBackInvokedCallback0;
        }

        @DoNotInline
        static void c(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    class AppCompatWindowCallback extends WindowCallbackWrapper {
        private ActionBarMenuCallback b;
        private boolean c;
        private boolean d;
        private boolean e;
        final AppCompatDelegateImpl f;

        AppCompatWindowCallback(Window.Callback window$Callback0) {
            super(window$Callback0);
        }

        public boolean b(Window.Callback window$Callback0, KeyEvent keyEvent0) {
            try {
                this.d = true;
                boolean z = window$Callback0.dispatchKeyEvent(keyEvent0);
                this.d = false;
                return z;
            }
            catch(Throwable throwable0) {
                this.d = false;
                throw throwable0;
            }
        }

        public void c(Window.Callback window$Callback0) {
            try {
                this.c = true;
                window$Callback0.onContentChanged();
                this.c = false;
            }
            catch(Throwable throwable0) {
                this.c = false;
                throw throwable0;
            }
        }

        public void d(Window.Callback window$Callback0, int v, Menu menu0) {
            try {
                this.e = true;
                window$Callback0.onPanelClosed(v, menu0);
                this.e = false;
            }
            catch(Throwable throwable0) {
                this.e = false;
                throw throwable0;
            }
        }

        // 去混淆评级： 低(40)
        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
            return this.d ? this.a().dispatchKeyEvent(keyEvent0) : AppCompatDelegateImpl.this.B0(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
            if(!super.dispatchKeyShortcutEvent(keyEvent0)) {
                int v = keyEvent0.getKeyCode();
                return AppCompatDelegateImpl.this.b1(v, keyEvent0);
            }
            return true;
        }

        void e(@Nullable ActionBarMenuCallback appCompatDelegateImpl$ActionBarMenuCallback0) {
            this.b = appCompatDelegateImpl$ActionBarMenuCallback0;
        }

        final android.view.ActionMode f(ActionMode.Callback actionMode$Callback0) {
            CallbackWrapper supportActionModeWrapper$CallbackWrapper0 = new CallbackWrapper(AppCompatDelegateImpl.this.x, actionMode$Callback0);
            ActionMode actionMode0 = AppCompatDelegateImpl.this.k0(supportActionModeWrapper$CallbackWrapper0);
            return actionMode0 == null ? null : supportActionModeWrapper$CallbackWrapper0.e(actionMode0);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public void onContentChanged() {
            if(this.c) {
                this.a().onContentChanged();
            }
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public boolean onCreatePanelMenu(int v, Menu menu0) {
            return v != 0 || menu0 instanceof MenuBuilder ? super.onCreatePanelMenu(v, menu0) : false;
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public View onCreatePanelView(int v) {
            ActionBarMenuCallback appCompatDelegateImpl$ActionBarMenuCallback0 = this.b;
            if(appCompatDelegateImpl$ActionBarMenuCallback0 != null) {
                View view0 = appCompatDelegateImpl$ActionBarMenuCallback0.onCreatePanelView(v);
                return view0 == null ? super.onCreatePanelView(v) : view0;
            }
            return super.onCreatePanelView(v);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public boolean onMenuOpened(int v, Menu menu0) {
            super.onMenuOpened(v, menu0);
            AppCompatDelegateImpl.this.e1(v);
            return true;
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public void onPanelClosed(int v, Menu menu0) {
            if(this.e) {
                this.a().onPanelClosed(v, menu0);
                return;
            }
            super.onPanelClosed(v, menu0);
            AppCompatDelegateImpl.this.f1(v);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public boolean onPreparePanel(int v, View view0, Menu menu0) {
            MenuBuilder menuBuilder0 = menu0 instanceof MenuBuilder ? ((MenuBuilder)menu0) : null;
            boolean z = true;
            if(v == 0 && menuBuilder0 == null) {
                return false;
            }
            if(menuBuilder0 != null) {
                menuBuilder0.j0(true);
            }
            if(this.b == null || !this.b.a(v)) {
                z = super.onPreparePanel(v, view0, menu0);
            }
            if(menuBuilder0 != null) {
                menuBuilder0.j0(false);
            }
            return z;
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = AppCompatDelegateImpl.this.O0(0, true);
            if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                MenuBuilder menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.j;
                if(menuBuilder0 != null) {
                    super.onProvideKeyboardShortcuts(list0, menuBuilder0, v);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list0, menu0, v);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
            if(Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return AppCompatDelegateImpl.this.I() ? this.f(actionMode$Callback0) : super.onWindowStartingActionMode(actionMode$Callback0);
        }

        @Override  // androidx.appcompat.view.WindowCallbackWrapper
        @RequiresApi(23)
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
            return !AppCompatDelegateImpl.this.I() || v != 0 ? super.onWindowStartingActionMode(actionMode$Callback0, v) : this.f(actionMode$Callback0);
        }
    }

    class AutoBatteryNightModeManager extends AutoNightModeManager {
        private final PowerManager c;
        final AppCompatDelegateImpl d;

        AutoBatteryNightModeManager(@NonNull Context context0) {
            this.c = (PowerManager)context0.getApplicationContext().getSystemService("power");
        }

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        IntentFilter b() {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        public int c() {
            return Api21Impl.a(this.c) ? 2 : 1;
        }

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    @RestrictTo({Scope.a})
    @VisibleForTesting
    abstract class AutoNightModeManager {
        private BroadcastReceiver a;
        final AppCompatDelegateImpl b;

        void a() {
            BroadcastReceiver broadcastReceiver0 = this.a;
            if(broadcastReceiver0 != null) {
                try {
                    AppCompatDelegateImpl.this.x.unregisterReceiver(broadcastReceiver0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                this.a = null;
            }
        }

        @Nullable
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.a != null;
        }

        abstract void e();

        void f() {
            this.a();
            IntentFilter intentFilter0 = this.b();
            if(intentFilter0 != null && intentFilter0.countActions() != 0) {
                if(this.a == null) {
                    this.a = new BroadcastReceiver() {
                        final AutoNightModeManager a;

                        @Override  // android.content.BroadcastReceiver
                        public void onReceive(Context context0, Intent intent0) {
                            AutoNightModeManager.this.e();
                        }
                    };
                }
                AppCompatDelegateImpl.this.x.registerReceiver(this.a, intentFilter0);
            }
        }
    }

    class AutoTimeNightModeManager extends AutoNightModeManager {
        private final TwilightManager c;
        final AppCompatDelegateImpl d;

        AutoTimeNightModeManager(@NonNull TwilightManager twilightManager0) {
            this.c = twilightManager0;
        }

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        IntentFilter b() {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.TIME_SET");
            intentFilter0.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter0.addAction("android.intent.action.TIME_TICK");
            return intentFilter0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    class ListMenuDecorView extends ContentFrameLayout {
        final AppCompatDelegateImpl i;

        public ListMenuDecorView(Context context0) {
            super(context0);
        }

        private boolean c(int v, int v1) {
            return v < -5 || v1 < -5 || v > this.getWidth() + 5 || v1 > this.getHeight() + 5;
        }

        // 去混淆评级： 低(20)
        @Override  // android.view.ViewGroup
        public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
            return AppCompatDelegateImpl.this.B0(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
        }

        @Override  // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
            if(motionEvent0.getAction() == 0 && this.c(((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                AppCompatDelegateImpl.this.w0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent0);
        }

        @Override  // android.view.View
        public void setBackgroundResource(int v) {
            this.setBackgroundDrawable(AppCompatResources.b(this.getContext(), v));
        }
    }

    public static final class PanelFeatureState {
        @SuppressLint({"BanParcelableUsage"})
        static class SavedState implements Parcelable {
            public static final Parcelable.Creator CREATOR;
            int a;
            boolean b;
            Bundle c;

            static {
                SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                    public SavedState a(Parcel parcel0) {
                        return SavedState.a(parcel0, null);
                    }

                    public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                        return SavedState.a(parcel0, classLoader0);
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

            static SavedState a(Parcel parcel0, ClassLoader classLoader0) {
                SavedState appCompatDelegateImpl$PanelFeatureState$SavedState0 = new SavedState();
                appCompatDelegateImpl$PanelFeatureState$SavedState0.a = parcel0.readInt();
                boolean z = parcel0.readInt() == 1;
                appCompatDelegateImpl$PanelFeatureState$SavedState0.b = z;
                if(z) {
                    appCompatDelegateImpl$PanelFeatureState$SavedState0.c = parcel0.readBundle(classLoader0);
                }
                return appCompatDelegateImpl$PanelFeatureState$SavedState0;
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(Parcel parcel0, int v) {
                parcel0.writeInt(this.a);
                parcel0.writeInt(((int)this.b));
                if(this.b) {
                    parcel0.writeBundle(this.c);
                }
            }
        }

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        MenuBuilder j;
        ListMenuPresenter k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        boolean s;
        Bundle t;
        Bundle u;

        PanelFeatureState(int v) {
            this.a = v;
            this.q = false;
        }

        void a() {
            MenuBuilder menuBuilder0 = this.j;
            if(menuBuilder0 != null) {
                Bundle bundle0 = this.t;
                if(bundle0 != null) {
                    menuBuilder0.V(bundle0);
                    this.t = null;
                }
            }
        }

        public void b() {
            MenuBuilder menuBuilder0 = this.j;
            if(menuBuilder0 != null) {
                menuBuilder0.T(this.k);
            }
            this.k = null;
        }

        MenuView c(androidx.appcompat.view.menu.MenuPresenter.Callback menuPresenter$Callback0) {
            if(this.j == null) {
                return null;
            }
            if(this.k == null) {
                ListMenuPresenter listMenuPresenter0 = new ListMenuPresenter(this.l, layout.abc_list_menu_item_layout);
                this.k = listMenuPresenter0;
                listMenuPresenter0.k(menuPresenter$Callback0);
                this.j.b(this.k);
            }
            return this.k.m(this.g);
        }

        public boolean d() {
            if(this.h == null) {
                return false;
            }
            return this.i == null ? this.k.b().getCount() > 0 : true;
        }

        void e(Parcelable parcelable0) {
            this.a = ((SavedState)parcelable0).a;
            this.s = ((SavedState)parcelable0).b;
            this.t = ((SavedState)parcelable0).c;
            this.h = null;
            this.g = null;
        }

        Parcelable f() {
            Parcelable parcelable0 = new SavedState();
            parcelable0.a = this.a;
            parcelable0.b = this.o;
            if(this.j != null) {
                Bundle bundle0 = new Bundle();
                parcelable0.c = bundle0;
                this.j.X(bundle0);
            }
            return parcelable0;
        }

        void g(MenuBuilder menuBuilder0) {
            MenuBuilder menuBuilder1 = this.j;
            if(menuBuilder0 == menuBuilder1) {
                return;
            }
            if(menuBuilder1 != null) {
                menuBuilder1.T(this.k);
            }
            this.j = menuBuilder0;
            if(menuBuilder0 != null) {
                ListMenuPresenter listMenuPresenter0 = this.k;
                if(listMenuPresenter0 != null) {
                    menuBuilder0.b(listMenuPresenter0);
                }
            }
        }

        void h(Context context0) {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = context0.getResources().newTheme();
            resources$Theme0.setTo(context0.getTheme());
            resources$Theme0.resolveAttribute(attr.actionBarPopupTheme, typedValue0, true);
            int v = typedValue0.resourceId;
            if(v != 0) {
                resources$Theme0.applyStyle(v, true);
            }
            resources$Theme0.resolveAttribute(attr.panelMenuListTheme, typedValue0, true);
            int v1 = typedValue0.resourceId;
            if(v1 == 0) {
                resources$Theme0.applyStyle(style.Theme_AppCompat_CompactMenu, true);
            }
            else {
                resources$Theme0.applyStyle(v1, true);
            }
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, 0);
            contextThemeWrapper0.getTheme().setTo(resources$Theme0);
            this.l = contextThemeWrapper0;
            TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(styleable.AppCompatTheme);
            this.b = typedArray0.getResourceId(styleable.AppCompatTheme_panelBackground, 0);
            this.f = typedArray0.getResourceId(styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArray0.recycle();
        }
    }

    final class PanelMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final AppCompatDelegateImpl a;

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
            MenuBuilder menuBuilder1 = menuBuilder0.G();
            boolean z1 = menuBuilder1 != menuBuilder0;
            AppCompatDelegateImpl appCompatDelegateImpl0 = AppCompatDelegateImpl.this;
            if(z1) {
                menuBuilder0 = menuBuilder1;
            }
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = appCompatDelegateImpl0.G0(menuBuilder0);
            if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                if(z1) {
                    AppCompatDelegateImpl.this.t0(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0, menuBuilder1);
                    AppCompatDelegateImpl.this.x0(appCompatDelegateImpl$PanelFeatureState0, true);
                    return;
                }
                AppCompatDelegateImpl.this.x0(appCompatDelegateImpl$PanelFeatureState0, z);
            }
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public boolean d(@NonNull MenuBuilder menuBuilder0) {
            if(menuBuilder0 == menuBuilder0.G()) {
                AppCompatDelegateImpl appCompatDelegateImpl0 = AppCompatDelegateImpl.this;
                if(appCompatDelegateImpl0.Z) {
                    Window.Callback window$Callback0 = appCompatDelegateImpl0.R0();
                    if(window$Callback0 != null && !AppCompatDelegateImpl.this.W8) {
                        window$Callback0.onMenuOpened(108, menuBuilder0);
                    }
                }
            }
            return true;
        }
    }

    final AppCompatCallback A;
    ActionBar B;
    MenuInflater C;
    private CharSequence D;
    private DecorContentParent E;
    private ActionMenuPresenterCallback F;
    private PanelMenuPresenterCallback G;
    ActionMode H;
    ActionBarContextView I;
    PopupWindow J;
    Runnable K;
    ViewPropertyAnimatorCompat L;
    private boolean M;
    boolean M8;
    private boolean N;
    boolean N8;
    ViewGroup O;
    boolean O8;
    private TextView P;
    boolean P8;
    private View Q;
    private boolean Q8;
    private PanelFeatureState[] R8;
    private PanelFeatureState S8;
    private boolean T8;
    private boolean U8;
    private boolean V8;
    boolean W8;
    private boolean X;
    private Configuration X8;
    private boolean Y;
    private int Y8;
    boolean Z;
    private int Z8;
    private int a9;
    private boolean b9;
    private AutoNightModeManager c9;
    private AutoNightModeManager d9;
    boolean e9;
    int f9;
    private final Runnable g9;
    private boolean h9;
    private Rect i9;
    private Rect j9;
    private AppCompatViewInflater k9;
    private LayoutIncludeDetector l9;
    private OnBackInvokedDispatcher m9;
    private OnBackInvokedCallback n9;
    private static final SimpleArrayMap o9 = null;
    private static final boolean p9 = false;
    private static final int[] q9 = null;
    private static final boolean r9 = false;
    private static boolean s9 = false;
    static final String t9 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    final Object w;
    final Context x;
    Window y;
    private AppCompatWindowCallback z;

    static {
        AppCompatDelegateImpl.o9 = new SimpleArrayMap();
        AppCompatDelegateImpl.p9 = false;
        AppCompatDelegateImpl.q9 = new int[]{0x1010054};
        AppCompatDelegateImpl.r9 = true;
    }

    AppCompatDelegateImpl(Activity activity0, AppCompatCallback appCompatCallback0) {
        this(activity0, null, appCompatCallback0, activity0);
    }

    AppCompatDelegateImpl(Dialog dialog0, AppCompatCallback appCompatCallback0) {
        this(dialog0.getContext(), dialog0.getWindow(), appCompatCallback0, dialog0);
    }

    AppCompatDelegateImpl(Context context0, Activity activity0, AppCompatCallback appCompatCallback0) {
        this(context0, null, appCompatCallback0, activity0);
    }

    AppCompatDelegateImpl(Context context0, Window window0, AppCompatCallback appCompatCallback0) {
        this(context0, window0, appCompatCallback0, context0);
    }

    private AppCompatDelegateImpl(Context context0, Window window0, AppCompatCallback appCompatCallback0, Object object0) {
        this.L = null;
        this.M = true;
        this.Y8 = -100;
        this.g9 = new Runnable() {
            final AppCompatDelegateImpl a;

            @Override
            public void run() {
                AppCompatDelegateImpl appCompatDelegateImpl0 = AppCompatDelegateImpl.this;
                if((appCompatDelegateImpl0.f9 & 1) != 0) {
                    appCompatDelegateImpl0.C0(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl1 = AppCompatDelegateImpl.this;
                if((appCompatDelegateImpl1.f9 & 0x1000) != 0) {
                    appCompatDelegateImpl1.C0(108);
                }
                AppCompatDelegateImpl.this.e9 = false;
                AppCompatDelegateImpl.this.f9 = 0;
            }
        };
        this.x = context0;
        this.A = appCompatCallback0;
        this.w = object0;
        if(this.Y8 == -100 && object0 instanceof Dialog) {
            AppCompatActivity appCompatActivity0 = this.u1();
            if(appCompatActivity0 != null) {
                this.Y8 = appCompatActivity0.H0().x();
            }
        }
        if(this.Y8 == -100) {
            SimpleArrayMap simpleArrayMap0 = AppCompatDelegateImpl.o9;
            Integer integer0 = (Integer)simpleArrayMap0.get(object0.getClass().getName());
            if(integer0 != null) {
                this.Y8 = (int)integer0;
                simpleArrayMap0.remove(object0.getClass().getName());
            }
        }
        if(window0 != null) {
            this.q0(window0);
        }
        AppCompatDrawableManager.i();
    }

    void A0() {
        DecorContentParent decorContentParent0 = this.E;
        if(decorContentParent0 != null) {
            decorContentParent0.q();
        }
        if(this.J != null) {
            this.y.getDecorView().removeCallbacks(this.K);
            if(this.J.isShowing()) {
                try {
                    this.J.dismiss();
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            this.J = null;
        }
        this.D0();
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, false);
        if(appCompatDelegateImpl$PanelFeatureState0 != null) {
            MenuBuilder menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.j;
            if(menuBuilder0 != null) {
                menuBuilder0.close();
            }
        }
    }

    private void A1(View view0) {
        view0.setBackgroundColor(((ViewCompat.H0(view0) & 0x2000) == 0 ? ContextCompat.getColor(this.x, color.abc_decor_view_status_guard) : ContextCompat.getColor(this.x, color.abc_decor_view_status_guard_light)));
    }

    boolean B0(KeyEvent keyEvent0) {
        if(this.w instanceof Component || this.w instanceof AppCompatDialog) {
            View view0 = this.y.getDecorView();
            if(view0 != null && KeyEventDispatcher.d(view0, keyEvent0)) {
                return true;
            }
        }
        if(keyEvent0.getKeyCode() == 82 && this.z.b(this.y.getCallback(), keyEvent0)) {
            return true;
        }
        int v = keyEvent0.getKeyCode();
        return keyEvent0.getAction() == 0 ? this.Z0(v, keyEvent0) : this.c1(v, keyEvent0);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public ActionBar C() {
        this.S0();
        return this.B;
    }

    void C0(int v) {
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(v, true);
        if(appCompatDelegateImpl$PanelFeatureState0.j != null) {
            Bundle bundle0 = new Bundle();
            appCompatDelegateImpl$PanelFeatureState0.j.W(bundle0);
            if(bundle0.size() > 0) {
                appCompatDelegateImpl$PanelFeatureState0.u = bundle0;
            }
            appCompatDelegateImpl$PanelFeatureState0.j.n0();
            appCompatDelegateImpl$PanelFeatureState0.j.clear();
        }
        appCompatDelegateImpl$PanelFeatureState0.r = true;
        appCompatDelegateImpl$PanelFeatureState0.q = true;
        if((v == 0 || v == 108) && this.E != null) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.O0(0, false);
            if(appCompatDelegateImpl$PanelFeatureState1 != null) {
                appCompatDelegateImpl$PanelFeatureState1.m = false;
                this.k1(appCompatDelegateImpl$PanelFeatureState1, null);
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public boolean D(int v) {
        switch(this.m1(v)) {
            case 1: {
                return this.P8 || this.y.hasFeature(v);
            }
            case 2: {
                return this.X || this.y.hasFeature(v);
            }
            case 5: {
                return this.Y || this.y.hasFeature(v);
            }
            case 10: {
                return this.N8 || this.y.hasFeature(v);
            }
            case 108: {
                return this.Z || this.y.hasFeature(v);
            }
            case 109: {
                return this.M8 || this.y.hasFeature(v);
            }
            default: {
                return this.y.hasFeature(v);
            }
        }
    }

    void D0() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.L;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.d();
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void E() {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.x);
        if(layoutInflater0.getFactory() == null) {
            LayoutInflaterCompat.d(layoutInflater0, this);
            return;
        }
        if(!(layoutInflater0.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
        }
    }

    private void E0() {
        if(!this.N) {
            this.O = this.z0();
            CharSequence charSequence0 = this.Q0();
            if(!TextUtils.isEmpty(charSequence0)) {
                DecorContentParent decorContentParent0 = this.E;
                if(decorContentParent0 != null) {
                    decorContentParent0.setWindowTitle(charSequence0);
                }
                else if(this.i1() == null) {
                    TextView textView0 = this.P;
                    if(textView0 != null) {
                        textView0.setText(charSequence0);
                    }
                }
                else {
                    this.i1().A0(charSequence0);
                }
            }
            this.p0();
            this.N = true;
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, false);
            if(!this.W8 && (appCompatDelegateImpl$PanelFeatureState0 == null || appCompatDelegateImpl$PanelFeatureState0.j == null)) {
                this.W0(108);
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void F() {
        if(this.i1() != null && !this.C().C()) {
            this.W0(0);
        }
    }

    private void F0() {
        if(this.y == null) {
            Object object0 = this.w;
            if(object0 instanceof Activity) {
                this.q0(((Activity)object0).getWindow());
            }
        }
        if(this.y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    PanelFeatureState G0(Menu menu0) {
        PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.R8;
        int v1 = arr_appCompatDelegateImpl$PanelFeatureState == null ? 0 : arr_appCompatDelegateImpl$PanelFeatureState.length;
        for(int v = 0; v < v1; ++v) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v];
            if(appCompatDelegateImpl$PanelFeatureState0 != null && appCompatDelegateImpl$PanelFeatureState0.j == menu0) {
                return appCompatDelegateImpl$PanelFeatureState0;
            }
        }
        return null;
    }

    @NonNull
    private static Configuration H0(@NonNull Configuration configuration0, @Nullable Configuration configuration1) {
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if(configuration1 != null && configuration0.diff(configuration1) != 0) {
            float f = configuration1.fontScale;
            if(configuration0.fontScale != f) {
                configuration2.fontScale = f;
            }
            int v = configuration1.mcc;
            if(configuration0.mcc != v) {
                configuration2.mcc = v;
            }
            int v1 = configuration1.mnc;
            if(configuration0.mnc != v1) {
                configuration2.mnc = v1;
            }
            int v2 = Build.VERSION.SDK_INT;
            if(v2 >= 24) {
                Api24Impl.a(configuration0, configuration1, configuration2);
            }
            else if(!ObjectsCompat.a(configuration0.locale, configuration1.locale)) {
                configuration2.locale = configuration1.locale;
            }
            int v3 = configuration1.touchscreen;
            if(configuration0.touchscreen != v3) {
                configuration2.touchscreen = v3;
            }
            int v4 = configuration1.keyboard;
            if(configuration0.keyboard != v4) {
                configuration2.keyboard = v4;
            }
            int v5 = configuration1.keyboardHidden;
            if(configuration0.keyboardHidden != v5) {
                configuration2.keyboardHidden = v5;
            }
            int v6 = configuration1.navigation;
            if(configuration0.navigation != v6) {
                configuration2.navigation = v6;
            }
            int v7 = configuration1.navigationHidden;
            if(configuration0.navigationHidden != v7) {
                configuration2.navigationHidden = v7;
            }
            int v8 = configuration1.orientation;
            if(configuration0.orientation != v8) {
                configuration2.orientation = v8;
            }
            int v9 = configuration1.screenLayout;
            if((configuration0.screenLayout & 15) != (v9 & 15)) {
                configuration2.screenLayout |= v9 & 15;
            }
            int v10 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0xC0) != (v10 & 0xC0)) {
                configuration2.screenLayout |= v10 & 0xC0;
            }
            int v11 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0x30) != (v11 & 0x30)) {
                configuration2.screenLayout |= v11 & 0x30;
            }
            int v12 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0x300) != (v12 & 0x300)) {
                configuration2.screenLayout |= v12 & 0x300;
            }
            if(v2 >= 26) {
                Api26Impl.a(configuration0, configuration1, configuration2);
            }
            int v13 = configuration1.uiMode;
            if((configuration0.uiMode & 15) != (v13 & 15)) {
                configuration2.uiMode |= v13 & 15;
            }
            int v14 = configuration1.uiMode;
            if((configuration0.uiMode & 0x30) != (v14 & 0x30)) {
                configuration2.uiMode |= v14 & 0x30;
            }
            int v15 = configuration1.screenWidthDp;
            if(configuration0.screenWidthDp != v15) {
                configuration2.screenWidthDp = v15;
            }
            int v16 = configuration1.screenHeightDp;
            if(configuration0.screenHeightDp != v16) {
                configuration2.screenHeightDp = v16;
            }
            int v17 = configuration1.smallestScreenWidthDp;
            if(configuration0.smallestScreenWidthDp != v17) {
                configuration2.smallestScreenWidthDp = v17;
            }
            int v18 = configuration1.densityDpi;
            if(configuration0.densityDpi != v18) {
                configuration2.densityDpi = v18;
            }
        }
        return configuration2;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public boolean I() {
        return this.M;
    }

    final Context I0() {
        ActionBar actionBar0 = this.C();
        Context context0 = actionBar0 == null ? null : actionBar0.z();
        return context0 == null ? this.x : context0;
    }

    private int J0(Context context0) {
        int v1;
        if(!this.b9 && this.w instanceof Activity) {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return 0;
            }
            try {
                int v = Build.VERSION.SDK_INT;
                if(v >= 29) {
                    v1 = 0x100C0000;
                }
                else {
                    v1 = v < 24 ? 0 : 0xC0000;
                }
                ActivityInfo activityInfo0 = packageManager0.getActivityInfo(new ComponentName(context0, this.w.getClass()), v1);
                if(activityInfo0 != null) {
                    this.a9 = activityInfo0.configChanges;
                }
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", packageManager$NameNotFoundException0);
                this.a9 = 0;
            }
        }
        this.b9 = true;
        return this.a9;
    }

    private AutoNightModeManager K0(@NonNull Context context0) {
        if(this.d9 == null) {
            this.d9 = new AutoBatteryNightModeManager(this, context0);
        }
        return this.d9;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void L(Configuration configuration0) {
        if(this.Z && this.N) {
            ActionBar actionBar0 = this.C();
            if(actionBar0 != null) {
                actionBar0.H(configuration0);
            }
        }
        AppCompatDrawableManager.b().g(this.x);
        this.X8 = new Configuration(this.x.getResources().getConfiguration());
        this.o0(false, false);
    }

    @NonNull
    @RestrictTo({Scope.a})
    @VisibleForTesting
    final AutoNightModeManager L0() {
        return this.M0(this.x);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void M(Bundle bundle0) {
        this.U8 = true;
        this.n0(false);
        this.F0();
        Object object0 = this.w;
        if(object0 instanceof Activity) {
            try {
                String s = null;
                s = NavUtils.d(((Activity)object0));
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(s != null) {
                ActionBar actionBar0 = this.i1();
                if(actionBar0 == null) {
                    this.h9 = true;
                }
                else {
                    actionBar0.W(true);
                }
            }
            AppCompatDelegate.e(this);
        }
        this.X8 = new Configuration(this.x.getResources().getConfiguration());
        this.V8 = true;
    }

    private AutoNightModeManager M0(@NonNull Context context0) {
        if(this.c9 == null) {
            this.c9 = new AutoTimeNightModeManager(this, TwilightManager.a(context0));
        }
        return this.c9;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void N() {
        if(this.w instanceof Activity) {
            AppCompatDelegate.T(this);
        }
        if(this.e9) {
            this.y.getDecorView().removeCallbacks(this.g9);
        }
        this.W8 = true;
        if(this.Y8 == -100 || (!(this.w instanceof Activity) || !((Activity)this.w).isChangingConfigurations())) {
            String s1 = this.w.getClass().getName();
            AppCompatDelegateImpl.o9.remove(s1);
        }
        else {
            String s = this.w.getClass().getName();
            AppCompatDelegateImpl.o9.put(s, this.Y8);
        }
        ActionBar actionBar0 = this.B;
        if(actionBar0 != null) {
            actionBar0.I();
        }
        this.v0();
    }

    LocaleListCompat N0(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 24 ? LocaleListCompat.c(Api21Impl.b(configuration0.locale)) : Api24Impl.b(configuration0);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void O(Bundle bundle0) {
        this.E0();
    }

    protected PanelFeatureState O0(int v, boolean z) {
        PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.R8;
        if(arr_appCompatDelegateImpl$PanelFeatureState == null || arr_appCompatDelegateImpl$PanelFeatureState.length <= v) {
            PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState1 = new PanelFeatureState[v + 1];
            if(arr_appCompatDelegateImpl$PanelFeatureState != null) {
                System.arraycopy(arr_appCompatDelegateImpl$PanelFeatureState, 0, arr_appCompatDelegateImpl$PanelFeatureState1, 0, arr_appCompatDelegateImpl$PanelFeatureState.length);
            }
            this.R8 = arr_appCompatDelegateImpl$PanelFeatureState1;
            arr_appCompatDelegateImpl$PanelFeatureState = arr_appCompatDelegateImpl$PanelFeatureState1;
        }
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v];
        if(appCompatDelegateImpl$PanelFeatureState0 == null) {
            appCompatDelegateImpl$PanelFeatureState0 = new PanelFeatureState(v);
            arr_appCompatDelegateImpl$PanelFeatureState[v] = appCompatDelegateImpl$PanelFeatureState0;
        }
        return appCompatDelegateImpl$PanelFeatureState0;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void P() {
        ActionBar actionBar0 = this.C();
        if(actionBar0 != null) {
            actionBar0.t0(true);
        }
    }

    ViewGroup P0() {
        return this.O;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void Q(Bundle bundle0) {
    }

    // 去混淆评级： 低(20)
    final CharSequence Q0() {
        return this.w instanceof Activity ? ((Activity)this.w).getTitle() : this.D;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void R() {
        this.o0(true, false);
    }

    final Window.Callback R0() {
        return this.y.getCallback();
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void S() {
        ActionBar actionBar0 = this.C();
        if(actionBar0 != null) {
            actionBar0.t0(false);
        }
    }

    private void S0() {
        this.E0();
        if(this.Z && this.B == null) {
            Object object0 = this.w;
            if(object0 instanceof Activity) {
                this.B = new WindowDecorActionBar(((Activity)this.w), this.M8);
            }
            else if(object0 instanceof Dialog) {
                this.B = new WindowDecorActionBar(((Dialog)this.w));
            }
            ActionBar actionBar0 = this.B;
            if(actionBar0 != null) {
                actionBar0.W(this.h9);
            }
        }
    }

    private boolean T0(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0) {
        View view0 = appCompatDelegateImpl$PanelFeatureState0.i;
        if(view0 != null) {
            appCompatDelegateImpl$PanelFeatureState0.h = view0;
            return true;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.j == null) {
            return false;
        }
        if(this.G == null) {
            this.G = new PanelMenuPresenterCallback(this);
        }
        View view1 = (View)appCompatDelegateImpl$PanelFeatureState0.c(this.G);
        appCompatDelegateImpl$PanelFeatureState0.h = view1;
        return view1 != null;
    }

    private boolean U0(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0) {
        appCompatDelegateImpl$PanelFeatureState0.h(this.I0());
        appCompatDelegateImpl$PanelFeatureState0.g = new ListMenuDecorView(this, appCompatDelegateImpl$PanelFeatureState0.l);
        appCompatDelegateImpl$PanelFeatureState0.c = 81;
        return true;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public boolean V(int v) {
        int v1 = this.m1(v);
        if(this.P8 && v1 == 108) {
            return false;
        }
        if(this.Z && v1 == 1) {
            this.Z = false;
        }
        switch(v1) {
            case 1: {
                this.t1();
                this.P8 = true;
                return true;
            }
            case 2: {
                this.t1();
                this.X = true;
                return true;
            }
            case 5: {
                this.t1();
                this.Y = true;
                return true;
            }
            case 10: {
                this.t1();
                this.N8 = true;
                return true;
            }
            case 108: {
                this.t1();
                this.Z = true;
                return true;
            }
            default: {
                if(v1 != 109) {
                    return this.y.requestFeature(v1);
                }
                this.t1();
                this.M8 = true;
                return true;
            }
        }
    }

    private boolean V0(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0) {
        Resources.Theme resources$Theme1;
        Context context0 = this.x;
        if((appCompatDelegateImpl$PanelFeatureState0.a == 0 || appCompatDelegateImpl$PanelFeatureState0.a == 108) && this.E != null) {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = context0.getTheme();
            resources$Theme0.resolveAttribute(attr.actionBarTheme, typedValue0, true);
            if(typedValue0.resourceId == 0) {
                resources$Theme0.resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
                resources$Theme1 = null;
            }
            else {
                resources$Theme1 = context0.getResources().newTheme();
                resources$Theme1.setTo(resources$Theme0);
                resources$Theme1.applyStyle(typedValue0.resourceId, true);
                resources$Theme1.resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
            }
            if(typedValue0.resourceId != 0) {
                if(resources$Theme1 == null) {
                    resources$Theme1 = context0.getResources().newTheme();
                    resources$Theme1.setTo(resources$Theme0);
                }
                resources$Theme1.applyStyle(typedValue0.resourceId, true);
            }
            if(resources$Theme1 != null) {
                ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, 0);
                contextThemeWrapper0.getTheme().setTo(resources$Theme1);
                context0 = contextThemeWrapper0;
            }
        }
        MenuBuilder menuBuilder0 = new MenuBuilder(context0);
        menuBuilder0.Y(this);
        appCompatDelegateImpl$PanelFeatureState0.g(menuBuilder0);
        return true;
    }

    private void W0(int v) {
        this.f9 |= 1 << v;
        if(!this.e9) {
            ViewCompat.x1(this.y.getDecorView(), this.g9);
            this.e9 = true;
        }
    }

    int X0(@NonNull Context context0, int v) {
        switch(v) {
            case -100: {
                return -1;
            }
            case 0: {
                return Build.VERSION.SDK_INT < 23 || ((UiModeManager)context0.getApplicationContext().getSystemService("uimode")).getNightMode() != 0 ? this.M0(context0).c() : -1;
            }
            case -1: 
            case 1: 
            case 2: {
                return v;
            }
            case 3: {
                return this.K0(context0).c();
            }
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
    }

    boolean Y0() {
        boolean z = this.T8;
        this.T8 = false;
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, false);
        if(appCompatDelegateImpl$PanelFeatureState0 != null && appCompatDelegateImpl$PanelFeatureState0.o) {
            if(!z) {
                this.x0(appCompatDelegateImpl$PanelFeatureState0, true);
            }
            return true;
        }
        ActionMode actionMode0 = this.H;
        if(actionMode0 != null) {
            actionMode0.c();
            return true;
        }
        ActionBar actionBar0 = this.C();
        return actionBar0 != null && actionBar0.l();
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void Z(int v) {
        this.E0();
        ViewGroup viewGroup0 = (ViewGroup)this.O.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        LayoutInflater.from(this.x).inflate(v, viewGroup0);
        this.z.c(this.y.getCallback());
    }

    boolean Z0(int v, KeyEvent keyEvent0) {
        boolean z = true;
        switch(v) {
            case 4: {
                if((keyEvent0.getFlags() & 0x80) == 0) {
                    z = false;
                }
                this.T8 = z;
                return false;
            }
            case 82: {
                this.a1(0, keyEvent0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        Window.Callback window$Callback0 = this.R0();
        if(window$Callback0 != null && !this.W8) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.G0(menuBuilder0.G());
            return appCompatDelegateImpl$PanelFeatureState0 == null ? false : window$Callback0.onMenuItemSelected(appCompatDelegateImpl$PanelFeatureState0.a, menuItem0);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void a0(View view0) {
        this.E0();
        ViewGroup viewGroup0 = (ViewGroup)this.O.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        this.z.c(this.y.getCallback());
    }

    private boolean a1(int v, KeyEvent keyEvent0) {
        if(keyEvent0.getRepeatCount() == 0) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(v, true);
            return appCompatDelegateImpl$PanelFeatureState0.o ? false : this.k1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0);
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public void b(@NonNull MenuBuilder menuBuilder0) {
        this.l1(true);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void b0(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.E0();
        ViewGroup viewGroup0 = (ViewGroup)this.O.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        this.z.c(this.y.getCallback());
    }

    boolean b1(int v, KeyEvent keyEvent0) {
        ActionBar actionBar0 = this.C();
        if(actionBar0 != null && actionBar0.J(v, keyEvent0)) {
            return true;
        }
        if(this.S8 != null && this.j1(this.S8, keyEvent0.getKeyCode(), keyEvent0, 1)) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.S8;
            if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                appCompatDelegateImpl$PanelFeatureState0.n = true;
            }
            return true;
        }
        if(this.S8 == null) {
            PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.O0(0, true);
            this.k1(appCompatDelegateImpl$PanelFeatureState1, keyEvent0);
            boolean z = this.j1(appCompatDelegateImpl$PanelFeatureState1, keyEvent0.getKeyCode(), keyEvent0, 1);
            appCompatDelegateImpl$PanelFeatureState1.m = false;
            return z;
        }
        return false;
    }

    boolean c1(int v, KeyEvent keyEvent0) {
        switch(v) {
            case 4: {
                return this.Y0();
            }
            case 82: {
                this.d1(0, keyEvent0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void d0(boolean z) {
        this.M = z;
    }

    private boolean d1(int v, KeyEvent keyEvent0) {
        boolean z2;
        if(this.H != null) {
            return false;
        }
        boolean z = true;
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(v, true);
        if(v != 0 || (this.E == null || !this.E.b() || ViewConfiguration.get(this.x).hasPermanentMenuKey())) {
            boolean z1 = appCompatDelegateImpl$PanelFeatureState0.o;
            if(z1 || appCompatDelegateImpl$PanelFeatureState0.n) {
                this.x0(appCompatDelegateImpl$PanelFeatureState0, true);
                z = z1;
            }
            else if(appCompatDelegateImpl$PanelFeatureState0.m) {
                if(appCompatDelegateImpl$PanelFeatureState0.r) {
                    appCompatDelegateImpl$PanelFeatureState0.m = false;
                    z2 = this.k1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0);
                }
                else {
                    z2 = true;
                }
                if(z2) {
                    this.h1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0);
                }
                else {
                    z = false;
                }
            }
            else {
                z = false;
            }
        }
        else if(this.E.d()) {
            z = this.E.f();
        }
        else if(!this.W8 && this.k1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0)) {
            z = this.E.c();
        }
        else {
            z = false;
        }
        if(z) {
            AudioManager audioManager0 = (AudioManager)this.x.getApplicationContext().getSystemService("audio");
            if(audioManager0 != null) {
                audioManager0.playSoundEffect(0);
                return true;
            }
            Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
        }
        return z;
    }

    void e1(int v) {
        if(v == 108) {
            ActionBar actionBar0 = this.C();
            if(actionBar0 != null) {
                actionBar0.m(true);
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void f(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.E0();
        ((ViewGroup)this.O.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        this.z.c(this.y.getCallback());
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void f0(int v) {
        if(this.Y8 != v) {
            this.Y8 = v;
            if(this.U8) {
                this.h();
            }
        }
    }

    void f1(int v) {
        switch(v) {
            case 0: {
                PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, true);
                if(appCompatDelegateImpl$PanelFeatureState0.o) {
                    this.x0(appCompatDelegateImpl$PanelFeatureState0, false);
                    return;
                }
                break;
            }
            case 108: {
                ActionBar actionBar0 = this.C();
                if(actionBar0 != null) {
                    actionBar0.m(false);
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    boolean g() {
        if(AppCompatDelegate.G(this.x) && AppCompatDelegate.A() != null && !AppCompatDelegate.A().equals(AppCompatDelegate.B())) {
            this.k(this.x);
        }
        return this.n0(true);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    @RequiresApi(33)
    public void g0(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        super.g0(onBackInvokedDispatcher0);
        OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.m9;
        if(onBackInvokedDispatcher1 != null) {
            OnBackInvokedCallback onBackInvokedCallback0 = this.n9;
            if(onBackInvokedCallback0 != null) {
                Api33Impl.c(onBackInvokedDispatcher1, onBackInvokedCallback0);
                this.n9 = null;
            }
        }
        this.m9 = onBackInvokedDispatcher0 != null || (!(this.w instanceof Activity) || ((Activity)this.w).getWindow() == null) ? onBackInvokedDispatcher0 : Api33Impl.a(((Activity)this.w));
        this.x1();
    }

    void g1(ViewGroup viewGroup0) {
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public boolean h() {
        return this.n0(true);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void h0(Toolbar toolbar0) {
        if(!(this.w instanceof Activity)) {
            return;
        }
        ActionBar actionBar0 = this.C();
        if(actionBar0 instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.C = null;
        if(actionBar0 != null) {
            actionBar0.I();
        }
        this.B = null;
        if(toolbar0 == null) {
            this.z.e(null);
        }
        else {
            ToolbarActionBar toolbarActionBar0 = new ToolbarActionBar(toolbar0, this.Q0(), this.z);
            this.B = toolbarActionBar0;
            this.z.e(toolbarActionBar0.k);
            toolbar0.setBackInvokedCallbackEnabled(true);
        }
        this.F();
    }

    private void h1(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, KeyEvent keyEvent0) {
        int v;
        if(appCompatDelegateImpl$PanelFeatureState0.o || this.W8 || appCompatDelegateImpl$PanelFeatureState0.a == 0 && (this.x.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback window$Callback0 = this.R0();
        if(window$Callback0 != null && !window$Callback0.onMenuOpened(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0.j)) {
            this.x0(appCompatDelegateImpl$PanelFeatureState0, true);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.x.getSystemService("window");
        if(windowManager0 == null) {
            return;
        }
        if(!this.k1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0)) {
            return;
        }
        ViewGroup viewGroup0 = appCompatDelegateImpl$PanelFeatureState0.g;
        if(viewGroup0 != null && !appCompatDelegateImpl$PanelFeatureState0.q) {
            View view0 = appCompatDelegateImpl$PanelFeatureState0.i;
            if(view0 == null) {
                goto label_35;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null || viewGroup$LayoutParams0.width != -1) {
                goto label_35;
            }
            v = -1;
            goto label_36;
        }
        if(viewGroup0 == null) {
            if(!this.U0(appCompatDelegateImpl$PanelFeatureState0) || appCompatDelegateImpl$PanelFeatureState0.g == null) {
                return;
            }
        }
        else if(appCompatDelegateImpl$PanelFeatureState0.q && viewGroup0.getChildCount() > 0) {
            appCompatDelegateImpl$PanelFeatureState0.g.removeAllViews();
        }
        if(this.T0(appCompatDelegateImpl$PanelFeatureState0) && appCompatDelegateImpl$PanelFeatureState0.d()) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = appCompatDelegateImpl$PanelFeatureState0.h.getLayoutParams();
            if(viewGroup$LayoutParams1 == null) {
                viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-2, -2);
            }
            appCompatDelegateImpl$PanelFeatureState0.g.setBackgroundResource(appCompatDelegateImpl$PanelFeatureState0.b);
            ViewParent viewParent0 = appCompatDelegateImpl$PanelFeatureState0.h.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(appCompatDelegateImpl$PanelFeatureState0.h);
            }
            appCompatDelegateImpl$PanelFeatureState0.g.addView(appCompatDelegateImpl$PanelFeatureState0.h, viewGroup$LayoutParams1);
            if(!appCompatDelegateImpl$PanelFeatureState0.h.hasFocus()) {
                appCompatDelegateImpl$PanelFeatureState0.h.requestFocus();
            }
        label_35:
            v = -2;
        label_36:
            appCompatDelegateImpl$PanelFeatureState0.n = false;
            WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(v, -2, appCompatDelegateImpl$PanelFeatureState0.d, appCompatDelegateImpl$PanelFeatureState0.e, 1002, 0x820000, -3);
            windowManager$LayoutParams0.gravity = appCompatDelegateImpl$PanelFeatureState0.c;
            windowManager$LayoutParams0.windowAnimations = appCompatDelegateImpl$PanelFeatureState0.f;
            windowManager0.addView(appCompatDelegateImpl$PanelFeatureState0.g, windowManager$LayoutParams0);
            appCompatDelegateImpl$PanelFeatureState0.o = true;
            if(appCompatDelegateImpl$PanelFeatureState0.a == 0) {
                this.x1();
            }
            return;
        }
        appCompatDelegateImpl$PanelFeatureState0.q = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public void i0(@StyleRes int v) {
        this.Z8 = v;
    }

    final ActionBar i1() {
        return this.B;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void j0(CharSequence charSequence0) {
        this.D = charSequence0;
        DecorContentParent decorContentParent0 = this.E;
        if(decorContentParent0 != null) {
            decorContentParent0.setWindowTitle(charSequence0);
            return;
        }
        if(this.i1() != null) {
            this.i1().A0(charSequence0);
            return;
        }
        TextView textView0 = this.P;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    private boolean j1(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, int v, KeyEvent keyEvent0, int v1) {
        boolean z = false;
        if(keyEvent0.isSystem()) {
            return false;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.m || this.k1(appCompatDelegateImpl$PanelFeatureState0, keyEvent0)) {
            MenuBuilder menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.j;
            if(menuBuilder0 != null) {
                z = menuBuilder0.performShortcut(v, keyEvent0, v1);
            }
        }
        if(z && (v1 & 1) == 0 && this.E == null) {
            this.x0(appCompatDelegateImpl$PanelFeatureState0, true);
        }
        return z;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public ActionMode k0(@NonNull androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
        if(actionMode$Callback0 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode0 = this.H;
        if(actionMode0 != null) {
            actionMode0.c();
        }
        ActionModeCallbackWrapperV9 appCompatDelegateImpl$ActionModeCallbackWrapperV90 = new ActionModeCallbackWrapperV9(this, actionMode$Callback0);
        ActionBar actionBar0 = this.C();
        if(actionBar0 != null) {
            ActionMode actionMode1 = actionBar0.C0(appCompatDelegateImpl$ActionModeCallbackWrapperV90);
            this.H = actionMode1;
            if(actionMode1 != null) {
                AppCompatCallback appCompatCallback0 = this.A;
                if(appCompatCallback0 != null) {
                    appCompatCallback0.r(actionMode1);
                }
            }
        }
        if(this.H == null) {
            this.H = this.s1(appCompatDelegateImpl$ActionModeCallbackWrapperV90);
        }
        this.x1();
        return this.H;
    }

    private boolean k1(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, KeyEvent keyEvent0) {
        if(this.W8) {
            return false;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.m) {
            return true;
        }
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.S8;
        if(appCompatDelegateImpl$PanelFeatureState1 != null && appCompatDelegateImpl$PanelFeatureState1 != appCompatDelegateImpl$PanelFeatureState0) {
            this.x0(appCompatDelegateImpl$PanelFeatureState1, false);
        }
        Window.Callback window$Callback0 = this.R0();
        if(window$Callback0 != null) {
            appCompatDelegateImpl$PanelFeatureState0.i = window$Callback0.onCreatePanelView(appCompatDelegateImpl$PanelFeatureState0.a);
        }
        boolean z = appCompatDelegateImpl$PanelFeatureState0.a == 0 || appCompatDelegateImpl$PanelFeatureState0.a == 108;
        if(z) {
            DecorContentParent decorContentParent0 = this.E;
            if(decorContentParent0 != null) {
                decorContentParent0.h();
            }
        }
        if(appCompatDelegateImpl$PanelFeatureState0.i == null && (!z || !(this.i1() instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.j;
            if(menuBuilder0 == null || appCompatDelegateImpl$PanelFeatureState0.r) {
                if(menuBuilder0 == null && (!this.V0(appCompatDelegateImpl$PanelFeatureState0) || appCompatDelegateImpl$PanelFeatureState0.j == null)) {
                    return false;
                }
                if(z && this.E != null) {
                    if(this.F == null) {
                        this.F = new ActionMenuPresenterCallback(this);
                    }
                    this.E.g(appCompatDelegateImpl$PanelFeatureState0.j, this.F);
                }
                appCompatDelegateImpl$PanelFeatureState0.j.n0();
                if(!window$Callback0.onCreatePanelMenu(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0.j)) {
                    appCompatDelegateImpl$PanelFeatureState0.g(null);
                    if(z) {
                        DecorContentParent decorContentParent1 = this.E;
                        if(decorContentParent1 != null) {
                            decorContentParent1.g(null, this.F);
                        }
                    }
                    return false;
                }
                appCompatDelegateImpl$PanelFeatureState0.r = false;
            }
            appCompatDelegateImpl$PanelFeatureState0.j.n0();
            Bundle bundle0 = appCompatDelegateImpl$PanelFeatureState0.u;
            if(bundle0 != null) {
                appCompatDelegateImpl$PanelFeatureState0.j.U(bundle0);
                appCompatDelegateImpl$PanelFeatureState0.u = null;
            }
            if(!window$Callback0.onPreparePanel(0, appCompatDelegateImpl$PanelFeatureState0.i, appCompatDelegateImpl$PanelFeatureState0.j)) {
                if(z) {
                    DecorContentParent decorContentParent2 = this.E;
                    if(decorContentParent2 != null) {
                        decorContentParent2.g(null, this.F);
                    }
                }
                appCompatDelegateImpl$PanelFeatureState0.j.m0();
                return false;
            }
            boolean z1 = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
            appCompatDelegateImpl$PanelFeatureState0.p = z1;
            appCompatDelegateImpl$PanelFeatureState0.j.setQwertyMode(z1);
            appCompatDelegateImpl$PanelFeatureState0.j.m0();
        }
        appCompatDelegateImpl$PanelFeatureState0.m = true;
        appCompatDelegateImpl$PanelFeatureState0.n = false;
        this.S8 = appCompatDelegateImpl$PanelFeatureState0;
        return true;
    }

    private void l1(boolean z) {
        if(this.E != null && this.E.b() && (!ViewConfiguration.get(this.x).hasPermanentMenuKey() || this.E.j())) {
            Window.Callback window$Callback0 = this.R0();
            if(this.E.d() && z) {
                this.E.f();
                if(!this.W8) {
                    window$Callback0.onPanelClosed(108, this.O0(0, true).j);
                    return;
                }
            }
            else if(window$Callback0 != null && !this.W8) {
                if(this.e9 && (this.f9 & 1) != 0) {
                    this.y.getDecorView().removeCallbacks(this.g9);
                    this.g9.run();
                }
                PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, true);
                if(appCompatDelegateImpl$PanelFeatureState0.j != null && !appCompatDelegateImpl$PanelFeatureState0.r && window$Callback0.onPreparePanel(0, appCompatDelegateImpl$PanelFeatureState0.i, appCompatDelegateImpl$PanelFeatureState0.j)) {
                    window$Callback0.onMenuOpened(108, appCompatDelegateImpl$PanelFeatureState0.j);
                    this.E.c();
                }
            }
            return;
        }
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.O0(0, true);
        appCompatDelegateImpl$PanelFeatureState1.q = true;
        this.x0(appCompatDelegateImpl$PanelFeatureState1, false);
        this.h1(appCompatDelegateImpl$PanelFeatureState1, null);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    @CallSuper
    @NonNull
    public Context m(@NonNull Context context0) {
        this.U8 = true;
        int v = this.X0(context0, this.s0());
        if(AppCompatDelegate.G(context0)) {
            AppCompatDelegate.m0(context0);
        }
        LocaleListCompat localeListCompat0 = this.r0(context0);
        if(context0 instanceof android.view.ContextThemeWrapper) {
            Configuration configuration0 = this.y0(context0, v, localeListCompat0, null, false);
            try {
                ((android.view.ContextThemeWrapper)context0).applyOverrideConfiguration(configuration0);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(context0 instanceof ContextThemeWrapper) {
            Configuration configuration1 = this.y0(context0, v, localeListCompat0, null, false);
            try {
                ((ContextThemeWrapper)context0).a(configuration1);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(!AppCompatDelegateImpl.r9) {
            return super.m(context0);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context0.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context0.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        Configuration configuration5 = this.y0(context0, v, localeListCompat0, (configuration3.equals(configuration4) ? null : AppCompatDelegateImpl.H0(configuration3, configuration4)), true);
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, style.Theme_AppCompat_Empty);
        contextThemeWrapper0.a(configuration5);
        try {
            if(context0.getTheme() != null) {
                goto label_25;
            }
        }
        catch(NullPointerException unused_ex) {
        }
        return super.m(contextThemeWrapper0);
    label_25:
        ThemeCompat.a(contextThemeWrapper0.getTheme());
        return super.m(contextThemeWrapper0);
    }

    private int m1(int v) {
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                return 108;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                return 109;
            }
            default: {
                return v;
            }
        }
    }

    private boolean n0(boolean z) {
        return this.o0(z, true);
    }

    void n1(Configuration configuration0, @NonNull LocaleListCompat localeListCompat0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.d(configuration0, localeListCompat0);
            return;
        }
        configuration0.setLocale(localeListCompat0.d(0));
        configuration0.setLayoutDirection(localeListCompat0.d(0));
    }

    private boolean o0(boolean z, boolean z1) {
        if(this.W8) {
            return false;
        }
        int v = this.s0();
        int v1 = this.X0(this.x, v);
        LocaleListCompat localeListCompat0 = Build.VERSION.SDK_INT >= 33 ? null : this.r0(this.x);
        if(!z1 && localeListCompat0 != null) {
            localeListCompat0 = this.N0(this.x.getResources().getConfiguration());
        }
        boolean z2 = this.w1(v1, localeListCompat0, z);
        if(v == 0) {
            this.M0(this.x).f();
        }
        else {
            AutoNightModeManager appCompatDelegateImpl$AutoNightModeManager0 = this.c9;
            if(appCompatDelegateImpl$AutoNightModeManager0 != null) {
                appCompatDelegateImpl$AutoNightModeManager0.a();
            }
        }
        if(v == 3) {
            this.K0(this.x).f();
            return z2;
        }
        AutoNightModeManager appCompatDelegateImpl$AutoNightModeManager1 = this.d9;
        if(appCompatDelegateImpl$AutoNightModeManager1 != null) {
            appCompatDelegateImpl$AutoNightModeManager1.a();
        }
        return z2;
    }

    void o1(LocaleListCompat localeListCompat0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.c(localeListCompat0);
            return;
        }
        Locale.setDefault(localeListCompat0.d(0));
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.r(view0, s, context0, attributeSet0);
    }

    @Override  // android.view.LayoutInflater$Factory
    public View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }

    private void p0() {
        ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)this.O.findViewById(0x1020002);
        View view0 = this.y.getDecorView();
        contentFrameLayout0.b(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), view0.getPaddingBottom());
        TypedArray typedArray0 = this.x.obtainStyledAttributes(styleable.AppCompatTheme);
        TypedValue typedValue0 = contentFrameLayout0.getMinWidthMajor();
        typedArray0.getValue(styleable.AppCompatTheme_windowMinWidthMajor, typedValue0);
        TypedValue typedValue1 = contentFrameLayout0.getMinWidthMinor();
        typedArray0.getValue(styleable.AppCompatTheme_windowMinWidthMinor, typedValue1);
        if(typedArray0.hasValue(styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArray0.getValue(0x7A, contentFrameLayout0.getFixedWidthMajor());
        }
        if(typedArray0.hasValue(styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArray0.getValue(0x7B, contentFrameLayout0.getFixedWidthMinor());
        }
        if(typedArray0.hasValue(styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArray0.getValue(120, contentFrameLayout0.getFixedHeightMajor());
        }
        if(typedArray0.hasValue(styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArray0.getValue(0x79, contentFrameLayout0.getFixedHeightMinor());
        }
        typedArray0.recycle();
        contentFrameLayout0.requestLayout();
    }

    // 去混淆评级： 低(20)
    final boolean p1() {
        return this.N && (this.O != null && this.O.isLaidOut());
    }

    private void q0(@NonNull Window window0) {
        if(this.y != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback window$Callback0 = window0.getCallback();
        if(window$Callback0 instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatDelegateImpl$AppCompatWindowCallback0 = new AppCompatWindowCallback(this, window$Callback0);
        this.z = appCompatDelegateImpl$AppCompatWindowCallback0;
        window0.setCallback(appCompatDelegateImpl$AppCompatWindowCallback0);
        TintTypedArray tintTypedArray0 = TintTypedArray.F(this.x, null, AppCompatDelegateImpl.q9);
        Drawable drawable0 = tintTypedArray0.i(0);
        if(drawable0 != null) {
            window0.setBackgroundDrawable(drawable0);
        }
        tintTypedArray0.I();
        this.y = window0;
        if(Build.VERSION.SDK_INT >= 33 && this.m9 == null) {
            this.g0(null);
        }
    }

    private boolean q1(ViewParent viewParent0) {
        if(viewParent0 == null) {
            return false;
        }
        View view0 = this.y.getDecorView();
        while(true) {
            if(viewParent0 == null) {
                return true;
            }
            if(viewParent0 == view0 || !(viewParent0 instanceof View) || ((View)viewParent0).isAttachedToWindow()) {
                break;
            }
            viewParent0 = viewParent0.getParent();
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public View r(View view0, String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        if(this.k9 == null) {
            TypedArray typedArray0 = this.x.obtainStyledAttributes(styleable.AppCompatTheme);
            String s1 = typedArray0.getString(styleable.AppCompatTheme_viewInflaterClass);
            typedArray0.recycle();
            if(s1 == null) {
                this.k9 = new AppCompatViewInflater();
            }
            else {
                try {
                    this.k9 = (AppCompatViewInflater)this.x.getClassLoader().loadClass(s1).getDeclaredConstructor(null).newInstance(null);
                }
                catch(Throwable throwable0) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + s1 + ". Falling back to default.", throwable0);
                    this.k9 = new AppCompatViewInflater();
                }
            }
        }
        if(AppCompatDelegateImpl.p9) {
            if(this.l9 == null) {
                this.l9 = new LayoutIncludeDetector();
            }
            if(this.l9.a(attributeSet0)) {
                return this.k9.r(view0, s, context0, attributeSet0, true, true, true, false);
            }
            if(attributeSet0 instanceof XmlPullParser) {
                return ((XmlPullParser)attributeSet0).getDepth() <= 1 ? this.k9.r(view0, s, context0, attributeSet0, false, true, true, false) : this.k9.r(view0, s, context0, attributeSet0, true, true, true, false);
            }
            boolean z = this.q1(((ViewParent)view0));
            return this.k9.r(view0, s, context0, attributeSet0, z, true, true, false);
        }
        return this.k9.r(view0, s, context0, attributeSet0, false, false, true, false);
    }

    @Nullable
    LocaleListCompat r0(@NonNull Context context0) {
        LocaleListCompat localeListCompat2;
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            return null;
        }
        LocaleListCompat localeListCompat0 = AppCompatDelegate.A();
        if(localeListCompat0 == null) {
            return null;
        }
        LocaleListCompat localeListCompat1 = this.N0(context0.getApplicationContext().getResources().getConfiguration());
        if(v >= 24) {
            localeListCompat2 = LocaleOverlayHelper.c(localeListCompat0, localeListCompat1);
            return localeListCompat2.j() ? localeListCompat1 : localeListCompat2;
        }
        localeListCompat2 = localeListCompat0.j() ? LocaleListCompat.g() : LocaleListCompat.c(Api21Impl.b(localeListCompat0.d(0)));
        return localeListCompat2.j() ? localeListCompat1 : localeListCompat2;
    }

    boolean r1() {
        if(this.m9 == null) {
            return false;
        }
        PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.O0(0, false);
        return appCompatDelegateImpl$PanelFeatureState0 == null || !appCompatDelegateImpl$PanelFeatureState0.o ? this.H != null : true;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public View s(@IdRes int v) {
        this.E0();
        return this.y.findViewById(v);
    }

    // 去混淆评级： 低(30)
    private int s0() {
        return this.Y8 == -100 ? -100 : this.Y8;
    }

    ActionMode s1(@NonNull androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
        Context context0;
        this.D0();
        ActionMode actionMode0 = this.H;
        if(actionMode0 != null) {
            actionMode0.c();
        }
        if(!(actionMode$Callback0 instanceof ActionModeCallbackWrapperV9)) {
            actionMode$Callback0 = new ActionModeCallbackWrapperV9(this, actionMode$Callback0);
        }
        AppCompatCallback appCompatCallback0 = this.A;
        ActionMode actionMode1 = null;
        if(appCompatCallback0 != null && !this.W8) {
            try {
                actionMode1 = appCompatCallback0.s(actionMode$Callback0);
            }
            catch(AbstractMethodError unused_ex) {
            }
        }
        boolean z = true;
        if(actionMode1 == null) {
            if(this.I == null) {
                if(this.O8) {
                    TypedValue typedValue0 = new TypedValue();
                    Resources.Theme resources$Theme0 = this.x.getTheme();
                    resources$Theme0.resolveAttribute(attr.actionBarTheme, typedValue0, true);
                    if(typedValue0.resourceId == 0) {
                        context0 = this.x;
                    }
                    else {
                        Resources.Theme resources$Theme1 = this.x.getResources().newTheme();
                        resources$Theme1.setTo(resources$Theme0);
                        resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        context0 = new ContextThemeWrapper(this.x, 0);
                        context0.getTheme().setTo(resources$Theme1);
                    }
                    this.I = new ActionBarContextView(context0);
                    PopupWindow popupWindow0 = new PopupWindow(context0, null, attr.actionModePopupWindowStyle);
                    this.J = popupWindow0;
                    PopupWindowCompat.d(popupWindow0, 2);
                    this.J.setContentView(this.I);
                    this.J.setWidth(-1);
                    context0.getTheme().resolveAttribute(attr.actionBarSize, typedValue0, true);
                    int v = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                    this.I.setContentHeight(v);
                    this.J.setHeight(-2);
                    this.K = new Runnable() {
                        final AppCompatDelegateImpl a;

                        @Override
                        public void run() {
                            AppCompatDelegateImpl.this.J.showAtLocation(AppCompatDelegateImpl.this.I, 55, 0, 0);
                            AppCompatDelegateImpl.this.D0();
                            if(AppCompatDelegateImpl.this.p1()) {
                                AppCompatDelegateImpl.this.I.setAlpha(0.0f);
                                AppCompatDelegateImpl.this.L = ViewCompat.h(AppCompatDelegateImpl.this.I).b(1.0f);
                                AppCompatDelegateImpl.this.L.u(new ViewPropertyAnimatorListenerAdapter() {
                                    final androidx.appcompat.app.AppCompatDelegateImpl.6 a;

                                    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
                                    public void b(View view0) {
                                        AppCompatDelegateImpl.this.I.setAlpha(1.0f);
                                        AppCompatDelegateImpl.this.L.u(null);
                                        AppCompatDelegateImpl.this.L = null;
                                    }

                                    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
                                    public void c(View view0) {
                                        AppCompatDelegateImpl.this.I.setVisibility(0);
                                    }
                                });
                                return;
                            }
                            AppCompatDelegateImpl.this.I.setAlpha(1.0f);
                            AppCompatDelegateImpl.this.I.setVisibility(0);
                        }
                    };
                }
                else {
                    ViewStubCompat viewStubCompat0 = (ViewStubCompat)this.O.findViewById(id.action_mode_bar_stub);
                    if(viewStubCompat0 != null) {
                        viewStubCompat0.setLayoutInflater(LayoutInflater.from(this.I0()));
                        this.I = (ActionBarContextView)viewStubCompat0.a();
                    }
                }
            }
            if(this.I != null) {
                this.D0();
                this.I.t();
                Context context1 = this.I.getContext();
                ActionBarContextView actionBarContextView0 = this.I;
                if(this.J != null) {
                    z = false;
                }
                StandaloneActionMode standaloneActionMode0 = new StandaloneActionMode(context1, actionBarContextView0, actionMode$Callback0, z);
                if(actionMode$Callback0.a(standaloneActionMode0, standaloneActionMode0.e())) {
                    standaloneActionMode0.k();
                    this.I.q(standaloneActionMode0);
                    this.H = standaloneActionMode0;
                    if(this.p1()) {
                        this.I.setAlpha(0.0f);
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.h(this.I).b(1.0f);
                        this.L = viewPropertyAnimatorCompat0;
                        viewPropertyAnimatorCompat0.u(new ViewPropertyAnimatorListenerAdapter() {
                            final AppCompatDelegateImpl a;

                            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
                            public void b(View view0) {
                                AppCompatDelegateImpl.this.I.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.L.u(null);
                                AppCompatDelegateImpl.this.L = null;
                            }

                            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
                            public void c(View view0) {
                                AppCompatDelegateImpl.this.I.setVisibility(0);
                                if(AppCompatDelegateImpl.this.I.getParent() instanceof View) {
                                    ViewCompat.D1(((View)AppCompatDelegateImpl.this.I.getParent()));
                                }
                            }
                        });
                    }
                    else {
                        this.I.setAlpha(1.0f);
                        this.I.setVisibility(0);
                        if(this.I.getParent() instanceof View) {
                            ViewCompat.D1(((View)this.I.getParent()));
                        }
                    }
                    if(this.J != null) {
                        this.y.getDecorView().post(this.K);
                    }
                }
                else {
                    this.H = null;
                }
            }
        }
        else {
            this.H = actionMode1;
        }
        ActionMode actionMode2 = this.H;
        if(actionMode2 != null) {
            AppCompatCallback appCompatCallback1 = this.A;
            if(appCompatCallback1 != null) {
                appCompatCallback1.r(actionMode2);
            }
        }
        this.x1();
        return this.H;
    }

    void t0(int v, PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, Menu menu0) {
        if(menu0 == null) {
            if(appCompatDelegateImpl$PanelFeatureState0 == null && v >= 0) {
                PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.R8;
                if(v < arr_appCompatDelegateImpl$PanelFeatureState.length) {
                    appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v];
                }
            }
            if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                menu0 = appCompatDelegateImpl$PanelFeatureState0.j;
            }
        }
        if(appCompatDelegateImpl$PanelFeatureState0 != null && !appCompatDelegateImpl$PanelFeatureState0.o) {
            return;
        }
        if(!this.W8) {
            this.z.d(this.y.getCallback(), v, menu0);
        }
    }

    private void t1() {
        if(this.N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public Context u() {
        return this.x;
    }

    void u0(@NonNull MenuBuilder menuBuilder0) {
        if(this.Q8) {
            return;
        }
        this.Q8 = true;
        this.E.q();
        Window.Callback window$Callback0 = this.R0();
        if(window$Callback0 != null && !this.W8) {
            window$Callback0.onPanelClosed(108, menuBuilder0);
        }
        this.Q8 = false;
    }

    @Nullable
    private AppCompatActivity u1() {
        for(Context context0 = this.x; context0 != null; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof AppCompatActivity) {
                return (AppCompatActivity)context0;
            }
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void v0() {
        AutoNightModeManager appCompatDelegateImpl$AutoNightModeManager0 = this.c9;
        if(appCompatDelegateImpl$AutoNightModeManager0 != null) {
            appCompatDelegateImpl$AutoNightModeManager0.a();
        }
        AutoNightModeManager appCompatDelegateImpl$AutoNightModeManager1 = this.d9;
        if(appCompatDelegateImpl$AutoNightModeManager1 != null) {
            appCompatDelegateImpl$AutoNightModeManager1.a();
        }
    }

    private void v1(Configuration configuration0) {
        Activity activity0 = (Activity)this.w;
        if(activity0 instanceof LifecycleOwner) {
            if(((LifecycleOwner)activity0).getLifecycle().b().b(State.c)) {
                activity0.onConfigurationChanged(configuration0);
            }
        }
        else if(this.V8 && !this.W8) {
            activity0.onConfigurationChanged(configuration0);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final Delegate w() {
        return new ActionBarDrawableToggleImpl(this);
    }

    void w0(int v) {
        this.x0(this.O0(v, true), true);
    }

    private boolean w1(int v, @Nullable LocaleListCompat localeListCompat0, boolean z) {
        boolean z3;
        Configuration configuration0 = this.y0(this.x, v, localeListCompat0, null, false);
        int v1 = this.J0(this.x);
        Configuration configuration1 = this.X8 == null ? this.x.getResources().getConfiguration() : this.X8;
        int v2 = configuration1.uiMode & 0x30;
        int v3 = configuration0.uiMode & 0x30;
        LocaleListCompat localeListCompat1 = this.N0(configuration1);
        LocaleListCompat localeListCompat2 = localeListCompat0 == null ? null : this.N0(configuration0);
        boolean z1 = false;
        int v4 = v2 == v3 ? 0 : 0x200;
        if(localeListCompat2 != null && !localeListCompat1.equals(localeListCompat2)) {
            v4 |= 0x2004;
        }
        boolean z2 = true;
        if((~v1 & v4) == 0 || !z || !this.U8 || !AppCompatDelegateImpl.r9 && !this.V8 || (!(this.w instanceof Activity) || ((Activity)this.w).isChild())) {
            z3 = false;
        }
        else {
            if(Build.VERSION.SDK_INT >= 0x1F && (v4 & 0x2000) != 0) {
                ((Activity)this.w).getWindow().getDecorView().setLayoutDirection(configuration0.getLayoutDirection());
            }
            ActivityCompat.k(((Activity)this.w));
            z3 = true;
        }
        if(z3 || v4 == 0) {
            z2 = z3;
        }
        else {
            if((v4 & v1) == v4) {
                z1 = true;
            }
            this.y1(v3, localeListCompat2, z1, null);
        }
        if(localeListCompat2 != null) {
            this.o1(this.N0(this.x.getResources().getConfiguration()));
        }
        return z2;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public int x() {
        return this.Y8;
    }

    void x0(PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, boolean z) {
        if(z && appCompatDelegateImpl$PanelFeatureState0.a == 0 && (this.E != null && this.E.d())) {
            this.u0(appCompatDelegateImpl$PanelFeatureState0.j);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.x.getSystemService("window");
        if(windowManager0 != null && appCompatDelegateImpl$PanelFeatureState0.o) {
            ViewGroup viewGroup0 = appCompatDelegateImpl$PanelFeatureState0.g;
            if(viewGroup0 != null) {
                windowManager0.removeView(viewGroup0);
                if(z) {
                    this.t0(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0, null);
                }
            }
        }
        appCompatDelegateImpl$PanelFeatureState0.m = false;
        appCompatDelegateImpl$PanelFeatureState0.n = false;
        appCompatDelegateImpl$PanelFeatureState0.o = false;
        appCompatDelegateImpl$PanelFeatureState0.h = null;
        appCompatDelegateImpl$PanelFeatureState0.q = true;
        if(this.S8 == appCompatDelegateImpl$PanelFeatureState0) {
            this.S8 = null;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.a == 0) {
            this.x1();
        }
    }

    void x1() {
        if(Build.VERSION.SDK_INT >= 33) {
            boolean z = this.r1();
            if(z && this.n9 == null) {
                this.n9 = Api33Impl.b(this.m9, this);
                return;
            }
            if(!z) {
                OnBackInvokedCallback onBackInvokedCallback0 = this.n9;
                if(onBackInvokedCallback0 != null) {
                    Api33Impl.c(this.m9, onBackInvokedCallback0);
                    this.n9 = null;
                }
            }
        }
    }

    @NonNull
    private Configuration y0(@NonNull Context context0, int v, @Nullable LocaleListCompat localeListCompat0, @Nullable Configuration configuration0, boolean z) {
        int v1;
        switch(v) {
            case 1: {
                v1 = 16;
                break;
            }
            case 2: {
                v1 = 0x20;
                break;
            }
            default: {
                v1 = z ? 0 : context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
            }
        }
        Configuration configuration1 = new Configuration();
        configuration1.fontScale = 0.0f;
        if(configuration0 != null) {
            configuration1.setTo(configuration0);
        }
        configuration1.uiMode = v1 | configuration1.uiMode & -49;
        if(localeListCompat0 != null) {
            this.n1(configuration1, localeListCompat0);
        }
        return configuration1;
    }

    private void y1(int v, @Nullable LocaleListCompat localeListCompat0, boolean z, @Nullable Configuration configuration0) {
        Resources resources0 = this.x.getResources();
        Configuration configuration1 = new Configuration(resources0.getConfiguration());
        if(configuration0 != null) {
            configuration1.updateFrom(configuration0);
        }
        configuration1.uiMode = v | resources0.getConfiguration().uiMode & -49;
        if(localeListCompat0 != null) {
            this.n1(configuration1, localeListCompat0);
        }
        resources0.updateConfiguration(configuration1, null);
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 26) {
            ResourcesFlusher.a(resources0);
        }
        int v2 = this.Z8;
        if(v2 != 0) {
            this.x.setTheme(v2);
            if(v1 >= 23) {
                this.x.getTheme().applyStyle(this.Z8, true);
            }
        }
        if(z && this.w instanceof Activity) {
            this.v1(configuration1);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater z() {
        if(this.C == null) {
            this.S0();
            this.C = new SupportMenuInflater((this.B == null ? this.x : this.B.z()));
        }
        return this.C;
    }

    private ViewGroup z0() {
        ViewGroup viewGroup0;
        TypedArray typedArray0 = this.x.obtainStyledAttributes(styleable.AppCompatTheme);
        if(typedArray0.hasValue(styleable.AppCompatTheme_windowActionBar)) {
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowNoTitle, false)) {
                this.V(1);
            }
            else if(typedArray0.getBoolean(0x75, false)) {
                this.V(108);
            }
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                this.V(109);
            }
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                this.V(10);
            }
            this.O8 = typedArray0.getBoolean(styleable.AppCompatTheme_android_windowIsFloating, false);
            typedArray0.recycle();
            this.F0();
            this.y.getDecorView();
            LayoutInflater layoutInflater0 = LayoutInflater.from(this.x);
            if(this.P8) {
                viewGroup0 = this.N8 ? ((ViewGroup)layoutInflater0.inflate(layout.abc_screen_simple_overlay_action_mode, null)) : ((ViewGroup)layoutInflater0.inflate(layout.abc_screen_simple, null));
            }
            else if(this.O8) {
                viewGroup0 = (ViewGroup)layoutInflater0.inflate(layout.abc_dialog_title_material, null);
                this.M8 = false;
                this.Z = false;
            }
            else if(this.Z) {
                TypedValue typedValue0 = new TypedValue();
                this.x.getTheme().resolveAttribute(attr.actionBarTheme, typedValue0, true);
                Context context0 = typedValue0.resourceId == 0 ? this.x : new ContextThemeWrapper(this.x, typedValue0.resourceId);
                viewGroup0 = (ViewGroup)LayoutInflater.from(context0).inflate(layout.abc_screen_toolbar, null);
                DecorContentParent decorContentParent0 = (DecorContentParent)viewGroup0.findViewById(id.decor_content_parent);
                this.E = decorContentParent0;
                decorContentParent0.setWindowCallback(this.R0());
                if(this.M8) {
                    this.E.o(109);
                }
                if(this.X) {
                    this.E.o(2);
                }
                if(this.Y) {
                    this.E.o(5);
                }
            }
            else {
                viewGroup0 = null;
            }
            if(viewGroup0 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Z + ", windowActionBarOverlay: " + this.M8 + ", android:windowIsFloating: " + this.O8 + ", windowActionModeOverlay: " + this.N8 + ", windowNoTitle: " + this.P8 + " }");
            }
            ViewCompat.m2(viewGroup0, new OnApplyWindowInsetsListener() {
                final AppCompatDelegateImpl a;

                @Override  // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                    int v = windowInsetsCompat0.r();
                    int v1 = AppCompatDelegateImpl.this.z1(windowInsetsCompat0, null);
                    if(v != v1) {
                        windowInsetsCompat0 = windowInsetsCompat0.D(windowInsetsCompat0.p(), v1, windowInsetsCompat0.q(), windowInsetsCompat0.o());
                    }
                    return ViewCompat.m1(view0, windowInsetsCompat0);
                }
            });
            if(this.E == null) {
                this.P = (TextView)viewGroup0.findViewById(id.title);
            }
            ViewUtils.c(viewGroup0);
            ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)viewGroup0.findViewById(id.action_bar_activity_content);
            ViewGroup viewGroup1 = (ViewGroup)this.y.findViewById(0x1020002);
            if(viewGroup1 != null) {
                while(viewGroup1.getChildCount() > 0) {
                    View view0 = viewGroup1.getChildAt(0);
                    viewGroup1.removeViewAt(0);
                    contentFrameLayout0.addView(view0);
                }
                viewGroup1.setId(-1);
                contentFrameLayout0.setId(0x1020002);
                if(viewGroup1 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup1).setForeground(null);
                }
            }
            this.y.setContentView(viewGroup0);
            contentFrameLayout0.setAttachListener(new OnAttachListener() {
                final AppCompatDelegateImpl a;

                @Override  // androidx.appcompat.widget.ContentFrameLayout$OnAttachListener
                public void a() {
                }

                @Override  // androidx.appcompat.widget.ContentFrameLayout$OnAttachListener
                public void onDetachedFromWindow() {
                    AppCompatDelegateImpl.this.A0();
                }
            });
            return viewGroup0;
        }
        typedArray0.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");

        class androidx.appcompat.app.AppCompatDelegateImpl.4 implements OnFitSystemWindowsListener {
            final AppCompatDelegateImpl a;

            @Override  // androidx.appcompat.widget.FitWindowsViewGroup$OnFitSystemWindowsListener
            public void a(Rect rect0) {
                rect0.top = AppCompatDelegateImpl.this.z1(null, rect0);
            }
        }

    }

    final int z1(@Nullable WindowInsetsCompat windowInsetsCompat0, @Nullable Rect rect0) {
        int v10;
        int v8;
        int v1;
        int v = 0;
        if(windowInsetsCompat0 == null) {
            v1 = rect0 == null ? 0 : rect0.top;
        }
        else {
            v1 = windowInsetsCompat0.r();
        }
        if(this.I == null || !(this.I.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            v10 = 0;
        }
        else {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.I.getLayoutParams();
            int v2 = 1;
            if(this.I.isShown()) {
                if(this.i9 == null) {
                    this.i9 = new Rect();
                    this.j9 = new Rect();
                }
                Rect rect1 = this.i9;
                Rect rect2 = this.j9;
                if(windowInsetsCompat0 == null) {
                    rect1.set(rect0);
                }
                else {
                    rect1.set(windowInsetsCompat0.p(), windowInsetsCompat0.r(), windowInsetsCompat0.q(), windowInsetsCompat0.o());
                }
                ViewUtils.a(this.O, rect1, rect2);
                int v3 = rect1.top;
                int v4 = rect1.left;
                int v5 = rect1.right;
                WindowInsetsCompat windowInsetsCompat1 = ViewCompat.t0(this.O);
                int v6 = windowInsetsCompat1 == null ? 0 : windowInsetsCompat1.p();
                int v7 = windowInsetsCompat1 == null ? 0 : windowInsetsCompat1.q();
                if(viewGroup$MarginLayoutParams0.topMargin != v3 || viewGroup$MarginLayoutParams0.leftMargin != v4 || viewGroup$MarginLayoutParams0.rightMargin != v5) {
                    viewGroup$MarginLayoutParams0.topMargin = v3;
                    viewGroup$MarginLayoutParams0.leftMargin = v4;
                    viewGroup$MarginLayoutParams0.rightMargin = v5;
                    v8 = 1;
                }
                else {
                    v8 = 0;
                }
                if(v3 <= 0 || this.Q != null) {
                    View view1 = this.Q;
                    if(view1 != null) {
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                        int v9 = viewGroup$MarginLayoutParams0.topMargin;
                        if(viewGroup$MarginLayoutParams1.height != v9 || viewGroup$MarginLayoutParams1.leftMargin != v6 || viewGroup$MarginLayoutParams1.rightMargin != v7) {
                            viewGroup$MarginLayoutParams1.height = v9;
                            viewGroup$MarginLayoutParams1.leftMargin = v6;
                            viewGroup$MarginLayoutParams1.rightMargin = v7;
                            this.Q.setLayoutParams(viewGroup$MarginLayoutParams1);
                        }
                    }
                }
                else {
                    View view0 = new View(this.x);
                    this.Q = view0;
                    view0.setVisibility(8);
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, viewGroup$MarginLayoutParams0.topMargin, 51);
                    frameLayout$LayoutParams0.leftMargin = v6;
                    frameLayout$LayoutParams0.rightMargin = v7;
                    this.O.addView(this.Q, -1, frameLayout$LayoutParams0);
                }
                View view2 = this.Q;
                if(view2 == null) {
                    v2 = 0;
                }
                else if(view2.getVisibility() != 0) {
                    this.A1(this.Q);
                }
                if(!this.N8 && v2 != 0) {
                    v1 = 0;
                }
                v10 = v2;
                v2 = v8;
            }
            else if(viewGroup$MarginLayoutParams0.topMargin == 0) {
                v10 = 0;
                v2 = 0;
            }
            else {
                viewGroup$MarginLayoutParams0.topMargin = 0;
                v10 = 0;
            }
            if(v2 != 0) {
                this.I.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        View view3 = this.Q;
        if(view3 != null) {
            if(v10 == 0) {
                v = 8;
            }
            view3.setVisibility(v);
        }
        return v1;
    }

    class androidx.appcompat.app.AppCompatDelegateImpl.1 implements Thread.UncaughtExceptionHandler {
        androidx.appcompat.app.AppCompatDelegateImpl.1(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        }

        private boolean a(Throwable throwable0) {
            if(throwable0 instanceof Resources.NotFoundException) {
                String s = throwable0.getMessage();
                return s != null && (s.contains("drawable") || s.contains("Drawable"));
            }
            return false;
        }

        @Override
        public void uncaughtException(@NonNull Thread thread0, @NonNull Throwable throwable0) {
            if(this.a(throwable0)) {
                Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException(throwable0.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                resources$NotFoundException0.initCause(throwable0.getCause());
                resources$NotFoundException0.setStackTrace(throwable0.getStackTrace());
                this.a.uncaughtException(thread0, resources$NotFoundException0);
                return;
            }
            this.a.uncaughtException(thread0, throwable0);
        }
    }

}

