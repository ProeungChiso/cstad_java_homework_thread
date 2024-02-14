class MyThread extends Thread{
    @Override
    public void run(){
    }
}
class MyPrint {
    private void myPrint(char[] chars){
        for(char c : chars){
            System.out.print(c);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }
    private void myDownload(String s){
        System.out.print(s);
        try{
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void myDots(char[] chars){
        for(char c : chars){
            System.out.print(c);
            try{
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void welcome(char[] chars){
        this.myPrint(chars);
    }
    public void stars(char[] chars){
        this.myPrint(chars);
    }
    public void quote(char[] chars){
        this.myPrint(chars);
    }
    public void download(String s){
        this.myDownload(s);
    }
    public void dots(char[] chars){
        this.myDots(chars);
    }
    public void completed(String s){
        this.myDownload(s);
    }
}
public class Main {
    public static void main(String[] args) {
        char[] charsWelcome = {'W','E','L','C','O','M','E',' ','T','O',' ','C','S','T','A','D'};
        char[] charsStars = {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
        char[] charsQuote = {'D','o',' ','n','o','t',' ','g','i','v','e',' ','u','p',' ','o','n',' ','t','h','i','s',' ','O','p','p','o','r','t','u','n','i','t','y'};
        String stringDownload = "Downloading";
        char[] charsDots = {'.','.','.','.','.','.','.','.','.'};
        String stringCompleted = "Completed 100%";
        MyPrint myprint = new MyPrint();
        Thread threadWelcome = new Thread(()->{
            myprint.welcome(charsWelcome);
        });
        Thread threadStars1 = new Thread(()->{
            myprint.stars(charsStars);
        });
        Thread threadQuote = new Thread(()->{
            myprint.quote(charsQuote);
        });
        Thread threadStars2 = new Thread(()->{
            myprint.stars(charsStars);
        });
        Thread threadDownload = new Thread(()->{
            myprint.download(stringDownload);
        });
        Thread threadDots = new Thread(()->{
            myprint.dots(charsDots);
        });
        Thread threadCompleted = new Thread(()->{
            myprint.completed(stringCompleted);
        });
        try{
            threadWelcome.start();
            threadWelcome.join();
            threadStars1.start();
            threadStars1.join();
            threadQuote.start();
            threadQuote.join();
            threadStars2.start();
            threadStars2.join();
            threadDownload.start();
            threadDownload.join();
            threadDots.start();
            threadDots.join();
            threadCompleted.start();
            threadCompleted.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
