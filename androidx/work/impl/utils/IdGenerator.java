package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class IdGenerator {
    @l
    private final WorkDatabase a;

    public IdGenerator(@l WorkDatabase workDatabase0) {
        L.p(workDatabase0, "workDatabase");
        super();
        this.a = workDatabase0;
    }

    public final int c() {
        i i0 = () -> IdGeneratorKt.d(this.a, "next_alarm_manager_id");
        Object object0 = this.a.N(i0);
        L.o(object0, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number)object0).intValue();
    }

    // 检测为 Lambda 实现
    private static final Integer d(IdGenerator idGenerator0) [...]

    public final int e(int v, int v1) {
        j j0 = () -> {
            int v2 = IdGeneratorKt.d(this.a, "next_job_scheduler_id");
            if(v <= v2 && v2 <= v1) {
                return v2;
            }
            IdGeneratorKt.e(this.a, "next_job_scheduler_id", v + 1);
            return v;
        };
        Object object0 = this.a.N(j0);
        L.o(object0, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number)object0).intValue();
    }

    // 检测为 Lambda 实现
    private static final Integer f(IdGenerator idGenerator0, int v, int v1) [...]
}

