package io.github.lucasximenes30.arquiteturaspring.montadora.configuration;

import io.github.lucasximenes30.arquiteturaspring.montadora.Motor;
import io.github.lucasximenes30.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPT0-0");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

}
