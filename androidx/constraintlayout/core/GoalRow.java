package androidx.constraintlayout.core;

public class GoalRow extends ArrayRow {
    public GoalRow(Cache cache0) {
        super(cache0);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void f(SolverVariable solverVariable0) {
        super.f(solverVariable0);
        --solverVariable0.m;
    }
}

