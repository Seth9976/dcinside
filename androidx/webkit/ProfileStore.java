package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.List;

@UiThread
public interface ProfileStore {
    boolean deleteProfile(@NonNull String arg1);

    @NonNull
    List getAllProfileNames();

    @NonNull
    Profile getOrCreateProfile(@NonNull String arg1);

    @Nullable
    Profile getProfile(@NonNull String arg1);
}

