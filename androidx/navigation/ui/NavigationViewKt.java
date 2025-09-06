package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavigationViewKt {
    public static final void a(@l NavigationView navigationView0, @l NavController navController0) {
        L.p(navigationView0, "<this>");
        L.p(navController0, "navController");
        NavigationUI.z(navigationView0, navController0);
    }
}

