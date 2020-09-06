package com.uspehgp.robotspring;

import com.uspehgp.robotspring.impls.pool.T1000Pool;
import com.uspehgp.robotspring.impls.robot.ModelT1000;
import com.uspehgp.robotspring.interfaces.Robot;
import com.uspehgp.robotspring.interfaces.RobotConveyor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RobotspringApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        T1000Pool t1000GoldenPool = (T1000Pool) context.getBean("t1000ColdenPool");
        t1000GoldenPool.beginShow();

        ((ConfigurableApplicationContext)context).close();
    }

}
