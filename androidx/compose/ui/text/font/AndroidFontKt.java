package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidFontKt {
    @RequiresApi(26)
    @Stable
    @l
    public static final Font a(@l ParcelFileDescriptor parcelFileDescriptor0, @l FontWeight fontWeight0, int v, @l Settings fontVariation$Settings0) {
        L.p(parcelFileDescriptor0, "fileDescriptor");
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new AndroidFileDescriptorFont(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0, null);
    }

    @Stable
    @l
    public static final Font b(@l File file0, @l FontWeight fontWeight0, int v, @l Settings fontVariation$Settings0) {
        L.p(file0, "file");
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new AndroidFileFont(file0, fontWeight0, v, fontVariation$Settings0, null);
    }

    public static Font c(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.a.b(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.a(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0);
    }

    public static Font d(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.a.b(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.b(file0, fontWeight0, v, fontVariation$Settings0);
    }

    @Stable
    @l
    public static final Font e(@l String s, @l AssetManager assetManager0, @l FontWeight fontWeight0, int v, @l Settings fontVariation$Settings0) {
        L.p(s, "path");
        L.p(assetManager0, "assetManager");
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new AndroidAssetFont(assetManager0, s, fontWeight0, v, fontVariation$Settings0, null);
    }

    public static Font f(String s, AssetManager assetManager0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        if((v1 & 16) != 0) {
            fontVariation$Settings0 = FontVariation.a.b(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.e(s, assetManager0, fontWeight0, v, fontVariation$Settings0);
    }

    private static final void g() {
    }
}

