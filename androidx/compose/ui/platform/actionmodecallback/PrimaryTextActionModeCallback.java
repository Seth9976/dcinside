package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    @l
    private final TextActionModeCallback a;

    public PrimaryTextActionModeCallback(@l TextActionModeCallback textActionModeCallback0) {
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

    @Override  // android.view.ActionMode$Callback
    public boolean onPrepareActionMode(@m ActionMode actionMode0, @m Menu menu0) {
        return this.a.l(actionMode0, menu0);
    }
}

