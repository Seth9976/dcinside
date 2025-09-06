package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.List;

public final class TrustedWebActivityIntent {
    @NonNull
    private final Intent a;
    @NonNull
    private final List b;

    TrustedWebActivityIntent(@NonNull Intent intent0, @NonNull List list0) {
        this.a = intent0;
        this.b = list0;
    }

    @NonNull
    public Intent a() {
        return this.a;
    }

    private void b(Context context0) {
        for(Object object0: this.b) {
            context0.grantUriPermission(this.a.getPackage(), ((Uri)object0), 1);
        }
    }

    public void c(@NonNull Context context0) {
        this.b(context0);
        ContextCompat.startActivity(context0, this.a, null);
    }
}

