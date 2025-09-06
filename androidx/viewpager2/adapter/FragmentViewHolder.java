package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public final class FragmentViewHolder extends ViewHolder {
    private FragmentViewHolder(@NonNull FrameLayout frameLayout0) {
        super(frameLayout0);
    }

    @NonNull
    static FragmentViewHolder e(@NonNull ViewGroup viewGroup0) {
        FrameLayout frameLayout0 = new FrameLayout(viewGroup0.getContext());
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout0.setId(View.generateViewId());
        frameLayout0.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout0);
    }

    @NonNull
    FrameLayout f() {
        return (FrameLayout)this.itemView;
    }
}

