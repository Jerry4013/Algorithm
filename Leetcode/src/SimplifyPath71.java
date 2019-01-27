import java.util.Stack;

public class SimplifyPath71 {
    public static void main(String[] args) {
        new SimplifyPath71().run();
    }

    private void run() {
        System.out.println(simplifyPath("/home/"));
    }

    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Stack<String> dir = new Stack<>();
        for (String s : pathArray) {
            if (s.equals("")){
                continue;
            }
            if (!s.equals(".") && !s.equals("..")){
                dir.push(s);
            }else if (s.equals("..") && !dir.isEmpty()){
                dir.pop();
            }
        }
        String result = "";
        if (dir.isEmpty()){
            return "/";
        }
        while (!dir.isEmpty()){
            String temp = "/" + dir.pop();
            result = temp + result;
        }
        return result;
    }
}
