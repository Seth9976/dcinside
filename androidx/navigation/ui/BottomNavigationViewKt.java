package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.L;
import y4.l;

public final class BottomNavigationViewKt {
    public static final void a(@l NavigationBarView navigationBarView0, @l NavController navController0) {
        L.p(navigationBarView0, "<this>");
        L.p(navController0, "navController");
        NavigationUI.x(navigationBarView0, navController0);
    }
}

