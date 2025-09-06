package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class l6 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final View c;
    @NonNull
    public final TextView d;

    private l6(@NonNull LinearLayout linearLayout0, @NonNull FrameLayout frameLayout0, @NonNull View view0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = frameLayout0;
        this.c = view0;
        this.d = textView0;
    }

    @NonNull
    public static l6 a(@NonNull View view0) {
        int v = 0x7F0B0A80;  // id:post_list_item_page_ad_container
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0A80);  // id:post_list_item_page_ad_container
        if(frameLayout0 != null) {
            v = 0x7F0B0A81;  // id:post_list_item_page_divider
            View view1 = ViewBindings.a(view0, 0x7F0B0A81);  // id:post_list_item_page_divider
            if(view1 != null) {
                v = 0x7F0B0A82;  // id:post_list_item_page_text
                TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0A82);  // id:post_list_item_page_text
                if(textView0 != null) {
                    return new l6(((LinearLayout)view0), frameLayout0, view1, textView0);
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
    public static l6 c(@NonNull LayoutInflater layoutInflater0) {
        return l6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022F, viewGroup0, false);  // layout:view_post_list_item_page
        if(z) {
            viewGroup0.addView(view0);
        }
        return l6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

