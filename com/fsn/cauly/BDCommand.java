package com.fsn.cauly;

public interface BDCommand {
    public interface OnCommandCompletedListener {
        void onCommandCompleted(BDCommand arg1);
    }

    public static final int ERR_SUCCESS;

    void cancel();

    void execute();

    Object getData();

    int getErrorCode();

    int getTag();

    void setData(Object arg1);

    void setOnCommandResult(OnCommandCompletedListener arg1);

    void setTag(int arg1);
}

