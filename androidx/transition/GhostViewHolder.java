package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static float a(View view0) {
            return view0.getZ();
        }
    }

    @NonNull
    private ViewGroup a;
    private boolean b;

    GhostViewHolder(ViewGroup viewGroup0) {
        super(viewGroup0.getContext());
        this.setClipChildren(false);
        this.a = viewGroup0;
        viewGroup0.setTag(id.ghost_view_holder, this);
        this.a.getOverlay().add(this);
        this.b = true;
    }

    void a(GhostViewPort ghostViewPort0) {
        ArrayList arrayList0 = new ArrayList();
        GhostViewHolder.d(ghostViewPort0.c, arrayList0);
        int v = this.c(arrayList0);
        if(v >= 0 && v < this.getChildCount()) {
            this.addView(ghostViewPort0, v);
            return;
        }
        this.addView(ghostViewPort0);
    }

    static GhostViewHolder b(@NonNull ViewGroup viewGroup0) {
        return (GhostViewHolder)viewGroup0.getTag(id.ghost_view_holder);
    }

    private int c(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        int v = this.getChildCount() - 1;
        int v1 = 0;
        while(v1 <= v) {
            int v2 = (v1 + v) / 2;
            GhostViewHolder.d(((GhostViewPort)this.getChildAt(v2)).c, arrayList1);
            if(GhostViewHolder.f(arrayList0, arrayList1)) {
                v1 = v2 + 1;
            }
            else {
                v = v2 - 1;
            }
            arrayList1.clear();
        }
        return v1;
    }

    private static void d(View view0, ArrayList arrayList0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            GhostViewHolder.d(((View)viewParent0), arrayList0);
        }
        arrayList0.add(view0);
    }

    private static boolean e(View view0, View view1) {
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        int v = viewGroup0.getChildCount();
        if(Api21Impl.a(view0) != Api21Impl.a(view1)) {
            return Api21Impl.a(view0) > Api21Impl.a(view1);
        }
        int v1 = 0;
        while(v1 < v) {
            View view2 = viewGroup0.getChildAt(ViewGroupUtils.a(viewGroup0, v1));
            if(view2 != view0) {
                if(view2 == view1) {
                    break;
                }
                ++v1;
                continue;
            }
            return false;
        }
        return true;
    }

    private static boolean f(ArrayList arrayList0, ArrayList arrayList1) {
        if(!arrayList0.isEmpty() && !arrayList1.isEmpty() && arrayList0.get(0) == arrayList1.get(0)) {
            int v = Math.min(arrayList0.size(), arrayList1.size());
            for(int v1 = 1; v1 < v; ++v1) {
                View view0 = (View)arrayList0.get(v1);
                View view1 = (View)arrayList1.get(v1);
                if(view0 != view1) {
                    return GhostViewHolder.e(view0, view1);
                }
            }
            return arrayList1.size() == v;
        }
        return true;
    }

    void g() {
        if(!this.b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.a.getOverlay().remove(this);
        this.a.getOverlay().add(this);
    }

    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        if(!this.b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view0);
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if(this.getChildCount() == 1 && this.getChildAt(0) == view0 || this.getChildCount() == 0) {
            this.a.setTag(id.ghost_view_holder, null);
            this.a.getOverlay().remove(this);
            this.b = false;
        }
    }
}

