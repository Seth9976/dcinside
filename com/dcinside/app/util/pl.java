package com.dcinside.app.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.dcinside.app.base.i;
import com.dcinside.app.post.view.DrawerLayout.LayoutParams;
import com.dcinside.app.post.view.DrawerLayout.d;
import com.dcinside.app.post.view.DrawerLayout;
import com.dcinside.app.post.view.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class pl extends a implements i {
    public static final class com.dcinside.app.util.pl.a extends b {
        private final WeakReference a;

        public com.dcinside.app.util.pl.a(d drawerLayout$d0) {
            this.a = new WeakReference(drawerLayout$d0);
        }

        @Override  // com.dcinside.app.util.pl$b
        public void o(int v, int v1) {
            d drawerLayout$d0 = (d)this.a.get();
            if(drawerLayout$d0 != null) {
                drawerLayout$d0.o(v, v1);
            }
        }

        @Override  // com.dcinside.app.util.pl$b
        public void onDrawerClosed(@NonNull View view0) {
            d drawerLayout$d0 = (d)this.a.get();
            if(drawerLayout$d0 != null) {
                drawerLayout$d0.onDrawerClosed(view0);
            }
        }

        @Override  // com.dcinside.app.util.pl$b
        public void onDrawerOpened(@NonNull View view0) {
            d drawerLayout$d0 = (d)this.a.get();
            if(drawerLayout$d0 != null) {
                drawerLayout$d0.onDrawerOpened(view0);
            }
        }
    }

    public static class b implements c {
        @Override  // com.dcinside.app.util.pl$c
        public void G() {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void c(@NonNull View view0, float f) {
        }

        @Override  // com.dcinside.app.util.pl$c
        public void l(DrawerLayout drawerLayout0) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void o(int v, int v1) {
        }

        @Override  // com.dcinside.app.util.pl$c
        public void onConfigurationChanged(Configuration configuration0) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerClosed(@NonNull View view0) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerOpened(@NonNull View view0) {
        }

        @Override  // com.dcinside.app.util.pl$c
        public boolean onOptionsItemSelected(MenuItem menuItem0) {
            return false;
        }
    }

    public interface c extends d {
        void G();

        void l(DrawerLayout arg1);

        void onConfigurationChanged(Configuration arg1);

        boolean onOptionsItemSelected(MenuItem arg1);
    }

    public static final class com.dcinside.app.util.pl.d implements c {
        private final View a;
        private float b;
        private WeakReference c;

        public com.dcinside.app.util.pl.d(View view0) {
            this.a = view0;
        }

        @Override  // com.dcinside.app.util.pl$c
        public void G() {
            this.c(((View)this.c.get()), (this.b() ? 1.0f : 0.0f));
        }

        private float a() {
            if(this.b == 0.0f) {
                DrawerLayout drawerLayout0 = (DrawerLayout)this.c.get();
                int v = drawerLayout0.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = drawerLayout0.getChildAt(v1).getMeasuredWidth();
                    this.b = Math.min((this.b == 0.0f ? ((float)v2) : this.b), v2);
                }
            }
            return this.b;
        }

        private boolean b() {
            return ((DrawerLayout)this.c.get()).E(0x800003);
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void c(@NonNull View view0, float f) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof LayoutParams && ((LayoutParams)viewGroup$LayoutParams0).a == 0x800003) {
                this.d(this.a() * f);
            }
        }

        private void d(float f) {
            this.a.setScrollX(((int)(-f)));
        }

        @Override  // com.dcinside.app.util.pl$c
        public void l(DrawerLayout drawerLayout0) {
            this.c = new WeakReference(drawerLayout0);
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void o(int v, int v1) {
        }

        @Override  // com.dcinside.app.util.pl$c
        public void onConfigurationChanged(Configuration configuration0) {
            this.G();
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerClosed(@NonNull View view0) {
        }

        @Override  // com.dcinside.app.post.view.DrawerLayout$d
        public void onDrawerOpened(@NonNull View view0) {
            View view1 = this.a;
            if(view1 == null) {
                return;
            }
            Context context0 = Al.h(view1.getContext());
            if(context0 instanceof AppCompatActivity) {
                Nk.a(((AppCompatActivity)context0));
            }
        }

        @Override  // com.dcinside.app.util.pl$c
        public boolean onOptionsItemSelected(MenuItem menuItem0) {
            if(this.b()) {
                ((DrawerLayout)this.c.get()).d(0x800003);
            }
            return false;
        }
    }

    private final ArrayList l;
    private final DrawerLayout m;

    private pl(Activity activity0, DrawerLayout drawerLayout0, Toolbar toolbar0, int v, int v1) {
        super(activity0, drawerLayout0, toolbar0, v, v1);
        this.l = new ArrayList();
        this.m = drawerLayout0;
        this.j(false);
        this.G();
    }

    @Override  // com.dcinside.app.post.view.a
    public void G() {
        for(Object object0: this.l) {
            ((c)object0).G();
        }
        super.G();
    }

    @Override  // com.dcinside.app.post.view.a
    public void c(View view0, float f) {
        for(Object object0: this.l) {
            ((c)object0).c(view0, f);
        }
        super.c(view0, f);
    }

    @Override  // com.dcinside.app.post.view.a
    public void o(int v, int v1) {
        for(Object object0: this.l) {
            ((c)object0).o(v, v1);
        }
        super.o(v, v1);
    }

    @Override  // com.dcinside.app.post.view.a
    public void onConfigurationChanged(Configuration configuration0) {
        for(Object object0: this.l) {
            ((c)object0).onConfigurationChanged(configuration0);
        }
        super.onConfigurationChanged(configuration0);
    }

    @Override  // com.dcinside.app.post.view.a
    public void onDrawerClosed(View view0) {
        for(Object object0: this.l) {
            ((c)object0).onDrawerClosed(view0);
        }
        super.onDrawerClosed(view0);
        this.u();
        this.G();
    }

    @Override  // com.dcinside.app.post.view.a
    public void onDrawerOpened(View view0) {
        for(Object object0: this.l) {
            ((c)object0).onDrawerOpened(view0);
        }
        super.onDrawerOpened(view0);
        this.u();
        this.G();
    }

    @Override  // com.dcinside.app.post.view.a
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        for(Object object0: this.l) {
            ((c)object0).onOptionsItemSelected(menuItem0);
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.m.setTag(0x7F0B0F1B, null);  // id:slide_helper_tag
        this.m.Q(this);
        this.l.clear();
    }

    public static pl s(DrawerLayout drawerLayout0, Toolbar toolbar0) {
        return pl.t(drawerLayout0, toolbar0, 0, 0);
    }

    public static pl t(DrawerLayout drawerLayout0, Toolbar toolbar0, int v, int v1) {
        pl pl0 = (pl)drawerLayout0.getTag(0x7F0B0F1B);  // id:slide_helper_tag
        if(pl0 != null) {
            return pl0;
        }
        pl pl1 = new pl(((Activity)drawerLayout0.getContext()), drawerLayout0, toolbar0, v, v1);
        drawerLayout0.a(pl1);
        drawerLayout0.setTag(0x7F0B0F1B, pl1);  // id:slide_helper_tag
        return pl1;
    }

    private void u() {
        Context context0 = this.m.getContext();
        if(context0 != null) {
            ((Activity)context0).invalidateOptionsMenu();
        }
    }

    public static pl v(DrawerLayout drawerLayout0) {
        return (pl)drawerLayout0.getTag(0x7F0B0F1B);  // id:slide_helper_tag
    }

    public pl w(c pl$c0) {
        pl$c0.l(this.m);
        this.l.add(pl$c0);
        return this;
    }
}

