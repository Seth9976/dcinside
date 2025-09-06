package com.dcinside.app.archive.folder;

import A3.p;
import Z.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.archive.util.u;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.T0;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.f;

@SuppressLint({"ClickableViewAccessibility"})
public final class g extends ViewHolder implements d {
    @l
    @f
    public TextView a;
    @l
    @f
    public TextView b;
    @l
    @f
    public View c;
    @l
    @f
    public View d;
    @l
    @f
    public View e;
    private long f;

    public g(@l View view0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.folder.ArchiveFolderHolder$1", f = "ArchiveFolderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final g l;

            a(g g0, kotlin.coroutines.d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.k();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.folder.ArchiveFolderHolder$2", f = "ArchiveFolderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final g l;

            b(g g0, kotlin.coroutines.d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.o();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B013E);  // id:archive_folder_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B013C);  // id:archive_folder_count
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B013B);  // id:archive_folder_change_name
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B013F);  // id:archive_folder_remove
        L.o(view4, "findViewById(...)");
        this.d = view4;
        View view5 = view0.findViewById(0x7F0B013A);  // id:archive_folder_change
        L.o(view5, "findViewById(...)");
        this.e = view5;
        r.M(this.c, null, new a(this, null), 1, null);
        r.M(this.d, null, new b(this, null), 1, null);
        this.e.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            return this.n(motionEvent0);
        });
    }

    @Override  // Z.d
    public void a() {
    }

    @Override  // Z.d
    public void c() {
    }

    // 检测为 Lambda 实现
    private static final boolean h(g g0, View view0, MotionEvent motionEvent0) [...]

    private final void k() {
        @s0({"SMAP\nArchiveFolderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveFolderHolder.kt\ncom/dcinside/app/archive/folder/ArchiveFolderHolder$changeFolderName$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n112#2,3:104\n129#2,15:108\n116#2:123\n129#2,15:124\n1#3:107\n*S KotlinDebug\n*F\n+ 1 ArchiveFolderHolder.kt\ncom/dcinside/app/archive/folder/ArchiveFolderHolder$changeFolderName$1\n*L\n61#1:104,3\n61#1:108,15\n61#1:123\n61#1:124,15\n61#1:107\n*E\n"})
        static final class c extends N implements Function1 {
            final Context e;
            final g f;

            c(Context context0, g g0) {
                this.e = context0;
                this.f = g0;
                super(1);
            }

            public final void b(String s) {
                if(m0.a.a.i(s)) {
                    Dl.D(this.e, 0x7F1506E6);  // string:need_folder_name "폴더명을 입력하세요."
                    this.f.k();
                    return;
                }
                Context context0 = this.e;
                g g0 = this.f;
                F0 f00 = F0.g4();
                L.m(f00);
                if(f00.E0()) {
                    goto label_30;
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_52;
                try {
                label_10:
                    com.dcinside.app.realm.d.a d$a0 = com.dcinside.app.realm.d.f;
                    L.m(s);
                    if(d$a0.f(f00, 0, s)) {
                        Dl.D(context0, 0x7F1502B6);  // string:exist_folder_name "이미 사용중인 폴더명입니다."
                        g0.k();
                    }
                    else {
                        com.dcinside.app.realm.d d0 = d$a0.c(f00, 0);
                        T0 t00 = d0.S5();
                        com.dcinside.app.realm.c c0 = d$a0.b(f00, g0.m());
                        if(c0 != null) {
                            c0.U5(s);
                            T0 t01 = new T0();
                            t01.addAll(t00);
                            d0.c6(t01);
                        }
                    }
                    f00.p();
                    goto label_52;
                }
                catch(Throwable throwable1) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
                try {
                label_30:
                    com.dcinside.app.realm.d.a d$a1 = com.dcinside.app.realm.d.f;
                    L.m(s);
                    if(d$a1.f(f00, 0, s)) {
                        Dl.D(context0, 0x7F1502B6);  // string:exist_folder_name "이미 사용중인 폴더명입니다."
                        g0.k();
                    }
                    else {
                        com.dcinside.app.realm.d d1 = d$a1.c(f00, 0);
                        T0 t02 = d1.S5();
                        com.dcinside.app.realm.c c1 = d$a1.b(f00, g0.m());
                        if(c1 != null) {
                            c1.U5(s);
                            T0 t03 = new T0();
                            t03.addAll(t02);
                            d1.c6(t03);
                        }
                    }
                    goto label_52;
                }
                catch(Throwable throwable2) {
                }
                try {
                    throw throwable2;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable3) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable3;
                }
            label_52:
                kotlin.io.c.a(f00, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        L.m(context0);
        u.u(context0, 0x7F1502A3, this.f).x5((Object object0) -> {
            L.p(new c(context0, this), "$tmp0");
            new c(context0, this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void l(Function1 function10, Object object0) [...]

    public final long m() {
        return this.f;
    }

    private final boolean n(MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return false;
        }
        if(motionEvent0.getAction() != 0 || this.getBindingAdapterPosition() < 0) {
            return false;
        }
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.archive.folder.ArchiveFolderActivity");
        ItemTouchHelper itemTouchHelper0 = ((ArchiveFolderActivity)context0).S1();
        L.m(itemTouchHelper0);
        itemTouchHelper0.H(this);
        return true;
    }

    private final void o() {
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.archive.folder.ArchiveFolderActivity");
        ((ArchiveFolderActivity)context0).Q1(this.f);
    }

    public final void p(long v) {
        this.f = v;
    }
}

