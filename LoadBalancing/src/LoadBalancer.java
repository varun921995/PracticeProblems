import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {

    List<String> serverList;
    int currentIndex = 0;

    public LoadBalancer() {
       serverList = new ArrayList<>();

    }

    public void addServer(String server) {
     serverList.add(server);
    }

    public void removeServer(String server) {
      serverList.remove(server);
    }

    public String getNextServer(){
        if(serverList.isEmpty()){
            return "No Server Available";
        }
        if(currentIndex >= serverList.size()){
            currentIndex = 0;
        }
        String result = serverList.get(currentIndex);
        currentIndex = (currentIndex + 1) % serverList.size();
        return result;
    }
}
