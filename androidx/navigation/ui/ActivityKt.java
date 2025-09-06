package androidx.navigation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ActivityKt {
    public static final void a(@l AppCompatActivity appCompatActivity0, @l NavController navController0, @m DrawerLayout drawerLayout0) {
        L.p(appCompatActivity0, "<this>");
        L.p(navController0, "navController");
        NavigationUI.p(appCompatActivity0, navController0, new Builder(navController0.K()).d(drawerLayout0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a());
    }

    public static final void b(@l AppCompatActivity appCompatActivity0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(appCompatActivity0, "<this>");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        NavigationUI.p(appCompatActivity0, navController0, appBarConfiguration0);
    }

    public static void c(AppCompatActivity appCompatActivity0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 2) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).d(null).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a();
        }
        ActivityKt.b(appCompatActivity0, navController0, appBarConfiguration0);
    }
}

