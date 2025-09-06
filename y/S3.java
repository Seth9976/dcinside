package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class s3 implements ViewBinding {
    @NonNull
    private final TextView a;

    private s3(@NonNull TextView textView0) {
        this.a = textView0;
    }

    @NonNull
    public static s3 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new s3(((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static s3 c(@NonNull LayoutInflater layoutInflater0) {
        return s3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019A, viewGroup0, false);  // layout:view_archive_quick_recent_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return s3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

