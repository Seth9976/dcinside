package com.dcinside.app.totalsearch.video;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.totalsearch.a.f;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class r extends ViewHolder {
    public r(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
    }

    public final void e(@m f a$f0) {
        VideoItemView videoItemView0 = this.itemView instanceof VideoItemView ? ((VideoItemView)this.itemView) : null;
        if(videoItemView0 != null) {
            videoItemView0.setContents(a$f0);
        }
    }
}

