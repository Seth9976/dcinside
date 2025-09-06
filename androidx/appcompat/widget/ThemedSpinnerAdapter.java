package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    public static final class Helper {
        private final Context a;
        private final LayoutInflater b;
        private LayoutInflater c;

        public Helper(@NonNull Context context0) {
            this.a = context0;
            this.b = LayoutInflater.from(context0);
        }

        @NonNull
        public LayoutInflater a() {
            return this.c == null ? this.b : this.c;
        }

        @Nullable
        public Resources.Theme b() {
            return this.c == null ? null : this.c.getContext().getTheme();
        }

        public void c(@Nullable Resources.Theme resources$Theme0) {
            if(resources$Theme0 == null) {
                this.c = null;
                return;
            }
            if(resources$Theme0.equals(this.a.getTheme())) {
                this.c = this.b;
                return;
            }
            this.c = LayoutInflater.from(new ContextThemeWrapper(this.a, resources$Theme0));
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme arg1);
}

