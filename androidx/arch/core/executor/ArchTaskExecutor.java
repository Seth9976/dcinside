package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({Scope.c})
public class ArchTaskExecutor extends TaskExecutor {
    @NonNull
    private TaskExecutor a;
    @NonNull
    private final TaskExecutor b;
    private static volatile ArchTaskExecutor c;
    @NonNull
    private static final Executor d;
    @NonNull
    private static final Executor e;

    static {
        ArchTaskExecutor.d = (Runnable runnable0) -> ArchTaskExecutor.h().d(runnable0);
        ArchTaskExecutor.e = (Runnable runnable0) -> ArchTaskExecutor.h().a(runnable0);
    }

    private ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor0 = new DefaultTaskExecutor();
        this.b = defaultTaskExecutor0;
        this.a = defaultTaskExecutor0;
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void a(@NonNull Runnable runnable0) {
        this.a.a(runnable0);
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public boolean c() {
        return this.a.c();
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void d(@NonNull Runnable runnable0) {
        this.a.d(runnable0);
    }

    @NonNull
    public static Executor g() {
        return ArchTaskExecutor.e;
    }

    @NonNull
    public static ArchTaskExecutor h() {
        if(ArchTaskExecutor.c != null) {
            return ArchTaskExecutor.c;
        }
        synchronized(ArchTaskExecutor.class) {
            if(ArchTaskExecutor.c == null) {
                ArchTaskExecutor.c = new ArchTaskExecutor();
            }
            return ArchTaskExecutor.c;
        }
    }

    @NonNull
    public static Executor i() {
        return ArchTaskExecutor.d;
    }

    // 检测为 Lambda 实现
    private static void j(Runnable runnable0) [...]

    // 检测为 Lambda 实现
    private static void k(Runnable runnable0) [...]

    public void l(@Nullable TaskExecutor taskExecutor0) {
        if(taskExecutor0 == null) {
            taskExecutor0 = this.b;
        }
        this.a = taskExecutor0;
    }
}

