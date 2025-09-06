package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class t3 implements ViewBinding {
    @NonNull
    private final CheckedTextView a;
    @NonNull
    public final CheckedTextView b;

    private t3(@NonNull CheckedTextView checkedTextView0, @NonNull CheckedTextView checkedTextView1) {
        this.a = checkedTextView0;
        this.b = checkedTextView1;
    }

    @NonNull
    public static t3 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new t3(((CheckedTextView)view0), ((CheckedTextView)view0));
    }

    @NonNull
    public CheckedTextView b() {
        return this.a;
    }

    @NonNull
    public static t3 c(@NonNull LayoutInflater layoutInflater0) {
        return t3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019B, viewGroup0, false);  // layout:view_archive_spinner_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return t3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

