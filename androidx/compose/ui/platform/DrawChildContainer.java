package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R.id;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import kotlin.jvm.internal.L;
import y4.l;

public class DrawChildContainer extends ViewGroup {
    private boolean a;

    public DrawChildContainer(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.setClipChildren(false);
        this.setTag(id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@l Canvas canvas0, @l View view0, long v) {
        L.p(canvas0, "canvas");
        L.p(view0, "view");
        super.drawChild(AndroidCanvas_androidKt.d(canvas0), view0, v);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@l android.graphics.Canvas canvas0) {
        L.p(canvas0, "canvas");
        int v = super.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            L.n(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if(((ViewLayer)view0).v()) {
                try {
                    this.a = true;
                    super.dispatchDraw(canvas0);
                    this.a = false;
                    return;
                }
                catch(Throwable throwable0) {
                    this.a = false;
                    throw throwable0;
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public int getChildCount() {
        return this.a ? super.getChildCount() : 0;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }
}

