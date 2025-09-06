package com.dcinside.app.read.holder;

import android.view.View;
import com.dcinside.app.read.x;
import com.dcinside.app.view.StateAnnounceView;
import kotlin.jvm.internal.L;
import y4.l;

public final class k extends b {
    @l
    private final StateAnnounceView b;

    public k(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0D1B);  // id:reply_announce
        L.o(view1, "findViewById(...)");
        this.b = (StateAnnounceView)view1;
        ((StateAnnounceView)view1).setOnRetryListener(() -> {
            L.p(this, "this$0");
            x x0 = this.e();
            if(x0 != null) {
                x0.D0(false);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void i(k k0) [...]

    @l
    public final StateAnnounceView j() {
        return this.b;
    }
}

