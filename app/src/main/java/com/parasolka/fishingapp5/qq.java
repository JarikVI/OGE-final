package com.parasolka.fishingapp5;

public class qq
{
    private int answerResId;
    private String answerTrue;

    public qq(int answerResId, String answerTrue){
        this.answerResId = answerResId;
        this.answerTrue = answerTrue;
    }
    public int getAnswerResId()
    {
        return answerResId;
    }
    public void setAnswerResId(int answerResId)
    {
        this.answerResId = answerResId;
    }
    public String isAnswerTrue()
    {
        return answerTrue;
    }
    public void setAnswerTrue(String answerTrue)
    {
        this.answerTrue = answerTrue;
    }
}
