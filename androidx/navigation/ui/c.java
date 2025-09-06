package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView.d;
import com.google.android.material.navigation.NavigationView;

public final class c implements d {
    public final NavController a;
    public final boolean b;
    public final NavigationView c;

    public c(NavController navController0, boolean z, NavigationView navigationView0) {
        this.a = navController0;
        this.b = z;
        this.c = navigationView0;
    }

    @Override  // com.google.android.material.navigation.NavigationView$d
    public final boolean a(MenuItem menuItem0) {
        return NavigationUI.G(this.a, this.b, this.c, menuItem0);
    }
}

