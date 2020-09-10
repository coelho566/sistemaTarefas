package br.com.unicesumar.service;

import br.com.unicesumar.models.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService {

    private List<Assignment> assignments = new ArrayList<>();

    public void create(Assignment assignment) {
        assignments.add(assignment);
    }

    public void update(Integer id, Assignment assignment) {

        if (id != null) {
            Assignment assignmentNew = assignments.get(id);
            assignmentNew.setId(assignment.getId());
            assignmentNew.setTitle(assignment.getTitle());
            assignmentNew.setStatus(assignment.getStatus());
            assignmentNew.setDescription(assignment.getDescription());
            assignmentNew.setUser(assignment.getUser());

            assignments.add(assignmentNew);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public void delete(Integer userId) {

        if (userId != null)
            assignments.remove(userId);
        else
            throw new RuntimeException("User not found");

    }

    public List<Assignment> getUsers() {
        return assignments;
    }
}
