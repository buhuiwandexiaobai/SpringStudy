import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import cn.spring.beans.Dog;

/**
 * @author zhaobin <zhaobin@kuaishou.com>
 * Created on 2020-07-25
 */
public class SpringMain {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Dog dog = (Dog) factory.getBean("dog");
        dog.say();
    }
}
