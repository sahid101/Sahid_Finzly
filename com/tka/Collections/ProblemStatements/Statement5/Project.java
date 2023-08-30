package com.tka.collections.ProblemStatements.Statement5;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private String projectName;
    private String description;
    private Set<TeamMember> teamMembers = new HashSet<>();

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    void addTeamMember(TeamMember teamMember){
         teamMembers.add(teamMember);
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }
}
