package com.dcinside.app.image;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.z;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class r0 extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final List a;
    @l
    private final Map b;
    @m
    private WeakReference c;
    @l
    public static final a d = null;
    private static final int e = 0;
    private static final int f = 1;

    static {
        r0.d = new a(null);
    }

    public r0() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    private final void A(int v) {
        ImageViewerActivity imageViewerActivity0 = this.C();
        if(imageViewerActivity0 == null) {
            return;
        }
        F0 f00 = imageViewerActivity0.F1();
        if(f00 == null) {
            return;
        }
        f00.Y3((F0 f01) -> {
            L.p(f00, "$realm");
            RealmQuery realmQuery0 = f00.C4(z.class);
            switch(v) {
                case 0: {
                    realmQuery0.f0("state", 1).d2().f0("state", 2).p0().L0();
                    return;
                }
                case 1: {
                    realmQuery0.f0("state", 3).p0().L0();
                    return;
                }
                default: {
                    realmQuery0.f0("state", 0).p0().L0();
                }
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void B(F0 f00, int v, F0 f01) [...]

    private final ImageViewerActivity C() {
        WeakReference weakReference0 = this.c;
        if(weakReference0 == null) {
            return null;
        }
        RecyclerView recyclerView0 = weakReference0 == null ? null : ((RecyclerView)weakReference0.get());
        Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
        return context0 instanceof ImageViewerActivity ? ((ImageViewerActivity)context0) : null;
    }

    @m
    public final Object D(int v) {
        try {
            return this.a.get(v);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    // 检测为 Lambda 实现
    private static final void E(r0 r00, u0 u00, View view0) [...]

    private final void F(int v) {
        static final class b extends N implements Function1 {
            final int e;

            b(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            public final Boolean a(@m Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class d extends N implements Function1 {
            final r0 e;
            final int f;

            d(r0 r00, int v) {
                this.e = r00;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.A(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        int v2;
        Integer integer0 = (Integer)this.D(v);
        if(integer0 != null) {
            int v1 = (int)integer0;
            ImageViewerActivity imageViewerActivity0 = this.C();
            if(imageViewerActivity0 == null) {
                return;
            }
            switch(v1) {
                case 0: {
                    v2 = 0x7F15028C;  // string:down_clear_progress "진행/대기 목록을 삭제하시겠습니까?"
                    break;
                }
                case 1: {
                    v2 = 0x7F15028B;  // string:down_clear_failure "실패 목록을 삭제하시겠습니까?"
                    break;
                }
                default: {
                    v2 = 0x7F15028A;  // string:down_clear_complete "완료 목록을 삭제하시겠습니까?"
                }
            }
            e.e.a(imageViewerActivity0).n(new b(v2)).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(c.e, "$tmp0");
                return (Boolean)c.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new d(this, v1), "$tmp0");
                new d(this, v1).invoke(object0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean G(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H(Function1 function10, Object object0) [...]

    public final void I(@l g1 g10) {
        L.p(g10, "items");
        g1 g11 = g10.x4().f0("state", 1).d2().f0("state", 2).p0();
        g1 g12 = g10.x4().f0("state", 0).p0();
        g1 g13 = g10.x4().f0("state", 3).p0();
        this.a.clear();
        if(g11.size() > 0) {
            this.a.add(0);
            L.m(g11);
            this.a.addAll(g11);
        }
        if(g13.size() > 0) {
            this.a.add(1);
            L.m(g13);
            this.a.addAll(g13);
        }
        if(g12.size() > 0) {
            this.a.add(2);
            L.m(g12);
            this.a.addAll(g12);
        }
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return !(this.D(v) instanceof z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.c = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        int v3;
        String s;
        L.p(recyclerView$ViewHolder0, "holder");
        boolean z = true;
        if(recyclerView$ViewHolder0 instanceof t0) {
            recyclerView$ViewHolder0.itemView.getContext();
            Object object0 = this.D(v);
            z z1 = object0 instanceof z ? ((z)object0) : null;
            if(z1 != null && z1.s()) {
                int v1 = z1.V5();
                int v2 = 0;
                if(2 != v1) {
                    z = false;
                }
                try {
                    s = URLDecoder.decode(z1.T5(), "UTF-8");
                }
                catch(UnsupportedEncodingException unused_ex) {
                    s = z1.T5();
                }
                ((t0)recyclerView$ViewHolder0).a.setText(s);
                ((t0)recyclerView$ViewHolder0).b.setText(z1.W5());
                if(3 == v1) {
                    ((t0)recyclerView$ViewHolder0).c.setText("실패");
                }
                else {
                    String s1 = z1.Y5();
                    if(s1 == null) {
                        s1 = "";
                    }
                    String s2 = (String)this.b.get(s1);
                    if(s2 == null) {
                        String s3 = Fk.i(Gk.r(Gk.f(s1).n()));
                        if(s3 == null) {
                            s3 = Fk.i(s1);
                        }
                        this.b.put(s1, s3);
                        ((t0)recyclerView$ViewHolder0).c.setText(s3);
                    }
                    else {
                        ((t0)recyclerView$ViewHolder0).c.setText(s2);
                    }
                }
                ((t0)recyclerView$ViewHolder0).d.setVisibility((z ? 0 : 4));
                View view0 = ((t0)recyclerView$ViewHolder0).e;
                if(3 != v1) {
                    v2 = 4;
                }
                view0.setVisibility(v2);
                return;
            }
            return;
        }
        if(recyclerView$ViewHolder0 instanceof u0) {
            Integer integer0 = (Integer)this.D(v);
            if(integer0 != null) {
                switch(((int)integer0)) {
                    case 0: {
                        v3 = 0x7F15029C;  // string:download_queue "진행/대기"
                        break;
                    }
                    case 1: {
                        v3 = 0x7F150298;  // string:download_failure "실패"
                        break;
                    }
                    default: {
                        v3 = 0x7F150293;  // string:download_complete "완료"
                    }
                }
                ((u0)recyclerView$ViewHolder0).a.setText(v3);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(1 == v) {
            View view0 = layoutInflater0.inflate(0x7F0E01CE, viewGroup0, false);  // layout:view_down_section
            view0.setSelected(true);
            L.m(view0);
            ViewHolder recyclerView$ViewHolder0 = new u0(view0);
            recyclerView$ViewHolder0.b.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                L.p(((u0)recyclerView$ViewHolder0), "$holder");
                this.F(((u0)recyclerView$ViewHolder0).getBindingAdapterPosition());
            });
            return recyclerView$ViewHolder0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E01CD, viewGroup0, false);  // layout:view_down
        L.m(view1);
        return new t0(view1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.c = null;
    }
}

