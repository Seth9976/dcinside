package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    @l
    private final WeakReference f;

    public ToolbarOnDestinationChangedListener(@l Toolbar toolbar0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(toolbar0, "toolbar");
        L.p(appBarConfiguration0, "configuration");
        Context context0 = toolbar0.getContext();
        L.o(context0, "toolbar.context");
        super(context0, appBarConfiguration0);
        this.f = new WeakReference(toolbar0);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
        L.p(navController0, "controller");
        L.p(navDestination0, "destination");
        if(((Toolbar)this.f.get()) == null) {
            navController0.G0(this);
            return;
        }
        super.a(navController0, navDestination0, bundle0);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void c(@m Drawable drawable0, @StringRes int v) {
        Toolbar toolbar0 = (Toolbar)this.f.get();
        if(toolbar0 != null) {
            boolean z = drawable0 == null && toolbar0.getNavigationIcon() != null;
            toolbar0.setNavigationIcon(drawable0);
            toolbar0.setNavigationContentDescription(v);
            if(z) {
                TransitionManager.a(toolbar0);
            }
        }
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void d(@m CharSequence charSequence0) {
        Toolbar toolbar0 = (Toolbar)this.f.get();
        if(toolbar0 != null) {
            toolbar0.setTitle(charSequence0);
        }
    }
}

