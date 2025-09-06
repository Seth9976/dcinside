package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

public class TracingControllerImpl extends TracingController {
    private android.webkit.TracingController a;
    private TracingControllerBoundaryInterface b;

    public TracingControllerImpl() {
        this.a = ApiHelperForP.a();
        this.b = null;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.TracingController
    public boolean b() {
        return ApiHelperForP.d(this.f());
    }

    @Override  // androidx.webkit.TracingController
    public void c(@NonNull TracingConfig tracingConfig0) {
        if(tracingConfig0 == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        ApiHelperForP.f(this.f(), tracingConfig0);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.TracingController
    public boolean d(@Nullable OutputStream outputStream0, @NonNull Executor executor0) {
        return ApiHelperForP.g(this.f(), outputStream0, executor0);
    }

    private TracingControllerBoundaryInterface e() {
        if(this.b == null) {
            this.b = WebViewGlueCommunicator.d().getTracingController();
        }
        return this.b;
    }

    @RequiresApi(28)
    private android.webkit.TracingController f() {
        if(this.a == null) {
            this.a = ApiHelperForP.a();
        }
        return this.a;
    }
}

