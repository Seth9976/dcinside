package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ToolbarKt {
    public static final void a(@l Toolbar toolbar0, @l NavController navController0, @m DrawerLayout drawerLayout0) {
        L.p(toolbar0, "<this>");
        L.p(navController0, "navController");
        NavigationUI.t(toolbar0, navController0, new Builder(navController0.K()).d(drawerLayout0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a());
    }

    public static final void b(@l Toolbar toolbar0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(toolbar0, "<this>");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        NavigationUI.t(toolbar0, navController0, appBarConfiguration0);
    }

    public static void c(Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 2) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).d(null).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a();
        }
        ToolbarKt.b(toolbar0, navController0, appBarConfiguration0);
    }
}

