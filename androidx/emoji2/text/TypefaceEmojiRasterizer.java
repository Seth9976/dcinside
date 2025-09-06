package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnyThread
@RequiresApi(19)
public class TypefaceEmojiRasterizer {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    private final int a;
    @NonNull
    private final MetadataRepo b;
    private volatile int c;
    @RestrictTo({Scope.a})
    static final int d = 0;
    @RestrictTo({Scope.a})
    static final int e = 1;
    @RestrictTo({Scope.a})
    static final int f = 2;
    private static final ThreadLocal g;

    static {
        TypefaceEmojiRasterizer.g = new ThreadLocal();
    }

    @RestrictTo({Scope.a})
    TypefaceEmojiRasterizer(@NonNull MetadataRepo metadataRepo0, @IntRange(from = 0L) int v) {
        this.c = 0;
        this.b = metadataRepo0;
        this.a = v;
    }

    public void a(@NonNull Canvas canvas0, float f, float f1, @NonNull Paint paint0) {
        Typeface typeface0 = paint0.getTypeface();
        paint0.setTypeface(this.b.j());
        canvas0.drawText(this.b.f(), this.a * 2, 2, f, f1, paint0);
        paint0.setTypeface(typeface0);
    }

    public int b(int v) {
        return this.h().F(v);
    }

    public int c() {
        return this.h().I();
    }

    @RestrictTo({Scope.a})
    public short d() {
        return this.h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.a})
    public int e() {
        return this.c & 3;
    }

    public int f() {
        return this.h().S();
    }

    @RestrictTo({Scope.a})
    public int g() {
        return this.h().T();
    }

    private MetadataItem h() {
        ThreadLocal threadLocal0 = TypefaceEmojiRasterizer.g;
        MetadataItem metadataItem0 = (MetadataItem)threadLocal0.get();
        if(metadataItem0 == null) {
            metadataItem0 = new MetadataItem();
            threadLocal0.set(metadataItem0);
        }
        this.b.g().J(metadataItem0, this.a);
        return metadataItem0;
    }

    @RestrictTo({Scope.a})
    public short i() {
        return this.h().U();
    }

    @NonNull
    public Typeface j() {
        return this.b.j();
    }

    public int k() {
        return this.h().X();
    }

    public boolean l() {
        return this.h().O();
    }

    public boolean m() {
        return (this.c & 4) > 0;
    }

    @RestrictTo({Scope.e})
    public void n() {
        if(this.m()) {
            this.c = 4;
            return;
        }
        this.c = 0;
    }

    @RestrictTo({Scope.a})
    public void o(boolean z) {
        int v = this.e();
        if(z) {
            this.c = v | 4;
            return;
        }
        this.c = v;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.a})
    public void p(boolean z) {
        int v = this.c & 4;
        this.c = z ? v | 2 : v | 1;
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(", id:");
        stringBuilder0.append(Integer.toHexString(this.g()));
        stringBuilder0.append(", codepoints:");
        int v = this.c();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(Integer.toHexString(this.b(v1)));
            stringBuilder0.append(" ");
        }
        return stringBuilder0.toString();
    }
}

