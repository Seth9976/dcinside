package com.dcinside.app.post.view;

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

public class a implements d {
    public interface b {
        Drawable a();

        void b(Drawable arg1, @StringRes int arg2);

        void c(@StringRes int arg1);

        Context d();

        boolean e();
    }

    public interface c {
        @Nullable
        b a();
    }

    static class com.dcinside.app.post.view.a.d implements b {
        private final Activity a;

        com.dcinside.app.post.view.a.d(Activity activity0) {
            this.a = activity0;
        }

        @Override  // com.dcinside.app.post.view.a$b
        public Drawable a() {
            TypedArray typedArray0 = this.d().obtainStyledAttributes(null, new int[]{0x101030B}, 0x10102CE, 0);
            Drawable drawable0 = typedArray0.getDrawable(0);
            typedArray0.recycle();
            return drawable0;
        }

        @Override  // com.dcinside.app.post.view.a$b
        public void b(Drawable drawable0, int v) {
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeAsUpIndicator(drawable0);
                actionBar0.setHomeActionContentDescription(v);
            }
        }

        @Override  // com.dcinside.app.post.view.a$b
        public void c(int v) {
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeActionContentDescription(v);
            }
        }

        @Override  // com.dcinside.app.post.view.a$b
        public Context d() {
            ActionBar actionBar0 = this.a.getActionBar();
            return actionBar0 != null ? actionBar0.getThemedContext() : this.a;
        }

        @Override  // com.dcinside.app.post.view.a$b
        public boolean e() {
            ActionBar actionBar0 = this.a.getActionBar();
            return actionBar0 != null && (actionBar0.getDisplayOptions() & 4) != 0;
        }
    }

    static class e implements b {
        final Toolbar a;
        final Drawable b;
        final CharSequence c;

        e(Toolbar toolbar0) {
            this.a = toolbar0;
            this.b = toolbar0.getNavigationIcon();
            this.c = toolbar0.getNavigationContentDescription();
        }

        @Override  // com.dcinside.app.post.view.a$b
        public Drawable a() {
            return this.b;
        }

        @Override  // com.dcinside.app.post.view.a$b
        public void b(Drawable drawable0, @StringRes int v) {
            this.a.setNavigationIcon(drawable0);
            this.c(v);
        }

        @Override  // com.dcinside.app.post.view.a$b
        public void c(@StringRes int v) {
            if(v == 0) {
                this.a.setNavigationContentDescription(this.c);
                return;
            }
            this.a.setNavigationContentDescription(v);
        }

        @Override  // com.dcinside.app.post.view.a$b
        public Context d() {
            return this.a.getContext();
        }

        @Override  // com.dcinside.app.post.view.a$b
        public boolean e() {
            return true;
        }
    }

    private final b a;
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

    a(Activity activity0, Toolbar toolbar0, DrawerLayout drawerLayout0, DrawerArrowDrawable drawerArrowDrawable0, @StringRes int v, @StringRes int v1) {
        class com.dcinside.app.post.view.a.a implements View.OnClickListener {
            final a a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                a a0 = a.this;
                if(a0.f) {
                    a0.r();
                    return;
                }
                View.OnClickListener view$OnClickListener0 = a0.j;
                if(view$OnClickListener0 != null) {
                    view$OnClickListener0.onClick(view0);
                }
            }
        }

        this.d = true;
        this.f = true;
        this.k = false;
        if(toolbar0 != null) {
            this.a = new e(toolbar0);
            toolbar0.setNavigationOnClickListener(new com.dcinside.app.post.view.a.a(this));
        }
        else if(activity0 instanceof c) {
            this.a = ((c)activity0).a();
        }
        else {
            this.a = new com.dcinside.app.post.view.a.d(activity0);
        }
        this.b = drawerLayout0;
        this.h = v;
        this.i = v1;
        this.c = drawerArrowDrawable0 == null ? new DrawerArrowDrawable(this.a.d()) : drawerArrowDrawable0;
        this.e = this.b();
    }

    public a(Activity activity0, DrawerLayout drawerLayout0, @StringRes int v, @StringRes int v1) {
        this(activity0, null, drawerLayout0, null, v, v1);
    }

    public a(Activity activity0, DrawerLayout drawerLayout0, Toolbar toolbar0, @StringRes int v, @StringRes int v1) {
        this(activity0, toolbar0, drawerLayout0, null, v, v1);
    }

    public void G() {
        if(this.b.E(0x800003)) {
            this.p(1.0f);
        }
        else {
            this.p(0.0f);
        }
        if(this.f) {
            this.h(this.c, (this.b.E(0x800003) ? this.i : this.h));
        }
    }

    @NonNull
    public DrawerArrowDrawable a() {
        return this.c;
    }

    Drawable b() {
        return this.a.a();
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void c(View view0, float f) {
        if(this.d) {
            this.p(Math.min(1.0f, Math.max(0.0f, f)));
            return;
        }
        this.p(0.0f);
    }

    public View.OnClickListener d() {
        return this.j;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.d;
    }

    void g(int v) {
        this.a.c(v);
    }

    void h(Drawable drawable0, int v) {
        if(!this.k && !this.a.e()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        this.a.b(drawable0, v);
    }

    public void i(@NonNull DrawerArrowDrawable drawerArrowDrawable0) {
        this.c = drawerArrowDrawable0;
        this.G();
    }

    public void j(boolean z) {
        if(z != this.f) {
            if(z) {
                this.h(this.c, (this.b.E(0x800003) ? this.i : this.h));
            }
            else {
                this.h(this.e, 0);
            }
            this.f = z;
        }
    }

    public void k(boolean z) {
        this.d = z;
        if(!z) {
            this.p(0.0f);
        }
    }

    public void m(int v) {
        this.n((v == 0 ? null : this.b.getResources().getDrawable(v)));
    }

    public void n(Drawable drawable0) {
        if(drawable0 == null) {
            this.e = this.b();
            this.g = false;
        }
        else {
            this.e = drawable0;
            this.g = true;
        }
        if(!this.f) {
            this.h(this.e, 0);
        }
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void o(int v, int v1) {
    }

    public void onConfigurationChanged(Configuration configuration0) {
        if(!this.g) {
            this.e = this.b();
        }
        this.G();
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void onDrawerClosed(View view0) {
        this.p(0.0f);
        if(this.f) {
            this.g(this.h);
        }
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout$d
    public void onDrawerOpened(View view0) {
        this.p(1.0f);
        if(this.f) {
            this.g(this.i);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0 != null && menuItem0.getItemId() == 0x102002C && this.f) {
            this.r();
            return true;
        }
        return false;
    }

    private void p(float f) {
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

    public void q(View.OnClickListener view$OnClickListener0) {
        this.j = view$OnClickListener0;
    }

    void r() {
        int v = this.b.q(0x800003);
        if(this.b.H(0x800003) && v != 2) {
            this.b.d(0x800003);
            return;
        }
        if(v != 1) {
            this.b.M(0x800003);
        }
    }
}

