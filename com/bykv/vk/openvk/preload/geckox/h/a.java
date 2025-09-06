package com.bykv.vk.openvk.preload.geckox.h;

import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d.d;
import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.j;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.d.c;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.f;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    public static i a(com.bykv.vk.openvk.preload.a.d.a a0) throws m {
        try {
            boolean z = true;
            a0.f();
            z = false;
            return (i)com.bykv.vk.openvk.preload.a.b.a.m.A.a(a0);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw new p(eOFException0);
            }
            return k.a;
        }
        catch(d d0) {
            throw new p(d0);
        }
        catch(IOException iOException0) {
            throw new j(iOException0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new p(numberFormatException0);
        }
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(b b0) {
        return new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(com.bykv.vk.openvk.preload.geckox.e.a a0) {
        return a0 == null ? null : new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                b0.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                b0.b(com.bykv.vk.openvk.preload.geckox.d.b.class);
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(com.bykv.vk.openvk.preload.geckox.e.a a0, b b0) {
        return new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                if(a0 != null) {
                    b0.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }
        };
    }

    public static com.bykv.vk.openvk.preload.b.b a(com.bykv.vk.openvk.preload.geckox.e.a a0, File file0, b b0, com.bykv.vk.openvk.preload.falconx.a.a a1, Map map0, Map map1, String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(com.bykv.vk.openvk.preload.b.h.a.a().a(e.class).a(new Object[]{file0, b0.d()}).a(a1.a(e.class)).b());
        arrayList0.add(com.bykv.vk.openvk.preload.b.h.a.a().a(c.class).a(new Object[]{b0, map0, map1, a0, s}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                b0.a(c.class);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                List list0 = (List)b0.b(c.class);
                b0.a(c.class);
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    String s = ((UpdatePackage)object0).getAccessKey();
                    List list1 = (List)hashMap0.get(s);
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    list1.add(((UpdatePackage)object0));
                    hashMap0.put(s, list1);
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }
        }, a1.a(c.class)})).b());
        arrayList0.add(com.bykv.vk.openvk.preload.b.h.a.a().a(f.class).a(new Object[]{b.g()}).a(new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                if(a0 != null) {
                    ((UpdatePackage)b0.b(f.class)).getChannel();
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void c(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.c(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onPipelineEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }
        }).b());
        com.bykv.vk.openvk.preload.b.l.b l$b0 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a l$a0 = l$b0.a("branch_zip");
        com.bykv.vk.openvk.preload.b.l.b l$b1 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a l$a1 = l$b1.a("patch");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(h.class).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class).a(new Object[]{b0, file0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.b(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class)})).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class)})).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class).a(new Object[]{b0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class)})).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class)})).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class)})).b());
        arrayList1.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.e.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0)})).b());
        l$a1.a(arrayList1);
        com.bykv.vk.openvk.preload.b.l.a l$a2 = l$b1.a("full");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(g.class).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class).a(new Object[]{b0, file0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.b(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class)})).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class)})).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class)})).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.c.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0)})).b());
        l$a2.a(arrayList2);
        l$a0.a(l$b1.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a.a(b0)).b());
        com.bykv.vk.openvk.preload.b.l.a l$a3 = l$b0.a("branch_single_file");
        com.bykv.vk.openvk.preload.b.l.b l$b2 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a l$a4 = l$b2.a("patch");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(h.class).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class).a(new Object[]{b0, file0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.b(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class)})).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class)})).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class).a(new Object[]{b0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class)})).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class)})).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class)})).b());
        l$a4.a(arrayList3);
        com.bykv.vk.openvk.preload.b.l.a l$a5 = l$b2.a("full");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(g.class).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class).a(new Object[]{b0, file0}).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.b(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class)})).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0, b0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class)})).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[]{a.a(a0), a1.a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class)})).b());
        l$a5.a(arrayList4);
        l$a3.a(l$b2.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a.a(b0)).b());
        com.bykv.vk.openvk.preload.b.l.a l$a6 = l$b0.a("branch_myarchive_file");
        com.bykv.vk.openvk.preload.b.l.b l$b3 = new com.bykv.vk.openvk.preload.b.l.b();
        l$b3.a("patch").a(Collections.emptyList());
        l$b3.a("full").a(Collections.emptyList());
        l$a6.a(l$b3.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a.a(b0)).b());
        arrayList0.add(l$b0.a(com.bykv.vk.openvk.preload.geckox.d.a.class));
        arrayList0.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.i.class).a(new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void c(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.c(b0, d0);
                Pair pair0 = (Pair)b0.a(com.bykv.vk.openvk.preload.geckox.d.i.class);
                if(a0 != null) {
                    ((Long)pair0.second).longValue();
                }
            }
        }).b());
        return com.bykv.vk.openvk.preload.b.c.a(arrayList0, null);
    }

    public static void a(i i0, com.bykv.vk.openvk.preload.a.d.c c0) throws IOException {
        com.bykv.vk.openvk.preload.a.b.a.m.A.a(c0, i0);
    }

    private static com.bykv.vk.openvk.preload.b.b.a b(com.bykv.vk.openvk.preload.geckox.e.a a0, b b0) {
        return new com.bykv.vk.openvk.preload.b.b.a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.a(b0, d0);
                if(a0 != null) {
                    b0.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                if(a0 != null) {
                    b0.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0) {
                super.b(b0, d0);
                if(a0 != null) {
                    b0.b(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, com.bykv.vk.openvk.preload.b.d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }
        };
    }
}

