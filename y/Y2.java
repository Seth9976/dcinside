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

public final class y2 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final RecyclerView c;

    private y2(@NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull RecyclerView recyclerView0) {
        this.a = frameLayout0;
        this.b = frameLayout1;
        this.c = recyclerView0;
    }

    @NonNull
    public static y2 a(@NonNull View view0) {
        int v = 0x7F0B0DED;  // id:search_total_progress
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0DED);  // id:search_total_progress
        if(frameLayout0 != null) {
            v = 0x7F0B0DEE;  // id:search_total_recycler
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0DEE);  // id:search_total_recycler
            if(recyclerView0 != null) {
                return new y2(((FrameLayout)view0), frameLayout0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static y2 c(@NonNull LayoutInflater layoutInflater0) {
        return y2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0119, viewGroup0, false);  // layout:fragment_search_total
        if(z) {
            viewGroup0.addView(view0);
        }
        return y2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

