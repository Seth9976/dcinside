package androidx.media3.database;

import android.database.SQLException;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException0) {
        super(sQLException0);
    }

    public DatabaseIOException(SQLException sQLException0, String s) {
        super(s, sQLException0);
    }
}

