package src;

public class StringRecr {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("baccad");
        System.out.println(charr(s,'a',s.length()-1,0));
    }

    static StringBuilder charr(StringBuilder s,char c,int r, int co){
        if(co==s.length()){
            return s;
        }
        if(s.charAt(co)==c){
            s.deleteCharAt(co);
//            s.insert(co,"");
        }

        return charr(s,c,r,co+1);

    }
}
