package com.dcinside.app.write.menu.video;

import A3.p;
import A3.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nTagListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TagListAdapter.kt\ncom/dcinside/app/write/menu/video/TagListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1#2:158\n255#3:159\n774#4:160\n865#4,2:161\n1557#4:163\n1628#4,3:164\n774#4:167\n865#4,2:168\n*S KotlinDebug\n*F\n+ 1 TagListAdapter.kt\ncom/dcinside/app/write/menu/video/TagListAdapter\n*L\n43#1:159\n66#1:160\n66#1:161,2\n99#1:163\n99#1:164,3\n99#1:167\n99#1:168,2\n*E\n"})
public final class b extends Adapter {
    public static final class a extends ViewHolder {
        @l
        private final View a;
        @l
        private final View b;
        @l
        private final EditText c;
        @l
        private final View d;

        public a(@l View view0) {
            @f(c = "com.dcinside.app.write.menu.video.TagListAdapter$TagItemHolder$1", f = "TagListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.write.menu.video.b.a.a extends o implements p {
                int k;
                Object l;
                final View m;
                final a n;

                com.dcinside.app.write.menu.video.b.a.a(View view0, a b$a0, d d0) {
                    this.m = view0;
                    this.n = b$a0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    com.dcinside.app.write.menu.video.b.a.a b$a$a0 = new com.dcinside.app.write.menu.video.b.a.a(this.m, this.n, d0);
                    b$a$a0.l = view0;
                    return b$a$a0.invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((View)object1), ((d)object2));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    View view0 = (View)this.l;
                    Context context0 = this.m.getContext();
                    view0.setVisibility(8);
                    this.n.n().setVisibility(0);
                    L.m(context0);
                    Drawable drawable0 = vk.e(context0, 0x7F0405EB);  // attr:strokeBorderBg
                    this.n.k().setBackground(drawable0);
                    Nk.a.f(this.n.n());
                    return S0.a;
                }
            }


            @f(c = "com.dcinside.app.write.menu.video.TagListAdapter$TagItemHolder$2", f = "TagListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.write.menu.video.b.a.b extends o implements p {
                int k;
                final a l;

                com.dcinside.app.write.menu.video.b.a.b(a b$a0, d d0) {
                    this.l = b$a0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    return new com.dcinside.app.write.menu.video.b.a.b(this.l, d0).invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((View)object1), ((d)object2));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    this.l.j();
                    return S0.a;
                }
            }


            @f(c = "com.dcinside.app.write.menu.video.TagListAdapter$TagItemHolder$4", f = "TagListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends o implements q {
                int k;
                Object l;
                boolean m;
                final a n;

                c(a b$a0, d d0) {
                    this.n = b$a0;
                    super(4, d0);
                }

                @Override  // A3.q
                public Object T0(Object object0, Object object1, Object object2, Object object3) {
                    return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((d)object3));
                }

