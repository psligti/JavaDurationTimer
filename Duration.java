public class Duration abstract {
  int startTimer;
  int endTimer;
  double duration;

  public void startTimer() {
    this.startTimer = System.nanotime();
  }

  public void endTimer() {
    this.endTimer = System.nanotime();
    this.duration = (endTimer - startTimer)/1000000000
  }

  public abstract execute();

  public void duration() {
    startTimer();
    execute();
    endTimer();
  }

  public int getStartTime() {
    return startTimer;
  }

  public int getEndTime() {
    return endTimer;
  }

  public double getDuration() {
    return duration;
  }
}
