public class Task {
  public void twentySecondTask() {
    try {
        Thread.sleep(20000);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
  }

  public void randTimeTask()
    int sleepTime = (Math.random() * 5000)+1000;
    try {
        Thread.sleep(sleepTime);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
  }

  public void inputTask(int time){
    try {
        Thread.sleep(time);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
  }
  // any method should modify the object
  // public String outputTask(){
  //
  // }
}
