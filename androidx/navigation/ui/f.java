package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView.d;
import com.google.android.material.navigation.NavigationView;

public final class f implements d {
    public final NavController a;
    public final NavigationView b;

    public f(NavController navController0, NavigationView navigationView0) {
        this.a = navController0;
        this.b = navigationView0;
    }

    @Override  // com.google.android.material.navigation.NavigationView$d
    public final boolean a(MenuItem menuItem0) {
        return NavigationUI.F(this.a, this.b, menuItem0);
    }
}

