package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({Scope.a})
class EmojiTransformationMethod implements TransformationMethod {
    @Nullable
    private final TransformationMethod a;

    EmojiTransformationMethod(@Nullable TransformationMethod transformationMethod0) {
        this.a = transformationMethod0;
    }

    public TransformationMethod a() {
        return this.a;
    }

    @Override  // android.text.method.TransformationMethod
    public CharSequence getTransformation(@Nullable CharSequence charSequence0, @NonNull View view0) {
        if(view0.isInEditMode()) {
            return charSequence0;
        }
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            charSequence0 = transformationMethod0.getTransformation(charSequence0, view0);
        }
        return charSequence0 == null || EmojiCompat.c().i() != 1 ? charSequence0 : EmojiCompat.c().x(charSequence0);
    }

    @Override  // android.text.method.TransformationMethod
    public void onFocusChanged(View view0, CharSequence charSequence0, boolean z, int v, Rect rect0) {
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            transformationMethod0.onFocusChanged(view0, charSequence0, z, v, rect0);
        }
    }
}

