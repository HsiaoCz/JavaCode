package day20;

// 限制这个注解只能在类和成员方法上使用
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest4 {
    String value();

    double aaa() default 100;

    String[] bbb();
}
