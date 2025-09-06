package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class t7 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final LinearLayout d;

    private t7(@NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.a = linearLayout0;
        this.b = linearLayout1;
        this.c = linearLayout2;
        this.d = linearLayout3;
    }

    @NonNull
    public static t7 a(@NonNull View view0) {
        int v = 0x7F0B0D4F;  // id:reply_more_copy_text
        LinearLayout linearLayout0 = (LinearLayout)ViewBindings.a(view0, 0x7F0B0D4F);  // id:reply_more_copy_text
        if(linearLayout0 != null) {
            v = 0x7F0B0D5A;  // id:reply_more_reply_under
            LinearLayout linearLayout1 = (LinearLayout)ViewBindings.a(view0, 0x7F0B0D5A);  // id:reply_more_reply_under
            if(linearLayout1 != null) {
                v = 0x7F0B0D5C;  // id:reply_more_search_name
                LinearLayout linearLayout2 = (LinearLayout)ViewBindings.a(view0, 0x7F0B0D5C);  // id:reply_more_search_name
                if(linearLayout2 != null) {
                    return new t7(((LinearLayout)view0), linearLayout0, linearLayout1, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static t7 c(@NonNull LayoutInflater layoutInflater0) {
        return t7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026B, viewGroup0, false);  // layout:view_reply_more_name_search
        if(z) {
            viewGroup0.addView(view0);
        }
        return t7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

