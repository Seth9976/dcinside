package com.dcinside.app.bookmark;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"ClickableViewAccessibility"})
public final class c extends ViewHolder {
    @l
    private TextView a;
    @l
    private View b;

    public c(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B049C);  // id:favorite_setting_item_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B049B);  // id:favorite_setting_item_move
        L.o(view2, "findViewById(...)");
        this.b = view2;
        view2.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.p(view0, "<anonymous parameter 0>");
            return this.i(motionEvent0);
        });
        vk.h(0x7F04032A, new View[]{this.b});  // attr:icTintNormal
    }

    // 检测为 Lambda 实现
    private static final boolean f(c c0, View view0, MotionEvent motionEvent0) [...]

    @l
    public final TextView h() {
        return this.a;
    }

    private final boolean i(MotionEvent motionEvent0) {
        if(motionEvent0 == null || motionEvent0.getAction() != 0 || this.getBindingAdapterPosition() < 0) {
            return false;
        }
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.bookmark.BookmarkSettingActivity");
        ItemTouchHelper itemTouchHelper0 = ((BookmarkSettingActivity)context0).h2();
        L.m(itemTouchHelper0);
        itemTouchHelper0.H(this);
        return true;
    }

    public final void j(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }
}