                @m
                public final Object a(@l O o0, @l View view0, boolean z, @m d d0) {
                    c b$a$c0 = new c(this.n, d0);
                    b$a$c0.l = view0;
                    b$a$c0.m = z;
                    return b$a$c0.invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    boolean z = true;
                    f0.n(object0);
                    View view0 = (View)this.l;
                    if(!this.m) {
                        if(!(view0.getTag() instanceof Boolean) || !L.g(view0.getTag(), kotlin.coroutines.jvm.internal.b.a(true))) {
                            z = false;
                        }
                        view0.setTag(null);
                        this.n.o(((EditText)view0), z);
                    }
                    return S0.a;
                }
            }

            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B1064);  // id:video_item_tag_text_wrap
            L.o(view1, "findViewById(...)");
            this.a = view1;
            View view2 = view0.findViewById(0x7F0B1063);  // id:video_item_tag_text_hint
            L.o(view2, "findViewById(...)");
            this.b = view2;
            View view3 = view0.findViewById(0x7F0B1062);  // id:video_item_tag_text
            L.o(view3, "findViewById(...)");
            this.c = (EditText)view3;
            View view4 = view0.findViewById(0x7F0B1061);  // id:video_item_tag_delete
            L.o(view4, "findViewById(...)");
            this.d = view4;
            r.M(view2, null, new com.dcinside.app.write.menu.video.b.a.a(view0, this, null), 1, null);
            r.M(view4, null, new com.dcinside.app.write.menu.video.b.a.b(this, null), 1, null);
            ((EditText)view3).setOnEditorActionListener((TextView textView0, int v, KeyEvent keyEvent0) -> {
                L.p(this, "this$0");
                if(6 == v) {
                    textView0.setTag(Boolean.TRUE);
                    this.o((textView0 instanceof EditText ? ((EditText)textView0) : null), true);
                    return true;
                }
                return false;
            });
            r.P(((EditText)view3), null, new c(this, null), 1, null);
        }

        // 检测为 Lambda 实现
        private static final boolean f(a b$a0, TextView textView0, int v, KeyEvent keyEvent0) [...]

        private final void j() {
            ViewParent viewParent0 = this.itemView.getParent();
            b b0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof b) {
                b0 = (b)recyclerView$Adapter0;
            }
            if(b0 == null) {
                return;
            }
            b0.x(this.getBindingAdapterPosition());
        }

        @l
        public final View k() {
            return this.a;
        }

        @l
        public final View l() {
            return this.d;
        }

        @l
        public final View m() {
            return this.b;
        }

        @l
        public final EditText n() {
            return this.c;
        }

        private final void o(EditText editText0, boolean z) {
            if(editText0 == null) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            b b0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof b) {
                b0 = (b)recyclerView$Adapter0;
            }
            if(b0 == null) {
                return;
            }
            b0.w(editText0, z, false);
        }
    }

    @l
    private ArrayList a;

    public b() {
        this.a = new ArrayList();
    }

    @l
    public a A(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0288, viewGroup0, false);  // layout:view_tag_item
        L.m(view0);
        return new a(view0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void B(@l String s) {
        L.p(s, "tags");
        this.a.clear();
        Iterable iterable0 = v.V4(s, new String[]{"|"}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((String)object0).length() > 0) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            this.a.addAll(arrayList0);
        }
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return Math.min(5, this.a.size() + 1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    public final void w(@l EditText editText0, boolean z, boolean z1) {
        L.p(editText0, "view");
        String s = editText0.getText().toString();
        if(s.length() == 0) {
            Nk.a.c(editText0);
            this.notifyItemChanged(this.getItemCount() - 1);
            return;
        }
        if(this.a.contains(s)) {
            editText0.setTag(null);
            if(z) {
                editText0.requestFocus();
            }
            if(!z1) {
                Dl.D(editText0.getContext(), 0x7F150B72);  // string:video_tag_exist "이미 태그가 등록이 되어 있습니다."
            }
            return;
        }
        int v = this.a.size();
        this.a.add(s);
        editText0.setText(null);
        if(this.a.size() >= 5 || !z) {
            Nk.a.c(editText0);
        }
        if(v >= 4) {
            this.notifyItemChanged(v);
            return;
        }
        this.notifyItemInserted(v);
    }

    private final void x(int v) {
        this.a.remove(v);
        this.notifyItemRemoved(v);
    }

    @l
    public final String y() [...] // 潜在的解密器

    public void z(@l a b$a0, int v) {
        Drawable drawable0;
        L.p(b$a0, "holder");
        ArrayList arrayList0 = this.a;
        String s = null;
        if(arrayList0.size() <= v) {
            arrayList0 = null;
        }
        if(arrayList0 != null) {
            s = (String)arrayList0.get(v);
        }
        b$a0.n().setText(s);
        Context context0 = b$a0.itemView.getContext();
        if(s != null && s.length() != 0) {
            b$a0.k().setBackground(ContextCompat.getDrawable(context0, 0x7F080128));  // drawable:border_tag_complete
            b$a0.m().setVisibility(8);
            b$a0.n().setVisibility(0);
            b$a0.l().setVisibility(0);
            b$a0.n().setEnabled(false);
            b$a0.n().setFocusable(false);
            b$a0.n().setFocusableInTouchMode(false);
            return;
        }
        b$a0.m().setVisibility(0);
        b$a0.n().setVisibility(8);
        b$a0.l().setVisibility(8);
        b$a0.n().setEnabled(true);
        b$a0.n().setFocusable(true);
        b$a0.n().setFocusableInTouchMode(true);
        View view0 = b$a0.k();
        if(b$a0.m().getVisibility() == 0) {
            drawable0 = ContextCompat.getDrawable(context0, 0x7F080129);  // drawable:border_tag_editable
        }
        else {
            L.m(context0);
            drawable0 = vk.e(context0, 0x7F0405EB);  // attr:strokeBorderBg
        }
        view0.setBackground(drawable0);
    }
}

