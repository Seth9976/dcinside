package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class x2 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final RecyclerView c;

    private x2(@NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull RecyclerView recyclerView0) {
        this.a = frameLayout0;
        this.b = frameLayout1;
        this.c = recyclerView0;
    }

    @NonNull
    public static x2 a(@NonNull View view0) {
        int v = 0x7F0B0DE3;  // id:search_post_progress
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0DE3);  // id:search_post_progress
        if(frameLayout0 != null) {
            v = 0x7F0B0DE6;  // id:search_post_recycler
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0DE6);  // id:search_post_recycler
            if(recyclerView0 != null) {
                return new x2(((FrameLayout)view0), frameLayout0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static x2 c(@NonNull LayoutInflater layoutInflater0) {
        return x2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0118, viewGroup0, false);  // layout:fragment_search_post
        if(z) {
            viewGroup0.addView(view0);
        }
        return x2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

