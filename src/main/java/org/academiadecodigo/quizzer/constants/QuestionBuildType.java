package org.academiadecodigo.quizzer.constants;

/**
 * Created by codecadet on 19/11/16.
 */
public enum QuestionBuildType {

    FIRSTANSWER("\nA: "),
    SECONDANSWER("\tB: "),
    THIRDANSWER("\nC: "),
    FOURTHANSWER("\t\tD: ");

    QuestionBuildType(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }


}
