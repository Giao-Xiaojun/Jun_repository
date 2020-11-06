package com.demo;

public class Teacher {

    public void checkScore(int score) throws ScoreException{
        if(score < 0 || score > 100){
            throw new ScoreException();
        }else {
            System.out.println("成绩正常");
        }
    }

}
