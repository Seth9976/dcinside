package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;

public class ActionBarDrawerToggle implements DrawerListener {
    public interface Delegate {
        Drawable a();

        void b(Drawable arg1, @StringRes int arg2);

        void c(@StringRes int arg1);

        Context d();

        boolean e();
    }

    public interface DelegateProvider {
        @Nullable
        Delegate a();
    }

    static class FrameworkActionBarDelegate implements Delegate {
        private final Activity a;

        FrameworkActionBarDelegate(Activity activity0) {
            this.a = activity0;
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Drawable a() {
            TypedArray typedArray0 = this.d().obtainStyledAttributes(null, new int[]{0x101030B}, 0x10102CE, 0);
            Drawable drawable0 = typedArray0.getDrawable(0);
            typedArray0.recycle();
            return drawable0;
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void b(Drawable drawable0, int v) {
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeAsUpIndicator(drawable0);
                actionBar0.setHomeActionContentDescription(v);
            }
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void c(int v) {
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeActionContentDescription(v);
            }
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Context d() {
            ActionBar actionBar0 = this.a.getActionBar();
            return actionBar0 != null ? actionBar0.getThemedContext() : this.a;
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public boolean e() {
            ActionBar actionBar0 = this.a.getActionBar();
            return actionBar0 != null && (actionBar0.getDisplayOptions() & 4) != 0;
        }
    }

    static class ToolbarCompatDelegate implements Delegate {
        final Toolbar a;
        final Drawable b;
        final CharSequence c;

        ToolbarCompatDelegate(Toolbar toolbar0) {
            this.a = toolbar0;
            this.b = toolbar0.getNavigationIcon();
            this.c = toolbar0.getNavigationContentDescription();
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Drawable a() {
            return this.b;
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void b(Drawable drawable0, @StringRes int v) {
            this.a.setNavigationIcon(drawable0);
            this.c(v);
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void c(@StringRes int v) {
            if(v == 0) {
                this.a.setNavigationContentDescription(this.c);
                return;
            }
            this.a.setNavigationContentDescription(v);
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Context d() {
            return this.a.getContext();
        }

        @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public boolean e() {
            return true;
        }
    }

    private final Delegate a;
    private final DrawerLayout b;
    private DrawerArrowDrawable c;
    private boolean d;
    private Drawable e;
    boolean f;
    private boolean g;
    private final int h;
    private final int i;
    View.OnClickListener j;
    private boolean k;

    ActionBarDrawerToggle(Activity activity0, Toolbar toolbar0, DrawerLayout drawerLayout0, DrawerArrowDrawable drawerArrowDrawable0, @StringRes int v, @StringRes int v1) {
        this.d = true;
        this.f = true;
        this.k = false;
        if(toolbar0 != null) {
            this.a = new ToolbarCompatDelegate(toolbar0);
            toolbar0.setNavigationOnClickListener(new View.OnClickListener() {
                final ActionBarDrawerToggle a;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    ActionBarDrawerToggle actionBarDrawerToggle0 = ActionBarDrawerToggle.this;
                    if(actionBarDrawerToggle0.f) {
                        actionBarDrawerToggle0.t();
                        return;
                    }
                    View.OnClickListener view$OnClickListener0 = actionBarDrawerToggle0.j;
                    if(view$OnClickListener0 != null) {
                        view$OnClickListener0.onClick(view0);
                    }
                }
            });
        }
        else if(activity0 instanceof DelegateProvider) {
            this.a = ((DelegateProvider)activity0).a();
        }
        else {
            this.a = new FrameworkActionBarDelegate(activity0);
        }
        this.b = drawerLayout0;
        this.h = v;
        this.i = v1;
        this.c = drawerArrowDrawable0 == null ? new DrawerArrowDrawable(this.a.d()) : drawerArrowDrawable0;
        this.e = this.b();
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, @StringRes int v, @StringRes int v1) {
        this(activity0, null, drawerLayout0, null, v, v1);
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, Toolbar toolbar0, @StringRes int v, @StringRes int v1) {
        this(activity0, toolbar0, drawerLayout0, null, v, v1);
    }

    @NonNull
    public DrawerArrowDrawable a() {
        return this.c;
    }

    Drawable b() {
        return this.a.a();
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void c(View view0, float f) {
        if(this.d) {
            this.q(Math.min(1.0f, Math.max(0.0f, f)));
            return;
        }
        this.q(0.0f);
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void d(int v) {
    }

    public View.OnClickListener e() {
        return this.j;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.d;
    }

    public void h(Configuration configuration0) {
        if(!this.g) {
            this.e = this.b();
        }
        this.s();
    }

    public boolean i(MenuItem menuItem0) {
        if(menuItem0 != null && menuItem0.getItemId() == 0x102002C && this.f) {
            this.t();
            return true;
        }
        return false;
    }

    void j(int v) {
        this.a.c(v);
    }

    void k(Drawable drawable0, int v) {
        if(!this.k && !this.a.e()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        this.a.b(drawable0, v);
    }

    public void l(@NonNull DrawerArrowDrawable drawerArrowDrawable0) {
        this.c = drawerArrowDrawable0;
        this.s();
    }

    public void m(boolean z) {
        if(z != this.f) {
            if(z) {
                this.k(this.c, (this.b.C(0x800003) ? this.i : this.h));
            }
            else {
                this.k(this.e, 0);
            }
            this.f = z;
        }
    }

    public void n(boolean z) {
        this.d = z;
        if(!z) {
            this.q(0.0f);
        }
    }

    public void o(int v) {
        this.p((v == 0 ? null : this.b.getResources().getDrawable(v)));
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerClosed(View view0) {
        this.q(0.0f);
        if(this.f) {
            this.j(this.h);
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerOpened(View view0) {
        this.q(1.0f);
        if(this.f) {
            this.j(this.i);
        }
    }

    public void p(Drawable drawable0) {
        if(drawable0 == null) {
            this.e = this.b();
            this.g = false;
        }
        else {
            this.e = drawable0;
            this.g = true;
        }
        if(!this.f) {
            this.k(this.e, 0);
        }
    }

    private void q(float f) {
        switch(f) {
            case 0: {
                this.c.t(false);
                break;
            }
            case 0x3F800000: {
                this.c.t(true);
            }
        }
        this.c.setProgress(f);
    }

    public void r(View.OnClickListener view$OnClickListener0) {
        this.j = view$OnClickListener0;
    }

    public void s() {
        if(this.b.C(0x800003)) {
            this.q(1.0f);
        }
        else {
            this.q(0.0f);
        }
        if(this.f) {
            this.k(this.c, (this.b.C(0x800003) ? this.i : this.h));
        }
    }

    void t() {
        int v = this.b.q(0x800003);
        if(this.b.F(0x800003) && v != 2) {
            this.b.d(0x800003);
            return;
        }
        if(v != 1) {
            this.b.K(0x800003);
        }
    }
}

