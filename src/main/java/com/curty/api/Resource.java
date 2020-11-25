package com.curty.api;

import com.curty.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes/")
public class Resource {

    @GetMapping("{id}")
    public Cliente catchClientData(@PathVariable Long id){
        //cliente = service.findById(id);
        System.out.println(String.format("Received ID from URL: %d", id));
        Cliente cliente = new Cliente("Fulano", "000.000.000-00");
        return cliente;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente saveClient(@RequestBody Cliente cliente){
        //return service.save(cliente);
        return cliente;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable Long id){
        //service.findById(id);
        //return service.delete(cliente);
    }

    @PutMapping("{id}")
    public Cliente updateClient(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.findById(id);
        //cliente = service.update(cliente);
        return cliente;
    }
}
