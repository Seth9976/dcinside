package androidx.compose.ui.node;

import A3.a;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n54#2:98\n55#2,4:108\n116#3,2:99\n33#3,6:101\n118#3:107\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n45#1:98\n45#1:108,4\n45#1:99,2\n45#1:101,6\n45#1:107\n*E\n"})
public final class ViewInterop_androidKt {
    private static final int a;

    static {
        ViewInterop_androidKt.a = ViewInterop_androidKt.d("ViewAdapter");
    }

    @RestrictTo({Scope.b})
    @l
    public static final ViewAdapter a(@l View view0, int v, @l a a0) {
        ViewAdapter viewAdapter0;
        Object object0;
        L.p(view0, "<this>");
        L.p(a0, "factory");
        MergedViewAdapter mergedViewAdapter0 = ViewInterop_androidKt.b(view0);
        List list0 = mergedViewAdapter0.e();
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
        if(viewAdapter0 == null) {
            viewAdapter0 = (ViewAdapter)a0.invoke();
            mergedViewAdapter0.e().add(viewAdapter0);
        }
        return viewAdapter0;
    }

    @l
    public static final MergedViewAdapter b(@l View view0) {
        L.p(view0, "<this>");
        int v = ViewInterop_androidKt.a;
        Object object0 = view0.getTag(v);
        MergedViewAdapter mergedViewAdapter0 = object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
        if(mergedViewAdapter0 == null) {
            mergedViewAdapter0 = new MergedViewAdapter();
            view0.setTag(v, mergedViewAdapter0);
        }
        return mergedViewAdapter0;
    }

    @m
    public static final MergedViewAdapter c(@l View view0) {
        L.p(view0, "<this>");
        Object object0 = view0.getTag(ViewInterop_androidKt.a);
        return object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
    }

    public static final int d(@l String s) {
        L.p(s, "key");
        return s.hashCode() | 0x3000000;
    }
}

