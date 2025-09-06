package com.dcinside.rich.styles;

import android.text.Editable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;

public interface b {
    void a(Editable arg1, int arg2, int arg3, boolean arg4);

    @Nullable
    RichEditText b();

    void c();

    void d(ImageView arg1);

    @Nullable
    RichToolbar e();

    ImageView g();

    boolean isChecked();

    void setChecked(boolean arg1);
}

