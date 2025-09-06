package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.d;
import com.google.firebase.concurrent.A;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.n.a;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.r;
import com.google.firebase.remoteconfig.internal.rollouts.e;
import com.google.firebase.remoteconfig.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p {
    private final Context a;
    private final h b;
    @Nullable
    private final d c;
    private final Executor d;
    private final g e;
    private final g f;
    private final g g;
    private final n h;
    private final com.google.firebase.remoteconfig.internal.p i;
    private final q j;
    private final k k;
    private final r l;
    private final e m;
    public static final String n = "";
    public static final long o = 0L;
    public static final double p = 0.0;
    public static final boolean q = false;
    public static final byte[] r = null;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = -1;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final String z = "FirebaseRemoteConfig";

    static {
        p.r = new byte[0];
    }

    p(Context context0, h h0, k k0, @Nullable d d0, Executor executor0, g g0, g g1, g g2, n n0, com.google.firebase.remoteconfig.internal.p p0, q q0, r r0, e e0) {
        this.a = context0;
        this.b = h0;
        this.k = k0;
        this.c = d0;
        this.d = executor0;
        this.e = g0;
        this.f = g1;
        this.g = g2;
        this.h = n0;
        this.i = p0;
        this.j = q0;
        this.l = r0;
        this.m = e0;
    }

    private static boolean A(com.google.firebase.remoteconfig.internal.h h0, @Nullable com.google.firebase.remoteconfig.internal.h h1) {
        return h1 == null || !h0.h().equals(h1.h());
    }

    // 检测为 Lambda 实现
    private Task B(Task task0, Task task1, Task task2) throws Exception [...]

    // 检测为 Lambda 实现
    private static t C(Task task0, Task task1) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task D(a n$a0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task E(a n$a0) throws Exception [...]

    // 检测为 Lambda 实现
    private Task F(Void void0) throws Exception [...]

    // 检测为 Lambda 实现
    private Void G() throws Exception [...]

    // 检测为 Lambda 实现
    private Void H(v v0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task I(com.google.firebase.remoteconfig.internal.h h0) throws Exception [...]

    private boolean J(Task task0) {
        if(task0.isSuccessful()) {
            this.e.d();
            com.google.firebase.remoteconfig.internal.h h0 = (com.google.firebase.remoteconfig.internal.h)task0.getResult();
            if(h0 != null) {
                this.T(h0.e());
                this.m.g(h0);
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    @NonNull
    public Task K() {
        j j0 = () -> {
            this.f.d();
            this.e.d();
            this.g.d();
            this.j.a();
            return null;
        };
        return Tasks.call(this.d, j0);
    }

    public void L(Runnable runnable0) {
        this.d.execute(runnable0);
    }

    @NonNull
    public Task M(@NonNull v v0) {
        com.google.firebase.remoteconfig.k k0 = () -> {
            this.j.n(v0);
            return null;
        };
        return Tasks.call(this.d, k0);
    }

    void N(boolean z) {
        this.l.e(z);
    }

    @NonNull
    public Task O(@XmlRes int v) {
        return this.Q(w.a(this.a, v));
    }

    @NonNull
    public Task P(@NonNull Map map0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof byte[]) {
                hashMap0.put(((String)map$Entry0.getKey()), new String(((byte[])object1)));
            }
            else {
                hashMap0.put(((String)map$Entry0.getKey()), object1.toString());
            }
        }
        return this.Q(hashMap0);
    }

    private Task Q(Map map0) {
        try {
            com.google.firebase.remoteconfig.internal.h h0 = com.google.firebase.remoteconfig.internal.h.l().b(map0).a();
            return this.g.m(h0).onSuccessTask(A.a(), (com.google.firebase.remoteconfig.internal.h h0) -> Tasks.forResult(null));
        }
        catch(JSONException jSONException0) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", jSONException0);
            return Tasks.forResult(null);
        }
    }

    void R() {
        this.f.f();
        this.g.f();
        this.e.f();
    }

    @VisibleForTesting
    static List S(JSONArray jSONArray0) throws JSONException {
        List list0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            HashMap hashMap0 = new HashMap();
            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                hashMap0.put(((String)object0), jSONObject0.getString(((String)object0)));
            }
            list0.add(hashMap0);
        }
        return list0;
    }

    @VisibleForTesting
    void T(@NonNull JSONArray jSONArray0) {
        if(this.c == null) {
            return;
        }
        try {
            List list0 = p.S(jSONArray0);
            this.c.m(list0);
        }
        catch(JSONException jSONException0) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", jSONException0);
        }
        catch(com.google.firebase.abt.a a0) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", a0);
        }
    }

    @NonNull
    public Task j() {
        Task task0 = this.e.f();
        Task task1 = this.f.f();
        Task task2 = Tasks.whenAllComplete(new Task[]{task0, task1});
        f f0 = (Task task2) -> {
            if(task0.isSuccessful() && task0.getResult() != null) {
                com.google.firebase.remoteconfig.internal.h h0 = (com.google.firebase.remoteconfig.internal.h)task0.getResult();
                if(task1.isSuccessful() && !p.A(h0, ((com.google.firebase.remoteconfig.internal.h)task1.getResult()))) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                Task task3 = this.f.m(h0);
                com.google.firebase.remoteconfig.h h1 = new com.google.firebase.remoteconfig.h(this);
                return task3.continueWith(this.d, h1);
            }
            return Tasks.forResult(Boolean.FALSE);
        };
        return task2.continueWithTask(this.d, f0);
    }

    @NonNull
    public com.google.firebase.remoteconfig.e k(@NonNull com.google.firebase.remoteconfig.d d0) {
        return this.l.b(d0);
    }

    @NonNull
    public Task l() {
        Task task0 = this.f.f();
        Task task1 = this.g.f();
        Task task2 = this.e.f();
        l l0 = () -> this.j.d();
        Task task3 = Tasks.call(this.d, l0);
        Task task4 = Tasks.whenAllComplete(new Task[]{task0, task1, task2, task3, this.k.getId(), this.k.b(false)});
        m m0 = (Task task1) -> ((t)task3.getResult());
        return task4.continueWith(this.d, m0);
    }

    @NonNull
    public Task m() {
        return this.h.i().onSuccessTask(A.a(), (a n$a0) -> Tasks.forResult(null));
    }

    @NonNull
    public Task n(long v) {
        return this.h.j(v).onSuccessTask(A.a(), (a n$a0) -> Tasks.forResult(null));
    }

    @NonNull
    public Task o() {
        Task task0 = this.m();
        com.google.firebase.remoteconfig.n n0 = (Void void0) -> this.j();
        return task0.onSuccessTask(this.d, n0);
    }

    @NonNull
    public Map p() {
        return this.i.d();
    }

    public boolean q(@NonNull String s) {
        return this.i.e(s);
    }

    public double r(@NonNull String s) {
        return this.i.h(s);
    }

    // 检测为 Lambda 实现
    @NonNull
    public t s() [...]

    @NonNull
    public static p t() {
        return p.u(h.p());
    }

    @NonNull
    public static p u(@NonNull h h0) {
        return ((B)h0.l(B.class)).g();
    }

    @NonNull
    public Set v(@NonNull String s) {
        return this.i.k(s);
    }

    public long w(@NonNull String s) {
        return this.i.m(s);
    }

    e x() {
        return this.m;
    }

    @NonNull
    public String y(@NonNull String s) {
        return this.i.o(s);
    }

    @NonNull
    public com.google.firebase.remoteconfig.w z(@NonNull String s) {
        return this.i.q(s);
    }
}

