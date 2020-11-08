package aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Indica que ação feita pela classe ou método deve ser logada
 * </p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAction {

    /**
     * <p>
     * A mensagem que deve ser logada.
     * </p>
     *
     * <p>
     * Aceita argumentos do String.format para os valores dos parâmetros que a quantidade seja a mesma para os dois.
     * </p>
     *
     * @return a mensagem de log
     */
    String msg() default "";

    /**
     * <p>
     * Indica se os valores dos parâmetros devem ser logados
     * </p>
     *
     * @return true se os valores dos parâmetros devem ser logados
     */
    boolean logParam() default false;

}
