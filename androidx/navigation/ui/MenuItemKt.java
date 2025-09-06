package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.jvm.internal.L;
import y4.l;

public final class MenuItemKt {
    public static final boolean a(@l MenuItem menuItem0, @l NavController navController0) {
        L.p(menuItem0, "<this>");
        L.p(navController0, "navController");
        return NavigationUI.l(menuItem0, navController0);
    }
}

