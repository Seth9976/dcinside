package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView.d;

public final class a implements d {
    public final NavController a;
    public final boolean b;

    public a(NavController navController0, boolean z) {
        this.a = navController0;
        this.b = z;
    }

    @Override  // com.google.android.material.navigation.NavigationBarView$d
    public final boolean a(MenuItem menuItem0) {
        return NavigationUI.I(this.a, this.b, menuItem0);
    }
}

