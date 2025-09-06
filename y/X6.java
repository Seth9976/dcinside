package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class x6 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final RecyclerView c;

    private x6(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull RecyclerView recyclerView0) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = recyclerView0;
    }

    @NonNull
    public static x6 a(@NonNull View view0) {
        int v = 0x7F0B0AFB;  // id:post_search_empty
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0AFB);  // id:post_search_empty
        if(textView0 != null) {
            v = 0x7F0B0B06;  // id:post_search_recycler
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0B06);  // id:post_search_recycler
            if(recyclerView0 != null) {
                return new x6(((FrameLayout)view0), textView0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static x6 c(@NonNull LayoutInflater layoutInflater0) {
        return x6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E023B, viewGroup0, false);  // layout:view_post_search_content
        if(z) {
            viewGroup0.addView(view0);
        }
        return x6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

