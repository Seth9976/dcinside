package androidx.core.view;

import android.view.View.OnLongClickListener;
import android.view.View;

public final class t implements View.OnLongClickListener {
    public final DragStartHelper a;

    public t(DragStartHelper dragStartHelper0) {
        this.a = dragStartHelper0;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        return this.a.d(view0);
    }
}

