package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class CardViewApi17Impl extends CardViewBaseImpl {
    @Override  // androidx.cardview.widget.CardViewBaseImpl
    public void n() {
        RoundRectDrawableWithShadow.s = new RoundRectHelper() {
            final CardViewApi17Impl a;

            @Override  // androidx.cardview.widget.RoundRectDrawableWithShadow$RoundRectHelper
            public void a(Canvas canvas0, RectF rectF0, float f, Paint paint0) {
                canvas0.drawRoundRect(rectF0, f, f, paint0);
            }
        };
    }
}

