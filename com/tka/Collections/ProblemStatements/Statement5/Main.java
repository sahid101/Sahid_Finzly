package com.tka.collections.ProblemStatements.Statement5;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Project> projects = new HashMap<>();

    public static void main(String[] args) {
        boolean b = true;
        Scanner sc  = new Scanner(System.in);
        while (b){
            System.out.println("1.Add Project.\n2.Assign Team Members.\n3.View Project Details.\n4.All projects.\n5.Exit\n");
            int choice = sc.nextInt();
            switch (choice){
                case 1: addProjects(sc);
                    break;
                case 2: assignTeam(sc);
                    break;
                case 3: viewProjectDetails(sc);
                    break;
                case 4: allProjects();
                    break;
                default:
                    System.out.println("Thank you.");
                    b = false;
                    break;
            }
        }

    }
    static void addProjects(Scanner scanner){
        System.out.println("Enter Project Name: ");
        String projectName = scanner.next();

        System.out.println("Enter Description");
        String description = scanner.next();

        Project p = new Project(projectName,description);
        projects.put(projectName,p);
    }
    static void assignTeam(Scanner scanner){
        System.out.println("Enter Team Member.");
        String name = scanner.next() ;
        TeamMember t = new TeamMember(name);
        System.out.println("Enter Project Name: ");
        String projectName = scanner.next();
        Project project = projects.get(projectName);
        if(project != null){
            project.addTeamMember(t);
        }
    }
    static void viewProjectDetails(Scanner scanner){
        System.out.println("Enter Project Name: ");
        String projectName = scanner.next();
        Project p = projects.get(projectName);
        if(p != null){
            System.out.println("Project Name: "+p.getProjectName());
            System.out.println("Project Description: " + p.getDescription());
            System.out.println("Team Members:");
            for (TeamMember teamMember : p.getTeamMembers()) {
                System.out.println(" " + teamMember.getName());
            }
        } else {
            System.out.println("Project not found.");
        }
    }
    static void allProjects(){
        System.out.println("List of Projects:");
        for (Project p : projects.values()) {
            System.out.println(" " + p.getProjectName());
        }
    }
}
