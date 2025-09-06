package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public class TintInfo {
    public ColorStateList a;
    public PorterDuff.Mode b;
    public boolean c;
    public boolean d;

    void a() {
        this.a = null;
        this.d = false;
        this.b = null;
        this.c = false;
    }
}

