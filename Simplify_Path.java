
public class Simplify_Path {
    public static String simplifyPath(String path) {
        if(path=="") return "";
        if(path == "/") return "/";
        if(path=="/../") return "/";
        char[] p = path.toCharArray();
        int i=p.length-1;
        boolean endslash = false;
        if(p[i]=='/') endslash = true;
        i --;
        int slash = 0;
        for(;i>=0;i--){
        	if(p[i]!='/') {
        		if(slash ==0) continue;
        		if(slash == 1) 
        			break;
        		if(slash == 2)
        			slash = 0;
        	}
        	else
        		slash++;
        }
        i++;
        return path.substring(i, p.length-1);
        
    }
    
    public static void main(String[] args){
    	System.out.println(simplifyPath("/"));
    }
    
}
