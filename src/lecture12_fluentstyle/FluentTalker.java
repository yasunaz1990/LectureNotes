package lecture12_fluentstyle;

public class FluentTalker {

    public FluentTalker talkBad() {
        System.out.println("You are something!");
        return this;
    }


    public FluentTalker talkNice(){
        System.out.println("you are amazing!");
        return  this;
    }


    public FluentTalker talkSoftly(){
        System.out.println("hey there you!!");
        return this;
    }


    public static void main(String[] args) {

       // Create an object
       FluentTalker talker = new FluentTalker();

       // Invoke a method fluent sytle
       talker.talkSoftly()
               .talkBad()
               .talkNice();
    }
}
