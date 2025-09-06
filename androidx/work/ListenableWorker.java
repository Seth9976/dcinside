package androidx.work;

import android.content.Context;
import android.net.Network;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ListenableWorker {
    public static abstract class Result {
        @RestrictTo({Scope.b})
        public static final class Failure extends Result {
            private final Data a;

            public Failure() {
                this(Data.c);
            }

            public Failure(@NonNull Data data0) {
                this.a = data0;
            }

            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data c() {
                return this.a;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Failure.class == class0 ? this.a.equals(((Failure)object0).a) : false;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return this.a.hashCode() + 846803280;
            }

            @Override
            @NonNull
            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        @RestrictTo({Scope.b})
        public static final class Retry extends Result {
            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data c() {
                return Data.c;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Retry.class == class0;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return 0x18BE74E;
            }

            @Override
            @NonNull
            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo({Scope.b})
        public static final class Success extends Result {
            private final Data a;

            public Success() {
                this(Data.c);
            }

            public Success(@NonNull Data data0) {
                this.a = data0;
            }

            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data c() {
                return this.a;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Success.class == class0 ? this.a.equals(((Success)object0).a) : false;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return this.a.hashCode() - 0x6FDE0E09;
            }

            @Override
            @NonNull
            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }

        @NonNull
        public static Result a() {
            return new Failure();
        }

        @NonNull
        public static Result b(@NonNull Data data0) {
            return new Failure(data0);
        }

        @NonNull
        public abstract Data c();

        @NonNull
        public static Result d() {
            return new Retry();
        }

        @NonNull
        public static Result e() {
            return new Success();
        }

        @NonNull
        public static Result f(@NonNull Data data0) {
            return new Success(data0);
        }
    }

    @NonNull
    private Context mAppContext;
    private final AtomicInteger mStopReason;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    public ListenableWorker(@NonNull Context context0, @NonNull WorkerParameters workerParameters0) {
        this.mStopReason = new AtomicInteger(0xFFFFFF00);
        if(context0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if(workerParameters0 == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context0;
        this.mWorkerParams = workerParameters0;
    }

    // 检测为 Lambda 实现
    private static Object b(Completer callbackToFutureAdapter$Completer0) throws Exception [...]

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @NonNull
    public t0 getForegroundInfoAsync() {
        return CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            callbackToFutureAdapter$Completer0.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
            return "default failing getForegroundInfoAsync";
        });
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.d();
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.e();
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return this.mWorkerParams.f();
    }

    @IntRange(from = 0L)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.h();
    }

    @RequiresApi(0x1F)
    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @NonNull
    public final Set getTags() {
        return this.mWorkerParams.j();
    }

    @NonNull
    @RestrictTo({Scope.b})
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.k();
    }

    @NonNull
    @RequiresApi(24)
    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.l();
    }

    @NonNull
    @RequiresApi(24)
    public final List getTriggeredContentUris() {
        return this.mWorkerParams.m();
    }

    @NonNull
    @RestrictTo({Scope.b})
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.o();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != 0xFFFFFF00;
    }

    @RestrictTo({Scope.b})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final t0 setForegroundAsync(@NonNull ForegroundInfo foregroundInfo0) {
        return this.mWorkerParams.b().a(this.getApplicationContext(), this.getId(), foregroundInfo0);
    }

    @NonNull
    public t0 setProgressAsync(@NonNull Data data0) {
        return this.mWorkerParams.g().a(this.getApplicationContext(), this.getId(), data0);
    }

    @RestrictTo({Scope.b})
    public final void setUsed() {
        this.mUsed = true;
    }

    @MainThread
    @NonNull
    public abstract t0 startWork();

    @RestrictTo({Scope.b})
    public final void stop(int v) {
        if(this.mStopReason.compareAndSet(0xFFFFFF00, v)) {
            this.onStopped();
        }
    }
}

