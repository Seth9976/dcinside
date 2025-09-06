package s1;

import android.graphics.RectF;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.formatter.l;
import com.github.mikephil.charting.utils.g;

public interface e {
    g getCenterOfView();

    g getCenterOffsets();

    RectF getContentRect();

    k getData();

    l getDefaultValueFormatter();

    int getHeight();

    float getMaxHighlightDistance();

    int getMaxVisibleCount();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    float getXRange();

    float getYChartMax();

    float getYChartMin();
}

