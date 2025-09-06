package androidx.work;

import android.net.Network;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.g;

public final class WorkerParameters {
    @RestrictTo({Scope.b})
    public static class RuntimeExtras {
        @NonNull
        public List a;
        @NonNull
        public List b;
        @Nullable
        @RequiresApi(28)
        public Network c;

        public RuntimeExtras() {
            this.a = Collections.emptyList();
            this.b = Collections.emptyList();
        }
    }

    @NonNull
    private UUID a;
    @NonNull
    private Data b;
    @NonNull
    private Set c;
    @NonNull
    private RuntimeExtras d;
    private int e;
    @NonNull
    private Executor f;
    @NonNull
    private g g;
    @NonNull
    private TaskExecutor h;
    @NonNull
    private WorkerFactory i;
    @NonNull
    private ProgressUpdater j;
    @NonNull
    private ForegroundUpdater k;
    private int l;

    @RestrictTo({Scope.b})
    public WorkerParameters(@NonNull UUID uUID0, @NonNull Data data0, @NonNull Collection collection0, @NonNull RuntimeExtras workerParameters$RuntimeExtras0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @NonNull Executor executor0, @NonNull g g0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkerFactory workerFactory0, @NonNull ProgressUpdater progressUpdater0, @NonNull ForegroundUpdater foregroundUpdater0) {
        this.a = uUID0;
        this.b = data0;
        this.c = new HashSet(collection0);
        this.d = workerParameters$RuntimeExtras0;
        this.e = v;
        this.l = v1;
        this.f = executor0;
        this.g = g0;
        this.h = taskExecutor0;
        this.i = workerFactory0;
        this.j = progressUpdater0;
        this.k = foregroundUpdater0;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public Executor a() {
        return this.f;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public ForegroundUpdater b() {
        return this.k;
    }

    @IntRange(from = 0L)
    public int c() {
        return this.l;
    }

    @NonNull
    public UUID d() {
        return this.a;
    }

    @NonNull
    public Data e() {
        return this.b;
    }

    @Nullable
    @RequiresApi(28)
    public Network f() {
        return this.d.c;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public ProgressUpdater g() {
        return this.j;
    }

    @IntRange(from = 0L)
    public int h() {
        return this.e;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public RuntimeExtras i() {
        return this.d;
    }

    @NonNull
    public Set j() {
        return this.c;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public TaskExecutor k() {
        return this.h;
    }

    @NonNull
    @RequiresApi(24)
    public List l() {
        return this.d.a;
    }

    @NonNull
    @RequiresApi(24)
    public List m() {
        return this.d.b;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public g n() {
        return this.g;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public WorkerFactory o() {
        return this.i;
    }
}

