package Main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;
//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import model.Task;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Main {
    public static void main(String[] args)throws SQLException{
            ProjectController projectController = new ProjectController();

            //Incluir novo Projeto
//            Project project = new Project();
//            project.setName("Projeto 80");
//            project.setDescription("Músicas anos 80");
//            projectController.save(project);

        //Editar um projeto
//            Project project = new Project();
//            project.setId(5);
//            project.setName("Projeto teste 11");
//            project.setDescription("Teste de bancada 12");
//            projectController.update(project);

        //Listar a quantidade de projetos
//            List<Project> projects = projectController.getAll();
//            System.out.println("Total de projetos = " + projects.size());

        //Deletar projetos
//           projectController.removeByid(6);


        // ************* Tasks *************

        TaskController taskController = new TaskController();

        //Incluir nova Task
//            Task task = new Task();
//            task.setIdProject(4);
//            task.setName("Rever aula de Java do Start");
//            task.setDescription("retormar as aulas 11 a 18");
//            task.setNotes("direitinho");
//            task.setCompleted(false);
//            task.setDeadline(new Date());
//
//            taskController.save(task);

        //Editar uma task
//            task.setId(3);
//            task.setIdProject(4);
//            task.setName("Será que dará certo?");
//            task.setDescription("Teste de bancada 112");
//            task.setCompleted(false);
//            task.setDeadline(new Date());
//            task.setCreatedAt(new Date());
//            task.setUpdatedAt(new Date());
//            taskController.update(task);

        //Listar a quantidade de tarefas
//        List<Task> tasks = taskController.getAll();
//        System.out.println("Total de tarefas = " + tasks.size());

        //Deletar Tarefas
//        taskController.removeByid(3);



    }
}
