public class getToggle {
    String getToggle(String x){
        String ans="";
        char all [] = x.toCharArray();
        for(int i=0;i<x.length();i++)
        {
            char c= all[i];
            if(Character.isLowerCase(c))
            ans += Character.toUpperCase(c);
            else
            ans += Character.toLowerCase(c);
        }
        return ans;
    }
    public static void main(String[] args){
        getToggle obj = new getToggle();
        String ans = obj.getToggle("welCome");
        System.out.println(ans);
    }
}