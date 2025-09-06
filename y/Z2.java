package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class z2 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final ProgressBar c;
    @NonNull
    public final RecyclerView d;

    private z2(@NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull ProgressBar progressBar0, @NonNull RecyclerView recyclerView0) {
        this.a = frameLayout0;
        this.b = frameLayout1;
        this.c = progressBar0;
        this.d = recyclerView0;
    }

    @NonNull
    public static z2 a(@NonNull View view0) {
        int v = 0x7F0B0DEF;  // id:search_video_first_progress
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0DEF);  // id:search_video_first_progress
        if(frameLayout0 != null) {
            v = 0x7F0B0DF0;  // id:search_video_progress
            ProgressBar progressBar0 = (ProgressBar)ViewBindings.a(view0, 0x7F0B0DF0);  // id:search_video_progress
            if(progressBar0 != null) {
                v = 0x7F0B0DF1;  // id:search_video_recycler
                RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0DF1);  // id:search_video_recycler
                if(recyclerView0 != null) {
                    return new z2(((FrameLayout)view0), frameLayout0, progressBar0, recyclerView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static z2 c(@NonNull LayoutInflater layoutInflater0) {
        return z2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E011A, viewGroup0, false);  // layout:fragment_search_video
        if(z) {
            viewGroup0.addView(view0);
        }
        return z2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

