package androidx.navigation;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final int a;
    public final Bundle b;

    public d(int v, Bundle bundle0) {
        this.a = v;
        this.b = bundle0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Navigation.h(this.a, this.b, view0);
    }
}

