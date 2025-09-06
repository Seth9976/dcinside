package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import y4.l;
import y4.m;

public abstract class ActivityResultLauncher {
    @l
    public abstract ActivityResultContract a();

    public void b(Object object0) {
        this.c(object0, null);
    }

    public abstract void c(Object arg1, @m ActivityOptionsCompat arg2);

    @MainThread
    public abstract void d();
}

