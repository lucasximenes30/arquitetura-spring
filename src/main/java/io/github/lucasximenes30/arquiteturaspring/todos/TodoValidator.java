package io.github.lucasximenes30.arquiteturaspring.todos;


import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository){
        this.repository = repository;
    }

    public void validar(TodoEntity todo){

        if(existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Ja existe um TODO");
        }
    }

    public boolean existeTodoComDescricao(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
