package androidx.navigation.ui;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.navigation.NavController;

public final class d implements View.OnClickListener {
    public final NavController a;
    public final AppBarConfiguration b;

    public d(NavController navController0, AppBarConfiguration appBarConfiguration0) {
        this.a = navController0;
        this.b = appBarConfiguration0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        NavigationUI.E(this.a, this.b, view0);
    }
}

