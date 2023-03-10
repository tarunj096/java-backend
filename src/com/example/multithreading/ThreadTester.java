package src.com.example.multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is started");

//        Thread thread1 = new Thread1("thread1");
//        //thread1.setDaemon(true);
//        thread1.start();

//        Thread thread2 = new Thread(()->{
//            for(int i =0;i<5;i++){
//                System.out.println(Thread.currentThread()+" ,"+i);
//            }
//        },"thread2");
//        thread2.start();
        Stack stack = new Stack(5);
        new Thread(()->{
            int count = 0;
            while(++ count<10){
                System.out.println("Pushed :"+stack.push(100));
            }
        },"Pusher").start();
        new Thread(()->{
            int count = 0;
            while(++ count<10){
                System.out.println("Popper :"+stack.pop());
            }
        },"Popper").start();
        System.out.println("Main is exiting");
    }
}
