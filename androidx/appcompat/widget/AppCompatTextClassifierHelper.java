package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

final class AppCompatTextClassifierHelper {
    @RequiresApi(26)
    static final class Api26Impl {
        @DoNotInline
        @NonNull
        static TextClassifier a(@NonNull TextView textView0) {
            TextClassificationManager textClassificationManager0 = (TextClassificationManager)textView0.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager0 == null ? TextClassifier.NO_OP : textClassificationManager0.getTextClassifier();
        }
    }

    @NonNull
    private TextView a;
    @Nullable
    private TextClassifier b;

    AppCompatTextClassifierHelper(@NonNull TextView textView0) {
        this.a = (TextView)Preconditions.l(textView0);
    }

    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier a() {
        return this.b == null ? Api26Impl.a(this.a) : this.b;
    }

    @RequiresApi(api = 26)
    public void b(@Nullable TextClassifier textClassifier0) {
        this.b = textClassifier0;
    }
}

