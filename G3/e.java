package g3;

import io.realm.transformer.c;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e {
    @m
    private a a;

    public final boolean b(@l c c0) {
        L.p(c0, "metadata");
        if(!this.e(c0.v())) {
            return false;
        }
        this.a = new a(g3.c.c(c0.n()), c0.t(), c0.u(), c0.r(), c0.q(), c0.s(), c0.p(), c0.m(), null);
        return true;
    }

    public final void c() {
        try {
            a a0 = this.a;
            if(a0 == null) {
                return;
            }
            ExecutorService executorService0 = Executors.newFixedThreadPool(1);
            try {
                executorService0.execute(() -> {
                    L.p(a0, "$analyticsData");
                    g.c.a().a(a0);
                });
                executorService0.awaitTermination(6000L, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException unused_ex) {
                executorService0.shutdownNow();
            }
        }
        catch(Exception exception0) {
            f.a().n("Error happened when sending Realm analytics data: " + exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final void d(a a0) [...]

    private final boolean e(boolean z) {
        Map map0 = System.getenv();
        return !z && map0.get("REALM_DISABLE_ANALYTICS") == null && map0.get("CI") == null;
    }
}

