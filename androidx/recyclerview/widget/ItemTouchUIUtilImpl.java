package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.id;

class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil a;

    static {
        ItemTouchUIUtilImpl.a = new ItemTouchUIUtilImpl();
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public void a(@NonNull View view0) {
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public void b(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull View view0, float f, float f1, int v, boolean z) {
        if(z && view0.getTag(id.item_touch_helper_previous_elevation) == null) {
            Float float0 = ViewCompat.V(view0);
            ViewCompat.X1(view0, ItemTouchUIUtilImpl.e(recyclerView0, view0) + 1.0f);
            view0.setTag(0x7F0B06CF, float0);  // id:item_touch_helper_previous_elevation
        }
        view0.setTranslationX(f);
        view0.setTranslationY(f1);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public void c(@NonNull View view0) {
        Object object0 = view0.getTag(id.item_touch_helper_previous_elevation);
        if(object0 instanceof Float) {
            ViewCompat.X1(view0, ((float)(((Float)object0))));
        }
        view0.setTag(0x7F0B06CF, null);  // id:item_touch_helper_previous_elevation
        view0.setTranslationX(0.0f);
        view0.setTranslationY(0.0f);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchUIUtil
    public void d(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull View view0, float f, float f1, int v, boolean z) {
    }

    private static float e(RecyclerView recyclerView0, View view0) {
        int v = recyclerView0.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = recyclerView0.getChildAt(v1);
            if(view1 != view0) {
                float f1 = ViewCompat.V(view1);
                if(f1 > f) {
                    f = f1;
                }
            }
        }
        return f;
    }
}

