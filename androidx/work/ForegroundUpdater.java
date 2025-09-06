package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.t0;
import java.util.UUID;

public interface ForegroundUpdater {
    @NonNull
    t0 a(@NonNull Context arg1, @NonNull UUID arg2, @NonNull ForegroundInfo arg3);
}

