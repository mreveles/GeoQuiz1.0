package com.spring2018.cidm4385.mareveles.geoquiz;

/**
 * Created by Miguel on 1/28/2018.
 */
//comment to commit to gitHub
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public  Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
