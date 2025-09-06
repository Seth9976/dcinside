package com.dcinside.app.totalsearch.total;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.totalsearch.a.f;
import com.dcinside.app.totalsearch.video.VideoItemView;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nVideoHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoHolder.kt\ncom/dcinside/app/totalsearch/total/VideoHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,29:1\n13411#2,2:30\n13413#2:41\n177#3,9:32\n*S KotlinDebug\n*F\n+ 1 VideoHolder.kt\ncom/dcinside/app/totalsearch/total/VideoHolder\n*L\n20#1:30,2\n20#1:41\n21#1:32,9\n*E\n"})
public final class n extends ViewHolder {
    @l
    private final VideoItemView[] a;

    public n(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        VideoItemView[] arr_videoItemView = new VideoItemView[4];
        View view1 = view0.findViewById(0x7F0B0FD7);  // id:total_video_item1
        L.o(view1, "findViewById(...)");
        arr_videoItemView[0] = view1;
        View view2 = view0.findViewById(0x7F0B0FD8);  // id:total_video_item2
        L.o(view2, "findViewById(...)");
        arr_videoItemView[1] = view2;
        View view3 = view0.findViewById(0x7F0B0FD9);  // id:total_video_item3
        L.o(view3, "findViewById(...)");
        arr_videoItemView[2] = view3;
        View view4 = view0.findViewById(0x7F0B0FDA);  // id:total_video_item4
        L.o(view4, "findViewById(...)");
        arr_videoItemView[3] = view4;
        this.a = arr_videoItemView;
    }

    public final void e(@l List list0) {
        f a$f0;
        L.p(list0, "items");
        VideoItemView[] arr_videoItemView = this.a;
        int v = 0;
        for(int v1 = 0; v < arr_videoItemView.length; ++v1) {
            VideoItemView videoItemView0 = arr_videoItemView[v];
            try {
                a$f0 = null;
                a$f0 = (f)list0.get(v1);
            }
            catch(Exception unused_ex) {
            }
            videoItemView0.setContents(a$f0);
            if(a$f0 == null && list0.size() <= 2 && v1 > 1) {
                videoItemView0.setVisibility(8);
            }
            ++v;
        }
    }
}

