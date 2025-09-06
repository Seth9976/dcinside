package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class ActivityResultCallerKt {
    @l
    public static final ActivityResultLauncher c(@l ActivityResultCaller activityResultCaller0, @l ActivityResultContract activityResultContract0, Object object0, @l ActivityResultRegistry activityResultRegistry0, @l Function1 function10) {
        L.p(activityResultCaller0, "<this>");
        L.p(activityResultContract0, "contract");
        L.p(activityResultRegistry0, "registry");
        L.p(function10, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller0.registerForActivityResult(activityResultContract0, activityResultRegistry0, (Object object0) -> {
            L.p(function10, "$callback");
            function10.invoke(object0);
        }), activityResultContract0, object0);
    }

    @l
    public static final ActivityResultLauncher d(@l ActivityResultCaller activityResultCaller0, @l ActivityResultContract activityResultContract0, Object object0, @l Function1 function10) {
        L.p(activityResultCaller0, "<this>");
        L.p(activityResultContract0, "contract");
        L.p(function10, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller0.registerForActivityResult(activityResultContract0, (Object object0) -> {
            L.p(function10, "$callback");
            function10.invoke(object0);
        }), activityResultContract0, object0);
    }

    // 检测为 Lambda 实现
    private static final void e(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void f(Function1 function10, Object object0) [...]
}

