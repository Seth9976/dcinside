package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptHandler;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class ScriptHandlerImpl implements ScriptHandler {
    private final ScriptHandlerBoundaryInterface a;

    private ScriptHandlerImpl(@NonNull ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface0) {
        this.a = scriptHandlerBoundaryInterface0;
    }

    @NonNull
    public static ScriptHandlerImpl a(@NonNull InvocationHandler invocationHandler0) {
        return new ScriptHandlerImpl(((ScriptHandlerBoundaryInterface)a.a(ScriptHandlerBoundaryInterface.class, invocationHandler0)));
    }

    @Override  // androidx.webkit.ScriptHandler
    public void remove() {
        this.a.remove();
    }
}

