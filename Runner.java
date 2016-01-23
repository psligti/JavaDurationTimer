import java.util.ArrayList;
import java.util.List;

public class Runner{
  private List<Duration> commandList = ArrayList<Duration>();

  public void addCommand(Duration duration){
    commandList.add(duration);
  }

  public void executeCommands(){
    for (Duration duration : commandList) {
      duration.duration();
    }
    commandList.clear();
  }
}
