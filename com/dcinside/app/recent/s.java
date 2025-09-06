package com.dcinside.app.recent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.codewaves.stickyheadergrid.a;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.u0;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.g1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class s extends a {
    static final class com.dcinside.app.recent.s.a extends com.codewaves.stickyheadergrid.a.a {
        TextView a;

        com.dcinside.app.recent.s.a(View view0) {
            super(view0);
            this.a = (TextView)view0.findViewById(0x7F0B0FB0);  // id:total_search_empty
        }
    }

    public interface b {
        void P(u0 arg1);
    }

    private List g;
    private final int h;
    private final WeakReference i;
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 30;

    public s(int v, b s$b0) {
        this.g = new ArrayList();
        this.h = v;
        this.i = new WeakReference(s$b0);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int E() {
        return 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int G(int v) {
        return this.g.size() == 0 ? 0 : 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int H(int v) {
        if(this.g.size() == 0) {
            return 0;
        }
        List list0 = (List)this.g.get(v);
        return list0 == null ? 0 : list0.size();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void X(com.codewaves.stickyheadergrid.a.a a$a0, int v) {
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void Y(com.codewaves.stickyheadergrid.a.b a$b0, int v, int v1) {
        if(a$b0 instanceof t) {
            ((t)a$b0).j().setText(((u0)((List)this.g.get(v)).get(v1)).T5());
            ((t)a$b0).h().setTag(0x7F0B0CA2, v);  // id:recent_search_item_section
            ((t)a$b0).h().setTag(0x7F0B0CA1, v1);  // id:recent_search_item_offset
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public com.codewaves.stickyheadergrid.a.a a0(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                com.codewaves.stickyheadergrid.a.a a$a0 = new com.dcinside.app.recent.s.a(layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false));  // layout:view_total_search_empty
                a$a0.a.setText("최근 검색어 내역이 없습니다.");
                return a$a0;
            }
            case 1: {
                com.codewaves.stickyheadergrid.a.a a$a1 = new u(layoutInflater0.inflate(0x7F0E029F, viewGroup0, false));  // layout:view_total_recent_section
                ((u)a$a1).h().setOnClickListener((View view0) -> e.s(((AppCompatActivity)Dl.b(view0))).n((com.dcinside.app.perform.p.a p$a0) -> p$a0.m(0x7F1500AD)).z(0x104000A).x(0x1040000).b().Z1((Boolean boolean0) -> boolean0).y5((Boolean boolean0) -> try(F0 f00 = F0.g4()) {
                    f00.Y3((F0 f00) -> f00.C4(u0.class).f0("type", this.h).p0().L0());
                }
                catch(Exception exception0) {
                    timber.log.b.B(exception0);
                }, (Throwable throwable0) -> Dl.D(Dl.b(view0), 0x7F1502F2)));  // string:fail_clear_recent_search "최근 검색어 삭제에 실패했습니다."
                return a$a1;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public com.codewaves.stickyheadergrid.a.b b0(ViewGroup viewGroup0, int v) {
        com.codewaves.stickyheadergrid.a.b a$b0 = new t(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E029E, viewGroup0, false));  // layout:view_total_recent_item
        ((t)a$b0).h().setOnClickListener((View view0) -> {
            u0 u00;
            Integer integer0 = (Integer)view0.getTag(0x7F0B0CA2);  // id:recent_search_item_section
            Integer integer1 = (Integer)view0.getTag(0x7F0B0CA1);  // id:recent_search_item_offset
            if(integer0 != null && integer1 != null) {
                try {
                    u00 = null;
                    u00 = (u0)((List)this.g.get(((int)integer0))).get(((int)integer1));
                }
                catch(Exception unused_ex) {
                }
                if(u00 == null) {
                    return;
                }
                String s = u00.R5();
                try(F0 f00 = F0.g4()) {
                    u0 u01 = (u0)f00.C4(u0.class).i0("key", s).r0();
                    if(u01 == null) {
                        return;
                    }
                    f00.Y3((F0 f00) -> u01.z5());
                }
                catch(Exception exception0) {
                    timber.log.b.B(exception0);
                }
            }
        });
        return a$b0;
    }

    // 检测为 Lambda 实现
    public static Boolean g0(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private void l0(View view0) [...]

    // 检测为 Lambda 实现
    private void m0(View view0) [...]

    // 检测为 Lambda 实现
    private static Object n0(com.dcinside.app.perform.p.a p$a0) [...]

    private static Boolean o0(Boolean boolean0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static void p0(g1 g10, F0 f00) [...]

    // 检测为 Lambda 实现
    private void q0(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private static void r0(View view0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static void s0(u0 u00, F0 f00) [...]

    public void t0(int v) {
        try {
            int v1 = this.z(v);
            int v2 = this.B(v1, v);
            u0 u00 = (u0)((List)this.g.get(v1)).get(v2);
            b s$b0 = (b)this.i.get();
            if(s$b0 != null) {
                s$b0.P(u00);
            }
        }
        catch(Exception exception0) {
            timber.log.b.B(exception0);
        }
    }

    public void u0(List list0) {
        if(list0 != null && list0.size() != 0) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            int v = Math.min(30, list0.size());
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList1.add(((u0)list0.get(v1)));
            }
            arrayList0.add(arrayList1);
            this.g = arrayList0;
            this.N();
            return;
        }
        this.g.clear();
        this.N();
    }
}

