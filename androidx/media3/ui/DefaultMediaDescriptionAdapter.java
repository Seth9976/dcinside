package androidx.media3.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class DefaultMediaDescriptionAdapter implements MediaDescriptionAdapter {
    @Nullable
    private final PendingIntent a;

    public DefaultMediaDescriptionAdapter(@Nullable PendingIntent pendingIntent0) {
        this.a = pendingIntent0;
    }

    @Override  // androidx.media3.ui.PlayerNotificationManager$MediaDescriptionAdapter
    @Nullable
    public Bitmap a(Player player0, BitmapCallback playerNotificationManager$BitmapCallback0) {
        if(!player0.v0(18)) {
            return null;
        }
        byte[] arr_b = player0.w2().k;
        return arr_b == null ? null : BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
    }

    @Override  // androidx.media3.ui.PlayerNotificationManager$MediaDescriptionAdapter
    public CharSequence b(Player player0) {
        return null;
    }

    @Override  // androidx.media3.ui.PlayerNotificationManager$MediaDescriptionAdapter
    @Nullable
    public CharSequence c(Player player0) {
        if(!player0.v0(18)) {
            return null;
        }
        CharSequence charSequence0 = player0.w2().b;
        return TextUtils.isEmpty(charSequence0) ? player0.w2().d : charSequence0;
    }

    @Override  // androidx.media3.ui.PlayerNotificationManager$MediaDescriptionAdapter
    public CharSequence d(Player player0) {
        if(!player0.v0(18)) {
            return "";
        }
        CharSequence charSequence0 = player0.w2().e;
        if(!TextUtils.isEmpty(charSequence0)) {
            return charSequence0;
        }
        CharSequence charSequence1 = player0.w2().a;
        return charSequence1 != null ? charSequence1 : "";
    }

    @Override  // androidx.media3.ui.PlayerNotificationManager$MediaDescriptionAdapter
    @Nullable
    public PendingIntent e(Player player0) {
        return this.a;
    }
}

