package androidx.work.impl.workers;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDiagnosticsWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1855#2,2:87\n*S KotlinDebug\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n*L\n75#1:87,2\n*E\n"})
public final class DiagnosticsWorkerKt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-DiagnosticsWrkr", "tagWithPrefix(\"DiagnosticsWrkr\")");
        DiagnosticsWorkerKt.a = "WM-DiagnosticsWrkr";
    }

    // 去混淆评级： 低(20)
    public static final String a() [...] // 潜在的解密器

    private static final String c(WorkSpec workSpec0, String s, Integer integer0, String s1) {
        return '\n' + workSpec0.a + "\t " + workSpec0.c + "\t " + integer0 + "\t " + workSpec0.b.name() + "\t " + s + "\t " + s1 + '\t';
    }

    private static final String d(WorkNameDao workNameDao0, WorkTagDao workTagDao0, SystemIdInfoDao systemIdInfoDao0, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for(Object object0: list0) {
            SystemIdInfo systemIdInfo0 = systemIdInfoDao0.d(WorkSpecKt.a(((WorkSpec)object0)));
            stringBuilder0.append(DiagnosticsWorkerKt.c(((WorkSpec)object0), u.m3(workNameDao0.b(((WorkSpec)object0).a), ",", null, null, 0, null, null, 62, null), (systemIdInfo0 == null ? null : systemIdInfo0.c), u.m3(workTagDao0.c(((WorkSpec)object0).a), ",", null, null, 0, null, null, 62, null)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

