package com.epam.my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class CoronaController {

    @InjectByType
    private CoronaService coronaService;


    public void stam(){
        System.out.println("corona controller delegate to ");
        System.out.println("infectect amout:" + coronaService.countInfectedToday());
    }



}
