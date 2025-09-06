package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n54#1:99,2\n61#1:101,2\n*E\n"})
public final class AndroidViewsHandler extends ViewGroup {
    @l
    private final HashMap a;
    @l
    private final HashMap b;

    public AndroidViewsHandler(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final void a(@l AndroidViewHolder androidViewHolder0, @l Canvas canvas0) {
        L.p(androidViewHolder0, "view");
        L.p(canvas0, "canvas");
        androidViewHolder0.draw(canvas0);
    }

    @m
    public Void b(@m int[] arr_v, @m Rect rect0) [...] // Inlined contents

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@m MotionEvent motionEvent0) {
        return true;
    }

    @l
    public final HashMap getHolderToLayoutNode() {
        return this.a;
    }

    @l
    public final HashMap getLayoutNodeToHolder() {
        return this.b;
    }

    @Override  // android.view.ViewGroup
    public ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@l View view0, @l View view1) {
        L.p(view0, "child");
        L.p(view1, "target");
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Set set0 = this.a.keySet();
        L.o(set0, "holderToLayoutNode.keys");
        for(Object object0: set0) {
            ((AndroidViewHolder)object0).layout(((AndroidViewHolder)object0).getLeft(), ((AndroidViewHolder)object0).getTop(), ((AndroidViewHolder)object0).getRight(), ((AndroidViewHolder)object0).getBottom());
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getMode(v) != 0x40000000 || View.MeasureSpec.getMode(v1) != 0x40000000) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        Set set0 = this.a.keySet();
        L.o(set0, "holderToLayoutNode.keys");
        for(Object object0: set0) {
            ((AndroidViewHolder)object0).k();
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        this.cleanupLayoutState(this);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            LayoutNode layoutNode0 = (LayoutNode)this.a.get(view0);
            if(view0.isLayoutRequested() && layoutNode0 != null) {
                LayoutNode.C1(layoutNode0, false, 1, null);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

