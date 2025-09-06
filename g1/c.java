package G1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class c {
    @NonNull
    private final View a;
    private boolean b;
    @IdRes
    private int c;

    public c(b b0) {
        this.b = false;
        this.c = 0;
        this.a = (View)b0;
    }

    private void a() {
        ViewParent viewParent0 = this.a.getParent();
        if(viewParent0 instanceof CoordinatorLayout) {
            ((CoordinatorLayout)viewParent0).k(this.a);
        }
    }

    @IdRes
    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@NonNull Bundle bundle0) {
        this.b = bundle0.getBoolean("expanded", false);
        this.c = bundle0.getInt("expandedComponentIdHint", 0);
        if(this.b) {
            this.a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("expanded", this.b);
        bundle0.putInt("expandedComponentIdHint", this.c);
        return bundle0;
    }

    public boolean f(boolean z) {
        if(this.b != z) {
            this.b = z;
            this.a();
            return true;
        }
        return false;
    }

    public void g(@IdRes int v) {
        this.c = v;
    }
}

