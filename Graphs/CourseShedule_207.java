package Graphs;
import java.util.*;

public class CourseShedule_207 {

    static HashSet<Integer> completedCourse = new HashSet<>();
    static HashSet<Integer> taken = new HashSet<>();
    public static boolean canComplete(int course , List<Integer> pr, HashMap<Integer,List<Integer>> map){

        if(pr == null) {
            completedCourse.add(course);
            return true;
        }

        if(pr.isEmpty()) {
            completedCourse.add(course);
            return true;
        }

        if(taken.contains(course) && !completedCourse.contains(course)) {
            return false;
        }

        if(completedCourse.contains(course))
            return true;

        taken.add(course);
        boolean canFinishCourse = false;
        for(int c : map.get(course)) {
            if(!canComplete(c, map.get(c), map)) {
                canFinishCourse = false;
                return false;
            }
            else canFinishCourse = true;
        }
        if(canFinishCourse)
            completedCourse.add(course);
        return canFinishCourse;

    }

    public static boolean canFinishAllTheCourses(){
        int[][] pr = {{1,2},{2,0}} ;
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int[] r : pr){
            int key = r[0];
            if(map.containsKey(key)){
                List<Integer> c = map.get(key);
                c.add(r[1]);
                map.put(key,c);
            }
            else{
                map.put(key,new ArrayList<Integer>(List.of(r[1])));
            }
        }
        for(int key : map.keySet()){
            if(!completedCourse.contains(key)){
                if(canComplete(key,map.get(key),map))
                    completedCourse.add(key);
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFinishAllTheCourses());
    }

}
