public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> edges = new LinkedList<>();
        int[] in = new int[numCourses];
        List<Integer> temp;
        Queue<Integer> queueForFS = new LinkedList<>();
        int FScounter = 0;
		for (int i = 0; i < numCourses; i++) {
			temp = new LinkedList<>();
			edges.add(temp);	
		}
		for (int i = 0; i < prerequisites.length; i++){
			edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
        for (int i = 0; i < prerequisites.length; i++) {
			in[prerequisites[i][0]]++;
		}
        for (int i = 0; i < numCourses; i++) {
			if(in[i] == 0){
				queueForFS.offer(i);
			}
		}
        while(!queueForFS.isEmpty()){
        	FScounter++;
        	for (int i : edges.get(queueForFS.poll())) {
				in[i]--;
				if(in[i] == 0){
					queueForFS.offer(i);
				}
			}
        }
        return FScounter == numCourses;
    }
}