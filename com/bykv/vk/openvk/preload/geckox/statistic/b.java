package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b.a;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.d.b.b.f;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.util.Map;

public final class b {
    private static a a(Context context0) {
        return new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.a(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.t = ((Uri)pair0.first).toString();
                a0.n = e.a(context0);
                a0.v = SystemClock.uptimeMillis();
                a0.p = ((UpdatePackage)pair0.second).getFullPackage().getId();
                a0.c = ((UpdatePackage)pair0.second).getChannel();
                if(!TextUtils.isEmpty(((UpdatePackage)pair0.second).getAccessKey())) {
                    a0.a = ((UpdatePackage)pair0.second).getAccessKey();
                }
                if(!TextUtils.isEmpty(((UpdatePackage)pair0.second).getGroupName())) {
                    a0.b = ((UpdatePackage)pair0.second).getGroupName();
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                String s = ((Uri)pair0.first).toString();
                a0.z = false;
                a0.w = SystemClock.uptimeMillis();
                a0.u.add(new DownloadFailRecords(s, throwable0.getMessage()));
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.z = true;
                a0.w = SystemClock.uptimeMillis();
            }
        };
    }

    private static a a(com.bykv.vk.openvk.preload.geckox.b b0) {
        return new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.a(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onStart", "");
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onException", throwable0.toString());
                    c.a(b0, com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()));
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onEnd", "");
                    if(d0 instanceof com.bykv.vk.openvk.preload.geckox.d.e && d0.f() instanceof Map) {
                        b0.f().put(d0.getClass().getSimpleName(), ((Map)d0.f()).get("f36c832c8dbb162c49b46a7a6dd47fbd"));
                    }
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                try {
                    b0.f().put(d0.getClass().getSimpleName() + "onChainException", throwable0.toString());
                    c.a(b0, com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()));
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void c(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.c(b0, d0);
                try {
                    c.a(b0, com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()));
                }
                catch(Throwable unused_ex) {
                }
            }
        };
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.a a0, com.bykv.vk.openvk.preload.geckox.b b0) {
        a a1 = b.a(b0);
        a0.a(com.bykv.vk.openvk.preload.geckox.d.e.class, a1);
        a a2 = b.a(b0);
        a0.a(com.bykv.vk.openvk.preload.geckox.d.d.class, a2);
        a a3 = b.b(b0.a());
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, a3);
        com.bykv.vk.openvk.preload.geckox.statistic.b.6 b$60 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.i = false;
                SystemClock.uptimeMillis();
                a0.q = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel()).i = true;
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, b$60);
        com.bykv.vk.openvk.preload.geckox.statistic.b.7 b$70 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = false;
                SystemClock.uptimeMillis();
                a0.r = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, b$70);
        com.bykv.vk.openvk.preload.geckox.statistic.b.8 b$80 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = false;
                a0.l = SystemClock.uptimeMillis();
                a0.r = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = true;
                a0.l = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, b$80);
        com.bykv.vk.openvk.preload.geckox.statistic.b.11 b$110 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.k = false;
                a0.s = throwable0.getMessage();
                a0.m = SystemClock.uptimeMillis();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.k = true;
                a0.m = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, b$110);
        a a4 = b.a(b0.a());
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, a4);
        com.bykv.vk.openvk.preload.geckox.statistic.b.9 b$90 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.A = false;
                a0.x = SystemClock.uptimeMillis();
                a0.C = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.A = true;
                a0.x = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, b$90);
        com.bykv.vk.openvk.preload.geckox.statistic.b.10 b$100 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.B = false;
                a0.y = SystemClock.uptimeMillis();
                a0.D = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.B = true;
                a0.y = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, b$100);
        a a5 = b.b(b0.a());
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, a5);
        com.bykv.vk.openvk.preload.geckox.statistic.b.6 b$61 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.i = false;
                SystemClock.uptimeMillis();
                a0.q = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel()).i = true;
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, b$61);
        com.bykv.vk.openvk.preload.geckox.statistic.b.7 b$71 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = false;
                SystemClock.uptimeMillis();
                a0.r = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, b$71);
        com.bykv.vk.openvk.preload.geckox.statistic.b.8 b$81 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = false;
                a0.l = SystemClock.uptimeMillis();
                a0.r = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.j = true;
                a0.l = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, b$81);
        com.bykv.vk.openvk.preload.geckox.statistic.b.3 b$30 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.k = false;
                a0.m = SystemClock.uptimeMillis();
                a0.s = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.k = false;
                a0.m = SystemClock.uptimeMillis();
                a0.D = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void c(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.c(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.k = true;
                a0.m = SystemClock.uptimeMillis();
            }
        };
        a0.a(f.class, b$30);
        a a6 = b.a(b0.a());
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, a6);
        com.bykv.vk.openvk.preload.geckox.statistic.b.9 b$91 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.A = false;
                a0.x = SystemClock.uptimeMillis();
                a0.C = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.A = true;
                a0.x = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, b$91);
        com.bykv.vk.openvk.preload.geckox.statistic.b.2 b$20 = new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.B = false;
                a0.y = SystemClock.uptimeMillis();
                a0.D = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.b(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.B = false;
                a0.y = SystemClock.uptimeMillis();
                a0.D = throwable0.getMessage();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void c(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.c(b0, d0);
                Pair pair0 = (Pair)b0.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.B = true;
                a0.y = SystemClock.uptimeMillis();
            }
        };
        a0.a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, b$20);
    }

    private static a b(Context context0) {
        return new a() {
            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.a(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.d = ((Uri)pair0.first).toString();
                a0.n = e.a(context0);
                a0.f = SystemClock.uptimeMillis();
                a0.o = ((UpdatePackage)pair0.second).getPatch().getId();
                a0.p = ((UpdatePackage)pair0.second).getFullPackage().getId();
                a0.c = ((UpdatePackage)pair0.second).getChannel();
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
                super.a(b0, d0, throwable0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                String s = ((Uri)pair0.first).toString();
                a0.h = false;
                a0.g = SystemClock.uptimeMillis();
                a0.e.add(new DownloadFailRecords(s, throwable0.getMessage()));
            }

            @Override  // com.bykv.vk.openvk.preload.b.b.a
            public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
                super.b(b0, d0);
                Pair pair0 = (Pair)b0.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = com.bykv.vk.openvk.preload.geckox.statistic.a.a(d0.b()).a(((UpdatePackage)pair0.second).getChannel());
                a0.h = true;
                a0.g = SystemClock.uptimeMillis();
            }
        };
    }
}

