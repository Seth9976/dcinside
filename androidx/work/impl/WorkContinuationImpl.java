package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.S0;

@RestrictTo({Scope.b})
public class WorkContinuationImpl extends WorkContinuation {
    private final WorkManagerImpl a;
    private final String b;
    private final ExistingWorkPolicy c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private boolean h;
    private Operation i;
    private static final String j;

    static {
        WorkContinuationImpl.j = "WM-WorkContinuationImpl";
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @Nullable String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        this(workManagerImpl0, s, existingWorkPolicy0, list0, null);
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @Nullable String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0, @Nullable List list1) {
        this.a = workManagerImpl0;
        this.b = s;
        this.c = existingWorkPolicy0;
        this.d = list0;
        this.g = list1;
        this.e = new ArrayList(list0.size());
        this.f = new ArrayList();
        if(list1 != null) {
            for(Object object0: list1) {
                this.f.addAll(((WorkContinuationImpl)object0).f);
            }
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(existingWorkPolicy0 == ExistingWorkPolicy.a && ((WorkRequest)list0.get(v)).d().E() != 0x7FFFFFFFFFFFFFFFL) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String s1 = ((WorkRequest)list0.get(v)).b();
            this.e.add(s1);
            this.f.add(s1);
        }
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @NonNull List list0) {
        this(workManagerImpl0, null, ExistingWorkPolicy.b, list0, null);
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    protected WorkContinuation b(@NonNull List list0) {
        OneTimeWorkRequest oneTimeWorkRequest0 = (OneTimeWorkRequest)new Builder(CombineContinuationsWorker.class).D(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(((WorkContinuationImpl)(((WorkContinuation)object0))));
        }
        List list1 = Collections.singletonList(oneTimeWorkRequest0);
        return new WorkContinuationImpl(this.a, null, ExistingWorkPolicy.b, list1, arrayList0);
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public Operation c() {
        if(!this.h) {
            this.i = OperationKt.e(this.a.o().n(), "EnqueueRunnable_" + this.j().name(), this.a.X().d(), () -> {
                EnqueueRunnable.b(this);
                return S0.a;
            });
            return this.i;
        }
        Logger.e().l("WM-WorkContinuationImpl", "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        return this.i;
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public t0 d() {
        return StatusRunnable.a(this.a.U(), this.a.X(), this.f);
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public LiveData e() {
        return this.a.V(this.f);
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation g(@NonNull List list0) {
        if(list0.isEmpty()) {
            return this;
        }
        List list1 = Collections.singletonList(this);
        return new WorkContinuationImpl(this.a, this.b, ExistingWorkPolicy.b, list0, list1);
    }

    @NonNull
    public List i() {
        return this.f;
    }

    @NonNull
    public ExistingWorkPolicy j() {
        return this.c;
    }

    @NonNull
    public List k() {
        return this.e;
    }

    @Nullable
    public String l() {
        return this.b;
    }

    @Nullable
    public List m() {
        return this.g;
    }

    @NonNull
    public List n() {
        return this.d;
    }

    @NonNull
    public WorkManagerImpl o() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    public boolean p() {
        return WorkContinuationImpl.q(this, new HashSet());
    }

    @RestrictTo({Scope.b})
    private static boolean q(@NonNull WorkContinuationImpl workContinuationImpl0, @NonNull Set set0) {
        set0.addAll(workContinuationImpl0.k());
        Set set1 = WorkContinuationImpl.u(workContinuationImpl0);
        for(Object object0: set0) {
            if(set1.contains(((String)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        List list0 = workContinuationImpl0.m();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object1: list0) {
                if(WorkContinuationImpl.q(((WorkContinuationImpl)object1), set0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        set0.removeAll(workContinuationImpl0.k());
        return false;
    }

    public boolean r() {
        return this.h;
    }

    // 检测为 Lambda 实现
    private S0 s() [...]

    public void t() {
        this.h = true;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public static Set u(@NonNull WorkContinuationImpl workContinuationImpl0) {
        Set set0 = new HashSet();
        List list0 = workContinuationImpl0.m();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                set0.addAll(((WorkContinuationImpl)object0).k());
            }
        }
        return set0;
    }
}

