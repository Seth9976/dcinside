package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import y4.l;

public interface WindowBackend {
    void a(@l Activity arg1, @l Executor arg2, @l Consumer arg3);

    void b(@l Consumer arg1);
}

