package ru.project.Project6.dataBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.project.Project6.model.Employee;
import ru.project.Project6.model.Task;
import ru.project.Project6.repository.EmployeeRepository;
import ru.project.Project6.repository.TaskRepository;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
//            employeeRepository.save(new Employee("admin", "ROLE_ADMIN,ROLE_USER"));
//            employeeRepository.save(new Employee("user", "ROLE_USER"));
//
//            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));
//            taskRepository.save(new Task("Задача1", "NEW",  2023-03-28, 2023-03-28,"Второстепенная задача"));
//            taskRepository.save(new Task("Задача2", "NEW",  ,  , "Второстепенная задача"));

//            taskRepository.findAll().forEach(task -> log.info("Preloaded " + task));


//            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
//            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
//
//            orderRepository.findAll().forEach(order -> {
//                log.info("Preloaded " + order);
//            });
        };
    }
}
