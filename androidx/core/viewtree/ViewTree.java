package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ViewTree")
public final class ViewTree {
    @m
    public static final ViewParent a(@l View view0) {
        L.p(view0, "<this>");
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null) {
            return viewParent0;
        }
        Object object0 = view0.getTag(id.view_tree_disjoint_parent);
        return object0 instanceof ViewParent ? ((ViewParent)object0) : null;
    }

    public static final void b(@l View view0, @m ViewParent viewParent0) {
        L.p(view0, "<this>");
        view0.setTag(id.view_tree_disjoint_parent, viewParent0);
    }
}

