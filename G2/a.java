package g2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

@KeepForSdk
public interface a {
    @KeepForSdk
    public interface g2.a.a {
        @KeepForSdk
        void a(String arg1);
    }

    @KeepForSdk
    void a(g2.a.a arg1);

    @KeepForSdk
    void b(@NonNull String arg1, @NonNull String arg2) throws IOException;

    @NonNull
    @KeepForSdk
    Task c();

    @KeepForSdk
    String getId();

    @Nullable
    @KeepForSdk
    String getToken();
}

