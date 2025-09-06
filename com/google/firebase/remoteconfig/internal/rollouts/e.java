package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.interop.rollouts.f;
import com.google.firebase.remoteconfig.r;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class e {
    private g a;
    private a b;
    private Executor c;
    private Set d;

    public e(@NonNull g g0, @NonNull a a0, @NonNull Executor executor0) {
        this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.a = g0;
        this.b = a0;
        this.c = executor0;
    }

    // 检测为 Lambda 实现
    private void f(Task task0, f f0, h h0) [...]

    public void g(@NonNull h h0) {
        try {
            com.google.firebase.remoteconfig.interop.rollouts.e e0 = this.b.b(h0);
            for(Object object0: this.d) {
                this.c.execute(new d(((f)object0), e0));
            }
        }
        catch(r r0) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", r0);
        }
    }

    public void h(@NonNull f f0) {
        this.d.add(f0);
        Task task0 = this.a.f();
        task0.addOnSuccessListener(this.c, (h h0) -> try {
            h h1 = (h)task0.getResult();
            if(h1 != null) {
                com.google.firebase.remoteconfig.interop.rollouts.e e0 = this.b.b(h1);
                this.c.execute(() -> f0.a(e0));
            }
        }
        catch(r r0) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", r0);
        });
    }
}

