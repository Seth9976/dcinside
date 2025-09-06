package androidx.navigation.ui;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.navigation.NavController;

public final class b implements View.OnClickListener {
    public final NavController a;
    public final AppBarConfiguration b;

    public b(NavController navController0, AppBarConfiguration appBarConfiguration0) {
        this.a = navController0;
        this.b = appBarConfiguration0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        NavigationUI.D(this.a, this.b, view0);
    }
}

