package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class r5 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;

    private r5(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
    }

    @NonNull
    public static r5 a(@NonNull View view0) {
        int v = 0x7F0B0C65;  // id:read_like_posts_title_post_item0
        View view1 = ViewBindings.a(view0, 0x7F0B0C65);  // id:read_like_posts_title_post_item0
        if(((TextView)view1) != null) {
            v = 0x7F0B0C66;  // id:read_like_posts_title_post_item1
            View view2 = ViewBindings.a(view0, 0x7F0B0C66);  // id:read_like_posts_title_post_item1
            if(((TextView)view2) != null) {
                v = 0x7F0B0C67;  // id:read_like_posts_title_post_item2
                View view3 = ViewBindings.a(view0, 0x7F0B0C67);  // id:read_like_posts_title_post_item2
                if(((TextView)view3) != null) {
                    v = 0x7F0B0C68;  // id:read_like_posts_title_post_item3
                    View view4 = ViewBindings.a(view0, 0x7F0B0C68);  // id:read_like_posts_title_post_item3
                    if(((TextView)view4) != null) {
                        return new r5(((LinearLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4));
                    }
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
    public static r5 c(@NonNull LayoutInflater layoutInflater0) {
        return r5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0201, viewGroup0, false);  // layout:view_like_post_title_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return r5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

