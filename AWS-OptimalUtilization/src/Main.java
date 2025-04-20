/*
🚀 Problem: Optimal Utilization
Problem Statement:

Amazon Web Services (AWS) is trying to optimize the utilization of its servers. They have a list of tasks and each task consumes a certain amount of memory.
They also have a list of available server instances, and each server has a maximum memory capacity. Your goal is to find pairs of tasks and servers such that:

The combined memory usage does not exceed a given capacity.

The sum of memory usage is maximized (as close to capacity as possible without exceeding it).

You need to return all pairs (task_id, server_id) that achieve this.

Input:

An integer capacity, the maximum memory limit.

A list of tasks: List of [task_id, task_memory]

A list of servers: List of [server_id, server_memory]
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int capacity = 100;
        int[][] tasks = {{1, 90}, {2, 99}};
        int[][] servers = {{1, 10}, {2, 1}};

        List<int[]> result = optimalUtilization(capacity, tasks, servers);
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }

    private static List<int[]> optimalUtilization(int capacity, int[][] tasks, int[][] servers) {
        Arrays.sort(tasks, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(servers, (a, b) -> Integer.compare(a[1], b[1]));
        int i = 0, j= servers.length-1;
        List<int[]> result = new ArrayList<int[]>();
        int closestSum = Integer.MAX_VALUE;
        while (i < tasks.length && j >= 0) {
            int sum = tasks[i][1] + servers[j][1];
            if (sum <= capacity) {
                if((capacity - sum) == closestSum){
                    result.add(new int[]{tasks[i][0], servers[j][0]});
                }else{
                    closestSum = capacity - sum;
                    result.clear();
                    result.add(new int[]{tasks[i][0], servers[j][0]});
                }
                i++;

            }else{
                j--;
            }
        }
        return result;
    }
}