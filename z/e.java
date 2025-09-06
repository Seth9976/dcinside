package Z;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.post.fragments.X0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e extends Callback {
    @l
    private final f i;

    public e(@l f f0) {
        L.p(f0, "movable");
        super();
        this.i = f0;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean A(@l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0, @l ViewHolder recyclerView$ViewHolder1) {
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "source");
        L.p(recyclerView$ViewHolder1, "target");
        int v = recyclerView$ViewHolder0.getBindingAdapterPosition();
        int v1 = recyclerView$ViewHolder1.getBindingAdapterPosition();
        return this.i.d(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void C(@m ViewHolder recyclerView$ViewHolder0, int v) {
        this.i.h(v);
        if(recyclerView$ViewHolder0 instanceof X0) {
            super.C(recyclerView$ViewHolder0, v);
        }
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void D(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "viewHolder");
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public int l(@l RecyclerView recyclerView0, @l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView0, "recyclerView");
        L.p(recyclerView$ViewHolder0, "viewHolder");
        return this.i.t() ? 0x30003 : 0;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean t() {
        return false;
    }
}

