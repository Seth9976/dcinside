package com.dcinside.app.write.temp;

import android.content.Context;
import android.net.Uri;
import com.dcinside.app.http.f;
import com.dcinside.app.image.j;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.wk;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.c;
import kotlin.io.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import rx.g;
import y4.l;

@s0({"SMAP\nPostTempUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTempUtil.kt\ncom/dcinside/app/write/temp/PostTempUtil\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n177#2,9:108\n1#3:117\n774#4:118\n865#4,2:119\n*S KotlinDebug\n*F\n+ 1 PostTempUtil.kt\ncom/dcinside/app/write/temp/PostTempUtil\n*L\n22#1:108,9\n56#1:118\n56#1:119,2\n*E\n"})
public final class r {
    @l
    public static final r a;

    static {
        r.a = new r();
    }

    public final void c(@l wk wk0, @l wk wk1, @l List list0) {
        L.p(wk0, "from");
        L.p(wk1, "to");
        L.p(list0, "list");
        String s = wk0.d();
        File file0 = wk1.c();
        if(s != null && file0 != null) {
            long v = System.nanoTime();
            for(Object object0: list0) {
                k0 k00 = (k0)object0;
                if(k0.r.B(k00)) {
                    String s1 = k00.V5();
                    if(s1 != null) {
                        if(!v.v2(s1, s, false, 2, null)) {
                            s1 = null;
                        }
                        if(s1 != null) {
                            File file1 = new File(s1);
                            if(file1.exists()) {
                                ++v;
                                k00.j6(m.T(file1, new File(file0, v + this.d(file1)), false, 0, 6, null).getPath());
                            }
                        }
                    }
                }
            }
        }
    }

    private final String d(File file0) {
        String s;
        try {
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                byte[] arr_b = new byte[8];
                fileInputStream0.read(arr_b, 0, 8);
                s = Gk.m(arr_b);
            }
            catch(Throwable throwable0) {
                c.a(fileInputStream0, throwable0);
                throw throwable0;
            }
            c.a(fileInputStream0, null);
            return s == null ? ".jpg" : s;
        }
        catch(Exception unused_ex) {
            return ".jpg";
        }
    }

    @l
    public final g e(@l Context context0, @l String s, @l List list0, long v) {
        static final class a extends N implements Function1 {
            final kotlin.jvm.internal.l0.g e;
            final Context f;
            final String g;
            final long h;

            a(kotlin.jvm.internal.l0.g l0$g0, Context context0, String s, long v) {
                this.e = l0$g0;
                this.f = context0;
                this.g = s;
                this.h = v;
                super(1);
            }

            public final g d(k0 k00) {
                static final class com.dcinside.app.write.temp.r.a.a extends N implements Function1 {
                    final String e;
                    final String f;

                    com.dcinside.app.write.temp.r.a.a(String s, String s1) {
                        this.e = s;
                        this.f = s1;
                        super(1);
                    }

                    public final g a(File file0) {
                        L.m(file0);
                        String s = r.a.d(file0);
                        File file1 = new File(this.e);
                        return j.a.e(file0, file1, this.f + s);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((File)object0));
                    }
                }


                static final class b extends N implements Function1 {
                    final long e;

                    b(long v) {
                        this.e = v;
                        super(1);
                    }

                    public final g a(@l File file0) {
                        L.p(file0, "file");
                        String s = file0.getPath();
                        L.o(s, "getPath(...)");
                        k0 k00 = k0.r.q(s, this.e);
                        return k00 == null ? g.X1(new f(0x7F1507E8)) : g.Q2(k00);  // string:post_temp_save_fail "임시저장에 실패했습니다."
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((File)object0));
                    }
                }


                static final class com.dcinside.app.write.temp.r.a.c extends N implements Function1 {
                    final long e;

                    com.dcinside.app.write.temp.r.a.c(long v) {
                        this.e = v;
                        super(1);
                    }

                    public final g a(@l File file0) {
                        L.p(file0, "file");
                        String s = file0.getPath();
                        L.o(s, "getPath(...)");
                        k0 k00 = k0.r.q(s, this.e);
                        return k00 == null ? g.X1(new f(0x7F1507E8)) : g.Q2(k00);  // string:post_temp_save_fail "임시저장에 실패했습니다."
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((File)object0));
                    }
                }

                long v = this.e.a + 1L;
                this.e.a = v;
                String s = String.valueOf(v);
                com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                if(!k0$a0.B(k00)) {
                    return g.Q2(k00);
                }
                if(k0$a0.D(k00)) {
                    if(k0$a0.C(k00)) {
                        String s1 = k00.U5();
                        if(s1 != null) {
                            k00.i6(v.l2(s1, "bigdccon", "", false, 4, null));
                        }
                        return g.Q2(k00);
                    }
                    Uri uri0 = Uri.parse(k00.V5());
                    L.m(uri0);
                    return j.a.g(this.f, uri0).f2((Object object0) -> {
                        L.p(new com.dcinside.app.write.temp.r.a.a(this.g, s), "$tmp0");
                        return (g)new com.dcinside.app.write.temp.r.a.a(this.g, s).invoke(object0);
                    }).f2((Object object0) -> {
                        L.p(new b(this.h), "$tmp0");
                        return (g)new b(this.h).invoke(object0);
                    });
                }
                File file0 = wk.b.c();
                String s2 = k00.V5();
                if(file0 != null && s2 != null) {
                    String s3 = file0.getPath();
                    L.o(s3, "getPath(...)");
                    if(v.v2(s2, s3, false, 2, null)) {
                        File file1 = new File(s2);
                        String s4 = r.a.d(file1);
                        File file2 = new File(this.g);
                        return j.a.e(file1, file2, s + s4).f2((Object object0) -> {
                            L.p(new com.dcinside.app.write.temp.r.a.c(this.h), "$tmp0");
                            return (g)new com.dcinside.app.write.temp.r.a.c(this.h).invoke(object0);
                        });
                    }
                }
                return g.Q2(k00);
            }

            // 检测为 Lambda 实现
            private static final g e(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final g f(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final g g(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.d(((k0)object0));
            }
        }

        L.p(context0, "context");
        L.p(s, "path");
        L.p(list0, "items");
        kotlin.jvm.internal.l0.g l0$g0 = new kotlin.jvm.internal.l0.g();
        l0$g0.a = System.nanoTime();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!k0.r.x(((k0)object0)) && !k0.r.y(((k0)object0))) {
                arrayList0.add(object0);
            }
        }
        g g0 = g.y2(arrayList0).f2((Object object0) -> {
            L.p(new a(l0$g0, context0, s, v), "$tmp0");
            return (g)new a(l0$g0, context0, s, v).invoke(object0);
        }).z6();
        L.o(g0, "toList(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final g f(Function1 function10, Object object0) [...]
}

