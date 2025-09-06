package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements Initializer {
    private static final String a;

    static {
        WorkManagerInitializer.a = "WM-WrkMgrInitializer";
    }

    @NonNull
    public WorkManager a(@NonNull Context context0) {
        Logger.e().a("WM-WrkMgrInitializer", "Initializing WorkManager with default configuration.");
        WorkManager.F(context0, new Builder().a());
        return WorkManager.q(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.a(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.emptyList();
    }
}

