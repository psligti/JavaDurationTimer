public class RandTimeTask {
  private Task task;

  public RandTimeTask(Task task) {
    this.task = task;
  }

  public void execute() {
    task.twentySecondTask();
  }
}
