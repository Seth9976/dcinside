package com.dcinside.app.image.edit;

import android.graphics.PointF;

class Vector2D extends PointF {
    public Vector2D() {
    }

    public Vector2D(float f, float f1) {
        super(f, f1);
    }

    public static float a(Vector2D vector2D0, Vector2D vector2D1) {
        vector2D0.c();
        vector2D1.c();
        return (float)((Math.atan2(vector2D1.y, vector2D1.x) - Math.atan2(vector2D0.y, vector2D0.x)) * 57.29578);
    }

    public void c() {
        float f = (float)Math.sqrt(this.x * this.x + this.y * this.y);
        this.x /= f;
        this.y /= f;
    }
}

