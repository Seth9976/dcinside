package androidx.navigation;

import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final NavDirections a;

    public c(NavDirections navDirections0) {
        this.a = navDirections0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Navigation.i(this.a, view0);
    }
}

