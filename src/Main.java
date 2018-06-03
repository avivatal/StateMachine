import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        ArticlesContext articlesContext = new ArticlesContext();
        ForumContext forumContext = new ForumContext();
        QuizContext quizContext = new QuizContext();
        ExamContext examContext = new ExamContext();
        int weekCounter = 0;
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            input = br.readLine();
            if(input.length() > 0) {
                String[] splited = input.split(" ");
                switch (splited[0].substring(1)) {
                    case "read":
                        if (weekCounter <= 12) {
                            articlesContext.getCurrentState().readArticle(articlesContext);
                        }
                        else {
                            System.out.println("Cant Read Article after semester is finished\n");
                        }
                        break;
                    case "post":
                        if (weekCounter <= 12) {
                            forumContext.getCurrentState().postInForum(forumContext);
                        }
                        else {
                            System.out.println("Cant post in forum after semester is finished\n");
                        }
                        break;
                    case "answer":
                        if (weekCounter <= 12) {
                            quizContext.getCurrentState().answerQuiz(quizContext);
                        }
                        else{
                            System.out.println("Cant answer quiz after semester is finished\n");
                        }
                        break;
                    case "next_week":
                        weekCounter++;
                        if (weekCounter <= 12) {
                            forumContext.getCurrentState().nextWeek(forumContext);
                            quizContext.getCurrentState().nextWeek(quizContext);
                        }
                        break;
                    case "exam":
                        if(splited.length == 1){
                            System.out.printf("No params given\n");
                        }
                        else {
                            if (articlesContext.getArticles() > 0 && weekCounter >= 12) {
                                examContext.getCurrentState().takeExam(Double.parseDouble(splited[1]), examContext);
                            } else if (weekCounter < 12) {
                                System.out.println("Cant take exam before semester is finished\n");
                            } else if (articlesContext.getArticles() == 0) {
                                System.out.printf("Cant take exam if haven't read any articles\n");
                            }
                            else if(!(examContext.getCurrentState() instanceof BeforeExamState)){
                                System.out.printf("Cannot retake test\n");
                            }
                        }
                        break;
                    case "status":
                        if(splited.length == 1){
                            System.out.printf("No params given\n");
                        }
                        else {
                            String output = splited[1];
                            //is studious or researcher:
                            if (articlesContext.getCurrentState() instanceof StudiousState) {
                                output = "*" + output + "*";
                            } else if (articlesContext.getCurrentState() instanceof ResearcherState) {
                                output = "**" + output + "**";
                            }
                            //is active
                            if (forumContext.getCurrentState() instanceof ActiveState) {
                                output = output + "(active)";
                            }
                            //passed/passed with excellency
                            if (examContext.getCurrentState() instanceof PassedState) {
                                output = output + ":-)";
                            } else if (examContext.getCurrentState() instanceof PassedWithExcellencyState) {
                                output = "^^^" + output + "^^^";
                            }
                            System.out.printf(output+"\n");
                        }
                        break;
                }
            }
        }
    }
}
