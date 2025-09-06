package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CollapsingToolbarLayoutKt {
    public static final void a(@l CollapsingToolbarLayout collapsingToolbarLayout0, @l Toolbar toolbar0, @l NavController navController0, @m DrawerLayout drawerLayout0) {
        L.p(collapsingToolbarLayout0, "<this>");
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        NavigationUI.w(collapsingToolbarLayout0, toolbar0, navController0, new Builder(navController0.K()).d(drawerLayout0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a());
    }

    public static final void b(@l CollapsingToolbarLayout collapsingToolbarLayout0, @l Toolbar toolbar0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(collapsingToolbarLayout0, "<this>");
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        NavigationUI.w(collapsingToolbarLayout0, toolbar0, navController0, appBarConfiguration0);
    }

    public static void c(CollapsingToolbarLayout collapsingToolbarLayout0, Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 4) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).d(null).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a();
        }
        CollapsingToolbarLayoutKt.b(collapsingToolbarLayout0, toolbar0, navController0, appBarConfiguration0);
    }
}

