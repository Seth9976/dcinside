package Z;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.write.G2;
import com.dcinside.app.write.y2;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class c extends Callback {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final b i;
    private final boolean j;
    @l
    public static final a k = null;
    private static final float l = 1.0f;

    static {
        c.k = new a(null);
    }

    @j
    public c(@l b b0) {
        L.p(b0, "mAdapter");
        this(b0, false, 2, null);
    }

    @j
    public c(@l b b0, boolean z) {
        L.p(b0, "mAdapter");
        super();
        this.i = b0;
        this.j = z;
    }

    public c(b b0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = true;
        }
        this(b0, z);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean A(@l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0, @l ViewHolder recyclerView$ViewHolder1) {
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "source");
        L.p(recyclerView$ViewHolder1, "target");
        int v = recyclerView$ViewHolder0.getBindingAdapterPosition();
        int v1 = recyclerView$ViewHolder1.getBindingAdapterPosition();
        return this.i.l(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void C(@m ViewHolder recyclerView$ViewHolder0, int v) {
        if(this.i.getItemCount() <= 1) {
            return;
        }
        if(v != 0 && recyclerView$ViewHolder0 instanceof d) {
            ((d)recyclerView$ViewHolder0).a();
            int v1 = recyclerView$ViewHolder0.getBindingAdapterPosition();
            this.i.e(v1);
        }
        super.C(recyclerView$ViewHolder0, v);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void D(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "viewHolder");
        if(this.i.getItemCount() <= 1) {
            return;
        }
        int v1 = recyclerView$ViewHolder0.getBindingAdapterPosition();
        this.i.q(v1);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void c(@l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "viewHolder");
        super.c(recyclerView0, recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
        if(recyclerView$ViewHolder0 instanceof d) {
            ((d)recyclerView$ViewHolder0).c();
            int v = recyclerView$ViewHolder0.getBindingAdapterPosition();
            this.i.m(v);
        }
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public int l(@l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "viewHolder");
        if(recyclerView0.getLayoutManager() instanceof GridLayoutManager) {
            return 0xF000F;
        }
        return recyclerView$ViewHolder0 instanceof y2 || recyclerView$ViewHolder0 instanceof G2 ? 0x30303 : 0x33033;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean s() {
        return this.j;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean t() {
        return false;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void w(@l Canvas canvas0, @l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0, float f, float f1, int v, boolean z) {
        L.p(canvas0, "c");
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "viewHolder");
        if(this.i.getItemCount() <= 1) {
            return;
        }
        if(v == 1) {
            float f2 = 1.0f - Math.abs(f) / ((float)recyclerView$ViewHolder0.itemView.getWidth());
            recyclerView$ViewHolder0.itemView.setAlpha(f2);
            recyclerView$ViewHolder0.itemView.setTranslationX(f);
            return;
        }
        super.w(canvas0, recyclerView0, recyclerView$ViewHolder0, f, f1, v, z);
    }
}

