package androidx.compose.ui.node;

import A3.a;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n116#2,2:98\n33#2,6:100\n118#2:106\n33#2,6:107\n33#2,6:113\n33#2,6:119\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n54#1:98,2\n54#1:100,6\n54#1:106\n62#1:107,6\n66#1:113,6\n70#1:119,6\n*E\n"})
public final class MergedViewAdapter implements ViewAdapter {
    private final int a;
    @l
    private final List b;

    public MergedViewAdapter() {
        this.b = new ArrayList();
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void a(@l View view0, @l ViewGroup viewGroup0) {
        L.p(view0, "view");
        L.p(viewGroup0, "parent");
        List list0 = this.b;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)list0.get(v1)).a(view0, viewGroup0);
        }
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void b(@l View view0, @l ViewGroup viewGroup0) {
        L.p(view0, "view");
        L.p(viewGroup0, "parent");
        List list0 = this.b;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)list0.get(v1)).b(view0, viewGroup0);
        }
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void c(@l View view0, @l ViewGroup viewGroup0) {
        L.p(view0, "view");
        L.p(viewGroup0, "parent");
        List list0 = this.b;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)list0.get(v1)).c(view0, viewGroup0);
        }
    }

    @l
    public final ViewAdapter d(int v, @l a a0) {
        ViewAdapter viewAdapter0;
        Object object0;
        L.p(a0, "factory");
        List list0 = this.e();
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            viewAdapter0 = null;
            if(v2 >= v1) {
                break;
            }
            Object object1 = list0.get(v2);
            if(((ViewAdapter)object1).getId() == v) {
                object0 = object1;
                break;
            }
        }
        if(object0 instanceof ViewAdapter) {
            viewAdapter0 = (ViewAdapter)object0;
        }
        if(viewAdapter0 != null) {
            return viewAdapter0;
        }
        ViewAdapter viewAdapter1 = (ViewAdapter)a0.invoke();
        this.e().add(viewAdapter1);
        return viewAdapter1;
    }

    @l
    public final List e() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.a;
    }
}

