package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RequiresApi(26)
public final class AndroidFileDescriptorFont extends AndroidPreloadedFont {
    @l
    private final ParcelFileDescriptor k;
    @m
    private final String l;

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(fontWeight0, v, fontVariation$Settings0, null);
        this.k = parcelFileDescriptor0;
        this.j(this.f(null));
    }

    public AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, w w0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0, null);
    }

    public AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, w w0) {
        this(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0);
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public Typeface f(@m Context context0) {
        if(Build.VERSION.SDK_INT < 26) {
            throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
        }
        return TypefaceBuilderCompat.a.c(this.k, context0, this.e());
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public String g() {
        return this.l;
    }

    @l
    public final ParcelFileDescriptor k() {
        return this.k;
    }

    @Override
    @l
    public String toString() {
        return "Font(fileDescriptor=" + this.k + ", weight=" + this.b() + ", style=" + FontStyle.i(this.d()) + ')';
    }
}

