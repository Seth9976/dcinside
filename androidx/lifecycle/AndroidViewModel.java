package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.L;
import y4.l;

public class AndroidViewModel extends ViewModel {
    @l
    private final Application a;

    public AndroidViewModel(@l Application application0) {
        L.p(application0, "application");
        super();
        this.a = application0;
    }

    @l
    public Application c() {
        L.n(this.a, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return this.a;
    }
}

