package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.K;
import com.google.firebase.components.w;
import com.google.firebase.h;
import com.google.firebase.platforminfo.i;
import h2.b;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import org.json.JSONArray;
import org.json.JSONObject;

public class g implements j, k {
    private final b a;
    private final Context b;
    private final b c;
    private final Set d;
    private final Executor e;

    private g(Context context0, String s, Set set0, b b0, Executor executor0) {
        this(() -> new l(context0, s), set0, executor0, b0, context0);
    }

    @VisibleForTesting
    g(b b0, Set set0, Executor executor0, b b1, Context context0) {
        this.a = b0;
        this.d = set0;
        this.e = executor0;
        this.c = b1;
        this.b = context0;
    }

    @Override  // com.google.firebase.heartbeatinfo.k
    @NonNull
    public a a(@NonNull String s) {
        synchronized(this) {
            l l0 = (l)this.a.get();
            if(l0.k(System.currentTimeMillis())) {
                l0.i();
                return a.d;
            }
            return a.b;
        }
    }

    @Override  // com.google.firebase.heartbeatinfo.j
    public Task b() {
        if(!UserManagerCompat.a(this.b)) {
            return Tasks.forResult("");
        }
        d d0 = () -> synchronized(this) {
            l l0 = (l)this.a.get();
            List list0 = l0.c();
            l0.b();
            JSONArray jSONArray0 = new JSONArray();
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                m m0 = (m)list0.get(v1);
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("agent", m0.c());
                jSONObject0.put("dates", new JSONArray(m0.b()));
                jSONArray0.put(jSONObject0);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("heartbeats", jSONArray0);
            jSONObject1.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, 11);
            try(GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(base64OutputStream0)) {
                gZIPOutputStream0.write(jSONObject1.toString().getBytes("UTF-8"));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(base64OutputStream0, throwable0);
                throw throwable0;
            }
            base64OutputStream0.close();
            return byteArrayOutputStream0.toString("UTF-8");
        };
        return Tasks.call(this.e, d0);
    }

    @NonNull
    public static com.google.firebase.components.g g() {
        K k0 = K.a(U1.a.class, Executor.class);
        return com.google.firebase.components.g.i(g.class, new Class[]{j.class, k.class}).b(w.m(Context.class)).b(w.m(h.class)).b(w.q(com.google.firebase.heartbeatinfo.h.class)).b(w.o(i.class)).b(w.l(k0)).f((com.google.firebase.components.i i0) -> new g(((Context)i0.a(Context.class)), ((h)i0.a(h.class)).t(), i0.d(com.google.firebase.heartbeatinfo.h.class), i0.e(i.class), ((Executor)i0.j(k0)))).d();
    }

    // 检测为 Lambda 实现
    private static g h(K k0, com.google.firebase.components.i i0) [...]

    // 检测为 Lambda 实现
    private String i() throws Exception [...]

    // 检测为 Lambda 实现
    private static l j(Context context0, String s) [...]

    // 检测为 Lambda 实现
    private Void k() throws Exception [...]

    public Task l() {
        if(this.d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if(!UserManagerCompat.a(this.b)) {
            return Tasks.forResult(null);
        }
        f f0 = () -> synchronized(this) {
            ((l)this.a.get()).m(System.currentTimeMillis(), ((i)this.c.get()).getUserAgent());
            return null;
        };
        return Tasks.call(this.e, f0);
    }
}

