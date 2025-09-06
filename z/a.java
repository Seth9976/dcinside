package Z;

import com.dcinside.app.album.picker.f;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class a implements com.afollestad.dragselectrecyclerview.a {
    @l
    private final f a;

    public a(@l f f0) {
        L.p(f0, "adapter");
        super();
        this.a = f0;
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public void a(int v, boolean z) {
        if(this.a.A()) {
            List list0 = this.a.x();
            if(z) {
                if(this.a.C(v)) {
                    return;
                }
                this.a.L(v, true);
                return;
            }
            if(!list0.contains(v) && this.a.C(v)) {
                this.a.L(v, false);
                return;
            }
            return;
        }
        if(!this.c(v)) {
            return;
        }
        this.a.L(v, false);
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public boolean b(int v) {
        boolean z = this.a.C(v);
        this.a.G(!z);
        return true;
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public boolean c(int v) {
        return this.a.C(v);
    }

    @Override  // com.afollestad.dragselectrecyclerview.a
    public int getItemCount() {
        return this.a.getItemCount();
    }
}

