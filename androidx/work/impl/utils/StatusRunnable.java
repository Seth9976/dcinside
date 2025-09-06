package androidx.work.impl.utils;

import A3.a;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "StatusRunnable")
public final class StatusRunnable {
    @l
    public static final t0 a(@l WorkDatabase workDatabase0, @l TaskExecutor taskExecutor0, @l List list0) {
        L.p(workDatabase0, "<this>");
        L.p(taskExecutor0, "executor");
        L.p(list0, "ids");
        return StatusRunnable.f(workDatabase0, taskExecutor0, new Function1(list0) {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            public final List a(WorkDatabase workDatabase0) {
                L.p(workDatabase0, "db");
                List list0 = workDatabase0.Z().S(this.e);
                Object object0 = WorkSpec.B.apply(list0);
                L.o(object0, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
                return (List)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkDatabase)object0));
            }
        });
    }

    @l
    public static final t0 b(@l WorkDatabase workDatabase0, @l TaskExecutor taskExecutor0, @l String s) {
        L.p(workDatabase0, "<this>");
        L.p(taskExecutor0, "executor");
        L.p(s, "tag");
        return StatusRunnable.f(workDatabase0, taskExecutor0, new Function1(s) {
            final String e;

            {
                this.e = s;
                super(1);
            }

            public final List a(WorkDatabase workDatabase0) {
                L.p(workDatabase0, "db");
                List list0 = workDatabase0.Z().Q(this.e);
                Object object0 = WorkSpec.B.apply(list0);
                L.o(object0, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                return (List)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkDatabase)object0));
            }
        });
    }

    @l
    public static final t0 c(@l WorkDatabase workDatabase0, @l TaskExecutor taskExecutor0, @l UUID uUID0) {
        L.p(workDatabase0, "<this>");
        L.p(taskExecutor0, "executor");
        L.p(uUID0, "id");
        return StatusRunnable.f(workDatabase0, taskExecutor0, new Function1(uUID0) {
            final UUID e;

            {
                this.e = uUID0;
                super(1);
            }

            public final WorkInfo a(WorkDatabase workDatabase0) {
                L.p(workDatabase0, "db");
                WorkSpecDao workSpecDao0 = workDatabase0.Z();
                String s = this.e.toString();
                L.o(s, "id.toString()");
                WorkInfoPojo workSpec$WorkInfoPojo0 = workSpecDao0.F(s);
                return workSpec$WorkInfoPojo0 == null ? null : workSpec$WorkInfoPojo0.S();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkDatabase)object0));
            }
        });
    }

    @l
    public static final t0 d(@l WorkDatabase workDatabase0, @l TaskExecutor taskExecutor0, @l String s) {
        L.p(workDatabase0, "<this>");
        L.p(taskExecutor0, "executor");
        L.p(s, "name");
        return StatusRunnable.f(workDatabase0, taskExecutor0, new Function1(s) {
            final String e;

            {
                this.e = s;
                super(1);
            }

            public final List a(WorkDatabase workDatabase0) {
                L.p(workDatabase0, "db");
                List list0 = workDatabase0.Z().n(this.e);
                Object object0 = WorkSpec.B.apply(list0);
                L.o(object0, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return (List)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkDatabase)object0));
            }
        });
    }

    @l
    public static final t0 e(@l WorkDatabase workDatabase0, @l TaskExecutor taskExecutor0, @l WorkQuery workQuery0) {
        L.p(workDatabase0, "<this>");
        L.p(taskExecutor0, "executor");
        L.p(workQuery0, "querySpec");
        return StatusRunnable.f(workDatabase0, taskExecutor0, new Function1(workQuery0) {
            final WorkQuery e;

            {
                this.e = workQuery0;
                super(1);
            }

            public final List a(WorkDatabase workDatabase0) {
                L.p(workDatabase0, "db");
                List list0 = workDatabase0.V().a(RawQueries.b(this.e));
                Object object0 = WorkSpec.B.apply(list0);
                L.o(object0, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
                return (List)object0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((WorkDatabase)object0));
            }
        });
    }

    private static final t0 f(WorkDatabase workDatabase0, TaskExecutor taskExecutor0, Function1 function10) {
        SerialExecutor serialExecutor0 = taskExecutor0.d();
        L.o(serialExecutor0, "executor.serialTaskExecutor");
        return ListenableFutureKt.f(serialExecutor0, "loadStatusFuture", new a(function10, workDatabase0) {
            final Function1 e;
            final WorkDatabase f;

            {
                this.e = function10;
                this.f = workDatabase0;
                super(0);
            }

            @Override  // A3.a
            public final Object invoke() {
                return this.e.invoke(this.f);
            }
        });
    }
}

