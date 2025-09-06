package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView.d;

public final class e implements d {
    public final NavController a;

    public e(NavController navController0) {
        this.a = navController0;
    }

    @Override  // com.google.android.material.navigation.NavigationBarView$d
    public final boolean a(MenuItem menuItem0) {
        return NavigationUI.H(this.a, menuItem0);
    }
}

