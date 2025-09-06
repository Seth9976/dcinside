package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle.Delegate;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    @l
    private final AppCompatActivity f;

    public ActionBarOnDestinationChangedListener(@l AppCompatActivity appCompatActivity0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(appCompatActivity0, "activity");
        L.p(appBarConfiguration0, "configuration");
        Delegate actionBarDrawerToggle$Delegate0 = appCompatActivity0.a();
        if(actionBarDrawerToggle$Delegate0 == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity0 + " does not have an DrawerToggleDelegate set").toString());
        }
        Context context0 = actionBarDrawerToggle$Delegate0.d();
        L.o(context0, "checkNotNull(activity.dr… }.actionBarThemedContext");
        super(context0, appBarConfiguration0);
        this.f = appCompatActivity0;
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void c(@m Drawable drawable0, @StringRes int v) {
        ActionBar actionBar0 = this.f.I0();
        if(actionBar0 == null) {
            throw new IllegalStateException(("Activity " + this.f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        L.o(actionBar0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        actionBar0.X(drawable0 != null);
        Delegate actionBarDrawerToggle$Delegate0 = this.f.a();
        if(actionBarDrawerToggle$Delegate0 == null) {
            throw new IllegalStateException(("Activity " + this.f + " does not have an DrawerToggleDelegate set").toString());
        }
        L.o(actionBarDrawerToggle$Delegate0, "checkNotNull(activity.dr…leDelegate set\"\n        }");
        actionBarDrawerToggle$Delegate0.b(drawable0, v);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void d(@m CharSequence charSequence0) {
        ActionBar actionBar0 = this.f.I0();
        if(actionBar0 == null) {
            throw new IllegalStateException(("Activity " + this.f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        L.o(actionBar0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        actionBar0.z0(charSequence0);
    }
}

