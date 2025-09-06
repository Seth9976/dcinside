package com.dcinside.app.write.menu.setting;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.view.ClearableEditText;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPollItemViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollItemViewHolder.kt\ncom/dcinside/app/write/menu/setting/PollItemViewHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n25#2:75\n1#3:76\n*S KotlinDebug\n*F\n+ 1 PollItemViewHolder.kt\ncom/dcinside/app/write/menu/setting/PollItemViewHolder\n*L\n36#1:75\n*E\n"})
public final class e extends ViewHolder {
    @s0({"SMAP\nPollItemViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollItemViewHolder.kt\ncom/dcinside/app/write/menu/setting/PollItemViewHolder$ItemTextChangeStore\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n25#2:75\n1#3:76\n*S KotlinDebug\n*F\n+ 1 PollItemViewHolder.kt\ncom/dcinside/app/write/menu/setting/PollItemViewHolder$ItemTextChangeStore\n*L\n66#1:75\n*E\n"})
    static final class a implements TextWatcher {
        @l
        private final WeakReference a;
        @l
        private final WeakReference b;

        public a(@l ViewGroup viewGroup0, @l ClearableEditText clearableEditText0) {
            L.p(viewGroup0, "parent");
            L.p(clearableEditText0, "editText");
            super();
            this.a = new WeakReference(viewGroup0);
            this.b = new WeakReference(clearableEditText0);
        }

        @Override  // android.text.TextWatcher
        public void afterTextChanged(@m Editable editable0) {
        }

        @Override  // android.text.TextWatcher
        public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
        }

        @Override  // android.text.TextWatcher
        public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            Object object0 = this.a.get();
            Integer integer0 = null;
            RecyclerView recyclerView0 = object0 instanceof RecyclerView ? ((RecyclerView)object0) : null;
            if(recyclerView0 == null) {
                return;
            }
            ClearableEditText clearableEditText0 = (ClearableEditText)this.b.get();
            if(clearableEditText0 == null) {
                return;
            }
            ViewHolder recyclerView$ViewHolder0 = recyclerView0.findContainingViewHolder(clearableEditText0);
            if(recyclerView$ViewHolder0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof k)) {
                recyclerView$Adapter0 = null;
            }
            if(((k)recyclerView$Adapter0) == null) {
                return;
            }
            Integer integer1 = recyclerView$ViewHolder0.getBindingAdapterPosition();
            if(integer1.intValue() >= 0) {
                integer0 = integer1;
            }
            if(integer0 != null) {
                Object object1 = ((k)recyclerView$Adapter0).w().get(((int)integer0));
                L.o(object1, "get(...)");
                ((b)object1).h(String.valueOf(charSequence0));
            }
        }
    }

    @l
    private final ViewGroup a;
    @l
    private final ClearableEditText b;
    @l
    private final ImageView c;
    @l
    private final View d;
    @l
    private final ImageView e;
    @l
    private final View f;

    public e(@l ViewGroup viewGroup0, @l View view0) {
        L.p(viewGroup0, "parent");
        L.p(view0, "view");
        super(view0);
        this.a = viewGroup0;
        View view1 = view0.findViewById(0x7F0B09F0);  // id:poll_option_subject
        L.o(view1, "findViewById(...)");
        this.b = (ClearableEditText)view1;
        View view2 = view0.findViewById(0x7F0B09EC);  // id:poll_option_image
        L.o(view2, "findViewById(...)");
        this.c = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B09ED);  // id:poll_option_item_delete
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = view0.findViewById(0x7F0B09EB);  // id:poll_option_icon
        L.o(view4, "findViewById(...)");
        this.e = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B09EE);  // id:poll_option_item_gif
        L.o(view5, "findViewById(...)");
        this.f = view5;
        ((ClearableEditText)view1).h();
        ((ClearableEditText)view1).addTextChangedListener(new a(viewGroup0, ((ClearableEditText)view1)));
        ((ImageView)view2).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.p();
        });
        ((ImageView)view4).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.p();
        });
    }

    // 检测为 Lambda 实现
    private static final void h(e e0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void i(e e0, View view0) [...]

    @l
    public final View j() {
        return this.d;
    }

    @l
    public final View k() {
        return this.f;
    }

    @l
    public final ImageView l() {
        return this.e;
    }

    @l
    public final ImageView m() {
        return this.c;
    }

    @l
    public final ViewGroup n() {
        return this.a;
    }

    @l
    public final ClearableEditText o() {
        return this.b;
    }

    private final void p() {
        PostPollSettingActivity postPollSettingActivity0 = null;
        RecyclerView recyclerView0 = this.a instanceof RecyclerView ? ((RecyclerView)this.a) : null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof k)) {
                recyclerView$Adapter0 = null;
            }
            if(((k)recyclerView$Adapter0) != null) {
                Integer integer0 = this.getAdapterPosition();
                if(integer0.intValue() < 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    int v = (int)integer0;
                    Object object0 = ((k)recyclerView$Adapter0).w().get(v);
                    L.o(object0, "get(...)");
                    String s = ((b)object0).e();
                    if(s != null && s.length() != 0) {
                        ((b)object0).g(null);
                        ((k)recyclerView$Adapter0).notifyItemChanged(v);
                        return;
                    }
                    Context context0 = Dl.b(this.itemView);
                    if(context0 instanceof PostPollSettingActivity) {
                        postPollSettingActivity0 = (PostPollSettingActivity)context0;
                    }
                    if(postPollSettingActivity0 == null) {
                        return;
                    }
                    View view0 = postPollSettingActivity0.getCurrentFocus();
                    if(view0 != null) {
                        view0.clearFocus();
                    }
                    Nk.a.a(postPollSettingActivity0);
                    postPollSettingActivity0.R2(v);
                }
            }
        }
    }
}

