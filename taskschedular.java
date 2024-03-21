/*You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: identical tasks must be separated by at least n intervals due to cooling time.

​Return the minimum number of intervals required to complete all tasks. */
class Solution {
    public static int leastInterval(char[] tasks, int n) {
       int[] freq=new int[26];
       for(int i=0;i<tasks.length;i++){
        freq[tasks[i]-'A']++;
       } 
       int max=0,c=0;
       for(int i=0;i<26;i++){
        max=Math.max(freq[i], max);
       } 
        for(int i=0;i<26;i++){
        if(freq[i]==max) c++;
       }
       int gaps=max-1;
       int onegap=n-(c-1);
       int av_slot=gaps*onegap;
       int av_task=tasks.length-max*c;
       int idle=Math.max(0, av_slot-av_task);
       return tasks.length+idle;
    }
    public static int main(String[] args) {
        char[] tasks={'A','A','A','B','B','B'};
        int n=2;
       return leastInterval(tasks, n);
    }
}
