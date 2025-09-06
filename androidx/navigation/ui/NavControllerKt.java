package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NavControllerKt {
    public static final boolean a(@l NavController navController0, @m Openable openable0) {
        L.p(navController0, "<this>");
        return NavigationUI.k(navController0, new Builder(navController0.K()).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e)).a());
    }

    public static final boolean b(@l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(navController0, "<this>");
        L.p(appBarConfiguration0, "appBarConfiguration");
        return NavigationUI.k(navController0, appBarConfiguration0);
    }
}

