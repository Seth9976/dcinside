package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable.Factory;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.SpannableBuilder;

final class EmojiEditableFactory extends Editable.Factory {
    private static final Object a;
    @GuardedBy("INSTANCE_LOCK")
    private static volatile Editable.Factory b;
    @Nullable
    private static Class c;

    static {
        EmojiEditableFactory.a = new Object();
    }

    @SuppressLint({"PrivateApi"})
    private EmojiEditableFactory() {
        try {
            EmojiEditableFactory.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.text.Editable$Factory
    public static Editable.Factory getInstance() {
        if(EmojiEditableFactory.b == null) {
            Object object0 = EmojiEditableFactory.a;
            synchronized(object0) {
                if(EmojiEditableFactory.b == null) {
                    EmojiEditableFactory.b = new EmojiEditableFactory();
                }
            }
        }
        return EmojiEditableFactory.b;
    }

    @Override  // android.text.Editable$Factory
    public Editable newEditable(@NonNull CharSequence charSequence0) {
        Class class0 = EmojiEditableFactory.c;
        return class0 != null ? SpannableBuilder.c(class0, charSequence0) : super.newEditable(charSequence0);
    }
}

