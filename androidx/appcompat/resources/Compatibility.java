package androidx.appcompat.resources;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.a})
public final class Compatibility {
    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        @NonNull
        public static Drawable a(@NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        }

        @DoNotInline
        public static int b(@NonNull TypedArray typedArray0) {
            return typedArray0.getChangingConfigurations();
        }

        @DoNotInline
        public static void c(@NonNull Drawable drawable0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        }
    }

}

