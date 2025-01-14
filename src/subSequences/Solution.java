package subSequences;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String[] dd={"amazon","apple","facebook","google","leetcode"};
        String[] dd1={"lo","eo"};
        List<String> dfs=new ArrayList<>(List.of(dd));
        for(int i=0;i< dd1.length;i++){
            for(int j=0;j<dfs.size();j++){
                if(!dfs.get(j).contains(dd1[i])){
                    dfs.remove(j);
                }
            }
        }
        System.out.println(dfs);

    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        return null;
    }

    static void subset(List<String> words1,String sub,String pro){
        if(sub.isEmpty()){
            return;
        }

    }
}