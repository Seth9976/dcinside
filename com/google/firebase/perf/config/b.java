package com.google.firebase.perf.config;

import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

final class b {
    public static final class a extends c {
        private static a a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "firebase_performance_collection_deactivated";
        }

        protected Boolean f() {
            return false;
        }

        protected static a g() {
            synchronized(a.class) {
                if(a.a == null) {
                    a.a = new a();
                }
                return a.a;
            }
        }
    }

    public static final class com.google.firebase.perf.config.b.b extends c {
        private static com.google.firebase.perf.config.b.b a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // 潜在的解密器

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "firebase_performance_collection_enabled";
        }

        protected Boolean f() {
            return true;
        }

        protected static com.google.firebase.perf.config.b.b g() {
            synchronized(com.google.firebase.perf.config.b.b.class) {
                if(com.google.firebase.perf.config.b.b.a == null) {
                    com.google.firebase.perf.config.b.b.a = new com.google.firebase.perf.config.b.b();
                }
                return com.google.firebase.perf.config.b.b.a;
            }
        }
    }

    public static final class com.google.firebase.perf.config.b.c extends c {
        private static com.google.firebase.perf.config.b.c a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "experiment_app_start_ttid";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() [...] // Inlined contents

        protected Boolean f() {
            return false;
        }

        protected static com.google.firebase.perf.config.b.c g() {
            synchronized(com.google.firebase.perf.config.b.c.class) {
                if(com.google.firebase.perf.config.b.c.a == null) {
                    com.google.firebase.perf.config.b.c.a = new com.google.firebase.perf.config.b.c();
                }
                return com.google.firebase.perf.config.b.c.a;
            }
        }
    }

    public static final class d extends c {
        private static d a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "fragment_sampling_percentage";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_fragment_sampling_rate";
        }

        protected Double f() {
            return 0.0;
        }

        protected static d g() {
            synchronized(d.class) {
                if(d.a == null) {
                    d.a = new d();
                }
                return d.a;
            }
        }
    }

    public static final class e extends c {
        class com.google.firebase.perf.config.b.e.a extends HashMap {
            com.google.firebase.perf.config.b.e.a() {
                super();
                this.put(461L, "FIREPERF_AUTOPUSH");
                this.put(462L, "FIREPERF");
                this.put(675L, "FIREPERF_INTERNAL_LOW");
                this.put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        }

        private static e a;
        private static final Map b;

        static {
            e.b = DesugarCollections.unmodifiableMap(new com.google.firebase.perf.config.b.e.a());
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return "FIREPERF";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() [...] // Inlined contents

        // 去混淆评级： 低(20)
        protected String f() [...] // 潜在的解密器

        public static e g() {
            synchronized(e.class) {
                if(e.a == null) {
                    e.a = new e();
                }
                return e.a;
            }
        }

        protected static String h(long v) {
            return (String)e.b.get(v);
        }

        protected static boolean i(long v) {
            return e.b.containsKey(v);
        }
    }

    public static final class f extends c {
        private static f a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_network_event_count_bg";
        }

        protected Long f() {
            return 70L;
        }

        public static f g() {
            synchronized(f.class) {
                if(f.a == null) {
                    f.a = new f();
                }
                return f.a;
            }
        }
    }

    public static final class g extends c {
        private static g a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_network_event_count_fg";
        }

        protected Long f() {
            return 700L;
        }

        public static g g() {
            synchronized(g.class) {
                if(g.a == null) {
                    g.a = new g();
                }
                return g.a;
            }
        }
    }

    public static final class h extends c {
        private static h a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected Object b() {
            return this.g();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_network_request_sampling_rate";
        }

        protected Double f() {
            return 1.0;
        }

        protected Double g() {
            return (double)(((double)this.f()) / 1000.0);
        }

        protected static h h() {
            synchronized(h.class) {
                if(h.a == null) {
                    h.a = new h();
                }
                return h.a;
            }
        }
    }

    public static final class i extends c {
        private static i a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_time_limit_sec";
        }

        protected Long f() {
            return 600L;
        }

        public static i g() {
            synchronized(i.class) {
                if(i.a == null) {
                    i.a = new i();
                }
                return i.a;
            }
        }
    }

    public static final class j extends c {
        private static j a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return "";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_disabled_android_versions";
        }

        protected String f() [...] // Inlined contents

        protected static j g() {
            synchronized(j.class) {
                if(j.a == null) {
                    j.a = new j();
                }
                return j.a;
            }
        }
    }

    public static final class k extends c {
        private static k a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_enabled";
        }

        protected Boolean f() {
            return true;
        }

        protected static k g() {
            synchronized(k.class) {
                if(k.a == null) {
                    k.a = new k();
                }
                return k.a;
            }
        }
    }

    public static final class l extends c {
        private static l a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        protected Long f() {
            return 0L;
        }

        public static l g() {
            synchronized(l.class) {
                if(l.a == null) {
                    l.a = new l();
                }
                return l.a;
            }
        }
    }

    public static final class m extends c {
        private static m a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected Object b() {
            return this.g();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        protected Long f() {
            return 100L;
        }

        protected Long g() {
            return (long)(((long)this.f()) * 3L);
        }

        public static m h() {
            synchronized(m.class) {
                if(m.a == null) {
                    m.a = new m();
                }
                return m.a;
            }
        }
    }

    public static final class n extends c {
        private static n a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_max_length_minutes";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_max_duration_min";
        }

        protected Long f() {
            return 0xF0L;
        }

        public static n g() {
            synchronized(n.class) {
                if(n.a == null) {
                    n.a = new n();
                }
                return n.a;
            }
        }
    }

    public static final class o extends c {
        private static o a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        protected Long f() {
            return 0L;
        }

        public static o g() {
            synchronized(o.class) {
                if(o.a == null) {
                    o.a = new o();
                }
                return o.a;
            }
        }
    }

    public static final class p extends c {
        private static p a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected Object b() {
            return this.g();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        protected Long f() {
            return 100L;
        }

        protected Long g() {
            return (long)(((long)this.f()) * 3L);
        }

        public static p h() {
            synchronized(p.class) {
                if(p.a == null) {
                    p.a = new p();
                }
                return p.a;
            }
        }
    }

    public static final class q extends c {
        private static q a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected Object b() {
            return this.g();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_sampling_percentage";
        }

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_session_sampling_rate";
        }

        protected Double f() {
            return 0.01;
        }

        protected Double g() {
            return (double)(((double)this.f()) / 1000.0);
        }

        public static q h() {
            synchronized(q.class) {
                if(q.a == null) {
                    q.a = new q();
                }
                return q.a;
            }
        }
    }

    public static final class r extends c {
        private static r a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_trace_event_count_bg";
        }

        protected Long f() {
            return 30L;
        }

        public static r g() {
            synchronized(r.class) {
                if(r.a == null) {
                    r.a = new r();
                }
                return r.a;
            }
        }
    }

    public static final class s extends c {
        private static s a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_trace_event_count_fg";
        }

        protected Long f() {
            return 300L;
        }

        public static s g() {
            synchronized(s.class) {
                if(s.a == null) {
                    s.a = new s();
                }
                return s.a;
            }
        }
    }

    public static final class t extends c {
        private static t a;

        @Override  // com.google.firebase.perf.config.c
        protected Object a() {
            return this.f();
        }

        @Override  // com.google.firebase.perf.config.c
        protected Object b() {
            return this.g();
        }

        @Override  // com.google.firebase.perf.config.c
        protected String c() [...] // Inlined contents

        @Override  // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_trace_sampling_rate";
        }

        protected Double f() {
            return 1.0;
        }

        protected Double g() {
            return (double)(((double)this.f()) / 1000.0);
        }

        protected static t h() {
            synchronized(t.class) {
                if(t.a == null) {
                    t.a = new t();
                }
                return t.a;
            }
        }
    }

}

