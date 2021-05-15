package com.company;


import java.security.*;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public  class PrintTask implements Runnable {

        private static final SecureRandom generator = new SecureRandom();
        private final int sleepTime;
        private final String taskName;

        public PrintTask(String taskName) {
            this.taskName = taskName;

            sleepTime = generator.nextInt(5000);
        }


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            PrintTask task1 = new PrintTask("Task1");
            PrintTask task2 = new PrintTask("Task2");
            PrintTask task3 = new PrintTask("Task3");

            System.out.println("Starting Excutor");

            ExecutorService executorService = Executors.newCachedThreadPool();

            executorService.execute(task1);
            executorService.execute(task2);
            executorService.execute(task3);

            executorService.shutdown();

            System.out.printf("Tasks started, main ends.%n%n");

        }
        @Override
        public void run() {

            try {
                System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException exception) {
                exception.printStackTrace();
                Thread.currentThread().interrupt();
            }
            System.out.printf("%s done sleeping%n", taskName);
        }
}

