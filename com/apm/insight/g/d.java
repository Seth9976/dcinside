package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.h;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d implements c {
    private Context a;

    public d(Context context0) {
        this.a = context0;
    }

    @Override  // com.apm.insight.g.c
    public final void a(long v, Thread thread0, Throwable throwable0, String s, String s1, boolean z) {
        File file0 = new File(j.a(this.a), s);
        a.a().a(file0.getName());
        file0.mkdirs();
        f.d(file0);
        com.apm.insight.runtime.a.f f0 = com.apm.insight.runtime.a.f.a();
        com.apm.insight.g.d.1 d$10 = new com.apm.insight.runtime.a.c.a() {
            private long a;
            private d j;

            {
                Throwable throwable0 = throwable0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                boolean z = m.c(throwable0);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                long v = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s = s1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                boolean z1 = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Thread thread0 = thread0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s1 = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                File file0 = file0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = 0L;
            }

            @Override  // com.apm.insight.runtime.a.c$a
            public final com.apm.insight.entity.a a(int v, com.apm.insight.entity.a a0) {
                this.a = SystemClock.uptimeMillis();
                switch(v) {
                    case 0: {
                        a0.a("data", m.a(throwable0));
                        a0.a("isOOM", Boolean.valueOf(m.c(throwable0)));
                        a0.a("isJava", 1);
                        a0.a("crash_time", v);
                        a0.a("launch_mode", 1);
                        a0.a("launch_time", -1L);
                        String s1 = s1;
                        if(s1 != null) {
                            a0.a("crash_md5", s1);
                            a0.a("crash_md5", s1);
                            if(z) {
                                a0.a("has_ignore", "true");
                                return a0;
                            }
                        }
                        break;
                    }
                    case 1: {
                        a0.a("crash_thread_name", (thread0 == null ? "" : thread0.getName()));
                        a0.a("tid", Process.myTid());
                        String s = "false";
                        a0.a("crash_after_crash", "false");
                        if(NativeImpl.e()) {
                            s = "true";
                        }
                        a0.a("crash_after_native", s);
                        a.a().a(thread0, throwable0, false, a0);
                        return a0;
                    }
                    case 2: {
                        if(m.c(throwable0)) {
                            com.apm.insight.l.a.a(d.this.a, a0.c());
                        }
                        JSONArray jSONArray0 = com.apm.insight.b.f.b().b();
                        long v1 = SystemClock.uptimeMillis();
                        JSONObject jSONObject0 = com.apm.insight.b.f.b().a(v1).a();
                        JSONArray jSONArray1 = com.apm.insight.b.j.a(v1);
                        a0.a("history_message", jSONArray0);
                        a0.a("current_message", jSONObject0);
                        a0.a("pending_messages", jSONArray1);
                        a0.a("disable_looper_monitor", "false");
                        a0.a("npth_force_apm_crash", "false");
                        return a0;
                    }
                    case 3: {
                        JSONObject jSONObject1 = m.b("jeb-dexdec-sb-st-3464");
                        if(jSONObject1 != null) {
                            a0.a("all_thread_stacks", jSONObject1);
                        }
                        a0.a("logcat", h.a("4a1591895198bd38U"));
                        return a0;
                    }
                    case 4: {
                        if(!m.c(throwable0)) {
                            com.apm.insight.l.a.a(d.this.a, a0.c());
                            return a0;
                        }
                        break;
                    }
                    case 5: {
                        a0.a("crash_uuid", s);
                        return a0;
                    }
                    default: {
                        return a0;
                    }
                }
                return a0;
            }

            @Override  // com.apm.insight.runtime.a.c$a
            public final com.apm.insight.entity.a b(int v, com.apm.insight.entity.a a0) {
                try {
                    f.a(new File(file0, file0.getName() + "." + v), a0.c());
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
                return a0;
            }
        };
        com.apm.insight.entity.a a0 = f0.a(CrashType.JAVA, d$10);
        long v1 = System.currentTimeMillis() - v;
        try {
            a0.a("crash_type", "normal");
            a0.b("crash_cost", String.valueOf(v1));
            a0.a("crash_cost", String.valueOf(v1 / 1000L));
        }
        catch(Throwable throwable1) {
            com.apm.insight.runtime.j.a(throwable1, "NPTH_CATCH");
        }
    }
}

