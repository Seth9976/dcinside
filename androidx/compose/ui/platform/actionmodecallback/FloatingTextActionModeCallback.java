package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode.Callback2;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(23)
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    @l
    private final TextActionModeCallback a;

    public FloatingTextActionModeCallback(@l TextActionModeCallback textActionModeCallback0) {
        L.p(textActionModeCallback0, "callback");
        super();
        this.a = textActionModeCallback0;
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onActionItemClicked(@m ActionMode actionMode0, @m MenuItem menuItem0) {
        return this.a.i(actionMode0, menuItem0);
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onCreateActionMode(@m ActionMode actionMode0, @m Menu menu0) {
        return this.a.j(actionMode0, menu0);
    }

    @Override  // android.view.ActionMode$Callback
    public void onDestroyActionMode(@m ActionMode actionMode0) {
        this.a.k();
    }

    @Override  // android.view.ActionMode$Callback2
    public void onGetContentRect(@m ActionMode actionMode0, @m View view0, @m Rect rect0) {
        androidx.compose.ui.geometry.Rect rect1 = this.a.h();
        if(rect0 != null) {
            rect0.set(((int)rect1.t()), ((int)rect1.B()), ((int)rect1.x()), ((int)rect1.j()));
        }
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onPrepareActionMode(@m ActionMode actionMode0, @m Menu menu0) {
        return this.a.l(actionMode0, menu0);
    }
}

