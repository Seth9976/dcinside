package com.dcinside.app.post;

import A3.p;
import Y.X;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.q;
import com.dcinside.app.response.GalleryInfo;
import io.realm.F0;
import io.realm.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class PostHeadSettingActivity extends g {
    private X w;
    @m
    private GalleryInfo x;
    @l
    private final m0 y;

    public PostHeadSettingActivity() {
        this.y = new m0();
    }

    private final void M1() {
        @f(c = "com.dcinside.app.post.PostHeadSettingActivity$initView$2", f = "PostHeadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final PostHeadSettingActivity l;

            a(PostHeadSettingActivity postHeadSettingActivity0, d d0) {
                this.l = postHeadSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.N1();
                return S0.a;
            }
        }

        T0 t00;
        GalleryInfo galleryInfo0 = this.x;
        if(galleryInfo0 != null) {
            List list0 = galleryInfo0.w();
            if(list0 != null) {
                F0 f00 = this.F1();
                if(f00 == null) {
                    return;
                }
                q q0 = q.o.b(f00, (this.x == null ? null : this.x.r()));
                if(q0 == null) {
                    t00 = new T0();
                }
                else {
                    t00 = q0.U5();
                    if(t00 == null) {
                        t00 = new T0();
                    }
                }
                X x0 = this.w;
                if(x0 == null) {
                    L.S("binding");
                    x0 = null;
                }
                LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(x0.c.getContext(), 1, false);
                x0.c.setLayoutManager(linearLayoutManager0);
                x0.c.setAdapter(this.y);
                this.y.y(t00);
                this.y.x(list0);
                X x1 = this.w;
                if(x1 == null) {
                    L.S("binding");
                    x1 = null;
                }
                L.o(x1.d, "postHeadSettingSave");
                a postHeadSettingActivity$a0 = new a(this, null);
                r.M(x1.d, null, postHeadSettingActivity$a0, 1, null);
            }
        }
    }

    private final void N1() {
        ArrayList arrayList0 = this.y.v();
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(this, "this$0");
                L.p(arrayList0, "$ignoreList");
                L.m(f00);
                q q0 = q.o.b(f00, (this.x == null ? null : this.x.r()));
                if(q0 != null) {
                    T0 t00 = q0.U5();
                    if(t00 != null) {
                        t00.clear();
                    }
                }
                if(q0 != null) {
                    T0 t01 = q0.U5();
                    if(t01 != null) {
                        t01.addAll(arrayList0);
                    }
                }
            });
        }
        this.setResult(-1);
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void O1(PostHeadSettingActivity postHeadSettingActivity0, ArrayList arrayList0, F0 f00) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        X x0 = X.c(this.getLayoutInflater());
        L.o(x0, "inflate(...)");
        this.w = x0;
        X x1 = null;
        if(x0 == null) {
            L.S("binding");
            x0 = null;
        }
        this.setContentView(x0.b());
        this.x = (GalleryInfo)this.getIntent().getParcelableExtra("com.dcinside.app.extra.GALLERY_INFO");
        X x2 = this.w;
        if(x2 == null) {
            L.S("binding");
        }
        else {
            x1 = x2;
        }
        this.S0(x1.e);
        kr.bhbfhfb.designcompat.a.c(this.I0());
        this.setTitle("말머리 설정");
        this.M1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

