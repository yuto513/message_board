package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {
    //バリデーションを実行する
    public static List<String> validate(Message m){
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    /**
     * メッセージの必須入力チェックを行う
     * @param メッセージ(String)
     * @return エラー文 or ""(String)
     */
    private static String validateContent(String content) {
        String errorSentence = "";
        if(content == "" || content.equals("")) {
            errorSentence = "メッセージを入力してください";
        }
        return errorSentence;
    }

    /**
     * タイトルの必須入力チェックを行う
     * @param String
     * @return エラー文 or ""(String)
     */
    private static String validateTitle(String title) {
        String errorSentence = "";
        if(title == null || title.equals("")) {
            errorSentence = "タイトルを入力してください";
        }
        return errorSentence;
    }

}
