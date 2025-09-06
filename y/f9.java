package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class f9 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;

    private f9(@NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView0, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout0;
        this.b = linearLayout1;
        this.c = textView0;
        this.d = textView1;
        this.e = imageView0;
        this.f = textView2;
        this.g = textView3;
    }

    @NonNull
    public static f9 a(@NonNull View view0) {
        int v = 0x7F0B111D;  // id:youtube_search_item_channel
        View view1 = ViewBindings.a(view0, 0x7F0B111D);  // id:youtube_search_item_channel
        if(((TextView)view1) != null) {
            v = 0x7F0B111E;  // id:youtube_search_item_duration
            View view2 = ViewBindings.a(view0, 0x7F0B111E);  // id:youtube_search_item_duration
            if(((TextView)view2) != null) {
                v = 0x7F0B111F;  // id:youtube_search_item_thumbnail
                View view3 = ViewBindings.a(view0, 0x7F0B111F);  // id:youtube_search_item_thumbnail
                if(((ImageView)view3) != null) {
                    v = 0x7F0B1120;  // id:youtube_search_item_title
                    View view4 = ViewBindings.a(view0, 0x7F0B1120);  // id:youtube_search_item_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B1121;  // id:youtube_search_item_view_count
                        View view5 = ViewBindings.a(view0, 0x7F0B1121);  // id:youtube_search_item_view_count
                        if(((TextView)view5) != null) {
                            return new f9(((LinearLayout)view0), ((LinearLayout)view0), ((TextView)view1), ((TextView)view2), ((ImageView)view3), ((TextView)view4), ((TextView)view5));
                        }
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
    public static f9 c(@NonNull LayoutInflater layoutInflater0) {
        return f9.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f9 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02C5, viewGroup0, false);  // layout:view_youtube_search_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return f9.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

