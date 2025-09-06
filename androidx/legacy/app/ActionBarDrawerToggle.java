package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

@Deprecated
public class ActionBarDrawerToggle implements DrawerListener {
    @Deprecated
    public interface Delegate {
        @Nullable
        Drawable a();

        void b(Drawable arg1, @StringRes int arg2);

        void c(@StringRes int arg1);
    }

    @Deprecated
    public interface DelegateProvider {
        @Nullable
        Delegate a();
    }

    static class SetIndicatorInfo {
        Method a;
        Method b;
        ImageView c;

        SetIndicatorInfo(Activity activity0) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                View view0 = activity0.findViewById(0x102002C);
                if(view0 == null) {
                    return;
                }
                ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
                if(viewGroup0.getChildCount() != 2) {
                    return;
                }
                View view1 = viewGroup0.getChildAt(0);
                View view2 = viewGroup0.getChildAt(1);
                if(view1.getId() == 0x102002C) {
                    view1 = view2;
                }
                if(view1 instanceof ImageView) {
                    this.c = (ImageView)view1;
                }
            }
        }
    }

    class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        private final boolean a;
        private final Rect b;
        private float c;
        private float d;
        final ActionBarDrawerToggle e;

        SlideDrawable(Drawable drawable0) {
            super(drawable0, 0);
            this.a = true;
            this.b = new Rect();
        }

        public float a() {
            return this.c;
        }

        public void b(float f) {
            this.d = f;
            this.invalidateSelf();
        }

        public void c(float f) {
            this.c = f;
            this.invalidateSelf();
        }

        @Override  // android.graphics.drawable.DrawableWrapper
        public void draw(@NonNull Canvas canvas0) {
            this.copyBounds(this.b);
            canvas0.save();
            int v = 1;
            boolean z = ViewCompat.e0(ActionBarDrawerToggle.this.a.getWindow().getDecorView()) == 1;
            if(z) {
                v = -1;
            }
            int v1 = this.b.width();
            canvas0.translate(-this.d * ((float)v1) * this.c * ((float)v), 0.0f);
            if(z && !this.a) {
                canvas0.translate(((float)v1), 0.0f);
                canvas0.scale(-1.0f, 1.0f);
            }
            super.draw(canvas0);
            canvas0.restore();
        }
    }

    final Activity a;
    private final Delegate b;
    private final DrawerLayout c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private Drawable g;
    private SlideDrawable h;
    private final int i;
    private final int j;
    private final int k;
    private SetIndicatorInfo l;
    private static final String m = "ActionBarDrawerToggle";
    private static final int[] n = null;
    private static final float o = 0.333333f;
    private static final int p = 0x102002C;

    static {
        ActionBarDrawerToggle.n = new int[]{0x101030B};
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, @DrawableRes int v, @StringRes int v1, @StringRes int v2) {
        this(activity0, drawerLayout0, !ActionBarDrawerToggle.a(activity0), v, v1, v2);
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, boolean z, @DrawableRes int v, @StringRes int v1, @StringRes int v2) {
        this.d = true;
        this.a = activity0;
        this.b = activity0 instanceof DelegateProvider ? ((DelegateProvider)activity0).a() : null;
        this.c = drawerLayout0;
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.f = this.b();
        this.g = ContextCompat.getDrawable(activity0, v);
        SlideDrawable actionBarDrawerToggle$SlideDrawable0 = new SlideDrawable(this, this.g);
        this.h = actionBarDrawerToggle$SlideDrawable0;
        actionBarDrawerToggle$SlideDrawable0.b((z ? 0.333333f : 0.0f));
    }

    private static boolean a(Context context0) {
        return true;
    }

    private Drawable b() {
        Delegate actionBarDrawerToggle$Delegate0 = this.b;
        if(actionBarDrawerToggle$Delegate0 != null) {
            return actionBarDrawerToggle$Delegate0.a();
        }
        ActionBar actionBar0 = this.a.getActionBar();
        Context context0 = actionBar0 == null ? this.a : actionBar0.getThemedContext();
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, ActionBarDrawerToggle.n, 0x10102CE, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        typedArray0.recycle();
        return drawable0;
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void c(View view0, float f) {
        float f1 = this.h.a();
        this.h.c((f > 0.5f ? Math.max(f1, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(f1, f * 2.0f)));
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void d(int v) {
    }

    public boolean e() {
        return this.d;
    }

    public void f(Configuration configuration0) {
        if(!this.e) {
            this.f = this.b();
        }
        this.g = ContextCompat.getDrawable(this.a, this.i);
        this.m();
    }

    public boolean g(MenuItem menuItem0) {
        if(menuItem0 != null && menuItem0.getItemId() == 0x102002C && this.d) {
            if(this.c.F(0x800003)) {
                this.c.d(0x800003);
                return true;
            }
            this.c.K(0x800003);
            return true;
        }
        return false;
    }

    private void h(int v) {
        Delegate actionBarDrawerToggle$Delegate0 = this.b;
        if(actionBarDrawerToggle$Delegate0 != null) {
            actionBarDrawerToggle$Delegate0.c(v);
            return;
        }
        ActionBar actionBar0 = this.a.getActionBar();
        if(actionBar0 != null) {
            actionBar0.setHomeActionContentDescription(v);
        }
    }

    private void i(Drawable drawable0, int v) {
        Delegate actionBarDrawerToggle$Delegate0 = this.b;
        if(actionBarDrawerToggle$Delegate0 != null) {
            actionBarDrawerToggle$Delegate0.b(drawable0, v);
            return;
        }
        ActionBar actionBar0 = this.a.getActionBar();
        if(actionBar0 != null) {
            actionBar0.setHomeAsUpIndicator(drawable0);
            actionBar0.setHomeActionContentDescription(v);
        }
    }

    public void j(boolean z) {
        if(z != this.d) {
            if(z) {
                this.i(this.h, (this.c.C(0x800003) ? this.k : this.j));
            }
            else {
                this.i(this.f, 0);
            }
            this.d = z;
        }
    }

    public void k(int v) {
        this.l((v == 0 ? null : ContextCompat.getDrawable(this.a, v)));
    }

    public void l(Drawable drawable0) {
        if(drawable0 == null) {
            this.f = this.b();
            this.e = false;
        }
        else {
            this.f = drawable0;
            this.e = true;
        }
        if(!this.d) {
            this.i(this.f, 0);
        }
    }

    public void m() {
        if(this.c.C(0x800003)) {
            this.h.c(1.0f);
        }
        else {
            this.h.c(0.0f);
        }
        if(this.d) {
            this.i(this.h, (this.c.C(0x800003) ? this.k : this.j));
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerClosed(View view0) {
        this.h.c(0.0f);
        if(this.d) {
            this.h(this.j);
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerOpened(View view0) {
        this.h.c(1.0f);
        if(this.d) {
            this.h(this.k);
        }
    }
}

