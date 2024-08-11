class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running. Iteration: " + i);
            try {
                Thread.sleep(50); // Simulate some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadScheduling {
    public static void main(String[] args) {
        
        Thread lowPriorityThread = new Thread(new Task("Low Priority Thread"));
        Thread mediumPriorityThread = new Thread(new Task("Medium Priority Thread"));
        Thread highPriorityThread = new Thread(new Task("High Priority Thread"));

        
        lowPriorityThread.setPriority(1);  
        mediumPriorityThread.setPriority(5); 
        highPriorityThread.setPriority(10); 

        try {
            highPriorityThread.start();
            highPriorityThread.join();

            mediumPriorityThread.start();
            mediumPriorityThread.join();

            lowPriorityThread.start();
            lowPriorityThread.join();

        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}

