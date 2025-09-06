package com.dcinside.app.main.login;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.AlbumActivity;
import com.dcinside.app.album.h;
import com.dcinside.app.glide.a;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.cl;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import io.realm.F0;
import io.realm.g1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSimpleLoginListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLoginListAdapter.kt\ncom/dcinside/app/main/login/SimpleLoginListAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n257#2,2:219\n257#2,2:221\n257#2,2:223\n1#3:225\n*S KotlinDebug\n*F\n+ 1 SimpleLoginListAdapter.kt\ncom/dcinside/app/main/login/SimpleLoginListAdapter\n*L\n82#1:219,2\n83#1:221,2\n84#1:223,2\n*E\n"})
public final class t extends Adapter implements PermissionListener {
    @m
    private g1 a;
    private boolean b;
    @m
    private WeakReference c;
    private int d;
    @m
    private ActivityResultLauncher e;

    public t(@l o o0) {
        L.p(o0, "fragment");
        super();
        this.d = -1;
        this.c = new WeakReference(o0);
        this.e = o0.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            Intent intent0 = activityResult0.a();
            if(intent0 == null) {
                return;
            }
            if(activityResult0.c() == -1) {
                this.F(intent0);
            }
        });
    }

    public void A(@l q q0, int v) {
        L.p(q0, "h");
        g1 g10 = this.a;
        if(g10 != null) {
            B b0 = (B)g10.get(v);
            if(b0 != null) {
                q0.itemView.getContext();
                String s = b0.m6();
                String s1 = b0.o6();
                if(s1 == null || s1.length() == 0) {
                    q0.q().setVisibility(4);
                    q0.p().setVisibility(0);
                    g.a.g(q0.p(), b0);
                }
                else {
                    q0.q().setVisibility(0);
                    q0.p().setVisibility(4);
                    a.l(q0.q()).g0().v2(b0.o6()).U1().q1(q0.q());
                }
                q0.r().setText(s);
                q0.t().setText(b0.r6());
                com.dcinside.app.type.l l0 = com.dcinside.app.type.l.b.a(b0);
                q0.n().setImageResource(l0.c());
                q0.n().setPadding(Dk.d((l0.e() ? 0 : 3)), 0, 0, 0);
                q0.s().setVisibility((!b0.f6() || this.b ? 8 : 0));
                q0.m().setVisibility((this.b ? 0 : 8));
                q0.o().setVisibility((this.b ? 0 : 8));
                q0.l().setText(Dl.c("2단계 <font color=#FF0000>ON</font>"));
                String s2 = b0.A6();
                String s3 = b0.n6();
                if(!L.g("1", s2) && !Boolean.parseBoolean(s2) && !m0.a.a.k(s3)) {
                    q0.l().setVisibility(8);
                    return;
                }
                q0.l().setVisibility(0);
            }
        }
    }

    public final void B(boolean z) {
        this.b = z;
        this.notifyDataSetChanged();
    }

    @l
    public q C(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0282, viewGroup0, false);  // layout:view_simple_login_item
        L.m(view0);
        return new q(view0);
    }

    public final void D(int v) {
        FragmentActivity fragmentActivity0;
        if(this.b) {
            WeakReference weakReference0 = this.c;
            AppCompatActivity appCompatActivity0 = null;
            if(weakReference0 == null) {
                fragmentActivity0 = null;
            }
            else {
                o o0 = (o)weakReference0.get();
                fragmentActivity0 = o0 == null ? null : o0.getActivity();
            }
            if(fragmentActivity0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            g1 g10 = this.a;
            if(g10 != null) {
                B b0 = (B)g10.get(v);
                if(b0 != null) {
                    g.a.l(appCompatActivity0, b0);
                }
            }
        }
    }

    public final void E(int v) {
        if(!this.b) {
            this.z(v);
            return;
        }
        this.H(v);
    }

    private final void F(Intent intent0) {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            o o0 = (o)weakReference0.get();
            if(o0 != null) {
                Context context0 = o0.getContext();
                if(context0 != null) {
                    ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
                    if(arrayList0 == null) {
                        return;
                    }
                    if(arrayList0.size() > 0) {
                        String s = (String)arrayList0.get(0);
                        if(s == null || s.length() == 0) {
                            Dl.D(context0, 0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
                        }
                        else {
                            g1 g10 = this.a;
                            if(g10 != null) {
                                F0 f00 = g10.h();
                                if(f00 != null) {
                                    f00.Y3((F0 f00) -> {
                                        String s1;
                                        L.p(this, "this$0");
                                        L.p(context0, "$context");
                                        g1 g10 = this.a;
                                        B b0 = null;
                                        if(g10 == null) {
                                            s1 = null;
                                        }
                                        else {
                                            B b1 = (B)g10.get(this.d);
                                            s1 = b1 == null ? null : b1.o6();
                                        }
                                        g g0 = g.a;
                                        L.m(s);
                                        String s2 = g0.k(context0, s).getAbsolutePath();
                                        g1 g11 = this.a;
                                        if(g11 != null) {
                                            b0 = (B)g11.get(this.d);
                                        }
                                        if(b0 != null) {
                                            b0.a7(s2);
                                        }
                                        if(s1 != null) {
                                            g0.o(s1);
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void G(t t0, Context context0, String s, F0 f00) [...]

    private final void H(int v) {
        FragmentActivity fragmentActivity0;
        WeakReference weakReference0 = this.c;
        AppCompatActivity appCompatActivity0 = null;
        if(weakReference0 == null) {
            fragmentActivity0 = null;
        }
        else {
            o o0 = (o)weakReference0.get();
            fragmentActivity0 = o0 == null ? null : o0.getActivity();
        }
        if(fragmentActivity0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        this.d = v;
        if(cl.i(appCompatActivity0, this)) {
            return;
        }
        h.c(appCompatActivity0).f(1).e("이미지를 선택해주세요.").c(1010);
        Intent intent0 = new Intent(appCompatActivity0, AlbumActivity.class);
        ActivityResultLauncher activityResultLauncher0 = this.e;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    public final void I(@l g1 g10) {
        L.p(g10, "items");
        this.a = g10;
        this.notifyDataSetChanged();
    }

    private final void J() {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            o o0 = (o)weakReference0.get();
            if(o0 != null) {
                o0.U0(false);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.A(((q)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.c = null;
        ActivityResultLauncher activityResultLauncher0 = this.e;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
        }
        g.a.s();
        super.onDetachedFromRecyclerView(recyclerView0);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            o o0 = (o)weakReference0.get();
            if(o0 != null) {
                Context context0 = o0.getContext();
                if(context0 != null) {
                    Dl.D(context0, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
                }
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        this.H(this.d);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    // 检测为 Lambda 实现
    private static final void y(t t0, ActivityResult activityResult0) [...]

    public final void z(int v) {
        static final class com.dcinside.app.main.login.t.a extends N implements A3.a {
            final o e;
            final AppCompatActivity f;
            final B g;
            final F0 h;
            final t i;

            com.dcinside.app.main.login.t.a(o o0, AppCompatActivity appCompatActivity0, B b0, F0 f00, t t0) {
                this.e = o0;
                this.f = appCompatActivity0;
                this.g = b0;
                this.h = f00;
                this.i = t0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                static final class com.dcinside.app.main.login.t.a.a extends N implements A3.a {
                    final t e;

                    com.dcinside.app.main.login.t.a.a(t t0) {
                        this.e = t0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.J();
                    }
                }

                this.e.U0(true);
                com.dcinside.app.main.login.t.a.a t$a$a0 = new com.dcinside.app.main.login.t.a.a(this.i);
                g.a.h(this.f, this.g, this.h, false, t$a$a0);
            }
        }

        if(!this.b) {
            WeakReference weakReference0 = this.c;
            if(weakReference0 != null) {
                o o0 = (o)weakReference0.get();
                if(o0 != null) {
                    FragmentActivity fragmentActivity0 = o0.getActivity();
                    String s = null;
                    AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                    if(appCompatActivity0 == null) {
                        return;
                    }
                    g1 g10 = this.a;
                    if(g10 != null) {
                        B b0 = (B)g10.get(v);
                        if(b0 != null) {
                            F0 f00 = this.a == null ? null : this.a.h();
                            if(f00 == null) {
                                return;
                            }
                            B b1 = B.E.V(f00);
                            if(b1 != null) {
                                s = b1.r6();
                            }
                            if(L.g(s, b0.r6())) {
                                return;
                            }
                            o0.C0(false, b0, new com.dcinside.app.main.login.t.a(o0, appCompatActivity0, b0, f00, this));
                        }
                    }
                }
            }
        }
    }
}

