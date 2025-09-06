package androidx.compose.ui.platform;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(23)
public final class TextToolbarHelperMethods {
    @l
    public static final TextToolbarHelperMethods a;

    static {
        TextToolbarHelperMethods.a = new TextToolbarHelperMethods();
    }

    @DoNotInline
    @RequiresApi(23)
    public final void a(@l ActionMode actionMode0) {
        L.p(actionMode0, "actionMode");
        actionMode0.invalidateContentRect();
    }

    @DoNotInline
    @RequiresApi(23)
    @m
    public final ActionMode b(@l View view0, @l ActionMode.Callback actionMode$Callback0, int v) {
        L.p(view0, "view");
        L.p(actionMode$Callback0, "actionModeCallback");
        return view0.startActionMode(actionMode$Callback0, v);
    }
}

