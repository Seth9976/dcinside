package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class f4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final RecyclerView b;
    @NonNull
    public final ProgressBar c;
    @NonNull
    public final TextView d;

    private f4(@NonNull ConstraintLayout constraintLayout0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = recyclerView0;
        this.c = progressBar0;
        this.d = textView0;
    }

    @NonNull
    public static f4 a(@NonNull View view0) {
        int v = 0x7F0B0377;  // id:dccon_tag_preview
        RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0377);  // id:dccon_tag_preview
        if(recyclerView0 != null) {
            v = 0x7F0B0378;  // id:dccon_tag_preview_progress
            ProgressBar progressBar0 = (ProgressBar)ViewBindings.a(view0, 0x7F0B0378);  // id:dccon_tag_preview_progress
            if(progressBar0 != null) {
                v = 0x7F0B037A;  // id:dccon_tag_text_empty
                TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B037A);  // id:dccon_tag_text_empty
                if(textView0 != null) {
                    return new f4(((ConstraintLayout)view0), recyclerView0, progressBar0, textView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static f4 c(@NonNull LayoutInflater layoutInflater0) {
        return f4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C1, viewGroup0, false);  // layout:view_dccon_tag_preview
        if(z) {
            viewGroup0.addView(view0);
        }
        return f4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

