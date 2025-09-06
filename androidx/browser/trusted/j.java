package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;

public final class j {
    @NonNull
    public static TrustedWebActivityDisplayMode a(@NonNull Bundle bundle0) {
        return bundle0.getInt("androidx.browser.trusted.displaymode.KEY_ID") != 1 ? new DefaultMode() : ImmersiveMode.a(bundle0);
    }
}

