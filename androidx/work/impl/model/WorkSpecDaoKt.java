package androidx.work.impl.model;

import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import org.intellij.lang.annotations.d;
import y4.l;
import y4.m;

@s0({"SMAP\nWorkSpecDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,511:1\n53#2:512\n55#2:516\n53#2:517\n55#2:521\n50#3:513\n55#3:515\n50#3:518\n55#3:520\n107#4:514\n107#4:519\n*S KotlinDebug\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n*L\n475#1:512\n475#1:516\n491#1:517\n491#1:521\n475#1:513\n475#1:515\n491#1:518\n491#1:520\n475#1:514\n491#1:519\n*E\n"})
public final class WorkSpecDaoKt {
    @l
    private static final String a = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";
    @d("sql")
    @l
    private static final String b = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    @d("sql")
    @l
    private static final String c = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    @d("sql")
    @l
    private static final String d = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";

    @l
    public static final i a(@l i i0, @l K k0) {
        L.p(i0, "<this>");
        L.p(k0, "dispatcher");
        return k.N0(k.g0(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l kotlin.coroutines.d d0) {
                androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2 workSpecDaoKt$dedup$$inlined$map$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l kotlin.coroutines.d d0) {
                        androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1 workSpecDaoKt$dedup$$inlined$map$1$2$10;
                        if(d0 instanceof androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1) {
                            workSpecDaoKt$dedup$$inlined$map$1$2$10 = (androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1)d0;
                            int v = workSpecDaoKt$dedup$$inlined$map$1$2$10.l;
                            if((v & 0x80000000) == 0) {
                                workSpecDaoKt$dedup$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object k;
                                    int l;
                                    Object m;

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.l |= 0x80000000;
                                        return d0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                workSpecDaoKt$dedup$$inlined$map$1$2$10.l = v ^ 0x80000000;
                            }
                        }
                        else {
                            workSpecDaoKt$dedup$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object k;
                                int l;
                                Object m;

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    this.k = object0;
                                    this.l |= 0x80000000;
                                    return d0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = workSpecDaoKt$dedup$$inlined$map$1$2$10.k;
                        Object object2 = b.l();
                        switch(workSpecDaoKt$dedup$$inlined$map$1$2$10.l) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.a;
                                ArrayList arrayList0 = new ArrayList(u.b0(((List)object0), 10));
                                for(Object object3: ((List)object0)) {
                                    arrayList0.add(((WorkInfoPojo)object3).S());
                                }
                                workSpecDaoKt$dedup$$inlined$map$1$2$10.l = 1;
                                return j0.emit(arrayList0, workSpecDaoKt$dedup$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
                            }
                            case 1: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = i0.collect(workSpecDaoKt$dedup$$inlined$map$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }), k0);
    }

    @l
    public static final i b(@l WorkSpecDao workSpecDao0, @l UUID uUID0) {
        L.p(workSpecDao0, "<this>");
        L.p(uUID0, "id");
        return k.g0(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l kotlin.coroutines.d d0) {
                androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2 workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l kotlin.coroutines.d d0) {
                        androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1 workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10;
                        if(d0 instanceof androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1) {
                            workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = (androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1)d0;
                            int v = workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.l;
                            if((v & 0x80000000) == 0) {
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object k;
                                    int l;
                                    Object m;

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.l |= 0x80000000;
                                        return d0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.l = v ^ 0x80000000;
                            }
                        }
                        else {
                            workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object k;
                                int l;
                                Object m;

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    this.k = object0;
                                    this.l |= 0x80000000;
                                    return d0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.k;
                        Object object2 = b.l();
                        switch(workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.l) {
                            case 0: {
                                f0.n(object1);
                                WorkInfoPojo workSpec$WorkInfoPojo0 = (WorkInfoPojo)u.G2(((List)object0));
                                WorkInfo workInfo0 = workSpec$WorkInfoPojo0 == null ? null : workSpec$WorkInfoPojo0.S();
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.l = 1;
                                return this.a.emit(workInfo0, workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
                            }
                            case 1: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = workSpecDao0.i(u.k(String.valueOf(uUID0))).collect(workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        });
    }

    @l
    public static final i c(@l WorkSpecDao workSpecDao0, @l K k0, @l String s) {
        L.p(workSpecDao0, "<this>");
        L.p(k0, "dispatcher");
        L.p(s, "name");
        return WorkSpecDaoKt.a(workSpecDao0.P(s), k0);
    }

    @l
    public static final i d(@l WorkSpecDao workSpecDao0, @l K k0, @l String s) {
        L.p(workSpecDao0, "<this>");
        L.p(k0, "dispatcher");
        L.p(s, "tag");
        return WorkSpecDaoKt.a(workSpecDao0.p(s), k0);
    }
}

