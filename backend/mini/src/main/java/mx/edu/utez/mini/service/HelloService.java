package mx.edu.utez.mini.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String helloWorld() {
        return "Hola desde mi backend";
    }
}
