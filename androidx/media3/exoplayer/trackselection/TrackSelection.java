package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public interface TrackSelection {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Type {
    }

    public static final int a = 0;
    public static final int b = 10000;

    int e(int arg1);

    int getType();

    int h(int arg1);

    TrackGroup i();

    int length();

    int p(Format arg1);

    Format q(int arg1);
}

