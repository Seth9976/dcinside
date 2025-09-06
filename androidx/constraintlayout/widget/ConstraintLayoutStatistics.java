package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.constraintlayout.core.Metrics;
import java.text.DecimalFormat;

public class ConstraintLayoutStatistics {
    private final Metrics a;
    ConstraintLayout b;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    private static int m = 25;
    private static final String n;

    static {
        ConstraintLayoutStatistics.n = "                         ";
    }

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout0) {
        this.a = new Metrics();
        this.a(constraintLayout0);
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics0) {
        Metrics metrics0 = new Metrics();
        this.a = metrics0;
        metrics0.a(constraintLayoutStatistics0.a);
    }

    public void a(ConstraintLayout constraintLayout0) {
        constraintLayout0.fillMetrics(this.a);
        this.b = constraintLayout0;
    }

    public ConstraintLayoutStatistics b() {
        return new ConstraintLayoutStatistics(this);
    }

    private String c(ConstraintLayoutStatistics constraintLayoutStatistics0, int v) {
        String s = "                         " + this.g(v);
        return "CL Perf: " + (s.substring(s.length() - ConstraintLayoutStatistics.m) + " = ") + (this.h(v) + " -> " + constraintLayoutStatistics0.h(v));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    private String d(DecimalFormat decimalFormat0, ConstraintLayoutStatistics constraintLayoutStatistics0, int v) {
        String s = this.f(decimalFormat0, ((float)this.h(v)) * 0.000001f, 7);
        String s1 = "                         " + this.g(v);
        return "CL Perf: " + (s1.substring(s1.length() - ConstraintLayoutStatistics.m) + " = ") + (s + " -> " + this.f(decimalFormat0, ((float)constraintLayoutStatistics0.h(v)) * 0.000001f, 7) + "ms");
    }

    public void e() {
        ConstraintLayout constraintLayout0 = this.b;
        if(constraintLayout0 != null) {
            constraintLayout0.fillMetrics(null);
        }
    }

    private String f(DecimalFormat decimalFormat0, float f, int v) {
        String s = new String(new char[v]).replace('\u0000', ' ') + decimalFormat0.format(((double)f));
        return s.substring(s.length() - v);
    }

    String g(int v) {
        switch(v) {
            case 1: {
                return "NumberOfLayouts";
            }
            case 2: {
                return "MeasureCalls";
            }
            case 3: {
                return "ChildCount";
            }
            case 4: {
                return "ChildrenMeasures";
            }
            case 5: {
                return "MeasuresWidgetsDuration ";
            }
            case 6: {
                return "MeasureDuration";
            }
            case 7: {
                return "MeasuresLayoutDuration";
            }
            case 8: {
                return "SolverVariables";
            }
            case 9: {
                return "SolverEquations";
            }
            case 10: {
                return "SimpleEquations";
            }
            default: {
                return "";
            }
        }
    }

    public long h(int v) {
        switch(v) {
            case 1: {
                return (long)this.a.M;
            }
            case 2: {
                return this.a.Q;
            }
            case 3: {
                return this.a.P;
            }
            case 4: {
                return (long)this.a.N;
            }
            case 5: {
                return this.a.a;
            }
            case 6: {
                return this.a.O;
            }
            case 7: {
                return this.a.b;
            }
            case 8: {
                return this.a.T;
            }
            case 9: {
                return this.a.S;
            }
            case 10: {
                return this.a.U;
            }
            default: {
                return 0L;
            }
        }
    }

    private String i(int v) {
        String s = Long.toString(this.h(v));
        String s1 = "                         " + this.g(v);
        return "CL Perf: " + (s1.substring(s1.length() - ConstraintLayoutStatistics.m) + " = ") + s;
    }

    private String j(DecimalFormat decimalFormat0, int v) {
        String s = this.f(decimalFormat0, ((float)this.h(v)) * 0.000001f, 7);
        String s1 = "                         " + this.g(v);
        return "CL Perf: " + (s1.substring(s1.length() - ConstraintLayoutStatistics.m) + " = ") + s;
    }

    @SuppressLint({"LogConditional"})
    private void k(String s) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[2];
        Log.v(s, "CL Perf: --------  Performance .(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ")  ------ ");
        DecimalFormat decimalFormat0 = new DecimalFormat("###.000");
        Log.v(s, this.j(decimalFormat0, 5));
        Log.v(s, this.j(decimalFormat0, 7));
        Log.v(s, this.j(decimalFormat0, 6));
        Log.v(s, this.i(1));
        Log.v(s, this.i(2));
        Log.v(s, this.i(3));
        Log.v(s, this.i(4));
        Log.v(s, this.i(8));
        Log.v(s, this.i(9));
        Log.v(s, this.i(10));
    }

    public void l(String s) {
        this.k(s);
    }

    @SuppressLint({"LogConditional"})
    public void m(String s, ConstraintLayoutStatistics constraintLayoutStatistics0) {
        if(constraintLayoutStatistics0 == null) {
            this.k(s);
            return;
        }
        DecimalFormat decimalFormat0 = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        Log.v(s, "CL Perf: -=  Performance .(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ")  =- ");
        Log.v(s, this.d(decimalFormat0, constraintLayoutStatistics0, 5));
        Log.v(s, this.d(decimalFormat0, constraintLayoutStatistics0, 7));
        Log.v(s, this.d(decimalFormat0, constraintLayoutStatistics0, 6));
        Log.v(s, this.c(constraintLayoutStatistics0, 1));
        Log.v(s, this.c(constraintLayoutStatistics0, 2));
        Log.v(s, this.c(constraintLayoutStatistics0, 3));
        Log.v(s, this.c(constraintLayoutStatistics0, 4));
        Log.v(s, this.c(constraintLayoutStatistics0, 8));
        Log.v(s, this.c(constraintLayoutStatistics0, 9));
        Log.v(s, this.c(constraintLayoutStatistics0, 10));
    }

    public void n() {
        this.a.b();
    }
}

