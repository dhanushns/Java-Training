package Graphs;
import java.util.*;

public class CourseSchedule_II_210 {

    static ArrayList<Integer> completedCourses = new ArrayList<>();
    static HashSet<Integer> courseTaken = new HashSet<>();
    public static boolean courseCompletionOrder(int course,HashMap<Integer,List<Integer>> map){

        //Positive base case
        if(!map.containsKey(course)){
            if(!completedCourses.contains(course))
                completedCourses.add(course);
            return true;
        }

        //DP Memoization Approach
        if(completedCourses.contains(course))
            return true;

        //Negative base case
        if(courseTaken.contains(course) && !completedCourses.contains(course))
            return false;

        courseTaken.add(course);
        boolean canFinishCourse = true;
        for(int pre_course : map.get(course)){
            if(!courseCompletionOrder(pre_course,map)) {
                canFinishCourse = false;
                return false;
            }
            else canFinishCourse = true;
        }
        if(canFinishCourse)
            completedCourses.add(course);
        return canFinishCourse;
    }

    public static int[] findOrder(int numCourses,int[][] pr) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] courses : pr) {
            if (map.containsKey(courses[0])) {
                List<Integer> pr_courses = map.get(courses[0]);
                pr_courses.add(courses[1]);
                map.put(courses[0], pr_courses);
            } else {
                map.put(courses[0], new ArrayList<>(List.of(courses[1])));
            }
        }

        for (int course = 0; course < numCourses; course++) {
            if (!completedCourses.contains(course))
                if (!courseCompletionOrder(course, map))
                    return new int[] {};
        }
        return completedCourses.stream().mapToInt(Number::intValue).toArray();

    }

    public static void main(String[] args) {

        int numCourses = 3;
        int[][] pr = new int[][] {{1,0},{1,2},{0,1}};
        System.out.println(Arrays.toString(findOrder(numCourses,pr)));
    }

}
